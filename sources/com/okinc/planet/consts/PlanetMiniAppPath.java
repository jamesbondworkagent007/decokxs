package com.okinc.planet.consts;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class PlanetMiniAppPath {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetMiniAppPath[] $VALUES;
    public static final PlanetMiniAppPath TraderLevelsIntroEntrance = new PlanetMiniAppPath("TraderLevelsIntroEntrance", 0, "okluatradingeco", "/trader/tiers", "TraderLevelsIntroEntrance", "6.80.0");
    private final String appId;
    private final String fileName;
    private final String minAppVersion;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetMiniAppPath[] $values() {
        return new PlanetMiniAppPath[]{TraderLevelsIntroEntrance};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetMiniAppPath> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    private PlanetMiniAppPath(String str, int i, String str2, String str3, String str4, String str5) {
        this.appId = str2;
        this.url = str3;
        this.fileName = str4;
        this.minAppVersion = str5;
    }

    static {
        PlanetMiniAppPath[] planetMiniAppPathArr$values = $values();
        $VALUES = planetMiniAppPathArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetMiniAppPathArr$values);
    }

    public static PlanetMiniAppPath valueOf(String str) {
        return (PlanetMiniAppPath) Enum.valueOf(PlanetMiniAppPath.class, str);
    }

    public static PlanetMiniAppPath[] values() {
        return (PlanetMiniAppPath[]) $VALUES.clone();
    }
}
