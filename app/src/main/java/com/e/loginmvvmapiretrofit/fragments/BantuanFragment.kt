package com.e.loginmvvmapiretrofit.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.e.loginmvvmapiretrofit.R
import com.e.loginmvvmapiretrofit.adapters.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_bantuan.*

class BantuanFragment : Fragment(R.layout.fragment_bantuan) {

    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        postTolist()

        rv_recyclerView.layoutManager = LinearLayoutManager(activity)
        rv_recyclerView.adapter = RecyclerAdapter(titleList, descList, imagesList)

    }

    private fun addToList(title: String, description: String, image: Int) {
        titleList.add(title)
        descList.add(description)
        imagesList.add(image)
    }

    private fun postTolist() {
        for (i in 1..3) {
            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
        }
    }

}