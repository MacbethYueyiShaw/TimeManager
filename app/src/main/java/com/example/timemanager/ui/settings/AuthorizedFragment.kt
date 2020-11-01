package com.example.timemanager.ui.settings

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.timemanager.FriendList
import com.example.timemanager.Profile
import com.example.timemanager.R
import com.example.timemanager.ThemeStore
import com.example.timemanager.ui.login.Login

class AuthorizedFragment : Fragment() {

    private lateinit var authorizedFragment: AuthorizedFragment

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_setting_authorized, container, false)

        val btn2 : Button = root.findViewById(R.id.friend_button)
        btn2.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(getActivity(), FriendList::class.java).apply {
                }
                startActivity(intent)
            }
        })
        val btn3 : Button = root.findViewById(R.id.profile_entry)
        btn3.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(getActivity(), Profile::class.java).apply {
                }
                startActivity(intent)
            }
        })
        val btn4 : Button = root.findViewById(R.id.themeStore_button)
        btn4.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(getActivity(), ThemeStore::class.java).apply {
                }
                startActivity(intent)
            }
        })
        return root
    }
}