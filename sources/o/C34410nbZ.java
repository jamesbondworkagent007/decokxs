package o;

import com.okinc.dexkline.market.features.position.PositionModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.nbZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34410nbZ implements InterfaceC58162ywA<C34477ncn> {
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C34477ncn get() {
        return EZpvd(this.copydefault.get());
    }

    public static C34477ncn EZpvd(Json json) {
        return (C34477ncn) C58165ywD.KWHzl(PositionModule.copydefault.OLrzqt(json));
    }
}
