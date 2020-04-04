package com.example.projectuts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rm);

        RecyclerView playerView = findViewById(R.id.rv_player);

        List<PlayerFace> players = new ArrayList<>();
        players.add(new PlayerFace("https://upload.wikimedia.org/wikipedia/en/f/fa/BMTH_Count_Your_Blessings.png", "Count Your Blessings"));
        players.add(new PlayerFace("https://upload.wikimedia.org/wikipedia/en/5/5d/BMTH_Suicide_Season.png", "Suicide Season"));
        players.add(new PlayerFace("https://upload.wikimedia.org/wikipedia/en/8/82/BMTH_There_Is_a_Hell.png", "There Is a Hell Believe Me I've Seen It"));
        players.add(new PlayerFace("https://upload.wikimedia.org/wikipedia/en/b/bb/BMTH_Sempiternal.png","Sempiternal"));
        players.add(new PlayerFace("https://1.bp.blogspot.com/-sNlY7C0GKp8/XF_sgDTM9kI/AAAAAAAAATc/uGRpkgoGMNYBBZc7gx4D9cjew5M_cfZ8ACLcBGAs/s1600/100000x100000-999.jpg","That's The Spirit"));
        players.add(new PlayerFace("https://upload.wikimedia.org/wikipedia/en/thumb/9/97/AmoBringMetheHorizon.png/220px-AmoBringMetheHorizon.png","Amo"));

        PlayerFace adapter = new PlayerFace(this, players);
        playerView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        playerView.setLayoutManager(layoutManager);
    }
}
