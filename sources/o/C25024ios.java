package o;

import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.InputStatus;
import com.okinc.business.trade.features.home.advance.limit.viewmodel.AdvanceLimitSlippageViewModel;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC25317iuT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ios, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25024ios implements InterfaceC25317iuT {
    public final AdvanceLimitSlippageViewModel EZpvd;
    public final QuoteSlippageParams KWHzl;
    public final java.lang.String OLrzqt;
    public C25301iuD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25317iuT
    public void KWHzl(boolean z, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam) {
        Intrinsics.checkNotNullParameter(c25308iuK, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25301iuD copydefault() {
        return this.copydefault;
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

    public C25024ios(@NotNull AdvanceLimitSlippageViewModel advanceLimitSlippageViewModel, QuoteSlippageParams quoteSlippageParams, java.lang.String str) {
        Intrinsics.checkNotNullParameter(advanceLimitSlippageViewModel, "");
        this.EZpvd = advanceLimitSlippageViewModel;
        this.KWHzl = quoteSlippageParams;
        this.OLrzqt = str;
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
        AEQbTJ(str, c25308iuK, c55008xbo, appCompatTextView, fixedParam, z);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iuK.setInputStatus$default(o.iuK, com.okinc.business.dexui.main.swap.widget.slippage.InputStatus, o.xbo, java.lang.String, boolean, int, java.lang.Object):void */
    public final void AEQbTJ(java.lang.String str, C25308iuK c25308iuK, C55008xbo c55008xbo, AppCompatTextView appCompatTextView, FixedParam fixedParam, boolean z) {
        java.lang.String strEZpvd = fixedParam.EZpvd();
        java.lang.String strCopydefault = fixedParam.copydefault();
        if (str.length() == 0) {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NO_DATA, c55008xbo, null, false, 12, null);
            return;
        }
        if (C23313hvq.KWHzl(str, strEZpvd)) {
            c25308iuK.setInputStatus(InputStatus.ERROR, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.QfZsXX, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C23313hvq.mulCheckS$default(strEZpvd, 100, null, null, null, 14, null), null, 1, null)))), z);
            return;
        }
        boolean zEZpvd = C23313hvq.EZpvd(str, strEZpvd);
        QuoteSlippageParams quoteSlippageParams = this.KWHzl;
        if (zEZpvd & C23313hvq.KWHzl(str, quoteSlippageParams != null ? quoteSlippageParams.KWHzl() : null)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33070mpX.AYXKKw(C23274hvD.Fragment.QsIRgs), z);
            return;
        }
        if (C23313hvq.OLrzqt(str, strCopydefault)) {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.ERROR, c55008xbo, C33070mpX.AYXKKw(C23274hvD.Fragment.TarCU), false, 8, null);
            return;
        }
        QuoteSlippageParams quoteSlippageParams2 = this.KWHzl;
        if ((C23313hvq.EZpvd(str, quoteSlippageParams2 != null ? quoteSlippageParams2.KWHzl() : null) & C23313hvq.valueOf(str, strCopydefault)) && (C23313hvq.EZpvd(str, C23313hvq.divCheckS$default("10", 100, null, null, null, 14, null)) & C23313hvq.valueOf(str, strCopydefault))) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.cBPFI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null), null, 1, null)))), z);
        } else {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NORMAL, c55008xbo, null, false, 12, null);
        }
    }

    @Override // o.InterfaceC25317iuT
    public void EZpvd(@NotNull C25301iuD c25301iuD) {
        Intrinsics.checkNotNullParameter(c25301iuD, "");
        this.copydefault = c25301iuD;
        this.EZpvd.copydefault(c25301iuD);
    }
}
