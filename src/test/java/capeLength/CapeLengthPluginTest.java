package capeLength;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import org.flurl.CapeLengthPlugin;

public class CapeLengthPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(CapeLengthPlugin.class);
		RuneLite.main(args);
	}
}