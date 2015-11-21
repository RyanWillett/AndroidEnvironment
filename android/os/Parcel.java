package android.os;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import voss.logic.Narrator;
import voss.logic.support.CommunicatorHandler;
import voss.packaging.Box;
import voss.packaging.Packager;


public class Parcel {

	private Box box = new Box();
	

	public Parcelable getParcelable() {
		Class<?> clazz;
		try {
			clazz = Class.forName("voss.packaging.Board");
			Object board = clazz.newInstance();
			Narrator n = new Narrator(new Packager(box), (CommunicatorHandler) board);
			
			Method setNarrator = clazz.getMethod("setNarrator", Narrator.class);
			setNarrator.invoke(board, n);
			return (Parcelable) board;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			throw new NullPointerException();
		}
	}

	public int readInt() {
		return box.readInt();
	}

	public void writeInt(int size) {
		box.writeInt(size);
		
	}

	public byte readByte() {
		return box.readByte();
	}

	public void writeByte(byte byt) {
		box.writeByte(byt);
	}

	public void readStringList(ArrayList<String> list) {
		box.readStringList(list);
	}

	public void writeIntArray(int[] array) {
		box.writeIntArray(array);
	}

	public int[] createIntArray() {
		return box.createIntArray();
	}

	public void writeString(String s) {
		box.writeString(s);
	}

	public String readString() {
		return box.readString();
	}

	public void writeStringList(List<String> list) {
		box.writeStringList(list);
		
	}
	
	

	

	

}
