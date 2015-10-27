package com.coderbrother;

public abstract class Airplane {
    private static final double SMALL_AREA_LIMIT = 30.0d;
    private static final double MEDIUM_AREA_LIMIT = 100.0d;

    private String registration;
    private double length;
    private double height;
    private EngineType engineType;
    private int engineQuantity;

    public Airplane(String registration) {
        this.registration = registration;
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

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public void setEngineQuantity(int newEngineQuantity) {
        engineQuantity = newEngineQuantity;
    }

    public double getArea() {
        return length * height;
    }

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
}
