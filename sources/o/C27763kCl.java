package o;

import com.okinc.business.market.features.watch_list_groups.WatchlistModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.kCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27763kCl implements InterfaceC58162ywA<InterfaceC27771kCt> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC27771kCt get() {
        return KWHzl(this.EZpvd.get(), this.OLrzqt.get());
    }

    public static InterfaceC27771kCt KWHzl(InterfaceC27595jyE interfaceC27595jyE, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC27771kCt) C58165ywD.KWHzl(WatchlistModule.AEQbTJ.copydefault(interfaceC27595jyE, coroutineDispatcher));
    }
}
