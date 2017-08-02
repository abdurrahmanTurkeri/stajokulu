package com.stajokulu.downloadfile;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class TestDownloadFile {
	public static void main(String[] args) throws IOException {

		BufferedInputStream in = null;
		FileOutputStream fout = null;
		String URL = "http://stajokulu.com/wp-content/uploads/2016/02/stajokulupng.png";
		String FILE_PATH = "C:/Indir/stajokulu.png";
		try {
			in = new BufferedInputStream(new URL(URL).openStream());
			fout = new FileOutputStream(FILE_PATH);

			final byte data[] = new byte[1024];
			int count;
			while ((count = in.read(data, 0, 1024)) != -1) {
				fout.write(data, 0, count);
			}
		} catch (MalformedURLException e) {
			System.out.println("Url ile ilgili problem mevcut \t" + URL);
		} catch (IOException io) {
			System.out.println("Dosya Pathi ile ilgili problem mevcut \t" + FILE_PATH);
		}

		finally {
			if (in != null) {
				in.close();
			}
			if (fout != null) {
				fout.close();
			}
		}

	}
}
