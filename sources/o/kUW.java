package o;

import com.okinc.business.trade.features.home.meme.di.MemePresetConfigModule;

/* JADX INFO: loaded from: classes7.dex */
public final class kUW implements InterfaceC58162ywA<kVC> {
    public final InterfaceC58164ywC<InterfaceC25414iwK> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC23234huQ> KWHzl;
    public final InterfaceC58164ywC<kVH> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public kVC get() {
        return AEQbTJ(this.KWHzl.get(), this.AEQbTJ.get(), this.copydefault.get());
    }

    public static kVC AEQbTJ(InterfaceC23234huQ interfaceC23234huQ, InterfaceC25414iwK interfaceC25414iwK, kVH kvh) {
        return (kVC) C58165ywD.KWHzl(MemePresetConfigModule.OLrzqt.KWHzl(interfaceC23234huQ, interfaceC25414iwK, kvh));
    }
}
