package com.okinc.planet.biz_userprofile.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PlanetOrderListType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetOrderListType[] $VALUES;
    public static final Activity Companion;
    public static final PlanetOrderListType All = new PlanetOrderListType("All", 0);
    public static final PlanetOrderListType Swap = new PlanetOrderListType("Swap", 1);
    public static final PlanetOrderListType Spot = new PlanetOrderListType("Spot", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetOrderListType[] $values() {
        return new PlanetOrderListType[]{All, Swap, Spot};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetOrderListType> getEntries() {
        return $ENTRIES;
    }

    private PlanetOrderListType(String str, int i) {
    }

    static {
        PlanetOrderListType[] planetOrderListTypeArr$values = $values();
        $VALUES = planetOrderListTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetOrderListTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.data.PlanetOrderListType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static PlanetOrderListType valueOf(String str) {
        return (PlanetOrderListType) Enum.valueOf(PlanetOrderListType.class, str);
    }

    public static PlanetOrderListType[] values() {
        return (PlanetOrderListType[]) $VALUES.clone();
    }
}
