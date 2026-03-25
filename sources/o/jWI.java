package o;

import com.okinc.business.market.features.floatwindow.di.FloatWindowModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes7.dex */
public final class jWI implements InterfaceC58162ywA<C26235jWy> {
    public final InterfaceC58164ywC<CoroutineDispatcher> AEQbTJ;
    public final InterfaceC58164ywC<C27670jza> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C26235jWy get() {
        return AEQbTJ(this.copydefault.get(), this.AEQbTJ.get());
    }

    public static C26235jWy AEQbTJ(C27670jza c27670jza, CoroutineDispatcher coroutineDispatcher) {
        return (C26235jWy) C58165ywD.KWHzl(FloatWindowModule.KWHzl.copydefault(c27670jza, coroutineDispatcher));
    }
}
