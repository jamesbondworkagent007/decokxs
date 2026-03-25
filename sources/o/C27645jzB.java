package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27645jzB implements InterfaceC58162ywA<C26285jYu> {
    public final InterfaceC58164ywC<Json> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C26285jYu get() {
        return OLrzqt(this.OLrzqt.get());
    }

    public static C26285jYu OLrzqt(Json json) {
        return (C26285jYu) C58165ywD.KWHzl(RepositoryModule.OLrzqt.copydefault(json));
    }
}
