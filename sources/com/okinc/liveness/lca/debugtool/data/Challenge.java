package com.okinc.liveness.lca.debugtool.data;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Challenge {
    public static final int $stable = 0;

    @SerializedName("keyframe_index")
    private final String keyframeIndex;

    @SerializedName("keyframe_label")
    private final String keyframeLabel;
    private final String label;
    private final String prediction;
    private final Double score;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Challenge() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Challenge copy$default(Challenge challenge, String str, Double d, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challenge.prediction;
        }
        if ((i & 2) != 0) {
            d = challenge.score;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            str2 = challenge.keyframeLabel;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = challenge.keyframeIndex;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = challenge.label;
        }
        return challenge.copy(str, d2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.prediction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double component2() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.keyframeLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.keyframeIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Challenge copy(String str, Double d, String str2, String str3, String str4) {
        return new Challenge(str, d, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return Intrinsics.EZpvd((Object) this.prediction, (Object) challenge.prediction) && Intrinsics.EZpvd(this.score, challenge.score) && Intrinsics.EZpvd((Object) this.keyframeLabel, (Object) challenge.keyframeLabel) && Intrinsics.EZpvd((Object) this.keyframeIndex, (Object) challenge.keyframeIndex) && Intrinsics.EZpvd((Object) this.label, (Object) challenge.label);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyframeIndex() {
        return this.keyframeIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyframeLabel() {
        return this.keyframeLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrediction() {
        return this.prediction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getScore() {
        return this.score;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.prediction;
        int iHashCode = str == null ? 0 : str.hashCode();
        Double d = this.score;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        String str2 = this.keyframeLabel;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.keyframeIndex;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.label;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Challenge(prediction=" + this.prediction + ", score=" + this.score + ", keyframeLabel=" + this.keyframeLabel + ", keyframeIndex=" + this.keyframeIndex + ", label=" + this.label + ")";
    }

    public Challenge(String str, Double d, String str2, String str3, String str4) {
        this.prediction = str;
        this.score = d;
        this.keyframeLabel = str2;
        this.keyframeIndex = str3;
        this.label = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Double:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Double) : (r6v0 java.lang.Double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:73) call: com.okinc.liveness.lca.debugtool.data.Challenge.<init>(java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Challenge(String str, Double d, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }
}
