package com.test.bellassignment.models.playlists

data class PlaylistResponseModel(
    val kind:String,
    val etag:String,
    val nextPageToken:String,
    val items:List<PlaylistItems>)