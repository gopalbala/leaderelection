package com.gb.leaderelection.keeper;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

public enum Nodes {
    INSTANCE;

    private String currentLeader = StringUtils.EMPTY;
    private List<String> nodes = new ArrayList<>();

    public String getCurrentLeader() {
        return this.currentLeader;
    }

    public void setCurrentLeader(String currentLeader) {
        this.currentLeader = currentLeader;
    }

    public List<String> getNodes() {
        return this.nodes;
    }

    public void addNode(String node) {
        this.nodes.add(node);
    }
}
