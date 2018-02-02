package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class DeezerPlaylist extends Playlist {
    final String prefix= "deezer:playlist:";

    private String playlistId;

    public DeezerPlaylist() {
        playlistId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.playlistId;
    }
}
