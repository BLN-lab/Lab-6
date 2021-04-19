package com.example.lab_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class More_Information extends AppCompatActivity {
    private String[]
            _more={
            "The United States of America (USA), commonly known as the United States (U.S. or US), or America, is a country primarily located in North America. It consists of 50 states, a federal district, five major self-governing territories, 326 Indian reservations, and some minor possessions.[g] At 3.8 million square miles (9.8 million square kilometers), it is the world's third- or fourth-largest country by total area.[c] With a population of more than 328 million people, it is the third most populous country in the world. The national capital is Washington, D.C., and the most populous city is New York City.",
            "China, officially the People's Republic of China (PRC), is a country in East Asia. It is the world's most populous country, with a population of around 1.4 billion.[8] Covering approximately 9.6 million square kilometers (3.7 million mi2), it is the world's third or fourth-largest country by area.[k] The country is officially divided into 23 provinces,[l][18] five autonomous regions, four direct-controlled municipalities (Beijing, Tianjin, Shanghai, and Chongqing), and two special administrative regions of Hong Kong and Macau.",
            "Europe and Northern Asia. It is the largest country in the world, covering 17,125,191 square kilometres (6,612,073 sq mi), and encompassing more than one-eighth of the Earth's inhabited land area. Russia extends across eleven time zones, and has borders with sixteen sovereign nations. It has a population of 146.2 million; and is the most populous country in Europe, and the ninth-most populous country in the world. Moscow, the capital, is the largest city in Europe, while Saint Petersburg is the nation's second-largest city and cultural centre. Russians are the largest Slavic and European nation; they speak Russian, the most spoken Slavic language, and the most spoken native language in Europe.",
            "country in East Asia. Its area is roughly equivalent with the historical territory of Outer Mongolia, which is sometimes used to refer to the current state. It is situated between Russia to the north and China to the south, where it neighbours the Inner Mongolia Autonomous Region. Mongolia does not share a border with Kazakhstan, although only 37 kilometres (23 miles) of land owned by Russia and China separate them.",
            "Japanese is an island country in East Asia, located in the northwest Pacific Ocean. It is bordered on the west by the Sea of Japan, and extends from the Sea of Okhotsk in the north toward the East China Sea and Taiwan in the south. Part of the Ring of Fire, Japan spans an archipelago of 6852 islands covering 377,975 square kilometers (145,937 sq mi); the five main islands are Hokkaido, Honshu, Shikoku, Kyushu, and Okinawa. Tokyo is Japan's capital and largest city; other major cities include Yokohama, Osaka, Nagoya, Sapporo, Fukuoka, Kobe, and Kyoto."
            },
            _data={
            "USA","China","Russian","Mongolian","Japan"
            },
            _population={
            "308.745.538","1.340.910.000","143.759.445","3.057.778","125.480.000"
            };
    int[] Img={R.drawable.usa,R.drawable.china,R.drawable.russian,R.drawable.mongolian,R.drawable.japan};
    ImageView img;
    TextView name,population,more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more__information);
        img=findViewById(R.id.img);
        name=findViewById(R.id.name);
        population=findViewById(R.id.population);
        more=findViewById(R.id.more);
        Intent i = getIntent();
        int n=i.getIntExtra("SD",0);
        img.setImageResource(Img[n]);
        name.setText("Name:"+_data[n]);
        population.setText("Population:"+_population[n]);
        more.setText("More Information:"+_more[n]);
    }
}