package o;

import com.okinc.im.di.CoreModule;

/* JADX INFO: renamed from: o.ntC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35321ntC implements InterfaceC58162ywA<sIR> {
    public final CoreModule EZpvd;
    public final InterfaceC58164ywC<sHZ> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public sIR get() {
        return OLrzqt(this.EZpvd, this.KWHzl.get());
    }

    public static sIR OLrzqt(CoreModule coreModule, sHZ shz) {
        return (sIR) C58165ywD.KWHzl(coreModule.copydefault(shz));
    }
}
