package o;

import com.okinc.dimodule.DispatcherProvider;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.ngX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34672ngX implements InterfaceC58162ywA<CoroutineDispatcher> {
    public final DispatcherProvider EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return OLrzqt(this.EZpvd);
    }

    public static CoroutineDispatcher OLrzqt(DispatcherProvider dispatcherProvider) {
        return (CoroutineDispatcher) C58165ywD.KWHzl(dispatcherProvider.AEQbTJ());
    }
}
