package o;

import com.okinc.lifecycle.impl.di.ClipBoardModule;

/* JADX INFO: renamed from: o.pNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38124pNc implements InterfaceC58162ywA<InterfaceC38073pLf> {
    public final ClipBoardModule copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC38073pLf get() {
        return OLrzqt(this.copydefault);
    }

    public static InterfaceC38073pLf OLrzqt(ClipBoardModule clipBoardModule) {
        return (InterfaceC38073pLf) C58165ywD.KWHzl(clipBoardModule.copydefault());
    }
}
