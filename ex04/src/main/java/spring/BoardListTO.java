package spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BoardListTO {
	private ArrayList<String> userLists;
	private ArrayList<BoardTO> boardLists;
	private HashSet<BoardTO> boardSets;
	private HashMap<String, BoardTO> boardMaps;
	
	
	
	public HashMap<String, BoardTO> getBoardMaps() {
		return boardMaps;
	}
	public void setBoardMaps(HashMap<String, BoardTO> boardMaps) {
		this.boardMaps = boardMaps;
	}
	public HashSet<BoardTO> getBoardSets() {
		return boardSets;
	}
	public void setBoardSets(HashSet<BoardTO> boardSets) {
		this.boardSets = boardSets;
	}
	public ArrayList<String> getUserLists() {
		return userLists;
	}
	public void setUserLists(ArrayList<String> userLists) {
		this.userLists = userLists;
	}
	public ArrayList<BoardTO> getBoardLists() {
		return boardLists;
	}
	public void setBoardLists(ArrayList<BoardTO> boardLists) {
		this.boardLists = boardLists;
	}
	
	
}

