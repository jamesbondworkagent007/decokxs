package o;

import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.remote.networkmodel.MultiVendorTokenResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SSLErrorModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rFR {
    public java.lang.String AEQbTJ;
    public VendorConfig AYXKKw;
    public MultiVendorTokenResp AhwBna;
    public java.util.List<java.lang.Integer> EZpvd;
    public java.lang.String KWHzl;
    public int OLrzqt;
    public java.util.HashMap<java.lang.String, java.lang.String> copydefault;
    public java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public SSLErrorModel valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rFR AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.Integer> list, int i, @NotNull SSLErrorModel sSLErrorModel, @NotNull MultiVendorTokenResp multiVendorTokenResp, VendorConfig vendorConfig, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sSLErrorModel, "");
        Intrinsics.checkNotNullParameter(multiVendorTokenResp, "");
        return new rFR(str, str2, map, list, i, sSLErrorModel, multiVendorTokenResp, vendorConfig, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorConfig djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rFR)) {
            return false;
        }
        rFR rfr = (rFR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) rfr.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) rfr.djBIcL) && Intrinsics.EZpvd(this.copydefault, rfr.copydefault) && Intrinsics.EZpvd(this.EZpvd, rfr.EZpvd) && this.OLrzqt == rfr.OLrzqt && Intrinsics.EZpvd(this.valueOf, rfr.valueOf) && Intrinsics.EZpvd(this.AhwBna, rfr.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, rfr.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) rfr.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) rfr.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiVendorTokenResp gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.EZpvd.hashCode();
        int iHashCode5 = java.lang.Integer.hashCode(this.OLrzqt);
        int iHashCode6 = this.valueOf.hashCode();
        int iHashCode7 = this.AhwBna.hashCode();
        VendorConfig vendorConfig = this.AYXKKw;
        int iHashCode8 = vendorConfig == null ? 0 : vendorConfig.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JumpVendorData(id=" + this.gEmmrt + ", target=" + this.djBIcL + ", ctaValue=" + this.copydefault + ", featureList=" + this.EZpvd + ", forceUseBackEndConfig=" + this.OLrzqt + ", sslErrorModel=" + this.valueOf + ", tokenData=" + this.AhwBna + ", vendorConfig=" + this.AYXKKw + ", cardSessionId=" + this.KWHzl + ", cardCheckType=" + this.AEQbTJ + ")";
    }

    public rFR(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull java.util.List<java.lang.Integer> list, int i, @NotNull SSLErrorModel sSLErrorModel, @NotNull MultiVendorTokenResp multiVendorTokenResp, VendorConfig vendorConfig, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(sSLErrorModel, "");
        Intrinsics.checkNotNullParameter(multiVendorTokenResp, "");
        this.gEmmrt = str;
        this.djBIcL = str2;
        this.copydefault = map;
        this.EZpvd = list;
        this.OLrzqt = i;
        this.valueOf = sSLErrorModel;
        this.AhwBna = multiVendorTokenResp;
        this.AYXKKw = vendorConfig;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
    }
}
