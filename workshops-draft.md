*By Maciej Gowin & airfake.com, under MIT license*

## Create "Airfake" project

* Defined the project name, ie. "airfake"

* Create a package: com.airfake

* Preview previously generated class: Main

## Create startup output

* In the Main class create System.out invocations

**File:** *com/airfake/Main.java*
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Started: Airplane management");
        System.out.println("Finished: Airplane management");
    }
}
```

* Replace the inline string with a String variable and utilize a string concatenation

**File:** *com/airfake/Main.java*
```java
package com.airfake;

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);
        System.out.println("Finished: " + programName);
    }
}
```

## Introduce an Airplane class

* Create an Airplane class 

**File:** *com/airfake/Airplane.java*
```java
package com.airfake;

public class Airplane {
    public String registration;
}
```

* Create an instance of newly created class in the Main class

**File:** *com/airfake/Main.java*
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

**File:** *com/airfake/Main.java*
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

* Create a getter and a setter for the registration field and make it **private**

**File:** *com/airfake/Airplane.java*
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

**File:** *com/airfake/Main.java*
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

> The **registration** field of the **Airplane** is **public** which means that it can be accessed from anywhere.
> Java defines 4 access modifiers: **public**, **package**, **protected** and **private**.

* Create new constructor which takes the registration as a parameter

**File:** *com/airfake/Airplane.java*
```java
    (...)

    public Airplane(String newRegistration) {
        registration = newRegistration;
    }
    
    (...)
```

> Constructors define the way a class is instantiated. If a constructor is not defined, default one will be generated automatically.

**File:** *com/airfake/Main.java*
```java
(...)

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

> Once the custom constructor is defined the default constructor is disabled automatically. If you want to keep the default constructor you have to define it implicitly.

* Override the registration with a "setter" method

**File:** *com/airfake/Main.java*
```java
(...)

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

* Remove the "setter" method invocation

**File:** *com/airfake/Main.java*
```java
(...)

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

## Introduce an array

* Create second airplane

**File:** *com/airfake/Main.java*
```java
(...)

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

* Define a Java array of airplanes with predefined size

**File:** *com/airfake/Main.java*
```java
(...)

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

> If you try to add more elements than the defined size of the array, **ArrayIndexOutOfBoundsException** exception will be thrown.

* Create an array based on objects

**File:** *com/airfake/Main.java*
```java
(...)

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

> Java will define the size of an array based on the objects in the constructor.

## Introduce a "for" loop

* Change the invocation of System.out.println on each object to be invoked in a **for** loop

**File:** *com/airfake/Main.java*
```java
(...)

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

## Introduce new primitive types

* Add Airplane length, height and engine quantity fields

**File:** *com/airfake/Airplane.java*
```java
(...)

public class Airplane {
    private String registration;
    private double length;
    private double height;
    private int engineQuantity;

    public Airplane(String newRegistration) {
        registration = newRegistration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String newRegistration) {
        registration = newRegistration;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double newLength) {
        length = newLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double newHeight) {
        height = newHeight;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }
}
```

* Set new properties on Airplane instances and override console output

**File:** *com/airfake/Main.java*
```java
(...)
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new Airplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println("Airplane: " + airplanes[index].getRegistration() + ": " + airplanes[index].getHeight()
                    + ": " + airplanes[index].getLength() + ": " + airplanes[index].getEngineQuantity());
        }

        System.out.println("Finished: " + programName);
    }
}
```

> Java defaults non-initialised primitives to: **0** for int, **0.0** for double. As mentioned before all non-initialized object fields are set to **null**.

> Each primitive has corresponding, built-in Java class defined (ie. Integer for int, Double for double etc.). The conversion between a primitive and a wrapper is done automatically.

* Introduce describe method which returns a string description of the airplane

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public String describe() {
        return "[registration: " + registration + ", height: " + height + ", length: " + length
                + ", engineQuantity: " + engineQuantity + "]";
    }
    
    (...)
```

**File:** *com/airfake/Main.java*
```java
(...)

public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new Airplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new Airplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.println("Airplane: " + airplanes[index].describe());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Change the describe method body to use a Java StringBuilder

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    import java.util.StringBuilder;
    
    (...)
    
    public String describe() {
        StringBuilder builder = new StringBuilder();
        builder
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engineQuantity: ").append(engineQuantity)
                .append("]");
        return builder.toString();
    }
    
    (...)
```

> StringBuilder is one of the built-in utility classes. It has to be imported before it is used.

* Remove a variable assignment

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engineQuantity: ").append(engineQuantity)
                .append("]")
                .toString();
    }
    
    (...)
```

* Add a check if an airplane is a small sized plane

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public boolean isSmallSize() {
        double area = length * height;
        if (area < 30.0d) {
            return true;
        } else {
            return false;
        }
    }
    
    (...)
```

> The condition if/else/then is one of the most important block statement in every programming language.

* Add a check if an airplane is a medium sized plane

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public boolean isMediumSize() {
        double area = length * height;
        if (area >= 30.0d && area < 100.0d) {
            return true;
        } else {
            return false;
        }
    }
    
    (...)
```

* Add a check if an airplane is a large sized plane

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public boolean isLargeSize() {
        double area = length * height;
        if (area >= 100.0d) {
            return true;
        } else {
            return false;
        }
    }
    
    (...)
```

* Create a reusable area calculation method

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public double getArea() {
        return length * height;
    }

    public boolean isSmallSize() {
        double area = getArea();
        if (area < 30.0d) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (area >= 30.0d && area < 100.0d) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        double area = getArea();
        if (area >= 100.0d) {
            return true;
        } else {
            return false;
        }
    }
    
    (...)
```

* Extract the area constraints

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;
    
    (...)

    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (area >= SMALL_AREA_LIMIT && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        double area = getArea();
        if (area >= MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }
    
    (...)
```

> "&&" (AND) is an example of logical operator in Java. Another well know logical operators is "||" (OR).

* Examine the airplane size

**File:** *com/airfake/Main.java*
```java
        (...)
        
        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }
        
        (...)
```

* Update the size calculations for code reuse

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public boolean isSmallSize() {
        double area = getArea();
        if (area < SMALL_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isMediumSize() {
        double area = getArea();
        if (!isSmallSize() && area < MEDIUM_AREA_LIMIT) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLargeSize() {
        return !isSmallSize() && !isMediumSize();
    }
    
    (...)
```

> "!" is an unary operator. It works on boolean values by negating the value of the variable. In the other words
> it changes the value from **true** to **false** and **false** to **true**.

## Introduce different types of airplanes

* Add a default constructor with no arguments and update existing one

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public Airplane() {
    }

    public Airplane(String registration) {
        this.registration = registration;
    }
    
    (...)
```

> **this** keyword provides the reference to the current instance.

* Add passenger and cargo airplanes

**File:** *com/airfake/PassengerAirplane.java*
```java
package com.airfake;

public class PassengerAirplane extends Airplane {
    private int passengerCapacity;

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
}
```

**File:** *com/airfake/CargoAirplane.java*
```java
package com.airfake;

public class CargoAirplane extends Airplane {
    private double cargoCapacity;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        CargoAirplane cargoAirplane = new CargoAirplane();
        PassengerAirplane passengerAirplane = new PassengerAirplane();

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
        
        (...)
```

* Change the airplane variables assignment

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airplane cargoAirplane = new CargoAirplane();
        Airplane passengerAirplane = new PassengerAirplane();

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
        
        (...)
```

> In Java you can assign subclass instance to the parent object reference variable. Keep in mind that it will restrict
> the available methods to the one defined in the parent class.

* Add Airplane subclasses constructors which support registration numbers

**File:** *com/airfake/PassengerAirplane.java*
```java
    (...)
    
    public PassengerAirplane() {
    }
    
    public PassengerAirplane(String registration) {
        super(registration);
    }

    (...)
}
```

**File:** *com/airfake/CargoAirplane.java*
```java
    (...)

    public CargoAirplane() {
    }

    public CargoAirplane(String registration) {
        super(registration);
    }

    (...)
}
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airplane cargoAirplane = new CargoAirplane("CCC-333");
        Airplane passengerAirplane = new PassengerAirplane("DDD-444");

        System.out.printf("Airplane: %s\n", cargoAirplane.describe());
        System.out.printf("Airplane: %s\n", passengerAirplane.describe());
        
        (...)
```

* Remove Airplane default constructors

**File:** *com/airfake/Airplane.java*
```java
    (...)

    private String registration;
    private double length;
    private double height;
    private int engineQuantity;

    public Airplane(String registration) {
        this.registration = registration;
    }

    (...)
}
```

**File:** *com/airfake/PassengerAirplane.java*
```java
    (...)
    
    private int passengerCapacity;

    public PassengerAirplane(String registration) {
        super(registration);
    }

    (...)
}
```

**File:** *com/airfake/CargoAirplane.java*
```java
    (...)
    
    private double cargoCapacity;

    public CargoAirplane(String registration) {
        super(registration);
    }

    (...)
}
```

* Redefine the array of airplanes

**File:** *com/airfake/Main.java*
```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineQuantity(2);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2, airplane3, airplane4 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Redefine the describe method for passenger and cargo airplanes

**File:** *com/airfake/PassengerAirplane.java*
```java
    (...)
    
    @Override
    public String describe() {
        return "[PassengerAirplane]";
    }
    
    (...)
```

**File:** *com/airfake/CargoAirplane.java*
```java
    (...)
    
    @Override
    public String describe() {
        return "[CargoAirplane]";
    }
    
    (...)
```

* Reuse parent class airplane descriptions

**File:** *com/airfake/PassengerAirplane.java*
```java
    (...)

    @Override
    public String describe() {
        return "[PassengerAirplane]" + super.describe();
    }
    
    (...)
```

**File:** *com/airfake/CargoAirplane.java*
```java
    (...)

    @Override
    public String describe() {
        return "[CargoAirplane]" + super.describe();
    }
    
    (...)
```

* Block the ability to create an instance of Airplane class

**File:** *com/airfake/Airplane.java*
```java
public abstract class Airplane {
    (...)
}
```

> An abstract class can't be instantiated.

## Introduce the airplane engine type

**File:** *com/airfake/Airplane.java*
```java
public abstract class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private String engineType;
    private int engineQuantity;

    (...)

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    
    (...)
    
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType)
                .append("]")
                .toString();
    }
}
```

**File:** *com/airfake/Main.java*
```java
public class Main {
    public static void main(String[] args) {
        String programName = "Airplane management";
        System.out.println("Started: " + programName);

        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineType("Jet");
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineType("Turboprop");
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineType("Jet");
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineType("Turboprop");
        airplane4.setEngineQuantity(2);

        Airplane[] airplanes = new Airplane[] { airplane1, airplane2, airplane3, airplane4 };

        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s, Airplane size: [small: %b, medium: %b, large: %b]\n",
                    airplanes[index].describe(), airplanes[index].isSmallSize(), airplanes[index].isMediumSize(),
                    airplanes[index].isLargeSize());
        }

        System.out.println("Finished: " + programName);
    }
}
```

* Introduce an enumeration for the engine type

**File:** *com/airfake/EngineType.java*
```java
package com.airfake;

public enum EngineType {
    JET, TURBOPROP;
}
```

**File:** *com/airfake/Airplane.java*
```java
public abstract class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private EngineType engineType;
    private int engineQuantity;

    (...)
    
    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    (...)

    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType)
                .append("]")
                .toString();
    }
}
```

**File:** *com/airfake/Main.java*
```java
        Airplane airplane1 = new CargoAirplane("AAA-111");
        airplane1.setHeight(4.15d);
        airplane1.setLength(17.51d);
        airplane1.setEngineType(EngineType.JET);
        airplane1.setEngineQuantity(2);

        Airplane airplane2 = new PassengerAirplane("BBB-222");
        airplane2.setHeight(2.75d);
        airplane2.setLength(8.11d);
        airplane2.setEngineType(EngineType.TURBOPROP);
        airplane2.setEngineQuantity(1);

        Airplane airplane3 = new CargoAirplane("CCC-333");
        airplane3.setHeight(7.23d);
        airplane3.setLength(15.81d);
        airplane3.setEngineType(EngineType.JET);
        airplane3.setEngineQuantity(3);

        Airplane airplane4 = new PassengerAirplane("DDD-444");
        airplane4.setHeight(5.73d);
        airplane4.setLength(9.99d);
        airplane4.setEngineType(EngineType.TURBOPROP);
        airplane4.setEngineQuantity(2);
```

* Add an engine description

**File:** *com/airfake/EngineType.java*
```java
public enum EngineType {
    JET("Jet"), TURBOPROP("Turboprop");

    private String description;

    EngineType(String description) {
        this.description = description;
    }

    public String describe() {
        return description;
    }
}
```

**File:** *com/airfake/Airplane.java*
```java
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType.describe())
                .append("]")
                .toString();
    }
```

* Examine the default airplane and engine string conversion

**File:** *com/airfake/Main.java*
```java
        for (int index = 0; index < airplanes.length; index++) {
            System.out.printf("Airplane: %s\n", airplanes[index]);
        }
```


*  Override the default airplane and engine string conversion

**File:** *com/airfake/Airplane.java*
```java
    (...)
    
    public String describe() {
        return new StringBuilder()
                .append("[")
                .append("registration: ").append(registration).append(", ")
                .append("height: ").append(height).append(", ")
                .append("length: ").append(length).append(", ")
                .append("engine: ").append(engineQuantity).append(" x ").append(engineType)
                .append("]")
                .toString();
    }

    @Override
    public String toString() {
        return describe();
    }
    
    (...)
```

**File:** *com/airfake/EngineType.java*
```java
    (...)
    
    @Override
    public String toString() {
        return describe();
    }
    
    (...)
```

> In Java each class is a subclass of Object. The Object class defines few generic functions and "toString()" is the prime example.

## Introduce an airline

* Create an Airline class with a name defined

**File:** *com/airfake/Airline.java*
```java
package com.airfake;

public class Airline {
    private String name;

    public Airline(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

* Let users to add new airplanes to the airline

**File:** *com/airfake/Airline.java*
```java
(...)

public abstract class Airline {
    private String name;
    private ArrayList<Airplane> airplanes;

    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<Airplane>();
    }

    public String getName() {
        return name;
    }
    
    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }
}

(...)
```

* Create airlines with airplanes assigned

**File:** *com/airfake/Main.java*
```java
        (...)

        Airline airline1 = new Airline("Ryanair");
        airline1.addAirplane(airplane1);
        airline1.addAirplane(airplane2);

        Airline airline2 = new Airline("EasyJet");
        airline2.addAirplane(airplane3);
        airline2.addAirplane(airplane4);

        Airline[] airlines = new Airline[] { airline1, airline2 };

        for (int index = 0; index < airlines.length; index++) {
            System.out.printf("Airline: %s\n", airlines[index]);
        }

        (...)
```

* Create airline describe and toString methods similar to the one defined for the Airplane class

**File:** *com/airfake/Main.java*
```java
    (...)
    
    public String describe() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[Airline][name: " + name + "]: ");
        for (Airplane airplane : airplanes) {
            stringBuilder.append(airplane);
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return describe();
    }
    
    (...)
```

* Make sure that airline's airplane list does not contain duplicates

**File:** *com/airfake/Main.java*
```java
        (...)
    
        Airline airline2 = new Airline("EasyJet");
        airline2.addAirplane(airplane3);
        airline2.addAirplane(airplane4);
        airline2.addAirplane(airplane4);
    
        (...)
```

**File:** *com/airfake/Airline.java*
```java
    (...)
    
    public void addAirplane(Airplane airplane) {
        if (!airplanes.contains(airplane)) {
            airplanes.add(airplane);
        }
    }
    
    (...)
```

* Make sure that airplane can't be added to different airlines

**File:** *com/airfake/Main.java*
```java
        (...)
    
        Airline airline2 = new Airline("EasyJet");
        airline2.addAirplane(airplane1);
        airline2.addAirplane(airplane3);
        airline2.addAirplane(airplane4);
        airline2.addAirplane(airplane4);
    
        (...)
```

**File:** *com/airfake/Airline.java*
```java
    (...)
    
    public void addAirplane(Airplane airplane) {
        String airlineName = AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.get(airplane.getRegistration());
        if (airlineName == null || airlineName.equals(name)) {
            if (!airplanes.contains(airplane)) {
                airplanes.add(airplane);
            }
            AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.put(airplane.getRegistration(), name);
        }
    }
    
    (...)
```

* Notify user (with an exception) that already assigned airplane was requested to be registered

**File:** *com/airfake/AirlineException.java*
```java
package com.airfake;

public class AirlineException extends RuntimeException {
    public AirlineException(final String message) {
        super(message);
    }
}
```

**File:** *com/airfake/Airline.java*
```java
    (...)
    
    public void addAirplane(Airplane airplane) {
        String airlineName = AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.get(airplane.getRegistration());
        if (airlineName == null || airlineName.equals(name)) {
            if (!airplanes.contains(airplane)) {
                airplanes.add(airplane);
            }
            AIRLINE_NAME_PER_AIRPLANE_REGISTRATION.put(airplane.getRegistration(), name);
        } else {
            throw new AirlineException("Airplane already registered: " + airlineName);
        }
    }
    
    (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airline airline2 = new Airline("EasyJet");
        // Throws exception - airplane already registered
        // airline2.addAirplane(airplane1); 
        airline2.addAirplane(airplane3);
        airline2.addAirplane(airplane4);
        airline2.addAirplane(airplane4);
    
        (...)
```



## Introduce a flight

* Create a Flight class which is defined as Airline inner class

**File:** *com/airfake/Airline.java*
```java
    (...)

    public class Flight {
        private String number;

        private Flight(final String number) {
            this.number = number;
        }
    }

    (...)
```

*  Let client create an flight for given flight number

**File:** *com/airfake/Airline.java*
```java
    (...)
    
    public Flight scheduleFlight(final String flightNumber) {
        return new Flight(flightNumber);
    }
    
    (...)
    
    public class Flight {
        private String number;

        private Flight(final String number) {
            this.number = number;
            System.out.printf("[Flight][airlineName: %s, number: %s]\n", Airline.this.getName(), number);
        }
    }
    
    (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)

        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111");

        (...)
```

* Add take off and land a plane methods with tracking information about the current flight state

**File:** *com/airfake/Airline.java*
```java
    (...)
    
    public class Flight {
        private String number;
        private FlightState state;

        private Flight(final String number) {
            this.number = number;
            this.state = FlightState.SCHEDULED;
            trackState();
        }

        public void takeOff() {
            this.state = FlightState.IN_THE_AIR;
            trackState();
        }

        public void land() {
            this.state = FlightState.LANDED;
            trackState();
        }

        private void trackState() {
            System.out.printf("[Flight][airlineName: %s, number: %s, state: %s]\n", Airline.this.getName(), number, state);
        }
    }

    public enum FlightState {
        SCHEDULED, IN_THE_AIR, LANDED;
    }
    
    (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
   
        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111");

        airline1Flight1.land();
        airline1Flight1.takeOff();
        airline1Flight1.takeOff();
        airline1Flight1.land();
        airline1Flight1.takeOff();
        airline1Flight1.land();

        airline2Flight1.takeOff();
        airline2Flight1.land();
        
        (...)
```

* Block the improper flight state change, allow state change: from SCHEDULED to IN_THE_AIR and from IN_THE_AIR to LANDED

**File:** *com/airfake/Airline.java*
```java
        (...)

        public void takeOff() {
            if (state == FlightState.SCHEDULED) {
                state = FlightState.IN_THE_AIR;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.IN_THE_AIR);
            }
        }

        public void land() {
            if (state == FlightState.IN_THE_AIR) {
                state = FlightState.LANDED;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.LANDED);
            }
        }

        (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111");

        // Throws exception - wrong state change
        // airline1Flight1.land();
        airline1Flight1.takeOff();
        // Throws exception - wrong state change
        // airline1Flight1.takeOff();
        airline1Flight1.land();
        // Throws exception - wrong state change
        // airline1Flight1.takeOff();
        // Throws exception - wrong state change
        // airline1Flight1.land();

        airline2Flight1.takeOff();
        airline2Flight1.land();
        
        (...)
```

* Do not let client to schedule a flight with an empty number


**File:** *com/airfake/Airline.java*
```java
    (...)

    public Flight scheduleFlight(final String flightNumber, final String airplaneRegistration) {
        if (flightNumber == null || flightNumber.equals("")) {
            throw new AirlineException("Flight number cannot be empty");
        }
        
        return new Flight(flightNumber, airplane);
    }
   
    (...)
```

* Defined the flight airplane

**File:** *com/airfake/Airline.java*
```java
    (...)

    public Flight scheduleFlight(final String flightNumber, final String airplaneRegistration) {
        if (flightNumber == null || flightNumber.equals("")) {
            throw new AirlineException("Flight number cannot be empty");
        }
        
        Airplane airplane = getAirplane(airplaneRegistration);
        if (airplane == null) {
            throw new AirlineException("Airplane doesn't exist: " + airplaneRegistration);
        }

        return new Flight(flightNumber, airplane);
    }

    public Airplane getAirplane(final String airplaneRegistration) {
        if (airplaneRegistration != null && !airplaneRegistration.equals("")) {
            for (Airplane airplane : airplanes) {
                if (airplaneRegistration.equals(airplane.getRegistration())) {
                    return airplane;
                }
            }
        }
        return null;
    }
   
    (...)
   
    public class Flight {
        private String number;
        private FlightState state;
        private Airplane airplane;

        private Flight(final String number, final Airplane airplane) {
            this.number = number;
            this.state = FlightState.SCHEDULED;
            this.airplane = airplane;
            trackState();
        }

        public void takeOff() {
            if (state == FlightState.SCHEDULED) {
                state = FlightState.IN_THE_AIR;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.IN_THE_AIR);
            }
        }

        public void land() {
            if (state == FlightState.IN_THE_AIR) {
                state = FlightState.LANDED;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.LANDED);
            }
        }

        private void trackState() {
            System.out.printf("[Flight][airlineName: %s, number: %s, state: %s, airplaneRegistration: %s]\n", Airline.this.getName(), number, state, airplane.getRegistration());
        }
    }
   
    (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111", "AAA-111");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111", "DDD-444");
        // Throws exception - airplane doesn't exist
        // Airline.Flight airline2Flight2 = airline2.scheduleFlight("EJ-1111", "AAA-111");
        
        (...)
```

* Optymize an empty value check by extracting a common method to the utility class

**File:** *com/airfake/StringUtils.java*
```java
package com.airfake;

public class StringUtils {
    public static boolean isEmpty(String value) {
        return value == null || value.equals("");
    }
}
```

**File:** *com/airfake/Airline.java*
```java
    (...)

    public Flight scheduleFlight(final String flightNumber, final String airplaneRegistration) {
        if (StringUtils.isEmpty(flightNumber)) {
            throw new AirlineException("Flight number cannot be empty");
        }

        Airplane airplane = getAirplane(airplaneRegistration);
        if (airplane == null) {
            throw new AirlineException("Airplane doesn't exist: " + airplaneRegistration);
        }

        return new Flight(flightNumber, airplane);
    }

    public Airplane getAirplane(final String airplaneRegistration) {
        if (!StringUtils.isEmpty(airplaneRegistration)) {
            for (Airplane airplane : airplanes) {
                if (airplaneRegistration.equals(airplane.getRegistration())) {
                    return airplane;
                }
            }
        }
        return null;
    }
   
    (...)
```

* Do not let client to add two flights with the same number

**File:** *com/airfake/Airline.java*
```java
    (...)

    private String name;
    private ArrayList<Airplane> airplanes;
    private ArrayList<Flight> flights;

    public Airline(String name) {
        this.name = name;
        this.airplanes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    (...)
    
    public Flight scheduleFlight(final String flightNumber, final String airplaneRegistration) {
        if (StringUtils.isEmpty(flightNumber)) {
            throw new AirlineException("Flight number cannot be empty");
        }

        Airplane airplane = getAirplane(airplaneRegistration);
        if (airplane == null) {
            throw new AirlineException("Airplane doesn't exist: " + airplaneRegistration);
        }

        Flight flight = getFlight(flightNumber);
        if (flight != null) {
            throw new AirlineException("Flight number already exists: " + flightNumber);
        }

        Flight newFlight = new Flight(flightNumber, airplane);
        flights.add(newFlight);
        return newFlight;
    }
    
    (...)
    
    public Flight getFlight(final String flightNumber) {
        if (!StringUtils.isEmpty(flightNumber)) {
            for (Flight flight : flights) {
                if (flightNumber.equals(flight.getNumber())) {
                    return flight;
                }
            }
        }
        return null;
    }
    
    (...)
    
    public class Flight {
        private String number;
        private FlightState state;
        private Airplane airplane;

        private Flight(final String number, final Airplane airplane) {
            this.number = number;
            this.state = FlightState.SCHEDULED;
            this.airplane = airplane;
            trackState();
        }

        public String getNumber() {
            return number;
        }

    (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
    
        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111", "AAA-111");
        // Throws exception - flight number already exists
        // Airline.Flight airline1Flight2 = airline1.scheduleFlight("FR-1111", "BBB-222");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111", "DDD-444");
        // Throws exception - airplane doesn't exist
        // Airline.Flight airline2Flight2 = airline2.scheduleFlight("EJ-1111", "AAA-111");
    
        (...)
```

* Do not allow a plane to take off if it's already in the air (valid for airplanes assigned to two different flights)

**File:** *com/airfake/Airline.java*
```java
        (...)

        public void takeOff() {
            for (Flight flight : flights) {
                if (flight.state == FlightState.IN_THE_AIR
                        && flight.airplane.getRegistration().equals(airplane.getRegistration())) {
                    throw new AirlineException("Airplane is currently in the air");
                }
            }

            if (state == FlightState.SCHEDULED) {
                state = FlightState.IN_THE_AIR;
                trackState();
            } else {
                throw new AirlineException("Cannot change status: " + state + " -> " + FlightState.IN_THE_AIR);
            }
        }
        
        (...)
```

**File:** *com/airfake/Main.java*
```java
        (...)
        
        Airline.Flight airline1Flight1 = airline1.scheduleFlight("FR-1111", "AAA-111");
        // Throws exception - flight number already exists
        // Airline.Flight airline1Flight2 = airline1.scheduleFlight("FR-1111", "BBB-222");
        Airline.Flight airline1Flight3 = airline1.scheduleFlight("FR-1112", "AAA-111");
        Airline.Flight airline2Flight1 = airline2.scheduleFlight("EJ-1111", "DDD-444");
        // Throws exception - airplane doesn't exist
        // Airline.Flight airline2Flight2 = airline2.scheduleFlight("EJ-1111", "AAA-111");

        // Throws exception - wrong state change
        // airline1Flight1.land();
        airline1Flight1.takeOff();
        // Throws exception - wrong state change
        // airline1Flight1.takeOff();
        // Throws exception - airplane in use
        // airline1Flight3.takeOff();
        airline1Flight1.land();
        // Throws exception - wrong state change
        // airline1Flight1.takeOff();
        // Throws exception - wrong state change
        // airline1Flight1.land();

        airline2Flight1.takeOff();
        airline2Flight1.land();
        
        (...)
```
