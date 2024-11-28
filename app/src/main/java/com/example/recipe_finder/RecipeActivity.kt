package com.example.recipe_finder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.util.Log
import com.example.recipe_finder.databinding.ActivityRecipesBinding


class RecipeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecipesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecipesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.favoriteButton.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }

        binding.homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val ingredientsList = intent.getStringExtra("Ingredients") ?: ""
        fetchData(ingredientsList)

    }
    private fun fetchData(ingredientsList:String){
      Log.d("Ingredients", ingredientsList)
    }

}