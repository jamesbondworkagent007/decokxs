package com.okinc.business.market.features.filter.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.common.constants.RangeType;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C26281jYq;
import o.C33069mpW;
import o.C33070mpX;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import o.jUD;
import o.jUW;
import o.jVE;
import o.jVK;
import o.kMU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceFilterRangeViewModel extends ViewModel {
    public final FilterRangeFragmentParams KWHzl;
    public final MutableLiveData<jUW> OLrzqt;
    public Map<RangeType, TokenFilter> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<jUW> AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public AdvanceFilterRangeViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        FilterRangeFragmentParams filterRangeFragmentParams = (FilterRangeFragmentParams) savedStateHandle.get("key.filter_range_params");
        this.KWHzl = filterRangeFragmentParams == null ? new FilterRangeFragmentParams(null, null, null, null, null, 31, null) : filterRangeFragmentParams;
        this.OLrzqt = new MutableLiveData<>();
        this.copydefault = new ConcurrentHashMap();
    }

    public final void copydefault() {
        Map<RangeType, TokenFilter> mapEZpvd = jUD.copydefault.EZpvd(this.KWHzl.KWHzl());
        if (mapEZpvd != null) {
            this.copydefault = C56424yEw.isConnected(mapEZpvd);
        }
    }

    public final void valueOf() {
        jUD.copydefault.AEQbTJ(this.KWHzl.KWHzl(), this.copydefault);
    }

    public final TokenFilter EZpvd(@NotNull RangeType rangeType) {
        Intrinsics.checkNotNullParameter(rangeType, "");
        TokenFilter tokenFilter = this.copydefault.get(rangeType);
        if (tokenFilter != null) {
            return tokenFilter;
        }
        int value = rangeType.getValue();
        FilterRangeFragmentParams filterRangeFragmentParams = this.KWHzl;
        return new TokenFilter(null, null, String.valueOf(value), filterRangeFragmentParams.AEQbTJ(rangeType, filterRangeFragmentParams.AEQbTJ()), null, false, false, null, false, false, null, null, null, 8083, null);
    }

    public final TokenFilter copydefault(@NotNull RangeType rangeType) {
        Intrinsics.checkNotNullParameter(rangeType, "");
        int value = rangeType.getValue();
        FilterRangeFragmentParams filterRangeFragmentParams = this.KWHzl;
        return new TokenFilter(null, null, String.valueOf(value), filterRangeFragmentParams.AEQbTJ(rangeType, filterRangeFragmentParams.EZpvd()), null, false, false, null, false, false, null, null, null, 8083, null);
    }

    public final void AEQbTJ(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.copydefault.put(RangeType.Companion.OLrzqt(tokenFilter.DbNXlk()), tokenFilter);
    }

    public final void OLrzqt(AdvancedFilter advancedFilter) {
        PriceRangeFilter priceRangeFilterAYXKKw;
        PriceRangeFilter priceRangeFilterAYXKKw2;
        PriceRangeFilter priceRangeFilterAYXKKw3;
        PriceRangeFilter priceRangeFilterAYXKKw4;
        PriceRangeFilter priceRangeFilterAYXKKw5;
        PriceRangeFilter priceRangeFilterAYXKKw6;
        PriceRangeFilter priceRangeFilterAYXKKw7;
        PriceRangeFilter priceRangeFilterAYXKKw8;
        PriceRangeFilter priceRangeFilterAYXKKw9;
        PriceRangeFilter priceRangeFilterAYXKKw10;
        TimeIntervalType.Companion companion = TimeIntervalType.Companion;
        TimeIntervalType timeIntervalTypeCopydefault = this.KWHzl.copydefault();
        if (timeIntervalTypeCopydefault == null) {
            timeIntervalTypeCopydefault = TimeIntervalType.TWENTY_FOUR_HOUR;
        }
        String strAYXKKw = C33070mpX.AYXKKw(companion.copydefault(timeIntervalTypeCopydefault));
        Map<RangeType, TokenFilter> map = this.copydefault;
        RangeType rangeType = RangeType.MARKET_CAP;
        TokenFilter tokenFilter = map.get(rangeType);
        Map<RangeType, TokenFilter> map2 = this.copydefault;
        RangeType rangeType2 = RangeType.TURNOVER;
        TokenFilter tokenFilter2 = map2.get(rangeType2);
        Map<RangeType, TokenFilter> map3 = this.copydefault;
        RangeType rangeType3 = RangeType.LIQUIDITY;
        TokenFilter tokenFilter3 = map3.get(rangeType3);
        Map<RangeType, TokenFilter> map4 = this.copydefault;
        RangeType rangeType4 = RangeType.TIME_VOLUME;
        TokenFilter tokenFilter4 = map4.get(rangeType4);
        Map<RangeType, TokenFilter> map5 = this.copydefault;
        RangeType rangeType5 = RangeType.FDV;
        TokenFilter tokenFilter5 = map5.get(rangeType5);
        kMU[] kmuArr = new kMU[13];
        String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.avCqka);
        String strAEQbTJ = null;
        String strAkhnZx = advancedFilter != null ? advancedFilter.AkhnZx() : null;
        String str = strAkhnZx == null ? "" : strAkhnZx;
        String strDbNXlk = advancedFilter != null ? advancedFilter.DbNXlk() : null;
        String str2 = strDbNXlk == null ? "" : strDbNXlk;
        String strOLrzqt = (tokenFilter == null || (priceRangeFilterAYXKKw10 = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw10.OLrzqt();
        String str3 = strOLrzqt == null ? "" : strOLrzqt;
        String strAEQbTJ2 = (tokenFilter == null || (priceRangeFilterAYXKKw9 = tokenFilter.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw9.AEQbTJ();
        if (strAEQbTJ2 == null) {
            strAEQbTJ2 = "";
        }
        kmuArr[0] = new jVE(strAYXKKw2, rangeType, str, str2, null, str3, strAEQbTJ2, "market_cap", 16, null);
        String strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.dESsmu, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        String strSSMYrx = advancedFilter != null ? advancedFilter.sSMYrx() : null;
        String str4 = strSSMYrx == null ? "" : strSSMYrx;
        String strAxsJAY = advancedFilter != null ? advancedFilter.AxsJAY() : null;
        String str5 = strAxsJAY == null ? "" : strAxsJAY;
        String strOLrzqt2 = (tokenFilter2 == null || (priceRangeFilterAYXKKw8 = tokenFilter2.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw8.OLrzqt();
        String str6 = strOLrzqt2 == null ? "" : strOLrzqt2;
        String strAEQbTJ3 = (tokenFilter2 == null || (priceRangeFilterAYXKKw7 = tokenFilter2.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw7.AEQbTJ();
        kmuArr[1] = new jVE(strCopydefault, rangeType2, str4, str5, null, str6, strAEQbTJ3 == null ? "" : strAEQbTJ3, "turnover", 16, null);
        String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.createSocket);
        String strValues = advancedFilter != null ? advancedFilter.values() : null;
        String str7 = strValues == null ? "" : strValues;
        String strDjBIcL = advancedFilter != null ? advancedFilter.djBIcL() : null;
        String str8 = strDjBIcL == null ? "" : strDjBIcL;
        String strOLrzqt3 = (tokenFilter3 == null || (priceRangeFilterAYXKKw6 = tokenFilter3.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw6.OLrzqt();
        String str9 = strOLrzqt3 == null ? "" : strOLrzqt3;
        String strAEQbTJ4 = (tokenFilter3 == null || (priceRangeFilterAYXKKw5 = tokenFilter3.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw5.AEQbTJ();
        kmuArr[2] = new jVE(strAYXKKw3, rangeType3, str7, str8, null, str9, strAEQbTJ4 == null ? "" : strAEQbTJ4, "liquidity", 16, null);
        String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.DGUQLIdZmdUa);
        RangeType rangeType6 = RangeType.TIME_CREATE;
        String strFIwbmz = advancedFilter != null ? advancedFilter.fIwbmz() : null;
        String str10 = strFIwbmz == null ? "" : strFIwbmz;
        String strAuCTel = advancedFilter != null ? advancedFilter.AuCTel() : null;
        kmuArr[3] = new jVE(strAYXKKw4, rangeType6, str10, strAuCTel == null ? "" : strAuCTel, advancedFilter != null ? advancedFilter.hDKMBd() : null, null, null, "time_created", 96, null);
        String strCopydefault2 = C33069mpW.copydefault(C23274hvD.Fragment.dbAction, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        RangeType rangeType7 = RangeType.CHANGE;
        String strOLrzqt4 = advancedFilter != null ? advancedFilter.OLrzqt() : null;
        String str11 = strOLrzqt4 == null ? "" : strOLrzqt4;
        String strKWHzl = advancedFilter != null ? advancedFilter.KWHzl() : null;
        kmuArr[4] = new jVE(strCopydefault2, rangeType7, str11, strKWHzl == null ? "" : strKWHzl, null, null, null, "change", WalletImportError.ERROR_CODE_AA_EXIST, null);
        String strCopydefault3 = C33069mpW.copydefault(C23274hvD.Fragment.ZxnNGp, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        RangeType rangeType8 = RangeType.UNIQUE_TRADER;
        String strAubY = advancedFilter != null ? advancedFilter.AubY() : null;
        String str12 = strAubY == null ? "" : strAubY;
        String strAuCTelauCTel = advancedFilter != null ? advancedFilter.AuCTelauCTel() : null;
        kmuArr[5] = new jVE(strCopydefault3, rangeType8, str12, strAuCTelauCTel == null ? "" : strAuCTelauCTel, null, null, null, "unique_traders", WalletImportError.ERROR_CODE_AA_EXIST, null);
        String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.reportFullyDrawn);
        RangeType rangeType9 = RangeType.HOLDER;
        String strAhwBna = advancedFilter != null ? advancedFilter.AhwBna() : null;
        String str13 = strAhwBna == null ? "" : strAhwBna;
        String strAYXKKw6 = advancedFilter != null ? advancedFilter.AYXKKw() : null;
        kmuArr[6] = new jVE(strAYXKKw5, rangeType9, str13, strAYXKKw6 == null ? "" : strAYXKKw6, null, null, null, "holders", WalletImportError.ERROR_CODE_AA_EXIST, null);
        String strCopydefault4 = C33069mpW.copydefault(C23274hvD.Fragment.DjzMc, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        RangeType rangeType10 = RangeType.TRANSACTION;
        String strZsXlph = advancedFilter != null ? advancedFilter.zsXlph() : null;
        String str14 = strZsXlph == null ? "" : strZsXlph;
        String fieldNames = advancedFilter != null ? advancedFilter.getFieldNames() : null;
        kmuArr[7] = new jVE(strCopydefault4, rangeType10, str14, fieldNames == null ? "" : fieldNames, advancedFilter != null ? advancedFilter.hDKMBd() : null, null, null, "transaction", 96, null);
        String strCopydefault5 = C33069mpW.copydefault(C23274hvD.Fragment.dxTXDv, C56423yEv.EZpvd(C56390yDp.OLrzqt(CrashHianalyticsData.TIME, strAYXKKw)));
        String newProxyInstance = advancedFilter != null ? advancedFilter.getNewProxyInstance() : null;
        String str15 = newProxyInstance == null ? "" : newProxyInstance;
        String strUzCIH = advancedFilter != null ? advancedFilter.uzCIH() : null;
        String str16 = strUzCIH == null ? "" : strUzCIH;
        String strOLrzqt5 = (tokenFilter4 == null || (priceRangeFilterAYXKKw4 = tokenFilter4.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw4.OLrzqt();
        String str17 = strOLrzqt5 == null ? "" : strOLrzqt5;
        String strAEQbTJ5 = (tokenFilter4 == null || (priceRangeFilterAYXKKw3 = tokenFilter4.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw3.AEQbTJ();
        kmuArr[8] = new jVE(strCopydefault5, rangeType4, str15, str16, null, str17, strAEQbTJ5 == null ? "" : strAEQbTJ5, "volume", 16, null);
        String strAYXKKw7 = C33070mpX.AYXKKw(C23274hvD.Fragment.ZaDspl);
        String strValueOf = advancedFilter != null ? advancedFilter.valueOf() : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        String strGEmmrt = advancedFilter != null ? advancedFilter.gEmmrt() : null;
        String str18 = strGEmmrt == null ? "" : strGEmmrt;
        String strOLrzqt6 = (tokenFilter5 == null || (priceRangeFilterAYXKKw2 = tokenFilter5.AYXKKw()) == null) ? null : priceRangeFilterAYXKKw2.OLrzqt();
        String str19 = strOLrzqt6 == null ? "" : strOLrzqt6;
        if (tokenFilter5 != null && (priceRangeFilterAYXKKw = tokenFilter5.AYXKKw()) != null) {
            strAEQbTJ = priceRangeFilterAYXKKw.AEQbTJ();
        }
        kmuArr[9] = new jVE(strAYXKKw7, rangeType5, strValueOf, str18, null, str19, strAEQbTJ == null ? "" : strAEQbTJ, "fdv", 16, null);
        kmuArr[10] = C26281jYq.AEQbTJ;
        kmuArr[11] = new jVK(C33070mpX.AYXKKw(C23274hvD.Fragment.postMessage), RangeType.RISK_FILTER, advancedFilter != null ? advancedFilter.fJNWhG() : false);
        kmuArr[12] = new jVK(C33070mpX.AYXKKw(C23274hvD.Fragment.ITrustedWebActivityCallbackStub), RangeType.STABLE_TOKEN_FILTER, advancedFilter != null ? advancedFilter.ejfBZ() : false);
        this.OLrzqt.setValue(new jUW(false, yDY.copydefault(kmuArr), false, 5, null));
    }

    public final List<jVE> OLrzqt() {
        List<Object> listEZpvd;
        jUW value = this.OLrzqt.getValue();
        if (value == null || (listEZpvd = value.EZpvd()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (obj instanceof jVE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<jVK> KWHzl() {
        List<Object> listEZpvd;
        jUW value = this.OLrzqt.getValue();
        if (value == null || (listEZpvd = value.EZpvd()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEZpvd) {
            if (obj instanceof jVK) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final AdvancedFilter EZpvd() {
        TimeIntervalType timeIntervalTypeFetchVPNInfo;
        jVE jve;
        jVE jve2;
        jVE jve3;
        jVE jve4;
        jVE jve5;
        jVE jve6;
        jVE jve7;
        jVE jve8;
        jVE jve9;
        jVE jve10;
        jVK jvk;
        jVK jvk2;
        TokenAgeType tokenAgeTypeOLrzqt;
        RankingType rankingTypeIsConnected;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        Object next8;
        Object next9;
        Object next10;
        Object next11;
        Object next12;
        AdvancedFilter advancedFilterAEQbTJ = this.KWHzl.AEQbTJ();
        if (advancedFilterAEQbTJ == null || (timeIntervalTypeFetchVPNInfo = advancedFilterAEQbTJ.fetchVPNInfo()) == null) {
            timeIntervalTypeFetchVPNInfo = TimeIntervalType.ONE_HOUR;
        }
        List<jVE> listOLrzqt = OLrzqt();
        if (listOLrzqt != null) {
            Iterator<T> it = listOLrzqt.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next12 = null;
                    break;
                }
                next12 = it.next();
                if (((jVE) next12).AEQbTJ() == RangeType.MARKET_CAP) {
                    break;
                }
            }
            jve = (jVE) next12;
        } else {
            jve = null;
        }
        List<jVE> listOLrzqt2 = OLrzqt();
        if (listOLrzqt2 != null) {
            Iterator<T> it2 = listOLrzqt2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next11 = null;
                    break;
                }
                next11 = it2.next();
                if (((jVE) next11).AEQbTJ() == RangeType.TURNOVER) {
                    break;
                }
            }
            jve2 = (jVE) next11;
        } else {
            jve2 = null;
        }
        List<jVE> listOLrzqt3 = OLrzqt();
        if (listOLrzqt3 != null) {
            Iterator<T> it3 = listOLrzqt3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next10 = null;
                    break;
                }
                next10 = it3.next();
                if (((jVE) next10).AEQbTJ() == RangeType.LIQUIDITY) {
                    break;
                }
            }
            jve3 = (jVE) next10;
        } else {
            jve3 = null;
        }
        List<jVE> listOLrzqt4 = OLrzqt();
        if (listOLrzqt4 != null) {
            Iterator<T> it4 = listOLrzqt4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next9 = null;
                    break;
                }
                next9 = it4.next();
                if (((jVE) next9).AEQbTJ() == RangeType.TIME_CREATE) {
                    break;
                }
            }
            jve4 = (jVE) next9;
        } else {
            jve4 = null;
        }
        List<jVE> listOLrzqt5 = OLrzqt();
        if (listOLrzqt5 != null) {
            Iterator<T> it5 = listOLrzqt5.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    next8 = null;
                    break;
                }
                next8 = it5.next();
                if (((jVE) next8).AEQbTJ() == RangeType.CHANGE) {
                    break;
                }
            }
            jve5 = (jVE) next8;
        } else {
            jve5 = null;
        }
        List<jVE> listOLrzqt6 = OLrzqt();
        if (listOLrzqt6 != null) {
            Iterator<T> it6 = listOLrzqt6.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it6.next();
                if (((jVE) next7).AEQbTJ() == RangeType.UNIQUE_TRADER) {
                    break;
                }
            }
            jve6 = (jVE) next7;
        } else {
            jve6 = null;
        }
        List<jVE> listOLrzqt7 = OLrzqt();
        if (listOLrzqt7 != null) {
            Iterator<T> it7 = listOLrzqt7.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it7.next();
                if (((jVE) next6).AEQbTJ() == RangeType.HOLDER) {
                    break;
                }
            }
            jve7 = (jVE) next6;
        } else {
            jve7 = null;
        }
        List<jVE> listOLrzqt8 = OLrzqt();
        if (listOLrzqt8 != null) {
            Iterator<T> it8 = listOLrzqt8.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it8.next();
                if (((jVE) next5).AEQbTJ() == RangeType.TRANSACTION) {
                    break;
                }
            }
            jve8 = (jVE) next5;
        } else {
            jve8 = null;
        }
        List<jVE> listOLrzqt9 = OLrzqt();
        if (listOLrzqt9 != null) {
            Iterator<T> it9 = listOLrzqt9.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it9.next();
                if (((jVE) next4).AEQbTJ() == RangeType.TIME_VOLUME) {
                    break;
                }
            }
            jve9 = (jVE) next4;
        } else {
            jve9 = null;
        }
        List<jVE> listOLrzqt10 = OLrzqt();
        if (listOLrzqt10 != null) {
            Iterator<T> it10 = listOLrzqt10.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it10.next();
                if (((jVE) next3).AEQbTJ() == RangeType.FDV) {
                    break;
                }
            }
            jve10 = (jVE) next3;
        } else {
            jve10 = null;
        }
        List<jVK> listKWHzl = KWHzl();
        if (listKWHzl != null) {
            Iterator<T> it11 = listKWHzl.iterator();
            while (true) {
                if (!it11.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it11.next();
                if (((jVK) next2).EZpvd() == RangeType.RISK_FILTER) {
                    break;
                }
            }
            jvk = (jVK) next2;
        } else {
            jvk = null;
        }
        List<jVK> listKWHzl2 = KWHzl();
        if (listKWHzl2 != null) {
            Iterator it12 = listKWHzl2.iterator();
            while (true) {
                if (!it12.hasNext()) {
                    next = null;
                    break;
                }
                next = it12.next();
                Iterator it13 = it12;
                if (((jVK) next).EZpvd() == RangeType.STABLE_TOKEN_FILTER) {
                    break;
                }
                it12 = it13;
            }
            jvk2 = (jVK) next;
        } else {
            jvk2 = null;
        }
        String strKWHzl = jve != null ? jve.KWHzl() : null;
        String str = strKWHzl == null ? "" : strKWHzl;
        String strCopydefault = jve != null ? jve.copydefault() : null;
        String str2 = strCopydefault == null ? "" : strCopydefault;
        String strKWHzl2 = jve8 != null ? jve8.KWHzl() : null;
        String str3 = strKWHzl2 == null ? "" : strKWHzl2;
        String strCopydefault2 = jve8 != null ? jve8.copydefault() : null;
        String str4 = strCopydefault2 == null ? "" : strCopydefault2;
        String strKWHzl3 = jve3 != null ? jve3.KWHzl() : null;
        String str5 = strKWHzl3 == null ? "" : strKWHzl3;
        String strCopydefault3 = jve3 != null ? jve3.copydefault() : null;
        String str6 = strCopydefault3 == null ? "" : strCopydefault3;
        String strKWHzl4 = jve4 != null ? jve4.KWHzl() : null;
        String str7 = strKWHzl4 == null ? "" : strKWHzl4;
        String strCopydefault4 = jve4 != null ? jve4.copydefault() : null;
        String str8 = strCopydefault4 == null ? "" : strCopydefault4;
        if (jve4 == null || (tokenAgeTypeOLrzqt = jve4.OLrzqt()) == null) {
            tokenAgeTypeOLrzqt = TokenAgeType.DAY;
        }
        TokenAgeType tokenAgeType = tokenAgeTypeOLrzqt;
        String strKWHzl5 = jve5 != null ? jve5.KWHzl() : null;
        String str9 = strKWHzl5 == null ? "" : strKWHzl5;
        String strCopydefault5 = jve5 != null ? jve5.copydefault() : null;
        String str10 = strCopydefault5 == null ? "" : strCopydefault5;
        String strKWHzl6 = jve6 != null ? jve6.KWHzl() : null;
        String str11 = strKWHzl6 == null ? "" : strKWHzl6;
        String strCopydefault6 = jve6 != null ? jve6.copydefault() : null;
        String str12 = strCopydefault6 == null ? "" : strCopydefault6;
        String strKWHzl7 = jve7 != null ? jve7.KWHzl() : null;
        String str13 = strKWHzl7 == null ? "" : strKWHzl7;
        String strCopydefault7 = jve7 != null ? jve7.copydefault() : null;
        String str14 = strCopydefault7 == null ? "" : strCopydefault7;
        String strKWHzl8 = jve9 != null ? jve9.KWHzl() : null;
        String str15 = strKWHzl8 == null ? "" : strKWHzl8;
        String strCopydefault8 = jve9 != null ? jve9.copydefault() : null;
        String str16 = strCopydefault8 == null ? "" : strCopydefault8;
        String strKWHzl9 = jve2 != null ? jve2.KWHzl() : null;
        String str17 = strKWHzl9 == null ? "" : strKWHzl9;
        String strCopydefault9 = jve2 != null ? jve2.copydefault() : null;
        String str18 = strCopydefault9 == null ? "" : strCopydefault9;
        String strKWHzl10 = jve10 != null ? jve10.KWHzl() : null;
        String str19 = strKWHzl10 == null ? "" : strKWHzl10;
        String strCopydefault10 = jve10 != null ? jve10.copydefault() : null;
        String str20 = strCopydefault10 == null ? "" : strCopydefault10;
        boolean zKWHzl = jvk != null ? jvk.KWHzl() : false;
        boolean zKWHzl2 = jvk2 != null ? jvk2.KWHzl() : false;
        AdvancedFilter advancedFilterAEQbTJ2 = this.KWHzl.AEQbTJ();
        int iFARcdN = advancedFilterAEQbTJ2 != null ? advancedFilterAEQbTJ2.fARcdN() : 0;
        AdvancedFilter advancedFilterAEQbTJ3 = this.KWHzl.AEQbTJ();
        if (advancedFilterAEQbTJ3 == null || (rankingTypeIsConnected = advancedFilterAEQbTJ3.isConnected()) == null) {
            rankingTypeIsConnected = RankingType.SEARCH;
        }
        return new AdvancedFilter(AEQbTJ(timeIntervalTypeFetchVPNInfo, jve5 != null ? jve5.KWHzl() : null, jve5 != null ? jve5.copydefault() : null), str9, str10, AEQbTJ(timeIntervalTypeFetchVPNInfo, jve9 != null ? jve9.KWHzl() : null, jve9 != null ? jve9.copydefault() : null), str15, str16, AEQbTJ(timeIntervalTypeFetchVPNInfo, jve2 != null ? jve2.KWHzl() : null, jve2 != null ? jve2.copydefault() : null), str17, str18, AEQbTJ(timeIntervalTypeFetchVPNInfo, jve8 != null ? jve8.KWHzl() : null, jve8 != null ? jve8.copydefault() : null), str3, str4, AEQbTJ(timeIntervalTypeFetchVPNInfo, jve6 != null ? jve6.KWHzl() : null, jve6 != null ? jve6.copydefault() : null), str11, str12, str, str2, str19, str20, str5, str6, tokenAgeType, str7, str8, iFARcdN, zKWHzl2, str13, str14, false, rankingTypeIsConnected, timeIntervalTypeFetchVPNInfo, zKWHzl, null, false, 268435456, 3, null);
    }

    public final TimeIntervalType AEQbTJ(TimeIntervalType timeIntervalType, String str, String str2) {
        return ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) ? TimeIntervalType.ONE_HOUR : timeIntervalType;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.ui.AdvanceFilterRangeViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
