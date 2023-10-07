package com.example.geopedia.Fragments

import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.browser.customtabs.CustomTabsIntent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.geopedia.Adapters.HomeRVAdapter
import com.example.geopedia.Models.HomeCardData
import com.example.geopedia.R
import com.example.geopedia.databinding.FragmentHomeBinding
import com.google.android.material.button.MaterialButton

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: HomeRVAdapter
    private lateinit var cardList: ArrayList<HomeCardData>
    private lateinit var recyclerView: RecyclerView

    lateinit var title: Array<String>
    lateinit var subtitle: Array<String>
    lateinit var description: Array<String>
    lateinit var image: Array<Int>
    lateinit var urls: Array<String?>

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

        dataInit()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = HomeRVAdapter(cardList)
        recyclerView.adapter = adapter

        return binding.root

    }

    private fun dataInit() {

        cardList = ArrayList<HomeCardData>()

        title = arrayOf(
            "Geology",
            "Mineralogy",
            "Petrology",
            "Structural Geology",
            "Economic Geology",
            "Hydrogeology",
            "Engineering Geology",
            "Geophysics",)

        subtitle = arrayOf(
            "Geology is the study of the Earth.",
            "Mineralogy is a subject of geology specializing in the scientific study of the chemistry.",
            "Petrology is the branch of geology that studies rocks and the conditions under which they form.",
            "Structural geology is the study of the three-dimensional distribution of rock units with respect to their deformational histories.",
            "Economic geology is concerned with earth materials that can be used for economic and/or industrial purposes. ",
            "Hydrogeology is the area of geology that deals with the distribution and movement of groundwater in the soil and rocks of the Earth's crust (commonly in aquifers). ",
            "Engineering geology is the application of the geology to engineering study for the purpose of assuring that the geological factors regarding the location, design, construction, operation and maintenance of engineering works are recognized and accounted for.",
            "Geophysics is a subject of natural science concerned with the physical processes"
        )

        description = arrayOf(
            "Geology is the study of the Earth, the materials of which it is made, the structure of those materials, and the processes acting upon them. It includes the study of organisms that have inhabited our planet. An important part of geology is the study of how Earth’s materials, structures, processes and organisms have changed over time.",
            "Mineralogy is a subject of geology specializing in the scientific study of the chemistry, crystal structure, and physical (including optical) properties of minerals and mineralized artifacts. Specific studies within mineralogy include the processes of mineral origin and formation, classification of minerals, their geographical distribution, as well as their utilization.",
            "Petrology is the branch of geology that studies rocks and the conditions under which they form. Petrology has three subdivisions: igneous, metamorphic, and sedimentary petrology. Igneous and metamorphic petrology are commonly taught together because they both contain heavy use of chemistry, chemical methods, and phase diagrams.",
            "Structural geology is the study of the three-dimensional distribution of rock units with respect to their deformational histories. The primary goal of structural geology is to use measurements of present-day rock geometries to uncover information about the history of deformation (strain) in the rocks, and ultimately, to understand the stress field that resulted in the observed strain and geometries.",
            "Economic geology is concerned with earth materials that can be used for economic and/or industrial purposes. These materials include precious and base metals, nonmetallic minerals, construction-grade stone, petroleum, natural gas, coal, and water. Economic geology is a subdiscipline of the geosciences; according to Lindgren (1933) it is “the application of geology” (p. 65) or “the science of mining” (p. 65).",
            "Hydrogeology is the area of geology that deals with the distribution and movement of groundwater in the soil and rocks of the Earth's crust (commonly in aquifers). The terms groundwater hydrology, geohydrology, and hydrogeology are often used interchangeably.",
            "Engineering geology is the application of the geology to engineering study for the purpose of assuring that the geological factors regarding the location, design, construction, operation and maintenance of engineering works are recognized and accounted for.",
            "Geophysics is a subject of natural science concerned with geological physics) is the physics of the Earth and its environment in space; also the study of the Earth using quantitative physical methods. The term geophysics sometimes refers only to the geological applications: Earth's shape; its gravitational and magnetic fields; its internal structure and composition; its dynamics and their surface expression in plate tectonics, the generation of magmas, volcanism and rock formation. However, modern geophysics organizations use a broader definition that includes the water cycle including snow and ice; fluid dynamics of the oceans and the atmosphere; electricity and magnetism in the ionosphere and magnetosphere and solar-terrestrial relations;" +
                    " and analogous problems associated with the Moon and other planets.")

        image = arrayOf(
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
            R.drawable.geologist,
        )

        urls = arrayOf(
            "https://www.google.com",
            "https://www.github.com",
            "https://www.flipkart.com",
            "https://www.nasa.com",
            "https://git.earthdata.nasa.gov",
            "https://search.earthdata.nasa.gov/search",
            "https://www.youtube.com",
            "https://www.canva.com",
            "https://www.wikipedia.com",
        )

        for (i in title.indices) {
            val cardData = HomeCardData(title[i], subtitle[i], description[i], image[i])
            cardList.add(cardData)
            }
        }
}