package o;

import com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vog, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51526vog implements InterfaceC47982uAp {
    public final HomeSignalType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeSignalType OLrzqt() {
        return this.OLrzqt;
    }

    public C51526vog(@NotNull HomeSignalType homeSignalType) {
        Intrinsics.checkNotNullParameter(homeSignalType, "");
        this.OLrzqt = homeSignalType;
    }

    @Override // o.InterfaceC47982uAp
    public androidx.fragment.app.Fragment getFragment(java.lang.Object obj) {
        return C51564vpR.Companion.AEQbTJ(this.OLrzqt.getType());
    }
}
