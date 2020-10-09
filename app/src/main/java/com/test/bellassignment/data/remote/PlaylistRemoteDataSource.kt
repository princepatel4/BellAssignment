package com.test.bellassignment.data.remote

import com.test.bellassignment.data.PlaylistService

class PlaylistRemoteDataSource @Inject constructor(
    private val playlistService: PlaylistService
):BaseDataSource(){
    suspend fun getPlaylist(channelId: String)  = getResult { playlistService.getPlaylist() }
}