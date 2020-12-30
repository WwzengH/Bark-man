package com.example.superman.interfaces;

public interface Callback<T> {

    void success(T data);

    void fail(String err);

}
