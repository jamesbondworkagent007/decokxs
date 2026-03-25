package o;

import com.okinc.okex.lite.hero.di.HeroModule;

/* JADX INFO: renamed from: o.svh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45725svh implements InterfaceC58162ywA<C45743svz> {
    public final InterfaceC58164ywC<C45706svB> KWHzl;
    public final InterfaceC58164ywC<C45708svD> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C45743svz get() {
        return OLrzqt(this.KWHzl.get(), this.OLrzqt.get());
    }

    public static C45743svz OLrzqt(C45706svB c45706svB, C45708svD c45708svD) {
        return (C45743svz) C58165ywD.KWHzl(HeroModule.KWHzl.AEQbTJ(c45706svB, c45708svD));
    }
}
