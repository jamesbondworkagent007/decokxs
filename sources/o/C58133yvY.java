package o;

import o.C58134yvZ;

/* JADX INFO: renamed from: o.yvY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58133yvY implements InterfaceC58162ywA<C58134yvZ.ActionBar> {
    public final InterfaceC58164ywC<InterfaceC58128yvT> AEQbTJ;
    public final InterfaceC58164ywC<java.util.Map<java.lang.Class<?>, java.lang.Boolean>> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C58134yvZ.ActionBar get() {
        return KWHzl(this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static C58134yvZ.ActionBar KWHzl(java.util.Map<java.lang.Class<?>, java.lang.Boolean> map, InterfaceC58128yvT interfaceC58128yvT) {
        return new C58134yvZ.ActionBar(map, interfaceC58128yvT);
    }
}
