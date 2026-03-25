package o;

import com.okinc.market.di.MarketDIModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes9.dex */
public final class pXO implements InterfaceC58162ywA<CoroutineDispatcher> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return copydefault();
    }

    public static CoroutineDispatcher copydefault() {
        return (CoroutineDispatcher) C58165ywD.KWHzl(MarketDIModule.KWHzl.gEmmrt());
    }
}
