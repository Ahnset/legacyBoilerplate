package com.thebaoba.baoba.auth

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.thebaoba.baoba.R
import com.thebaoba.baoba.util.NavigationLink

class AuthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginBtn: Button = view.findViewById(R.id.authLoginButton)

        loginBtn.setOnClickListener {
            val home = Uri.parse(NavigationLink.HOME_LINK)
            findNavController().navigate(home)
        }
    }
}