package borg.locutus.nixblocker;


import net.labymod.api.events.MessageReceiveEvent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IncomingMessageListener implements MessageReceiveEvent {
    private final Pattern pattern = Pattern.compile("(?i).*» [^a-z]*nix[^a-z]*$");

    @Override
    public boolean onReceive(String message, String unformattedMessage) {
        Matcher matcher = pattern.matcher(unformattedMessage);
        return matcher.matches();
    }
}
