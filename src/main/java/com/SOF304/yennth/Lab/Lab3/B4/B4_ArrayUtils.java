package com.SOF304.yennth.Lab.Lab3.B4;

import com.SOF304.yennth.Lab.Lab3.B5.entity.IndexOutOfRangeException;

public class B4_ArrayUtils {
    public static int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfRangeException("Index is out of range");
        }
        return array[index];
    }
}
