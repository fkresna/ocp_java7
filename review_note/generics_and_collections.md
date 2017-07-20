#Generics and Collections
##Sierra and Bates
###Overriding hashCode() and equals()
* equals(), hashCode() and toString() are public
* Override toString() so that System.out.println() or other methods can see something useful, like your object's state.
* Use == to determine if two reference variables refer to the same object.
* Use equals() to determine if two objects are meaningfully equivalent.
* If you don't override equals(), your objects won't be usefull hashing keys.
* If you don't override equals(), different objects can't be considered equal.
* Strings and wrappers override equals() and make good hashing keys.
* When overriding equals(), use the instanceof operator to be sure you're evaluating an appropriate class.
* When overriding equals(), compare the objects significant attributes.
* Highlights of the equals() contract:
    - Reflective: x.equals(x) is true.
    - Symmetric: If x.equals(y) is true, the y.equals(x) must be true.
    - Transitive: If x.equals(y) is true, and y.equals(z) is true, then z.equals(x) is true
    - Consistent: Multiple calls to x.equals(y) will return the same result.
    - Null: If x is not null, then x.equals(null) is false
* If x.equals(y) is true, then x.hashCode() == y.hashCode() is true.
* If you override equals(), override hashCode().
* HashMap, HashSet, Hashtable, LinkedHashMap, and LinkedHashSet use hashing.
* An appropriate hashCode() override sticks to the hashCode() contract.
* An efficient hashCode() override distributes keys evenly across its buckets.
* An overridden equals() must be at least as precise as its hashCode() mate.
* To reiterate: If two objects are equal, their hashcodes must be equal.
* It's legal for a hashCode() method to return the same value for all instances (although in practise it's very inefficient).
* Highlights of the hashCode() contract:
    - Consistent: Multiple calls to x.hashCode() return the same integer.
    - If x.equals(y) is true, x.hashCode() == y.hashCode() is true.
    - If x.equals(y) is false, then x.hashCode() == y.hashCode() can be either true or false, but false will tend to create better efficiency.
* Transient variables aren't appropriate for equals() and hashCode().

###Collections
* Common collection activities include adding objects, removing object, verifying object inclusion, retrieving objects, and iterating.
* Three meanings for "collection":
  - collection Represents the data structure in which objects are stored
  - Collection java.util interface from which Set and List extend
  - Collections A class that holds static collection utility methods
* Four basic flavors of collections include Lists, Sets, Maps, and Queues:
  - List of things Ordered, duplicates allowed, with an index
  - Set of things May or may not be ordered an/or sorted; duplicates not allowed
  - Maps of things with keys May or may not be ordered and/or sorted; duplicate keys are not allowed
  - Queues of things to process Ordered by FIFO or by priority
* Four basic subflavors of collections: Sorted, Unsorted, Ordered, and Unordered:
  - Ordered Iterating through a collection in a specific, nonrandom order
  - Sorted Iterating through a collection in a sorted order
* Sorting can be alphabetic, numeric, or programmer-defined

###Key Attributes of Common Collection Classes
* ArrayList, Fast iteration and fast random access
* Vector It's like a slower ArrayList, but it has synchronized methods
* LinkedList Good for adding elemtens to the ends, i.e. stacks and queues
* HashSet Fast access, assures no duplicates, provides no rodering.
* LinkedHashSet No duplicates; iterates by insertion order.
* TreeSet No duplicates; iterates in sorted order.
* HashMap Fastest updates (key/values); allows one null key, many null values.
* Hashtable Like a slower HashMap (as with Vector, due its synchronized methods). No null values or null keys allowed.
* Linked HashMap Faster iterations; iterates by insertion order or last accessed; allows one null key, many null values.
* TreeMap A sorted map.
* PriorityQueue A to-do list ordered by the elements priority

###Using Collection Classes
* Collections hold only Objects, but primitives can be autoboxed
* Java 7 allows "diamond" syntax:List<Dog> d = new ArrayList<>();
* Iterate with the enhanced for or with an Iterator via hasNext() and next()
* hasNext() determines if more elements exist; the Iterator does NOT move
* next() returns the next element AND moves the Iterator forward
* To work correctly, a Map's keys must override equals() and hashCode()
* Queues use offer() to add an element, poll() to remove the head of the queue, and peek() to look at the head of a queue.

###Sorting and Searching Arrays and Lists
* Sorting can be in natural order or via a Comparable or many Comparators
* Implement Comparable using compareTo(); provides only on esort order.
* Create many Comparators to sort a class many ways; implement compare()
* To be sorted and searched, an array's or List's element must be comparable
* To be searched, an array or List must first be sorted.

