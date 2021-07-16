package com.senlatest.task3;

    public class Vector {
        private double x = 0;
        private double y = 0;
        Vector(double a, double b) {
            x = a;
            y = b;
        }
        private Vector() {
        }
        Vector vectorSum(Vector a, Vector b) {
            Vector c = new Vector();
            c.x = a.x + b.x;
            c.y = a.y + b.y;
            return c;
        }
        double scalMult(Vector a, Vector b) {
            return (a.x * b.x + a.y * b.y);
        }
        void getVector() {
            System.out.println("Координаты вектора:\nx = " + this.x +
                    "\ny = " + this.y);
        }
    }


