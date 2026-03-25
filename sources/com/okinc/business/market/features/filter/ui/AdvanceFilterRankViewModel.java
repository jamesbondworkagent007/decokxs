package com.okinc.business.market.features.filter.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.ui.params.FilterRankFragmentParams;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C26280jYp;
import o.C33069mpW;
import o.C33070mpX;
import o.C56390yDp;
import o.C56423yEv;
import o.jUY;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceFilterRankViewModel extends ViewModel {
    public final FilterRankFragmentParams AEQbTJ;
    public final MutableLiveData<jUY> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<jUY> EZpvd() {
        return this.copydefault;
    }

    @yCM
    public AdvanceFilterRankViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        FilterRankFragmentParams filterRankFragmentParams = (FilterRankFragmentParams) savedStateHandle.get("key.filter_rank_params");
        this.AEQbTJ = filterRankFragmentParams == null ? new FilterRankFragmentParams(null, null, null, 7, null) : filterRankFragmentParams;
        this.copydefault = new MutableLiveData<>();
    }

    public final void OLrzqt(AdvancedFilter advancedFilter) {
        RankingType rankingTypeIsConnected;
        if (advancedFilter == null || (rankingTypeIsConnected = advancedFilter.isConnected()) == null) {
            rankingTypeIsConnected = RankingType.SEARCH;
        }
        TimeIntervalType.Companion companion = TimeIntervalType.Companion;
        TimeIntervalType timeIntervalTypeEZpvd = this.AEQbTJ.EZpvd();
        if (timeIntervalTypeEZpvd == null) {
            timeIntervalTypeEZpvd = TimeIntervalType.TWENTY_FOUR_HOUR;
        }
        String strAYXKKw = C33070mpX.AYXKKw(companion.copydefault(timeIntervalTypeEZpvd));
        C26280jYp[] c26280jYpArr = new C26280jYp[9];
        String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.UkvvWh);
        RankingType rankingType = RankingType.TURNOVER;
        c26280jYpArr[0] = new C26280jYp(strAYXKKw2, rankingType, rankingTypeIsConnected == rankingType);
        String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.avCqka);
        RankingType rankingType2 = RankingType.MARKET_CAP;
        c26280jYpArr[1] = new C26280jYp(strAYXKKw3, rankingType2, rankingTypeIsConnected == rankingType2);
        String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.build);
        RankingType rankingType3 = RankingType.PRICE;
        c26280jYpArr[2] = new C26280jYp(strAYXKKw4, rankingType3, rankingTypeIsConnected == rankingType3);
        String strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.dbAction, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        RankingType rankingType4 = RankingType.CHANGE;
        c26280jYpArr[3] = new C26280jYp(strCopydefault, rankingType4, rankingTypeIsConnected == rankingType4);
        String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.getFlags);
        RankingType rankingType5 = RankingType.TRANSACTION;
        c26280jYpArr[4] = new C26280jYp(strAYXKKw5, rankingType5, rankingTypeIsConnected == rankingType5);
        String strAYXKKw6 = C33070mpX.AYXKKw(C23274hvD.Fragment.DhEJvI);
        RankingType rankingType6 = RankingType.UNIQUE_TRADER;
        c26280jYpArr[5] = new C26280jYp(strAYXKKw6, rankingType6, rankingTypeIsConnected == rankingType6);
        String strAYXKKw7 = C33070mpX.AYXKKw(C23274hvD.Fragment.reportFullyDrawn);
        RankingType rankingType7 = RankingType.HOLDER;
        c26280jYpArr[6] = new C26280jYp(strAYXKKw7, rankingType7, rankingTypeIsConnected == rankingType7);
        String strAYXKKw8 = C33070mpX.AYXKKw(C23274hvD.Fragment.DGUQLIdZmdUa);
        RankingType rankingType8 = RankingType.TOKEN_AGE;
        c26280jYpArr[7] = new C26280jYp(strAYXKKw8, rankingType8, rankingTypeIsConnected == rankingType8);
        String strAYXKKw9 = C33070mpX.AYXKKw(C23274hvD.Fragment.createSocket);
        RankingType rankingType9 = RankingType.LIQUIDITY;
        c26280jYpArr[8] = new C26280jYp(strAYXKKw9, rankingType9, rankingTypeIsConnected == rankingType9);
        this.copydefault.setValue(new jUY(false, yDY.copydefault(c26280jYpArr), false, 5, null));
    }

    public final AdvancedFilter AEQbTJ(boolean z) {
        RankingType rankingTypeCopydefault;
        TimeIntervalType timeIntervalTypeCopydefault;
        TimeIntervalType timeIntervalTypeIwGUEr;
        TimeIntervalType timeIntervalTypeAwvSrB;
        TimeIntervalType timeIntervalTypeWlaJM;
        TokenAgeType tokenAgeTypeHDKMBd;
        TimeIntervalType timeIntervalTypeFetchVPNInfo;
        TimeIntervalType timeIntervalTypeZLjUOn;
        List<C26280jYp> listEZpvd;
        jUY value = this.copydefault.getValue();
        C26280jYp c26280jYp = null;
        Object obj = null;
        c26280jYp = null;
        if (value != null && (listEZpvd = value.EZpvd()) != null) {
            Iterator<T> it = listEZpvd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C26280jYp) next).AEQbTJ()) {
                    obj = next;
                    break;
                }
            }
            c26280jYp = (C26280jYp) obj;
        }
        if (c26280jYp == null || (rankingTypeCopydefault = c26280jYp.copydefault()) == null) {
            rankingTypeCopydefault = RankingType.SEARCH;
        }
        RankingType rankingType = rankingTypeCopydefault;
        AdvancedFilter advancedFilterCopydefault = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault == null || (timeIntervalTypeCopydefault = advancedFilterCopydefault.copydefault()) == null) {
            timeIntervalTypeCopydefault = TimeIntervalType.FIVE_MIN;
        }
        TimeIntervalType timeIntervalType = timeIntervalTypeCopydefault;
        AdvancedFilter advancedFilterCopydefault2 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault2 == null || (timeIntervalTypeIwGUEr = advancedFilterCopydefault2.iwGUEr()) == null) {
            timeIntervalTypeIwGUEr = TimeIntervalType.FIVE_MIN;
        }
        TimeIntervalType timeIntervalType2 = timeIntervalTypeIwGUEr;
        AdvancedFilter advancedFilterCopydefault3 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault3 == null || (timeIntervalTypeAwvSrB = advancedFilterCopydefault3.AwvSrB()) == null) {
            timeIntervalTypeAwvSrB = TimeIntervalType.FIVE_MIN;
        }
        TimeIntervalType timeIntervalType3 = timeIntervalTypeAwvSrB;
        AdvancedFilter advancedFilterCopydefault4 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault4 == null || (timeIntervalTypeWlaJM = advancedFilterCopydefault4.wlaJM()) == null) {
            timeIntervalTypeWlaJM = TimeIntervalType.FIVE_MIN;
        }
        TimeIntervalType timeIntervalType4 = timeIntervalTypeWlaJM;
        AdvancedFilter advancedFilterCopydefault5 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault5 == null || (tokenAgeTypeHDKMBd = advancedFilterCopydefault5.hDKMBd()) == null) {
            tokenAgeTypeHDKMBd = TokenAgeType.DAY;
        }
        TokenAgeType tokenAgeType = tokenAgeTypeHDKMBd;
        AdvancedFilter advancedFilterCopydefault6 = this.AEQbTJ.copydefault();
        int iFARcdN = advancedFilterCopydefault6 != null ? advancedFilterCopydefault6.fARcdN() : 0;
        AdvancedFilter advancedFilterCopydefault7 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault7 == null || (timeIntervalTypeFetchVPNInfo = advancedFilterCopydefault7.fetchVPNInfo()) == null) {
            timeIntervalTypeFetchVPNInfo = TimeIntervalType.FIVE_MIN;
        }
        TimeIntervalType timeIntervalType5 = timeIntervalTypeFetchVPNInfo;
        AdvancedFilter advancedFilterCopydefault8 = this.AEQbTJ.copydefault();
        if (advancedFilterCopydefault8 == null || (timeIntervalTypeZLjUOn = advancedFilterCopydefault8.zLjUOn()) == null) {
            timeIntervalTypeZLjUOn = TimeIntervalType.FIVE_MIN;
        }
        return new AdvancedFilter(timeIntervalType, null, null, timeIntervalType2, null, null, timeIntervalType3, null, null, timeIntervalTypeZLjUOn, null, null, timeIntervalType4, null, null, null, null, null, null, null, null, tokenAgeType, null, null, iFARcdN, false, null, null, z, rankingType, timeIntervalType5, false, null, false, -1897927242, 3, null);
    }
}
