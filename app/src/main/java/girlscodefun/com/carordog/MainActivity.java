package girlscodefun.com.carordog;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // ustawiamy wartość zmiennej typu int (liczby całkowite) na 0
    int dogVotesCounter = 0;
    int catVotesCounter = 0;

    // ustawiamy wartość wagi do float 1.0
    float catVotesWeight = (float) 1.0;
    float dogVotesWeight = (float) 1.0;

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

        // od kliknięcia ma powiększyć się obraz psa = dodaj 1.0 do wagi psa (width's weight)
        dogVotesWeight = (float) (dogVotesWeight + 1.0);


        // wyświetlamy ilość głosów na ekranie
        dogVotes.setText( "" + dogVotesCounter );

        //ustal parametry obrazu kota
        ImageView catImage = (ImageView) findViewById(R.id.cat_image);
        LinearLayout.LayoutParams CatlayoutParams = new LinearLayout.LayoutParams(0, 100 + 10*catVotesCounter, catVotesWeight);
        catImage.setLayoutParams(CatlayoutParams);

        //ustal parametry obrazu psa
        ImageView dogImage = (ImageView) findViewById(R.id.dog_image);
        LinearLayout.LayoutParams DoglayoutParams = new LinearLayout.LayoutParams(0, 100 + 10*dogVotesCounter,dogVotesWeight );
        dogImage.setLayoutParams(DoglayoutParams);
    }

    public void voteForCat(View view){

        //zmienna catVotes to odwołanie do TextView o id cat_votes (patrz np android:id="@+id/cat_votes" w activity_main.xml)
        TextView catVotes = (TextView) findViewById(R.id.cat_votes);

        //za każdym wywołaniem metody (to znaczy kliknięciem buttona) dodaj 1 do zmiennej catVotesCounter..
        catVotesCounter = catVotesCounter +1;
        //.. oraz 1.0 do zmiennej catVotesWeight
        catVotesWeight = (float) (catVotesWeight + 1.0);

        //przypisz zmiennej catVotes tekst o treści równej wartości liczbowej catVotesCounter
        catVotes.setText("" + catVotesCounter);

        //wywołanie metody następuje po dodaniu atrybutu buttona android:onClick="nazwa metody" w pliku activity_main.xml

        ImageView catImage = (ImageView) findViewById(R.id.cat_image);
        LinearLayout.LayoutParams CatlayoutParams = new LinearLayout.LayoutParams(0, 100 + 10*catVotesCounter, catVotesWeight);
        catImage.setLayoutParams(CatlayoutParams);


        ImageView dogImage = (ImageView) findViewById(R.id.dog_image);
        LinearLayout.LayoutParams DoglayoutParams = new LinearLayout.LayoutParams(0, 100 + 10*dogVotesCounter,dogVotesWeight );
        dogImage.setLayoutParams(DoglayoutParams);

    }

}
