package org.example;

public class MaxTextABC<T, I> {
    protected T text;
    protected I count;

    public T getText() {
        return text;
    }

    public void setText(T text) {
        this.text = text;
    }

    public I getCount() {
        return count;
    }

    public void setCount(I count) {
        this.count = count;
    }
}