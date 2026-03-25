package o;

import com.okinc.business.market.features.smart_money.SmartMoneyModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.ktt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29453ktt implements InterfaceC58162ywA<InterfaceC29466kuF> {
    public final InterfaceC58164ywC<InterfaceC27595jyE> AEQbTJ;
    public final InterfaceC58164ywC<C29474kuN> EZpvd;
    public final InterfaceC58164ywC<C27640jyx> OLrzqt;
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC29466kuF get() {
        return copydefault(this.AEQbTJ.get(), this.OLrzqt.get(), this.EZpvd.get(), this.copydefault.get());
    }

    public static InterfaceC29466kuF copydefault(InterfaceC27595jyE interfaceC27595jyE, C27640jyx c27640jyx, C29474kuN c29474kuN, Json json) {
        return (InterfaceC29466kuF) C58165ywD.KWHzl(SmartMoneyModule.EZpvd.OLrzqt(interfaceC27595jyE, c27640jyx, c29474kuN, json));
    }
}
