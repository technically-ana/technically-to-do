package edu.techana.technicallytodo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.techana.technicallytodo.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAboutBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.toolbarAbout.title = getString(R.string.app_name)
        binding.about.loadUrl("file:///android_asset/about.html")
    }
}