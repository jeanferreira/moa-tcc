package moa.noveltydetector.minas;

import weka.core.Instance;
import moa.cluster.CFCluster;

public class MinasKernel extends CFCluster {

	public MinasKernel(CFCluster cluster) {
		super(cluster);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public CFCluster getCF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getInclusionProbability(Instance instance) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

}
