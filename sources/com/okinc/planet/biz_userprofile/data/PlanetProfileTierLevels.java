package com.okinc.planet.biz_userprofile.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C46218tMe;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class PlanetProfileTierLevels {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PlanetProfileTierLevels[] $VALUES;
    public static final PlanetProfileTierLevels LVL4;
    public static final PlanetProfileTierLevels ORDINARY = new PlanetProfileTierLevels("ORDINARY", 0, "0", null, null, 6, null);
    private final String frameImgDark;
    private final String frameImgLight;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PlanetProfileTierLevels[] $values() {
        return new PlanetProfileTierLevels[]{ORDINARY, LVL4};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PlanetProfileTierLevels> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrameImgDark() {
        return this.frameImgDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrameImgLight() {
        return this.frameImgLight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private PlanetProfileTierLevels(String str, int i, String str2, String str3, String str4) {
        this.value = str2;
        this.frameImgLight = str3;
        this.frameImgDark = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 int)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.planet.biz_userprofile.data.PlanetProfileTierLevels.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PlanetProfileTierLevels(String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? null : str3, (i2 & 4) != 0 ? null : str4);
    }

    static {
        C46218tMe c46218tMe = C46218tMe.OLrzqt;
        LVL4 = new PlanetProfileTierLevels("LVL4", 1, "4", c46218tMe.copydefault(), c46218tMe.AEQbTJ());
        PlanetProfileTierLevels[] planetProfileTierLevelsArr$values = $values();
        $VALUES = planetProfileTierLevelsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(planetProfileTierLevelsArr$values);
    }

    public static PlanetProfileTierLevels valueOf(String str) {
        return (PlanetProfileTierLevels) Enum.valueOf(PlanetProfileTierLevels.class, str);
    }

    public static PlanetProfileTierLevels[] values() {
        return (PlanetProfileTierLevels[]) $VALUES.clone();
    }
}
