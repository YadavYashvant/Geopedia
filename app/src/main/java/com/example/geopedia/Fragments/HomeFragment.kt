package com.example.geopedia.Fragments

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import com.example.geopedia.R
import com.example.geopedia.databinding.FragmentHomeBinding
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        /*binding.btnExplore.setOnClickListener {
            val url = "https://www.google.com"
            val url1 = "https://ladsweb.modaps.eosdis.nasa.gov/#land"
            val builder = CustomTabsIntent.Builder()
            builder.setToolbarColor(Color.parseColor("#6200EE"))
            val customTabsIntent = builder.build()
            customTabsIntent.launchUrl(requireContext(), Uri.parse(url1))
        }*/

        return binding.root

    }

}