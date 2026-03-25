package o;

import com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22034hVl {
    public ErrorCodeLinkType AEQbTJ;
    public java.lang.String EZpvd;
    public C22035hVm KWHzl;
    public java.lang.String OLrzqt;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22034hVl() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.hVl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22034hVl copy$default(C22034hVl c22034hVl, java.lang.String str, java.util.List list, java.lang.String str2, ErrorCodeLinkType errorCodeLinkType, C22035hVm c22035hVm, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c22034hVl.EZpvd;
        }
        if ((i & 2) != 0) {
            list = c22034hVl.copydefault;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            str2 = c22034hVl.OLrzqt;
        }
        java.lang.String str3 = str2;
        if ((i & 8) != 0) {
            errorCodeLinkType = c22034hVl.AEQbTJ;
        }
        ErrorCodeLinkType errorCodeLinkType2 = errorCodeLinkType;
        if ((i & 16) != 0) {
            c22035hVm = c22034hVl.KWHzl;
        }
        return c22034hVl.AEQbTJ(str, list2, str3, errorCodeLinkType2, c22035hVm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22034hVl AEQbTJ(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull java.lang.String str2, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull C22035hVm c22035hVm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
        Intrinsics.checkNotNullParameter(c22035hVm, "");
        return new C22034hVl(str, list, str2, errorCodeLinkType, c22035hVm);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22035hVm AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22034hVl)) {
            return false;
        }
        C22034hVl c22034hVl = (C22034hVl) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c22034hVl.EZpvd) && Intrinsics.EZpvd(this.copydefault, c22034hVl.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c22034hVl.OLrzqt) && this.AEQbTJ == c22034hVl.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, c22034hVl.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        java.util.List<java.lang.String> list = this.copydefault;
        return (((((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ErrorCodeViewBean(title=" + this.EZpvd + ", subTitle=" + this.copydefault + ", customerServiceUrl=" + this.OLrzqt + ", openLinkType=" + this.AEQbTJ + ", extra=" + this.KWHzl + ")";
    }

    public C22034hVl(@NotNull java.lang.String str, java.util.List<java.lang.String> list, @NotNull java.lang.String str2, @NotNull ErrorCodeLinkType errorCodeLinkType, @NotNull C22035hVm c22035hVm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(errorCodeLinkType, "");
        Intrinsics.checkNotNullParameter(c22035hVm, "");
        this.EZpvd = str;
        this.copydefault = list;
        this.OLrzqt = str2;
        this.AEQbTJ = errorCodeLinkType;
        this.KWHzl = c22035hVm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r16v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType:?: TERNARY null = ((wrap:int:0x0016: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: SGET  A[WRAPPED] (LINE:186) com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType.DEFAULT_TYPE com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType) : (r14v0 com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType))
  (wrap:o.hVm:?: TERNARY null = ((wrap:int:0x001e: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0030: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:187) call: o.hVm.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 o.hVm))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.String, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, o.hVm):void (m)] (LINE:182) call: o.hVl.<init>(java.lang.String, java.util.List, java.lang.String, com.okinc.business.dexui.main.swap.history.detail.contants.ErrorCodeLinkType, o.hVm):void type: THIS */
    public /* synthetic */ C22034hVl(java.lang.String str, java.util.List list, java.lang.String str2, ErrorCodeLinkType errorCodeLinkType, C22035hVm c22035hVm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? ErrorCodeLinkType.DEFAULT_TYPE : errorCodeLinkType, (i & 16) != 0 ? new C22035hVm(null, null, null, 7, null) : c22035hVm);
    }

    public final boolean gEmmrt() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd);
    }

    public final boolean valueOf() {
        return this.AEQbTJ == ErrorCodeLinkType.CUSTOMER_SERVICE_TYPE;
    }

    public final boolean values() {
        return this.AEQbTJ == ErrorCodeLinkType.SHADOW_ASSETS_TYPE;
    }

    public final boolean AhwBna() {
        return this.AEQbTJ == ErrorCodeLinkType.FACET_REDEEM_TYPE;
    }

    public final boolean djBIcL() {
        return this.AEQbTJ == ErrorCodeLinkType.GUIDE_URL_TYPE;
    }

    public final boolean AYXKKw() {
        return valueOf() || values() || AhwBna() || djBIcL();
    }

    public final java.lang.String OLrzqt() {
        if (values()) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.hPlhRW);
        }
        if (AhwBna()) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.OVMstZ);
        }
        if (djBIcL()) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.DtnWsU);
        }
        return C33070mpX.AYXKKw(C23274hvD.Fragment.QOeQqh);
    }
}
