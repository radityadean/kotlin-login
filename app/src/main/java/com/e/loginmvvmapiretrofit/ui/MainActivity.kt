package com.e.loginmvvmapiretrofit.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.e.loginmvvmapiretrofit.R
import com.e.loginmvvmapiretrofit.fragments.BantuanFragment
import com.e.loginmvvmapiretrofit.fragments.ProfilFragment
import com.e.loginmvvmapiretrofit.fragments.TransaksiFragment
import kotlinx.android.synthetic.main.bottom_nav.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = DashboardFragment()
        val favouriteFragment = TransaksiFragment()
        val settingFragment = BantuanFragment()
        val profileFragment = ProfilFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.berandaFragment -> makeCurrentFragment(homeFragment)
                R.id.transaksiFragment -> makeCurrentFragment(favouriteFragment)
                R.id.bantuanFragment -> makeCurrentFragment(settingFragment)
                R.id.profilFragment -> makeCurrentFragment(profileFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }

}


//    private var titleList = mutableListOf<String>()
//    private var descList = mutableListOf<String>()
//    private var imagesList = mutableListOf<Int>()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        postTolist()
//
//        rv_recyclerView.layoutManager = LinearLayoutManager(this)
//        rv_recyclerView.adapter = RecyclerAdapter(titleList, descList, imagesList)
//
//        bottomNavigationView.setupWithNavController(navHostFragment.findNavController())
//        bottomNavigationView.setOnNavigationItemReselectedListener {
//            /* NO_OP */
//        }
//
//        navHostFragment.findNavController()
//            .addOnDestinationChangedListener { _, destination, _ ->
//                when (destination.id) {
//                    R.id.berandaFragment, R.id.transaksiFragment, R.id.bantuanFragment, R.id.profilFragment ->
//                        bottomNavigationView.visibility = View.VISIBLE
//                    else -> bottomNavigationView.visibility = View.GONE
//                }
//            }
//        val packageNmm = packageName
//        Timber.d(packageNmm)
//
//    }
//
//    private fun addToList(title: String, description: String, image: Int) {
//        titleList.add(title)
//        descList.add(description)
//        imagesList.add(image)
//    }
//
//    private fun postTolist() {
//        for (i in 1..25) {
//            addToList("Title $i", "Description $i", R.mipmap.ic_launcher_round)
//        }
//    }