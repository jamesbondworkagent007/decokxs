package o;

import com.okinc.dexkline.market.features.history.HistoryChangeModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.mZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C32373mZp implements InterfaceC58162ywA<C32374mZq> {
    public final InterfaceC58164ywC<Json> KWHzl;
    public final InterfaceC58164ywC<C34539ndw> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C32374mZq get() {
        return EZpvd(this.KWHzl.get(), this.copydefault.get());
    }

    public static C32374mZq EZpvd(Json json, C34539ndw c34539ndw) {
        return (C32374mZq) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.OLrzqt(json, c34539ndw));
    }
}
