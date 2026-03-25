package o;

import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
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

/* JADX INFO: renamed from: o.lkM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30923lkM implements InterfaceC28305kWm, InterfaceC28306kWn, InterfaceC28303kWk, InterfaceC28298kWf, InterfaceC28302kWj {
    public final C28297kWe EZpvd;

    public C30923lkM(@NotNull C28297kWe c28297kWe) {
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        this.EZpvd = c28297kWe;
    }

    @Override // o.InterfaceC28305kWm
    public PresetUserConfigBean EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.EZpvd.EZpvd(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // o.InterfaceC28306kWn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FeeOption copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        java.util.List<FeeOption> feeOptions;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        BuySellPreset buySellPresetEZpvd = this.EZpvd.EZpvd(str, str2, i);
        java.lang.Object obj = null;
        FeeConfig feeConfig = buySellPresetEZpvd != null ? buySellPresetEZpvd.getFeeConfig() : null;
        if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) MemeTransactionSceneType.Limit.getValue())) {
            feeOptions = feeConfig != null ? feeConfig.getLimitOrderFeeOptions() : null;
        } else if (feeConfig != null) {
            feeOptions = feeConfig.getFeeOptions();
        }
        if (feeOptions != null) {
            java.util.Iterator<T> it = feeOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((FeeOption) next).getSelected()) {
                    obj = next;
                    break;
                }
            }
            FeeOption feeOption = (FeeOption) obj;
            if (feeOption != null) {
                return feeOption;
            }
        }
        return new FeeOption(0, (java.lang.String) null, false, 7, (DefaultConstructorMarker) null);
    }

    @Override // o.InterfaceC28303kWk
    public SlippageRange AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        SlippageConfigPreset slippageConfig;
        java.util.List<SlippageRange> slippageRange;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuySellPreset buySellPresetEZpvd = this.EZpvd.EZpvd(str, str2, i);
        java.lang.Object obj = null;
        if (buySellPresetEZpvd == null || (slippageConfig = buySellPresetEZpvd.getSlippageConfig()) == null || (slippageRange = slippageConfig.getSlippageRange()) == null) {
            return null;
        }
        java.util.Iterator<T> it = slippageRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((SlippageRange) next).getSelected()) {
                obj = next;
                break;
            }
        }
        return (SlippageRange) obj;
    }

    @Override // o.InterfaceC28303kWk
    public SlippageConfigPreset EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuySellPreset buySellPresetEZpvd = this.EZpvd.EZpvd(str, str2, i);
        if (buySellPresetEZpvd != null) {
            return buySellPresetEZpvd.getSlippageConfig();
        }
        return null;
    }

    @Override // o.InterfaceC28298kWf
    public int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DexPresetResultVO dexPresetResultVOAEQbTJ = this.EZpvd.AEQbTJ(str);
        return dexPresetResultVOAEQbTJ != null ? dexPresetResultVOAEQbTJ.getMemeChainType() : C33129mqd.AhwBna(MemeChainType.MemeChainTypeOther.getValue());
    }

    @Override // o.InterfaceC28302kWj
    public java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i) {
        RouteConfig routeConfig;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuySellPreset buySellPresetEZpvd = this.EZpvd.EZpvd(str, str2, i);
        java.lang.String routerModeType = (buySellPresetEZpvd == null || (routeConfig = buySellPresetEZpvd.getRouteConfig()) == null) ? null : routeConfig.getRouterModeType();
        return routerModeType == null ? "" : routerModeType;
    }

    @Override // o.InterfaceC28302kWj
    public boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        DexPresetResultVO dexPresetResultVOAEQbTJ = this.EZpvd.AEQbTJ(str);
        if (dexPresetResultVOAEQbTJ != null) {
            return dexPresetResultVOAEQbTJ.getSupportAutoMode();
        }
        return true;
    }
}
