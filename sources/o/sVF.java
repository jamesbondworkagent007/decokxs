package o;

import com.okinc.oklive.di.NetworkModule;
import dagger.Lazy;

/* JADX INFO: loaded from: classes10.dex */
public final class sVF implements InterfaceC58162ywA<C44540sTs> {
    public final InterfaceC58164ywC<C44535sTn> AEQbTJ;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C44540sTs get() {
        return OLrzqt(C58213ywz.EZpvd(this.AEQbTJ));
    }

    public static C44540sTs OLrzqt(Lazy<C44535sTn> lazy) {
        return (C44540sTs) C58165ywD.KWHzl(NetworkModule.copydefault.KWHzl(lazy));
    }
}
