
public class ArrayQueue {
	private String[] queueArray;
	private int size;
	private int front;
	private int back;

	public ArrayQueue(){
		queueArray = new String[100];
		size = 0;
		front = 0;
		back = -1;
	}

	public ArrayQueue(int startSize){
		queueArray = new String[startSize];
		size = 0;
		front = 0;
		back = -1;
	}
	/**
	 * @function returns the number of elements in the queue
	 * @return size
	 */
	public int getSize(){
		return size;
	}
	/**
	 * @function adds a string to the end of the queue
	 * @param toEnqueue: the input to be inserted
	 */
	public void enqueue(String toEnqueue){
		//TODO implement enqueue
			if(size == queueArray.length){
				throw new IllegalStateException("Queue is full");
			}
			array[back] = toEnqueue;
			back = (back+1) % queueArray.length;
			size++;
	}


	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue(){
		//TODO implement dequeue
		if(size == 0){
			throw new NoElementException("Cannot remove from epty array");
		}
		String toDequeue = queueArray[front];
		queueArray[front] = null;
		front = (front+1)%queueArray.length;
		sizee--;
		return toDequeue;
	}

	/**
	 *
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		//TODO implement isEmpty
		if(size!=0){
			return false;
		}
		return true;
	}

	/**
	 *
	 * @return returns true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		//TODO implement isFull
		if(size == queueArray.length){
			return true;
		}
		return false;
	}

}
