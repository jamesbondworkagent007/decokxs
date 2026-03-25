package o;

import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41500qrw {
    public final java.lang.String AEQbTJ;
    public final kotlin.Pair<DexSortByEnum, SortOrder> AYXKKw;
    public final InterfaceC41652qup AhwBna;
    public final java.util.List<InterfaceC41655qus> EZpvd;
    public final DexPeriodEnum KWHzl;
    public final DexChainGroupVo OLrzqt;
    public final java.lang.String copydefault;
    public final boolean djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<DexSortByEnum, SortOrder> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<DexSortByEnum, SortOrder> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexChainGroupVo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPeriodEnum OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41500qrw OLrzqt(java.lang.String str, java.lang.String str2, java.util.List<? extends InterfaceC41655qus> list, @NotNull DexChainGroupVo dexChainGroupVo, @NotNull DexPeriodEnum dexPeriodEnum, @NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, @NotNull InterfaceC41652qup interfaceC41652qup, boolean z) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        return new C41500qrw(str, str2, list, dexChainGroupVo, dexPeriodEnum, pair, interfaceC41652qup, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41655qus> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41500qrw)) {
            return false;
        }
        C41500qrw c41500qrw = (C41500qrw) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c41500qrw.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c41500qrw.copydefault) && Intrinsics.EZpvd(this.EZpvd, c41500qrw.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, c41500qrw.OLrzqt) && this.KWHzl == c41500qrw.KWHzl && Intrinsics.EZpvd(this.AYXKKw, c41500qrw.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c41500qrw.AhwBna) && this.djBIcL == c41500qrw.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.util.List<InterfaceC41655qus> list = this.EZpvd;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC41652qup valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends o.qus> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.Pair<? extends com.okinc.market.quotation.ui.model.dex.DexSortByEnum, ? extends com.okinc.market.quotation.ui.model.SortOrder> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41500qrw(java.lang.String str, java.lang.String str2, java.util.List<? extends InterfaceC41655qus> list, @NotNull DexChainGroupVo dexChainGroupVo, @NotNull DexPeriodEnum dexPeriodEnum, @NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair, @NotNull InterfaceC41652qup interfaceC41652qup, boolean z) {
        Intrinsics.checkNotNullParameter(dexChainGroupVo, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(interfaceC41652qup, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = list;
        this.OLrzqt = dexChainGroupVo;
        this.KWHzl = dexPeriodEnum;
        this.AYXKKw = pair;
        this.AhwBna = interfaceC41652qup;
        this.djBIcL = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.util.List)
  (r14v0 com.okinc.market.quotation.ui.model.dex.DexChainGroupVo)
  (r15v0 com.okinc.market.quotation.ui.model.dex.DexPeriodEnum)
  (r16v0 kotlin.Pair)
  (r17v0 o.qup)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.util.List<? extends o.qus>, com.okinc.market.quotation.ui.model.dex.DexChainGroupVo, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, kotlin.Pair<? extends com.okinc.market.quotation.ui.model.dex.DexSortByEnum, ? extends com.okinc.market.quotation.ui.model.SortOrder>, o.qup, boolean):void (m)] (LINE:30) call: o.qrw.<init>(java.lang.String, java.lang.String, java.util.List, com.okinc.market.quotation.ui.model.dex.DexChainGroupVo, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, kotlin.Pair, o.qup, boolean):void type: THIS */
    public /* synthetic */ C41500qrw(java.lang.String str, java.lang.String str2, java.util.List list, DexChainGroupVo dexChainGroupVo, DexPeriodEnum dexPeriodEnum, kotlin.Pair pair, InterfaceC41652qup interfaceC41652qup, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, dexChainGroupVo, dexPeriodEnum, pair, interfaceC41652qup, (i & 128) != 0 ? false : z);
    }

    public java.lang.String toString() {
        java.lang.String str = this.AEQbTJ;
        java.lang.String str2 = this.copydefault;
        java.util.List<InterfaceC41655qus> list = this.EZpvd;
        return "GetDexVosWithWatchingPayload(keyword=" + str + ", groupId=" + str2 + ", allSearchDexVoListSize=" + (list != null ? java.lang.Integer.valueOf(list.size()) : null) + ", chain=" + this.OLrzqt + ", dexPeriod=" + this.KWHzl + ", sorter=" + this.AYXKKw + ", voFactory=" + this.AhwBna + ", useCache=" + this.djBIcL + ")";
    }
}
