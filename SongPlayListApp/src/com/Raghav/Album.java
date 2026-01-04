package com.Raghav;

import java.util.ArrayList;
import java.util.LinkedList;
public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String name,String artist) {
		this.name=name;
		this.artist=artist;
		this.songs= new ArrayList<>();
	}
		 public Album() {
			 this.songs = new ArrayList<>(); 
		}
		 public Song findSong(String title) {
			 for(Song checkedSong:songs) {
				 if(checkedSong.getTitle().equals(title))
					 return checkedSong;
			 }
			 return null;
		 }
		 public boolean addSong (String title,double duration) {
			 if(findSong(title)==null) {
				 songs.add(new Song(title,duration));
				// System.out .print(title+"successfully added to the list");
				 return true;
			 }
			 else {
				 //System.out .print("song with name"+title+"already exist in the list");
				 return false;
			 }
		 }
			 public boolean addToPlayList(int trackNumber,LinkedList<Song> PlayList){
				 int index =trackNumber-1;
				 if(index>0&&index<=this.songs.size()) {
					 PlayList.add(this.songs.get(index));
					 return true;
				 }
				// System.out.println("this Album does not have song with tracknumber"+trackNumber);
				 return false;
			 }
			 public boolean addToPlayList(String title,LinkedList<Song> playList) {
				 for(Song checkedSong:this.songs) {
					 if(checkedSong.getTitle().equals(title)) {
						 playList.add(checkedSong);
						 return true;
					 }
				 }
				// System.out.println(title+"there is no such in album");
				 return false;
			 }
}
			
		
			

	


