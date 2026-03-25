package o;

import com.okinc.business.market.features.position.PositionModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.knf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29121knf implements InterfaceC58162ywA<C29135knt> {
    public final InterfaceC58164ywC<Json> OLrzqt;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C29135knt get() {
        return OLrzqt(this.OLrzqt.get());
    }

    public static C29135knt OLrzqt(Json json) {
        return (C29135knt) C58165ywD.KWHzl(PositionModule.OLrzqt.KWHzl(json));
    }
}
