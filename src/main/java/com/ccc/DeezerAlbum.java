package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class DeezerAlbum extends Album {
    final String prefix = "deezer:album:";

    private String albumId;

    public DeezerAlbum() {
        albumId = prefix + CCCUtil.creatInt();
    }

    @Override
    public String getId() {
        return this.albumId;
    }
}
