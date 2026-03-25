package o;

import com.okinc.tradingbot.impl.order.strategy.spotdca.binder.ExplainItemModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wiO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53271wiO implements InterfaceC47982uAp {
    public final java.util.ArrayList<ExplainItemModel> KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public C53271wiO(@NotNull java.lang.String str, @NotNull java.util.ArrayList<ExplainItemModel> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.OLrzqt = str;
        this.KWHzl = arrayList;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        return C53269wiM.Companion.KWHzl(this.KWHzl);
    }
}
