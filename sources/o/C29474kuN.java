package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.txs.TxType;
import com.okinc.business.market.data.model.common.DexTokenMeta;
import com.okinc.business.market.data.model.common.TokenInfo;
import com.okinc.business.market.data.model.smart_money.SignalAlertHistoryData;
import com.okinc.business.market.data.model.smart_money.SignalAlertItemData;
import com.okinc.business.market.data.model.smart_money.SignalData;
import com.okinc.business.market.data.model.smart_money.SignalOverview;
import com.okinc.business.market.data.model.smart_money.SignalStatusUpdate;
import com.okinc.business.market.data.model.smart_money.SignalUpdate;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.meme.filter.domain.TokenAgeType;
import com.okinc.business.market.features.smart_money.signal.domain.model.InfluencerType;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalUiModel;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29474kuN {
    public final Json EZpvd;

    public C29474kuN(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        this.EZpvd = json;
    }

    public final SignalUiModel OLrzqt(@NotNull SignalData signalData) {
        Intrinsics.checkNotNullParameter(signalData, "");
        return new SignalUiModel(signalData.djBIcL(), signalData.AuCTel().KWHzl(), signalData.AuCTel().AEQbTJ(), signalData.EZpvd(), signalData.OLrzqt(), signalData.copydefault(), signalData.KWHzl(), signalData.ejfBZ(), signalData.AhwBna(), signalData.AuCTel().valueOf(), signalData.AuCTel().EZpvd(), signalData.AuCTel().copydefault(), C33129mqd.AhwBna(signalData.KWHzl()), signalData.AuCTel().gEmmrt(), signalData.AuCTel().AhwBna(), signalData.fJNWhG(), signalData.AkhnZx(), signalData.fetchVPNInfo(), signalData.values(), signalData.AYXKKw(), signalData.gEmmrt(), C33129mqd.djBIcL(signalData.DbNXlk()), Intrinsics.EZpvd((java.lang.Object) signalData.valueOf(), (java.lang.Object) "1"), InfluencerType.Companion.AEQbTJ(signalData.isConnected()), null, 16777216, null);
    }

    /* JADX INFO: renamed from: o.kuN$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(C33129mqd.valueOf(((SignalUiModel) t).AYXKKw())), java.lang.Long.valueOf(C33129mqd.valueOf(((SignalUiModel) t2).AYXKKw())));
        }
    }

    /* JADX INFO: renamed from: o.kuN$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((SignalAlertItemData) t2).copydefault()), java.lang.Long.valueOf(((SignalAlertItemData) t).copydefault()));
        }
    }

    public final boolean copydefault(PriceRangeFilter priceRangeFilter, double d) {
        if (priceRangeFilter.AhwBna().length() != 0 || priceRangeFilter.KWHzl().length() != 0) {
            if (priceRangeFilter.AhwBna().length() == 0) {
                return C23313hvq.valueOf(java.lang.Double.valueOf(d), priceRangeFilter.KWHzl());
            }
            if (priceRangeFilter.KWHzl().length() == 0) {
                return C23313hvq.EZpvd(java.lang.Double.valueOf(d), priceRangeFilter.AhwBna());
            }
            if (!C23313hvq.EZpvd(java.lang.Double.valueOf(d), priceRangeFilter.AhwBna()) || !C23313hvq.valueOf(java.lang.Double.valueOf(d), priceRangeFilter.KWHzl())) {
                return false;
            }
        }
        return true;
    }

    public final boolean AEQbTJ(PriceRangeFilter priceRangeFilter, int i) {
        if (priceRangeFilter.AhwBna().length() != 0 || priceRangeFilter.KWHzl().length() != 0) {
            if (priceRangeFilter.AhwBna().length() == 0) {
                return C23313hvq.valueOf(java.lang.Integer.valueOf(i), priceRangeFilter.KWHzl());
            }
            if (priceRangeFilter.KWHzl().length() == 0) {
                return C23313hvq.EZpvd(java.lang.Integer.valueOf(i), priceRangeFilter.AhwBna());
            }
            if (!C23313hvq.EZpvd(java.lang.Integer.valueOf(i), priceRangeFilter.AhwBna()) || !C23313hvq.valueOf(java.lang.Integer.valueOf(i), priceRangeFilter.KWHzl())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(SignalMetricsFilter signalMetricsFilter, long j) {
        boolean z;
        boolean z2;
        if (signalMetricsFilter.djBIcL().length() == 0 && signalMetricsFilter.EZpvd().length() == 0) {
            return true;
        }
        double dCurrentTimeMillis = (java.lang.System.currentTimeMillis() - j) / TokenAgeType.Companion.copydefault(signalMetricsFilter.gEmmrt());
        if (signalMetricsFilter.djBIcL().length() != 0) {
            java.lang.Double dAuCTel = C59443zhD.AuCTel(signalMetricsFilter.djBIcL());
            z = dCurrentTimeMillis >= (dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        if (signalMetricsFilter.EZpvd().length() != 0) {
            java.lang.Double dAuCTel2 = C59443zhD.AuCTel(signalMetricsFilter.EZpvd());
            z2 = dCurrentTimeMillis <= (dAuCTel2 != null ? dAuCTel2.doubleValue() : Double.MAX_VALUE);
        }
        return z && z2;
    }

    public final java.lang.Integer EZpvd(java.util.Set<? extends InfluencerType> set, java.util.List<java.lang.String> list) {
        java.util.Set<? extends InfluencerType> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna(((InfluencerType) it.next()).getValue())));
        }
        java.lang.Integer numValueOf = null;
        int i = 0;
        for (java.lang.Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (arrayList.contains(java.lang.Integer.valueOf(i2)) && str.length() > 0) {
                if (numValueOf == null) {
                    numValueOf = java.lang.Integer.valueOf(i);
                } else {
                    if (C33129mqd.valueOf(str) < C33129mqd.valueOf(list.get(numValueOf.intValue()))) {
                        numValueOf = java.lang.Integer.valueOf(i);
                    }
                }
            }
            i = i2;
        }
        return numValueOf;
    }

    public final boolean copydefault(SignalData signalData, java.util.Set<? extends InfluencerType> set, SignalsFilter signalsFilter) {
        return set.contains(InfluencerType.Companion.AEQbTJ(signalData.isConnected())) && AEQbTJ(signalsFilter.EZpvd(), C33129mqd.AhwBna(signalData.KWHzl())) && copydefault(signalsFilter.KWHzl(), C33129mqd.AEQbTJ(signalData.fJNWhG())) && copydefault(signalsFilter.copydefault(), C33129mqd.AEQbTJ(signalData.values())) && copydefault(signalsFilter.AEQbTJ(), C33129mqd.AEQbTJ(signalData.fetchVPNInfo()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.List<com.okinc.business.market.data.model.smart_money.SignalData> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.util.ArrayList, java.util.Collection] */
    public final java.util.List<SignalUiModel> EZpvd(@NotNull java.util.List<SignalData> list, @NotNull java.util.Map<java.lang.String, TokenInfo> map, @NotNull TxType txType, C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = list;
        if (txType == TxType.BUY || txType == TxType.SELL) {
            ?? arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((SignalData) obj).ejfBZ() == txType) {
                    arrayList.add(obj);
                }
            }
            objectRef.element = arrayList;
        }
        if (c29481kuU != null) {
            map = AEQbTJ(map, c29481kuU.AEQbTJ(), c29481kuU.KWHzl());
            java.util.Set<InfluencerType> setOLrzqt = OLrzqt(c29481kuU.OLrzqt());
            java.lang.Iterable iterable = (java.lang.Iterable) objectRef.element;
            ?? arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : iterable) {
                SignalData signalData = (SignalData) obj2;
                if (map.containsKey(signalData.fARcdN()) && copydefault(signalData, setOLrzqt, c29481kuU.AhwBna())) {
                    arrayList2.add(obj2);
                }
            }
            objectRef.element = arrayList2;
        }
        return KWHzl((java.util.List) objectRef.element, map);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.market.data.model.smart_money.SignalOverview.copy$default(com.okinc.business.market.data.model.smart_money.SignalOverview, java.util.List, java.lang.String, java.util.List, long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, int, java.lang.Object):com.okinc.business.market.data.model.smart_money.SignalOverview */
    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: java.util.List<com.okinc.business.market.data.model.smart_money.SignalOverview> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f5  */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.util.ArrayList, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.util.List<SignalOverview>, java.util.Map<java.lang.String, TokenInfo>> EZpvd(@NotNull java.util.List<SignalOverview> list, @NotNull java.util.Map<java.lang.String, TokenInfo> map, C29481kuU c29481kuU) {
        java.util.Map<java.lang.String, TokenInfo> mapAEQbTJ;
        SignalOverview signalOverviewAEQbTJ;
        long j;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = list;
        if (c29481kuU != null) {
            mapAEQbTJ = AEQbTJ(map, c29481kuU.AEQbTJ(), c29481kuU.KWHzl());
            java.util.Set<InfluencerType> setOLrzqt = OLrzqt(c29481kuU.OLrzqt());
            java.lang.Iterable<SignalOverview> iterable = (java.lang.Iterable) objectRef.element;
            ?? arrayList = new java.util.ArrayList();
            for (SignalOverview signalOverview : iterable) {
                if (mapAEQbTJ.containsKey(signalOverview.fetchVPNInfo())) {
                    java.util.List<SignalData> listValueOf = signalOverview.valueOf();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : listValueOf) {
                        if (copydefault((SignalData) obj, setOLrzqt, c29481kuU.AhwBna())) {
                            arrayList2.add(obj);
                        }
                    }
                    java.lang.Integer numEZpvd = EZpvd(setOLrzqt, signalOverview.AEQbTJ());
                    if ((!arrayList2.isEmpty()) && numEZpvd != null) {
                        java.util.Iterator it = arrayList2.iterator();
                        if (it.hasNext()) {
                            long jValueOf = C33129mqd.valueOf(((SignalData) it.next()).AhwBna());
                            while (true) {
                                j = jValueOf;
                                while (it.hasNext()) {
                                    jValueOf = C33129mqd.valueOf(((SignalData) it.next()).AhwBna());
                                    if (j < jValueOf) {
                                        break;
                                    }
                                }
                            }
                            signalOverviewAEQbTJ = signalOverview.AEQbTJ((711 & 1) != 0 ? signalOverview.firstSignalTimes : null, (711 & 2) != 0 ? signalOverview.klineDefaultPeriod : null, (711 & 4) != 0 ? signalOverview.klineData : null, (711 & 8) != 0 ? signalOverview.lastEventTime : j, (711 & 16) != 0 ? signalOverview.maxIncreaseMultiplier : signalOverview.AhwBna().get(numEZpvd.intValue()), (711 & 32) != 0 ? signalOverview.maxIncreasePercentage : signalOverview.djBIcL().get(numEZpvd.intValue()), (711 & 64) != 0 ? signalOverview.maxIncreaseMultiplierList : null, (711 & 128) != 0 ? signalOverview.maxIncreasePercentageList : null, (711 & 256) != 0 ? signalOverview.signals : arrayList2, (711 & 512) != 0 ? signalOverview.tokenKey : null);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                } else {
                    signalOverviewAEQbTJ = null;
                }
                if (signalOverviewAEQbTJ != null) {
                    arrayList.add(signalOverviewAEQbTJ);
                }
            }
            objectRef.element = arrayList;
        } else {
            mapAEQbTJ = map;
        }
        return new kotlin.Pair<>(objectRef.element, mapAEQbTJ);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kuN */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalOverviewUiModel mapSignalOverviewToUiModel$default(C29474kuN c29474kuN, SignalOverview signalOverview, TokenInfo tokenInfo, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        return c29474kuN.copydefault(signalOverview, tokenInfo, (Function0<SignalOverviewKLineUiModel>) function0);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.market.data.model.smart_money.SignalData.copy$default(com.okinc.business.market.data.model.smart_money.SignalData, com.okinc.business.market.data.model.common.DexTokenMeta, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.market.data.model.smart_money.SignalData */
    public final SignalOverviewUiModel copydefault(@NotNull SignalOverview signalOverview, @NotNull TokenInfo tokenInfo, Function0<SignalOverviewKLineUiModel> function0) {
        SignalOverviewKLineUiModel signalOverviewKLineUiModelInvoke;
        Intrinsics.checkNotNullParameter(signalOverview, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        java.util.List<SignalData> listValueOf = signalOverview.valueOf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValueOf, 10));
        for (SignalData signalData : listValueOf) {
            arrayList.add(OLrzqt(signalData.OLrzqt((262142 & 1) != 0 ? signalData.tokenInfo : DexTokenMeta.Companion.OLrzqt(tokenInfo), (262142 & 2) != 0 ? signalData.id : null, (262142 & 4) != 0 ? signalData.batchId : null, (262142 & 8) != 0 ? signalData.batchIndex : null, (262142 & 16) != 0 ? signalData.trend : null, (262142 & 32) != 0 ? signalData.addressNum : null, (262142 & 64) != 0 ? signalData.addresses : null, (262142 & 128) != 0 ? signalData.volume : null, (262142 & 256) != 0 ? signalData.price : null, (262142 & 512) != 0 ? signalData.liquidity : null, (262142 & 1024) != 0 ? signalData.marketCap : null, (262142 & 2048) != 0 ? signalData.eventTime : null, (262142 & 4096) != 0 ? signalData.duration : null, (262142 & 8192) != 0 ? signalData.holders : null, (262142 & 16384) != 0 ? signalData.sellRatio : null, (262142 & 32768) != 0 ? signalData.expireStatus : null, (262142 & 65536) != 0 ? signalData.signalLabel : null, (262142 & 131072) != 0 ? signalData.tokenKey : null)));
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity());
        SignalOverviewUiModel signalOverviewUiModel = new SignalOverviewUiModel(tokenInfo.EZpvd(), C33129mqd.gEmmrt(java.lang.Long.valueOf(tokenInfo.values())), tokenInfo.KWHzl(), tokenInfo.OLrzqt(), tokenInfo.isConnected(), tokenInfo.DbNXlk(), tokenInfo.fetchVPNInfo(), tokenInfo.AkhnZx(), signalOverview.AYXKKw(), tokenInfo.djBIcL(), tokenInfo.AhwBna(), tokenInfo.valueOf(), signalOverview.copydefault(), listEZpvd, null, null, signalOverview.gEmmrt(), tokenInfo.AuCTel(), 49152, null);
        return signalOverviewUiModel.AEQbTJ((212991 & 1) != 0 ? signalOverviewUiModel.AkhnZx : null, (212991 & 2) != 0 ? signalOverviewUiModel.DbNXlk : null, (212991 & 4) != 0 ? signalOverviewUiModel.isConnected : null, (212991 & 8) != 0 ? signalOverviewUiModel.values : null, (212991 & 16) != 0 ? signalOverviewUiModel.fetchVPNInfo : null, (212991 & 32) != 0 ? signalOverviewUiModel.fARcdN : null, (212991 & 64) != 0 ? signalOverviewUiModel.fIwbmz : null, (212991 & 128) != 0 ? signalOverviewUiModel.ejfBZ : null, (212991 & 256) != 0 ? signalOverviewUiModel.AEQbTJ : null, (212991 & 512) != 0 ? signalOverviewUiModel.KWHzl : null, (212991 & 1024) != 0 ? signalOverviewUiModel.EZpvd : null, (212991 & 2048) != 0 ? signalOverviewUiModel.copydefault : null, (212991 & 4096) != 0 ? signalOverviewUiModel.valueOf : 0L, (212991 & 8192) != 0 ? signalOverviewUiModel.AhwBna : null, (212991 & 16384) != 0 ? signalOverviewUiModel.AYXKKw : (SignalUiModel) CollectionsKt___CollectionsKt.AubY(listEZpvd), (212991 & 32768) != 0 ? signalOverviewUiModel.djBIcL : (function0 == null || (signalOverviewKLineUiModelInvoke = function0.invoke()) == null) ? copydefault(signalOverview.EZpvd(), signalOverview.KWHzl()) : signalOverviewKLineUiModelInvoke, (212991 & 65536) != 0 ? signalOverviewUiModel.gEmmrt : null, (212991 & 131072) != 0 ? signalOverviewUiModel.AuCTel : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SignalOverviewKLineUiModel copydefault(@NotNull java.util.List<? extends java.util.List<java.lang.String>> list, @NotNull java.lang.String str) {
        SignalOverviewKLineUiModel.DataPoint dataPoint;
        java.lang.Float fFIwbmz;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.isEmpty()) {
            return new SignalOverviewKLineUiModel(null, null, false, true, false, false, 55, null);
        }
        TimeIntervalSelector timeIntervalSelectorKWHzl = TimeIntervalSelector.Companion.KWHzl(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List list2 = (java.util.List) it.next();
            if (list2.size() >= 2 && (fFIwbmz = C59443zhD.fIwbmz((java.lang.String) list2.get(1))) != null) {
                float fFloatValue = fFIwbmz.floatValue();
                java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames((java.lang.String) list2.get(0));
                dataPoint = fieldNames != null ? new SignalOverviewKLineUiModel.DataPoint(fieldNames.longValue(), fFloatValue) : null;
            }
            if (dataPoint != null) {
                arrayList.add(dataPoint);
            }
        }
        return new SignalOverviewKLineUiModel(timeIntervalSelectorKWHzl, arrayList, false, false, true, false, 44, null);
    }

    public final C29584kwR copydefault(@NotNull SignalAlertHistoryData signalAlertHistoryData) {
        Intrinsics.checkNotNullParameter(signalAlertHistoryData, "");
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(signalAlertHistoryData.copydefault(), new Application());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            SignalAlertItemData signalAlertItemData = (SignalAlertItemData) obj;
            arrayList.add(new C29582kwP(i2, signalAlertItemData.copydefault(), signalAlertItemData.OLrzqt(), signalAlertItemData.AEQbTJ()));
            i = i2;
        }
        return new C29584kwR(arrayList, signalAlertHistoryData.KWHzl());
    }

    public final java.util.List<SignalUiModel> KWHzl(@NotNull java.util.List<SignalData> list, @NotNull java.util.Map<java.lang.String, TokenInfo> map) {
        java.util.Map<java.lang.String, TokenInfo> map2 = map;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (SignalData signalData : list) {
            TokenInfo tokenInfo = map2.get(signalData.fARcdN());
            SignalUiModel signalUiModel = tokenInfo == null ? null : new SignalUiModel(signalData.djBIcL(), tokenInfo.isConnected(), tokenInfo.EZpvd(), signalData.EZpvd(), signalData.OLrzqt(), signalData.copydefault(), signalData.KWHzl(), signalData.ejfBZ(), signalData.AhwBna(), tokenInfo.DbNXlk(), tokenInfo.KWHzl(), tokenInfo.OLrzqt(), C33129mqd.AhwBna(signalData.KWHzl()), tokenInfo.AkhnZx(), tokenInfo.fetchVPNInfo(), signalData.fJNWhG(), signalData.AkhnZx(), signalData.fetchVPNInfo(), signalData.values(), signalData.AYXKKw(), signalData.gEmmrt(), C33129mqd.djBIcL(signalData.DbNXlk()), Intrinsics.EZpvd((java.lang.Object) signalData.valueOf(), (java.lang.Object) "1"), InfluencerType.Companion.AEQbTJ(signalData.isConnected()), tokenInfo.gEmmrt());
            if (signalUiModel != null) {
                arrayList.add(signalUiModel);
            }
            map2 = map;
        }
        return arrayList;
    }

    public final java.util.List<SignalUpdate> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.EZpvd;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(SignalUpdate.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.util.List<SignalStatusUpdate> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Json json = this.EZpvd;
            json.getSerializersModule();
            return (java.util.List) json.decodeFromString(new ArrayListSerializer(SignalStatusUpdate.Companion.serializer()), str);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final java.util.Map<java.lang.String, TokenInfo> AEQbTJ(java.util.Map<java.lang.String, TokenInfo> map, java.util.List<java.lang.String> list, SignalMetricsFilter signalMetricsFilter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<java.lang.String, TokenInfo> entry : map.entrySet()) {
            TokenInfo value = entry.getValue();
            if (list.contains(value.gEmmrt()) && copydefault(signalMetricsFilter.copydefault(), C33129mqd.AEQbTJ(value.AhwBna())) && copydefault(signalMetricsFilter.AhwBna(), C33129mqd.AEQbTJ(value.fIwbmz())) && copydefault(signalMetricsFilter.OLrzqt(), C33129mqd.AEQbTJ(value.valueOf())) && copydefault(signalMetricsFilter.valueOf(), C33129mqd.AEQbTJ(value.fJNWhG())) && copydefault(signalMetricsFilter.KWHzl(), C33129mqd.AEQbTJ(value.AEQbTJ())) && copydefault(signalMetricsFilter.AEQbTJ(), C33129mqd.AEQbTJ(value.AYXKKw())) && AEQbTJ(signalMetricsFilter, C33129mqd.valueOf(java.lang.Long.valueOf(value.values())))) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public final java.util.Set<InfluencerType> OLrzqt(java.util.List<SignalMultiSelectUiModel> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(InfluencerType.Companion.AEQbTJ(((SignalMultiSelectUiModel) it.next()).copydefault()));
        }
        return CollectionsKt___CollectionsKt.OqFWZa(arrayList);
    }
}
