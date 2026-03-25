package o;

import com.okinc.dexkline.market.features.history.HistoryChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.mZs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32376mZs implements InterfaceC58162ywA<C32381mZx> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<InterfaceC32260mVk> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C32381mZx get() {
        return OLrzqt(this.OLrzqt.get(), this.EZpvd.get());
    }

    public static C32381mZx OLrzqt(InterfaceC32260mVk interfaceC32260mVk, CoroutineDispatcher coroutineDispatcher) {
        return (C32381mZx) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.EZpvd(interfaceC32260mVk, coroutineDispatcher));
    }
}
