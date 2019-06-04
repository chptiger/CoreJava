package terminology.immutable_thread_safe;

public final class Immutable {
	final int x;
	final int y;

	public Immutable(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// Setters
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
}

//class Sharable {
//	private static Immutable obj;
//
//	public static Immutable getImmutableObject()
//    {
//        if (obj == null) 
//        {
//            synchronized(this)
//            {
//                if(obj == null)
//                {
//                    obj = new Immutable(20,30); 
//                }
//            }
//        }
//        return obj; 
//    }
//}