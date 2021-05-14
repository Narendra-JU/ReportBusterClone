package com.example.reportbusterclone.view

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import com.example.reportbusterclone.R
import com.example.reportbusterclone.model.ReportCategory
import kotlinx.android.synthetic.main.item_report_recycler.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class HomeFragmentAdapter(var categoryList: MutableList<ReportCategory>): RecyclerView.Adapter<HomeFragmentAdapter.MyHolder>() {
	class MyHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
		private val image: ImageView =itemView.iv_categoryImage
		private val categoryText=itemView.etReportCategory

		fun bind(reportCategory: ReportCategory){
			image.setImageResource(reportCategory.categoryImage)
			categoryText.text=reportCategory.categoryLabel
		}

	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
		val view= LayoutInflater.from(parent.context).inflate(R.layout.item_report_recycler, parent, false)

		return MyHolder(view)
	}

	override fun onBindViewHolder(holder: MyHolder, position: Int) {
		val categoryItem=categoryList[position]
		holder.bind(categoryItem)
		val coroutineScopeMain= CoroutineScope(Dispatchers.Main)
		coroutineScopeMain.launch {
			val drawable=categoryItem.categoryImage
			var palette: Palette?=null
			val icon = BitmapFactory.decodeResource(holder.itemView.context.resources,
				drawable)
			withContext(Dispatchers.IO){
				palette=Palette.Builder(icon).generate()

			}
			withContext(Dispatchers.Main){
				val colourOuter=palette?.lightMutedSwatch
				holder.itemView.constraint_recycler.setBackgroundColor(colourOuter?.rgb?:R.color.design_default_color_background)
			}
		}


	}

	override fun getItemCount(): Int {
		return categoryList.size
	}
}