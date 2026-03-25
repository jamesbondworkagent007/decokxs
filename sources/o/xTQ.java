package o;

import com.okinc.market.common.bean.DexTokenItemListRequest;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes12.dex */
public final class xTQ {
    public static final xTQ copydefault = new xTQ();

    private xTQ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xTQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple createBizReq$default(xTQ xtq, java.util.List list, Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return xtq.KWHzl(list, function2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [27=7] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final Triple<java.lang.String, java.lang.String, java.util.List<DexTokenItemListRequest>> KWHzl(@NotNull java.util.List<WatchListData> list, Function2<? super LinkedHashMap<java.lang.String, java.lang.String>, ? super java.lang.String, Unit> function2) {
        Triple<java.lang.String, java.lang.String, java.util.List<DexTokenItemListRequest>> triple;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(list, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap = new LinkedHashMap<>();
            for (WatchListData watchListData : list) {
                java.lang.String instType = watchListData.getInstType();
                switch (instType.hashCode()) {
                    case -2027980370:
                        if (instType.equals("MARGIN")) {
                            if (function2 != null) {
                                function2.invoke(linkedHashMap, watchListData.getInstId());
                            }
                            sb2.append(sb2.length() == 0 ? "MARGIN:" + watchListData.getInstId() : "," + watchListData.getInstId());
                        }
                        break;
                    case -1956807563:
                        if (instType.equals("OPTION")) {
                            if (function2 != null) {
                                function2.invoke(linkedHashMap, watchListData.getInstId());
                            }
                            sb5.append(sb5.length() == 0 ? "OPTION:" + watchListData.getInstId() : "," + watchListData.getInstId());
                        }
                        break;
                    case 2074257:
                        if (instType.equals("COIN")) {
                            linkedHashMap.put(watchListData.getInstId(), watchListData.getInstId());
                        }
                        break;
                    case 2552066:
                        if (instType.equals("SPOT")) {
                            if (function2 != null) {
                                function2.invoke(linkedHashMap, watchListData.getInstId());
                            }
                            sb.append(sb.length() == 0 ? "SPOT:" + watchListData.getInstId() : "," + watchListData.getInstId());
                        }
                        break;
                    case 2558355:
                        if (instType.equals("SWAP")) {
                            if (function2 != null) {
                                function2.invoke(linkedHashMap, watchListData.getInstId());
                            }
                            sb3.append(sb3.length() == 0 ? "SWAP:" + watchListData.getInstId() : "," + watchListData.getInstId());
                        }
                        break;
                    case 214415088:
                        if (instType.equals("FUTURES")) {
                            if (function2 != null) {
                                function2.invoke(linkedHashMap, watchListData.getInstId());
                            }
                            sb4.append(sb4.length() == 0 ? "FUTURES:" + watchListData.getInstId() + Marker.ANY_NON_NULL_MARKER + watchListData.getAlias() : "," + watchListData.getInstId() + Marker.ANY_NON_NULL_MARKER + watchListData.getAlias());
                        }
                        break;
                    case 1983970406:
                        if (instType.equals("CEDEFI")) {
                            arrayList.add(new DexTokenItemListRequest(watchListData.getChainId(), watchListData.getTokenContractAddress()));
                        }
                        break;
                }
            }
            triple = new Triple<>(((java.lang.Object) sb) + (sb.length() > 0 ? ";" : "") + ((java.lang.Object) sb2) + (sb2.length() > 0 ? ";" : "") + ((java.lang.Object) sb3) + (sb3.length() > 0 ? ";" : "") + ((java.lang.Object) sb4) + (sb4.length() > 0 ? ";" : "") + ((java.lang.Object) sb5) + (sb5.length() > 0 ? ";" : ""), KWHzl(linkedHashMap), arrayList);
        }
        return triple;
    }

    public final java.lang.String KWHzl(LinkedHashMap<java.lang.String, java.lang.String> linkedHashMap) {
        java.lang.String string;
        synchronized (this) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (Map.Entry<java.lang.String, java.lang.String> entry : linkedHashMap.entrySet()) {
                sb.append(sb.length() == 0 ? entry.getValue() : "," + ((java.lang.Object) entry.getValue()));
            }
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        return string;
    }
}
