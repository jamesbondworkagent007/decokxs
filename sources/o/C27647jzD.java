package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27647jzD implements InterfaceC58162ywA<InterfaceC28699kfh> {
    public final InterfaceC58164ywC<Json> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> KWHzl;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28699kfh get() {
        return KWHzl(this.KWHzl.get(), this.AEQbTJ.get());
    }

    public static InterfaceC28699kfh KWHzl(C27640jyx c27640jyx, Json json) {
        return (InterfaceC28699kfh) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(c27640jyx, json));
    }
}
