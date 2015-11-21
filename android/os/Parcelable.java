package android.os;


public interface Parcelable {

	public interface Creator<T> {

		public T createFromParcel(Parcel p);
		
		public T[] newArray(int size);

	}
	
	void writeToParcel(Parcel b, int i);

}
