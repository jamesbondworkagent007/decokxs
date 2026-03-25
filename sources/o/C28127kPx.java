package o;

import com.okinc.business.trade.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.kPx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28127kPx implements InterfaceC58162ywA<gYO> {
    public final InterfaceC58164ywC<gYL> OLrzqt;
    public final InterfaceC58164ywC<CoroutineDispatcher> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public gYO get() {
        return AEQbTJ(this.OLrzqt.get(), this.copydefault.get());
    }

    public static gYO AEQbTJ(gYL gyl, CoroutineDispatcher coroutineDispatcher) {
        return (gYO) C58165ywD.KWHzl(RepositoryModule.copydefault.OLrzqt(gyl, coroutineDispatcher));
    }
}
