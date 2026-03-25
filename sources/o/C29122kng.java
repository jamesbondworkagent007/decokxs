package o;

import com.okinc.business.market.features.position.PositionModule;

/* JADX INFO: renamed from: o.kng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29122kng implements InterfaceC58162ywA<InterfaceC29132knq> {
    public final InterfaceC58164ywC<C27640jyx> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;
    public final InterfaceC58164ywC<C29137knv> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC29132knq get() {
        return KWHzl(this.OLrzqt.get(), this.KWHzl.get(), this.copydefault.get());
    }

    public static InterfaceC29132knq KWHzl(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, C29137knv c29137knv) {
        return (InterfaceC29132knq) C58165ywD.KWHzl(PositionModule.OLrzqt.KWHzl(interfaceC27595jyE, c27640jyx, c29137knv));
    }
}
