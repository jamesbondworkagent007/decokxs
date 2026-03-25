package o;

import com.okinc.business.trade.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.kPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28126kPw implements InterfaceC58162ywA<InterfaceC20053gZd> {
    public final InterfaceC58164ywC<CoroutineDispatcher> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC20052gZc> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC20053gZd get() {
        return KWHzl(this.copydefault.get(), this.OLrzqt.get());
    }

    public static InterfaceC20053gZd KWHzl(InterfaceC20052gZc interfaceC20052gZc, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC20053gZd) C58165ywD.KWHzl(RepositoryModule.copydefault.OLrzqt(interfaceC20052gZc, coroutineDispatcher));
    }
}
