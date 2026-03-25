package o;

import com.okinc.business.invest_biz.data.bean.response.InvestedToken;
import com.okinc.business.invest_biz.data.bean.response.MarketInvestTokenInfo;
import com.okinc.business.invest_biz.data.bean.response.ProtocolDetailsResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23652iEh {
    @yCM
    public C23652iEh() {
    }

    public final C23670iEz AEQbTJ(@NotNull ProtocolDetailsResponse protocolDetailsResponse, @NotNull MarketInvestTokenInfo marketInvestTokenInfo) {
        Intrinsics.checkNotNullParameter(protocolDetailsResponse, "");
        Intrinsics.checkNotNullParameter(marketInvestTokenInfo, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = marketInvestTokenInfo.KWHzl().entrySet().iterator();
        while (it.hasNext()) {
            for (InvestedToken investedToken : (java.lang.Iterable) ((Map.Entry) it.next()).getValue()) {
                if (investedToken.AkhnZx() != null) {
                    linkedHashMap.put(java.lang.Long.valueOf(investedToken.isConnected()), investedToken.AkhnZx());
                }
            }
        }
        return new C23670iEz(protocolDetailsResponse.KWHzl(), protocolDetailsResponse.OLrzqt(), protocolDetailsResponse.AEQbTJ(), marketInvestTokenInfo.AEQbTJ(), marketInvestTokenInfo.copydefault(), marketInvestTokenInfo.AhwBna(), marketInvestTokenInfo.EZpvd(), linkedHashMap);
    }
}
