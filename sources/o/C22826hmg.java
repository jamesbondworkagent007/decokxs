package o;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: o.hmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22826hmg {
    public final ConcurrentHashMap<java.lang.String, DefiChainInfo> OLrzqt = new ConcurrentHashMap<>();

    public final DefiChainInfo AEQbTJ(java.lang.String str) {
        return this.OLrzqt.get(str);
    }

    public final void EZpvd() {
        this.OLrzqt.clear();
    }

    public final void AEQbTJ(java.util.List<DefiChainInfo> list) {
        if (list != null) {
            for (DefiChainInfo defiChainInfo : list) {
                this.OLrzqt.put(defiChainInfo.getChainId(), defiChainInfo);
            }
        }
    }
}
