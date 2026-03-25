package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lkN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30924lkN {
    public static final DexPresetResultVO copydefault(@NotNull DexPresetResultVO dexPresetResultVO) {
        Intrinsics.checkNotNullParameter(dexPresetResultVO, "");
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList();
        java.util.ArrayList arrayList = new java.util.ArrayList(dexPresetResultVO.getDexPresetResultVOList().size());
        java.util.Iterator<T> it = dexPresetResultVOList.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((PresetUserConfigBean) it.next()));
        }
        return dexPresetResultVO.copy((2046 & 1) != 0 ? dexPresetResultVO.dexPresetResultVOList : arrayList, (2046 & 2) != 0 ? dexPresetResultVO.nativeTokenInfo : null, (2046 & 4) != 0 ? dexPresetResultVO.gasPriceUnitDecimal : null, (2046 & 8) != 0 ? dexPresetResultVO.priceImpactValue : null, (2046 & 16) != 0 ? dexPresetResultVO.memeChainType : 0, (2046 & 32) != 0 ? dexPresetResultVO.supportAutoMode : false, (2046 & 64) != 0 ? dexPresetResultVO.supportLimitOrder : false, (2046 & 128) != 0 ? dexPresetResultVO.supportEip1559 : false, (2046 & 256) != 0 ? dexPresetResultVO.mevPriceThreshold : null, (2046 & 512) != 0 ? dexPresetResultVO.dynamicSupportMax : false, (2046 & 1024) != 0 ? dexPresetResultVO.supportCustomGasFee : false);
    }

    public static final PresetUserConfigBean copydefault(@NotNull PresetUserConfigBean presetUserConfigBean) {
        Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
        return PresetUserConfigBean.copy$default(presetUserConfigBean, EZpvd(presetUserConfigBean.getBuyPreset()), null, 0, null, null, EZpvd(presetUserConfigBean.getSellPreset()), false, 94, null);
    }

    public static final BuySellPreset EZpvd(@NotNull BuySellPreset buySellPreset) {
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        return buySellPreset.copy(copydefault(buySellPreset.getFeeConfig()), RouteConfig.copy$default(buySellPreset.getRouteConfig(), null, 1, null), AEQbTJ(buySellPreset.getSlippageConfig()));
    }

    public static final FeeConfig copydefault(@NotNull FeeConfig feeConfig) {
        Intrinsics.checkNotNullParameter(feeConfig, "");
        java.util.List<FeeOption> feeOptions = feeConfig.getFeeOptions();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(feeOptions, 10));
        java.util.Iterator<T> it = feeOptions.iterator();
        while (it.hasNext()) {
            arrayList.add(FeeOption.copy$default((FeeOption) it.next(), 0, null, false, 7, null));
        }
        java.util.List<FeeOption> limitOrderFeeOptions = feeConfig.getLimitOrderFeeOptions();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(limitOrderFeeOptions, 10));
        java.util.Iterator<T> it2 = limitOrderFeeOptions.iterator();
        while (it2.hasNext()) {
            arrayList2.add(FeeOption.copy$default((FeeOption) it2.next(), 0, null, false, 7, null));
        }
        return FeeConfig.copy$default(feeConfig, arrayList, arrayList2, null, null, null, null, 60, null);
    }

    public static final SlippageConfigPreset AEQbTJ(@NotNull SlippageConfigPreset slippageConfigPreset) {
        Intrinsics.checkNotNullParameter(slippageConfigPreset, "");
        java.util.List<SlippageRange> slippageRange = slippageConfigPreset.getSlippageRange();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(slippageRange, 10));
        java.util.Iterator<T> it = slippageRange.iterator();
        while (it.hasNext()) {
            arrayList.add(SlippageRange.copy$default((SlippageRange) it.next(), false, 0, null, 7, null));
        }
        return slippageConfigPreset.copy((1535 & 1) != 0 ? slippageConfigPreset.dynamicMax : null, (1535 & 2) != 0 ? slippageConfigPreset.dynamicMaxSlippageValue : null, (1535 & 4) != 0 ? slippageConfigPreset.dynamicMin : null, (1535 & 8) != 0 ? slippageConfigPreset.dynamicRecommendMaxValue : null, (1535 & 16) != 0 ? slippageConfigPreset.dynamicRecommendMinValue : null, (1535 & 32) != 0 ? slippageConfigPreset.fixedMax : null, (1535 & 64) != 0 ? slippageConfigPreset.fixedMin : null, (1535 & 128) != 0 ? slippageConfigPreset.fixedRecommendMax : null, (1535 & 256) != 0 ? slippageConfigPreset.fixedRecommendMin : null, (1535 & 512) != 0 ? slippageConfigPreset.slippageRange : arrayList, (1535 & 1024) != 0 ? slippageConfigPreset.slippageType : 0);
    }

    public static final java.util.List<MevInfoBean> EZpvd(java.util.List<FeeOption> list) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        if (list == null || list.isEmpty()) {
            return yDY.AhwBna();
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FeeOption) next).getFeeLevel() == PriorityFeeType.PriorityMarket.getValue()) {
                break;
            }
        }
        FeeOption feeOption = (FeeOption) next;
        java.lang.String feeValue = feeOption != null ? feeOption.getFeeValue() : null;
        java.lang.String str = feeValue == null ? "" : feeValue;
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((FeeOption) next2).getFeeLevel() == PriorityFeeType.PriorityFast.getValue()) {
                break;
            }
        }
        FeeOption feeOption2 = (FeeOption) next2;
        java.lang.String feeValue2 = feeOption2 != null ? feeOption2.getFeeValue() : null;
        java.lang.String str2 = feeValue2 == null ? "" : feeValue2;
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (((FeeOption) next3).getFeeLevel() == PriorityFeeType.PriorityTurbo.getValue()) {
                break;
            }
        }
        FeeOption feeOption3 = (FeeOption) next3;
        java.lang.String feeValue3 = feeOption3 != null ? feeOption3.getFeeValue() : null;
        java.lang.String str3 = feeValue3 == null ? "" : feeValue3;
        return C56402yEa.EZpvd(new MevInfoBean("", "", str2, "", "", str2, true, str, "", "", str, "", str3, "", "", str3, str, str2, str3, ""));
    }

    public static final NonMevPriorityFeeInfo OLrzqt(java.util.List<FeeOption> list) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        if (list == null || list.isEmpty()) {
            return new NonMevPriorityFeeInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 262143, (DefaultConstructorMarker) null);
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((FeeOption) next).getFeeLevel() == PriorityFeeType.PriorityMarket.getValue()) {
                break;
            }
        }
        FeeOption feeOption = (FeeOption) next;
        java.lang.String feeValue = feeOption != null ? feeOption.getFeeValue() : null;
        java.lang.String str = feeValue == null ? "" : feeValue;
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((FeeOption) next2).getFeeLevel() == PriorityFeeType.PriorityFast.getValue()) {
                break;
            }
        }
        FeeOption feeOption2 = (FeeOption) next2;
        java.lang.String feeValue2 = feeOption2 != null ? feeOption2.getFeeValue() : null;
        java.lang.String str2 = feeValue2 == null ? "" : feeValue2;
        java.util.Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            if (((FeeOption) next3).getFeeLevel() == PriorityFeeType.PriorityTurbo.getValue()) {
                break;
            }
        }
        FeeOption feeOption3 = (FeeOption) next3;
        java.lang.String feeValue3 = feeOption3 != null ? feeOption3.getFeeValue() : null;
        java.lang.String str3 = feeValue3 == null ? "" : feeValue3;
        return new NonMevPriorityFeeInfo("", "", str2, "", "", str2, str, "", "", str, str3, "", "", str3, str, str2, str3, "");
    }
}
