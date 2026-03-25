package o;

import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.data.TacticsListLabelData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wNR {
    public final java.util.List<TacticsInsideItemData> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.util.List<TacticsListLabelData> KWHzl;
    public final java.util.List<TacticsListLabelData> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wNR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ wNR copy$default(wNR wnr, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = wnr.EZpvd;
        }
        if ((i & 2) != 0) {
            list = wnr.copydefault;
        }
        if ((i & 4) != 0) {
            list2 = wnr.KWHzl;
        }
        if ((i & 8) != 0) {
            list3 = wnr.AEQbTJ;
        }
        return wnr.AEQbTJ(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final wNR AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<TacticsListLabelData> list, @NotNull java.util.List<TacticsListLabelData> list2, @NotNull java.util.List<TacticsInsideItemData> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new wNR(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsInsideItemData> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsListLabelData> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<TacticsListLabelData> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wNR)) {
            return false;
        }
        wNR wnr = (wNR) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) wnr.EZpvd) && Intrinsics.EZpvd(this.copydefault, wnr.copydefault) && Intrinsics.EZpvd(this.KWHzl, wnr.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, wnr.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SmartArbDetailItemData(title=" + this.EZpvd + ", leftTagList=" + this.copydefault + ", rightTagList=" + this.KWHzl + ", dataList=" + this.AEQbTJ + ")";
    }

    public wNR(@NotNull java.lang.String str, @NotNull java.util.List<TacticsListLabelData> list, @NotNull java.util.List<TacticsListLabelData> list2, @NotNull java.util.List<TacticsInsideItemData> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.EZpvd = str;
        this.copydefault = list;
        this.KWHzl = list2;
        this.AEQbTJ = list3;
    }
}
