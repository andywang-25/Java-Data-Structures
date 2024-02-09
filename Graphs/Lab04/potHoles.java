

//Algs and Data Structures, Winter Term, Andy Wang 

import java.util.*;
import java.io.*;

public class potHoles {
    static int[][] connections = new int[26][26]; 

    public static void main (String[] args) throws Exception {
        Scanner fromFile = new Scanner(new File("potholes.dat")); 

        String destination = fromFile.nextLine();
        ArrayList<Character> placesVisited = new ArrayList<Character>(); 
        placesVisited.add('A'); 

        for (int r = 0; r < connections.length; r++) {
            for (int c = 0; c < connections[0].length; c++) {
                connections[r][c] = -1; //populate the matrix 
            }
        }

        while (fromFile.hasNext()) {
            String[] temp = fromFile.nextLine().split("/"); 
            char LocationA = temp[0].charAt(0); 
            char LocationB = temp[1].charAt(0);
            int distance = Integer.parseInt(temp[1].substring(4)); 

            connections[LocationA - 'A'][LocationB - 'A'] = distance; 
            connections[LocationB - 'A'][LocationA - 'A'] = distance; 
        }

        shortestPath("A", destination); 
    }

    public static String shortestPath(String start, String end) {
        Set<String> uniquePaths = new HashSet<>(); 
        ArrayList<String> pathsToCheck = new ArrayList<>(); 

        String temp = "" + start; 
        pathsToCheck.add(temp); 
        while (pathsToCheck.size() > 0) {
            String current = pathsToCheck.remove(0); 

            if ((current.charAt(current.length()-1 ) + "").equals(end)) {
                uniquePaths.add(current); 
            }
            
            else {
                char at = current.charAt(current.length()-1);
                for (char letter = 'A'; letter <= 'Z'; letter++) 
                    if (connections[at - 'A'][letter - 'A'] != -1 && current.indexOf(letter) ==-1) {
                        String clone = current + letter; 
                        pathsToCheck.add(clone); 
                }
            }
        }

            String shortest = null;
            int minDistance = -1;
            for (String s : uniquePaths)
                if (shortest == null || minDistance > pathDistance(s)) {
                    minDistance = pathDistance(s); 
                    shortest = s; 
                }
                return shortest; 
        }



        public static int pathDistance(String path) {
            int distance = 0; 
            for (int x = 0; x < path.length() -1; x++) 
                distance += connections[path.charAt(x) - 'A'][path.charAt(x+1) - 'A'];
            return distance; 
        }
    }
}