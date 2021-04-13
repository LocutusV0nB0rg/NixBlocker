package borg.locutus.nixblocker;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class NixBlocker extends LabyModAddon {
    @Override
    public void onEnable() {
        getApi().getEventManager().register(new IncomingMessageListener());
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {

    }
}
