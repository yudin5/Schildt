package Chapter_13;

// A generic, fixed-size queue class.
class GenQueue<T> implements IGenQ<T> {
    private T q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty queue with the given array.
    public GenQueue(T[] aRef) {
        q = aRef;
        putloc = getloc = 0;
    }

    // Put an item into the queue.
    public void put(T obj)
            throws QueueFullException {

        if(putloc==q.length-1)
            throw new QueueFullException(q.length-1);

        putloc++;
        q[putloc] = obj;
    }

    // Get a character from the queue.
    public T get()
            throws QueueEmptyException {

        if(getloc == putloc)
            throw new QueueEmptyException();

        getloc++;
        return q[getloc];
    }
}
