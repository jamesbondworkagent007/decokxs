package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardFilterModel;
import com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel;
import com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel;
import com.okinc.business.market.features.smart_money.ranking.domain.model.RankingFilter;
import com.okinc.business.market.features.smart_money.ranking.domain.model.RankingWsExtraParams;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25667jBx {
    public static final RankingWsExtraParams KWHzl(@NotNull jBH jbh, @NotNull java.lang.String str) {
        java.lang.String filterId;
        java.lang.String filterId2;
        java.lang.String filterId3;
        Intrinsics.checkNotNullParameter(jbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(jbh.EZpvd().AEQbTJ()));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(java.lang.Integer.valueOf(jbh.EZpvd().copydefault()));
        java.lang.String strAEQbTJ = jbh.AEQbTJ();
        LeaderBoardSortModel leaderBoardSortModelCopydefault = jbh.copydefault();
        if (leaderBoardSortModelCopydefault == null || (filterId = leaderBoardSortModelCopydefault.getFilterId()) == null) {
            filterId = "kol";
        }
        java.lang.String str2 = filterId;
        LeaderBoardSortModel leaderBoardSortModelOLrzqt = jbh.OLrzqt();
        java.lang.String str3 = (leaderBoardSortModelOLrzqt == null || (filterId3 = leaderBoardSortModelOLrzqt.getFilterId()) == null) ? "" : filterId3;
        LeaderBoardSortModel leaderBoardSortModelAhwBna = jbh.AhwBna();
        java.lang.String str4 = (leaderBoardSortModelAhwBna == null || (filterId2 = leaderBoardSortModelAhwBna.getFilterId()) == null) ? "" : filterId2;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl = jbh.KWHzl();
        java.lang.String strAYXKKw = leaderBoardFilterModelKWHzl != null ? leaderBoardFilterModelKWHzl.AYXKKw() : null;
        java.lang.String str5 = strAYXKKw == null ? "" : strAYXKKw;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl2 = jbh.KWHzl();
        java.lang.String strDjBIcL = leaderBoardFilterModelKWHzl2 != null ? leaderBoardFilterModelKWHzl2.djBIcL() : null;
        java.lang.String str6 = strDjBIcL == null ? "" : strDjBIcL;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl3 = jbh.KWHzl();
        java.lang.String strValueOf = leaderBoardFilterModelKWHzl3 != null ? leaderBoardFilterModelKWHzl3.valueOf() : null;
        java.lang.String str7 = strValueOf == null ? "" : strValueOf;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl4 = jbh.KWHzl();
        java.lang.String strAhwBna = leaderBoardFilterModelKWHzl4 != null ? leaderBoardFilterModelKWHzl4.AhwBna() : null;
        java.lang.String str8 = strAhwBna == null ? "" : strAhwBna;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl5 = jbh.KWHzl();
        java.lang.String strAEQbTJ2 = leaderBoardFilterModelKWHzl5 != null ? leaderBoardFilterModelKWHzl5.AEQbTJ() : null;
        java.lang.String str9 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl6 = jbh.KWHzl();
        java.lang.String strOLrzqt = leaderBoardFilterModelKWHzl6 != null ? leaderBoardFilterModelKWHzl6.OLrzqt() : null;
        return new RankingWsExtraParams(str, strGEmmrt2, strGEmmrt, new RankingFilter(strAEQbTJ, "", str2, str3, (java.lang.String) null, (java.lang.String) null, str4, str9, strOLrzqt == null ? "" : strOLrzqt, str8, str7, (java.lang.String) null, (java.lang.String) null, str5, str6, 6192, (DefaultConstructorMarker) null));
    }

    public static final java.util.HashMap<java.lang.String, java.lang.String> OLrzqt(@NotNull jBH jbh) {
        java.lang.String filterId;
        Intrinsics.checkNotNullParameter(jbh, "");
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        C31198lpW.AEQbTJ(map, "chainId", jbh.AEQbTJ());
        LeaderBoardSortModel leaderBoardSortModelCopydefault = jbh.copydefault();
        if (leaderBoardSortModelCopydefault == null || (filterId = leaderBoardSortModelCopydefault.getFilterId()) == null) {
            filterId = "kol";
        }
        C31198lpW.AEQbTJ(map, "label", filterId);
        LeaderBoardSortModel leaderBoardSortModelAhwBna = jbh.AhwBna();
        C31198lpW.AEQbTJ(map, "rankBy", leaderBoardSortModelAhwBna != null ? leaderBoardSortModelAhwBna.getFilterId() : null);
        LeaderBoardSortModel leaderBoardSortModelOLrzqt = jbh.OLrzqt();
        C31198lpW.AEQbTJ(map, "periodType", leaderBoardSortModelOLrzqt != null ? leaderBoardSortModelOLrzqt.getFilterId() : null);
        C31198lpW.AEQbTJ(map, "rankStart", C33129mqd.gEmmrt(java.lang.Integer.valueOf(jbh.EZpvd().AEQbTJ())));
        C31198lpW.AEQbTJ(map, "rankEnd", C33129mqd.gEmmrt(java.lang.Integer.valueOf(jbh.EZpvd().copydefault())));
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl = jbh.KWHzl();
        java.lang.String strAhwBna = leaderBoardFilterModelKWHzl != null ? leaderBoardFilterModelKWHzl.AhwBna() : null;
        if (strAhwBna == null) {
            strAhwBna = "";
        }
        C31198lpW.AEQbTJ(map, "winRateMin", strAhwBna);
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl2 = jbh.KWHzl();
        java.lang.String strValueOf = leaderBoardFilterModelKWHzl2 != null ? leaderBoardFilterModelKWHzl2.valueOf() : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        C31198lpW.AEQbTJ(map, "winRateMax", strValueOf);
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl3 = jbh.KWHzl();
        java.lang.String strOLrzqt = leaderBoardFilterModelKWHzl3 != null ? leaderBoardFilterModelKWHzl3.OLrzqt() : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        C31198lpW.AEQbTJ(map, "roiMin", strOLrzqt);
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl4 = jbh.KWHzl();
        java.lang.String strAEQbTJ = leaderBoardFilterModelKWHzl4 != null ? leaderBoardFilterModelKWHzl4.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        C31198lpW.AEQbTJ(map, "roiMax", strAEQbTJ);
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl5 = jbh.KWHzl();
        java.lang.String strDjBIcL = leaderBoardFilterModelKWHzl5 != null ? leaderBoardFilterModelKWHzl5.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        C31198lpW.AEQbTJ(map, "txsMin", strDjBIcL);
        LeaderBoardFilterModel leaderBoardFilterModelKWHzl6 = jbh.KWHzl();
        java.lang.String strAYXKKw = leaderBoardFilterModelKWHzl6 != null ? leaderBoardFilterModelKWHzl6.AYXKKw() : null;
        C31198lpW.AEQbTJ(map, "txsMax", strAYXKKw != null ? strAYXKKw : "");
        return map;
    }

    public static final LeaderBoardCardUIModel KWHzl(@NotNull LeaderBoardCardUIModel leaderBoardCardUIModel, java.util.List<java.lang.String> list, java.util.List<TrackingAddressAlias> list2) {
        java.util.Set setCopydefault;
        java.util.Map mapKWHzl;
        java.lang.String addressAlias;
        Intrinsics.checkNotNullParameter(leaderBoardCardUIModel, "");
        if (list == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(list)) == null) {
            setCopydefault = yEE.copydefault();
        }
        if (list2 == null) {
            mapKWHzl = C56424yEw.KWHzl();
        } else {
            mapKWHzl = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list2, 10)), 16));
            for (java.lang.Object obj : list2) {
                mapKWHzl.put(((TrackingAddressAlias) obj).getCollectAddress(), obj);
            }
        }
        TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) mapKWHzl.get(leaderBoardCardUIModel.getWalletAddress());
        return leaderBoardCardUIModel.copy((8388351 & 1) != 0 ? leaderBoardCardUIModel.id : null, (8388351 & 2) != 0 ? leaderBoardCardUIModel.walletAddress : null, (8388351 & 4) != 0 ? leaderBoardCardUIModel.walletLogoUrl : null, (8388351 & 8) != 0 ? leaderBoardCardUIModel.kolTwitterLink : null, (8388351 & 16) != 0 ? leaderBoardCardUIModel.addressAlias : (trackingAddressAlias == null || (addressAlias = trackingAddressAlias.getAddressAlias()) == null) ? "" : addressAlias, (8388351 & 32) != 0 ? leaderBoardCardUIModel.accountName : null, (8388351 & 64) != 0 ? leaderBoardCardUIModel.isBookmarked : setCopydefault.contains(leaderBoardCardUIModel.getWalletAddress()), (8388351 & 128) != 0 ? leaderBoardCardUIModel.type : null, (8388351 & 256) != 0 ? leaderBoardCardUIModel.isSelected : false, (8388351 & 512) != 0 ? leaderBoardCardUIModel.chartItems : null, (8388351 & 1024) != 0 ? leaderBoardCardUIModel.chainId : null, (8388351 & 2048) != 0 ? leaderBoardCardUIModel.chainLogoUrl : null, (8388351 & 4096) != 0 ? leaderBoardCardUIModel.tokenPrice : null, (8388351 & 8192) != 0 ? leaderBoardCardUIModel.tokenBalance : null, (8388351 & 16384) != 0 ? leaderBoardCardUIModel.pnlAmount : null, (8388351 & 32768) != 0 ? leaderBoardCardUIModel.roiPercentage : null, (8388351 & 65536) != 0 ? leaderBoardCardUIModel.winRatePercentage : null, (8388351 & 131072) != 0 ? leaderBoardCardUIModel.winLossToken : null, (8388351 & 262144) != 0 ? leaderBoardCardUIModel.transactions : 0, (8388351 & 524288) != 0 ? leaderBoardCardUIModel.lastTime : null, (8388351 & 1048576) != 0 ? leaderBoardCardUIModel.periodType : null, (8388351 & 2097152) != 0 ? leaderBoardCardUIModel.emoji : null, (8388351 & 4194304) != 0 ? leaderBoardCardUIModel.addressDisplayColorHex : null);
    }

    public static final LeaderBoardContentUIModel EZpvd(@NotNull jBB jbb, java.util.List<MarketChainBean> list, java.util.List<java.lang.String> list2, java.util.List<TrackingAddressAlias> list3, @NotNull java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
        java.util.Set setCopydefault;
        java.util.Map mapKWHzl;
        java.lang.String strCopydefault;
        MarketChainBean marketChainBean;
        java.lang.Object next;
        java.lang.String chainLogo;
        java.lang.String strAhwBna;
        java.lang.String addressAlias;
        java.lang.String str;
        java.lang.Object next2;
        java.util.List<jBG> listKWHzl;
        jBG jbg;
        Intrinsics.checkNotNullParameter(jbb, "");
        Intrinsics.checkNotNullParameter(map, "");
        if (list2 == null || (setCopydefault = CollectionsKt___CollectionsKt.OqFWZa(list2)) == null) {
            setCopydefault = yEE.copydefault();
        }
        if (list3 == null) {
            mapKWHzl = C56424yEw.KWHzl();
        } else {
            mapKWHzl = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list3, 10)), 16));
            for (java.lang.Object obj : list3) {
                mapKWHzl.put(((TrackingAddressAlias) obj).getCollectAddress(), obj);
            }
        }
        jBE jbeCopydefault = jbb.copydefault();
        if (jbeCopydefault == null || (listKWHzl = jbeCopydefault.KWHzl()) == null || (jbg = (jBG) CollectionsKt___CollectionsKt.firstOrNull(listKWHzl)) == null || (strCopydefault = jbg.copydefault()) == null) {
            strCopydefault = "";
        }
        java.util.List<C25669jBz> listEZpvd = jbb.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (C25669jBz c25669jBz : listEZpvd) {
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((MarketChainBean) next2).getChainId(), (java.lang.Object) java.lang.String.valueOf(c25669jBz.copydefault()))) {
                        break;
                    }
                }
                marketChainBean = (MarketChainBean) next2;
            } else {
                marketChainBean = null;
            }
            java.util.Iterator<T> it2 = c25669jBz.AYXKKw().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((CompactTagData) next).copydefault(), (java.lang.Object) "kol")) {
                    break;
                }
            }
            CompactTagData compactTagData = (CompactTagData) next;
            TagExtraData tagExtraDataAEQbTJ = compactTagData != null ? compactTagData.AEQbTJ() : null;
            java.util.List<java.util.List<java.lang.String>> listOLrzqt = c25669jBz.OLrzqt();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it3 = listOLrzqt.iterator();
            while (it3.hasNext()) {
                java.util.List list4 = (java.util.List) it3.next();
                java.lang.String str2 = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list4, 0);
                ChartDataUIItem chartDataUIItem = (str2 == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(list4, 1)) == null) ? null : new ChartDataUIItem(str2, str, null, 4, null);
                if (chartDataUIItem != null) {
                    arrayList2.add(chartDataUIItem);
                }
            }
            java.lang.String strGEmmrt = c25669jBz.gEmmrt();
            java.lang.String strGEmmrt2 = tagExtraDataAEQbTJ != null ? tagExtraDataAEQbTJ.gEmmrt() : null;
            if (strGEmmrt2 == null) {
                strGEmmrt2 = "";
            }
            java.lang.String strDjBIcL = tagExtraDataAEQbTJ != null ? tagExtraDataAEQbTJ.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) mapKWHzl.get(c25669jBz.gEmmrt());
            java.lang.String str3 = (trackingAddressAlias == null || (addressAlias = trackingAddressAlias.getAddressAlias()) == null) ? "" : addressAlias;
            java.lang.String str4 = (tagExtraDataAEQbTJ == null || (strAhwBna = tagExtraDataAEQbTJ.AhwBna()) == null) ? "" : strAhwBna;
            int iCopydefault = c25669jBz.copydefault();
            java.lang.String str5 = (marketChainBean == null || (chainLogo = marketChainBean.getChainLogo()) == null) ? "" : chainLogo;
            java.lang.String str6 = z ? LeaderBoardCardUIModel.COPY_TRADE_TYPE : LeaderBoardCardUIModel.NORMAL_TYPE;
            boolean zContains = setCopydefault.contains(c25669jBz.gEmmrt());
            java.lang.String strEZpvd = c25669jBz.EZpvd();
            java.lang.String strValueOf = c25669jBz.valueOf();
            java.lang.String strDjBIcL2 = c25669jBz.djBIcL();
            java.lang.String strDbNXlk = c25669jBz.DbNXlk();
            java.util.List<java.lang.Integer> listIsConnected = c25669jBz.isConnected();
            int iAhwBna = c25669jBz.AhwBna();
            long jAEQbTJ = c25669jBz.AEQbTJ();
            java.lang.String strKWHzl = c25669jBz.KWHzl();
            java.lang.String orDefault = map.getOrDefault(c25669jBz.gEmmrt(), "");
            TrackingAddressAlias trackingAddressAlias2 = (TrackingAddressAlias) mapKWHzl.get(c25669jBz.gEmmrt());
            java.util.ArrayList arrayList3 = arrayList;
            arrayList3.add(new LeaderBoardCardUIModel(null, strGEmmrt, strGEmmrt2, strDjBIcL, str3, str4, zContains, str6, false, arrayList2, java.lang.String.valueOf(iCopydefault), str5, strCopydefault, strEZpvd, strValueOf, strDjBIcL2, strDbNXlk, listIsConnected, iAhwBna, java.lang.String.valueOf(jAEQbTJ), strKWHzl, orDefault, trackingAddressAlias2 != null ? trackingAddressAlias2.getAddressAliasColorHex() : null, 257, null));
            arrayList = arrayList3;
        }
        return new LeaderBoardContentUIModel(jbb.AEQbTJ(), jbb.OLrzqt(), jbb.KWHzl(), arrayList);
    }
}
