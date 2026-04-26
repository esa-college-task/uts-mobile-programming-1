package com.example.uts_mobile_programming_1.data

import com.example.uts_mobile_programming_1.R
import com.example.uts_mobile_programming_1.data.model.Achievement
import com.example.uts_mobile_programming_1.data.model.Game

object DummyData {
    val games = listOf(
        Game(
            1, "Final Fantasy VII", "PS1",
            R.drawable.ic_rpg,
            listOf("Trending", "RPG"),
            listOf(
                Achievement(1, "Welcome to Midgar", "Escape from the Mako Reactor", 10),
                Achievement(2, "Materiaman", "Collect all Master Materia", 50),
                Achievement(3, "One-Winged Angel", "Defeat Sephiroth", 100)
            )
        ),
        Game(
            2, "Metal Gear Solid", "PS1",
            R.drawable.ic_action,
            listOf("Classic", "Stealth"),
            listOf(
                Achievement(4, "Snake? Snake!!", "Die for the first time", 5),
                Achievement(5, "Rex Defeated", "Destroy Metal Gear Rex", 50)
            )
        ),
        Game(
            3, "Resident Evil 2", "PS1",
            R.drawable.ic_horror,
            listOf("Mastered", "Horror"),
            listOf(
                Achievement(6, "Survive the Night", "Reach the police station", 10),
                Achievement(7, "G-Virus", "Defeat William Birkin", 50)
            )
        ),
        Game(
            4, "Kingdom Hearts II", "PS2",
            R.drawable.ic_rpg,
            listOf("Trending", "Disney"),
            listOf(
                Achievement(8, "Keyblade Master", "Seal the Door to Darkness", 50),
                Achievement(9, "Eternal Memories", "Complete the story", 100)
            )
        ),
        Game(
            5, "Final Fantasy X", "PS2",
            R.drawable.ic_rpg,
            listOf("Mastered", "Emotional"),
            listOf(
                Achievement(10, "Blitzball Pro", "Win a Blitzball tournament", 20),
                Achievement(11, "The Final Aeon", "Defeat Yu Yevon", 100)
            )
        ),
        Game(
            6, "God of War II", "PS2",
            R.drawable.ic_action,
            listOf("Action", "Classic"),
            listOf(
                Achievement(12, "Slayer of Fate", "Defeat the Sisters of Fate", 50),
                Achievement(13, "End of the Journey", "Complete the game", 100)
            )
        ),
        Game(
            7, "God of War: Chains of Olympus", "PSP",
            R.drawable.ic_action,
            listOf("Trending", "Handheld"),
            listOf(
                Achievement(14, "Spartan Rage", "Defeat the Hydra", 10),
                Achievement(15, "God of War", "Defeat Ares", 100)
            )
        ),
        Game(
            8, "Persona 3 Portable", "PSP",
            R.drawable.ic_rpg,
            listOf("RPG", "Anime"),
            listOf(
                Achievement(16, "Social Link", "Max out a social link", 20),
                Achievement(17, "Reach the Top", "Defeat the final boss", 100)
            )
        ),
        Game(
            9, "Crisis Core: FFVII", "PSP",
            R.drawable.ic_rpg,
            listOf("Mastered", "Prequel"),
            listOf(
                Achievement(18, "SOLDIER 1st Class", "Reach level 50", 30),
                Achievement(19, "Dreams and Honor", "Defeat Genesis", 100)
            )
        )
    )
}
