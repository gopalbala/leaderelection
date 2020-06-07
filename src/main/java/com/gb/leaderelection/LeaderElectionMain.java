package com.gb.leaderelection;

import com.gb.leaderelection.keeper.LeaderElection;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;

public class LeaderElectionMain {
    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {
        LeaderElection leaderElection = new LeaderElection();
        leaderElection.connect();
        leaderElection.volunteerForLeadership();
        leaderElection.electLeader();
        leaderElection.run();
        leaderElection.close();

        System.out.println("I am done for the day.... Connect with you some other time... :)");
    }
}
