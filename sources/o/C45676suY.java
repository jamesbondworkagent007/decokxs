package o;

import com.okinc.okex.lite.hero.di.CoroutineScopeModule;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: o.suY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45676suY implements InterfaceC58162ywA<CoroutineScope> {
    public final InterfaceC58164ywC<CoroutineExceptionHandler> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CoroutineScope get() {
        return KWHzl(this.EZpvd.get());
    }

    public static CoroutineScope KWHzl(CoroutineExceptionHandler coroutineExceptionHandler) {
        return (CoroutineScope) C58165ywD.KWHzl(CoroutineScopeModule.copydefault.copydefault(coroutineExceptionHandler));
    }
}
