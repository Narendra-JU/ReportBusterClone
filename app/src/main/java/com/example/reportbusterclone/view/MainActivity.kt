package com.example.reportbusterclone.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.reportbusterclone.R
import com.example.reportbusterclone.model.ReportCategory
import com.example.reportbusterclone.model.getlistOfItems
import com.example.reportbusterclone.model.util.ItemOffsetDecoration
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val navController = findNavController(R.id.fragNavHost)

		// Setting Navigation Controller with the BottomNavigationView
		bottomNavView.setupWithNavController(navController)


		val appBarConfiguration= AppBarConfiguration(
			topLevelDestinationIds = setOf(
				R.id.homeFragment,
				R.id.helpFragment,
				R.id.callusFragment

			)
		)
		setupActionBarWithNavController(navController,appBarConfiguration)




	}
}