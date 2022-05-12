package com.workoutapp.core.user.common;

import com.workoutapp.core.user.User;

import java.util.ArrayList;

public class Group {
    private int groupId;
    private String groupName;
    private ArrayList<User> groupMembers;


    public Group(int groupId, String groupName, ArrayList<User> groupMembers) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupMembers = groupMembers;
    }

    public int getGroupId(){
        return groupId;
    }

    public void setGroupId(int newGroupId) {
        groupId = newGroupId;
    }

    public String getGroupName(){
        return groupName;
    }

    public void setGroupName(String newGroupName) {
        groupName = newGroupName;
    }

    public ArrayList<User> getGroupMembers(){
        return groupMembers;
    }

    public ArrayList<User> addMember(ArrayList<User> groupMembers, User newMember) {
        groupMembers.add(newMember);
        return groupMembers;
    }


}
