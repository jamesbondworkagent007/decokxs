package o;

import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41455qrD {
    public final SortOrder AEQbTJ;
    public final DexSortByEnum EZpvd;
    public final DexPeriodEnum KWHzl;
    public final java.util.List<InterfaceC41655qus> OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.qrD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C41455qrD copy$default(C41455qrD c41455qrD, java.util.List list, DexSortByEnum dexSortByEnum, SortOrder sortOrder, DexPeriodEnum dexPeriodEnum, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c41455qrD.OLrzqt;
        }
        if ((i & 2) != 0) {
            dexSortByEnum = c41455qrD.EZpvd;
        }
        DexSortByEnum dexSortByEnum2 = dexSortByEnum;
        if ((i & 4) != 0) {
            sortOrder = c41455qrD.AEQbTJ;
        }
        SortOrder sortOrder2 = sortOrder;
        if ((i & 8) != 0) {
            dexPeriodEnum = c41455qrD.KWHzl;
        }
        DexPeriodEnum dexPeriodEnum2 = dexPeriodEnum;
        if ((i & 16) != 0) {
            z = c41455qrD.copydefault;
        }
        return c41455qrD.EZpvd(list, dexSortByEnum2, sortOrder2, dexPeriodEnum2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<InterfaceC41655qus> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C41455qrD EZpvd(@NotNull java.util.List<? extends InterfaceC41655qus> list, @NotNull DexSortByEnum dexSortByEnum, @NotNull SortOrder sortOrder, @NotNull DexPeriodEnum dexPeriodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(dexSortByEnum, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        return new C41455qrD(list, dexSortByEnum, sortOrder, dexPeriodEnum, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSortByEnum KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexPeriodEnum OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SortOrder copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41455qrD)) {
            return false;
        }
        C41455qrD c41455qrD = (C41455qrD) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c41455qrD.OLrzqt) && this.EZpvd == c41455qrD.EZpvd && this.AEQbTJ == c41455qrD.AEQbTJ && this.KWHzl == c41455qrD.KWHzl && this.copydefault == c41455qrD.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.qus> */
    /* JADX WARN: Multi-variable type inference failed */
    public C41455qrD(@NotNull java.util.List<? extends InterfaceC41655qus> list, @NotNull DexSortByEnum dexSortByEnum, @NotNull SortOrder sortOrder, @NotNull DexPeriodEnum dexPeriodEnum, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(dexSortByEnum, "");
        Intrinsics.checkNotNullParameter(sortOrder, "");
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        this.OLrzqt = list;
        this.EZpvd = dexSortByEnum;
        this.AEQbTJ = sortOrder;
        this.KWHzl = dexPeriodEnum;
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.util.List)
  (r8v0 com.okinc.market.quotation.ui.model.dex.DexSortByEnum)
  (r9v0 com.okinc.market.quotation.ui.model.SortOrder)
  (r10v0 com.okinc.market.quotation.ui.model.dex.DexPeriodEnum)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(java.util.List<? extends o.qus>, com.okinc.market.quotation.ui.model.dex.DexSortByEnum, com.okinc.market.quotation.ui.model.SortOrder, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, boolean):void (m)] (LINE:32) call: o.qrD.<init>(java.util.List, com.okinc.market.quotation.ui.model.dex.DexSortByEnum, com.okinc.market.quotation.ui.model.SortOrder, com.okinc.market.quotation.ui.model.dex.DexPeriodEnum, boolean):void type: THIS */
    public /* synthetic */ C41455qrD(java.util.List list, DexSortByEnum dexSortByEnum, SortOrder sortOrder, DexPeriodEnum dexPeriodEnum, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, dexSortByEnum, sortOrder, dexPeriodEnum, (i & 16) != 0 ? true : z);
    }

    public java.lang.String toString() {
        return "SubscribeDexVosPayload(dexVoListSize=" + this.OLrzqt.size() + ", sortBy=" + this.EZpvd + ", sortOrder=" + this.AEQbTJ + ", period=" + this.KWHzl + ", isEnableWsTickers=" + this.copydefault + ")";
    }
}
