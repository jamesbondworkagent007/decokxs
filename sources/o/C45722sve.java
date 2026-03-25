package o;

import com.okinc.okex.lite.hero.di.HeroModule;

/* JADX INFO: renamed from: o.sve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45722sve implements InterfaceC58162ywA<C45708svD> {
    public final InterfaceC58164ywC<android.content.Context> AEQbTJ;
    public final InterfaceC58164ywC<InterfaceC45723svf> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C45708svD get() {
        return OLrzqt(this.copydefault.get(), this.AEQbTJ.get());
    }

    public static C45708svD OLrzqt(InterfaceC45723svf interfaceC45723svf, android.content.Context context) {
        return (C45708svD) C58165ywD.KWHzl(HeroModule.KWHzl.copydefault(interfaceC45723svf, context));
    }
}
