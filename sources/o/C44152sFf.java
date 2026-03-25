package o;

import com.okinc.okimcore.di.WebSocketModule;
import kotlinx.coroutines.sync.Semaphore;

/* JADX INFO: renamed from: o.sFf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44152sFf implements InterfaceC58162ywA<Semaphore> {
    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public Semaphore get() {
        return OLrzqt();
    }

    public static Semaphore OLrzqt() {
        return (Semaphore) C58165ywD.KWHzl(WebSocketModule.copydefault.KWHzl());
    }
}
