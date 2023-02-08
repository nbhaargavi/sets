package org.example;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class treeset {
    public static void main(String[] args) {
        Logger l=Logger.getLogger("kitty");
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("timothee");
        tset.add("chalamet");
        tset.add("bhaargavi");
        tset.add("chalamet");
        tset.add("tim");
        l.info("INITIAL TREE SET :");
        l.log(Level.INFO,() ->" "+tset);
        tset.pollFirst();
        l.log(Level.INFO,() ->"After removing First element :" + tset);
        tset.pollLast();
        l.log(Level.INFO,() ->"After removing Last element :" + tset);
        tset.clone();
        l.log(Level.INFO,() ->"Cloned tree set : "+ tset);
    }
}
