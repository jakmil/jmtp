/*
 * Copyright 2007 Pieter De Rycke
 * 
 * This file is part of JMTP.
 * 
 * JTMP is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of 
 * the License, or any later version.
 * 
 * JMTP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU LesserGeneral Public 
 * License along with JMTP. If not, see <http://www.gnu.org/licenses/>.
 */

package be.derycke.pieter.com;

import java.util.Arrays;

/**
 * http://en.wikipedia.org/wiki/Globally_Unique_Identifier
 * @author Pieter De Rycke
 */
public class Guid {
    
    private long data1;
    private int data2;
    private int data3;
    private short[] data4;
    
    public Guid(long data1, int data2, int data3, short[] data4) {
        if(data4.length != 8)
            throw new IllegalArgumentException();
        
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }
    
    public long getData1() {
        return data1;
    }
    
    public int getData2() {
        return data2;
    }
    
    public int getData3() {
        return data3;
    }
    
    public short[] getData4() {
        return data4;
    }
    
    private String toBinaryString(int number) {
        String temp = Integer.toHexString(number);
        int length = temp.length();
        for(int i = 0; i < 4 - length; i++)
            temp += "0" + temp; //$NON-NLS-1$
        return temp;
    }
    
    private String toBinaryString(short number) {
        String buffer = Integer.toHexString(((Short)number).intValue());
        int length = buffer.length();
        if(length != 2)
            buffer = "0" + buffer; //$NON-NLS-1$
        return buffer;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o instanceof Guid) {
            Guid guid = (Guid)o;
            boolean data4Equal = true;
            for(int i = 0; i < data4.length; i++)
                if(guid.data4[i] != this.data4[i]) {
                    data4Equal = false;
                    break;
                }
            
            return guid.data1 == this.data1 && guid.data2 == this.data2 && guid.data3 == this.data3 && data4Equal;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.data1 ^ (this.data1 >>> 32));
        hash = 97 * hash + this.data2;
        hash = 97 * hash + this.data3;
        hash = 97 * hash + (this.data4 != null ? Arrays.hashCode(this.data4) : 0);
        return hash;
    }
    
    @Override
    public String toString() {
        String guid = ""; //$NON-NLS-1$
        
        String partGuid = Long.toHexString(data1);
        int length = partGuid.length();
        for(int i = 0; i < 8 - length; i++)
            partGuid += "0" + partGuid; //$NON-NLS-1$
        guid += partGuid + "-"; //$NON-NLS-1$
        
        guid += toBinaryString(data2) + "-"; //$NON-NLS-1$
        
        guid += toBinaryString(data3) + "-"; //$NON-NLS-1$
        
        guid += toBinaryString(data4[0]) + toBinaryString(data4[1]) + "-"; //$NON-NLS-1$
        
        guid += toBinaryString(data4[2]) + toBinaryString(data4[3]) + toBinaryString(data4[4])
                + toBinaryString(data4[5]) + toBinaryString(data4[6]) + toBinaryString(data4[7]);
        
        return guid;
    }
}
