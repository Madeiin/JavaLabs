package com.company;
import java.util.ArrayList;
import java.util.Objects;

public class SbornikAnekdotov implements GetSet {
    private ArrayList<Integer> paragraphСount;
    private String name;
    private int intrParphCount;

    SbornikAnekdotov() {
    }

    SbornikAnekdotov(ArrayList<Integer> paragraphСount, String name, int intrParphCount) {
        this.paragraphСount = paragraphСount;
        this.name = name;
        this.intrParphCount = intrParphCount;
    }



    public String getName()          {return name;}
    public void setName(String name) {this.name = name;}

    public int getIntrParphCount() {return intrParphCount;}
    public void setIntrParphCount(int intrParphCount) {this.intrParphCount = intrParphCount;}

    public ArrayList<Integer> getParagraphСount() {return paragraphСount;}
    public void setParagraphСount(ArrayList<Integer> paragraphСount) {this.paragraphСount = paragraphСount;}

    public int paragraphCountWithoutIntr(int index)
    {
        int result =  paragraphСount.get(index) - intrParphCount;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SbornikAnekdotov that = (SbornikAnekdotov) o;
        return intrParphCount == that.intrParphCount && Objects.equals(paragraphСount, that.paragraphСount) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paragraphСount, name, intrParphCount);
    }

    @Override
    public String toString() {
        return "SbornikAnekdotov{" +
                "paragraphСount=" + paragraphСount +
                ", name='" + name + '\'' +
                ", intrParphCount=" + intrParphCount +
                '}';
    }

    public class SbornikAnekdotovException extends Exception {
        private static final long serialVersionUID = 1L;

        public SbornikAnekdotovException(String message) {
            super(message);
        }
    }

    public class SbornikAnekdotovExceptionRuntimeException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public SbornikAnekdotovExceptionRuntimeException(String message) {
            super(message);
        }
    }

}

