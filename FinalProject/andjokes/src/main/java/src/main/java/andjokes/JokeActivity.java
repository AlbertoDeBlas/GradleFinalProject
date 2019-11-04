package src.main.java.andjokes;

import android.view.View;
import android.content.Intent;
import src.main.java.javaJokes.Joke;

import androidx.appcompat.app.AppCompatActivity;

public class JokeActivity extends AppCompatActivity {

    public void tellJoke(View view) {
        // Create the text message with a string
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, Joke.retrieveJoke());
        sendIntent.setType("text/plain");
    }
}
