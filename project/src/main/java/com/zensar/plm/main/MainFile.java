package com.zensar.plm.main;

import java.util.Scanner;

import com.zensar.plm.bean.Sample;
import com.zensar.plm.dao.SampleClass;

/**
 * MainFile
 */
public class MainFile {

    public static void main(String[] args) {
        SampleClass sClass = new SampleClass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id & name:");
        Sample sample = new Sample(sc.nextInt(), sc.next());

        if (sClass.insert(sample)) {
            System.out.println("Inserted");
        } else
            System.out.println("Not inserted");
    }
}