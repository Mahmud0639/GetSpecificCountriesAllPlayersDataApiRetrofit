package com.manuni.getspecificteamallplayerinfo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyTag";
    private int cId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = ApiClient.getRetrofit();
        ApiData apiData = retrofit.create(ApiData.class);
        Call<TeamMainObject> mainObjectCall = apiData.getSpecificTeam(10, Utils.API_TOKEN);
        mainObjectCall.enqueue(new Callback<TeamMainObject>() {
            @Override
            public void onResponse(Call<TeamMainObject> call, Response<TeamMainObject> response) {
                if (response.isSuccessful()){
                   TeamData teamData = response.body().getData();
                    cId = teamData.getCountry_id();
                }

            }

            @Override
            public void onFailure(Call<TeamMainObject> call, Throwable t) {

            }
        });
      Call<PlayerMainObjectData> playerMainObjectDataCall =  apiData.getSpecificPlayers(Utils.API_TOKEN,cId);
      playerMainObjectDataCall.enqueue(new Callback<PlayerMainObjectData>() {
          @Override
          public void onResponse(Call<PlayerMainObjectData> call, Response<PlayerMainObjectData> response) {
              if (response.isSuccessful()){
                 List<PlayerObjectData> playerObjectData = response.body().getData();
                 for (PlayerObjectData objectData: playerObjectData){
                     Log.d(TAG, "onResponse: fullName "+objectData.getFullname());
                     Log.d(TAG, "onResponse: battingStyle "+objectData.getBattingstyle());
                     Log.d(TAG, "onResponse: gender "+objectData.getGender());
                     Log.d(TAG, "onResponse: updatedAt "+objectData.getUpdated_at());
                 }
              }
          }

          @Override
          public void onFailure(Call<PlayerMainObjectData> call, Throwable t) {
              Log.d(TAG, "onFailure: error "+t.getMessage());
          }
      });

    }
}