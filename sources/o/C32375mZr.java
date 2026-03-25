package o;

import com.okinc.dexkline.market.features.history.HistoryChangeModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.mZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32375mZr implements InterfaceC58162ywA<C32378mZu> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<C32374mZq> KWHzl;
    public final InterfaceC58164ywC<C32261mVl> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC32260mVk> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C32378mZu get() {
        return KWHzl(this.copydefault.get(), this.KWHzl.get(), this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static C32378mZu KWHzl(InterfaceC32260mVk interfaceC32260mVk, C32374mZq c32374mZq, C32261mVl c32261mVl, CoroutineDispatcher coroutineDispatcher) {
        return (C32378mZu) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.AEQbTJ(interfaceC32260mVk, c32374mZq, c32261mVl, coroutineDispatcher));
    }
}
