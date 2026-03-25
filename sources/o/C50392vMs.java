package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50392vMs extends LinearLayoutCompat {
    public C55915xsu AEQbTJ;
    public java.lang.String EZpvd;
    public final Function2<C47988uAv, java.lang.String, Unit> KWHzl;
    public final AbstractC50893vcj OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;
    public DcdBotQuotesDetail djBIcL;

    /* JADX INFO: renamed from: o.vMs$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnInvestChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50392vMs(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50893vcj abstractC50893vcjKWHzl = AbstractC50893vcj.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50893vcjKWHzl, "");
        this.OLrzqt = abstractC50893vcjKWHzl;
        setOrientation(1);
        this.KWHzl = new Function2() { // from class: o.vMw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50392vMs.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    private final void AYXKKw() {
        final C47988uAv c47988uAv = this.OLrzqt.KWHzl;
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50392vMs.AEQbTJ(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit AEQbTJ(C47988uAv c47988uAv, C50392vMs c50392vMs, float f) {
        ObservableField<MaxAvailableResp> observableFieldAEQbTJ;
        MaxAvailableResp maxAvailableResp;
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            java.lang.String quoteMax = null;
            c47988uAv.setOnTextChangeCallback(null);
            C55915xsu c55915xsu = c50392vMs.AEQbTJ;
            if (c55915xsu != null && (observableFieldAEQbTJ = c55915xsu.AEQbTJ()) != null && (maxAvailableResp = observableFieldAEQbTJ.get()) != null) {
                quoteMax = maxAvailableResp.getQuoteMax();
            }
            C47988uAv.setInputContent$default(c47988uAv, C33129mqd.mulS$default(java.lang.Float.valueOf(f), quoteMax, null, null, null, 14, null), false, false, 6, null);
            c50392vMs.copydefault();
            c47988uAv.setOnTextChangeCallback(c50392vMs.KWHzl);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull DcdBotQuotesDetail dcdBotQuotesDetail) {
        Intrinsics.checkNotNullParameter(dcdBotQuotesDetail, "");
        this.djBIcL = dcdBotQuotesDetail;
        C47988uAv c47988uAv = this.OLrzqt.KWHzl;
        c47988uAv.setInputUnit(dcdBotQuotesDetail.getAlternativeCurrency());
        c47988uAv.setMaxDecimal(C33129mqd.AhwBna(dcdBotQuotesDetail.getCurrencyScale()));
        xMR xmr = xMR.copydefault;
        java.lang.String tradeSizeMin = dcdBotQuotesDetail.getTradeSizeMin();
        C47988uAv.setInputLabel$default(c47988uAv, "≥ " + xmr.AhwBna(tradeSizeMin != null ? tradeSizeMin : "", C33129mqd.AhwBna(dcdBotQuotesDetail.getCurrencyScale())), null, 2, null);
    }

    public final void AEQbTJ(java.lang.String str) {
        java.lang.String quoteSymbol;
        this.EZpvd = str;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SPOT", str, null, null, 12, null) : null;
        C55915xsu c55915xsu = this.AEQbTJ;
        if (c55915xsu != null) {
            c55915xsu.EZpvd("dcd_bot", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : suggestedInstrument$default, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
        }
        C53539wnR c53539wnR = this.OLrzqt.copydefault;
        if (suggestedInstrument$default == null || (quoteSymbol = suggestedInstrument$default.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        c53539wnR.setTransferCoin(quoteSymbol);
    }

    public static final Unit AEQbTJ(C50392vMs c50392vMs, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (c50392vMs.OLrzqt.KWHzl.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c50392vMs.OLrzqt.KWHzl, false, 1, null);
        }
        c50392vMs.copydefault();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        this.OLrzqt.KWHzl.setOnTextChangeCallback(this.KWHzl);
    }

    public final void copydefault() {
        if (!KWHzl() && AEQbTJ() && EZpvd()) {
            Function1<? super java.lang.String, Unit> function1 = this.copydefault;
            if (function1 != null) {
                function1.invoke(OLrzqt());
                return;
            }
            return;
        }
        Function1<? super java.lang.String, Unit> function12 = this.copydefault;
        if (function12 != null) {
            function12.invoke("");
        }
    }

    public final boolean AEQbTJ() {
        java.lang.String tradeStepSize;
        C49957uyO c49957uyO = C49957uyO.AEQbTJ;
        java.lang.String strOLrzqt = OLrzqt();
        DcdBotQuotesDetail dcdBotQuotesDetail = this.djBIcL;
        if (dcdBotQuotesDetail == null || (tradeStepSize = dcdBotQuotesDetail.getTradeStepSize()) == null) {
            tradeStepSize = "";
        }
        java.lang.String[] strArrOLrzqt = c49957uyO.OLrzqt(strOLrzqt, tradeStepSize);
        if (strArrOLrzqt == null || strArrOLrzqt.length == 0) {
            this.OLrzqt.KWHzl.copydefault();
        } else {
            this.OLrzqt.KWHzl.setInputErrorMsg(strArrOLrzqt);
        }
        return valueOf();
    }

    public final boolean EZpvd() {
        java.lang.String strCopydefault;
        java.lang.String tradeSizeMax;
        java.lang.String alternativeCurrency;
        java.lang.String tradeSizeMin;
        java.lang.String alternativeCurrency2;
        java.lang.String strOLrzqt = OLrzqt();
        DcdBotQuotesDetail dcdBotQuotesDetail = this.djBIcL;
        java.lang.String str = "";
        if (C33129mqd.gEmmrt(strOLrzqt, dcdBotQuotesDetail != null ? dcdBotQuotesDetail.getTradeSizeMin() : null)) {
            int i = C48033uCm.Fragment.UhxbNG;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            xMR xmr = xMR.copydefault;
            DcdBotQuotesDetail dcdBotQuotesDetail2 = this.djBIcL;
            if (dcdBotQuotesDetail2 == null || (tradeSizeMin = dcdBotQuotesDetail2.getTradeSizeMin()) == null) {
                tradeSizeMin = "";
            }
            DcdBotQuotesDetail dcdBotQuotesDetail3 = this.djBIcL;
            pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.AhwBna(tradeSizeMin, C33129mqd.AhwBna(dcdBotQuotesDetail3 != null ? dcdBotQuotesDetail3.getCurrencyScale() : null)));
            DcdBotQuotesDetail dcdBotQuotesDetail4 = this.djBIcL;
            if (dcdBotQuotesDetail4 == null || (alternativeCurrency2 = dcdBotQuotesDetail4.getAlternativeCurrency()) == null) {
                alternativeCurrency2 = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("unit", alternativeCurrency2);
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        } else {
            strCopydefault = "";
        }
        DcdBotQuotesDetail dcdBotQuotesDetail5 = this.djBIcL;
        if (C33129mqd.AEQbTJ(strOLrzqt, dcdBotQuotesDetail5 != null ? dcdBotQuotesDetail5.getTradeSizeMax() : null)) {
            int i2 = C48033uCm.Fragment.ULRxlR;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            xMR xmr2 = xMR.copydefault;
            DcdBotQuotesDetail dcdBotQuotesDetail6 = this.djBIcL;
            if (dcdBotQuotesDetail6 == null || (tradeSizeMax = dcdBotQuotesDetail6.getTradeSizeMax()) == null) {
                tradeSizeMax = "";
            }
            DcdBotQuotesDetail dcdBotQuotesDetail7 = this.djBIcL;
            pairArr2[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr2.AhwBna(tradeSizeMax, C33129mqd.AhwBna(dcdBotQuotesDetail7 != null ? dcdBotQuotesDetail7.getCurrencyScale() : null)));
            DcdBotQuotesDetail dcdBotQuotesDetail8 = this.djBIcL;
            if (dcdBotQuotesDetail8 != null && (alternativeCurrency = dcdBotQuotesDetail8.getAlternativeCurrency()) != null) {
                str = alternativeCurrency;
            }
            pairArr2[1] = C56390yDp.OLrzqt("unit", str);
            strCopydefault = C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
        }
        if (strCopydefault.length() > 0) {
            this.OLrzqt.KWHzl.setInputErrorMsg(strCopydefault);
        } else {
            this.OLrzqt.KWHzl.copydefault();
        }
        return valueOf();
    }

    public final boolean KWHzl() {
        ObservableField<MaxAvailableResp> observableFieldAEQbTJ;
        MaxAvailableResp maxAvailableResp;
        java.lang.String strOLrzqt = OLrzqt();
        C55915xsu c55915xsu = this.AEQbTJ;
        boolean zAEQbTJ = C33129mqd.AEQbTJ(strOLrzqt, (c55915xsu == null || (observableFieldAEQbTJ = c55915xsu.AEQbTJ()) == null || (maxAvailableResp = observableFieldAEQbTJ.get()) == null) ? null : maxAvailableResp.getQuoteMax());
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zAEQbTJ ? 0 : 8);
        return zAEQbTJ;
    }

    public final java.lang.String OLrzqt() {
        return this.OLrzqt.KWHzl.AkhnZx();
    }

    public final boolean valueOf() {
        return this.OLrzqt.KWHzl.hDKMBd() && !KWHzl();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C56111xwe<java.lang.String> c56111xweAhwBna;
        super.onAttachedToWindow();
        AYXKKw();
        gEmmrt();
        ViewModelStoreOwner viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(this);
        if (viewModelStoreOwner != null) {
            this.AEQbTJ = (C55915xsu) new ViewModelProvider(viewModelStoreOwner).get(C55915xsu.class);
        }
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this);
        if (lifecycleOwner != null) {
            C55915xsu c55915xsu = this.AEQbTJ;
            if (c55915xsu != null && (c56111xweAhwBna = c55915xsu.AhwBna()) != null) {
                c56111xweAhwBna.observe(lifecycleOwner, new TaskDescription(new Function1() { // from class: o.vMt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C50392vMs.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
                    }
                }));
            }
            AEQbTJ(this.EZpvd);
        }
    }

    public static final Unit AEQbTJ(C50392vMs c50392vMs, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50392vMs.OLrzqt.copydefault.setFooterAvaValue(str);
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C55915xsu c55915xsu = this.AEQbTJ;
        if (c55915xsu != null) {
            c55915xsu.AYXKKw();
        }
    }
}
