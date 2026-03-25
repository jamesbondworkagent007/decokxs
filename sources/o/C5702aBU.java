package o;

import com.okinc.auth.impl.guard.utils.BiometricServiceModule;

/* JADX INFO: renamed from: o.aBU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5702aBU implements InterfaceC58162ywA<InterfaceC5697aBP> {
    public final BiometricServiceModule EZpvd;
    public final InterfaceC58164ywC<C5698aBQ> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5697aBP get() {
        return OLrzqt(this.EZpvd, this.KWHzl.get());
    }

    public static InterfaceC5697aBP OLrzqt(BiometricServiceModule biometricServiceModule, C5698aBQ c5698aBQ) {
        return (InterfaceC5697aBP) C58165ywD.KWHzl(biometricServiceModule.KWHzl(c5698aBQ));
    }
}
