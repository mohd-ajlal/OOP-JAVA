package com.mohdajlal;

public class encapsulationJava {

    static class employee{
        private int emp_id;  // data hiding
        public void setEmp_id(int emp_id1){ //setter
            emp_id = emp_id1;
        }

        public int getEmp_id(){ // getter
            return emp_id;
        }
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.setEmp_id(202);
        System.out.println(e.getEmp_id());

    }
}
