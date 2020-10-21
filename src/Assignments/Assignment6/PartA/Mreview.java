package Assignments.Assignment6.PartA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Mreview implements Comparable<Mreview>{
    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public Mreview() {
    }

    public Mreview(String title) {
        this.title = title;
    }

    public Mreview(String title, int firstRating) {
        this.title = title;
        this.ratings = new ArrayList<>(Arrays.asList(firstRating));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }

    public void addRating(int r){
        ratings.add(r);
    }

    public double aveRating(){
        int sum =0;
        for (int i = 0; i < ratings.size(); i++) {
            sum+=ratings.get(i);
        }
        return (double) sum/ratings.size();
    }
    public int numRatings(){
        return ratings.size();
    }

    @Override
    public int compareTo(Mreview o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mreview mreview = (Mreview) o;
        return title.equals(mreview.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title + ", average " + aveRating() + " out of " + numRatings() + " ratings";
    }
}
