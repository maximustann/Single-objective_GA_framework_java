/*
 * Boxiong Tan (Maximus Tann)
 * Title:        Single-objective Genetic algorithm framework
 * Description:  Single-objective Genetic algorithm framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * DataCollector.java - An Interface of Data collector.
 */
package dataCollector;

import algorithm.Chromosome;

/**
 * data collector
 * 
 * @author Boxiong Tan (Maximus Tann) 
 * @since GA framework 1.0
 */
public interface DataCollector {
    /**
     * collect result
     * @param object result can be a 2D array or 1D array
     */	
	public void collect(Object result);
	
    /**
     * collect particle
     * @param particle is a 2D array
     */	
	public void collectChromosome(Chromosome[] individual);
}
