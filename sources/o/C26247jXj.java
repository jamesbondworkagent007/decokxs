package o;

import com.okinc.business.market.features.history.HistoryChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26247jXj implements InterfaceC58162ywA<C26252jXo> {
    public final InterfaceC58164ywC<C26244jXg> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C26252jXo get() {
        return KWHzl(this.OLrzqt.get(), this.AEQbTJ.get(), this.EZpvd.get(), this.copydefault.get());
    }

    public static C26252jXo KWHzl(InterfaceC27595jyE interfaceC27595jyE, C26244jXg c26244jXg, C27640jyx c27640jyx, CoroutineDispatcher coroutineDispatcher) {
        return (C26252jXo) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.KWHzl(interfaceC27595jyE, c26244jXg, c27640jyx, coroutineDispatcher));
    }
}
