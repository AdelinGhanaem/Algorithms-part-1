package com.algone.datatypes;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class LinkedListStackTest extends StackTest<String> {
    @Override
    Stack<String> create() {
        return new LinkedListsStack<String>();
    }

    @Override
    String randomItem() {
        return new BigInteger(130, new SecureRandom()).toString(32);
    }

    @Override
    void init() {

    }




}
