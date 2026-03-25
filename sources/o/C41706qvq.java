package o;

import com.okinc.market.ranking.core.model.RankingHotCryptoVo;
import com.okinc.market.ranking.features.main.ui.adapter.RankingFuturesCryptoItemAdapter$1;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: o.qvq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41706qvq extends C40512qYp {
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt = new LinkedHashMap();

    public C41706qvq() {
        register(RankingHotCryptoVo.class, new C41704qvo(new RankingFuturesCryptoItemAdapter$1(this)));
    }

    public final java.lang.String OLrzqt(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        java.lang.String strKWHzl = map.get(str);
        if (strKWHzl == null) {
            strKWHzl = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(28.0f, null, 1, null), C55298xhM.dp2px$default(28.0f, null, 1, null));
            if (strKWHzl == null) {
                strKWHzl = str;
            }
            map.put(str, strKWHzl);
        }
        return strKWHzl;
    }
}
