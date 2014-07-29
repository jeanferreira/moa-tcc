package moa.noveltydetector.minas;

import weka.core.Instance;
import moa.cluster.Clustering;
import moa.clusterers.Clusterer;
import moa.core.InstancesHeader;
import moa.core.Measurement;
import moa.core.ObjectRepository;
import moa.gui.AWTRenderer;
import moa.noveltydetector.AbstractNoveltyDetector;
import moa.tasks.TaskMonitor;

public class Minas extends AbstractNoveltyDetector {

	@Override
	public void setModelContext(InstancesHeader ih) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public InstancesHeader getModelContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRandomizable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRandomSeed(int s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean trainingHasStarted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double trainingWeightSeenByModel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetLearning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trainOnInstance(Instance inst) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double[] getVotesForInstance(Instance inst) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Measurement[] getModelMeasurements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clusterer[] getSubClusterers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Clustering getClusteringResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean implementsMicroClusterer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Clustering getMicroClusteringResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean keepClassLabel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getDescription(StringBuilder sb, int indent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AWTRenderer getAWTRenderer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void trainOnInstanceImpl(Instance inst) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void prepareForUseImpl(TaskMonitor monitor,
			ObjectRepository repository) {
		// TODO Auto-generated method stub
		
	}
	
	

}
