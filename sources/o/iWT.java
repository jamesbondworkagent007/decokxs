package o;

import com.okinc.business.invest_biz.data.bean.BackgroundImage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iWT {
    public final java.lang.String AhwBna;
    public final BackgroundImage EZpvd;
    public final iWS OLrzqt;
    public final java.lang.String copydefault;
    public final iWZ djBIcL;
    public final java.lang.String gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final iWT KWHzl = new iWT(new BackgroundImage((java.lang.String) (0 == true ? 1 : 0), (java.lang.String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), "", "", "", null, null, 48, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iWT copy$default(iWT iwt, BackgroundImage backgroundImage, java.lang.String str, java.lang.String str2, java.lang.String str3, iWS iws, iWZ iwz, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            backgroundImage = iwt.EZpvd;
        }
        if ((i & 2) != 0) {
            str = iwt.gEmmrt;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = iwt.AhwBna;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = iwt.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            iws = iwt.OLrzqt;
        }
        iWS iws2 = iws;
        if ((i & 32) != 0) {
            iwz = iwt.djBIcL;
        }
        return iwt.KWHzl(backgroundImage, str4, str5, str6, iws2, iwz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWZ EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWT KWHzl(@NotNull BackgroundImage backgroundImage, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, iWS iws, iWZ iwz) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new iWT(backgroundImage, str, str2, str3, iws, iwz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iWS copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iWT)) {
            return false;
        }
        iWT iwt = (iWT) obj;
        return Intrinsics.EZpvd(this.EZpvd, iwt.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) iwt.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) iwt.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) iwt.copydefault) && Intrinsics.EZpvd(this.OLrzqt, iwt.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, iwt.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AhwBna.hashCode();
        int iHashCode4 = this.copydefault.hashCode();
        iWS iws = this.OLrzqt;
        int iHashCode5 = iws == null ? 0 : iws.hashCode();
        iWZ iwz = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (iwz != null ? iwz.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HeaderUIData(bg=" + this.EZpvd + ", title=" + this.gEmmrt + ", subTitle=" + this.AhwBna + ", logo=" + this.copydefault + ", bonusData=" + this.OLrzqt + ", protocolData=" + this.djBIcL + ")";
    }

    public iWT(@NotNull BackgroundImage backgroundImage, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, iWS iws, iWZ iwz) {
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = backgroundImage;
        this.gEmmrt = str;
        this.AhwBna = str2;
        this.copydefault = str3;
        this.OLrzqt = iws;
        this.djBIcL = iwz;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 com.okinc.business.invest_biz.data.bean.BackgroundImage)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:o.iWS:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null o.iWS) : (r14v0 o.iWS))
  (wrap:o.iWZ:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.iWZ) : (r15v0 o.iWZ))
 A[MD:(com.okinc.business.invest_biz.data.bean.BackgroundImage, java.lang.String, java.lang.String, java.lang.String, o.iWS, o.iWZ):void (m)] (LINE:80) call: o.iWT.<init>(com.okinc.business.invest_biz.data.bean.BackgroundImage, java.lang.String, java.lang.String, java.lang.String, o.iWS, o.iWZ):void type: THIS */
    public /* synthetic */ iWT(BackgroundImage backgroundImage, java.lang.String str, java.lang.String str2, java.lang.String str3, iWS iws, iWZ iwz, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backgroundImage, str, str2, str3, (i & 16) != 0 ? null : iws, (i & 32) != 0 ? null : iwz);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iWT.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final iWT copydefault() {
            return iWT.KWHzl;
        }
    }
}
