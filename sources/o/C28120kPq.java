package o;

import com.okinc.business.trade.di.AdvancedMainRepoModule;

/* JADX INFO: renamed from: o.kPq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28120kPq implements InterfaceC58162ywA<InterfaceC28150kQt> {
    public final InterfaceC58164ywC<InterfaceC23225huH> EZpvd;
    public final InterfaceC58164ywC<InterfaceC23234huQ> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28150kQt get() {
        return OLrzqt(this.OLrzqt.get(), this.EZpvd.get());
    }

    public static InterfaceC28150kQt OLrzqt(InterfaceC23234huQ interfaceC23234huQ, InterfaceC23225huH interfaceC23225huH) {
        return (InterfaceC28150kQt) C58165ywD.KWHzl(AdvancedMainRepoModule.KWHzl.copydefault(interfaceC23234huQ, interfaceC23225huH));
    }
}
