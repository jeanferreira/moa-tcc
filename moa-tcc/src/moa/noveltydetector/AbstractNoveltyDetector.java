package moa.noveltydetector;

import weka.core.Instance;

public abstract class AbstractNoveltyDetector {

	
	public abstract void trainOnInstanceImpl(Instance inst);
	
	//public abstract trainOnffline();
}
