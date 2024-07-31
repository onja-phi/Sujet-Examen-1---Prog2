package com.examen;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Chanson {
    private String id;
    private String titre;
    private SongDuration songDuration;
    private String genre;
    private String album;
    private List<Chanson> playlist;

    public Chanson(String id, String titre, SongDuration songDuration, String genre, String album, List<Chanson> playlist) {
        this.id = id;
        this.titre = titre;
        this.songDuration = songDuration;
        this.genre = genre;
        this.album = album;
        this.playlist = new ArrayList<>();
    }

    public void addToPlaylist(Chanson chanson) {
        this.playlist.add(chanson);
    }

    public void removeById(String id){
        this.playlist = this.playlist.stream().filter(col -> col.id() != col.id()).collect(Collectors.toList());
    }

    private boolean id() {
        return false;
    }
}
