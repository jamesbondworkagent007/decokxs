package o;

import com.okinc.business.market.di.WalletModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: renamed from: o.jzV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27665jzV implements InterfaceC58162ywA<kKD> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<InterfaceC9852bdR> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kKD get() {
        return copydefault(this.copydefault.get(), this.EZpvd.get());
    }

    public static kKD copydefault(InterfaceC9852bdR interfaceC9852bdR, CoroutineDispatcher coroutineDispatcher) {
        return (kKD) C58165ywD.KWHzl(WalletModule.OLrzqt.KWHzl(interfaceC9852bdR, coroutineDispatcher));
    }
}
