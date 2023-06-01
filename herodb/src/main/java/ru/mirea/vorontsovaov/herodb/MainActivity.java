package ru.mirea.vorontsovaov.herodb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppDatabase db = App.getInstance().getDatabase();
        HeroDao heroDao = db.heroDao();
        Hero heroOne = new Hero();
        heroOne.id = 1;
        heroOne.name = "Голлум";
        heroOne.description = "Раздвоение личности, становится невидимым";

        Hero heroTwo = new Hero();
        heroTwo.id = 2;
        heroTwo.name = "Леголас";
        heroTwo.description = "Супер красивый и просто крутой";

        heroDao.insert(heroOne);
        heroDao.insert(heroTwo);


    }
}