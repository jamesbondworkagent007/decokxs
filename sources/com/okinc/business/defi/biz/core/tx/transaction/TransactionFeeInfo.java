package com.okinc.business.defi.biz.core.tx.transaction;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionFeeInfo {
    public static final int $stable = 8;
    private String baseFee;
    private String coinSymbol;
    private String displayFeeValue;
    private String displayRecommend;
    private List<EstimateTime> estimateTimeList;
    private String estimatedFee;
    private String extFee;
    private String fastFee;
    private String fastMinFee;
    private String feeSymbol;
    private String feeValue;
    private String gasPriceMax;
    private String gasPriceMin;
    private String gasPriceNormal;
    private boolean isFixed;
    private String maxCost;
    private String maxPriorityFee;
    private String memPoolGasPriceMin;
    private String minGasPrice;
    private String minPriorityFee;
    private String mixCost;
    private String normalCost;
    private String normalPriorityFee;
    private String recommendFee;
    private String recommendMinFee;
    private String rent;
    private String reserveFeeRatio;
    private String slowFee;
    private String slowMinFee;
    private String solRent;
    private String suggestBaseFee;
    private Boolean supportEip1559;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionFeeInfo() {
        this(null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.slowMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.feeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.memPoolGasPriceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.gasPriceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.gasPriceNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.gasPriceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.mixCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.minPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.normalPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.maxPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimateTime> component27() {
        return this.estimateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.estimatedFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.extFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fastMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.rent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.solRent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.recommendMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.recommendFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isFixed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displayFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFeeInfo copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, String str24, List<EstimateTime> list, String str25, String str26, String str27, String str28, String str29) {
        return new TransactionFeeInfo(str, str2, str3, str4, str5, str6, z, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, bool, str20, str21, str22, str23, str24, list, str25, str26, str27, str28, str29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionFeeInfo)) {
            return false;
        }
        TransactionFeeInfo transactionFeeInfo = (TransactionFeeInfo) obj;
        return Intrinsics.EZpvd((Object) this.slowMinFee, (Object) transactionFeeInfo.slowMinFee) && Intrinsics.EZpvd((Object) this.slowFee, (Object) transactionFeeInfo.slowFee) && Intrinsics.EZpvd((Object) this.fastMinFee, (Object) transactionFeeInfo.fastMinFee) && Intrinsics.EZpvd((Object) this.fastFee, (Object) transactionFeeInfo.fastFee) && Intrinsics.EZpvd((Object) this.recommendMinFee, (Object) transactionFeeInfo.recommendMinFee) && Intrinsics.EZpvd((Object) this.recommendFee, (Object) transactionFeeInfo.recommendFee) && this.isFixed == transactionFeeInfo.isFixed && Intrinsics.EZpvd((Object) this.displayRecommend, (Object) transactionFeeInfo.displayRecommend) && Intrinsics.EZpvd((Object) this.displayFeeValue, (Object) transactionFeeInfo.displayFeeValue) && Intrinsics.EZpvd((Object) this.feeSymbol, (Object) transactionFeeInfo.feeSymbol) && Intrinsics.EZpvd((Object) this.coinSymbol, (Object) transactionFeeInfo.coinSymbol) && Intrinsics.EZpvd((Object) this.feeValue, (Object) transactionFeeInfo.feeValue) && Intrinsics.EZpvd((Object) this.memPoolGasPriceMin, (Object) transactionFeeInfo.memPoolGasPriceMin) && Intrinsics.EZpvd((Object) this.gasPriceMin, (Object) transactionFeeInfo.gasPriceMin) && Intrinsics.EZpvd((Object) this.gasPriceNormal, (Object) transactionFeeInfo.gasPriceNormal) && Intrinsics.EZpvd((Object) this.gasPriceMax, (Object) transactionFeeInfo.gasPriceMax) && Intrinsics.EZpvd((Object) this.minGasPrice, (Object) transactionFeeInfo.minGasPrice) && Intrinsics.EZpvd((Object) this.mixCost, (Object) transactionFeeInfo.mixCost) && Intrinsics.EZpvd((Object) this.normalCost, (Object) transactionFeeInfo.normalCost) && Intrinsics.EZpvd((Object) this.maxCost, (Object) transactionFeeInfo.maxCost) && Intrinsics.EZpvd(this.supportEip1559, transactionFeeInfo.supportEip1559) && Intrinsics.EZpvd((Object) this.baseFee, (Object) transactionFeeInfo.baseFee) && Intrinsics.EZpvd((Object) this.suggestBaseFee, (Object) transactionFeeInfo.suggestBaseFee) && Intrinsics.EZpvd((Object) this.minPriorityFee, (Object) transactionFeeInfo.minPriorityFee) && Intrinsics.EZpvd((Object) this.normalPriorityFee, (Object) transactionFeeInfo.normalPriorityFee) && Intrinsics.EZpvd((Object) this.maxPriorityFee, (Object) transactionFeeInfo.maxPriorityFee) && Intrinsics.EZpvd(this.estimateTimeList, transactionFeeInfo.estimateTimeList) && Intrinsics.EZpvd((Object) this.estimatedFee, (Object) transactionFeeInfo.estimatedFee) && Intrinsics.EZpvd((Object) this.extFee, (Object) transactionFeeInfo.extFee) && Intrinsics.EZpvd((Object) this.reserveFeeRatio, (Object) transactionFeeInfo.reserveFeeRatio) && Intrinsics.EZpvd((Object) this.rent, (Object) transactionFeeInfo.rent) && Intrinsics.EZpvd((Object) this.solRent, (Object) transactionFeeInfo.solRent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinSymbol() {
        return this.coinSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayFeeValue() {
        return this.displayFeeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayRecommend() {
        return this.displayRecommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EstimateTime> getEstimateTimeList() {
        return this.estimateTimeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedFee() {
        return this.estimatedFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtFee() {
        return this.extFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastFee() {
        return this.fastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFastMinFee() {
        return this.fastMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeSymbol() {
        return this.feeSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceMax() {
        return this.gasPriceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceMin() {
        return this.gasPriceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPriceNormal() {
        return this.gasPriceNormal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxCost() {
        return this.maxCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFee() {
        return this.maxPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemPoolGasPriceMin() {
        return this.memPoolGasPriceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinGasPrice() {
        return this.minGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPriorityFee() {
        return this.minPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMixCost() {
        return this.mixCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalCost() {
        return this.normalCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNormalPriorityFee() {
        return this.normalPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendFee() {
        return this.recommendFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecommendMinFee() {
        return this.recommendMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRent() {
        return this.rent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReserveFeeRatio() {
        return this.reserveFeeRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlowFee() {
        return this.slowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlowMinFee() {
        return this.slowMinFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSolRent() {
        return this.solRent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSuggestBaseFee() {
        return this.suggestBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportEip1559() {
        return this.supportEip1559;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.slowMinFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.slowFee;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fastMinFee;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.fastFee;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.recommendMinFee;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.recommendFee;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isFixed);
        String str7 = this.displayRecommend;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.displayFeeValue;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.feeSymbol;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.coinSymbol;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.feeValue;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.memPoolGasPriceMin;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gasPriceMin;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.gasPriceNormal;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.gasPriceMax;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.minGasPrice;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.mixCost;
        int iHashCode18 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.normalCost;
        int iHashCode19 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.maxCost;
        int iHashCode20 = str19 == null ? 0 : str19.hashCode();
        Boolean bool = this.supportEip1559;
        int iHashCode21 = bool == null ? 0 : bool.hashCode();
        String str20 = this.baseFee;
        int iHashCode22 = str20 == null ? 0 : str20.hashCode();
        String str21 = this.suggestBaseFee;
        int iHashCode23 = str21 == null ? 0 : str21.hashCode();
        String str22 = this.minPriorityFee;
        int iHashCode24 = str22 == null ? 0 : str22.hashCode();
        String str23 = this.normalPriorityFee;
        int iHashCode25 = str23 == null ? 0 : str23.hashCode();
        String str24 = this.maxPriorityFee;
        int iHashCode26 = str24 == null ? 0 : str24.hashCode();
        List<EstimateTime> list = this.estimateTimeList;
        int iHashCode27 = list == null ? 0 : list.hashCode();
        String str25 = this.estimatedFee;
        int iHashCode28 = str25 == null ? 0 : str25.hashCode();
        String str26 = this.extFee;
        int iHashCode29 = str26 == null ? 0 : str26.hashCode();
        String str27 = this.reserveFeeRatio;
        int iHashCode30 = str27 == null ? 0 : str27.hashCode();
        String str28 = this.rent;
        int iHashCode31 = str28 == null ? 0 : str28.hashCode();
        String str29 = this.solRent;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (str29 == null ? 0 : str29.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFixed() {
        return this.isFixed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseFee(String str) {
        this.baseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinSymbol(String str) {
        this.coinSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayFeeValue(String str) {
        this.displayFeeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayRecommend(String str) {
        this.displayRecommend = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimateTimeList(List<EstimateTime> list) {
        this.estimateTimeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEstimatedFee(String str) {
        this.estimatedFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtFee(String str) {
        this.extFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastFee(String str) {
        this.fastFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFastMinFee(String str) {
        this.fastMinFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeSymbol(String str) {
        this.feeSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValue(String str) {
        this.feeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFixed(boolean z) {
        this.isFixed = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceMax(String str) {
        this.gasPriceMax = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceMin(String str) {
        this.gasPriceMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPriceNormal(String str) {
        this.gasPriceNormal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxCost(String str) {
        this.maxCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxPriorityFee(String str) {
        this.maxPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemPoolGasPriceMin(String str) {
        this.memPoolGasPriceMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinGasPrice(String str) {
        this.minGasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinPriorityFee(String str) {
        this.minPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMixCost(String str) {
        this.mixCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalCost(String str) {
        this.normalCost = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNormalPriorityFee(String str) {
        this.normalPriorityFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendFee(String str) {
        this.recommendFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommendMinFee(String str) {
        this.recommendMinFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRent(String str) {
        this.rent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReserveFeeRatio(String str) {
        this.reserveFeeRatio = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowFee(String str) {
        this.slowFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlowMinFee(String str) {
        this.slowMinFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolRent(String str) {
        this.solRent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuggestBaseFee(String str) {
        this.suggestBaseFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportEip1559(Boolean bool) {
        this.supportEip1559 = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionFeeInfo(slowMinFee=" + this.slowMinFee + ", slowFee=" + this.slowFee + ", fastMinFee=" + this.fastMinFee + ", fastFee=" + this.fastFee + ", recommendMinFee=" + this.recommendMinFee + ", recommendFee=" + this.recommendFee + ", isFixed=" + this.isFixed + ", displayRecommend=" + this.displayRecommend + ", displayFeeValue=" + this.displayFeeValue + ", feeSymbol=" + this.feeSymbol + ", coinSymbol=" + this.coinSymbol + ", feeValue=" + this.feeValue + ", memPoolGasPriceMin=" + this.memPoolGasPriceMin + ", gasPriceMin=" + this.gasPriceMin + ", gasPriceNormal=" + this.gasPriceNormal + ", gasPriceMax=" + this.gasPriceMax + ", minGasPrice=" + this.minGasPrice + ", mixCost=" + this.mixCost + ", normalCost=" + this.normalCost + ", maxCost=" + this.maxCost + ", supportEip1559=" + this.supportEip1559 + ", baseFee=" + this.baseFee + ", suggestBaseFee=" + this.suggestBaseFee + ", minPriorityFee=" + this.minPriorityFee + ", normalPriorityFee=" + this.normalPriorityFee + ", maxPriorityFee=" + this.maxPriorityFee + ", estimateTimeList=" + this.estimateTimeList + ", estimatedFee=" + this.estimatedFee + ", extFee=" + this.extFee + ", reserveFeeRatio=" + this.reserveFeeRatio + ", rent=" + this.rent + ", solRent=" + this.solRent + ")";
    }

    public TransactionFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, String str24, List<EstimateTime> list, String str25, String str26, String str27, String str28, String str29) {
        this.slowMinFee = str;
        this.slowFee = str2;
        this.fastMinFee = str3;
        this.fastFee = str4;
        this.recommendMinFee = str5;
        this.recommendFee = str6;
        this.isFixed = z;
        this.displayRecommend = str7;
        this.displayFeeValue = str8;
        this.feeSymbol = str9;
        this.coinSymbol = str10;
        this.feeValue = str11;
        this.memPoolGasPriceMin = str12;
        this.gasPriceMin = str13;
        this.gasPriceNormal = str14;
        this.gasPriceMax = str15;
        this.minGasPrice = str16;
        this.mixCost = str17;
        this.normalCost = str18;
        this.maxCost = str19;
        this.supportEip1559 = bool;
        this.baseFee = str20;
        this.suggestBaseFee = str21;
        this.minPriorityFee = str22;
        this.normalPriorityFee = str23;
        this.maxPriorityFee = str24;
        this.estimateTimeList = list;
        this.estimatedFee = str25;
        this.extFee = str26;
        this.reserveFeeRatio = str27;
        this.rent = str28;
        this.solRent = str29;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0177: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r66v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r66v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r66v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r66v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r66v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r66v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r39v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r66v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r66v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r66v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r66v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r66v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r66v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r66v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006a: ARITH (r66v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r66v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r66v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r66v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r66v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009e: ARITH (r66v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a9: ARITH (r66v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r66v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b8: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r54v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r66v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ca: ARITH (r66v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d5: ARITH (r66v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e0: ARITH (r66v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r66v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00f6: ARITH (r66v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r60v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0101: ARITH (r66v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010c: ARITH (r66v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0117: ARITH (r66v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0122: ARITH (r66v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012d: ARITH (r66v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.tx.transaction.EstimateTime>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.defi.biz.core.tx.transaction.TransactionFeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionFeeInfo(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Boolean bool, String str20, String str21, String str22, String str23, String str24, List list, String str25, String str26, String str27, String str28, String str29, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) != 0 ? null : str12, (i & 8192) != 0 ? null : str13, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : str17, (i & 262144) != 0 ? null : str18, (i & 524288) != 0 ? null : str19, (i & 1048576) != 0 ? Boolean.FALSE : bool, (i & 2097152) != 0 ? null : str20, (i & 4194304) != 0 ? null : str21, (i & 8388608) != 0 ? null : str22, (i & 16777216) != 0 ? null : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str24, (i & 67108864) != 0 ? null : list, (i & 134217728) != 0 ? null : str25, (i & 268435456) != 0 ? null : str26, (i & 536870912) != 0 ? null : str27, (i & 1073741824) != 0 ? null : str28, (i & Integer.MIN_VALUE) != 0 ? null : str29);
    }
}
