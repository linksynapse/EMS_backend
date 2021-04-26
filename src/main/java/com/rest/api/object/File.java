package com.rest.api.object;

public class File {
	int Idx;
	String FileName;
	String FilePath;
	String Category;
	byte[] Data;
	public byte[] getData() {
		return Data;
	}
	public void setData(byte[] data) {
		Data = data;
	}
	public int getIdx() {
		return Idx;
	}
	public void setIdx(int idx) {
		Idx = idx;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFilePath() {
		return "FileDownload?Idx=" + Idx;
	}
	public void setFilePath(String filePath) {
		FilePath = filePath;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
}
