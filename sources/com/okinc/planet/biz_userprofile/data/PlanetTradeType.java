package com.okinc.planet.biz_userprofile.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PlanetTradeType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetTradeType[] $VALUES;
    public static final PlanetTradeType Spot = new PlanetTradeType("Spot", 0);
    public static final PlanetTradeType Swap = new PlanetTradeType("Swap", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetTradeType[] $values() {
        return new PlanetTradeType[]{Spot, Swap};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetTradeType> getEntries() {
        return $ENTRIES;
    }

    private PlanetTradeType(String str, int i) {
    }

    static {
        PlanetTradeType[] planetTradeTypeArr$values = $values();
        $VALUES = planetTradeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetTradeTypeArr$values);
    }

    public static PlanetTradeType valueOf(String str) {
        return (PlanetTradeType) Enum.valueOf(PlanetTradeType.class, str);
    }

    public static PlanetTradeType[] values() {
        return (PlanetTradeType[]) $VALUES.clone();
    }
}
