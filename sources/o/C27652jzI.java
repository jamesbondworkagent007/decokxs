package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27652jzI implements InterfaceC58162ywA<InterfaceC28701kfj> {
    public final InterfaceC58164ywC<C27640jyx> AEQbTJ;
    public final InterfaceC58164ywC<Json> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC28701kfj get() {
        return copydefault(this.AEQbTJ.get(), this.OLrzqt.get());
    }

    public static InterfaceC28701kfj copydefault(C27640jyx c27640jyx, Json json) {
        return (InterfaceC28701kfj) C58165ywD.KWHzl(RepositoryModule.OLrzqt.EZpvd(c27640jyx, json));
    }
}
