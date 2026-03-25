package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
public final class jWE implements InterfaceC58162ywA<C28434kah> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC28437kak> EZpvd;
    public final InterfaceC58164ywC<C28433kag> KWHzl;
    public final InterfaceC58164ywC<C27670jza> OLrzqt;
    public final InterfaceC58164ywC<kKG> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C28434kah get() {
        return KWHzl(this.EZpvd.get(), this.copydefault.get(), this.KWHzl.get(), this.OLrzqt.get(), this.AEQbTJ.get());
    }

    public static C28434kah KWHzl(InterfaceC28437kak interfaceC28437kak, kKG kkg, C28433kag c28433kag, C27670jza c27670jza, CoroutineDispatcher coroutineDispatcher) {
        return (C28434kah) C58165ywD.KWHzl(FloatWindowModule.KWHzl.AEQbTJ(interfaceC28437kak, kkg, c28433kag, c27670jza, coroutineDispatcher));
    }
}
