package towerwar.util;

import net.minecraft.server.v1_12_R1.ChatMessageType;
import net.minecraft.server.v1_12_R1.IChatBaseComponent;
import net.minecraft.server.v1_12_R1.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;

public class ActionBar {

    private String message;

    public ActionBar(String message) {
        this.message = message;
    }

    public void send(Player player) {
        PacketPlayOutChat packetPlayOutChat = new PacketPlayOutChat(
                IChatBaseComponent.ChatSerializer.a(message),
                ChatMessageType.GAME_INFO);

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(packetPlayOutChat);
    }

    public void send(Player... players) {
        for (Player player : players) {
            send(player);
        }
    }

    public void send(Collection<? extends Player> players) {
        for (Player player : players) {
            send(player);
        }
    }
}
