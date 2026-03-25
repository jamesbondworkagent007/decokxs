package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27655jzL implements InterfaceC58162ywA<InterfaceC29294kqt> {
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<Json> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC29294kqt get() {
        return OLrzqt(this.OLrzqt.get(), this.EZpvd.get(), this.KWHzl.get());
    }

    public static InterfaceC29294kqt OLrzqt(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, Json json) {
        return (InterfaceC29294kqt) C58165ywD.KWHzl(RepositoryModule.OLrzqt.OLrzqt(interfaceC27595jyE, c27640jyx, json));
    }
}
