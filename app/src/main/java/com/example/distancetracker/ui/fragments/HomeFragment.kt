package com.example.distancetracker.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.distancetracker.databinding.FragmentHomeBinding
import com.example.distancetracker.ui.adapters.ClubAdapter
import com.example.distancetracker.ui.fragments.data.HomeViewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.clubRecyclerView
        val addClubBtn: Button = binding.addClubButton

        addClubBtn.setOnClickListener() {
            // inflate something to get name
            // save that to the viewmodel
            homeViewModel.addClub("New Club")
        }

        homeViewModel.liveClubArray.observe(viewLifecycleOwner) {
            val clubAdapter = ClubAdapter(it)
            recyclerView.adapter = clubAdapter
            recyclerView.layoutManager = LinearLayoutManager(activity)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}