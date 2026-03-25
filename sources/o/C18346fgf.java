package o;

import com.okinc.business.defi.biz.walletconnect.WCSessionMeta;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18346fgf {
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final WCSessionMeta KWHzl;
    public final boolean OLrzqt;
    public final AbstractC12782ctV copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18346fgf() {
        this(null, null, null, null, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18346fgf copy$default(C18346fgf c18346fgf, java.lang.Integer num, WCSessionMeta wCSessionMeta, AbstractC12782ctV abstractC12782ctV, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c18346fgf.EZpvd;
        }
        if ((i & 2) != 0) {
            wCSessionMeta = c18346fgf.KWHzl;
        }
        WCSessionMeta wCSessionMeta2 = wCSessionMeta;
        if ((i & 4) != 0) {
            abstractC12782ctV = c18346fgf.copydefault;
        }
        AbstractC12782ctV abstractC12782ctV2 = abstractC12782ctV;
        if ((i & 8) != 0) {
            str = c18346fgf.AEQbTJ;
        }
        java.lang.String str2 = str;
        if ((i & 16) != 0) {
            z = c18346fgf.OLrzqt;
        }
        return c18346fgf.copydefault(num, wCSessionMeta2, abstractC12782ctV2, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18346fgf copydefault(java.lang.Integer num, WCSessionMeta wCSessionMeta, AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C18346fgf(num, wCSessionMeta, abstractC12782ctV, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18346fgf)) {
            return false;
        }
        C18346fgf c18346fgf = (C18346fgf) obj;
        return Intrinsics.EZpvd(this.EZpvd, c18346fgf.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c18346fgf.KWHzl) && Intrinsics.EZpvd(this.copydefault, c18346fgf.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c18346fgf.AEQbTJ) && this.OLrzqt == c18346fgf.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iHashCode = num == null ? 0 : num.hashCode();
        WCSessionMeta wCSessionMeta = this.KWHzl;
        int iHashCode2 = wCSessionMeta == null ? 0 : wCSessionMeta.hashCode();
        AbstractC12782ctV abstractC12782ctV = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (abstractC12782ctV != null ? abstractC12782ctV.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletConnectConnectionViewState(connectState=" + this.EZpvd + ", sessionData=" + this.KWHzl + ", wallet=" + this.copydefault + ", topic=" + this.AEQbTJ + ", isWalletNotSupported=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.OLrzqt;
    }

    public C18346fgf(java.lang.Integer num, WCSessionMeta wCSessionMeta, AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = num;
        this.KWHzl = wCSessionMeta;
        this.copydefault = abstractC12782ctV;
        this.AEQbTJ = str;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:com.okinc.business.defi.biz.walletconnect.WCSessionMeta:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.walletconnect.WCSessionMeta) : (r5v0 com.okinc.business.defi.biz.walletconnect.WCSessionMeta))
  (wrap:o.ctV:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 o.ctV) : (null o.ctV))
  (wrap:java.lang.String:0x001b: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.Integer, com.okinc.business.defi.biz.walletconnect.WCSessionMeta, o.ctV, java.lang.String, boolean):void (m)] (LINE:159) call: o.fgf.<init>(java.lang.Integer, com.okinc.business.defi.biz.walletconnect.WCSessionMeta, o.ctV, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C18346fgf(java.lang.Integer num, WCSessionMeta wCSessionMeta, AbstractC12782ctV abstractC12782ctV, java.lang.String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : wCSessionMeta, (i & 4) == 0 ? abstractC12782ctV : null, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z);
    }

    public final java.lang.CharSequence AhwBna() {
        return C14733dqy.copydefault.KWHzl(this.copydefault);
    }

    public final java.lang.String copydefault() {
        WCSessionMeta wCSessionMeta = this.KWHzl;
        java.lang.String projectName = wCSessionMeta != null ? wCSessionMeta.getProjectName() : null;
        return projectName == null ? "" : projectName;
    }

    public final java.lang.String AEQbTJ() {
        WCSessionMeta wCSessionMeta = this.KWHzl;
        java.lang.String url = wCSessionMeta != null ? wCSessionMeta.getUrl() : null;
        return url == null ? "" : url;
    }

    public final java.lang.String OLrzqt() {
        java.util.List<java.lang.String> icons;
        WCSessionMeta wCSessionMeta = this.KWHzl;
        java.lang.String str = (wCSessionMeta == null || (icons = wCSessionMeta.getIcons()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(icons);
        return str == null ? "" : str;
    }

    public final java.util.List<C10854bwM> EZpvd() {
        return WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).KWHzl(this.AEQbTJ);
    }

    public final java.util.List<C10854bwM> gEmmrt() {
        return WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).valueOf(this.AEQbTJ);
    }
}
