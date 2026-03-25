package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.collection.ArrayMapKt;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.InputStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.InterfaceC25317iuT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kXA implements InterfaceC25317iuT {
    public DexAutoSlippageInfoParam EZpvd;
    public final Function1<C25301iuD, Unit> KWHzl;
    public InterfaceC30984llU OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25317iuT
    public void KWHzl(boolean z, @NotNull C25308iuK c25308iuK, @NotNull C55008xbo c55008xbo, @NotNull AppCompatTextView appCompatTextView, @NotNull FixedParam fixedParam) {
        Intrinsics.checkNotNullParameter(c25308iuK, "");
        Intrinsics.checkNotNullParameter(c55008xbo, "");
        Intrinsics.checkNotNullParameter(appCompatTextView, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InterfaceC30984llU interfaceC30984llU, DexAutoSlippageInfoParam dexAutoSlippageInfoParam) {
        this.OLrzqt = interfaceC30984llU;
        this.EZpvd = dexAutoSlippageInfoParam;
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

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.iuD, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public kXA(@NotNull Function1<? super C25301iuD, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
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
        java.lang.String strCopydefault = fixedParam.copydefault();
        java.lang.String strKWHzl = fixedParam.KWHzl();
        java.lang.String strOLrzqt = fixedParam.OLrzqt();
        if (str.length() == 0) {
            C55001xbh c55001xbhAkhnZx = c55008xbo.AkhnZx();
            if (c55001xbhAkhnZx == null || !c55001xbhAkhnZx.isFocused()) {
                return;
            }
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NO_DATA, c55008xbo, null, false, 12, null);
            return;
        }
        if (C23313hvq.KWHzl(str, strEZpvd)) {
            c25308iuK.setInputStatus(InputStatus.ERROR, c55008xbo, C33069mpW.copydefault(C23274hvD.Fragment.QfZsXX, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C23313hvq.mulCheckS$default(strEZpvd, 100, null, null, null, 14, null), null, 1, null)))), z);
            return;
        }
        if (C23313hvq.EZpvd(str, strEZpvd) && C23313hvq.KWHzl(str, strKWHzl)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.fromMediaDescription, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(strKWHzl, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), z);
        } else if (C23313hvq.OLrzqt(str, strOLrzqt) && C23313hvq.valueOf(str, strCopydefault)) {
            c25308iuK.setInputStatus(InputStatus.WARNING, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(strKWHzl, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), z);
        } else if (C23313hvq.OLrzqt(str, strCopydefault)) {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.ERROR, c55008xbo, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getMediaDescription, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num1", C23311hvo.formatPercent$default(strKWHzl, false, 0, 0, null, null, 31, null)), C56390yDp.OLrzqt("num2", C23311hvo.formatPercent$default(strOLrzqt, false, 0, 0, null, null, 31, null)))), false, 8, null);
        } else {
            C25308iuK.setInputStatus$default(c25308iuK, InputStatus.NORMAL, c55008xbo, null, false, 12, null);
        }
    }

    @Override // o.InterfaceC25317iuT
    public void EZpvd(@NotNull C25301iuD c25301iuD) {
        Intrinsics.checkNotNullParameter(c25301iuD, "");
        this.KWHzl.invoke(c25301iuD);
    }
}
