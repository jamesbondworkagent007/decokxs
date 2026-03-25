package o;

import com.okinc.dimodule.DispatcherProvider;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ngW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34671ngW implements InterfaceC58162ywA<CoroutineDispatcher> {
    public final DispatcherProvider copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return OLrzqt(this.copydefault);
    }

    public static CoroutineDispatcher OLrzqt(DispatcherProvider dispatcherProvider) {
        return (CoroutineDispatcher) C58165ywD.KWHzl(dispatcherProvider.KWHzl());
    }
}
