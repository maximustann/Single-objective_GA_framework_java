/*
 * Boxiong Tan (Maximus Tann)
 * Title:        Single-objective GA framework
 * Description:  Single-objective GA framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * TwoParentsCrossover.java - an interface of crossover operator, please implement this interface.
 */
package algorithms;

/**
 * An interface of crossover operator
 * 
 * @author Boxiong Tan (Maximus Tann) 
 * @since GA framework 1.0
 */
public interface TwoParentsCrossover extends Crossover {
    /**
     * 
     * @param mother a selected chromosome
     * @param father a selected chromosome
     * @param crossoverRate the probability of crossover.
     * @return An array of chromosome children
     */	
	public Chromosome[] update(
						Chromosome father,
						Chromosome mother,
						double crossoverRate
						);
}
