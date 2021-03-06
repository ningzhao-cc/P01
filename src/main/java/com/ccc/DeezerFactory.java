package com.ccc;

/**
 * Created by Ning on 2/1/18.
 */
public class DeezerFactory extends MusicFactory {

    @Override
    public String playMusic(String type) {
        switch (type) {
            case "track":
                return playTrack();

            case "playlist":
                return playPlaylist();

            case "album" :
                return playAlbum();

             default:
                 return playTrack();
        }
    }

    @Override
    public String playTrack() {
        Track track = new DeezerTrack();
        System.out.println("playing track: " + track.getId());
        return track.getId();
    }

    @Override
    public String playPlaylist() {
        Playlist playlist = new DeezerPlaylist();
        System.out.println("playing playlist: " + playlist.getId());
        return playlist.getId();
    }

    @Override
    public String playAlbum() {
        Album album = new DeezerAlbum();
        System.out.println("playing album: " + album.getId());
        return album.getId();
    }
}
