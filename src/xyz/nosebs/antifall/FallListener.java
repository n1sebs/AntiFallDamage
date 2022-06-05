package xyz.nosebs.antifall;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallListener implements Listener {
    @EventHandler
    public void fall(EntityDamageEvent e) {
        if (e.getCause() != EntityDamageEvent.DamageCause.FALL || !(e.getEntity() instanceof Player)) {
            return; // not fall damage.
        }

        e.setCancelled(true);
    }
}