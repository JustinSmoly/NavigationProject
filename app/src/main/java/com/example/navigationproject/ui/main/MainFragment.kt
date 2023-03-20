package com.example.navigationproject.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationproject.R
import com.example.navigationproject.databinding.FragmentMainBinding
import androidx.navigation.Navigation
import android.widget.ImageView

@Suppress("DEPRECATION")
class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.button1.setOnClickListener{
            val action: MainFragmentDirections.ActionMainFragment2ToSecondFragment = MainFragmentDirections.actionMainFragment2ToSecondFragment()
            action.setMessage(binding.button1.text.toString())
            Navigation.findNavController(it).navigate(action)
        }
        binding.button2.setOnClickListener{
            val action: MainFragmentDirections.ActionMainFragment2ToSecondFragment = MainFragmentDirections.actionMainFragment2ToSecondFragment()
            action.setMessage(binding.button2.text.toString())
            Navigation.findNavController(it).navigate(action)
        }
        binding.button3.setOnClickListener{
            val action: MainFragmentDirections.ActionMainFragment2ToSecondFragment = MainFragmentDirections.actionMainFragment2ToSecondFragment()
            action.setMessage(binding.button3.text.toString())
            Navigation.findNavController(it).navigate(action)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}