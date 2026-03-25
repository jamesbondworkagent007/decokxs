package o;

import com.google.gson.Gson;
import com.okinc.business.market.features.address_tracker_sa.SaTrackerModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25665jBv implements InterfaceC58162ywA<jBZ> {
    public final InterfaceC58164ywC<Json> AEQbTJ;
    public final InterfaceC58164ywC<C27640jyx> EZpvd;
    public final InterfaceC58164ywC<InterfaceC27595jyE> KWHzl;
    public final InterfaceC58164ywC<Gson> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public jBZ get() {
        return KWHzl(this.KWHzl.get(), this.EZpvd.get(), this.AEQbTJ.get(), this.copydefault.get());
    }

    public static jBZ KWHzl(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, Json json, Gson gson) {
        return (jBZ) C58165ywD.KWHzl(SaTrackerModule.copydefault.EZpvd(interfaceC27595jyE, c27640jyx, json, gson));
    }
}
