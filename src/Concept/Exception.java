package Concept;

import java.io.Closeable;
import java.io.IOException;

public class Exception {
	public static void main(String[] args) {

	}
}

class MyRuntimeException1 extends RuntimeException {
}

class MyRuntimeException2 extends RuntimeException {
}

class MyCloseable implements Closeable {
	public void close() throws IOException {
		if (true) {
			throw new MyRuntimeException1();
		}
	}
}
