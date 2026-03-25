package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.InputStatus;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedCustomOtherChainPresetVM;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC25317iuT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.liX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30828liX implements InterfaceC25317iuT {
    public AdvancedQuoteUiData EZpvd;
    public final AdvancedCustomOtherChainPresetVM OLrzqt;
    public AutoSlippageInfo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(AdvancedQuoteUiData advancedQuoteUiData, AutoSlippageInfo autoSlippageInfo) {
        this.EZpvd = advancedQuoteUiData;
        this.copydefault = autoSlippageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25317iuT
    public void KWHzl(boolean z, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam) {
        Intrinsics.checkNotNullParameter(c25308iuK, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25317iuT
    public void copydefault(@NotNull java.lang.String str, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull DynamicParam dynamicParam) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25308iuK, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(dynamicParam, "");
    }

    public C30828liX(@NotNull AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVM) {
        Intrinsics.checkNotNullParameter(advancedCustomOtherChainPresetVM, "");
        this.OLrzqt = advancedCustomOtherChainPresetVM;
    }

    @Override // o.InterfaceC25317iuT
    public boolean AEQbTJ() {
        return InterfaceC25317iuT.StateListAnimator.AEQbTJ(this);
    }

    @Override // o.InterfaceC25317iuT
    public void KWHzl(@NotNull java.lang.String str, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25308iuK, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
        java.lang.String strEZpvd = fixedParam.EZpvd();
        java.lang.String strKWHzl = fixedParam.KWHzl();
        java.lang.String str2 = strKWHzl.length() == 0 ? strEZpvd : strKWHzl;
        java.lang.String strCopydefault = fixedParam.copydefault();
        java.lang.String strOLrzqt = fixedParam.OLrzqt();
        if (strOLrzqt.length() == 0) {
            strOLrzqt = strCopydefault;
        }
        if (str.length() == 0) {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NO_DATA, c55008xbo, null, false, 12, null);
            return;
        }
        if (C23313hvq.valueOf(str, 0)) {
            c25308iuK.setInputStatus(InputStatus.ERROR, c55008xbo, C33069mpW.copydefault(C23274hvD.Fragment.atDTRm, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C23313hvq.mulCheckS$default(java.lang.Double.valueOf(1.0E-4d), 100, null, null, null, 14, null), null, 1, null)))), z);
            return;
        }
        if (C23313hvq.EZpvd(str, java.lang.Double.valueOf(1.0E-4d)) && C23313hvq.KWHzl(str, strEZpvd)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.aVhqwO, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(str2, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), z);
            return;
        }
        if (C23313hvq.KWHzl(str, str2)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.aVhqwO, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(str2, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), z);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fixedParam.OLrzqt()) && C23313hvq.EZpvd(str, C23313hvq.divCheckS$default("10", 100, null, null, null, 14, null)) && C23313hvq.valueOf(str, C23313hvq.divCheckS$default("50", 100, null, null, null, 14, null))) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.cBPFI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), null, 1, null)))), z);
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fixedParam.OLrzqt()) && C23313hvq.OLrzqt(str, C23313hvq.divCheckS$default("50", 100, null, null, null, 14, null))) {
            c25308iuK.setInputStatus(InputStatus.ERROR, c55008xbo, C33070mpX.AYXKKw(C23274hvD.Fragment.TarCU), z);
            return;
        }
        if (C23313hvq.OLrzqt(str, strOLrzqt) && C23313hvq.KWHzl(str, 1)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.aKhcqp, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(str2, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), z);
        } else if (C23313hvq.OLrzqt(str, 1)) {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.ERROR, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.dIjzlO, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(strEZpvd, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strCopydefault, false, 0, 0, null, null, 31, null)))), false, 8, null);
        } else {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NORMAL, c55008xbo, null, false, 12, null);
        }
    }

    @Override // o.InterfaceC25317iuT
    public void EZpvd(@NotNull C25301iuD c25301iuD) {
        java.lang.String strOLrzqt;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(c25301iuD, "");
        SlippageFeeType slippageFeeTypeKWHzl = c25301iuD.KWHzl();
        if (slippageFeeTypeKWHzl != null) {
            this.OLrzqt.EZpvd(java.lang.Integer.valueOf(slippageFeeTypeKWHzl.getValue()).intValue());
        }
        AdvancedCustomOtherChainPresetVM advancedCustomOtherChainPresetVM = this.OLrzqt;
        if (c25301iuD.EZpvd() != InputStatus.ERROR && (strOLrzqt = c25301iuD.OLrzqt()) != null) {
            str = strOLrzqt;
        }
        advancedCustomOtherChainPresetVM.AEQbTJ(str);
        this.OLrzqt.AEQbTJ(c25301iuD.copydefault());
        this.OLrzqt.OLrzqt(c25301iuD.AEQbTJ());
    }
}
