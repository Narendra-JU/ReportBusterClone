package com.example.reportbusterclone.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reportbusterclone.R
import com.example.reportbusterclone.model.getlistOfItems
import com.example.reportbusterclone.model.util.ItemOffsetDecoration
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_home, container, false)



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView.layoutManager= GridLayoutManager(context,2)
        val itemDecoration= ItemOffsetDecoration(requireContext(),R.dimen.my_value)
        recyclerView.adapter=HomeFragmentAdapter(getlistOfItems())
        recyclerView.addItemDecoration(itemDecoration)

    }
}