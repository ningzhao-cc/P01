package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class SpotifyAlbum extends Album {
    final String prefix = "spotify:album:";

    private String albumId;

    public SpotifyAlbum() {
        albumId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.albumId;
    }
}
