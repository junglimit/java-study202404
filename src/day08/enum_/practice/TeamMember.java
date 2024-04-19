package day08.enum_.practice;

import static day08.enum_.practice.TeamRole.*;

public class TeamMember {
    private String name;
    private TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

//    public String getName() {
//        return name;
//    }

//    public void assignTask() {
//        switch (role) {
//            case LEADER:
//                System.out.println(getName() +" is assigned to "+LEADER.getJob());
//                break;
//            case TESTER:
//                System.out.println(getName() +" is assigned to "+TESTER.getJob());
//                break;
//            case DESIGNER:
//                System.out.println(getName() +" is assigned to "+DESIGNER.getJob());
//                break;
//            case DEVELOPER:
//                System.out.println(getName() +" is assigned to "+DEVELOPER.getJob());
//                break;
//            default:
//        }
        public void assignTask() {
            // 이하를 작성하세요
            System.out.printf("%s is assigned to %s\n",
                    this.name, this.role.getJob());
        }


    }

