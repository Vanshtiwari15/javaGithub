package com.company;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius; // This is constructor and this is the solution of Problem 3
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.radius = height;
    }

    // Problem 2
    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
    class NewRectangle {
        private int length;
        private int breadth;

        public NewRectangle() {
            this.length = 4;
            this.breadth = 5;
        }

        public NewRectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
    }

        class Sphere {
            private int radius;
            private int height;
            private float PI;

            public Sphere(int radius, int height) {
                this.radius = radius; // This is for constructors
                this.height = height;
                this.PI = PI;
            }

            public int getRadius() {
                return radius;
            }

            public void setRadius(int radius) {
                this.radius = radius;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.radius = height;
            }

            public float getPi(){
                return PI;
            }

            public void setPi(){
                this.PI = PI;
            }

            public double surfaceArea() {
                return 4*Math.PI*radius*radius;
            }

            public double volume() {
                return Math.PI*radius*radius;
            }

    }

public class CWH_44_CH9_PS {
    public CWH_44_CH9_PS() {
    }

    public static void main(String[] args) {
        // Problem 1
        /* Cylinder myCylinder = new Cylinder(9, 12); // Upper we declared constructor this means we do not use MyCylinder.setHeight(12); we simple gives parameters to the function like 9, 12 after declared constructor and this is also the answer of Problem 3
        // MyCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        // MyCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());*/

        // Problem 4
        /*NewRectangle nr = new NewRectangle(12, 56);
        System.out.println(nr.getLength());
        System.out.println(nr.getBreadth());*/

        // Problem 5
        Sphere s = new Sphere(2, 2);
        System.out.println(s.getHeight());
        System.out.println(s.getRadius());
        System.out.println(s.getPi());
        System.out.println(s.surfaceArea());
        System.out.println(s.volume());





    }
}
