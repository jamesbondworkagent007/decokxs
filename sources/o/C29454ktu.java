package o;

import com.okinc.business.market.features.smart_money.SmartMoneyModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.ktu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29454ktu implements InterfaceC58162ywA<C29474kuN> {
    public final InterfaceC58164ywC<Json> EZpvd;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C29474kuN get() {
        return OLrzqt(this.EZpvd.get());
    }

    public static C29474kuN OLrzqt(Json json) {
        return (C29474kuN) C58165ywD.KWHzl(SmartMoneyModule.EZpvd.copydefault(json));
    }
}
