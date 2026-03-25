package o;

import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPresetParam;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import com.okinc.business.trade.features.home.ui.meme.data.Preset;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class kXI {
    public static final Preset OLrzqt(@NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new Preset(presetUserConfigBean.getId(), presetUserConfigBean.getName(), presetUserConfigBean.getPresetType(), AEQbTJ(presetUserConfigBean.getBuyPreset(), str), AEQbTJ(presetUserConfigBean.getSellPreset(), str));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BuySellPresetParam AEQbTJ(@NotNull BuySellPreset buySellPreset, @NotNull java.lang.String str) {
        java.lang.Object next;
        java.lang.String str2;
        int iValueOf;
        java.lang.Integer num;
        Intrinsics.checkNotNullParameter(buySellPreset, "");
        Intrinsics.checkNotNullParameter(str, "");
        for (FeeOption feeOption : AEQbTJ(buySellPreset.getFeeConfig(), str)) {
            if (feeOption.getSelected()) {
                int slippageType = buySellPreset.getSlippageConfig().getSlippageType();
                java.util.Iterator<T> it = buySellPreset.getSlippageConfig().getSlippageRange().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((SlippageRange) next).getSelected()) {
                        break;
                    }
                }
                SlippageRange slippageRange = (SlippageRange) next;
                java.lang.String feeValue = feeOption.getFeeLevel() == PriorityFeeType.PriorityCustom.getValue() ? feeOption.getFeeValue() : "";
                SlippageMode slippageMode = SlippageMode.Fixed;
                if (slippageType != slippageMode.getType()) {
                    str2 = "";
                } else {
                    java.lang.String slippageValue = slippageRange != null ? slippageRange.getSlippageValue() : null;
                    if (slippageValue != null) {
                        str2 = slippageValue;
                    }
                }
                if (slippageType != slippageMode.getType()) {
                    iValueOf = 0;
                } else if (slippageRange != null) {
                    iValueOf = java.lang.Integer.valueOf(slippageRange.getSlippageLevel());
                } else {
                    num = null;
                    return new BuySellPresetParam(feeOption.getFeeLevel(), feeValue, java.lang.Integer.parseInt(buySellPreset.getRouteConfig().getRouterModeType()), num, str2, slippageType, slippageType == SlippageMode.Dynamic.getType() ? buySellPreset.getSlippageConfig().getDynamicMaxSlippageValue() : "");
                }
                num = iValueOf;
                return new BuySellPresetParam(feeOption.getFeeLevel(), feeValue, java.lang.Integer.parseInt(buySellPreset.getRouteConfig().getRouterModeType()), num, str2, slippageType, slippageType == SlippageMode.Dynamic.getType() ? buySellPreset.getSlippageConfig().getDynamicMaxSlippageValue() : "");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final java.util.List<FeeOption> AEQbTJ(@NotNull FeeConfig feeConfig, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(feeConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MemeTransactionSceneType.Market.getValue()) ? feeConfig.getFeeOptions() : feeConfig.getLimitOrderFeeOptions();
    }

    public static final PresetUserParams OLrzqt(@NotNull java.util.List<PresetUserConfigBean> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(OLrzqt((PresetUserConfigBean) it.next(), str4));
        }
        return new PresetUserParams(str2, str, arrayList, str4, str3);
    }
}
