package com.manuni.getspecificteamallplayerinfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiData {

    @GET("teams/{id}")
    Call<TeamMainObject> getSpecificTeam(@Path("id")int id, @Query("api_token")String token);

    @GET("players")
    Call<PlayerMainObjectData> getSpecificPlayers(@Query("api_token")String token, @Query("country_id")int countryId);


}
