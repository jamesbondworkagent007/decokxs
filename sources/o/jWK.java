package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
public final class jWK implements InterfaceC58162ywA<kKG> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<kKD> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public kKG get() {
        return AEQbTJ(this.OLrzqt.get(), this.EZpvd.get());
    }

    public static kKG AEQbTJ(kKD kkd, CoroutineDispatcher coroutineDispatcher) {
        return (kKG) C58165ywD.KWHzl(FloatWindowModule.KWHzl.AEQbTJ(kkd, coroutineDispatcher));
    }
}
