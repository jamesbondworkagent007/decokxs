package o;

import com.okinc.unified.di.KlineDiModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.xjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55424xjg implements InterfaceC58162ywA<CoroutineDispatcher> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public CoroutineDispatcher get() {
        return OLrzqt();
    }

    public static CoroutineDispatcher OLrzqt() {
        return (CoroutineDispatcher) C58165ywD.KWHzl(KlineDiModule.EZpvd.copydefault());
    }
}
