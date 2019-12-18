package com.example.epoxycarouselbugsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.epoxy.carousel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val cuteAnimals = listOf("Dogs", "Cats", "Pandas", "Rabbits")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wrapContentRv.withModels {
            cuteAnimals
                .map { cuteAnimal ->
                    CarouselItemModelModel_()
                        .id(cuteAnimal)
                        .textContent(cuteAnimal)
                }
                .let { cuteAnimalModels ->
                    carousel {
                        id("carousel")
                        models(cuteAnimalModels)
                    }
                }
        }

        matchConstraintRv.withModels {
            cuteAnimals
                .map { cuteAnimal ->
                    CarouselItemModelModel_()
                        .id(cuteAnimal)
                        .textContent(cuteAnimal)
                }
                .let { cuteAnimalModels ->
                    carousel {
                        id("carousel")
                        models(cuteAnimalModels)
                    }
                }
        }
    }
}
