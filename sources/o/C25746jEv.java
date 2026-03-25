package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendItem;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerTrendUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTrader;
import com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrendTraderUIModel;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jEv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25746jEv {
    public static final C25746jEv AEQbTJ = new C25746jEv();

    private C25746jEv() {
    }

    public final TrackerTrendUIModel OLrzqt(@NotNull TrackerTrendItem trackerTrendItem, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2, @NotNull java.util.List<ProtocolInfoData> list) {
        ProtocolInfoData protocolInfoData;
        java.util.List<java.lang.String> protocolGradientColor;
        java.lang.String str;
        java.util.List<java.lang.String> protocolGradientColor2;
        java.lang.String strCopydefault;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(trackerTrendItem, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(list, "");
        CompactTagData compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trackerTrendItem.AYXKKw());
        if (compactTagData == null || (strCopydefault = compactTagData.copydefault()) == null) {
            protocolInfoData = null;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((ProtocolInfoData) next).getProtocolTagKey(), (java.lang.Object) strCopydefault)) {
                    break;
                }
            }
            protocolInfoData = (ProtocolInfoData) next;
        }
        int iKWHzl = C31256lqb.KWHzl((protocolInfoData == null || (protocolGradientColor2 = protocolInfoData.getProtocolGradientColor()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor2, 0), C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        int iKWHzl2 = (protocolInfoData == null || (protocolGradientColor = protocolInfoData.getProtocolGradientColor()) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(protocolGradientColor, 1)) == null) ? iKWHzl : C31256lqb.KWHzl(str, C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
        java.lang.String strGEmmrt = trackerTrendItem.gEmmrt();
        java.lang.String strKWHzl = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) trackerTrendItem.KWHzl()) ^ true ? trackerTrendItem.KWHzl() : trackerTrendItem.AhwBna();
        java.lang.String strAhwBna = true ^ StringsKt__StringsKt.fARcdN((java.lang.CharSequence) trackerTrendItem.AhwBna()) ? trackerTrendItem.AhwBna() : trackerTrendItem.KWHzl();
        long jCopydefault = trackerTrendItem.copydefault();
        java.lang.String strOLrzqt = OLrzqt(trackerTrendItem.AEQbTJ(), false);
        int iValueOf = trackerTrendItem.valueOf();
        java.lang.String strOLrzqt2 = OLrzqt(trackerTrendItem.AkhnZx(), false);
        java.util.List<TrendTraderUIModel> listOLrzqt = OLrzqt(trackerTrendItem.isConnected(), map, map2);
        boolean zFetchVPNInfo = trackerTrendItem.fetchVPNInfo();
        java.lang.String strDjBIcL = trackerTrendItem.djBIcL();
        int iEZpvd = trackerTrendItem.EZpvd();
        java.lang.String strAEQbTJ = AEQbTJ(trackerTrendItem.EZpvd());
        java.lang.String strGEmmrt2 = trackerTrendItem.gEmmrt();
        java.lang.String str2 = trackerTrendItem.djBIcL() + "_" + trackerTrendItem.EZpvd();
        java.lang.String protocolLogo = protocolInfoData != null ? protocolInfoData.getProtocolLogo() : null;
        return new TrackerTrendUIModel(strGEmmrt, strKWHzl, strAhwBna, jCopydefault, strOLrzqt, protocolLogo == null ? "" : protocolLogo, iKWHzl, iKWHzl2, iValueOf, strOLrzqt2, listOLrzqt, zFetchVPNInfo, strDjBIcL, java.lang.String.valueOf(iEZpvd), strAEQbTJ, strGEmmrt2, false, str2, 65536, null);
    }

    public final java.lang.String OLrzqt(java.lang.String str, boolean z) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, z, null, false, false, 476, null);
    }

    public final int copydefault(java.lang.String str) {
        if (C33129mqd.AEQbTJ(str) > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return 1;
        }
        return C33129mqd.AEQbTJ(str) < AudioStats.AUDIO_AMPLITUDE_NONE ? -1 : 0;
    }

    public final java.lang.String AEQbTJ(int i) {
        if (i == 1) {
            return "Ethereum";
        }
        if (i == 10) {
            return "Optimism";
        }
        if (i == 56) {
            return "BSC";
        }
        if (i == 137) {
            return "Polygon";
        }
        if (i == 250) {
            return "Fantom";
        }
        if (i == 501) {
            return "Solana";
        }
        if (i == 42161) {
            return "Arbitrum";
        }
        if (i == 43114) {
            return "Avalanche";
        }
        return "Chain " + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<TrendTraderUIModel> OLrzqt(@NotNull java.util.List<TrendTrader> list, @NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.util.Map<java.lang.String, TrackingAddressAlias> map2) {
        java.lang.String address$default;
        TagExtraData tagExtraDataAEQbTJ;
        java.lang.String strAhwBna;
        java.lang.String str;
        TagExtraData tagExtraDataAEQbTJ2;
        TagExtraData tagExtraDataAEQbTJ3;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            TrendTrader trendTrader = (TrendTrader) it.next();
            java.lang.String strOLrzqt = trendTrader.OLrzqt();
            if (C33129mqd.OLrzqt((java.lang.CharSequence) trendTrader.EZpvd())) {
                address$default = trendTrader.EZpvd();
            } else {
                TrackingAddressAlias trackingAddressAlias = map2.get(trendTrader.OLrzqt());
                java.lang.String addressAlias = trackingAddressAlias != null ? trackingAddressAlias.getAddressAlias() : null;
                if (addressAlias != null && addressAlias.length() != 0) {
                    address$default = map2.getOrDefault(trendTrader.OLrzqt(), new TrackingAddressAlias((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 15, (DefaultConstructorMarker) null)).getAddressAlias();
                } else {
                    CompactTagData compactTagData = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trendTrader.valueOf());
                    if (compactTagData != null && (tagExtraDataAEQbTJ = compactTagData.AEQbTJ()) != null && (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) != null && C33129mqd.OLrzqt((java.lang.CharSequence) strAhwBna)) {
                        CompactTagData compactTagData2 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trendTrader.valueOf());
                        address$default = (compactTagData2 == null || (tagExtraDataAEQbTJ2 = compactTagData2.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ2.AhwBna();
                        if (address$default == null) {
                            str = "";
                        }
                        CompactTagData compactTagData3 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trendTrader.valueOf());
                        java.lang.String strGEmmrt = (compactTagData3 != null || (tagExtraDataAEQbTJ3 = compactTagData3.AEQbTJ()) == null) ? null : tagExtraDataAEQbTJ3.gEmmrt();
                        java.lang.String str2 = strGEmmrt != null ? "" : strGEmmrt;
                        int iAEQbTJ = trendTrader.AEQbTJ();
                        long jAYXKKw = trendTrader.AYXKKw();
                        C25746jEv c25746jEv = AEQbTJ;
                        java.lang.String strOLrzqt2 = c25746jEv.OLrzqt(trendTrader.copydefault(), false);
                        java.lang.String strOLrzqt3 = c25746jEv.OLrzqt(trendTrader.copydefault(), true);
                        java.util.Iterator it2 = it;
                        java.lang.String strOLrzqt4 = c25746jEv.OLrzqt(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null), false);
                        java.util.ArrayList arrayList2 = arrayList;
                        java.lang.String strOLrzqt5 = c25746jEv.OLrzqt(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null), true);
                        int iCopydefault = c25746jEv.copydefault(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null));
                        java.lang.String orDefault = map.getOrDefault(trendTrader.OLrzqt(), "");
                        TrackingAddressAlias trackingAddressAlias2 = map2.get(trendTrader.OLrzqt());
                        arrayList2.add(new TrendTraderUIModel(strOLrzqt, str, str2, iAEQbTJ, jAYXKKw, strOLrzqt2, strOLrzqt3, strOLrzqt4, strOLrzqt5, iCopydefault, orDefault, trackingAddressAlias2 == null ? trackingAddressAlias2.getAddressAliasColorHex() : null));
                        arrayList = arrayList2;
                        it = it2;
                    } else {
                        address$default = C25352ivB.formatAddress$default(trendTrader.OLrzqt(), 6, 4, null, 4, null);
                    }
                }
            }
            str = address$default;
            CompactTagData compactTagData32 = (CompactTagData) CollectionsKt___CollectionsKt.firstOrNull(trendTrader.valueOf());
            if (compactTagData32 != null) {
            }
            if (strGEmmrt != null) {
            }
            int iAEQbTJ2 = trendTrader.AEQbTJ();
            long jAYXKKw2 = trendTrader.AYXKKw();
            C25746jEv c25746jEv2 = AEQbTJ;
            java.lang.String strOLrzqt22 = c25746jEv2.OLrzqt(trendTrader.copydefault(), false);
            java.lang.String strOLrzqt32 = c25746jEv2.OLrzqt(trendTrader.copydefault(), true);
            java.util.Iterator it22 = it;
            java.lang.String strOLrzqt42 = c25746jEv2.OLrzqt(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null), false);
            java.util.ArrayList arrayList22 = arrayList;
            java.lang.String strOLrzqt52 = c25746jEv2.OLrzqt(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null), true);
            int iCopydefault2 = c25746jEv2.copydefault(C23313hvq.addCheckS$default(trendTrader.djBIcL(), trendTrader.gEmmrt(), null, null, null, 14, null));
            java.lang.String orDefault2 = map.getOrDefault(trendTrader.OLrzqt(), "");
            TrackingAddressAlias trackingAddressAlias22 = map2.get(trendTrader.OLrzqt());
            arrayList22.add(new TrendTraderUIModel(strOLrzqt, str, str2, iAEQbTJ2, jAYXKKw2, strOLrzqt22, strOLrzqt32, strOLrzqt42, strOLrzqt52, iCopydefault2, orDefault2, trackingAddressAlias22 == null ? trackingAddressAlias22.getAddressAliasColorHex() : null));
            arrayList = arrayList22;
            it = it22;
        }
        return arrayList;
    }
}
