package com.amazon.aws.am2.appmig.glassviewer.constructs;

public class ConstructStaticBlockMetaData {

	private int startsAt;
	private int endsAt;

	public int getStartsAt() {
		return startsAt;
	}

	public void setStartsAt(int startsAt) {
		this.startsAt = startsAt;
	}

	public int getEndsAt() {
		return endsAt;
	}

	public void setEndsAt(int endsAt) {
		this.endsAt = endsAt;
	}

	@Override 
	public String toString() {
		return "ConstructStaticBlockMetaData{" +
				"startsAt='" + startsAt + '\'' +
				"endsAt='" + endsAt + '\'' +
				'}';
	}	
}
