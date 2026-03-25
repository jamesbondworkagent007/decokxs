package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.meme.data.FeeOption;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC28301kWi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kWs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28311kWs implements InterfaceC28301kWi {
    public final java.util.List<java.lang.String> KWHzl = yDY.AhwBna(C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri), C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap), C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompat1));

    @yCM
    public C28311kWs() {
    }

    public java.lang.String KWHzl(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketFee();
        }
        return interfaceC30981llROLrzqt.KWHzl().getMarketFee();
    }

    public java.lang.String copydefault(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastFee();
        }
        return interfaceC30981llROLrzqt.KWHzl().getFastFee();
    }

    public java.lang.String OLrzqt(@NotNull InterfaceC30984llU interfaceC30984llU, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboFee();
        }
        return interfaceC30981llROLrzqt.KWHzl().getTurboFee();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String AEQbTJ(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return KWHzl(interfaceC30984llU, z);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(interfaceC30984llU, z);
        }
        return i == PriorityFeeType.PriorityTurbo.getValue() ? OLrzqt(interfaceC30984llU, z) : str;
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        if (i == PriorityFeeType.PriorityMarket.getValue()) {
            return AEQbTJ(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityFast.getValue()) {
            return copydefault(z, interfaceC30984llU);
        }
        if (i == PriorityFeeType.PriorityTurbo.getValue()) {
            return KWHzl(z, interfaceC30984llU);
        }
        return C23313hvq.mulCheckS$default(str, str4, null, null, null, 14, null);
    }

    public java.lang.String AEQbTJ(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getMarketFeeUsd();
        }
        return interfaceC30981llROLrzqt.KWHzl().getMarketFeeUsd();
    }

    public java.lang.String copydefault(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getFastFeeUsd();
        }
        return interfaceC30981llROLrzqt.KWHzl().getFastFeeUsd();
    }

    public java.lang.String KWHzl(boolean z, @NotNull InterfaceC30984llU interfaceC30984llU) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        if (interfaceC30981llROLrzqt == null) {
            return "";
        }
        if (z) {
            MevInfoBean mevInfoBeanKWHzl = C22340hdX.KWHzl(interfaceC30981llROLrzqt.EZpvd());
            return mevInfoBeanKWHzl == null ? "" : mevInfoBeanKWHzl.getTurboFeeUsd();
        }
        return interfaceC30981llROLrzqt.KWHzl().getTurboFeeUsd();
    }

    @Override // o.InterfaceC28301kWi
    public java.lang.String OLrzqt(int i, @NotNull InterfaceC30984llU interfaceC30984llU, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC30984llU, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        java.lang.String strCopydefault = interfaceC30981llROLrzqt != null ? interfaceC30981llROLrzqt.copydefault() : null;
        return C23313hvq.addCheckS$default(InterfaceC28301kWi.TaskDescription.getPriorityFeeUsd$default(this, i, interfaceC30984llU, z, str, null, null, strCopydefault == null ? "" : strCopydefault, 48, null), EZpvd(interfaceC30984llU), null, null, null, 14, null);
    }

    public final java.lang.String EZpvd(InterfaceC30984llU interfaceC30984llU) {
        InterfaceC30981llR interfaceC30981llROLrzqt = interfaceC30984llU.EZpvd().OLrzqt();
        return interfaceC30981llROLrzqt == null ? "" : interfaceC30981llROLrzqt.KWHzl().getBaseFeeUsd();
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
            arrayList.add(new PrioritySelectionBean(this.KWHzl.get(i), AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), feeOption.getSelected(), feeOption.getFeeLevel(), C23271hvA.formatTokenCode$default(C23271hvA.copydefault, AEQbTJ(feeOption.getFeeLevel(), interfaceC30984llU, z, feeOption.getFeeValue()), true, null, false, str, null, 22, null), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
            i++;
        }
        return arrayList;
    }
}
