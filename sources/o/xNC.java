package o;

import com.okinc.unify_trade.trade.core.config.TradeInit;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class xNC {
    public final java.util.Set<TradeInit> KWHzl = new LinkedHashSet();
    public final java.util.List<C54588xNy> EZpvd = new java.util.ArrayList();

    public final xNC OLrzqt() {
        xNJ xnj = new xNJ();
        this.KWHzl.addAll(xnj.AEQbTJ());
        this.EZpvd.add(xnj);
        return this;
    }

    public final xNH copydefault() {
        return new xNH(new java.util.ArrayList(this.KWHzl), CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.EZpvd));
    }
}
