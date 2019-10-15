/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Map;
import GUI.GUI;
import java.util.*;

/**
 *
 * @author rajazulqarnain
 */

public class map { 
    //Total numbers of Provinces and territories
    public int Vertex = 13;
    public int x, i, color, finalindex;    
    //ArrayList to store the results 
    public ArrayList<Integer> Province[];  
    public int [] GUIArray1 = new int [Vertex];
    //public int [] GUIArray2 = new int [Vertex];
    //public String [] GUIArray2 = new String [Vertex];
    public int arr[] ;
    public int AssignColor[] = new int[Vertex];
    //GUI.GUI  Graph = new GUI();
    public String CanPro [] = {"Yukon", "British Columbia", "Northwest Territories", "Alberta","Nunavut","Saskatchewan","Manitoba","Manitoba"};
    //Constructor with no paramaters create an arrayList and store the province value
    public map(){ 
        Province = new ArrayList[Vertex]; 
        for (int i=0; i<Vertex; ++i){ 
            Province[i] = new ArrayList(); 
        }
    }
    public void ProvinceLink(int province,int link){ 
        Province[province].add(link); 
        Province[province].add(link); //Graph is undirected 
    } 
     
    public void CSPMap(){
        
        int arr[] = new int[Vertex];
        String [] Color = {"RED", "Yellow", "Green"};
        String [] PR = new String [Vertex];
        PR[0] = "Yukon";
        PR[1] = "British Columbia";
        PR[2] = "Northwest Territories";
        PR[3] = "Alberta";
        PR[4] = "Nunavut";
        PR[5] = "Saskatchewan";
        PR[6] = "Manitoba";
        PR[7] = "Ontario";
        PR[8] = "Quebec";
        PR[9] = "New Brunswick";
        PR[10] = "Newfoundland and Labrador";
        PR[11] = "Nova Scotia";
        PR[12] = "Prince Edward Island";
        Arrays.fill(AssignColor, -1); 
        // First Temparory color 
        AssignColor[0]  = 0; 
        //Temparory arry to store color
        boolean temp[] = new boolean[Vertex]; 
        Arrays.fill(temp, true); 
        for (i = 1; i < Vertex; i++){ 
            //Iterat through each index 'province'
            Iterator<Integer> p = Province[i].iterator() ; 
            while (p.hasNext()){ 
                x = p.next(); 
                if (AssignColor[x] != -1) 
                    temp[AssignColor[x]] = false; 
            } 
            for (color = 0; color < Vertex; color++){ 
                if (temp[color]) 
                    break; } 
            AssignColor[i] = color; 
           // System.out.println(AssignColor[i]);
            //Color[u] = Color[color];
            Arrays.fill(temp, true); 
        }
        for (finalindex = 0; finalindex < Vertex; finalindex++){
            //Print the Province name and the assign color
                System.out.println(PR[finalindex] +": " + Color[AssignColor[finalindex]]);
                //GUIArray2[finalindex] = PR[finalindex];
                //mapcssp(PR);
        }
    }
   /* public String[] mapcssp(String [] a){
        String [] ProName = new String [Vertex];
        for (int j = 0; j < Vertex; j++) {
            ProName[j] = a[i];
        }
        return ProName;
    }*/
    
} 
       