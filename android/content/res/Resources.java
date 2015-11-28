package android.content.res;

import voss.android.R;
import voss.shared.logic.support.Constants;
import voss.shared.roles.Agent;
import voss.shared.roles.Arsonist;
import voss.shared.roles.Blackmailer;
import voss.shared.roles.Bodyguard;
import voss.shared.roles.BusDriver;
import voss.shared.roles.Chauffeur;
import voss.shared.roles.Citizen;
import voss.shared.roles.Consort;
import voss.shared.roles.CultLeader;
import voss.shared.roles.Cultist;
import voss.shared.roles.Detective;
import voss.shared.roles.Doctor;
import voss.shared.roles.Escort;
import voss.shared.roles.Executioner;
import voss.shared.roles.Framer;
import voss.shared.roles.Godfather;
import voss.shared.roles.Janitor;
import voss.shared.roles.Jester;
import voss.shared.roles.Lookout;
import voss.shared.roles.Mafioso;
import voss.shared.roles.MassMurderer;
import voss.shared.roles.Mayor;
import voss.shared.roles.SerialKiller;
import voss.shared.roles.Sheriff;
import voss.shared.roles.Veteran;
import voss.shared.roles.Vigilante;
import voss.shared.roles.Witch;

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
