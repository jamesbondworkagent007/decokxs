package o;

import com.okinc.business.dexui.main.swap.route.dag.model.DexEdgeItem;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNewGraph;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeNew;
import com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel;
import com.okinc.business.dexui.main.swap.route.dag.model.parse.EndpointMetadataResult;
import com.okinc.business.dexui.main.swap.route.dag.model.parse.ParseContext;
import com.okinc.business.dexui.main.swap.route.dag.model.parse.ParseResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.idO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24412idO {
    public static final C24412idO copydefault = new C24412idO();

    private C24412idO() {
    }

    public final ParseResult AEQbTJ(@NotNull java.util.List<DexEdgeItem> list) {
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(list, "");
        ParseContext parseContext = new ParseContext();
        KWHzl(list, parseContext);
        KWHzl(parseContext);
        EZpvd(parseContext);
        java.util.Iterator<T> it = parseContext.getEdges().iterator();
        if (it.hasNext()) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((RouteEdgeNew) it.next()).getToIndex());
            while (it.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((RouteEdgeNew) it.next()).getToIndex());
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.Map<java.lang.Integer, java.util.List<RouteNodeNew>> mapEZpvd = EZpvd(parseContext, iIntValue);
        EndpointMetadataResult endpointMetadataResultEZpvd = EZpvd(list);
        return new ParseResult(new RouteNewGraph(mapEZpvd, parseContext.getEdges(), endpointMetadataResultEZpvd.component1(), endpointMetadataResultEZpvd.component2(), endpointMetadataResultEZpvd.component3(), endpointMetadataResultEZpvd.component4(), iIntValue));
    }

    public final void KWHzl(ParseContext parseContext) {
        java.lang.String percent;
        for (Map.Entry<java.lang.String, java.util.List<PoolInfo>> entry : parseContext.getEdgePools().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<PoolInfo> value = entry.getValue();
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            int i = java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(0));
            int i2 = java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1));
            java.lang.String str = (java.lang.String) listSplit$default.get(2);
            java.lang.String str2 = (java.lang.String) listSplit$default.get(3);
            java.lang.Float f = parseContext.getEdgeWeights().get(key);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            PoolInfo poolInfo = (PoolInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(value);
            if (value.size() == 1) {
                percent = poolInfo.getPercent();
            } else {
                java.util.Iterator<T> it = value.iterator();
                java.lang.String strAddCheckS$default = "0";
                while (it.hasNext()) {
                    strAddCheckS$default = C23313hvq.addCheckS$default(strAddCheckS$default, ((PoolInfo) it.next()).getPercent(), null, null, null, 14, null);
                }
                percent = strAddCheckS$default;
            }
            parseContext.getEdges().add(new RouteEdgeNew(i, i2, str, str2, percent, fFloatValue, poolInfo.getOkLinkUrl(), poolInfo.getDexName(), poolInfo.getPairAddress()));
        }
    }

    public final void EZpvd(ParseContext parseContext) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, java.util.List<PoolInfo>> entry : parseContext.getEdgePools().entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.List<PoolInfo> value = entry.getValue();
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) key, new java.lang.String[]{"_"}, false, 0, 6, (java.lang.Object) null);
            RouteNodeKey routeNodeKey = new RouteNodeKey(java.lang.Integer.parseInt((java.lang.String) listSplit$default.get(1)), (java.lang.String) listSplit$default.get(3));
            java.lang.Object arrayList = linkedHashMap.get(routeNodeKey);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(routeNodeKey, arrayList);
            }
            ((java.util.List) arrayList).addAll(value);
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            RouteNodeKey routeNodeKey2 = (RouteNodeKey) entry2.getKey();
            java.util.List list = (java.util.List) entry2.getValue();
            RouteNodeNew routeNodeNew = parseContext.getNodesByKey().get(routeNodeKey2);
            if (routeNodeNew != null) {
                parseContext.getNodesByKey().put(routeNodeKey2, RouteNodeNew.copy$default(routeNodeNew, null, RouteNodeMeta.copy$default(routeNodeNew.getMeta(), null, null, CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list), 3, null), 1, null));
            }
        }
    }

    public final java.util.Map<java.lang.Integer, java.util.List<RouteNodeNew>> EZpvd(ParseContext parseContext, int i) {
        java.util.Collection<RouteNodeNew> collectionValues = parseContext.getNodesByKey().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionValues) {
            int tokenIndex = ((RouteNodeNew) obj).getKey().getTokenIndex();
            if (1 <= tokenIndex && tokenIndex < i) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList) {
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(((RouteNodeNew) obj2).getKey().getTokenIndex());
            java.lang.Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new java.util.ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((java.util.List) arrayList2).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) entry.getValue()));
        }
        java.util.Map<java.lang.Integer, java.util.List<RouteNodeNew>> mapIsConnected = C56424yEw.isConnected(linkedHashMap2);
        EZpvd(parseContext, mapIsConnected, i);
        return mapIsConnected;
    }

    public final void EZpvd(ParseContext parseContext, java.util.Map<java.lang.Integer, java.util.List<RouteNodeNew>> map, int i) {
        java.util.List<RouteEdgeNew> edges = parseContext.getEdges();
        java.util.ArrayList<RouteEdgeNew> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : edges) {
            if (((RouteEdgeNew) obj).getToIndex() == i) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (RouteEdgeNew routeEdgeNew : arrayList) {
            RouteNodeKey routeNodeKey = new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress());
            RouteNodeNew routeNodeNew = parseContext.getNodesByKey().get(routeNodeKey);
            if (routeNodeNew != null) {
                if (!arrayList2.isEmpty()) {
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((RouteNodeNew) it.next()).getKey().getTokenAddress(), (java.lang.Object) routeNodeKey.getTokenAddress())) {
                            break;
                        }
                    }
                }
                arrayList2.add(routeNodeNew);
            }
        }
        if (!arrayList2.isEmpty()) {
            map.put(java.lang.Integer.valueOf(i), arrayList2);
        }
    }

    public final void KWHzl(java.util.List<DexEdgeItem> list, ParseContext parseContext) {
        for (DexEdgeItem dexEdgeItem : list) {
            java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(dexEdgeItem.getFromIndex());
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(dexEdgeItem.getToIndex());
            int iIntValue2 = intOrNull2 != null ? intOrNull2.intValue() : iIntValue;
            if (iIntValue2 >= iIntValue) {
                java.lang.String tokenContractAddress = dexEdgeItem.getFromToken().getTokenContractAddress();
                java.lang.String tokenContractAddress2 = dexEdgeItem.getToToken().getTokenContractAddress();
                RouteNodeMeta routeNodeMeta = new RouteNodeMeta(dexEdgeItem.getFromToken().getTokenSymbol(), dexEdgeItem.getFromToken().getTokenLogoUrl(), null, 4, null);
                RouteNodeMeta routeNodeMeta2 = new RouteNodeMeta(dexEdgeItem.getToToken().getTokenSymbol(), dexEdgeItem.getToToken().getTokenLogoUrl(), null, 4, null);
                parseContext.getNodesByKey().putIfAbsent(new RouteNodeKey(iIntValue, tokenContractAddress), new RouteNodeNew(new RouteNodeKey(iIntValue, tokenContractAddress), routeNodeMeta));
                parseContext.getNodesByKey().putIfAbsent(new RouteNodeKey(iIntValue2, tokenContractAddress2), new RouteNodeNew(new RouteNodeKey(iIntValue2, tokenContractAddress2), routeNodeMeta2));
                PoolInfo poolInfo = new PoolInfo(dexEdgeItem.getUiPoolInfoModel().getDexName(), dexEdgeItem.getUiPoolInfoModel().getPercent(), dexEdgeItem.getUiPoolInfoModel().getOkLinkUrl(), dexEdgeItem.getUiPoolInfoModel().getPairAddress());
                java.lang.String str = iIntValue + "_" + iIntValue2 + "_" + tokenContractAddress + "_" + tokenContractAddress2;
                java.util.Map<java.lang.String, java.util.List<PoolInfo>> edgePools = parseContext.getEdgePools();
                java.util.List<PoolInfo> arrayList = edgePools.get(str);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                    edgePools.put(str, arrayList);
                }
                arrayList.add(poolInfo);
                java.lang.Float fFIwbmz = C59443zhD.fIwbmz(dexEdgeItem.getWeight());
                float fFloatValue = fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f;
                java.util.Map<java.lang.String, java.lang.Float> edgeWeights = parseContext.getEdgeWeights();
                java.lang.Float f = parseContext.getEdgeWeights().get(str);
                edgeWeights.put(str, java.lang.Float.valueOf((f != null ? f.floatValue() : 0.0f) + fFloatValue));
            }
        }
    }

    public final EndpointMetadataResult EZpvd(java.util.List<DexEdgeItem> list) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String chainLogoUrl;
        java.lang.String chainLogoUrl2;
        java.lang.String tokenLogoUrl;
        java.lang.String tokenSymbol;
        java.lang.String tokenLogoUrl2;
        java.lang.String tokenSymbol2;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(((DexEdgeItem) next).getFromIndex());
            if (intOrNull != null && intOrNull.intValue() == 0) {
                break;
            }
        }
        DexEdgeItem dexEdgeItem = (DexEdgeItem) next;
        UiTokenInfoModel fromToken = dexEdgeItem != null ? dexEdgeItem.getFromToken() : null;
        java.util.Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                java.lang.Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(((DexEdgeItem) next2).getToIndex());
                int iIntValue = intOrNull2 != null ? intOrNull2.intValue() : Integer.MIN_VALUE;
                do {
                    java.lang.Object next3 = it2.next();
                    java.lang.Integer intOrNull3 = StringsKt__StringNumberConversionsKt.toIntOrNull(((DexEdgeItem) next3).getToIndex());
                    int iIntValue2 = intOrNull3 != null ? intOrNull3.intValue() : Integer.MIN_VALUE;
                    if (iIntValue < iIntValue2) {
                        next2 = next3;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        DexEdgeItem dexEdgeItem2 = (DexEdgeItem) next2;
        UiTokenInfoModel toToken = dexEdgeItem2 != null ? dexEdgeItem2.getToToken() : null;
        java.lang.String str = "";
        RouteNodeMeta routeNodeMeta = new RouteNodeMeta((fromToken == null || (tokenSymbol2 = fromToken.getTokenSymbol()) == null) ? "" : tokenSymbol2, (fromToken == null || (tokenLogoUrl2 = fromToken.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl2, null, 4, null);
        RouteNodeMeta routeNodeMeta2 = new RouteNodeMeta((toToken == null || (tokenSymbol = toToken.getTokenSymbol()) == null) ? "" : tokenSymbol, (toToken == null || (tokenLogoUrl = toToken.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, null, 4, null);
        if (fromToken == null || (chainLogoUrl = fromToken.getChainLogoUrl()) == null) {
            chainLogoUrl = "";
        }
        if (toToken != null && (chainLogoUrl2 = toToken.getChainLogoUrl()) != null) {
            str = chainLogoUrl2;
        }
        return new EndpointMetadataResult(routeNodeMeta, routeNodeMeta2, chainLogoUrl, str);
    }
}
