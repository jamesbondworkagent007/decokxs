package o;

import com.okinc.unify_trade.trade.core.config.TradeInit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xNH extends C54588xNy {
    public final java.util.List<C54588xNy> EZpvd;
    public final java.util.ArrayList<TradeInit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xNH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ xNH copy$default(xNH xnh, java.util.ArrayList arrayList, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            arrayList = xnh.copydefault;
        }
        if ((i & 2) != 0) {
            list = xnh.EZpvd;
        }
        return xnh.OLrzqt(arrayList, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C54588xNy
    public java.util.ArrayList<TradeInit> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final xNH OLrzqt(@NotNull java.util.ArrayList<TradeInit> arrayList, @NotNull java.util.List<? extends C54588xNy> list) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new xNH(arrayList, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xNH)) {
            return false;
        }
        xNH xnh = (xNH) obj;
        return Intrinsics.EZpvd(this.copydefault, xnh.copydefault) && Intrinsics.EZpvd(this.EZpvd, xnh.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends o.xNy> */
    /* JADX WARN: Multi-variable type inference failed */
    public xNH(@NotNull java.util.ArrayList<TradeInit> arrayList, @NotNull java.util.List<? extends C54588xNy> list) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = arrayList;
        this.EZpvd = list;
    }

    @Override // o.C54588xNy
    public java.lang.String toString() {
        java.util.List<C54588xNy> list = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C56524yIo.AEQbTJ(((C54588xNy) it.next()).getClass()).valueOf());
        }
        return "MergedInitConfig(tasks=" + AEQbTJ().size() + ", sources=" + arrayList + ")";
    }
}
