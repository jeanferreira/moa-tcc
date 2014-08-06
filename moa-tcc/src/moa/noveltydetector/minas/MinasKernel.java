package moa.noveltydetector.minas;


import weka.core.Instance;
import moa.cluster.CFCluster;

public class MinasKernel extends CFCluster {
	
	private static final long serialVersionUID = 1L;
	private String labelClass;	  // label of the class associated to the micro-cluster. If it is a novelty the class is a sequential number
    private String category;  	  // category: normal, novelty or extension
    private int time;		      // timestamp associated to the last example classified in this micro-cluster
    
    
    //gets and sets
	public String getLabelClass() {
		return labelClass;
	}


	public void setLabelClass(String labelClass) {
		this.labelClass = labelClass;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}

	

	public MinasKernel(CFCluster cluster) {
		super(cluster);
		// TODO Auto-generated constructor stub
	}


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
