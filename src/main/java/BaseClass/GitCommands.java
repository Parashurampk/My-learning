package BaseClass;

public class GitCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
How to add new project to git:
======================================================
first go to project directory and open git bash
git init    	-> initialize the empty git in folder
git status  	-> it gives the all untracked files in red colour which is not added to the git 
git add .		-> add all the files working area to staging index
git status  	-> it will shows these are files in green colour
git commit -m 'first commit'  	-> push the local repository
git remote add origin https://github.com/Parashurampk/My-learning.git
git push -u origin master 		 -> push the remote repository


How to clone first repo:
===========================
git clone 'https://github.com/Parashurampk/GitDemo2.git'


How to add updated script to git: 
==================================
git init
git status
git add *
git status
git commit -m 'this is commit'
git remote add origin https://github.com/Parashurampk/FreeCRMProject.git
git push origin master


pulling upadted file from git to local files:
============================================
git pull origin master



How to create branches in git:
=============================
git checkout -b develop


How many branches available:
git branch
====================================================================
git pull origin develop // pulling from develop branch to local IDE 
git checkout develop 	// switching in IDE from master to develop
git branch - d branchname // delete branch
git checkout master //switching back to master branch -> this is active branch now
git merge develop  // develop branch will merge to active branch

When conflict happens it shows below line://it shows which file got conflict
Automatic merge failed ;fix conflict and then commit the result.

Reset the and get the latest code from git:
git fetch origin
git reset --hard origin/master

*/