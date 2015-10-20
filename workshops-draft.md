#### Create sample project

* Defined project name, ie. "my-very-first-project"

* Create package com.coderborther

* Preview generated class: Main

#### Introduce console output

* In generated Main class create System.out invocation

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Started: Airplane management");
        System.out.println("Finished: Airplane management");
    }
}
```

* Replace inline String with String variable and utilize string concatenation

```java
package com.coderbrother;

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        System.out.println("Finished: " + programName);
    }
}
```

#### Introduce new class

* Create new Airplane class 

```java
package com.coderbrother;

public class Airplane {
    public String registration;
}
```

* Create an instance of newly created class in main class

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        
        Airplane airplane1 = new Airplane();
        System.out.println(airplane1.registration);
        
        System.out.println("Finished: " + programName);
    }
}
```

> If the value of the object is not defined, all class object fields will default to **null**.

* Set the registration number

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        
        Airplane airplane1 = new Airplane();
        airplane1.registration = "AAA-111";
        System.out.println(airplane1.registration);
        
        System.out.println("Finished: " + programName);
    }
}
```

* Create getter and setter for registration and make registration field **private**

```java
public class Airplane {
    private String registration;

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane();
        airplane1.setRegistration("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Java defines 4 scopes for class fields: default, private, public and protected.

* Create new constructor which takes registration as a parameter
  
```java
public class Airplane {
    private String registration;

    public Airplane(String newRegistration) {
        registration = newRegistration;
    }
    
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Once custom constructor is defined default constructor is disabled automatically. If you want to keep the default constructor you have to define it manually.

* Override registration with using setter method

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setRegistration("AAA-222");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

* Remove setter method invocation

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

#### Introduce an array

* Create second airplane

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        System.out.println(airplane1.getRegistration());

        Airplane airplane2 = new Airplane("BBB-222");
        System.out.println(airplane2.getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

* Defined Java array of airplanes with predefined size size, warning: try to insert more elements than defined
  
```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[2];
        airplanes[0] = airplane1;
        airplanes[1] = airplane2;
        
        System.out.println(airplanes[0].getRegistration());
        System.out.println(airplanes[1].getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> If you try to add more elements than defined size of an array, **ArrayIndexOutOfBoundsException** exception will be thrown.

* Create an array based on objects

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        System.out.println(airplanes[0].getRegistration());
        System.out.println(airplanes[1].getRegistration());

        System.out.println("Finished: " + programName);
    }
}
```

> Java will define the size of an array based on the objects in the constructor

#### Introduction to "for" loop

* Change the invocation of System.out.println on each object to be invoked in a **for** loop

```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        Airplane airplane2 = new Airplane("BBB-222");

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println(airplanes[index].getRegistration());
        }

        System.out.println("Finished: " + programName);
    }
}
```
