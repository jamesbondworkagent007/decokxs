package o;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEK {
    public final long AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String OLrzqt;
    public final java.util.List<java.lang.Long> copydefault;
    public final boolean djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final long gEmmrt;
    public final java.lang.String valueOf;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final iEK EZpvd = new iEK(0, 0, null, null, null, null, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEK() {
        this(0L, 0L, null, null, null, null, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEK OLrzqt(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.util.List<java.lang.Long> list, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new iEK(j, j2, str, str2, str3, str4, z, list, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEK)) {
            return false;
        }
        iEK iek = (iEK) obj;
        return this.gEmmrt == iek.gEmmrt && this.AEQbTJ == iek.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) iek.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) iek.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) iek.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) iek.fetchVPNInfo) && this.djBIcL == iek.djBIcL && Intrinsics.EZpvd(this.copydefault, iek.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iek.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((java.lang.Long.hashCode(this.gEmmrt) * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProtocolInfo(protocolId=" + this.gEmmrt + ", chainId=" + this.AEQbTJ + ", associatedAccountId=" + this.OLrzqt + ", name=" + this.AYXKKw + ", logoUrl=" + this.valueOf + ", webUrl=" + this.fetchVPNInfo + ", supportInvest=" + this.djBIcL + ", investmentIds=" + this.copydefault + ", network=" + this.AhwBna + ")";
    }

    public iEK(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, boolean z, @NotNull java.util.List<java.lang.Long> list, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.gEmmrt = j;
        this.AEQbTJ = j2;
        this.OLrzqt = str;
        this.AYXKKw = str2;
        this.valueOf = str3;
        this.fetchVPNInfo = str4;
        this.djBIcL = z;
        this.copydefault = list;
        this.AhwBna = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005f: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r15v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0033: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003b: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<java.lang.Long>, java.lang.String):void (m)] (LINE:14) call: o.iEK.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ iEK(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.util.List list, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) == 0 ? j2 : 0L, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? false : z, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) == 0 ? str5 : "");
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final iEK OLrzqt() {
            return iEK.EZpvd;
        }
    }
}
