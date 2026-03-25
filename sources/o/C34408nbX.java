package o;

import com.okinc.dexkline.market.features.position.PositionModule;

/* JADX INFO: renamed from: o.nbX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34408nbX implements InterfaceC58162ywA<InterfaceC34475ncl> {
    public final InterfaceC58164ywC<C34476ncm> EZpvd;
    public final InterfaceC58164ywC<C32261mVl> OLrzqt;
    public final InterfaceC58164ywC<InterfaceC32260mVk> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC34475ncl get() {
        return OLrzqt(this.copydefault.get(), this.OLrzqt.get(), this.EZpvd.get());
    }

    public static InterfaceC34475ncl OLrzqt(InterfaceC32260mVk interfaceC32260mVk, C32261mVl c32261mVl, C34476ncm c34476ncm) {
        return (InterfaceC34475ncl) C58165ywD.KWHzl(PositionModule.copydefault.OLrzqt(interfaceC32260mVk, c32261mVl, c34476ncm));
    }
}
