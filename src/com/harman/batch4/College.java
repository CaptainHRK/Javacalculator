package com.harman.batch4;

abstract class College {

    abstract void setAcademicfees();

}
class ME_Dept extends College{
    void setAcademicfees(){
        System.out.println("75000");
    }
}

class CSE_Dept extends College{
    void setAcademicfees(){
        System.out.println("100000");
    }
}

class CSE_ME extends College{
    void setAcademicfees(){
        System.out.println("75000");
    }
}

class Collegeoffice{

    public static void main(String[] args) {
        College ob_cse=new CSE_Dept();
        College ob_me=new ME_Dept();
        System.out.println("CSE Dept fees");
        ob_cse.setAcademicfees();
        System.out.println("ME Dept fees");
        ob_me.setAcademicfees();
    }
}