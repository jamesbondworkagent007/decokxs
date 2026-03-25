package o;

import com.okinc.dexkline.market.di.WalletModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
public final class mVH implements InterfaceC58162ywA<InterfaceC34581nel> {
    public final InterfaceC58164ywC<CoroutineDispatcher> EZpvd;
    public final InterfaceC58164ywC<InterfaceC9852bdR> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC34581nel get() {
        return copydefault(this.copydefault.get(), this.EZpvd.get());
    }

    public static InterfaceC34581nel copydefault(InterfaceC9852bdR interfaceC9852bdR, CoroutineDispatcher coroutineDispatcher) {
        return (InterfaceC34581nel) C58165ywD.KWHzl(WalletModule.EZpvd.AEQbTJ(interfaceC9852bdR, coroutineDispatcher));
    }
}
