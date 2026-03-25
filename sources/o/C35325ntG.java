package o;

import com.okinc.im.di.CoreModule;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.ntG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35325ntG implements InterfaceC58162ywA<AtomicInteger> {
    public final CoreModule OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public AtomicInteger get() {
        return AEQbTJ(this.OLrzqt);
    }

    public static AtomicInteger AEQbTJ(CoreModule coreModule) {
        return (AtomicInteger) C58165ywD.KWHzl(coreModule.KWHzl());
    }
}
