package org.usfirst.frc1024.Emmet;

import java.util.ArrayList;

public class Path {
	ArrayList<Integer> pathArray = new ArrayList<Integer>();
	public int[] finalPos;
	public int[] initPos;
	public boolean finished = false;
	int pathPos = -1;

	public Path(int initX, int initY, int finalX, int finalY) {
		finalPos = new int[] { finalX, finalY };
		initPos = new int[] {finalX, finalY};
	}

	public void add(int direction) {
		pathPos++;
		pathArray.add(direction);
	}

	public void add(int[] direction) {
		for (int i = 0; i < direction.length; i++) {
			pathArray.add(direction[i]);
		}
	}

	public String getDirection() {
		if (pathPos < 0) {
			finished = true;
			return "stop";
		}
		switch (pathArray.get(pathPos)) {
		case 0:
			pathPos--;
			return "up";
		case 1:
			pathPos--;
			return "down";
		case 2:
			pathPos--;
			return "left";
		case 3:
			pathPos--;
			return "right";
		case 4:
			pathPos--;
			return "upLeft";
		case 5:
			pathPos--;
			return "upRight";
		case 6:
			pathPos--;
			return "downLeft";
		case 7:
			pathPos--;
			return "downRight";
		}
		return "stop";
	}
}