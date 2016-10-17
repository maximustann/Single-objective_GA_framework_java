/*
 * Boxiong Tan (Maximus Tann)
 * Title:        Single-objective GA framework
 * Description:  Single-objective GA framework for general optimization purpose
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2016-2019, The Victoria University of Wellington
 * TournamentSelection.java - an implementation of tournament selection.
 */
package commonOperators;

import java.util.ArrayList;

import algorithm.Chromosome;
import algorithm.Selection;
import algorithm.StdRandom;
/**
 * An implementation of tournament selection
 * 
 * @author Boxiong Tan (Maximus Tann) 
 * @since GA framework 1.0
 */
public class TournamentSelection implements Selection{
	private int tournamentSize, optimization;
	
	/**
	 * 
	 * @param tournamentSize size of tournament, larger number makes it harder to select a worse individual 
	 * @param optimization 0 denotes minimize, 1 denotes maximize
	 */
	public TournamentSelection(int tournamentSize, int optimization) {
		this.tournamentSize = tournamentSize;
		this.optimization = optimization;
	}
	@Override
	public int selected(Chromosome[] popVar, ArrayList<double[]> fitness) {
		double[] greatestFit = new double[2];
		ArrayList<double[]> chosen = new ArrayList<double[]>();
		for(int i = 0; i < tournamentSize; i++){
			int r = StdRandom.uniform(fitness.size());
			chosen.add(fitness.get(r));
		}
		
		greatestFit[0] = chosen.get(0)[0];
		for(int i = 1; i < tournamentSize; i++){
			if((greatestFit[0] > chosen.get(i)[0] && optimization == 0) ||
				greatestFit[0] < chosen.get(i)[0] && optimization == 1) {
				greatestFit[0] = chosen.get(i)[0];
				greatestFit[1] = chosen.get(i)[1];
			}
		}
		
		return (int) greatestFit[1];
	}

}
