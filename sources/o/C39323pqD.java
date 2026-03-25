package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.edit.OKEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C35966oKh;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39323pqD extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public MarketCoinInfo AhwBna;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public wYF KWHzl;
    public oMJ djBIcL;
    public java.lang.String AEQbTJ = "";
    public java.lang.String copydefault = "BTC";
    public java.lang.String valueOf = "";

    /* JADX INFO: renamed from: o.pqD$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    public C39323pqD() {
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C54822xWp.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.ui.dialog.KlineMarketDealFilterDialogFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.ui.dialog.KlineMarketDealFilterDialogFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.ui.dialog.KlineMarketDealFilterDialogFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    private final C54822xWp EZpvd() {
        return (C54822xWp) this.AYXKKw.getValue();
    }

    /* JADX INFO: renamed from: o.pqD$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C39323pqD newInstance$default(ActionBar actionBar, java.lang.String str, MarketCoinInfo marketCoinInfo, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            return actionBar.OLrzqt(str, marketCoinInfo, str2);
        }

        public final C39323pqD OLrzqt(@NotNull java.lang.String str, @NotNull MarketCoinInfo marketCoinInfo, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(marketCoinInfo, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C39323pqD c39323pqD = new C39323pqD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("filter_data", str2);
            bundle.putString("filter_dialog_title", str);
            bundle.putParcelable("coin_pair_name", marketCoinInfo);
            c39323pqD.setArguments(bundle);
            return c39323pqD;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
        android.os.Bundle arguments = getArguments();
        java.lang.String strValueOf = java.lang.String.valueOf(arguments != null ? arguments.getString("filter_dialog_title", "BTC") : null);
        this.copydefault = strValueOf;
        c52781wYc.setTitle(C33069mpW.copydefault(this, C35964oKf.Fragment.OKvQBs, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strValueOf))));
    }

    @Override // o.wXX
    public void onCreateFooter(@NotNull ConstraintLayout constraintLayout) {
        C52794wYp c52794wYpCopydefault;
        C52794wYp c52794wYpAEQbTJ;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateFooter(constraintLayout);
        android.content.Context context = constraintLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        wYF wyf = new wYF(context, null, 2, null);
        wyf.setType(14);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(getString(C35964oKf.Fragment.OHsvZP));
        wyf.setSecondaryText(getString(C35966oKh.TaskDescription.copydefault));
        this.KWHzl = wyf;
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToTop = 0;
        layoutParams.startToStart = 0;
        layoutParams.endToEnd = 0;
        layoutParams.bottomToBottom = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(wyf, layoutParams);
        wYF wyf2 = this.KWHzl;
        if (wyf2 != null && (c52794wYpAEQbTJ = wyf2.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.pqJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39323pqD.AEQbTJ(this.KWHzl, view);
                }
            });
        }
        wYF wyf3 = this.KWHzl;
        if (wyf3 == null || (c52794wYpCopydefault = wyf3.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.pqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C39323pqD.KWHzl(this.AEQbTJ, view);
            }
        });
    }

    public static final void AEQbTJ(C39323pqD c39323pqD, android.view.View view) {
        c39323pqD.dismiss();
    }

    public static final void KWHzl(C39323pqD c39323pqD, android.view.View view) {
        Function1<? super java.lang.String, Unit> function1;
        OKEditText oKEditText;
        OKEditText oKEditText2;
        oMJ omj = c39323pqD.djBIcL;
        android.text.Editable text = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((omj == null || (oKEditText2 = omj.copydefault) == null) ? null : oKEditText2.getText())) && (function1 = c39323pqD.EZpvd) != null) {
            oMJ omj2 = c39323pqD.djBIcL;
            if (omj2 != null && (oKEditText = omj2.copydefault) != null) {
                text = oKEditText.getText();
            }
            function1.invoke(java.lang.String.valueOf(text));
        }
        c39323pqD.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        OKEditText oKEditText;
        OKEditText oKEditText2;
        android.widget.TextView textView;
        oMJ omj;
        OKEditText oKEditText3;
        java.lang.String instrumentId;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = (oMJ) DataBindingUtil.inflate(getCustomLayoutInflater(), C35964oKf.Application.aKErDB, constraintLayout, true);
        android.os.Bundle arguments = getArguments();
        this.AhwBna = arguments != null ? (MarketCoinInfo) arguments.getParcelable("coin_pair_name") : null;
        android.os.Bundle arguments2 = getArguments();
        this.valueOf = java.lang.String.valueOf(arguments2 != null ? arguments2.getString("filter_data", "") : null);
        MarketCoinInfo marketCoinInfo = this.AhwBna;
        if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) (marketCoinInfo != null ? marketCoinInfo.getInstrumentType() : null))) {
            MarketCoinInfo marketCoinInfo2 = this.AhwBna;
            if (marketCoinInfo2 != null && (instrumentId = marketCoinInfo2.getInstrumentId()) != null) {
                strOLrzqt = xVE.copydefault.OLrzqt(instrumentId);
            }
            this.AEQbTJ = java.lang.String.valueOf(strOLrzqt);
        } else {
            C48914uef c48914uef = C48914uef.EZpvd;
            MarketCoinInfo marketCoinInfo3 = this.AhwBna;
            java.lang.String instrumentId2 = marketCoinInfo3 != null ? marketCoinInfo3.getInstrumentId() : null;
            MarketCoinInfo marketCoinInfo4 = this.AhwBna;
            this.AEQbTJ = C48914uef.getTitleByIdAndType$default(c48914uef, instrumentId2, marketCoinInfo4 != null ? marketCoinInfo4.getInstrumentType() : null, false, false, null, false, false, 124, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.valueOf) && (omj = this.djBIcL) != null && (oKEditText3 = omj.copydefault) != null) {
            oKEditText3.setText(this.valueOf);
        }
        oMJ omj2 = this.djBIcL;
        if (omj2 != null && (textView = omj2.OLrzqt) != null) {
            textView.setText(this.AEQbTJ);
        }
        EZpvd().djBIcL().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.pqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39323pqD.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        oMJ omj3 = this.djBIcL;
        if (omj3 != null && (oKEditText2 = omj3.copydefault) != null) {
            oKEditText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.pqI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    C39323pqD.KWHzl(this.OLrzqt, view, z);
                }
            });
        }
        oMJ omj4 = this.djBIcL;
        if (omj4 == null || (oKEditText = omj4.copydefault) == null) {
            return;
        }
        C33606mzd.AEQbTJ(oKEditText, new Function1() { // from class: o.pqH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39323pqD.OLrzqt(this.AEQbTJ, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit copydefault(C39323pqD c39323pqD, java.lang.String str) {
        oMJ omj;
        android.widget.TextView textView;
        oMJ omj2;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        if (Intrinsics.EZpvd((java.lang.Object) c39323pqD.EZpvd().AhwBna().getValue(), (java.lang.Object) "--")) {
            oMJ omj3 = c39323pqD.djBIcL;
            if (omj3 != null && (textView4 = omj3.EZpvd) != null) {
                textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
        } else {
            java.lang.String value = c39323pqD.EZpvd().AhwBna().getValue();
            if (value != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) value, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
                android.content.Context context = c39323pqD.getContext();
                if (context != null && (omj2 = c39323pqD.djBIcL) != null && (textView2 = omj2.EZpvd) != null) {
                    textView2.setTextColor(C33508mxl.AEQbTJ(context));
                }
            } else {
                android.content.Context context2 = c39323pqD.getContext();
                if (context2 != null && (omj = c39323pqD.djBIcL) != null && (textView = omj.EZpvd) != null) {
                    textView.setTextColor(C33508mxl.copydefault(context2));
                }
            }
        }
        oMJ omj4 = c39323pqD.djBIcL;
        if (omj4 != null && (textView3 = omj4.EZpvd) != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            textView3.setText(pTB.formatLocalized$default(str, null, 1, null));
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C39323pqD c39323pqD, android.view.View view, boolean z) {
        OKEditText oKEditText;
        OKEditText oKEditText2;
        if (z) {
            oMJ omj = c39323pqD.djBIcL;
            if (omj == null || (oKEditText2 = omj.copydefault) == null) {
                return;
            }
            oKEditText2.setBackground(c39323pqD.getResources().getDrawable(C35964oKf.Activity.QUSxYX));
            return;
        }
        oMJ omj2 = c39323pqD.djBIcL;
        if (omj2 == null || (oKEditText = omj2.copydefault) == null) {
            return;
        }
        oKEditText.setBackground(c39323pqD.getResources().getDrawable(C35964oKf.Activity.QVAiDq));
    }

    public static final Unit OLrzqt(C39323pqD c39323pqD, java.lang.CharSequence charSequence) {
        OKEditText oKEditText;
        android.widget.TextView textView;
        OKEditText oKEditText2;
        OKEditText oKEditText3;
        android.widget.TextView textView2;
        OKEditText oKEditText4;
        android.widget.TextView textView3;
        if (C33129mqd.djBIcL(charSequence) <= 0.0f && C33129mqd.OLrzqt(charSequence)) {
            oMJ omj = c39323pqD.djBIcL;
            if (omj != null && (textView3 = omj.AEQbTJ) != null) {
                textView3.setVisibility(0);
            }
            oMJ omj2 = c39323pqD.djBIcL;
            if (omj2 != null && (oKEditText4 = omj2.copydefault) != null) {
                oKEditText4.setBackground(c39323pqD.getResources().getDrawable(C35964oKf.Activity.QbewEr));
            }
        } else {
            oMJ omj3 = c39323pqD.djBIcL;
            if (omj3 != null && (oKEditText2 = omj3.copydefault) != null && oKEditText2.isFocused()) {
                oMJ omj4 = c39323pqD.djBIcL;
                if (omj4 != null && (textView2 = omj4.AEQbTJ) != null) {
                    textView2.setVisibility(8);
                }
                oMJ omj5 = c39323pqD.djBIcL;
                if (omj5 != null && (oKEditText3 = omj5.copydefault) != null) {
                    oKEditText3.setBackground(c39323pqD.getResources().getDrawable(C35964oKf.Activity.QUSxYX));
                }
            } else {
                oMJ omj6 = c39323pqD.djBIcL;
                if (omj6 != null && (textView = omj6.AEQbTJ) != null) {
                    textView.setVisibility(8);
                }
                oMJ omj7 = c39323pqD.djBIcL;
                if (omj7 != null && (oKEditText = omj7.copydefault) != null) {
                    oKEditText.setBackground(c39323pqD.getResources().getDrawable(C35964oKf.Activity.QVAiDq));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.pqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39323pqD.KWHzl(this.EZpvd);
            }
        });
    }

    public static final void KWHzl(C39323pqD c39323pqD) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39323pqD, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }
}
