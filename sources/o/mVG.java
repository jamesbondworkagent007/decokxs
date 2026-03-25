package o;

import com.okinc.dexkline.market.di.RepositoryModule;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes8.dex */
public final class mVG implements InterfaceC58162ywA<mWI> {
    public final InterfaceC58164ywC<InterfaceC32162mRu> EZpvd;
    public final InterfaceC58164ywC<CoroutineDispatcher> KWHzl;
    public final InterfaceC58164ywC<C32261mVl> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public mWI get() {
        return AEQbTJ(this.EZpvd.get(), this.OLrzqt.get(), this.KWHzl.get());
    }

    public static mWI AEQbTJ(InterfaceC32162mRu interfaceC32162mRu, C32261mVl c32261mVl, CoroutineDispatcher coroutineDispatcher) {
        return (mWI) C58165ywD.KWHzl(RepositoryModule.AEQbTJ.AEQbTJ(interfaceC32162mRu, c32261mVl, coroutineDispatcher));
    }
}
