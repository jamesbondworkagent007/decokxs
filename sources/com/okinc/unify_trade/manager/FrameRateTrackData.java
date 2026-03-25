package com.okinc.unify_trade.manager;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class FrameRateTrackData {
    public static final int $stable = 0;
    private final String avaRate;
    private final String highRateRatio;
    private final String highestRate;
    private final String jankRatio;
    private final String lowRateRatio;
    private final String lowestRate;
    private final String mediumRateRatio;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FrameRateTrackData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FrameRateTrackData copy$default(FrameRateTrackData frameRateTrackData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frameRateTrackData.avaRate;
        }
        if ((i & 2) != 0) {
            str2 = frameRateTrackData.highestRate;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = frameRateTrackData.lowestRate;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = frameRateTrackData.highRateRatio;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = frameRateTrackData.mediumRateRatio;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = frameRateTrackData.lowRateRatio;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = frameRateTrackData.jankRatio;
        }
        return frameRateTrackData.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avaRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.highestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lowestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.highRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mediumRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.lowRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.jankRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrameRateTrackData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new FrameRateTrackData(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameRateTrackData)) {
            return false;
        }
        FrameRateTrackData frameRateTrackData = (FrameRateTrackData) obj;
        return Intrinsics.EZpvd((Object) this.avaRate, (Object) frameRateTrackData.avaRate) && Intrinsics.EZpvd((Object) this.highestRate, (Object) frameRateTrackData.highestRate) && Intrinsics.EZpvd((Object) this.lowestRate, (Object) frameRateTrackData.lowestRate) && Intrinsics.EZpvd((Object) this.highRateRatio, (Object) frameRateTrackData.highRateRatio) && Intrinsics.EZpvd((Object) this.mediumRateRatio, (Object) frameRateTrackData.mediumRateRatio) && Intrinsics.EZpvd((Object) this.lowRateRatio, (Object) frameRateTrackData.lowRateRatio) && Intrinsics.EZpvd((Object) this.jankRatio, (Object) frameRateTrackData.jankRatio);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvaRate() {
        return this.avaRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighRateRatio() {
        return this.highRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighestRate() {
        return this.highestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJankRatio() {
        return this.jankRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowRateRatio() {
        return this.lowRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowestRate() {
        return this.lowestRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMediumRateRatio() {
        return this.mediumRateRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.avaRate.hashCode() * 31) + this.highestRate.hashCode()) * 31) + this.lowestRate.hashCode()) * 31) + this.highRateRatio.hashCode()) * 31) + this.mediumRateRatio.hashCode()) * 31) + this.lowRateRatio.hashCode()) * 31) + this.jankRatio.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FrameRateTrackData(avaRate=" + this.avaRate + ", highestRate=" + this.highestRate + ", lowestRate=" + this.lowestRate + ", highRateRatio=" + this.highRateRatio + ", mediumRateRatio=" + this.mediumRateRatio + ", lowRateRatio=" + this.lowRateRatio + ", jankRatio=" + this.jankRatio + ")";
    }

    public FrameRateTrackData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.avaRate = str;
        this.highestRate = str2;
        this.lowestRate = str3;
        this.highRateRatio = str4;
        this.mediumRateRatio = str5;
        this.lowRateRatio = str6;
        this.jankRatio = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:150) call: com.okinc.unify_trade.manager.FrameRateTrackData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FrameRateTrackData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }
}
