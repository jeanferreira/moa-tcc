package moa.noveltydetector;

import moa.clusterers.Clusterer;
import moa.options.AbstractOptionHandler;
import weka.core.Instance;

public abstract class AbstractNoveltyDetector extends AbstractOptionHandler
	implements Clusterer{

	
	public abstract void trainOnInstanceImpl(Instance inst);
	

	@Override
	public Clusterer copy() {
		return (Clusterer) super.copy();
	}

	
	//public abstract trainOnffline();
}
