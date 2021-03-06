package me.nickellis.towers.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import me.nickellis.towers.sample.view.model.ViewModelFactory


abstract class BaseActivity : AppCompatActivity() {
  lateinit var viewModelFactory: ViewModelProvider.Factory

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModelFactory = ViewModelFactory(resources)
  }
}