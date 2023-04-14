package com.cherry.DataStructures.StackAndQueue;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // This takes care of it being full.
        if (this.isFull()) {
            // Double the array size.
            int[] temp = new int[data.length * 2];

            // Copy all previous items in the new array.
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }

        return super.insert(item);
    }
}
