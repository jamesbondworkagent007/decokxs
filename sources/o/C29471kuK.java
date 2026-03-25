package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.data.model.common.ChainInfoData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.smart_money.ranking.domain.model.SmartMoneySignalProtocolFilterData;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29471kuK {
    @yCM
    public C29471kuK() {
    }

    public final MarketChainBean AEQbTJ(@NotNull ChainInfoData chainInfoData) {
        Intrinsics.checkNotNullParameter(chainInfoData, "");
        return new MarketChainBean(chainInfoData.EZpvd(), chainInfoData.OLrzqt(), chainInfoData.KWHzl(), (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 0, chainInfoData.copydefault(), false, 760, (DefaultConstructorMarker) null);
    }

    public final SignalMultiSelectUiModel copydefault(@NotNull ProtocolInfoData protocolInfoData) {
        Intrinsics.checkNotNullParameter(protocolInfoData, "");
        return new SignalMultiSelectUiModel(protocolInfoData.getProtocolId(), protocolInfoData.getProtocolName(), protocolInfoData.getProtocolLogo(), null, true, protocolInfoData.getProtocolTagKey(), 8, null);
    }

    public final java.util.Map<java.lang.String, java.util.List<SignalMultiSelectUiModel>> OLrzqt(@NotNull java.util.List<SmartMoneySignalProtocolFilterData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (SmartMoneySignalProtocolFilterData smartMoneySignalProtocolFilterData : list) {
            java.lang.String strKWHzl = smartMoneySignalProtocolFilterData.KWHzl();
            java.util.List<ProtocolInfoData> listEZpvd = smartMoneySignalProtocolFilterData.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
            java.util.Iterator<T> it = listEZpvd.iterator();
            while (it.hasNext()) {
                arrayList.add(copydefault((ProtocolInfoData) it.next()));
            }
            kotlin.Pair pair = new kotlin.Pair(strKWHzl, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
