package towerwar.util;

import net.minecraft.server.v1_12_R1.*;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.List;

public class Title {
    private String title;
    private String subtitle;
    private int fadeIn;
    private int stay;
    private int fadeOut;

    public Title(String title, String subtitle, int fadeIn, int stay, int fadeOut) {
        this.title = title;
        this.subtitle = subtitle;
        this.fadeIn = fadeIn;
        this.fadeOut = fadeOut;
        this.stay = stay;
    }

    public Title(String title, String subtitle) {
        this(title, subtitle, 10, 70, 20);
    }

    public Title(String title) {
        this(title, null);
    }

    public Title() {
        this(null);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTime(int fadeIn, int stay, int fadeOut) {
        this.fadeIn = fadeIn;
        this.stay = stay;
        this.fadeOut = fadeOut;
    }

    public void send(Player player) {
        PlayerConnection pc = ((CraftPlayer) player).getHandle().playerConnection;

        PacketPlayOutTitle packetPlayOutTime = new PacketPlayOutTitle(fadeIn, stay, fadeOut);
        pc.sendPacket(packetPlayOutTime);

        if(title != null) {
            PacketPlayOutTitle packetPlayOutTitle = new PacketPlayOutTitle(
                    PacketPlayOutTitle.EnumTitleAction.TITLE,
                    IChatBaseComponent.ChatSerializer.a(title));
            pc.sendPacket(packetPlayOutTitle);
        }

        if(subtitle != null) {
            PacketPlayOutTitle packetPlayOutSubtitle = new PacketPlayOutTitle(
                    PacketPlayOutTitle.EnumTitleAction.SUBTITLE,
                    IChatBaseComponent.ChatSerializer.a(subtitle));
            pc.sendPacket(packetPlayOutSubtitle);
        }

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
