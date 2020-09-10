### It can be executed in two watys
1. Importing as project in IDE
2. Using JAR file to execute directly.

#### Using JAR file to execute project directly.
- JAR file is compiled using Java 11 version.
- It may throw major-minor version mismatch exception in case using different JDK version.
- **Use below command execute the program**
```
java -jar VillagerBoatExample.jar
```

**Sample Output 1:**
```

Number of test cases: 1
------- TEST CASE - 1 -------
Number of people: 4
Costs (separated by space): 150 600 700 800
Output:
2400

```
**Sample Output 2:**
```

Number of test cases: 2
------- TEST CASE - 1 -------
Number of people: 3
Costs (separated by space): 20 30 40
------- TEST CASE - 2 -------
Number of people: 3
Costs (separated by space): 30 40 50

Output:
90
120

```