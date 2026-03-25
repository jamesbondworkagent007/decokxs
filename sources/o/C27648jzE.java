package o;

import com.okinc.business.market.di.RepositoryModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jzE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27648jzE implements InterfaceC58162ywA<InterfaceC27628jyl> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> EZpvd;
    public final InterfaceC58164ywC<C27640jyx> KWHzl;
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC27628jyl get() {
        return OLrzqt(this.EZpvd.get(), this.KWHzl.get(), this.copydefault.get());
    }

    public static InterfaceC27628jyl OLrzqt(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, Json json) {
        return (InterfaceC27628jyl) C58165ywD.KWHzl(RepositoryModule.OLrzqt.KWHzl(interfaceC27595jyE, c27640jyx, json));
    }
}
