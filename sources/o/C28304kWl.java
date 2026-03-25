package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC28301kWi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28304kWl implements InterfaceC28301kWi {
    public final java.util.List<java.lang.String> AEQbTJ;
    public final C28297kWe KWHzl;

    @yCM
    public C28304kWl(@NotNull C28297kWe c28297kWe) {
        Intrinsics.checkNotNullParameter(c28297kWe, "");
        this.KWHzl = c28297kWe;
        this.AEQbTJ = yDY.AhwBna(C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri), C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap), C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompat1));
    }

    public java.lang.String AEQbTJ(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketPriority();
        }
        return interfaceC30981llREZpvd.KWHzl().getMarketPriority();
    }

    public final InterfaceC30981llR EZpvd(@NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        return interfaceC30984llU.EZpvd().OLrzqt();
    }

    public java.lang.String KWHzl(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastPriority();
        }
        return interfaceC30981llREZpvd.KWHzl().getFastPriority();
    }

    public java.lang.String OLrzqt(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboPriority();
        }
        return interfaceC30981llREZpvd.KWHzl().getTurboPriority();
    }

    public java.lang.String KWHzl(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketMaxFeeUsd();
        }
        return interfaceC30981llREZpvd.KWHzl().getMarketMaxFeeUsd();
    }

    public java.lang.String copydefault(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastMaxFeeUsd();
        }
        return interfaceC30981llREZpvd.KWHzl().getFastMaxFeeUsd();
    }

    public java.lang.String OLrzqt(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboMaxFeeUsd();
        }
        return interfaceC30981llREZpvd.KWHzl().getTurboMaxFeeUsd();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        java.lang.String str2;
        java.lang.String maxBaseFee = "";
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        DexPresetResultVO dexPresetResultVOAEQbTJ = this.KWHzl.AEQbTJ(interfaceC30984llU.copydefault().copydefault().getChainId());
        if (interfaceC30981llREZpvd == null || dexPresetResultVOAEQbTJ == null) {
            return "";
        }
        if (i == PriorityFeeType.PriorityCustom.getValue()) {
            java.lang.String gasPriceUnitDecimal = dexPresetResultVOAEQbTJ.getGasPriceUnitDecimal();
            if (z) {
                MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
                java.lang.String maxBaseFee2 = mevInfoBeanKWHzl != null ? mevInfoBeanKWHzl.getMaxBaseFee() : null;
                if (maxBaseFee2 != null) {
                    str2 = maxBaseFee2;
                }
                return KWHzl(str, interfaceC30981llREZpvd.AEQbTJ(), gasPriceUnitDecimal, interfaceC30981llREZpvd.copydefault(), str2);
            }
            maxBaseFee = interfaceC30981llREZpvd.KWHzl().getMaxBaseFee();
            str2 = maxBaseFee;
            return KWHzl(str, interfaceC30981llREZpvd.AEQbTJ(), gasPriceUnitDecimal, interfaceC30981llREZpvd.copydefault(), str2);
        }
        return InterfaceC28301kWi.TaskDescription.getPriorityFeeUsd$default(this, i, interfaceC30984llU, z, null, null, null, null, 120, null);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        BigDecimal bigDecimalFARcdN = C59443zhD.fARcdN(str3);
        if (bigDecimalFARcdN == null) {
            return "";
        }
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(C23313hvq.mulCheckS$default(C23313hvq.addCheckS$default(str, str5, null, null, null, 14, null), str2, null, null, null, 14, null), BigDecimal.TEN.pow(bigDecimalFARcdN.intValue()), null, null, null, 14, null), str4, null, null, null, 14, null);
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return AEQbTJ(interfaceC30984llU, z);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return KWHzl(interfaceC30984llU, z);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? OLrzqt(interfaceC30984llU, z) : str;
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        DexPresetResultVO dexPresetResultVOAEQbTJ;
        java.lang.String str5;
        java.lang.String maxBaseFee = "";
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        InterfaceC30981llR interfaceC30981llREZpvd = EZpvd(interfaceC30984llU);
        if (interfaceC30981llREZpvd == null) {
            return "";
        }
        java.lang.String strCopydefault = interfaceC30981llREZpvd.copydefault();
        if (strCopydefault.length() == 0 || (dexPresetResultVOAEQbTJ = this.KWHzl.AEQbTJ(interfaceC30984llU.copydefault().copydefault().getChainId())) == null) {
            return "";
        }
        java.lang.String gasPriceUnitDecimal = dexPresetResultVOAEQbTJ.getGasPriceUnitDecimal();
        if (gasPriceUnitDecimal.length() == 0) {
            return "";
        }
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return KWHzl(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return OLrzqt(z, interfaceC30984llU);
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llREZpvd.EZpvd());
            java.lang.String maxBaseFee2 = mevInfoBeanKWHzl != null ? mevInfoBeanKWHzl.getMaxBaseFee() : null;
            if (maxBaseFee2 != null) {
                str5 = maxBaseFee2;
            }
            return KWHzl(str, str2, gasPriceUnitDecimal, strCopydefault, str5);
        }
        maxBaseFee = interfaceC30981llREZpvd.KWHzl().getMaxBaseFee();
        str5 = maxBaseFee;
        return KWHzl(str, str2, gasPriceUnitDecimal, strCopydefault, str5);
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
            arrayList.add(new PrioritySelectionBean(this.AEQbTJ.get(i), AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), feeOption.getSelected(), feeOption.getFeeLevel(), C23271hvA.formatTokenCode$default(C23271hvA.copydefault, AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), true, null, false, str, null, 22, null), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
            i++;
        }
        return arrayList;
    }
}
