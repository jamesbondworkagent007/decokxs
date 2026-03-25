package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uLa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48264uLa {
    public static final Activity Companion = new Activity(null);
    public static final C48264uLa copydefault = new C48264uLa("", "", null, "", "", false, 0, 96, null);
    public final java.lang.String AEQbTJ;
    public final boolean AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final int OLrzqt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48264uLa copy$default(C48264uLa c48264uLa, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c48264uLa.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = c48264uLa.AEQbTJ;
        }
        java.lang.String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = c48264uLa.valueOf;
        }
        java.lang.String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = c48264uLa.KWHzl;
        }
        java.lang.String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = c48264uLa.AhwBna;
        }
        java.lang.String str9 = str5;
        if ((i2 & 32) != 0) {
            z = c48264uLa.AYXKKw;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            i = c48264uLa.OLrzqt;
        }
        return c48264uLa.KWHzl(str, str6, str7, str8, str9, z2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48264uLa KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C48264uLa(str, str2, str3, str4, str5, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48264uLa)) {
            return false;
        }
        C48264uLa c48264uLa = (C48264uLa) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c48264uLa.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c48264uLa.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c48264uLa.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c48264uLa.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c48264uLa.AhwBna) && this.AYXKKw == c48264uLa.AYXKKw && this.OLrzqt == c48264uLa.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        java.lang.String str = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "BotChartConfig(instId=" + this.EZpvd + ", instType=" + this.AEQbTJ + ", tradeQuoteCcy=" + this.valueOf + ", orderType=" + this.KWHzl + ", totalPnl=" + this.AhwBna + ", useUsdtMargin=" + this.AYXKKw + ", labelCount=" + this.OLrzqt + ")";
    }

    public C48264uLa(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.valueOf = str3;
        this.KWHzl = str4;
        this.AhwBna = str5;
        this.AYXKKw = z;
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (3 int) : (r16v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void (m)] (LINE:125) call: o.uLa.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int):void type: THIS */
    public /* synthetic */ C48264uLa(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? 3 : i);
    }

    /* JADX INFO: renamed from: o.uLa$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLa.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C48264uLa KWHzl() {
            return C48264uLa.copydefault;
        }
    }
}
