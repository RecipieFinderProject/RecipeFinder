package com.example.recipe_finder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipe_finder.databinding.ActivityMainBinding
import android.content.Intent


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.favoriteButton.setOnClickListener {
            val intent = Intent(this, FavoriteActivity::class.java)
            startActivity(intent)
        }
        binding.homeButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.findRecipesButton.setOnClickListener{
            val ingredientsInput = binding.inputTask.text.toString()
            val intent = Intent(this, RecipeActivity::class.java).apply {
                putExtra("Ingredients", ingredientsInput)
            }
            startActivity(intent)
        }
    }
}