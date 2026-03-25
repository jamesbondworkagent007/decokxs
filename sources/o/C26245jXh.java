package o;

import com.okinc.business.market.features.history.HistoryChangeModule;
import kotlinx.serialization.json.Json;

/* JADX INFO: renamed from: o.jXh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26245jXh implements InterfaceC58162ywA<C26244jXg> {
    public final InterfaceC58164ywC<C29708kyj> OLrzqt;
    public final InterfaceC58164ywC<Json> copydefault;

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // o.yCP
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C26244jXg get() {
        return OLrzqt(this.copydefault.get(), this.OLrzqt.get());
    }

    public static C26244jXg OLrzqt(Json json, C29708kyj c29708kyj) {
        return (C26244jXg) C58165ywD.KWHzl(HistoryChangeModule.EZpvd.copydefault(json, c29708kyj));
    }
}
