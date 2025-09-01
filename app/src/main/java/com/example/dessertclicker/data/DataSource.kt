package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.Dessert


object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.lemon_tree, 5, 0),
        Dessert(R.drawable.lemon_squeeze, 10, 5),
        Dessert(R.drawable.lemon_drink, 15, 20),
        Dessert(R.drawable.lemon_restart, 30, 50),
        Dessert(R.drawable.dice_1, 50, 100),
        Dessert(R.drawable.dice_2, 100, 200),
        Dessert(R.drawable.dice_3, 500, 500),
        Dessert(R.drawable.dice_4, 1000, 1000),
        Dessert(R.drawable.dice_5, 2000, 2000),
        Dessert(R.drawable.dice_6, 3000, 4000),
        Dessert(R.drawable.lemon_tree, 4000, 8000),
        Dessert(R.drawable.lemon_restart, 5000, 16000),
        Dessert(R.drawable.lemon_drink, 6000, 20000)
    )
}