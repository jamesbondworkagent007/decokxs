package o;

import com.okinc.ok_kyc_core.data.NavOptions;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43700ruI {
    public final OnDemandKYCAppModel AEQbTJ;
    public final java.lang.Boolean AYXKKw;
    public final java.lang.String EZpvd;
    public final java.util.HashMap<java.lang.String, java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final NavOptions copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.ruI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C43700ruI copy$default(C43700ruI c43700ruI, OnDemandKYCAppModel onDemandKYCAppModel, java.lang.String str, java.lang.String str2, java.util.HashMap map, NavOptions navOptions, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            onDemandKYCAppModel = c43700ruI.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c43700ruI.EZpvd;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            str2 = c43700ruI.OLrzqt;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            map = c43700ruI.KWHzl;
        }
        java.util.HashMap map2 = map;
        if ((i & 16) != 0) {
            navOptions = c43700ruI.copydefault;
        }
        NavOptions navOptions2 = navOptions;
        if ((i & 32) != 0) {
            bool = c43700ruI.AYXKKw;
        }
        return c43700ruI.AEQbTJ(onDemandKYCAppModel, str3, str4, map2, navOptions2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C43700ruI AEQbTJ(@NotNull OnDemandKYCAppModel onDemandKYCAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull NavOptions navOptions, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(onDemandKYCAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        return new C43700ruI(onDemandKYCAppModel, str, str2, map, navOptions, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.HashMap<java.lang.String, java.lang.String> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnDemandKYCAppModel OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NavOptions copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43700ruI)) {
            return false;
        }
        C43700ruI c43700ruI = (C43700ruI) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c43700ruI.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c43700ruI.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c43700ruI.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c43700ruI.KWHzl) && this.copydefault == c43700ruI.copydefault && Intrinsics.EZpvd(this.AYXKKw, c43700ruI.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        java.lang.String str = this.OLrzqt;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.KWHzl.hashCode();
        int iHashCode5 = this.copydefault.hashCode();
        java.lang.Boolean bool = this.AYXKKw;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PageComponentAppModelEventInfo(onDemandKYCAppModel=" + this.AEQbTJ + ", playbook=" + this.EZpvd + ", redirectUrl=" + this.OLrzqt + ", playbookParams=" + this.KWHzl + ", navOptions=" + this.copydefault + ", updateInitModel=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean valueOf() {
        return this.AYXKKw;
    }

    public C43700ruI(@NotNull OnDemandKYCAppModel onDemandKYCAppModel, @NotNull java.lang.String str, java.lang.String str2, @NotNull java.util.HashMap<java.lang.String, java.lang.String> map, @NotNull NavOptions navOptions, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(onDemandKYCAppModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(navOptions, "");
        this.AEQbTJ = onDemandKYCAppModel;
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = map;
        this.copydefault = navOptions;
        this.AYXKKw = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r8v0 com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.util.HashMap)
  (wrap:com.okinc.ok_kyc_core.data.NavOptions:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core.data.NavOptions:0x0004: SGET  A[WRAPPED] (LINE:10) com.okinc.ok_kyc_core.data.NavOptions.Default com.okinc.ok_kyc_core.data.NavOptions) : (r12v0 com.okinc.ok_kyc_core.data.NavOptions))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r13v0 java.lang.Boolean))
 A[MD:(com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel, java.lang.String, java.lang.String, java.util.HashMap<java.lang.String, java.lang.String>, com.okinc.ok_kyc_core.data.NavOptions, java.lang.Boolean):void (m)] (LINE:5) call: o.ruI.<init>(com.okinc.ok_kyc_core.data.remote.networkmodel.OnDemandKYCAppModel, java.lang.String, java.lang.String, java.util.HashMap, com.okinc.ok_kyc_core.data.NavOptions, java.lang.Boolean):void type: THIS */
    public /* synthetic */ C43700ruI(OnDemandKYCAppModel onDemandKYCAppModel, java.lang.String str, java.lang.String str2, java.util.HashMap map, NavOptions navOptions, java.lang.Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(onDemandKYCAppModel, str, str2, map, (i & 16) != 0 ? NavOptions.Default : navOptions, (i & 32) != 0 ? java.lang.Boolean.FALSE : bool);
    }
}
