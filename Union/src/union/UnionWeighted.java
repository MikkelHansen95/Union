package union;
public class UnionWeighted implements UnionFindInterface {
   
/**
 * @author Mikkel
 */
    private int count;
    private int[] parent;
    private int[] size;

    public UnionWeighted(int count) {
        this.size = new int[count];
        this.count = count;
        this.parent = new int[count];
        for (int i = 0; i < count; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    @Override
    public void union(int p, int q) {
        int setOfp = find(p);
        int setOfq = find(q);
//        for (int i = 0; i < pointSets.length; i++)
//            if (pointSets[i] == setOfp) pointSets[i] = setOfq;
        
        
        if (size[setOfp] < size[setOfq]) {
            parent[setOfp] = setOfq;
            size[setOfq] += size[setOfp];
        }
        else {
            parent[setOfq] = setOfp;
            size[setOfp] += size[setOfq];
        }
        
        
    }

    @Override
    public int find(int p) {
         while (p != parent[p])
            p = parent[p];
        return p;
        }

    @Override
    public boolean connected(int p, int q) {
        return find(p) == find(q);
        }

    @Override
    public int count() {
        return count;
        }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < parent.length; i++) {
            result+=parent[i]+" ";
            }
        return result;
        }

    public static void main(String[] args) {
        UnionWeighted qf = new UnionWeighted(10);
        System.out.println(qf.toString());
        qf.union(7, 8);
        System.out.println(qf.toString());
        qf.union(5, 6);
        System.out.println(qf.toString());
        qf.union(5, 7);
        System.out.println(qf.toString());
        qf.union(1, 0);
        System.out.println(qf.toString());
        qf.union(7, 0);
        System.out.println(qf.toString());
        
//        (log(n))
//          5 
//   6      1      7   
// -   -  -   0  -    8
//       
        
    }
 
}
//
//           O(n)
//           0
//1   2 3 4   6   7   8   8   9 9