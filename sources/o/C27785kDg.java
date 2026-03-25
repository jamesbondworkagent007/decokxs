package o;

import com.okinc.business.market.features.watchlist_cache.WatchlistCacheModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.kDg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27785kDg implements InterfaceC58162ywA<C27781kDc> {
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C27781kDc get() {
        return OLrzqt(this.OLrzqt.get(), this.KWHzl.get());
    }

    public static C27781kDc OLrzqt(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (C27781kDc) C58165ywD.KWHzl(WatchlistCacheModule.AEQbTJ.AEQbTJ(interfaceC27595jyE, coroutineDispatcher));
    }
}
