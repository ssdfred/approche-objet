package fr.diginamic.tri;

import java.util.Comparator;

public class ComparatorHabitant implements Comparator<Ville> {

	//tri par nombre d'habitant

	@Override
	public int compare(Ville o1, Ville o2) {

		if (o1.getPop() > o2.getPop()){
			return 1;
		}
		if (o1.getPop() < o2.getPop()){
			return -1;
		}
		return 0;
	
	}
	}

	


