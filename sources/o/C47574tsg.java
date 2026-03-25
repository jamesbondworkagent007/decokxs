package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tsg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47574tsg {
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public final int AhwBna;
    public final int AkhnZx;
    public final int DbNXlk;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final int djBIcL;
    public final java.lang.String fARcdN;
    public final java.lang.String fJNWhG;
    public final int fetchVPNInfo;
    public final boolean gEmmrt;
    public final int isConnected;
    public final java.lang.String valueOf;
    public final int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47574tsg() {
        this(null, null, 0, 0, false, false, 0, false, false, 0, false, false, null, 0, 0, 0, 0, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47574tsg AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, boolean z5, boolean z6, @NotNull java.lang.String str3, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C47574tsg(str, str2, i, i2, z, z2, i3, z3, z4, i4, z5, z6, str3, i5, i6, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47574tsg)) {
            return false;
        }
        C47574tsg c47574tsg = (C47574tsg) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c47574tsg.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c47574tsg.fJNWhG) && this.AYXKKw == c47574tsg.AYXKKw && this.AhwBna == c47574tsg.AhwBna && this.copydefault == c47574tsg.copydefault && this.EZpvd == c47574tsg.EZpvd && this.djBIcL == c47574tsg.djBIcL && this.KWHzl == c47574tsg.KWHzl && this.AEQbTJ == c47574tsg.AEQbTJ && this.isConnected == c47574tsg.isConnected && this.gEmmrt == c47574tsg.gEmmrt && this.OLrzqt == c47574tsg.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) c47574tsg.fARcdN) && this.fetchVPNInfo == c47574tsg.fetchVPNInfo && this.DbNXlk == c47574tsg.DbNXlk && this.AkhnZx == c47574tsg.AkhnZx && this.values == c47574tsg.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.valueOf.hashCode() * 31) + this.fJNWhG.hashCode()) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.copydefault)) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.isConnected)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.fARcdN.hashCode()) * 31) + java.lang.Integer.hashCode(this.fetchVPNInfo)) * 31) + java.lang.Integer.hashCode(this.DbNXlk)) * 31) + java.lang.Integer.hashCode(this.AkhnZx)) * 31) + java.lang.Integer.hashCode(this.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "GenericInputConfig(hintText=" + this.valueOf + ", preText=" + this.fJNWhG + ", maxTextCount=" + this.AYXKKw + ", fixHeight=" + this.AhwBna + ", enableScrollDismiss=" + this.copydefault + ", enableImageInput=" + this.EZpvd + ", maxImageCount=" + this.djBIcL + ", enableTokenInput=" + this.KWHzl + ", enableTopicInput=" + this.AEQbTJ + ", maxTokenTopicCount=" + this.isConnected + ", enableUrlDetection=" + this.gEmmrt + ", enableStateSaving=" + this.OLrzqt + ", stateKey=" + this.fARcdN + ", paddingTop=" + this.fetchVPNInfo + ", paddingBottom=" + this.DbNXlk + ", paddingLeft=" + this.AkhnZx + ", paddingRight=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.DbNXlk;
    }

    public C47574tsg(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, boolean z5, boolean z6, @NotNull java.lang.String str3, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.fJNWhG = str2;
        this.AYXKKw = i;
        this.AhwBna = i2;
        this.copydefault = z;
        this.EZpvd = z2;
        this.djBIcL = i3;
        this.KWHzl = z3;
        this.AEQbTJ = z4;
        this.isConnected = i4;
        this.gEmmrt = z5;
        this.OLrzqt = z6;
        this.fARcdN = str3;
        this.fetchVPNInfo = i5;
        this.DbNXlk = i6;
        this.AkhnZx = i7;
        this.values = i8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001b: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r27v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r28v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005c: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : true)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("default_input_state") : (r31v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006c: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0074: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007f: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x008a: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
 A[MD:(java.lang.String, java.lang.String, int, int, boolean, boolean, int, boolean, boolean, int, boolean, boolean, java.lang.String, int, int, int, int):void (m)] (LINE:398) call: o.tsg.<init>(java.lang.String, java.lang.String, int, int, boolean, boolean, int, boolean, boolean, int, boolean, boolean, java.lang.String, int, int, int, int):void type: THIS */
    public /* synthetic */ C47574tsg(java.lang.String str, java.lang.String str2, int i, int i2, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, boolean z5, boolean z6, java.lang.String str3, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) == 0 ? str2 : "", (i9 & 4) != 0 ? -1 : i, (i9 & 8) != 0 ? 0 : i2, (i9 & 16) != 0 ? false : z, (i9 & 32) != 0 ? true : z2, (i9 & 64) != 0 ? 4 : i3, (i9 & 128) != 0 ? true : z3, (i9 & 256) != 0 ? true : z4, (i9 & 512) != 0 ? 5 : i4, (i9 & 1024) != 0 ? true : z5, (i9 & 2048) == 0 ? z6 : true, (i9 & 4096) != 0 ? "default_input_state" : str3, (i9 & 8192) != 0 ? 0 : i5, (i9 & 16384) != 0 ? 0 : i6, (i9 & 32768) != 0 ? 0 : i7, (i9 & 65536) != 0 ? 0 : i8);
    }
}
