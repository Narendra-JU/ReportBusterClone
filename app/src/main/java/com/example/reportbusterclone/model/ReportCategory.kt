package com.example.reportbusterclone.model

import com.example.reportbusterclone.R

data class ReportCategory(var categoryLabel:String,val categoryInternalname:String,var categoryImage:Int){

}
fun getlistOfItems():MutableList<ReportCategory>{
	val list= mutableListOf<ReportCategory>()
	list.add(ReportCategory("Litter","litter", R.drawable.litter))
	list.add(ReportCategory("Graffiti","graffiti", R.drawable.graffiti))
	list.add(ReportCategory("Pet","pet", R.drawable.pet))
	list.add(ReportCategory("Vehicle","vehicle", R.drawable.vehicle))
	list.add(ReportCategory("Parking","parking", R.drawable.parking))
	list.add(ReportCategory("Footpath","footpath", R.drawable.footpath))
	list.add(ReportCategory("Neighbour","neighbour", R.drawable.neighbours))
	list.add(ReportCategory("Road","road", R.drawable.litter))
	list.add(ReportCategory("Park","park", R.drawable.park))
	list.add(ReportCategory("Tree","tree", R.drawable.tree))
	list.add(ReportCategory("Storm","storm",R.drawable.storm))
	list.add(ReportCategory("Building","building",R.drawable.building))

	return list
}
