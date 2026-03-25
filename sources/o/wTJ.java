package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wTJ {
    public static final int $stable = 0;
    public final java.lang.String algoOrdType;
    public final java.lang.String direction;
    public final java.lang.String initOrdAmt;
    public final java.lang.String instId;
    public final java.lang.String lever;
    public final java.lang.String maxSafetyOrds;
    public final java.lang.String pxSteps;
    public final java.lang.String pxStepsMult;
    public final java.lang.String safetyOrdAmt;
    public final java.lang.String slPct;
    public final java.lang.String tpPct;
    public final java.lang.String volMult;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public wTJ() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wTJ AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.lang.String str11, java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new wTJ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wTJ)) {
            return false;
        }
        wTJ wtj = (wTJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.algoOrdType, (java.lang.Object) wtj.algoOrdType) && Intrinsics.EZpvd((java.lang.Object) this.instId, (java.lang.Object) wtj.instId) && Intrinsics.EZpvd((java.lang.Object) this.initOrdAmt, (java.lang.Object) wtj.initOrdAmt) && Intrinsics.EZpvd((java.lang.Object) this.safetyOrdAmt, (java.lang.Object) wtj.safetyOrdAmt) && Intrinsics.EZpvd((java.lang.Object) this.maxSafetyOrds, (java.lang.Object) wtj.maxSafetyOrds) && Intrinsics.EZpvd((java.lang.Object) this.pxSteps, (java.lang.Object) wtj.pxSteps) && Intrinsics.EZpvd((java.lang.Object) this.pxStepsMult, (java.lang.Object) wtj.pxStepsMult) && Intrinsics.EZpvd((java.lang.Object) this.volMult, (java.lang.Object) wtj.volMult) && Intrinsics.EZpvd((java.lang.Object) this.tpPct, (java.lang.Object) wtj.tpPct) && Intrinsics.EZpvd((java.lang.Object) this.slPct, (java.lang.Object) wtj.slPct) && Intrinsics.EZpvd((java.lang.Object) this.direction, (java.lang.Object) wtj.direction) && Intrinsics.EZpvd((java.lang.Object) this.lever, (java.lang.Object) wtj.lever);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoOrdType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.initOrdAmt.hashCode();
        int iHashCode4 = this.safetyOrdAmt.hashCode();
        int iHashCode5 = this.maxSafetyOrds.hashCode();
        java.lang.String str = this.pxSteps;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = this.pxStepsMult.hashCode();
        int iHashCode8 = this.volMult.hashCode();
        int iHashCode9 = this.tpPct.hashCode();
        int iHashCode10 = this.slPct.hashCode();
        java.lang.String str2 = this.direction;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.lever;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DcaPreviewRequest(algoOrdType=" + this.algoOrdType + ", instId=" + this.instId + ", initOrdAmt=" + this.initOrdAmt + ", safetyOrdAmt=" + this.safetyOrdAmt + ", maxSafetyOrds=" + this.maxSafetyOrds + ", pxSteps=" + this.pxSteps + ", pxStepsMult=" + this.pxStepsMult + ", volMult=" + this.volMult + ", tpPct=" + this.tpPct + ", slPct=" + this.slPct + ", direction=" + this.direction + ", lever=" + this.lever + ")";
    }

    public wTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.lang.String str11, java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.algoOrdType = str;
        this.instId = str2;
        this.initOrdAmt = str3;
        this.safetyOrdAmt = str4;
        this.maxSafetyOrds = str5;
        this.pxSteps = str6;
        this.pxStepsMult = str7;
        this.volMult = str8;
        this.tpPct = str9;
        this.slPct = str10;
        this.direction = str11;
        this.lever = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:25) call: o.wTJ.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ wTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? null : str11, (i & 2048) == 0 ? str12 : null);
    }
}
