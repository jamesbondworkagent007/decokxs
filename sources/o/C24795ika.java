package o;

import android.view.View;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeGroupInputData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.DexTradeInputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C24818ikx;
import o.C32113mPz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ika, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C24795ika extends android.widget.RelativeLayout {
    public java.lang.String EZpvd;
    public DexTradeGroupInputData KWHzl;
    public hGZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hGZ EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataBinding(hGZ hgz) {
        this.OLrzqt = hgz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24795ika(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = "";
        this.KWHzl = new DexTradeGroupInputData(null, null, 3, null);
        OLrzqt(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24795ika(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24795ika(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24795ika(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void OLrzqt(android.content.Context context) {
        if (context == null) {
            return;
        }
        this.OLrzqt = hGZ.KWHzl(android.view.LayoutInflater.from(context), this);
        setAccessibilityIds(new C24818ikx.Activity("web3_dex_swap_trade_from_token_list_button", "web3_dex_swap_trade_from_token_amount_view_display", "web3_dex_swap_trade_from_token_amount_view_edit", "web3_dex_swap_trade_from_token_name"), new C24818ikx.Activity("web3_dex_swap_trade_to_token_list_button", null, null, "web3_dex_swap_trade_to_token_name"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ika */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFromToChangeClick$default(C24795ika c24795ika, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFromToChangeClick");
        }
        if ((i & 1) != 0) {
            function1 = null;
        }
        c24795ika.setFromToChangeClick(function1);
    }

    public final void setFromToChangeClick(final Function1<? super C24795ika, Unit> function1) {
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(hgz.AEQbTJ, 0L, new Function1() { // from class: o.ikd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24795ika.EZpvd(function1, this, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(Function1 function1, C24795ika c24795ika, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function1 != null) {
            function1.invoke(c24795ika);
        }
        return Unit.INSTANCE;
    }

    public final void setFromCoinSelectClick(@NotNull final Function1<? super C24795ika, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.copydefault.setTextSelectCallback(new Function1() { // from class: o.ikh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24795ika.copydefault(function1, this, (C24800ikf) obj);
                }
            });
        }
    }

    public static final Unit copydefault(Function1 function1, C24795ika c24795ika, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        function1.invoke(c24795ika);
        return Unit.INSTANCE;
    }

    public final void setToCoinSelectClick(@NotNull final Function1<? super C24795ika, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.djBIcL.setTextSelectCallback(new Function1() { // from class: o.ijY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24795ika.AEQbTJ(function1, this, (C24800ikf) obj);
                }
            });
        }
    }

    public static final Unit AEQbTJ(Function1 function1, C24795ika c24795ika, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        function1.invoke(c24795ika);
        return Unit.INSTANCE;
    }

    public final void setActionCallBack(@NotNull Function0<Unit> function0) {
        C24814ikt c24814ikt;
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setActionCallBack(function0);
    }

    public final void setChainFromSelectClick(@NotNull Function1<? super C24800ikf, Unit> function1) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setChainSelectClick(function1);
    }

    public final void setChainToSelectClick(@NotNull Function1<? super C24800ikf, Unit> function1) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setChainSelectClick(function1);
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.AEQbTJ(function2);
    }

    public final void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.AEQbTJ(function2);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.KWHzl(function2);
    }

    public final void AhwBna(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.KWHzl(function2);
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.OLrzqt(function2);
    }

    public final void copydefault(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.OLrzqt(function2);
    }

    public final void djBIcL(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.copydefault(function2);
    }

    public final void AYXKKw(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.copydefault(function2);
    }

    public final void copydefault(@NotNull View.OnFocusChangeListener onFocusChangeListener) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.EZpvd(onFocusChangeListener);
    }

    public final void EZpvd(@NotNull View.OnFocusChangeListener onFocusChangeListener) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.EZpvd(onFocusChangeListener);
    }

    public final void valueOf() {
        C24800ikf c24800ikf;
        C24800ikf c24800ikf2;
        hGZ hgz = this.OLrzqt;
        if (hgz != null && (c24800ikf2 = hgz.djBIcL) != null) {
            c24800ikf2.copydefault();
        }
        hGZ hgz2 = this.OLrzqt;
        if (hgz2 == null || (c24800ikf = hgz2.copydefault) == null) {
            return;
        }
        c24800ikf.copydefault();
    }

    public final DexTradeGroupInputData copydefault() {
        DexTradeGroupInputData dexTradeGroupInputData = this.KWHzl;
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            dexTradeGroupInputData.setFromData(hgz.copydefault.OLrzqt());
            dexTradeGroupInputData.setToData(hgz.djBIcL.OLrzqt());
        }
        return dexTradeGroupInputData;
    }

    public final void setFromData(@NotNull DexTradeInputData dexTradeInputData) {
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.KWHzl.setFromData(dexTradeInputData);
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.copydefault.setDexTradeData(dexTradeInputData);
            hgz.KWHzl.setContentData(dexTradeInputData.getHorizontalLabelData());
        }
    }

    public final void setFromHighRiskVisible(boolean z) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setHighRiskVisible(z);
    }

    public final void setToHighRiskVisible(boolean z) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setHighRiskVisible(z);
    }

    public final void setToHeterogeneousAddress(C22947hov c22947hov) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setHeterogeneousAddress(c22947hov);
    }

    public final void setToHeterogeneousChain(@NotNull DefiChainInfo defiChainInfo) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setHeterogeneousChain(defiChainInfo);
    }

    public final void setOnHeterogeneousClickListener(@NotNull View.OnClickListener onClickListener) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setOnHeterogeneousClickListener(onClickListener);
    }

    public final void gEmmrt() {
        C24800ikf c24800ikf;
        C24800ikf c24800ikf2;
        hGZ hgz = this.OLrzqt;
        if (hgz != null && (c24800ikf2 = hgz.djBIcL) != null) {
            c24800ikf2.AhwBna();
        }
        hGZ hgz2 = this.OLrzqt;
        if (hgz2 == null || (c24800ikf = hgz2.copydefault) == null) {
            return;
        }
        c24800ikf.AhwBna();
    }

    public final void setToData(@NotNull DexTradeInputData dexTradeInputData) {
        int iTradeFallDefault$default;
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.KWHzl.setToData(dexTradeInputData);
        hGZ hgz = this.OLrzqt;
        if (hgz != null && (c24800ikf = hgz.djBIcL) != null) {
            c24800ikf.setDexTradeData(dexTradeInputData);
        }
        boolean zIsWarning = dexTradeInputData.getVerticalEditTextGroupData().isWarning();
        java.lang.String secondDataLabel = dexTradeInputData.getVerticalEditTextGroupData().getSecondDataLabel();
        if (zIsWarning) {
            if (C23313hvq.EZpvd(secondDataLabel, "0.001")) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iTradeFallDefault$default = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iTradeFallDefault$default = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
            }
            OLrzqt(iTradeFallDefault$default);
            return;
        }
        OLrzqt(C25382ivf.KWHzl(C32113mPz.ActionBar.QVAiDq));
    }

    public final void setLimitToData(@NotNull DexTradeInputData dexTradeInputData) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(dexTradeInputData, "");
        this.KWHzl.setToData(dexTradeInputData);
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setDexTradeData(dexTradeInputData);
    }

    public final void setInputHintContent(boolean z, @NotNull java.lang.String str) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(str, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setInputHintContent(z, str);
    }

    public final void KWHzl(@NotNull Function0<Unit> function0) {
        C24814ikt c24814ikt;
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setReverseValueTip(function0);
    }

    public final void setReverseTipVisibility(int i) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setReverseTipIconVisibility(i);
    }

    public final void setAddFundVisibility(int i) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setAddFundVisibility(i);
    }

    public final void setProgressBarVisibility(int i) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setProgressBarVisibility(i);
    }

    public final void setMaxActionVisibility(int i) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setMaxActionVisibility(i);
    }

    public static /* synthetic */ void setEnableEdit$default(C24795ika c24795ika, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setEnableEdit");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        c24795ika.setEnableEdit(z);
    }

    public final void setEnableEdit(boolean z) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setEnableEdit(z);
    }

    public static /* synthetic */ void setFromEnableEdit$default(C24795ika c24795ika, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFromEnableEdit");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        c24795ika.setFromEnableEdit(z);
    }

    public final void setFromEnableEdit(boolean z) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setEnableEdit(z);
    }

    public final void setFromInputConfig(@NotNull Function1<? super C24806ikl, Unit> function1) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setInputConfig(function1);
    }

    public final void setReceiveInputConfig(@NotNull Function1<? super C24806ikl, Unit> function1) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function1, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setInputConfig(function1);
    }

    public final void setClickCallback(@NotNull Function0<Unit> function0) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setClickCallback(function0);
    }

    public final void setFromClickCallback(@NotNull Function0<Unit> function0) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setClickCallback(function0);
    }

    public final void setClickValueDifferenceCallBack(@NotNull Function0<Unit> function0) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setClickValueDifferenceCallBack(function0);
    }

    public final void setInputFocusCallBack(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.copydefault.setInputFocusCallBack(function0);
            hgz.djBIcL.setInputFocusCallBack(function0);
        }
    }

    public final void setLeftRightMargin(int i) {
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.djBIcL.setLeftRightMargin(i);
            hgz.copydefault.setLeftRightMargin(i);
        }
    }

    private final void OLrzqt(int i) {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.setLabelSecondColor(i);
    }

    public final void djBIcL() {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.EZpvd();
    }

    public final void KWHzl() {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.KWHzl();
    }

    public final void AEQbTJ() {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.djBIcL) == null) {
            return;
        }
        c24800ikf.KWHzl();
    }

    public final void setFromCheckData(@NotNull java.lang.String str) {
        C24800ikf c24800ikf;
        Intrinsics.checkNotNullParameter(str, "");
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return;
        }
        c24800ikf.setCheckData(str);
    }

    public final void setFromBalanceInfoPanelVisibility(boolean z) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setBalanceInfoPanelVisibility(z);
    }

    public final void setToBalanceInfoPanelVisibility(boolean z) {
        C24814ikt c24814ikt;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24814ikt = hgz.KWHzl) == null) {
            return;
        }
        c24814ikt.setBalanceInfoPanelVisibility(z);
    }

    public final C24806ikl OLrzqt() {
        C24800ikf c24800ikf;
        hGZ hgz = this.OLrzqt;
        if (hgz == null || (c24800ikf = hgz.copydefault) == null) {
            return null;
        }
        return c24800ikf.AEQbTJ();
    }

    public final void setAccessibilityIds(@NotNull C24818ikx.Activity activity, @NotNull C24818ikx.Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(activity2, "");
        hGZ hgz = this.OLrzqt;
        if (hgz != null) {
            hgz.copydefault.setAccessibilityIds(activity);
            hgz.djBIcL.setAccessibilityIds(activity2);
        }
    }
}
