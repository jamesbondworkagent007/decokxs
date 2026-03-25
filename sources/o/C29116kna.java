package o;

import com.okinc.business.market.features.overview.ui.widget.VibesRelevance;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kna, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29116kna {
    public final VibesRelevance AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29116kna() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C29116kna copy$default(C29116kna c29116kna, java.lang.String str, VibesRelevance vibesRelevance, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c29116kna.EZpvd;
        }
        if ((i & 2) != 0) {
            vibesRelevance = c29116kna.AEQbTJ;
        }
        VibesRelevance vibesRelevance2 = vibesRelevance;
        if ((i & 4) != 0) {
            str2 = c29116kna.copydefault;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = c29116kna.OLrzqt;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = c29116kna.KWHzl;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            str5 = c29116kna.AYXKKw;
        }
        return c29116kna.copydefault(str, vibesRelevance2, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VibesRelevance OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29116kna copydefault(@NotNull java.lang.String str, @NotNull VibesRelevance vibesRelevance, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vibesRelevance, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new C29116kna(str, vibesRelevance, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29116kna)) {
            return false;
        }
        C29116kna c29116kna = (C29116kna) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c29116kna.EZpvd) && this.AEQbTJ == c29116kna.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c29116kna.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c29116kna.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c29116kna.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c29116kna.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "VibesInfoUiData(vibesScore=" + this.EZpvd + ", relevance=" + this.AEQbTJ + ", mentioned=" + this.copydefault + ", created=" + this.OLrzqt + ", tokenTwitterLink=" + this.KWHzl + ", walletId=" + this.AYXKKw + ")";
    }

    public C29116kna(@NotNull java.lang.String str, @NotNull VibesRelevance vibesRelevance, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(vibesRelevance, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.AEQbTJ = vibesRelevance;
        this.copydefault = str2;
        this.OLrzqt = str3;
        this.KWHzl = str4;
        this.AYXKKw = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:com.okinc.business.market.features.overview.ui.widget.VibesRelevance:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.overview.ui.widget.VibesRelevance:0x000d: SGET  A[WRAPPED] (LINE:208) com.okinc.business.market.features.overview.ui.widget.VibesRelevance.UNRELIABLE com.okinc.business.market.features.overview.ui.widget.VibesRelevance) : (r6v0 com.okinc.business.market.features.overview.ui.widget.VibesRelevance))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
 A[MD:(java.lang.String, com.okinc.business.market.features.overview.ui.widget.VibesRelevance, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:206) call: o.kna.<init>(java.lang.String, com.okinc.business.market.features.overview.ui.widget.VibesRelevance, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C29116kna(java.lang.String str, VibesRelevance vibesRelevance, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? VibesRelevance.UNRELIABLE : vibesRelevance, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
