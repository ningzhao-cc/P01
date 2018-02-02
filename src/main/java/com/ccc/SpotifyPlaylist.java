package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class SpotifyPlaylist extends Playlist {
    final String prefix = "spotify:playlist:";

    private String playlistId;

    public SpotifyPlaylist() {
        playlistId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.playlistId;
    }
}
