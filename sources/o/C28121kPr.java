package o;

import com.okinc.business.trade.di.AdvancedMainRepoModule;

/* JADX INFO: renamed from: o.kPr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28121kPr implements InterfaceC58162ywA<InterfaceC28152kQv> {
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC23229huL> KWHzl;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC23234huQ> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28152kQv get() {
        return AEQbTJ(this.EZpvd.get(), this.OLrzqt.get(), this.copydefault.get(), this.KWHzl.get());
    }

    public static InterfaceC28152kQv AEQbTJ(C27640jyx c27640jyx, C27640jyx c27640jyx2, InterfaceC23234huQ interfaceC23234huQ, InterfaceC23229huL interfaceC23229huL) {
        return (InterfaceC28152kQv) C58165ywD.KWHzl(AdvancedMainRepoModule.KWHzl.copydefault(c27640jyx, c27640jyx2, interfaceC23234huQ, interfaceC23229huL));
    }
}
