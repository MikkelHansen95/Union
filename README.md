# Union

## QuickFind:
               O(n)
                0
        1 | 5 | 6 | 7 | 8    

Worst case scenario is O(n) if you have to run through all nodes to find the last one.


## Weighted:
              (log(n))
                   5 
           6   |   1   |   7   
         -   - | -   0 | -    8

Worst case scenario is O(log(n)) because you can never run through all nodes to find the requested one.
