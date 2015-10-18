/*
 * Copyright 2014 HERE Inc. All rights reserved.
 *
 *     This software is the confidential and proprietary information of HERE Inc.
 *     You shall not disclose such confidential information and shall use it only in
 *     accordance with the terms of the license agreement you entered into with
 *     HERE Inc.
 */


import java.util.Arrays;

/**
 * @author Daniel Gordon <daniel.gordon@here.com>
 */
public class CombineList {
    public static void main( String args[]) {
        char [] list1 = {'1','2','3'};
        char [] list2 = {'a','b','c'};
        System.out.println("combined list: " + Arrays.toString(combine(list1, list2)));
    }

    public static char [] combine (char [] list1, char [] list2) {
        char [] combinedList = new char[list1.length + list2.length];
        //what if one list is larger than the other?
        int smallListSize = list1.length < list2.length? list1.length : list2.length;
        int j = 0;
        for (int i = 0; i < smallListSize; i++) {
            combinedList[j] = list1[i];
            combinedList[j+1] = list2[i];
            j+=2;
        }

        return combinedList;
    }
}
