package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.PrioritySelectionBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQZ {
    @yCM
    public kQZ() {
    }

    public final java.util.List<PrioritySelectionBean> copydefault(int i, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo, boolean z, @NotNull java.lang.String str) {
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.lang.String tokenCode$default;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z2 = (mevInfoBean == null && nonMevPriorityFeeInfo == null) ? false : true;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri);
        PriorityFeeType priorityFeeType = PriorityFeeType.PriorityMarket;
        boolean z3 = i == priorityFeeType.getValue();
        int value = priorityFeeType.getValue();
        java.lang.String strAEQbTJ = AEQbTJ(z, mevInfoBean, nonMevPriorityFeeInfo);
        if (z2) {
            str2 = "";
            arrayList = arrayList2;
            tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, AEQbTJ(z, mevInfoBean, nonMevPriorityFeeInfo), true, null, false, str, null, 22, null);
        } else {
            tokenCode$default = "";
            str2 = tokenCode$default;
            arrayList = arrayList2;
        }
        arrayList.add(new PrioritySelectionBean(strAYXKKw, strAEQbTJ, z3, value, tokenCode$default, (java.lang.String) null, 32, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.setIconBitmap);
        PriorityFeeType priorityFeeType2 = PriorityFeeType.PriorityFast;
        arrayList.add(new PrioritySelectionBean(strAYXKKw2, OLrzqt(z, mevInfoBean, nonMevPriorityFeeInfo), i == priorityFeeType2.getValue(), priorityFeeType2.getValue(), !z2 ? str2 : C23271hvA.formatTokenCode$default(C23271hvA.copydefault, OLrzqt(z, mevInfoBean, nonMevPriorityFeeInfo), true, null, false, str, null, 22, null), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
        java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.newInstance);
        PriorityFeeType priorityFeeType3 = PriorityFeeType.PriorityTurbo;
        arrayList.add(new PrioritySelectionBean(strAYXKKw3, copydefault(z, mevInfoBean, nonMevPriorityFeeInfo), i == priorityFeeType3.getValue(), priorityFeeType3.getValue(), !z2 ? str2 : C23271hvA.formatTokenCode$default(C23271hvA.copydefault, copydefault(z, mevInfoBean, nonMevPriorityFeeInfo), true, null, false, str, null, 22, null), (java.lang.String) null, 32, (DefaultConstructorMarker) null));
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
    public final java.lang.String AEQbTJ(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String marketGasPrice;
        if (z) {
            marketGasPrice = mevInfoBean != null ? mevInfoBean.getMarketGasPrice() : null;
        } else {
            marketGasPrice = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getMarketGasPrice() : null;
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
    public final java.lang.String OLrzqt(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String fastGasPrice;
        if (z) {
            fastGasPrice = mevInfoBean != null ? mevInfoBean.getFastGasPrice() : null;
        } else {
            fastGasPrice = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getFastGasPrice() : null;
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
    public final java.lang.String copydefault(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String turboGasPrice;
        if (z) {
            turboGasPrice = mevInfoBean != null ? mevInfoBean.getTurboGasPrice() : null;
        } else {
            turboGasPrice = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getTurboGasPrice() : null;
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
    public final java.lang.String KWHzl(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String marketMaxFeeUsd;
        if (z) {
            marketMaxFeeUsd = mevInfoBean != null ? mevInfoBean.getMarketMaxFeeUsd() : null;
        } else {
            marketMaxFeeUsd = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getMarketMaxFeeUsd() : null;
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
    public final java.lang.String EZpvd(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String fastMaxFeeUsd;
        if (z) {
            fastMaxFeeUsd = mevInfoBean != null ? mevInfoBean.getFastMaxFeeUsd() : null;
        } else {
            fastMaxFeeUsd = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getFastMaxFeeUsd() : null;
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
    public final java.lang.String AhwBna(boolean z, MevInfoBean mevInfoBean, NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        java.lang.String turboMaxFeeUsd;
        if (z) {
            turboMaxFeeUsd = mevInfoBean != null ? mevInfoBean.getTurboMaxFeeUsd() : null;
        } else {
            turboMaxFeeUsd = nonMevPriorityFeeInfo != null ? nonMevPriorityFeeInfo.getTurboMaxFeeUsd() : null;
        }
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.String strMulCheckS$default = C23313hvq.mulCheckS$default(str, str2, null, null, null, 14, null);
        java.lang.Double dAuCTel = C59443zhD.AuCTel(str3);
        return C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(strMulCheckS$default, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, dAuCTel != null ? dAuCTel.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE)), null, null, null, 14, null), str4, null, null, null, 14, null);
    }
}
