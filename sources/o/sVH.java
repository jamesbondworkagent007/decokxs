package o;

import com.okinc.oklive.di.NetworkModule;

/* JADX INFO: loaded from: classes10.dex */
public final class sVH implements InterfaceC58162ywA<C44537sTp> {
    public final InterfaceC58164ywC<C44535sTn> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C44537sTp get() {
        return EZpvd(this.KWHzl.get());
    }

    public static C44537sTp EZpvd(C44535sTn c44535sTn) {
        return (C44537sTp) C58165ywD.KWHzl(NetworkModule.copydefault.copydefault(c44535sTn));
    }
}
