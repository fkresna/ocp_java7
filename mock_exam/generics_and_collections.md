# Generics and Collection
## Sierra & Bates
1.  Given:
    public static void main(String[] args) {
        //INSERT DECLARATION HERE
        for (int i=0;i<= 10;i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j=0;j<=10;j++)
                row.add(i*j);
            table.add(row);
        }
        for (List<Integer) row : table)
            System.out.println(row);
    }
    Which statements could be innserted at //INSERT DECLARATION HERE to allow this code to compile and run? (Choose all that apply)
    A. List<List<Integer>> table = new List<List<Integer>>();
    B. List<List<Integer>> table = new ArrayList<List<Integer>>();
    C. List<List<Integer>> table = new ArrayList<ArrayList<Integger>>();
    D. List<List, Integer> table = new List<List, Integer>();
    E. List<List, Integer> table = new ArrayList<List, Integer>();
    F. List<List, Integer> table - new ArrayList<ArrayList, Integer>();
    G. None of the above
    Answer: A 
    B is incorrect because List is an interface, so you can't say new List(), regardless of any generic types. D, E, and F are incorrect because List only takes one type parameter (a Mapp would take two, not a List). C is tempting, but incorrect. The type argument <List<Integer>/> must be the same for both sides of the assignment, even though the constructor new ArrayList() on the right side is a subtype of the declared type List on the left.

2. Which stateents are true about comparing two instances of the same class, given that the equals() and hashCode() methods have been properly overriden? (Choose all that apply)
    A. If theequals() method returns true, the hashCode() comparison == might return false
    B. If the equals() method returns false, the hashCode() comparison == might return true
    C. If the hashCode() comparison == returns true, the equals() method must return true
    D. If the hashCode() comparison == return true, the equals() method might return true
    E. If the hashCode() comparison != return true, the equals() method might return true
    Answer: B and D. B is true because often two dissimilar objects can return the same hashcode value. D is true because if the hashCode() comparison returns ==, the two objects might or might not be equal.
    A, C, and E are incorrect. C is incorrect because the hashCode() method is very flexible in its return values, and often two dissimilar objects can return the same hashcode value. A and E are a negation of the hashCode() and equals() contract. 

3. Given 
    public static void before() {
        Set set = new TreeSet();
        set.add("2");
        set.add(3);
        set.add("1");
        Iterator it = set.iterator();
            while (it.hasNext())
        System.out.print(it.next() + " ");
    }
    Which statements are true?
    A. The before() method will print 1 2
    B. The before() method will print 1 2 3 
    C. The before() method will print three numbers, but the order cannot be determined
    D. The before() method will not compile
    E. The before() method will throw an exception at runtime