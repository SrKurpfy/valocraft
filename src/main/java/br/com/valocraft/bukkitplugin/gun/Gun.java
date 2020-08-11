package br.com.valocraft.bukkitplugin.gun;

public interface Gun {

    String getName();

    int getPrice();

    int getFireRate();
    
    FireType[] getTypes();
}
