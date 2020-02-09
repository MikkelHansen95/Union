/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package union;

/**
 *
 * @author Mikkel
 */
public interface UnionFindInterface {
    
    void union(int p, int q);
    int find(int p);
    boolean connected(int p, int q);
    int count();
    
    
    
}
