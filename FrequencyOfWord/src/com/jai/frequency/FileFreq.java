package com.jai.frequency;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileFreq {
	BinarySearchTree<String> bst = new BinarySearchTree<>();

	public FileFreq(BinarySearchTree<String> bst) {
		super();
		this.bst = bst;
	}

	public void reader(String fileName) {
		try (FileInputStream fileInputStream = new FileInputStream(fileName);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

			while (true)
				bst.insert((String) objectInputStream.readObject());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void writer(String fileName) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject("Hola");
			objectOutputStream.writeObject("Jai");
			objectOutputStream.writeObject("Prakash");
			objectOutputStream.writeObject("Narayan");
			objectOutputStream.writeObject("Panedey");
			objectOutputStream.writeObject("Aka");
			objectOutputStream.writeObject("Anant Shahrag");
			objectOutputStream.writeObject("which");
			objectOutputStream.writeObject("means");
			objectOutputStream.writeObject("Endless");
			objectOutputStream.writeObject("WordSmith");
			objectOutputStream.writeObject("Thank You");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}