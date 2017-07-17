## Java access modifiers
* The access modifiers control the accessibility of your class and its members outside the class and package.
* Access modifiers defined by Java are public, protected, and private. In the absence of an explicit access modifier, a member is defined with the default access level.
* The public access modifier is the least restrictive access modifier.
* Classes and interfaces defined using the public access modifier are accessible to related and unrelated classes outside the package in which they're defined.
* The members of a class defined using the protected access modifier are accessible to classes and interfaces defined in the same package and to all derived classes, even if they're defined in separate packages.
* The members of a class defined without using an explicit access modifier are defined with package accessibility (also called default accessibility)
* The members with package access are accessible only to classes and interfaces defined in the same package.
* A class defined using default access can't be accessed outside its package.
* The private members of a class are only accessible to itself.
* The private access modifier is the most restrictive access modifier.
* A top-level class, interface, or enum can only be defined using the public or default access. They can't be defined using protected or private access.
* Method parameters and local variables can never be defined using an explicit access modifier. They don't have access control-only scope. Either they're in scope or out of scope.
* If accessibility of an existing Java entity or its member is decreased, it can break others code.

## Overloaded methods and constructors
* Overloaded methods are methods with the same name but different method parameter lists.
* A class can overload its own methods and inherited methods from its base class.
* Overloaded methods accept different lists of arguments.
* The argument lists of overloaded methods can differ in terms of change in the number, type, position of parametes that they accept.
* Overloaded methods are bound at compile time. Unlike overridden methods they're not bound at runtime.
* A call to correctly overloaded methods can also fail compilation if the compiler is ubable to resolve the call to an overloaded method.
* Overloaded methods might define a different return type or access or nonaccess modifier, but they can't be defined with only a change in their return types or access or nonaccess modifiers.
* Overloaded constructors must be defined using different argument lists.
* Overloaded constructors can't be defined by just change in the access modifiers.
* Overloaded constructors can be definen using different access modifiers.
* A constructor can call another overloaded constructor by using the keyword this.
* A constructor can't invoke another constructor by using its class's name.
* If present, the call to another constructor must be the first statement ina constructor.

## Method overriding and virtual method invocation
* Method overriding is an OOP language feature that enables a derived class to define a specific implementation of an existing base class method to extend its own behaviour.
* A derived class can override an instance method defined in a base class by defining an instance method with the same method signature.
* Whenever you intend to override methods in a derived class, use the annotation @Override. It will warn you if a method can't be overridden or if you're actually overloading a method rather than overriding it.
* Overridden methods can define the same or covariant return types.
* A derived class can't override a base class method to make it less accessible.
* Overriding methods must define exactly the same method parameters; the use of a subclass or parent class results in overloading methods.
* Static methods can't be overriden. They're not polymorphic and they're bound at compile time.
* In a derived class, a static method with the same signature as that of a static method in its base class hides the base class method.
* A derived class can't override the base class methods that aren't accessible to it, such as private methods.
* Constructors cannot be overriden because a base class contructors isn't inherited by a derved class.
* A method that can be overridden by a derived class is called a virtual method.
* Virtual method invocation is invocation of the correct method-determined using the object type and not its reference.

## Java packages
* You can use packages to group together a related set of classes and interfaces.
* The package and subpackage names are separated using a period.
* Classes and interfaces in the same package can access each other.
* An import statement allows the use of simple names for classes and interfaces defined in other packages.
* You can't use the import statment to access multiple classes or interfaces with the same names from different packages.
* You can import either a single member or all members (classes and interfaces) of a package using the import statement.
* You can't import classes from a subpackage by using the wildcard character, an asterik (*), in the import statement.
* A class from the default package can't be used in any named package, regardless of whether it's defined within the same directory or not.
* You can import an individual static member of a class or all its static members by using an import static statement.
* An import statement can't be placed before a package statement in a class. Any attempt to do so will cause the compilation of the class to fail.
* The members of the default package are accessible oly to classes or interfaces defined in the same directory on your system.
