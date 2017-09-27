package com.artyombash.domain.entity.links;

/**
 * The Fixture resource reflects a scheduled football game. A fixture typically belongs to a
 * competition and is played on a certain matchday. Fixture appears as Main Resource and as
 * Subresource of a Competition.
 */
public class LinkToFixtures {

    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}
