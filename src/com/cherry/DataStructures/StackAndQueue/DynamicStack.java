package com.cherry.DataStructures.StackAndQueue;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();  // It will call CustomStack.
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // Double the size of the array.
            int[] temp = new int[data.length * 2];

            // Copy all the previous items in the new data;
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // At this point we know that the array is not full.
        // Insert item.
        return super.push(item);
    }
}
