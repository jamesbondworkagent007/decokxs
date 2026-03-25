package o;

import com.google.gson.Gson;
import com.okinc.business.market.features.address_tracker_sa.SaTrackerModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jBu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25664jBu implements InterfaceC58162ywA<jEA> {
    public final InterfaceC58164ywC<C27640jyx> AEQbTJ;
    public final InterfaceC58164ywC<Gson> EZpvd;
    public final InterfaceC58164ywC<Json> KWHzl;
    public final InterfaceC58164ywC<InterfaceC27595jyE> OLrzqt;
    public final InterfaceC58164ywC<C27640jyx> copydefault;
    public final InterfaceC58164ywC<C27640jyx> djBIcL;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public jEA get() {
        return EZpvd(this.OLrzqt.get(), this.copydefault.get(), this.AEQbTJ.get(), this.djBIcL.get(), this.KWHzl.get(), this.EZpvd.get());
    }

    public static jEA EZpvd(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, C27640jyx c27640jyx2, C27640jyx c27640jyx3, Json json, Gson gson) {
        return (jEA) C58165ywD.KWHzl(SaTrackerModule.copydefault.KWHzl(interfaceC27595jyE, c27640jyx, c27640jyx2, c27640jyx3, json, gson));
    }
}
