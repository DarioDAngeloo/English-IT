package com.study.englishit.ui.presentation.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.study.englishit.R
import com.study.englishit.databinding.FragmentLoginBinding
import com.study.englishit.ui.presentation.home.HomeActivity


class LoginFragment : Fragment() {
    private var binding: FragmentLoginBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    initListeners()
    }

    private fun initListeners(){
        binding?.btnLogin?.setOnClickListener {
            startActivity(Intent(requireContext(), HomeActivity::class.java))
            activity?.finish()
        }
        binding?.btnSingUp?.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)

        }
    }
}