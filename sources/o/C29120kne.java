package o;

import com.okinc.business.market.features.position.PositionModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.kne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29120kne implements InterfaceC58162ywA<C29137knv> {
    public final InterfaceC58164ywC<Json> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C29137knv get() {
        return KWHzl(this.EZpvd.get());
    }

    public static C29137knv KWHzl(Json json) {
        return (C29137knv) C58165ywD.KWHzl(PositionModule.OLrzqt.OLrzqt(json));
    }
}
