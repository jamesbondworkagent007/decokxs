package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEE {
    public static final Activity Companion = new Activity(null);
    public static final iEE copydefault = new iEE(0, 0, null, null, null, null, null, null, 0, false, null, null, null, 8191, null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String EZpvd;
    public final long KWHzl;
    public final int OLrzqt;
    public final java.lang.String djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final boolean valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEE() {
        this(0L, 0L, null, null, null, null, null, null, 0, false, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEE KWHzl(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, boolean z, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new iEE(j, j2, str, str2, str3, str4, str5, str6, i, z, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEE)) {
            return false;
        }
        iEE iee = (iEE) obj;
        return this.AhwBna == iee.AhwBna && this.KWHzl == iee.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) iee.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) iee.values) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) iee.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) iee.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) iee.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) iee.AkhnZx) && this.OLrzqt == iee.OLrzqt && this.valueOf == iee.valueOf && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) iee.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) iee.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) iee.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((java.lang.Long.hashCode(this.AhwBna) * 31) + java.lang.Long.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.values.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AkhnZx.hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + this.isConnected.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Protocol(protocolId=" + this.AhwBna + ", chainId=" + this.KWHzl + ", name=" + this.AEQbTJ + ", webUrl=" + this.values + ", logoUrl=" + this.EZpvd + ", network=" + this.AYXKKw + ", networkLogoUrl=" + this.gEmmrt + ", totalHoldingInCurrency=" + this.AkhnZx + ", investments=" + this.OLrzqt + ", supportInvestment=" + this.valueOf + ", warning=" + this.isConnected + ", yesterdayProfit=" + this.fetchVPNInfo + ", totalEarnings=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.values;
    }

    public iEE(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, boolean z, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.AhwBna = j;
        this.KWHzl = j2;
        this.AEQbTJ = str;
        this.values = str2;
        this.EZpvd = str3;
        this.AYXKKw = str4;
        this.gEmmrt = str5;
        this.AkhnZx = str6;
        this.OLrzqt = i;
        this.valueOf = z;
        this.isConnected = str7;
        this.fetchVPNInfo = str8;
        this.djBIcL = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0089: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r17v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r19v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0046: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r32v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r28v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:22) call: o.iEE.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ iEE(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, boolean z, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) == 0 ? j2 : 0L, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "0" : str6, (i2 & 256) != 0 ? 0 : i, (i2 & 512) == 0 ? z : false, (i2 & 1024) != 0 ? "" : str7, (i2 & 2048) != 0 ? "" : str8, (i2 & 4096) == 0 ? str9 : "");
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEE.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
