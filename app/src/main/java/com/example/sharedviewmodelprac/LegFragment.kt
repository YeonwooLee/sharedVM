package com.example.sharedviewmodelprac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.sharedviewmodelprac.databinding.FragmentLegBinding
import com.example.sharedviewmodelprac.model.SharedViewModel

class LegFragment : Fragment() {
    var binding:FragmentLegBinding?=null
    private val sharedViewModel :SharedViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentLegBinding.inflate(inflater,container,false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply{
            goNext.setOnClickListener { goNextScreen() }
            sharedVM = sharedViewModel
        }
    }
    fun goNextScreen(){
        findNavController().navigate(R.id.action_legFragment_to_finalFragment)
    }

}