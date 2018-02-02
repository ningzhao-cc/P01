package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class DeezerTrack extends Track {
    final String prefix = "deezer:track:";

    private String trackId;

    public DeezerTrack() {
        trackId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.trackId;
    }
}
