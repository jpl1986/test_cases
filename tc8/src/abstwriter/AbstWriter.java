package abstwriter;

import concwriter.ConcWriter;

public abstract class AbstWriter {
	
	public void abstWriter(){
		ConcWriter cw1 = new ConcWriter();
		cw1.sayConcrete();
	}
}
