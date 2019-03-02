package ac.za.cput.project;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public Collection<String> getCollection(){
        Collection<String> soccerTeams = new ArrayList<>();
        System.out.println("********** Soccer Teams in Europe **********");
        System.out.println();
        soccerTeams.add("Barcelona");
        soccerTeams.add("Real Madrid");
        soccerTeams.add("Manchester United");
        soccerTeams.add("Juventus");
        soccerTeams.add("Manchester City");
        soccerTeams.add("Chelsea");
        soccerTeams.add("Bayern Munich");
        soccerTeams.add("Inter Milan");
        soccerTeams.add("Everton");
        soccerTeams.add("Liverpool");

        return soccerTeams;

    }

    public List<String> getList(){
        List<String> getList = new LinkedList<>();
        getList.add("Barcelona");
        getList.add("Real Madrid");
        getList.add("Manchester United");
        getList.add("Juventus");
        getList.add("Manchester City");
        getList.add("Chelsea");
        getList.add("Bayern Munich");
        getList.add("Inter Milan");
        getList.add("Everton");
        getList.add(0, "Arsenal");
        System.out.println();
        return getList;
    }

    public Set<String> getString(){
        Set<String> getString = new HashSet<>();
        getString.add("Barcelona");
        getString.add("Real Madrid");
        getString.add("Manchester United");
        getString.add("Juventus");
        getString.add("Manchester City");
        getString.add("Chelsea");
        getString.add("Bayern Munich");
        getString.add("Inter Milan");
        getString.add("Everton");
        return getString;
    }

    public Map<String, String> getMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Barcelona", "ESP");
        map.put("Real Madrid", "ESP");
        map.put("Manchester United", "ENG");
        map.put("Juventus", "ITA");
        map.put("Manchester City", "ENG");
        map.put("Chelsea", "ENG");
        map.put("Bayern Munich", "GER");
        map.put("Inter Milan", "ITA");
        map.put("Everton", "ENG");
        map.put("Liverpool", "ENG");
        map.put("Arsenal", "ENG");
        return map;
    }



}
