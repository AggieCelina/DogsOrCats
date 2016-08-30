package girlscodefun.com.carordog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // ustawiamy wartość zmiennej typu int (liczby całkowite) na 0
    int dogVotesCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void voteForDog(View view) {
        // tworzymy zmienną dogVotes - odwołanie do TextView w naszym layout o id dog_votes
        TextView dogVotes = (TextView) findViewById(R.id.dog_votes);

        // dodajemy jeden do poprzedniej wartości zmiennej dogVotesCounter; do zmiennej przypisujemy nową wartość
        dogVotesCounter = dogVotesCounter + 1;

        // wyświetlamy ilość głosów na ekranie
        dogVotes.setText( "" + dogVotesCounter );
    }


}
