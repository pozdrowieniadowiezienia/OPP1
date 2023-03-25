package napoje.impl;

import napoje.Napoje;

public class Sok extends Napoje {

    private String smak;

    public Sok(String nazwa, String smak) {
        super(nazwa);
        this.smak = smak;

    }

    public String getSmak() {
        return smak;
    }

    @Override
    public void pij() {
        System.out.println("pije sok");
    }
}
