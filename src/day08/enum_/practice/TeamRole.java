package day08.enum_.practice;

public enum TeamRole {

        LEADER("Manages the team and coordinates."),
        DEVELOPER("Develops the software."),
        DESIGNER("Designs the user interface."),
        TESTER("Tests the software for bugs.");

        // 이하를 작성하세요
        private final String job;

        TeamRole(String job) {
                this.job = job;
        }

        public  String getJob() {
                return job;
        }

}
