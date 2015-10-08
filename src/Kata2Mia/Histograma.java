/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata2Mia;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author usuario
 */
public class Histograma {
    private int[] vector;
    private Map<Integer, Integer> histograma = new HashMap<Integer,Integer>(); 
    
    public Histograma(int[] vector) {
        this.vector = vector;
    }
    
    public void generateHistogram(){
        for(int i = 0; i<vector.length; i++){
            if (histograma.containsKey(vector[i])==false){
                histograma.put(vector[i], 1); 
            } else {
                histograma.put(vector[i], histograma.get(vector[i])+1);
            }
        }
    }
    
    public int[] getVector() {
        return vector;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Iterator<Entry<Integer, Integer>> iter = histograma.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<Integer, Integer> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();
    }
 
    
    
}
