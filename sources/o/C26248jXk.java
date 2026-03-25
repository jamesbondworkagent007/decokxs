package o;

import com.okinc.business.market.features.history.HistoryChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jXk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26248jXk implements InterfaceC58162ywA<C26253jXp> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> AEQbTJ;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C26253jXp get() {
        return AEQbTJ(this.AEQbTJ.get(), this.copydefault.get());
    }

    public static C26253jXp AEQbTJ(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (C26253jXp) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.OLrzqt(interfaceC27595jyE, coroutineDispatcher));
    }
}
