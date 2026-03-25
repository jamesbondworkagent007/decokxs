package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27684jzo implements InterfaceC58162ywA<InterfaceC28692kfa> {
    public final InterfaceC58164ywC<C27640jyx> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC28692kfa get() {
        return OLrzqt(this.OLrzqt.get(), this.AEQbTJ.get(), this.copydefault.get());
    }

    public static InterfaceC28692kfa OLrzqt(C27640jyx c27640jyx, C27640jyx c27640jyx2, Json json) {
        return (InterfaceC28692kfa) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(c27640jyx, c27640jyx2, json));
    }
}
