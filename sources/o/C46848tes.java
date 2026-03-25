package o;

import androidx.lifecycle.ViewModel;
import com.okinc.market.common.biz_spot.bean.UnifiedPriceRemind;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tes, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46848tes extends ViewModel {
    public boolean EZpvd;
    public pWL KWHzl;
    public UnifiedPriceRemind copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pWL KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnifiedPriceRemind OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.EZpvd = z;
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull android.content.Context context, int i) {
        java.lang.String strCopydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentIsConnected;
        java.lang.String titleByIdAndType$default = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(context, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null && (bizInstrumentIsConnected = abstractC54531xLwOLrzqt.isConnected(str)) != null && bizInstrumentIsConnected.isPreMarketPair()) {
            strCopydefault = C40381qTt.copydefault.copydefault(str);
            if (strCopydefault == null) {
            }
            this.copydefault = new UnifiedPriceRemind(strCopydefault, str2, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, i, 120, (DefaultConstructorMarker) null);
        }
        titleByIdAndType$default = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, str, str2, false, false, false, 28, null);
        strCopydefault = titleByIdAndType$default;
        this.copydefault = new UnifiedPriceRemind(strCopydefault, str2, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, i, 120, (DefaultConstructorMarker) null);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = new pWL(str, str2);
    }

    public final int copydefault(@NotNull java.util.ArrayList<C46707tcJ> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C46707tcJ) it.next()).AEQbTJ());
        }
        return C56403yEb.QOLQEE(arrayList2).size();
    }
}
