## Birthday Cake Printer

Write a function that prints a birthday cake using text characters.

Your function should take one integer input `N`, which represents the number of cake layers (rows) between the frosting and the base.
`N` is greater than or equal to 1, and less than or equal to 15.

The cake should include:
- A candle flame (`*`)
- A candle stick (`|`)
- A frosting layer made of exactly 3 `=` characters
- A cake body made of `N` layers, where each layer gets 2 characters wider (1 on each side) as you go down
- A base layer made of `=` characters, matching the full width of the bottom cake layer

Each layer should be centered to make the cake symmetrical.

Define a function in your language of choice, preferrably either Java or Python.

```java

public static void printCake(integer n){
    // ... your code goes here!
}
```

```python
def birthday_cake(n: int) -> None:
    # answer here
    print("Yay look my answer")
    
birthday_cake(1)
```


Example for N = 3:

```
    *
    |
   ===
  |   |
 |     |
|       |
=========
```


Example for N = 6:

```
       *
       |
      ===
     |   | 
    |     |
   |       |
  |         |
 |           |
|             |
===============
```
