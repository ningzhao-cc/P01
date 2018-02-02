package com.ccc;

/**
 * Created by Ning on 2/2/18.
 */
public class SpotifyArtist extends Artist{
    final String prefix = "spotify:artist:";

    private String artistId;

    public SpotifyArtist() {
        artistId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.artistId;
    }
}
