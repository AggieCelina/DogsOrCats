package girlscodefun.com.carordog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // ustawiamy wartość zmiennej typu int (liczby całkowite) na 0
    int dogVotesCounter = 0;
    int catVotesCounter = 0;

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

    public void voteForCat(View view){

        //zmienna catVotes to odwołanie do TextView o id cat_votes (patrz np android:id="@+id/cat_votes" w activity_main.xml)
        TextView catVotes = (TextView) findViewById(R.id.cat_votes);

        //za każdym wywołaniem metody (to znaczy kliknięciem buttona) dodaj 1 do zmiennej catVotesCounter
        catVotesCounter = catVotesCounter +1;

        //przypisz zmiennej catVotes tekst o treści równej wartości liczbowej catVotesCounter
        catVotes.setText("" + catVotesCounter);

        //wywołanie metody następuje po dodaniu atrybutu buttona android:onClick="nazwa metody" w pliku activity_main.xml

    }

}
