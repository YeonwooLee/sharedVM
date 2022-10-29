package com.example.sharedviewmodelprac


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sharedviewmodelprac.databinding.FragmentBackBinding//데이터바인딩 클래스

class BackFragment : Fragment() {
    var binding:FragmentBackBinding?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentBackBinding.inflate(inflater,container,false)//바인딩하고 뷰 확장
        binding = fragmentBinding
        return fragmentBinding.root//최상단 뷰 리턴
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply{
            goNext.setOnClickListener{goNextScreen()}//apply 덕분에 앞에 'binding?.' 생략됨
        }
    }

    fun goNextScreen(){
        findNavController().navigate(R.id.action_backFragment_to_chestFragment)
    }

}