package com.aima.personalprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.personalprofile.adapters.ProfileAdapter
import com.aima.personalprofile.databinding.ActivityMainBinding
import com.aima.personalprofile.models.Profile

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles: List<Profile> = listOf(
            Profile(
                R.drawable.ic_avatarone,
                fName = "Jude",
                lName = "Abaga"
            ),
            Profile(
                R.drawable.ic_avatartwo,
                fName = "Elizabeth",
                lName = "Obotobo"
            ),
            Profile(
                R.drawable.ic_avatarthree,
                fName = "Zen",
                lName = "Garuba"
            ),
            Profile(
                R.drawable.ic_avatarfour,
                fName = "Dafe",
                lName = "Atigari"
            ),
            Profile(
                R.drawable.ic_avatarfive,
                fName = "John",
                lName = "Mote"
            ),
            Profile(
                R.drawable.ic_avatarone,
                fName = "Jude",
                lName = "Abaga"
            ),
            Profile(
                R.drawable.ic_avatartwo,
                fName = "Elizabeth",
                lName = "Obotobo"
            ),
            Profile(
                R.drawable.ic_avatarthree,
                fName = "Zen",
                lName = "Garuba"
            ),
            Profile(
                R.drawable.ic_avatarfour,
                fName = "Dafe",
                lName = "Atigari"
            ),
            Profile(
                R.drawable.ic_avatarfive,
                fName = "John",
                lName = "Mote"
            ),
            Profile(
                R.drawable.ic_avatarone,
                fName = "Jude",
                lName = "Abaga"
            ),
            Profile(
                R.drawable.ic_avatartwo,
                fName = "Elizabeth",
                lName = "Obotobo"
            ),
            Profile(
                R.drawable.ic_avatarthree,
                fName = "Zen",
                lName = "Garuba"
            ),
            Profile(
                R.drawable.ic_avatarfour,
                fName = "Dafe",
                lName = "Atigari"
            ),
            Profile(
                R.drawable.ic_avatarfive,
                fName = "John",
                lName = "Mote"

            ),
            Profile(
                R.drawable.ic_avatarone,
                fName = "Jude",
                lName = "Abaga"
            ),
            Profile(
                R.drawable.ic_avatartwo,
                fName = "Elizabeth",
                lName = "Obotobo"
            ),
            Profile(
                R.drawable.ic_avatarthree,
                fName = "Zen",
                lName = "Garuba"
            ),
            Profile(
                R.drawable.ic_avatarfour,
                fName = "Dafe",
                lName = "Atigari"
            ),
            Profile(
                R.drawable.ic_avatarfive,
                fName = "John",
                lName = "Mote"
            )
        )

    myProfileAdapter = ProfileAdapter(profiles)
        binding.recyclerView.adapter = myProfileAdapter

    }

}


