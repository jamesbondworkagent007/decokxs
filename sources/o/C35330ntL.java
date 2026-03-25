package o;

import com.okinc.im.di.IMDispatcherModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ntL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35330ntL implements InterfaceC58162ywA<CoroutineDispatcher> {
    public final IMDispatcherModule EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return copydefault(this.EZpvd);
    }

    public static CoroutineDispatcher copydefault(IMDispatcherModule iMDispatcherModule) {
        return (CoroutineDispatcher) C58165ywD.KWHzl(iMDispatcherModule.AEQbTJ());
    }
}
