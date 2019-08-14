package com.example.newsreader

import android.content.Intent
import android.graphics.drawable.Drawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    companion object {
        const val REQUEST_CODE = 2
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        welcome.setOnClickListener {
            var welcomeIntent = Intent(this, DetailsActivity::class.java)
            startActivity(welcomeIntent)
        }
        to.setOnClickListener {
            var toIntent = Intent(this, DetailsActivity::class.java)
            startActivity(toIntent)
        }

        sign_in_list.setOnClickListener {
            var signInIntent = Intent(this, DetailsActivity::class.java)
            startActivity(signInIntent)
        }

        news.setOnClickListener {
            var newsIntent = Intent(this, DetailsActivity::class.java)
            startActivity(newsIntent)
        }
        reader.setOnClickListener {
            var readerIntent = Intent(this, DetailsActivity::class.java)
            startActivity(readerIntent)
        }

        fun createImageView(image: Image, index: Int): ImageView{
            var newImage = findViewById(R.id.)
                newImage.id = index
            return createImageView(newImage)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK){
            var imageResult = image_details.setImageDrawable(Drawable) as Image
            image_details.setImageDrawable(imageResult)
        }
    }
}