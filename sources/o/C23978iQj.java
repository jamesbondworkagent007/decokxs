package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.business.invest_biz.ui.widget.LeftRightInputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iQj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23978iQj extends iSY {
    public AbstractC23851iLr KWHzl;
    public iHH OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.iQq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C23978iQj.AhwBna(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iQp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C23978iQj.EZpvd(this.OLrzqt);
        }
    });
    public final Function2<C55001xbh, java.lang.String, Unit> djBIcL = new Function2() { // from class: o.iQr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C23978iQj.KWHzl(this.KWHzl, (C55001xbh) obj, (java.lang.String) obj2);
        }
    };
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.iQw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C23978iQj.copydefault(this.OLrzqt);
        }
    });

    /* JADX INFO: renamed from: o.iQj$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iQj.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C23978iQj newInstance$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return actionBar.AEQbTJ(i);
        }

        public final C23978iQj AEQbTJ(int i) {
            C23978iQj c23978iQj = new C23978iQj();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type_invest", i);
            c23978iQj.setArguments(bundle);
            return c23978iQj;
        }
    }

    private final int AYXKKw() {
        return ((java.lang.Number) this.AhwBna.getValue()).intValue();
    }

    public static final int AhwBna(C23978iQj c23978iQj) {
        android.os.Bundle arguments = c23978iQj.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final InterfaceC27096joj copydefault() {
        return (InterfaceC27096joj) this.copydefault.getValue();
    }

    public static final InterfaceC27096joj EZpvd(C23978iQj c23978iQj) {
        java.lang.Object obj;
        int iAYXKKw = c23978iQj.AYXKKw();
        if (iAYXKKw == 0) {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = c23978iQj.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            obj = new ViewModelProvider(fragmentRequireParentFragment).get(InvestSubscriptionNewViewModel.class);
        } else if (iAYXKKw == 2) {
            FragmentActivity fragmentActivityRequireActivity = c23978iQj.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity).get(InvestUniv3SubscribeViewModel.class);
        } else if (iAYXKKw == 3) {
            FragmentActivity fragmentActivityRequireActivity2 = c23978iQj.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity2).get(InvestUniv3RedeemViewModel.class);
        } else if (iAYXKKw == 4) {
            FragmentActivity fragmentActivityRequireActivity3 = c23978iQj.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity3).get(InvestUniv3FarmSubscribeViewModel.class);
        } else if (iAYXKKw == 5) {
            FragmentActivity fragmentActivityRequireActivity4 = c23978iQj.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity4, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity4).get(InvestUniv3FarmRedeemViewModel.class);
        } else if (iAYXKKw == 6) {
            androidx.fragment.app.Fragment fragmentRequireParentFragment2 = c23978iQj.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment2, "");
            obj = new ViewModelProvider(fragmentRequireParentFragment2).get(AbstractC24170iXm.class);
        } else {
            androidx.fragment.app.Fragment fragmentRequireParentFragment3 = c23978iQj.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment3, "");
            obj = new ViewModelProvider(fragmentRequireParentFragment3).get(InvestRedeemViewModel.class);
        }
        return (InterfaceC27096joj) obj;
    }

    public static final Unit KWHzl(C23978iQj c23978iQj, C55001xbh c55001xbh, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c55001xbh, "");
        Intrinsics.checkNotNullParameter(str, "");
        c23978iQj.copydefault().copydefault(str, false);
        c23978iQj.OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final InvestSlippageConfig copydefault(C23978iQj c23978iQj) {
        InvestGasPriceConfig value = c23978iQj.copydefault().OLrzqt().getValue();
        if (value != null) {
            return value.getInvestSlippage();
        }
        return null;
    }

    public final InvestSlippageConfig EZpvd() {
        return (InvestSlippageConfig) this.EZpvd.getValue();
    }

    @Override // o.iSY
    public void copydefault(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.OLrzqt = (iHH) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.OcIXYQ, viewGroup, true);
    }

    @Override // o.C57662yme, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C32113mPz.Dialog.QUSxYX);
    }

    @Override // o.iSY, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd(true);
        isConnected();
        fetchVPNInfo();
        DbNXlk();
    }

    @Override // o.iSY
    public void OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        this.KWHzl = (AbstractC23851iLr) DataBindingUtil.inflate(layoutInflater, C25493ixk.Activity.hrjNmC, viewGroup, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void isConnected() {
        InvestConsumeData<java.lang.String> investConsumeDataKWHzl;
        AbstractC23851iLr abstractC23851iLr = this.KWHzl;
        iHH ihh = null;
        if (abstractC23851iLr == null) {
            Intrinsics.gEmmrt("");
            abstractC23851iLr = null;
        }
        abstractC23851iLr.AEQbTJ.setVisibility(8);
        AbstractC23748iHw abstractC23748iHwDjBIcL = djBIcL();
        if (abstractC23748iHwDjBIcL != null) {
            abstractC23748iHwDjBIcL.fetchVPNInfo.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialDPHOMC));
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.widget.TextView textView = abstractC23748iHwDjBIcL.fetchVPNInfo;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C27569jxf.setCompoundDrawablesRelative$default(c27569jxf, textView, C52761wXj.TaskDescription.GGlJim, C33070mpX.OLrzqt(C32113mPz.StateListAnimator.AkhnZx), true, null, abstractC23748iHwDjBIcL.fetchVPNInfo.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.QOLQEE), 16, null);
            abstractC23748iHwDjBIcL.fetchVPNInfo.setOnClickListener(new View.OnClickListener() { // from class: o.iQs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C23978iQj.KWHzl(this.EZpvd, view);
                }
            });
        }
        kotlin.Pair<java.lang.String, java.lang.Boolean> pairDjBIcL = copydefault().djBIcL();
        java.lang.String strComponent1 = pairDjBIcL.component1();
        java.lang.Boolean boolComponent2 = pairDjBIcL.component2();
        iHH ihh2 = this.OLrzqt;
        if (ihh2 == null) {
            Intrinsics.gEmmrt("");
            ihh2 = null;
        }
        ihh2.gEmmrt.setInputFilters(new android.text.InputFilter[]{new C57711yna(1)});
        iHH ihh3 = this.OLrzqt;
        if (ihh3 == null) {
            Intrinsics.gEmmrt("");
            ihh3 = null;
        }
        LeftRightInputData leftRightInputDataCopydefault = ihh3.gEmmrt.copydefault();
        leftRightInputDataCopydefault.setLable(C23952iPk.KWHzl("%"));
        InvestSlippageConfig investSlippageConfigEZpvd = EZpvd();
        if (investSlippageConfigEZpvd != null) {
            int i = C25493ixk.FragmentManager.NRYds;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("value1", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getType() == 2 ? investSlippageConfigEZpvd.getAutomaticSlippage() : investSlippageConfigEZpvd.getCustomWarn(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null));
            pairArr[1] = C56390yDp.OLrzqt("value2", C27492jwH.OLrzqt.gEmmrt(investSlippageConfigEZpvd.getCustomMax()));
            investConsumeDataKWHzl = C23952iPk.KWHzl(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            if (investConsumeDataKWHzl == null) {
                investConsumeDataKWHzl = C23952iPk.KWHzl("0.1~50");
            }
        }
        leftRightInputDataCopydefault.setHint(investConsumeDataKWHzl);
        iHH ihh4 = this.OLrzqt;
        if (ihh4 == null) {
            Intrinsics.gEmmrt("");
            ihh4 = null;
        }
        ihh4.gEmmrt.setContentData(leftRightInputDataCopydefault);
        iHH ihh5 = this.OLrzqt;
        if (ihh5 == null) {
            Intrinsics.gEmmrt("");
            ihh5 = null;
        }
        C27302jsd c27302jsd = ihh5.gEmmrt;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        c27302jsd.setTradeInputContent(Intrinsics.EZpvd(boolComponent2, bool) ? pTB.formatLocalized$default(C33129mqd.mulS$default(strComponent1, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null) : "");
        if (Intrinsics.EZpvd(boolComponent2, bool)) {
            OLrzqt();
            setCustomEditText$default(this, false, 1, null);
        } else {
            KWHzl();
        }
        iHH ihh6 = this.OLrzqt;
        if (ihh6 == null) {
            Intrinsics.gEmmrt("");
            ihh6 = null;
        }
        ihh6.gEmmrt.EZpvd(this.djBIcL);
        iHH ihh7 = this.OLrzqt;
        if (ihh7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihh = ihh7;
        }
        ihh.gEmmrt.setOnFocusChangeCallback(new Function2() { // from class: o.iQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C23978iQj.copydefault(this.OLrzqt, (C27302jsd) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        });
    }

    public static final void KWHzl(C23978iQj c23978iQj, android.view.View view) {
        FragmentActivity activity = c23978iQj.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, null, null, android.view.LayoutInflater.from(activity).inflate(C25493ixk.Activity.getNewProxyInstance, (android.view.ViewGroup) null), false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.fsw), null, null, null, false, 1974, null);
        }
    }

    public static final Unit copydefault(C23978iQj c23978iQj, C27302jsd c27302jsd, boolean z) {
        Intrinsics.checkNotNullParameter(c27302jsd, "");
        c23978iQj.OLrzqt(z);
        return Unit.INSTANCE;
    }

    @Override // o.iSY, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        iHH ihh = this.OLrzqt;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        ihh.gEmmrt.copydefault(this.djBIcL);
    }

    public final void OLrzqt() {
        iHH ihh = this.OLrzqt;
        iHH ihh2 = null;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        ConstraintLayout constraintLayout = ihh.EZpvd;
        iHH ihh3 = this.OLrzqt;
        if (ihh3 == null) {
            Intrinsics.gEmmrt("");
            ihh3 = null;
        }
        constraintLayout.setBackground(ContextCompat.getDrawable(ihh3.EZpvd.getContext(), C25493ixk.StateListAnimator.AubY));
        iHH ihh4 = this.OLrzqt;
        if (ihh4 == null) {
            Intrinsics.gEmmrt("");
            ihh4 = null;
        }
        ConstraintLayout constraintLayout2 = ihh4.KWHzl;
        iHH ihh5 = this.OLrzqt;
        if (ihh5 == null) {
            Intrinsics.gEmmrt("");
            ihh5 = null;
        }
        constraintLayout2.setBackground(ContextCompat.getDrawable(ihh5.EZpvd.getContext(), C25493ixk.StateListAnimator.AuCTelauCTel));
        iHH ihh6 = this.OLrzqt;
        if (ihh6 == null) {
            Intrinsics.gEmmrt("");
            ihh6 = null;
        }
        ihh6.KWHzl.setDescendantFocusability(393216);
        iHH ihh7 = this.OLrzqt;
        if (ihh7 == null) {
            Intrinsics.gEmmrt("");
            ihh7 = null;
        }
        ihh7.gEmmrt.setVisibility(0);
        iHH ihh8 = this.OLrzqt;
        if (ihh8 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihh2 = ihh8;
        }
        ihh2.KWHzl.setDescendantFocusability(131072);
    }

    public final void KWHzl() {
        iHH ihh = this.OLrzqt;
        iHH ihh2 = null;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        ConstraintLayout constraintLayout = ihh.EZpvd;
        iHH ihh3 = this.OLrzqt;
        if (ihh3 == null) {
            Intrinsics.gEmmrt("");
            ihh3 = null;
        }
        constraintLayout.setBackground(ContextCompat.getDrawable(ihh3.EZpvd.getContext(), C25493ixk.StateListAnimator.AuCTelauCTel));
        iHH ihh4 = this.OLrzqt;
        if (ihh4 == null) {
            Intrinsics.gEmmrt("");
            ihh4 = null;
        }
        ConstraintLayout constraintLayout2 = ihh4.KWHzl;
        iHH ihh5 = this.OLrzqt;
        if (ihh5 == null) {
            Intrinsics.gEmmrt("");
            ihh5 = null;
        }
        constraintLayout2.setBackground(ContextCompat.getDrawable(ihh5.EZpvd.getContext(), C25493ixk.StateListAnimator.AubY));
        iHH ihh6 = this.OLrzqt;
        if (ihh6 == null) {
            Intrinsics.gEmmrt("");
            ihh6 = null;
        }
        ihh6.gEmmrt.setVisibility(8);
        iHH ihh7 = this.OLrzqt;
        if (ihh7 == null) {
            Intrinsics.gEmmrt("");
            ihh7 = null;
        }
        ihh7.valueOf.setVisibility(8);
        iHH ihh8 = this.OLrzqt;
        if (ihh8 == null) {
            Intrinsics.gEmmrt("");
            ihh8 = null;
        }
        ihh8.gEmmrt.KWHzl();
        iHH ihh9 = this.OLrzqt;
        if (ihh9 == null) {
            Intrinsics.gEmmrt("");
            ihh9 = null;
        }
        C27302jsd c27302jsd = ihh9.gEmmrt;
        iHH ihh10 = this.OLrzqt;
        if (ihh10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihh2 = ihh10;
        }
        c27302jsd.setBackground(ContextCompat.getDrawable(ihh2.gEmmrt.getContext(), C25493ixk.StateListAnimator.uzCIH));
    }

    public static /* synthetic */ void setCustomEditText$default(C23978iQj c23978iQj, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c23978iQj.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        iHH ihh = null;
        if (z) {
            iHH ihh2 = this.OLrzqt;
            if (ihh2 == null) {
                Intrinsics.gEmmrt("");
                ihh2 = null;
            }
            C27302jsd c27302jsd = ihh2.gEmmrt;
            iHH ihh3 = this.OLrzqt;
            if (ihh3 == null) {
                Intrinsics.gEmmrt("");
                ihh3 = null;
            }
            c27302jsd.setBackground(ContextCompat.getDrawable(ihh3.gEmmrt.getContext(), C25493ixk.StateListAnimator.zLjUOn));
        } else {
            iHH ihh4 = this.OLrzqt;
            if (ihh4 == null) {
                Intrinsics.gEmmrt("");
                ihh4 = null;
            }
            C27302jsd c27302jsd2 = ihh4.gEmmrt;
            iHH ihh5 = this.OLrzqt;
            if (ihh5 == null) {
                Intrinsics.gEmmrt("");
                ihh5 = null;
            }
            c27302jsd2.setBackground(ContextCompat.getDrawable(ihh5.gEmmrt.getContext(), C25493ixk.StateListAnimator.uzCIH));
        }
        iHH ihh6 = this.OLrzqt;
        if (ihh6 == null) {
            Intrinsics.gEmmrt("");
            ihh6 = null;
        }
        java.lang.String content = ihh6.gEmmrt.copydefault().getContent();
        if (content.length() == 0) {
            AbstractC23851iLr abstractC23851iLr = this.KWHzl;
            if (abstractC23851iLr == null) {
                Intrinsics.gEmmrt("");
                abstractC23851iLr = null;
            }
            abstractC23851iLr.KWHzl.setEnabled(false);
            iHH ihh7 = this.OLrzqt;
            if (ihh7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihh = ihh7;
            }
            ihh.valueOf.setVisibility(8);
            return;
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(content, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        InvestSlippageConfig investSlippageConfigEZpvd = EZpvd();
        if (investSlippageConfigEZpvd != null) {
            if (investSlippageConfigEZpvd.getType() == 2) {
                if (C33129mqd.AEQbTJ(strDivS$default, investSlippageConfigEZpvd.getCustomMax())) {
                    AbstractC23851iLr abstractC23851iLr2 = this.KWHzl;
                    if (abstractC23851iLr2 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23851iLr2 = null;
                    }
                    abstractC23851iLr2.KWHzl.setEnabled(false);
                    iHH ihh8 = this.OLrzqt;
                    if (ihh8 == null) {
                        Intrinsics.gEmmrt("");
                        ihh8 = null;
                    }
                    C27302jsd c27302jsd3 = ihh8.gEmmrt;
                    iHH ihh9 = this.OLrzqt;
                    if (ihh9 == null) {
                        Intrinsics.gEmmrt("");
                        ihh9 = null;
                    }
                    c27302jsd3.setBackground(ContextCompat.getDrawable(ihh9.gEmmrt.getContext(), C25493ixk.StateListAnimator.getNewProxyInstance));
                    iHH ihh10 = this.OLrzqt;
                    if (ihh10 == null) {
                        Intrinsics.gEmmrt("");
                        ihh10 = null;
                    }
                    android.widget.TextView textView = ihh10.valueOf;
                    textView.setVisibility(0);
                    textView.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.gAnGwV, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getCustomMax(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)))));
                    textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                    return;
                }
                if (C33129mqd.gEmmrt(strDivS$default, investSlippageConfigEZpvd.getAutomaticValue())) {
                    AbstractC23851iLr abstractC23851iLr3 = this.KWHzl;
                    if (abstractC23851iLr3 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23851iLr3 = null;
                    }
                    abstractC23851iLr3.KWHzl.setEnabled(false);
                    iHH ihh11 = this.OLrzqt;
                    if (ihh11 == null) {
                        Intrinsics.gEmmrt("");
                        ihh11 = null;
                    }
                    C27302jsd c27302jsd4 = ihh11.gEmmrt;
                    iHH ihh12 = this.OLrzqt;
                    if (ihh12 == null) {
                        Intrinsics.gEmmrt("");
                        ihh12 = null;
                    }
                    c27302jsd4.setBackground(ContextCompat.getDrawable(ihh12.gEmmrt.getContext(), C25493ixk.StateListAnimator.getNewProxyInstance));
                    iHH ihh13 = this.OLrzqt;
                    if (ihh13 == null) {
                        Intrinsics.gEmmrt("");
                        ihh13 = null;
                    }
                    android.widget.TextView textView2 = ihh13.valueOf;
                    textView2.setVisibility(0);
                    textView2.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.drbYRJ, C56424yEw.gEmmrt(C56390yDp.OLrzqt("slippageTolerance", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getAutomaticValue(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)), C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getCustomMax(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)))));
                    textView2.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                    return;
                }
                if (!C33129mqd.AhwBna(strDivS$default, investSlippageConfigEZpvd.getCustomMax()) || !C33129mqd.OLrzqt(investSlippageConfigEZpvd.getAutomaticValue(), investSlippageConfigEZpvd.getCustomMax())) {
                    AbstractC23851iLr abstractC23851iLr4 = this.KWHzl;
                    if (abstractC23851iLr4 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23851iLr4 = null;
                    }
                    abstractC23851iLr4.KWHzl.setEnabled(true);
                    iHH ihh14 = this.OLrzqt;
                    if (ihh14 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        ihh = ihh14;
                    }
                    ihh.valueOf.setVisibility(8);
                    return;
                }
                AbstractC23851iLr abstractC23851iLr5 = this.KWHzl;
                if (abstractC23851iLr5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23851iLr5 = null;
                }
                abstractC23851iLr5.KWHzl.setEnabled(false);
                iHH ihh15 = this.OLrzqt;
                if (ihh15 == null) {
                    Intrinsics.gEmmrt("");
                    ihh15 = null;
                }
                C27302jsd c27302jsd5 = ihh15.gEmmrt;
                iHH ihh16 = this.OLrzqt;
                if (ihh16 == null) {
                    Intrinsics.gEmmrt("");
                    ihh16 = null;
                }
                c27302jsd5.setBackground(ContextCompat.getDrawable(ihh16.gEmmrt.getContext(), C25493ixk.StateListAnimator.getNewProxyInstance));
                iHH ihh17 = this.OLrzqt;
                if (ihh17 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    ihh = ihh17;
                }
                android.widget.TextView textView3 = ihh.valueOf;
                textView3.setVisibility(0);
                textView3.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.zFtALg, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", "50"))));
                textView3.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                return;
            }
            if (C33129mqd.gEmmrt(strDivS$default, investSlippageConfigEZpvd.getCustomWarn())) {
                AbstractC23851iLr abstractC23851iLr6 = this.KWHzl;
                if (abstractC23851iLr6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23851iLr6 = null;
                }
                abstractC23851iLr6.KWHzl.setEnabled(false);
                iHH ihh18 = this.OLrzqt;
                if (ihh18 == null) {
                    Intrinsics.gEmmrt("");
                    ihh18 = null;
                }
                C27302jsd c27302jsd6 = ihh18.gEmmrt;
                iHH ihh19 = this.OLrzqt;
                if (ihh19 == null) {
                    Intrinsics.gEmmrt("");
                    ihh19 = null;
                }
                c27302jsd6.setBackground(ContextCompat.getDrawable(ihh19.gEmmrt.getContext(), C25493ixk.StateListAnimator.getNewProxyInstance));
                iHH ihh20 = this.OLrzqt;
                if (ihh20 == null) {
                    Intrinsics.gEmmrt("");
                    ihh20 = null;
                }
                android.widget.TextView textView4 = ihh20.valueOf;
                textView4.setVisibility(0);
                textView4.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.FYtjSf, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getCustomWarn(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)))));
                textView4.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                return;
            }
            if (C33129mqd.AEQbTJ(strDivS$default, investSlippageConfigEZpvd.getAutomaticValue()) && C33129mqd.copydefault(strDivS$default, investSlippageConfigEZpvd.getCustomSafe()) && C33129mqd.valueOf(strDivS$default, investSlippageConfigEZpvd.getCustomMax())) {
                AbstractC23851iLr abstractC23851iLr7 = this.KWHzl;
                if (abstractC23851iLr7 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23851iLr7 = null;
                }
                abstractC23851iLr7.KWHzl.setEnabled(true);
                iHH ihh21 = this.OLrzqt;
                if (ihh21 == null) {
                    Intrinsics.gEmmrt("");
                    ihh21 = null;
                }
                android.widget.TextView textView5 = ihh21.valueOf;
                textView5.setVisibility(0);
                textView5.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.fdt, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(content, null, 1, null)))));
                textView5.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv));
                return;
            }
            if (C33129mqd.AEQbTJ(strDivS$default, investSlippageConfigEZpvd.getCustomMax())) {
                AbstractC23851iLr abstractC23851iLr8 = this.KWHzl;
                if (abstractC23851iLr8 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23851iLr8 = null;
                }
                abstractC23851iLr8.KWHzl.setEnabled(false);
                iHH ihh22 = this.OLrzqt;
                if (ihh22 == null) {
                    Intrinsics.gEmmrt("");
                    ihh22 = null;
                }
                C27302jsd c27302jsd7 = ihh22.gEmmrt;
                iHH ihh23 = this.OLrzqt;
                if (ihh23 == null) {
                    Intrinsics.gEmmrt("");
                    ihh23 = null;
                }
                c27302jsd7.setBackground(ContextCompat.getDrawable(ihh23.gEmmrt.getContext(), C25493ixk.StateListAnimator.getNewProxyInstance));
                iHH ihh24 = this.OLrzqt;
                if (ihh24 == null) {
                    Intrinsics.gEmmrt("");
                    ihh24 = null;
                }
                android.widget.TextView textView6 = ihh24.valueOf;
                textView6.setVisibility(0);
                textView6.setText(C33069mpW.copydefault(C25493ixk.FragmentManager.finishInit, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd.getCustomMax(), 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)))));
                textView6.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.HJWChPUUMfbK));
                return;
            }
            if (!C33129mqd.copydefault(strDivS$default, investSlippageConfigEZpvd.getCustomWarn()) || !C33129mqd.gEmmrt(strDivS$default, investSlippageConfigEZpvd.getAutomaticValue())) {
                AbstractC23851iLr abstractC23851iLr9 = this.KWHzl;
                if (abstractC23851iLr9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23851iLr9 = null;
                }
                abstractC23851iLr9.KWHzl.setEnabled(true);
                iHH ihh25 = this.OLrzqt;
                if (ihh25 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    ihh = ihh25;
                }
                ihh.valueOf.setVisibility(8);
                return;
            }
            AbstractC23851iLr abstractC23851iLr10 = this.KWHzl;
            if (abstractC23851iLr10 == null) {
                Intrinsics.gEmmrt("");
                abstractC23851iLr10 = null;
            }
            abstractC23851iLr10.KWHzl.setEnabled(true);
            iHH ihh26 = this.OLrzqt;
            if (ihh26 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihh = ihh26;
            }
            android.widget.TextView textView7 = ihh.valueOf;
            textView7.setVisibility(0);
            textView7.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.FSMca));
            textView7.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv));
        }
    }

    private final void DbNXlk() {
        iHH ihh = this.OLrzqt;
        AbstractC23851iLr abstractC23851iLr = null;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault = C8003auW.copydefault(ihh.EZpvd);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        abstractC58247yxgCopydefault.throttleFirst(500L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.iQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23978iQj.OLrzqt(this.KWHzl, obj);
            }
        });
        iHH ihh2 = this.OLrzqt;
        if (ihh2 == null) {
            Intrinsics.gEmmrt("");
            ihh2 = null;
        }
        C8003auW.copydefault(ihh2.KWHzl).throttleFirst(500L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.iQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23978iQj.KWHzl(this.KWHzl, obj);
            }
        });
        AbstractC23851iLr abstractC23851iLr2 = this.KWHzl;
        if (abstractC23851iLr2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23851iLr = abstractC23851iLr2;
        }
        AbstractC58247yxg<java.lang.Object> abstractC58247yxgCopydefault2 = C8003auW.copydefault(abstractC23851iLr.KWHzl);
        Intrinsics.checkNotNullExpressionValue(abstractC58247yxgCopydefault2, "");
        C58156yvv.copydefault(abstractC58247yxgCopydefault2, this).throttleFirst(500L, timeUnit).subscribe(new InterfaceC58227yxM() { // from class: o.iQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C23978iQj.djBIcL(this.KWHzl, obj);
            }
        });
    }

    public static final void OLrzqt(C23978iQj c23978iQj, java.lang.Object obj) {
        AbstractC23851iLr abstractC23851iLr = c23978iQj.KWHzl;
        if (abstractC23851iLr == null) {
            Intrinsics.gEmmrt("");
            abstractC23851iLr = null;
        }
        if (!abstractC23851iLr.KWHzl.isEnabled()) {
            iHH ihh = c23978iQj.OLrzqt;
            if (ihh == null) {
                Intrinsics.gEmmrt("");
                ihh = null;
            }
            ihh.gEmmrt.setTradeInputContent("");
        }
        c23978iQj.KWHzl();
        AbstractC23851iLr abstractC23851iLr2 = c23978iQj.KWHzl;
        if (abstractC23851iLr2 == null) {
            Intrinsics.gEmmrt("");
            abstractC23851iLr2 = null;
        }
        abstractC23851iLr2.KWHzl.setEnabled(true);
        InvestSlippageConfig investSlippageConfigEZpvd = c23978iQj.EZpvd();
        java.lang.String automaticValue = investSlippageConfigEZpvd != null ? investSlippageConfigEZpvd.getAutomaticValue() : null;
        c23978iQj.copydefault().copydefault(C33129mqd.OLrzqt((java.lang.CharSequence) automaticValue) ? C33129mqd.mulS$default(automaticValue, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null) : "", true);
    }

    public static final void KWHzl(C23978iQj c23978iQj, java.lang.Object obj) {
        iHH ihh = c23978iQj.OLrzqt;
        iHH ihh2 = null;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        if (ihh.gEmmrt.getVisibility() == 8) {
            c23978iQj.OLrzqt();
            setCustomEditText$default(c23978iQj, false, 1, null);
            InterfaceC27096joj interfaceC27096jojCopydefault = c23978iQj.copydefault();
            iHH ihh3 = c23978iQj.OLrzqt;
            if (ihh3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihh2 = ihh3;
            }
            interfaceC27096jojCopydefault.copydefault(ihh2.gEmmrt.copydefault().getContent(), false);
        }
    }

    public static final void djBIcL(C23978iQj c23978iQj, java.lang.Object obj) {
        c23978iQj.copydefault().fARcdN();
        c23978iQj.copydefault().copydefault().setValue(C23952iPk.KWHzl(java.lang.Boolean.FALSE));
        c23978iQj.dismissAllowingStateLoss();
    }

    private final void fetchVPNInfo() {
        iHH ihh = this.OLrzqt;
        if (ihh == null) {
            Intrinsics.gEmmrt("");
            ihh = null;
        }
        android.widget.TextView textView = ihh.copydefault;
        int i = C25493ixk.FragmentManager.UJEglR;
        InvestSlippageConfig investSlippageConfigEZpvd = EZpvd();
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pTB.formatLocalized$default(C33129mqd.mulS$default(investSlippageConfigEZpvd != null ? investSlippageConfigEZpvd.getAutomaticValue() : null, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null), null, 1, null)))));
        ihh.AEQbTJ.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.dlRikr));
        ihh.AhwBna.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DuXjdv));
        ihh.OLrzqt.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sVvuFk));
    }
}
