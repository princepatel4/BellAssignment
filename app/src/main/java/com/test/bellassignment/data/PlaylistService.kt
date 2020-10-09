package com.test.bellassignment.data

import com.test.bellassignment.models.playlists.PlaylistResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PlaylistService{
    //@GET("playlists?part=snippet&channelId=UCPVhZsC2od1xjGhgEc2NEPQ&key=AIzaSyAuQlSmRo-UQttB2niKfwQKrhvOBwqLBsQ&maxResults=10")
    @GET("playlists?part=snippet&channelId={channelId}&key={key}&maxResults={maxResult}")
    suspend fun getPlaylist(@Path("channelId") channelId:String, @Path("key") key:String, @Path("maxResults") maxResults:String) : Response<PlaylistResponseModel>
}