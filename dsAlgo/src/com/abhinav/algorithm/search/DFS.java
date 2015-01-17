package com.abhinav.algorithm.search;

import com.abhinav.algorithm.data_structures.Stack;

class vertex{
	public char nodeName;
	public boolean flag;
	
	public vertex(char name){
		nodeName = name;
		flag = false;
	}
}

class graph{
	private final int numVertex = 10;
	private vertex vertexList[];
	private int adjMatrix[][];
	private int vertexNum;
	private Stack dfsStack;
	
	public graph(){
		vertexList = new vertex[numVertex];
		adjMatrix = new int [numVertex][numVertex];
		vertexNum =0;
		for (int i = 0; i< numVertex; i++)
			for (int j =0; j< numVertex; j++)
				adjMatrix[i][j]=0;
		dfsStack = new Stack(numVertex);
		
	}
	
	public void addVertex(char name){
		vertexList[vertexNum++] = new vertex(name);
	}
	
	public void addEdge(int from, int to){
		adjMatrix[from][to] = 1;
		adjMatrix[to][from] = 1;
	}
	
	public void displayVertex(int v){
		System.out.print(vertexList[v].nodeName);
	}
	
	public void dfs(){
		vertexList[0].flag = true;
		displayVertex(0);
		dfsStack.push(0);
		
		while(!dfsStack.isEmpty()){
			int v = getAdjUnvisitedVertex(dfsStack.peek());
			if ( v == -1 ){
				//System.out.println("Just before pop");
				dfsStack.pop();
			}
			else {
				vertexList[v].flag = true;
				displayVertex(v);
				dfsStack.push(v);
			}
			
		}
	}

	public int getAdjUnvisitedVertex(int pop) {
		// TODO Auto-generated method stub
		for ( int i = 0; i < numVertex; i++){
			if (adjMatrix[pop][i] == 1 && vertexList[i].flag == false)
				//System.out.println("Yo");
				return i;
		}
		return -1;
	}
}
public class DFS {
	
	public static void main(String[] args){
		graph dfsGraph = new graph();
		
		dfsGraph.addVertex('A');
		dfsGraph.addVertex('B');
		dfsGraph.addVertex('C');
		dfsGraph.addVertex('D');
		dfsGraph.addVertex('E');
		dfsGraph.addVertex('F');
		dfsGraph.addVertex('G');
		dfsGraph.addVertex('H');
		dfsGraph.addVertex('I');
		dfsGraph.addVertex('J');
		
		dfsGraph.addEdge(0, 1);
		dfsGraph.addEdge(0, 2);
		dfsGraph.addEdge(0, 3);
		dfsGraph.addEdge(1, 4);
		dfsGraph.addEdge(2, 5);
		dfsGraph.addEdge(5, 6);
		dfsGraph.addEdge(6, 7);
		dfsGraph.addEdge(3, 8);
		
		System.out.println("DFS :");
		dfsGraph.dfs();
		
	}

}
