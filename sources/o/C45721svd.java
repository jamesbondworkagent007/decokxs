package o;

import com.okinc.okex.lite.hero.di.CoroutineScopeModule;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: o.svd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45721svd implements InterfaceC58162ywA<CoroutineExceptionHandler> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public CoroutineExceptionHandler get() {
        return EZpvd();
    }

    public static CoroutineExceptionHandler EZpvd() {
        return (CoroutineExceptionHandler) C58165ywD.KWHzl(CoroutineScopeModule.copydefault.AEQbTJ());
    }
}
