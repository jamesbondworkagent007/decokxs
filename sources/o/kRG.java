package o;

import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedPriorityFeeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kRG {
    @yCM
    public kRG() {
    }

    public static /* synthetic */ java.util.List initPresetPriority$default(kRG krg, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        return krg.KWHzl(i, str);
    }

    public final java.util.List<PrioritySelectionBean> KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri);
        AdvancedPriorityFeeType advancedPriorityFeeType = AdvancedPriorityFeeType.Market;
        arrayList.add(new PrioritySelectionBean(strAYXKKw, (java.lang.String) null, i == advancedPriorityFeeType.getValue(), advancedPriorityFeeType.getValue(), (java.lang.String) null, (java.lang.String) null, 50, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap);
        AdvancedPriorityFeeType advancedPriorityFeeType2 = AdvancedPriorityFeeType.Fast;
        arrayList.add(new PrioritySelectionBean(strAYXKKw2, (java.lang.String) null, i == advancedPriorityFeeType2.getValue(), advancedPriorityFeeType2.getValue(), (java.lang.String) null, (java.lang.String) null, 50, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance);
        AdvancedPriorityFeeType advancedPriorityFeeType3 = AdvancedPriorityFeeType.Turbo;
        arrayList.add(new PrioritySelectionBean(strAYXKKw3, (java.lang.String) null, i == advancedPriorityFeeType3.getValue(), advancedPriorityFeeType3.getValue(), (java.lang.String) null, (java.lang.String) null, 50, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompat1);
        AdvancedPriorityFeeType advancedPriorityFeeType4 = AdvancedPriorityFeeType.Custom;
        arrayList.add(new PrioritySelectionBean(strAYXKKw4, i == advancedPriorityFeeType4.getValue() ? str : "", i == advancedPriorityFeeType4.getValue(), advancedPriorityFeeType4.getValue(), (java.lang.String) null, (java.lang.String) null, 48, (DefaultConstructorMarker) null));
        return arrayList;
    }

    public final java.util.List<PrioritySelectionBean> OLrzqt(int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.lang.String showDataWithSymbol$default;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z2 = (mevInfoBean == null && nonMevPriorityFeeInfo == null) ? false : true;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri);
        AdvancedPriorityFeeType advancedPriorityFeeType = AdvancedPriorityFeeType.Market;
        boolean z3 = i == advancedPriorityFeeType.getValue();
        int value = advancedPriorityFeeType.getValue();
        java.lang.String strKWHzl = KWHzl(mevInfoBean, nonMevPriorityFeeInfo, z);
        if (z2) {
            str2 = "";
            arrayList = arrayList2;
            showDataWithSymbol$default = C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, KWHzl(mevInfoBean, nonMevPriorityFeeInfo, z), str, false, null, false, false, 60, null);
        } else {
            showDataWithSymbol$default = "";
            str2 = showDataWithSymbol$default;
            arrayList = arrayList2;
        }
        arrayList.add(new PrioritySelectionBean(strAYXKKw, strKWHzl, z3, value, showDataWithSymbol$default, "web3_dex_priority_fee_market_item"));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap);
        AdvancedPriorityFeeType advancedPriorityFeeType2 = AdvancedPriorityFeeType.Fast;
        arrayList.add(new PrioritySelectionBean(strAYXKKw2, copydefault(mevInfoBean, nonMevPriorityFeeInfo, z), i == advancedPriorityFeeType2.getValue(), advancedPriorityFeeType2.getValue(), !z2 ? str2 : C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, copydefault(mevInfoBean, nonMevPriorityFeeInfo, z), str, false, null, false, false, 60, null), "web3_dex_priority_fee_fast_item"));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance);
        AdvancedPriorityFeeType advancedPriorityFeeType3 = AdvancedPriorityFeeType.Turbo;
        arrayList.add(new PrioritySelectionBean(strAYXKKw3, AEQbTJ(mevInfoBean, nonMevPriorityFeeInfo, z), i == advancedPriorityFeeType3.getValue(), advancedPriorityFeeType3.getValue(), !z2 ? str2 : C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, AEQbTJ(mevInfoBean, nonMevPriorityFeeInfo, z), str, false, null, false, false, 60, null), "web3_dex_priority_fee_turbo_item"));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z) {
        java.lang.String marketFee;
        if (z) {
            marketFee = mevInfoBean != null ? mevInfoBean.getMarketFee() : null;
        } else {
            marketFee = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getMarketFee() : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z) {
        java.lang.String fastFee;
        if (z) {
            fastFee = mevInfoBean != null ? mevInfoBean.getFastFee() : null;
        } else {
            fastFee = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getFastFee() : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
    
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0009, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z) {
        java.lang.String turboFee;
        if (z) {
            turboFee = mevInfoBean != null ? mevInfoBean.getTurboFee() : null;
        } else {
            turboFee = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getTurboFee() : null;
        }
    }

    public final java.lang.String OLrzqt(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        java.lang.String marketFee;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            strMulCheckS$default = mevInfoBean != null ? mevInfoBean.getMarketFee() : null;
            java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(strMulCheckS$default == null ? "" : strMulCheckS$default, str, null, null, null, 14, null);
            return strMulCheckS$default == null ? "" : strMulCheckS$default;
        }
        if (nonMevPriorityFeeInfo != null && (marketFee = nonMevPriorityFeeInfo.getMarketFee()) != null) {
            strMulCheckS$default = C23313hvq.mulCheckS$default(marketFee, str, null, null, null, 14, null);
        }
        return strMulCheckS$default == null ? "" : strMulCheckS$default;
    }

    public final java.lang.String AEQbTJ(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        java.lang.String fastFee;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            strMulCheckS$default = mevInfoBean != null ? mevInfoBean.getFastFee() : null;
            java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(strMulCheckS$default == null ? "" : strMulCheckS$default, str, null, null, null, 14, null);
            return strMulCheckS$default == null ? "" : strMulCheckS$default;
        }
        if (nonMevPriorityFeeInfo != null && (fastFee = nonMevPriorityFeeInfo.getFastFee()) != null) {
            strMulCheckS$default = C23313hvq.mulCheckS$default(fastFee, str, null, null, null, 14, null);
        }
        return strMulCheckS$default == null ? "" : strMulCheckS$default;
    }

    public final java.lang.String KWHzl(MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        java.lang.String turboFee;
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            strMulCheckS$default = mevInfoBean != null ? mevInfoBean.getTurboFee() : null;
            java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(strMulCheckS$default == null ? "" : strMulCheckS$default, str, null, null, null, 14, null);
            return strMulCheckS$default == null ? "" : strMulCheckS$default;
        }
        if (nonMevPriorityFeeInfo != null && (turboFee = nonMevPriorityFeeInfo.getTurboFee()) != null) {
            strMulCheckS$default = C23313hvq.mulCheckS$default(turboFee, str, null, null, null, 14, null);
        }
        return strMulCheckS$default == null ? "" : strMulCheckS$default;
    }

    public static /* synthetic */ java.lang.String getPriorityFeeByPriorityType$default(kRG krg, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, java.lang.String str, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            str = "";
        }
        return krg.KWHzl(i, mevInfoBean, nonMevPriorityFeeInfo, z, str);
    }

    public final java.lang.String KWHzl(int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (i == AdvancedPriorityFeeType.Market.getValue()) {
            return KWHzl(mevInfoBean, nonMevPriorityFeeInfo, z);
        }
        if (i == AdvancedPriorityFeeType.Fast.getValue()) {
            return copydefault(mevInfoBean, nonMevPriorityFeeInfo, z);
        }
        return i == AdvancedPriorityFeeType.Turbo.getValue() ? AEQbTJ(mevInfoBean, nonMevPriorityFeeInfo, z) : str;
    }

    public static /* synthetic */ java.lang.String getPriorityFeeUsd$default(kRG krg, int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, java.lang.String str, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            str = "";
        }
        return krg.AEQbTJ(i, mevInfoBean, nonMevPriorityFeeInfo, z, str, str2);
    }

    public final java.lang.String AEQbTJ(int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (i == AdvancedPriorityFeeType.Market.getValue()) {
            return OLrzqt(mevInfoBean, nonMevPriorityFeeInfo, z, str2);
        }
        if (i == AdvancedPriorityFeeType.Fast.getValue()) {
            return AEQbTJ(mevInfoBean, nonMevPriorityFeeInfo, z, str2);
        }
        if (i == AdvancedPriorityFeeType.Turbo.getValue()) {
            return KWHzl(mevInfoBean, nonMevPriorityFeeInfo, z, str2);
        }
        return C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeAuto.getValue())) {
            return z;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeMev.getValue())) {
            return true;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeFast.getValue())) {
            Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) PresetRouteType.RouteTypeNotSupport.getValue());
        }
        return false;
    }
}
