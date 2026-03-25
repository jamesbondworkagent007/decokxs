package o;

import com.okinc.dexkline.market.features.position.PositionModule;

/* JADX INFO: renamed from: o.nbU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34405nbU implements InterfaceC58162ywA<InterfaceC34472nci> {
    public final InterfaceC58164ywC<InterfaceC32260mVk> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC34472nci get() {
        return copydefault(this.EZpvd.get());
    }

    public static InterfaceC34472nci copydefault(InterfaceC32260mVk interfaceC32260mVk) {
        return (InterfaceC34472nci) C58165ywD.KWHzl(PositionModule.copydefault.OLrzqt(interfaceC32260mVk));
    }
}
