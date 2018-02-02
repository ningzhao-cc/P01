package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class SpotifyTrack extends Track {
    final String prefix = "spotify:track:";

    private String trackId;

    public SpotifyTrack() {
        trackId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.trackId;
    }
}
