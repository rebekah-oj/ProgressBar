package me.tap.progressbar

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val progressDialog =  ProgressDialog(this)
        progressDialog.setMessage("Downloading. . .")
        progressDialog.setCancelable(false)
        progressDialog.show()
      */
        val builder = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.progress_bar, null)
        val message = dialogView.findViewById<TextView>(R.id.text)
        message.text = "Downloading. . ."
        builder.setView(dialogView)
        builder.setCancelable(false)

        val dialog = builder.create()
        dialog.show()

        Handler().postDelayed({ dialog.dismiss() }, 5000)

    }
}