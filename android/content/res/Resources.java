package android.content.res;

import voss.android.R;
import voss.logic.support.Constants;
import voss.roles.Agent;
import voss.roles.Arsonist;
import voss.roles.Blackmailer;
import voss.roles.Bodyguard;
import voss.roles.BusDriver;
import voss.roles.Chauffeur;
import voss.roles.Citizen;
import voss.roles.Consort;
import voss.roles.CultLeader;
import voss.roles.Cultist;
import voss.roles.Detective;
import voss.roles.Doctor;
import voss.roles.Escort;
import voss.roles.Executioner;
import voss.roles.Framer;
import voss.roles.Godfather;
import voss.roles.Janitor;
import voss.roles.Jester;
import voss.roles.Lookout;
import voss.roles.Mafioso;
import voss.roles.MassMurderer;
import voss.roles.Mayor;
import voss.roles.SerialKiller;
import voss.roles.Sheriff;
import voss.roles.Veteran;
import voss.roles.Vigilante;
import voss.roles.Witch;

public class Resources {

	public int getColor(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getStringArray(int id) {
		switch (id){
			case R.array.roles_townRoles:
				return new String[]{Citizen.ROLE_NAME, Sheriff.ROLE_NAME, Detective.ROLE_NAME, Lookout.ROLE_NAME, Doctor.ROLE_NAME, Escort.ROLE_NAME, BusDriver.ROLE_NAME, Bodyguard.ROLE_NAME, Vigilante.ROLE_NAME, Veteran.ROLE_NAME, Mayor.ROLE_NAME};
				
			case R.array.roles_mafiaRoles:
				return new String[]{Godfather.ROLE_NAME, Mafioso.ROLE_NAME, Agent.ROLE_NAME, Blackmailer.ROLE_NAME, Consort.ROLE_NAME, Janitor.ROLE_NAME, Framer.ROLE_NAME, Chauffeur.ROLE_NAME};
				
			case R.array.roles_neutralRoles:
				return new String[]{CultLeader.ROLE_NAME, Cultist.ROLE_NAME, Witch.ROLE_NAME, Arsonist.ROLE_NAME, SerialKiller.ROLE_NAME, MassMurderer.ROLE_NAME, Jester.ROLE_NAME, Executioner.ROLE_NAME};
				
			case R.array.roles_randomRoles:
				return new String[]{Constants.ANY_RANDOM_ROLE_NAME, Constants.TOWN_RANDOM_ROLE_NAME, Constants.TOWN_PROTECTIVE_ROLE_NAME, Constants.TOWN_INVESTIGATIVE_ROLE_NAME, Constants.TOWN_KILLING_ROLE_NAME, Constants.MAFIA_RANDOM_ROLE_NAME, Constants.YAKUZA_RANDOM_ROLE_NAME, Constants.NEUTRAL_RANDOM_ROLE_NAME}; 
		}
		
		return null;
	}

}
