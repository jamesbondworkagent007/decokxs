package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23274hvD;
import o.InterfaceC28301kWi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28308kWp implements InterfaceC28301kWi {
    public final C28297kWe AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;

    @yCM
    public C28308kWp(@NotNull C28297kWe c28297kWe) {
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        this.AEQbTJ = c28297kWe;
        this.EZpvd = yDY.AhwBna(C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri), C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap), C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompat1));
    }

    public java.lang.String EZpvd(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llRKWHzl.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketMaxFeeUsd();
        }
        return interfaceC30981llRKWHzl.KWHzl().getMarketMaxFeeUsd();
    }

    public java.lang.String AEQbTJ(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llRKWHzl.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastMaxFeeUsd();
        }
        return interfaceC30981llRKWHzl.KWHzl().getFastMaxFeeUsd();
    }

    public java.lang.String OLrzqt(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboMaxFeeUsd();
        }
        return interfaceC30981llROLrzqt.KWHzl().getTurboMaxFeeUsd();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        DexPresetResultVO dexPresetResultVOAEQbTJ = this.AEQbTJ.AEQbTJ(interfaceC30984llU.copydefault().copydefault().getChainId());
        if (interfaceC30981llRKWHzl == null || dexPresetResultVOAEQbTJ == null) {
            return "";
        }
        if (i == PriorityFeeType.PriorityCustom.getValue()) {
            return AEQbTJ(str, interfaceC30981llRKWHzl.AEQbTJ(), dexPresetResultVOAEQbTJ.getGasPriceUnitDecimal(), interfaceC30981llRKWHzl.copydefault());
        }
        return InterfaceC28301kWi.TaskDescription.getPriorityFeeUsd$default(this, i, interfaceC30984llU, z, null, null, null, null, 120, null);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null), BigDecimal.TEN.pow(intOrNull != null ? intOrNull.intValue() : 0), null, null, null, 14, null), str4, null, null, null, 14, null);
    }

    public java.lang.String EZpvd(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llRKWHzl.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketGasPrice();
        }
        return interfaceC30981llRKWHzl.KWHzl().getMarketGasPrice();
    }

    public java.lang.String copydefault(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llRKWHzl.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastGasPrice();
        }
        return interfaceC30981llRKWHzl.KWHzl().getFastGasPrice();
    }

    public java.lang.String OLrzqt(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llRKWHzl.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboGasPrice();
        }
        return interfaceC30981llRKWHzl.KWHzl().getTurboGasPrice();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return EZpvd(interfaceC30984llU, z);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(interfaceC30984llU, z);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? OLrzqt(interfaceC30984llU, z) : str;
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        DexPresetResultVO dexPresetResultVOAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC30981llR interfaceC30981llRKWHzl = KWHzl(interfaceC30984llU);
        if (interfaceC30981llRKWHzl == null) {
            return "";
        }
        java.lang.String strCopydefault = interfaceC30981llRKWHzl.copydefault();
        if (strCopydefault.length() == 0 || (dexPresetResultVOAEQbTJ = this.AEQbTJ.AEQbTJ(interfaceC30984llU.copydefault().copydefault().getChainId())) == null) {
            return "";
        }
        java.lang.String gasPriceUnitDecimal = dexPresetResultVOAEQbTJ.getGasPriceUnitDecimal();
        if (gasPriceUnitDecimal.length() == 0) {
            return "";
        }
        java.lang.String strAEQbTJ = interfaceC30981llRKWHzl.AEQbTJ();
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return EZpvd(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return AEQbTJ(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return OLrzqt(z, interfaceC30984llU);
        }
        return AEQbTJ(str, strAEQbTJ, gasPriceUnitDecimal, strCopydefault);
    }

    private final InterfaceC30981llR KWHzl(InterfaceC30984llU interfaceC30984llU) {
        return interfaceC30984llU.EZpvd().OLrzqt();
    }

    @Override // o.InterfaceC28301kWi
    public java.util.List<PrioritySelectionBean> copydefault(@NotNull java.util.List<FeeOption> list, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            FeeOption feeOption = (FeeOption) obj;
            arrayList.add(new PrioritySelectionBean(this.EZpvd.get(i), AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), feeOption.getSelected(), feeOption.getFeeLevel(), C23271hvA.formatTokenCode$default(C23271hvA.copydefault, AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), true, null, false, str, null, 22, null), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
            i++;
        }
        return arrayList;
    }
}
