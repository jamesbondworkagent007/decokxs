package o;

import com.okinc.dexkline.market.di.RepositoryModule;

/* JADX INFO: loaded from: classes8.dex */
public final class mVF implements InterfaceC58162ywA<mXP> {
    public final InterfaceC58164ywC<InterfaceC32162mRu> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public mXP get() {
        return KWHzl(this.KWHzl.get());
    }

    public static mXP KWHzl(InterfaceC32162mRu interfaceC32162mRu) {
        return (mXP) C58165ywD.KWHzl(RepositoryModule.AEQbTJ.copydefault(interfaceC32162mRu));
    }
}
