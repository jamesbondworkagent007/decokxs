package o;

import com.okinc.business.trade.features.home.meme.di.MemePresetConfigModule;

/* JADX INFO: loaded from: classes7.dex */
public final class kUR implements InterfaceC58162ywA<InterfaceC28281kVp> {
    public final InterfaceC58164ywC<InterfaceC28370kYx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC23234huQ> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28281kVp get() {
        return OLrzqt(this.KWHzl.get(), this.EZpvd.get());
    }

    public static InterfaceC28281kVp OLrzqt(InterfaceC23234huQ interfaceC23234huQ, InterfaceC28370kYx interfaceC28370kYx) {
        return (InterfaceC28281kVp) C58165ywD.KWHzl(MemePresetConfigModule.OLrzqt.copydefault(interfaceC23234huQ, interfaceC28370kYx));
    }
}
