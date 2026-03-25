package o;

import com.okinc.ok_kyc_core.di.DiModule;
import dagger.Lazy;

/* JADX INFO: loaded from: classes10.dex */
public final class rAJ implements InterfaceC58162ywA<rDN> {
    public final InterfaceC58164ywC<InterfaceC47278tmy> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public rDN get() {
        return copydefault(C58213ywz.EZpvd(this.KWHzl));
    }

    public static rDN copydefault(Lazy<InterfaceC47278tmy> lazy) {
        return (rDN) C58165ywD.KWHzl(DiModule.EZpvd.EZpvd(lazy));
    }
}
