package io.mu.jetpacknavigation

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnOpenProfile = view.findViewById<Button>(R.id.btnOpenProfile)
        btnOpenProfile.setOnClickListener {
//            findNavController().navigate(R.id.action_dashboardFragment_to_profileFragment)
            findNavController().navigate(R.id.profileFragment)
        }
        val btnOpenSettings = view.findViewById<Button>(R.id.btnOpenSettings)
        btnOpenSettings.setOnClickListener {
//            findNavController().navigate(R.id.R.id.settingsFragment)
            findNavController().navigate(R.id.action_dashboardFragment_to_settingsDialogFragment)
        }

        val btnOpenSecondActivity = view.findViewById<Button>(R.id.btnOpenSecondActivity)
        btnOpenSecondActivity.setOnClickListener {
            val userId = 123
            val deeplinkUri = Uri.parse("https://www.example.com/profile/$userId")
            findNavController().navigate(deeplinkUri)
        }
    }
}