package o;

import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.FuturesUnitVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41467qrP {
    public static final int OLrzqt = 8;
    public final java.util.List<InterfaceC41638qub> AEQbTJ;
    public final long AYXKKw;
    public final java.util.List<InterfaceC41638qub> EZpvd;
    public final java.util.List<InterfaceC41638qub> KWHzl;
    public final java.util.List<CategoryGroupVo> copydefault;
    public final java.util.List<FuturesUnitVo> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.qrP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41467qrP copy$default(C41467qrP c41467qrP, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41467qrP.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = c41467qrP.EZpvd;
        }
        java.util.List list6 = list2;
        if ((i & 4) != 0) {
            list3 = c41467qrP.KWHzl;
        }
        java.util.List list7 = list3;
        if ((i & 8) != 0) {
            list4 = c41467qrP.copydefault;
        }
        java.util.List list8 = list4;
        if ((i & 16) != 0) {
            list5 = c41467qrP.djBIcL;
        }
        java.util.List list9 = list5;
        if ((i & 32) != 0) {
            j = c41467qrP.AYXKKw;
        }
        return c41467qrP.copydefault(list, list6, list7, list8, list9, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<CategoryGroupVo> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41467qrP copydefault(java.util.List<? extends InterfaceC41638qub> list, java.util.List<? extends InterfaceC41638qub> list2, java.util.List<? extends InterfaceC41638qub> list3, @NotNull java.util.List<CategoryGroupVo> list4, @NotNull java.util.List<FuturesUnitVo> list5, long j) {
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        return new C41467qrP(list, list2, list3, list4, list5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41638qub> djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41467qrP)) {
            return false;
        }
        C41467qrP c41467qrP = (C41467qrP) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c41467qrP.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c41467qrP.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c41467qrP.KWHzl) && Intrinsics.EZpvd(this.copydefault, c41467qrP.copydefault) && Intrinsics.EZpvd(this.djBIcL, c41467qrP.djBIcL) && this.AYXKKw == c41467qrP.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<InterfaceC41638qub> list = this.AEQbTJ;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<InterfaceC41638qub> list2 = this.EZpvd;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<InterfaceC41638qub> list3 = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + java.lang.Long.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FuturesUnitVo> valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.qub> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41467qrP(java.util.List<? extends InterfaceC41638qub> list, java.util.List<? extends InterfaceC41638qub> list2, java.util.List<? extends InterfaceC41638qub> list3, @NotNull java.util.List<CategoryGroupVo> list4, @NotNull java.util.List<FuturesUnitVo> list5, long j) {
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        this.AEQbTJ = list;
        this.EZpvd = list2;
        this.KWHzl = list3;
        this.copydefault = list4;
        this.djBIcL = list5;
        this.AYXKKw = j;
    }

    public final boolean gEmmrt() {
        return C33129mqd.KWHzl((java.util.Collection) this.AEQbTJ) || C33129mqd.KWHzl((java.util.Collection) this.EZpvd) || C33129mqd.KWHzl((java.util.Collection) this.KWHzl);
    }

    public java.lang.String toString() {
        java.util.List<InterfaceC41638qub> list = this.AEQbTJ;
        java.lang.Integer numValueOf = list != null ? java.lang.Integer.valueOf(list.size()) : null;
        java.util.List<InterfaceC41638qub> list2 = this.EZpvd;
        java.lang.Integer numValueOf2 = list2 != null ? java.lang.Integer.valueOf(list2.size()) : null;
        java.util.List<InterfaceC41638qub> list3 = this.KWHzl;
        return "GetAllFuturesVosResult(swapVoListSize=" + numValueOf + ", futuresVoListSize=" + numValueOf2 + ", premarketVoListSize=" + (list3 != null ? java.lang.Integer.valueOf(list3.size()) : null) + ", categoryGroupVoListSize=" + this.copydefault.size() + ", unitVoListSize=" + this.djBIcL.size() + ", ts=" + this.AYXKKw + ")";
    }
}
