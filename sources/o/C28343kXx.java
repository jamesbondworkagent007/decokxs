package o;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.FeeInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.PriorityFee;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.dexlogic.bean.Permit2Data;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TraceData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28343kXx {
    public static final V6QuoteResponseData KWHzl(@NotNull V6QuoteAndCalldataResponseData v6QuoteAndCalldataResponseData) {
        Intrinsics.checkNotNullParameter(v6QuoteAndCalldataResponseData, "");
        V6QuoteResponseData v6QuoteResponseData = new V6QuoteResponseData(v6QuoteAndCalldataResponseData.getCommonDexInfo(), v6QuoteAndCalldataResponseData.getDefiPlatformInfoList(), v6QuoteAndCalldataResponseData.getNetworkFeeInfo(), null, 8, null);
        java.lang.String selectedDeFiPlatformId = v6QuoteAndCalldataResponseData.getSelectedDeFiPlatformId();
        if (selectedDeFiPlatformId != null) {
            if (selectedDeFiPlatformId.length() <= 0) {
                selectedDeFiPlatformId = null;
            }
            if (selectedDeFiPlatformId != null) {
                v6QuoteResponseData.setLocalSelectedDeFiPlatformId(selectedDeFiPlatformId);
            }
        }
        return v6QuoteResponseData;
    }

    public static final MemeModeQuoteBean AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, @NotNull java.lang.String str) {
        java.util.List listAhwBna;
        MemeModeCommonDexInfo memeModeCommonDexInfoEZpvd;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        if (defiPlatformInfoList == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(defiPlatformInfoList, 10));
            java.util.Iterator<T> it = defiPlatformInfoList.iterator();
            while (it.hasNext()) {
                DeFiPlatformForSwap deFiPlatformForSwapOLrzqt = C28342kXw.OLrzqt((DefiPlatformInfo) it.next());
                if (deFiPlatformForSwapOLrzqt == null) {
                    deFiPlatformForSwapOLrzqt = new DeFiPlatformForSwap((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (OfflineQuote) null, (DexAutoSlippageInfoParam) null, (Permit2Data) null, (ServiceFeeInfo) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, -1, 15, (DefaultConstructorMarker) null);
                }
                listAhwBna.add(deFiPlatformForSwapOLrzqt);
            }
        }
        java.util.List list = listAhwBna;
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        return new MemeModeQuoteBean(list, (commonDexInfo == null || (memeModeCommonDexInfoEZpvd = EZpvd(commonDexInfo, v6BaseQuoteResponse, z, str)) == null) ? new MemeModeCommonDexInfo((java.lang.String) null, (DexMultiTokenInfoBean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (DexMultiTokenInfoBean) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (NonMevPriorityFeeInfo) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4194303, (DefaultConstructorMarker) null) : memeModeCommonDexInfoEZpvd, (TraceData) null, (java.lang.String) null, 8, (DefaultConstructorMarker) null);
    }

    public static final MemeModeCommonDexInfo EZpvd(@NotNull CommonDexInfo commonDexInfo, @NotNull V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, @NotNull java.lang.String str) {
        java.util.List listAhwBna;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        java.lang.String strIsEnableMev;
        PriorityFee normal;
        java.util.List<PriorityFee> mev;
        MevInfoBean mevInfoBean;
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        DexMultiTokenInfoBean fromToken = commonDexInfo.getFromToken();
        if (fromToken == null) {
            fromToken = new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
        }
        DexMultiTokenInfoBean toToken = commonDexInfo.getToToken();
        DexMultiTokenInfoBean dexMultiTokenInfoBean = toToken == null ? new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : toToken;
        DexMultiTokenInfoBean fromToken2 = commonDexInfo.getFromToken();
        java.lang.String tokenSymbol = (fromToken2 == null || !fromToken2.isMainChainCoin()) ? "" : commonDexInfo.getFromToken().getTokenSymbol();
        DexMultiTokenInfoBean toToken2 = commonDexInfo.getToToken();
        java.lang.String tokenSymbol2 = (toToken2 == null || !toToken2.isMainChainCoin()) ? "" : commonDexInfo.getToToken().getTokenSymbol();
        NetworkFeeInfo networkFeeInfo = v6BaseQuoteResponse.getNetworkFeeInfo();
        if (networkFeeInfo == null || (mev = networkFeeInfo.getMev()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(mev, 10));
            for (PriorityFee priorityFee : mev) {
                if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeChainType.MemeChainTypeEVM.getValue())) {
                    if (z) {
                        FeeInfo fastPriority = priorityFee.getFastPriority();
                        java.lang.String feeUsd = fastPriority != null ? fastPriority.getFeeUsd() : null;
                        java.lang.String str2 = feeUsd == null ? "" : feeUsd;
                        FeeInfo fastPriority2 = priorityFee.getFastPriority();
                        java.lang.String fee = fastPriority2 != null ? fastPriority2.getFee() : null;
                        java.lang.String str3 = fee == null ? "" : fee;
                        FeeInfo marketPriority = priorityFee.getMarketPriority();
                        java.lang.String feeUsd2 = marketPriority != null ? marketPriority.getFeeUsd() : null;
                        java.lang.String str4 = feeUsd2 == null ? "" : feeUsd2;
                        FeeInfo marketPriority2 = priorityFee.getMarketPriority();
                        java.lang.String fee2 = marketPriority2 != null ? marketPriority2.getFee() : null;
                        java.lang.String str5 = fee2 == null ? "" : fee2;
                        FeeInfo turboPriority = priorityFee.getTurboPriority();
                        java.lang.String feeUsd3 = turboPriority != null ? turboPriority.getFeeUsd() : null;
                        java.lang.String str6 = feeUsd3 == null ? "" : feeUsd3;
                        FeeInfo turboPriority2 = priorityFee.getTurboPriority();
                        java.lang.String fee3 = turboPriority2 != null ? turboPriority2.getFee() : null;
                        java.lang.String str7 = fee3 == null ? "" : fee3;
                        FeeInfo base = priorityFee.getBase();
                        java.lang.String fee4 = base != null ? base.getFee() : null;
                        java.lang.String str8 = fee4 == null ? "" : fee4;
                        java.lang.String name = priorityFee.getName();
                        mevInfoBean = new MevInfoBean("", "", "", "", str2, str3, false, "", "", str4, str5, name == null ? "" : name, "", "", str6, str7, "", "", "", str8);
                    } else {
                        FeeInfo fastPriority3 = priorityFee.getFastPriority();
                        java.lang.String feeUsd4 = fastPriority3 != null ? fastPriority3.getFeeUsd() : null;
                        java.lang.String str9 = feeUsd4 == null ? "" : feeUsd4;
                        FeeInfo marketPriority3 = priorityFee.getMarketPriority();
                        java.lang.String feeUsd5 = marketPriority3 != null ? marketPriority3.getFeeUsd() : null;
                        java.lang.String str10 = feeUsd5 == null ? "" : feeUsd5;
                        FeeInfo turboPriority3 = priorityFee.getTurboPriority();
                        java.lang.String feeUsd6 = turboPriority3 != null ? turboPriority3.getFeeUsd() : null;
                        java.lang.String str11 = feeUsd6 == null ? "" : feeUsd6;
                        FeeInfo marketPriority4 = priorityFee.getMarketPriority();
                        java.lang.String fee5 = marketPriority4 != null ? marketPriority4.getFee() : null;
                        java.lang.String str12 = fee5 == null ? "" : fee5;
                        FeeInfo fastPriority4 = priorityFee.getFastPriority();
                        java.lang.String fee6 = fastPriority4 != null ? fastPriority4.getFee() : null;
                        java.lang.String str13 = fee6 == null ? "" : fee6;
                        FeeInfo turboPriority4 = priorityFee.getTurboPriority();
                        java.lang.String fee7 = turboPriority4 != null ? turboPriority4.getFee() : null;
                        java.lang.String str14 = fee7 == null ? "" : fee7;
                        java.lang.Boolean boolIsDefault = priorityFee.isDefault();
                        boolean zBooleanValue = boolIsDefault != null ? boolIsDefault.booleanValue() : false;
                        java.lang.String name2 = priorityFee.getName();
                        mevInfoBean = new MevInfoBean("", "", "", "", str9, "", zBooleanValue, "", "", str10, "", name2 == null ? "" : name2, "", "", str11, "", str12, str13, str14, "");
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeChainType.MemeChainTypeSol.getValue())) {
                    FeeInfo fastPriority5 = priorityFee.getFastPriority();
                    java.lang.String fee8 = fastPriority5 != null ? fastPriority5.getFee() : null;
                    java.lang.String str15 = fee8 == null ? "" : fee8;
                    FeeInfo fastPriority6 = priorityFee.getFastPriority();
                    java.lang.String feeUsd7 = fastPriority6 != null ? fastPriority6.getFeeUsd() : null;
                    java.lang.String str16 = feeUsd7 == null ? "" : feeUsd7;
                    FeeInfo marketPriority5 = priorityFee.getMarketPriority();
                    java.lang.String fee9 = marketPriority5 != null ? marketPriority5.getFee() : null;
                    java.lang.String str17 = fee9 == null ? "" : fee9;
                    FeeInfo marketPriority6 = priorityFee.getMarketPriority();
                    java.lang.String feeUsd8 = marketPriority6 != null ? marketPriority6.getFeeUsd() : null;
                    java.lang.String str18 = feeUsd8 == null ? "" : feeUsd8;
                    FeeInfo turboPriority5 = priorityFee.getTurboPriority();
                    java.lang.String fee10 = turboPriority5 != null ? turboPriority5.getFee() : null;
                    java.lang.String str19 = fee10 == null ? "" : fee10;
                    FeeInfo turboPriority6 = priorityFee.getTurboPriority();
                    java.lang.String feeUsd9 = turboPriority6 != null ? turboPriority6.getFeeUsd() : null;
                    java.lang.String str20 = feeUsd9 == null ? "" : feeUsd9;
                    FeeInfo base2 = priorityFee.getBase();
                    java.lang.String fee11 = base2 != null ? base2.getFee() : null;
                    java.lang.String str21 = fee11 == null ? "" : fee11;
                    java.lang.Boolean boolIsDefault2 = priorityFee.isDefault();
                    boolean zBooleanValue2 = boolIsDefault2 != null ? boolIsDefault2.booleanValue() : false;
                    java.lang.String name3 = priorityFee.getName();
                    mevInfoBean = new MevInfoBean("", "", str15, str16, "", "", zBooleanValue2, str17, str18, "", "", name3 == null ? "" : name3, str19, str20, "", "", "", "", "", str21);
                } else {
                    FeeInfo base3 = priorityFee.getBase();
                    java.lang.String fee12 = base3 != null ? base3.getFee() : null;
                    java.lang.String str22 = fee12 == null ? "" : fee12;
                    FeeInfo base4 = priorityFee.getBase();
                    java.lang.String feeUsd10 = base4 != null ? base4.getFeeUsd() : null;
                    java.lang.String str23 = feeUsd10 == null ? "" : feeUsd10;
                    java.lang.Boolean boolIsDefault3 = priorityFee.isDefault();
                    boolean zBooleanValue3 = boolIsDefault3 != null ? boolIsDefault3.booleanValue() : false;
                    java.lang.String name4 = priorityFee.getName();
                    mevInfoBean = new MevInfoBean(str22, str23, "", "", "", "", zBooleanValue3, "", "", "", "", name4 == null ? "" : name4, "", "", "", "", "", "", "", "");
                }
                arrayList.add(mevInfoBean);
            }
            listAhwBna = arrayList;
        }
        NetworkFeeInfo networkFeeInfo2 = v6BaseQuoteResponse.getNetworkFeeInfo();
        if (networkFeeInfo2 != null && (normal = networkFeeInfo2.getNormal()) != null) {
            FeeInfo base5 = normal.getBase();
            java.lang.String fee13 = base5 != null ? base5.getFee() : null;
            java.lang.String str24 = fee13 == null ? "" : fee13;
            FeeInfo base6 = normal.getBase();
            java.lang.String feeUsd11 = base6 != null ? base6.getFeeUsd() : null;
            java.lang.String str25 = feeUsd11 == null ? "" : feeUsd11;
            FeeInfo fastPriority7 = normal.getFastPriority();
            java.lang.String fee14 = fastPriority7 != null ? fastPriority7.getFee() : null;
            java.lang.String str26 = fee14 == null ? "" : fee14;
            FeeInfo fastPriority8 = normal.getFastPriority();
            java.lang.String feeUsd12 = fastPriority8 != null ? fastPriority8.getFeeUsd() : null;
            java.lang.String str27 = feeUsd12 == null ? "" : feeUsd12;
            FeeInfo fastPriority9 = normal.getFastPriority();
            java.lang.String feeUsd13 = fastPriority9 != null ? fastPriority9.getFeeUsd() : null;
            java.lang.String str28 = feeUsd13 == null ? "" : feeUsd13;
            FeeInfo fastPriority10 = normal.getFastPriority();
            java.lang.String fee15 = fastPriority10 != null ? fastPriority10.getFee() : null;
            java.lang.String str29 = fee15 == null ? "" : fee15;
            FeeInfo marketPriority7 = normal.getMarketPriority();
            java.lang.String fee16 = marketPriority7 != null ? marketPriority7.getFee() : null;
            java.lang.String str30 = fee16 == null ? "" : fee16;
            FeeInfo marketPriority8 = normal.getMarketPriority();
            java.lang.String feeUsd14 = marketPriority8 != null ? marketPriority8.getFeeUsd() : null;
            java.lang.String str31 = feeUsd14 == null ? "" : feeUsd14;
            FeeInfo marketPriority9 = normal.getMarketPriority();
            java.lang.String feeUsd15 = marketPriority9 != null ? marketPriority9.getFeeUsd() : null;
            java.lang.String str32 = feeUsd15 == null ? "" : feeUsd15;
            FeeInfo marketPriority10 = normal.getMarketPriority();
            java.lang.String fee17 = marketPriority10 != null ? marketPriority10.getFee() : null;
            java.lang.String str33 = fee17 == null ? "" : fee17;
            FeeInfo turboPriority7 = normal.getTurboPriority();
            java.lang.String fee18 = turboPriority7 != null ? turboPriority7.getFee() : null;
            java.lang.String str34 = fee18 == null ? "" : fee18;
            FeeInfo turboPriority8 = normal.getTurboPriority();
            java.lang.String feeUsd16 = turboPriority8 != null ? turboPriority8.getFeeUsd() : null;
            java.lang.String str35 = feeUsd16 == null ? "" : feeUsd16;
            FeeInfo turboPriority9 = normal.getTurboPriority();
            java.lang.String feeUsd17 = turboPriority9 != null ? turboPriority9.getFeeUsd() : null;
            java.lang.String str36 = feeUsd17 == null ? "" : feeUsd17;
            FeeInfo turboPriority10 = normal.getTurboPriority();
            java.lang.String fee19 = turboPriority10 != null ? turboPriority10.getFee() : null;
            java.lang.String str37 = fee19 == null ? "" : fee19;
            FeeInfo marketPriority11 = normal.getMarketPriority();
            java.lang.String fee20 = marketPriority11 != null ? marketPriority11.getFee() : null;
            java.lang.String str38 = fee20 == null ? "" : fee20;
            FeeInfo fastPriority11 = normal.getFastPriority();
            java.lang.String fee21 = fastPriority11 != null ? fastPriority11.getFee() : null;
            java.lang.String str39 = fee21 == null ? "" : fee21;
            FeeInfo turboPriority11 = normal.getTurboPriority();
            java.lang.String fee22 = turboPriority11 != null ? turboPriority11.getFee() : null;
            java.lang.String str40 = fee22 == null ? "" : fee22;
            FeeInfo base7 = normal.getBase();
            java.lang.String fee23 = base7 != null ? base7.getFee() : null;
            nonMevPriorityFeeInfo = new NonMevPriorityFeeInfo(str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, fee23 == null ? "" : fee23);
        } else {
            nonMevPriorityFeeInfo = new NonMevPriorityFeeInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 262143, (DefaultConstructorMarker) null);
        }
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.Object mevUnstableShowLevel = selectedDeFiPlatform != null ? selectedDeFiPlatform.getMevUnstableShowLevel() : null;
        if (mevUnstableShowLevel == null) {
            mevUnstableShowLevel = null;
        }
        if (mevUnstableShowLevel == null) {
            mevUnstableShowLevel = MevUnstableShowLevelType.NORMAL.getType();
        }
        DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String str41 = (selectedDeFiPlatform2 == null || (strIsEnableMev = selectedDeFiPlatform2.isEnableMev()) == null) ? "" : strIsEnableMev;
        DefiPlatformInfo selectedDeFiPlatform3 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String needApprove = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getNeedApprove() : null;
        DefiPlatformInfo selectedDeFiPlatform4 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String slippage = selectedDeFiPlatform4 != null ? selectedDeFiPlatform4.getSlippage() : null;
        java.lang.String fromTokenAmount = commonDexInfo.getFromTokenAmount();
        java.lang.String str42 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String fromTokenValue = commonDexInfo.getFromTokenValue();
        java.lang.String str43 = fromTokenValue == null ? "" : fromTokenValue;
        if (slippage == null) {
            slippage = "";
        }
        java.lang.String nativeTokenPrice = commonDexInfo.getNativeTokenPrice();
        java.lang.String str44 = nativeTokenPrice == null ? "" : nativeTokenPrice;
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str41, (java.lang.Object) "1");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(mevUnstableShowLevel);
        java.lang.String nativeTokenUnitPriceUsd = commonDexInfo.getNativeTokenUnitPriceUsd();
        return new MemeModeCommonDexInfo(tokenSymbol, fromToken, str42, str43, slippage, z, tokenSymbol2, str, dexMultiTokenInfoBean, "", (java.lang.String) null, listAhwBna, nonMevPriorityFeeInfo, str44, zEZpvd, str41, strGEmmrt, nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd, commonDexInfo.getCode(), needApprove == null ? "" : needApprove, commonDexInfo.getTeeSignMarketRelTs(), commonDexInfo.getTeeSignTpslRelTs(), 1024, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C28337kXr getLabelData$default(V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = " ";
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return copydefault(v6BaseQuoteResponse, z, str, z2);
    }

    public static final C28337kXr copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, @NotNull java.lang.String str, boolean z2) {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String strOLrzqt = C23319hvw.OLrzqt((commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getTokenSymbol());
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String strOLrzqt2 = C23319hvw.OLrzqt((commonDexInfo2 == null || (toToken = commonDexInfo2.getToToken()) == null) ? null : toToken.getTokenSymbol());
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount = commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null;
        java.lang.String str2 = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String strReceiveAmount = v6BaseQuoteResponse.receiveAmount();
        CommonDexInfo commonDexInfo4 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenValue = commonDexInfo4 != null ? commonDexInfo4.getFromTokenValue() : null;
        java.lang.String str3 = fromTokenValue == null ? "" : fromTokenValue;
        CommonDexInfo commonDexInfo5 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount2 = commonDexInfo5 != null ? commonDexInfo5.getFromTokenAmount() : null;
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(str3, fromTokenAmount2 == null ? "" : fromTokenAmount2, null, null, null, 14, null);
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String toTokenValue = selectedDeFiPlatform != null ? selectedDeFiPlatform.getToTokenValue() : null;
        return AEQbTJ(new C28341kXv(strOLrzqt, strOLrzqt2, str2, strReceiveAmount, strDivCheckS$default, C23313hvq.divCheckS$default(toTokenValue == null ? "" : toTokenValue, v6BaseQuoteResponse.receiveAmount(), null, null, null, 14, null)), z, str, z2);
    }

    public static /* synthetic */ C28337kXr getLabelData$default(MemeModeQuoteBean memeModeQuoteBean, boolean z, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = " ";
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return OLrzqt(memeModeQuoteBean, z, str, z2);
    }

    public static final C28337kXr OLrzqt(@NotNull MemeModeQuoteBean memeModeQuoteBean, boolean z, @NotNull java.lang.String str, boolean z2) {
        Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strOLrzqt = C23319hvw.OLrzqt(memeModeQuoteBean.getMemeModeCommonDexInfo().getFromToken().getTokenSymbol());
        java.lang.String strOLrzqt2 = C23319hvw.OLrzqt(memeModeQuoteBean.getMemeModeCommonDexInfo().getToToken().getTokenSymbol());
        java.lang.String fromTokenAmount = memeModeQuoteBean.getMemeModeCommonDexInfo().getFromTokenAmount();
        DeFiPlatformForSwap selectedDeFiPlatform = memeModeQuoteBean.getSelectedDeFiPlatform();
        java.lang.String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        java.lang.String str2 = receiveAmount == null ? "" : receiveAmount;
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(memeModeQuoteBean.getMemeModeCommonDexInfo().getFromTokenPrice(), memeModeQuoteBean.getMemeModeCommonDexInfo().getFromTokenAmount(), null, null, null, 14, null);
        DeFiPlatformForSwap selectedDeFiPlatform2 = memeModeQuoteBean.getSelectedDeFiPlatform();
        java.lang.String toTokenPrice = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenPrice() : null;
        java.lang.String str3 = toTokenPrice == null ? "" : toTokenPrice;
        DeFiPlatformForSwap selectedDeFiPlatform3 = memeModeQuoteBean.getSelectedDeFiPlatform();
        java.lang.String receiveAmount2 = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getReceiveAmount() : null;
        return AEQbTJ(new C28341kXv(strOLrzqt, strOLrzqt2, fromTokenAmount, str2, strDivCheckS$default, C23313hvq.divCheckS$default(str3, receiveAmount2 == null ? "" : receiveAmount2, null, null, null, 14, null)), z, str, z2);
    }

    public static final C28337kXr AEQbTJ(@NotNull C28341kXv c28341kXv, boolean z, @NotNull java.lang.String str, boolean z2) {
        java.lang.String str2;
        kotlin.Pair pairOLrzqt;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        Intrinsics.checkNotNullParameter(c28341kXv, "");
        Intrinsics.checkNotNullParameter(str, "");
        boolean zValueOf = C23313hvq.valueOf(c28341kXv.KWHzl(), 0);
        if (z2) {
            if (z) {
                java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(c28341kXv.OLrzqt(), c28341kXv.KWHzl(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                java.lang.String strAEQbTJ = C23322hvz.AEQbTJ(strDivCheckS$default);
                java.lang.String strOLrzqt = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.EZpvd(), strDivCheckS$default, null, null, null, 14, null));
                if (zValueOf) {
                    str5 = c28341kXv.AEQbTJ() + " --" + str + "≈" + str + c28341kXv.copydefault() + " 1";
                } else {
                    str5 = c28341kXv.AEQbTJ() + str + strAEQbTJ + str + "≈" + str + c28341kXv.copydefault() + " 1";
                }
                pairOLrzqt = C56390yDp.OLrzqt(str5, strOLrzqt);
            } else {
                java.lang.String strDivCheckS$default2 = C23313hvq.divCheckS$default(c28341kXv.KWHzl(), c28341kXv.OLrzqt(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                java.lang.String strAEQbTJ2 = C23322hvz.AEQbTJ(strDivCheckS$default2);
                java.lang.String strOLrzqt2 = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.AhwBna(), strDivCheckS$default2, null, null, null, 14, null));
                if (zValueOf) {
                    str4 = c28341kXv.copydefault() + " --" + str + "≈" + str + c28341kXv.AEQbTJ() + " 1";
                } else {
                    str4 = c28341kXv.copydefault() + str + strAEQbTJ2 + str + "≈" + str + c28341kXv.AEQbTJ() + " 1";
                }
                pairOLrzqt = C56390yDp.OLrzqt(str4, strOLrzqt2);
            }
        } else if (z) {
            java.lang.String strDivCheckS$default3 = C23313hvq.divCheckS$default(c28341kXv.OLrzqt(), c28341kXv.KWHzl(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            java.lang.String strAEQbTJ3 = C23322hvz.AEQbTJ(strDivCheckS$default3);
            java.lang.String strOLrzqt3 = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.EZpvd(), strDivCheckS$default3, null, null, null, 14, null));
            if (zValueOf) {
                str3 = "1 " + c28341kXv.copydefault() + str + "≈" + str + "--" + c28341kXv.AEQbTJ();
            } else {
                str3 = "1 " + c28341kXv.copydefault() + str + "≈" + str + strAEQbTJ3 + " " + c28341kXv.AEQbTJ();
            }
            pairOLrzqt = C56390yDp.OLrzqt(str3, strOLrzqt3);
        } else {
            java.lang.String strDivCheckS$default4 = C23313hvq.divCheckS$default(c28341kXv.KWHzl(), c28341kXv.OLrzqt(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            java.lang.String strAEQbTJ4 = C23322hvz.AEQbTJ(strDivCheckS$default4);
            java.lang.String strOLrzqt4 = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.AhwBna(), strDivCheckS$default4, null, null, null, 14, null));
            if (zValueOf) {
                str2 = "1 " + c28341kXv.AEQbTJ() + str + "≈" + str + "--" + c28341kXv.copydefault();
            } else {
                str2 = "1 " + c28341kXv.AEQbTJ() + str + "≈" + str + strAEQbTJ4 + " " + c28341kXv.copydefault();
            }
            pairOLrzqt = C56390yDp.OLrzqt(str2, strOLrzqt4);
        }
        return new C28337kXr((java.lang.String) pairOLrzqt.component1(), (java.lang.String) pairOLrzqt.component2(), z2);
    }

    public static /* synthetic */ java.lang.String getMarketPriceString$default(V6BaseQuoteResponse v6BaseQuoteResponse, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(v6BaseQuoteResponse, z);
    }

    public static final java.lang.String OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, boolean z) {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String strOLrzqt = C23319hvw.OLrzqt((commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getTokenSymbol());
        CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String strOLrzqt2 = C23319hvw.OLrzqt((commonDexInfo2 == null || (toToken = commonDexInfo2.getToToken()) == null) ? null : toToken.getTokenSymbol());
        CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount = commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null;
        java.lang.String str = fromTokenAmount == null ? "" : fromTokenAmount;
        java.lang.String strReceiveAmount = v6BaseQuoteResponse.receiveAmount();
        CommonDexInfo commonDexInfo4 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenValue = commonDexInfo4 != null ? commonDexInfo4.getFromTokenValue() : null;
        java.lang.String str2 = fromTokenValue == null ? "" : fromTokenValue;
        CommonDexInfo commonDexInfo5 = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String fromTokenAmount2 = commonDexInfo5 != null ? commonDexInfo5.getFromTokenAmount() : null;
        java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(str2, fromTokenAmount2 == null ? "" : fromTokenAmount2, null, null, null, 14, null);
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String toTokenValue = selectedDeFiPlatform != null ? selectedDeFiPlatform.getToTokenValue() : null;
        return OLrzqt(new C28341kXv(strOLrzqt, strOLrzqt2, str, strReceiveAmount, strDivCheckS$default, C23313hvq.divCheckS$default(toTokenValue == null ? "" : toTokenValue, v6BaseQuoteResponse.receiveAmount(), null, null, null, 14, null)), z);
    }

    public static /* synthetic */ java.lang.String getMarketPriceString$default(QuotePriceRes quotePriceRes, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return OLrzqt(quotePriceRes, z);
    }

    public static final java.lang.String OLrzqt(@NotNull QuotePriceRes quotePriceRes, boolean z) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        return OLrzqt(new C28341kXv(C23319hvw.OLrzqt(quotePriceRes.fromToken().getTokenSymbol()), C23319hvw.OLrzqt(quotePriceRes.toToken().getTokenSymbol()), quotePriceRes.getCommonDexInfo().getFromTokenAmount(), quotePriceRes.receiveAmount(), C23313hvq.divCheckS$default(quotePriceRes.getCommonDexInfo().getFromTokenPrice(), quotePriceRes.getCommonDexInfo().getFromTokenAmount(), null, null, null, 14, null), C23313hvq.divCheckS$default(quotePriceRes.toTokenPrice(), quotePriceRes.receiveAmount(), null, null, null, 14, null)), z);
    }

    public static /* synthetic */ java.lang.String buildRateLabelString$default(C28341kXv c28341kXv, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return OLrzqt(c28341kXv, z);
    }

    public static final java.lang.String OLrzqt(@NotNull C28341kXv c28341kXv, boolean z) {
        Intrinsics.checkNotNullParameter(c28341kXv, "");
        if (z) {
            java.lang.String strDivCheckS$default = C23313hvq.divCheckS$default(c28341kXv.KWHzl(), c28341kXv.OLrzqt(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            java.lang.String tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, strDivCheckS$default, true, null, false, c28341kXv.copydefault(), null, 22, null);
            java.lang.String strOLrzqt = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.AhwBna(), strDivCheckS$default, null, null, null, 14, null));
            if (strOLrzqt.length() > 0) {
                return "1 " + c28341kXv.AEQbTJ() + " ≈ " + tokenCode$default + " " + strOLrzqt;
            }
            return "1 " + c28341kXv.AEQbTJ() + " ≈ " + tokenCode$default;
        }
        java.lang.String strDivCheckS$default2 = C23313hvq.divCheckS$default(c28341kXv.OLrzqt(), c28341kXv.KWHzl(), java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        java.lang.String tokenCode$default2 = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, strDivCheckS$default2, true, null, false, c28341kXv.AEQbTJ(), null, 22, null);
        java.lang.String strOLrzqt2 = OLrzqt(C23313hvq.mulCheckS$default(c28341kXv.EZpvd(), strDivCheckS$default2, null, null, null, 14, null));
        if (strOLrzqt2.length() > 0) {
            return "1 " + c28341kXv.copydefault() + " ≈ " + tokenCode$default2 + " " + strOLrzqt2;
        }
        return "1 " + c28341kXv.copydefault() + " ≈ " + tokenCode$default2;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str) || !C23313hvq.OLrzqt(str, 0)) {
            return "";
        }
        return "(" + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, null, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_POSITION_TYPE, null) + ")";
    }
}
