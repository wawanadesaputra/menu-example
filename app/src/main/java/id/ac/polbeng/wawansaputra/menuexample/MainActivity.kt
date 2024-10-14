package id.ac.polbeng.wawansaputra.menuexample

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import id.ac.polbeng.wawansaputra.menuexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.myToolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menuFile -> {
                showMessage("File menu")
                return true
            }
            R.id.menuEdit -> {
                showMessage("Edit menu")
                return true
            }
            R.id.menuHelp -> {
                showMessage("Help menu")
                return true
            }
            R.id.menuExit -> {
                showMessage("Exit")
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showMessage(msg: String) {
        Snackbar.make(binding.rootLayout, msg, Snackbar.LENGTH_LONG).show()
    }
}
