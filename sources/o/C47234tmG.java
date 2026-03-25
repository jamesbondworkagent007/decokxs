package o;

import com.okinc.okuser.hilt.UserModule;
import dagger.Lazy;

/* JADX INFO: renamed from: o.tmG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47234tmG implements InterfaceC58162ywA<InterfaceC47278tmy> {
    public final InterfaceC58164ywC<C47258tme> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC47278tmy get() {
        return AEQbTJ(C58213ywz.EZpvd(this.EZpvd));
    }

    public static InterfaceC47278tmy AEQbTJ(Lazy<C47258tme> lazy) {
        return (InterfaceC47278tmy) C58165ywD.KWHzl(UserModule.EZpvd.KWHzl(lazy));
    }
}
