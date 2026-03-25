package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iUI extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public boolean AEQbTJ;
    public AbstractC23831iKy OLrzqt;
    public final Function0<Unit> djBIcL = new Function0() { // from class: o.iUK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iUI.djBIcL(this.KWHzl);
        }
    };
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iUM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(iUI.valueOf(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iUO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iUI.AEQbTJ(this.KWHzl);
        }
    });

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ iUI newInstance$default(StateListAnimator stateListAnimator, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return stateListAnimator.OLrzqt(i);
        }

        public final iUI OLrzqt(int i) {
            iUI iui = new iUI();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type_invest", i);
            iui.setArguments(bundle);
            return iui;
        }
    }

    public static final Unit djBIcL(iUI iui) {
        FragmentActivity activity = iui.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C25493ixk.FragmentManager.Swccd), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RvdRAu), null, null, null, false, 1976, null);
        }
        return Unit.INSTANCE;
    }

    private final int EZpvd() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int valueOf(iUI iui) {
        android.os.Bundle arguments = iui.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final InterfaceC27095joi KWHzl() {
        return (InterfaceC27095joi) this.copydefault.getValue();
    }

    public static final InterfaceC27095joi AEQbTJ(iUI iui) {
        java.lang.Object obj;
        int iEZpvd = iui.EZpvd();
        if (iEZpvd == 2) {
            FragmentActivity fragmentActivityRequireActivity = iui.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity).get(InvestUniv3SubscribeViewModel.class);
        } else if (iEZpvd == 4) {
            FragmentActivity fragmentActivityRequireActivity2 = iui.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity2).get(InvestUniv3FarmSubscribeViewModel.class);
        } else {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = iui.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            obj = new ViewModelProvider(fragmentRequireParentFragment).get(InvestSubscriptionNewViewModel.class);
        }
        return (InterfaceC27095joi) obj;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.OLrzqt = (AbstractC23831iKy) DataBindingUtil.inflate(getCustomLayoutInflater(), C25493ixk.Activity.iPSTqm, constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.invokespecialROgMPW));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC23831iKy abstractC23831iKy = this.OLrzqt;
        if (abstractC23831iKy == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy = null;
        }
        C8003auW.copydefault(abstractC23831iKy.AkhnZx).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iUI.copydefault(this.OLrzqt, obj);
            }
        });
        KWHzl().AkhnZx().observe(this, new Application(new Function1() { // from class: o.iUG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iUI.AEQbTJ(this.AEQbTJ, (InvestSubscriptionReceiveInfoUIBean) obj);
            }
        }));
    }

    public static final void copydefault(iUI iui, java.lang.Object obj) {
        boolean z = !iui.AEQbTJ;
        iui.AEQbTJ = z;
        AbstractC23831iKy abstractC23831iKy = null;
        int i = 0;
        if (z) {
            AbstractC23831iKy abstractC23831iKy2 = iui.OLrzqt;
            if (abstractC23831iKy2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy2 = null;
            }
            abstractC23831iKy2.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
            AbstractC23831iKy abstractC23831iKy3 = iui.OLrzqt;
            if (abstractC23831iKy3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy3 = null;
            }
            abstractC23831iKy3.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zKcAg));
            AbstractC23831iKy abstractC23831iKy4 = iui.OLrzqt;
            if (abstractC23831iKy4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23831iKy = abstractC23831iKy4;
            }
            android.widget.LinearLayout linearLayout = abstractC23831iKy.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            return;
        }
        AbstractC23831iKy abstractC23831iKy5 = iui.OLrzqt;
        if (abstractC23831iKy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy5 = null;
        }
        abstractC23831iKy5.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
        AbstractC23831iKy abstractC23831iKy6 = iui.OLrzqt;
        if (abstractC23831iKy6 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy6 = null;
        }
        abstractC23831iKy6.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zqTOFw));
        AbstractC23831iKy abstractC23831iKy7 = iui.OLrzqt;
        if (abstractC23831iKy7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23831iKy = abstractC23831iKy7;
        }
        android.widget.LinearLayout linearLayout2 = abstractC23831iKy.KWHzl;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        for (android.view.View view : ViewGroupKt.getChildren(linearLayout2)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.view.View view2 = view;
            if (i > 2) {
                view2.setVisibility(8);
            }
            i++;
        }
    }

    public static final Unit AEQbTJ(iUI iui, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        Intrinsics.copydefault(investSubscriptionReceiveInfoUIBean);
        iui.EZpvd(investSubscriptionReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    public final void EZpvd(InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        java.lang.String string;
        AbstractC23831iKy abstractC23831iKy = null;
        if (investSubscriptionReceiveInfoUIBean.getInvestWithToken() != null) {
            AbstractC23831iKy abstractC23831iKy2 = this.OLrzqt;
            if (abstractC23831iKy2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy2 = null;
            }
            abstractC23831iKy2.AhwBna.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            AbstractC23831iKy abstractC23831iKy3 = this.OLrzqt;
            if (abstractC23831iKy3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy3 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC23831iKy3.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            c27569jxf.OLrzqt(linearLayout, investSubscriptionReceiveInfoUIBean.getInvestWithToken(), investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), (96 & 16) != 0 ? null : investSubscriptionReceiveInfoUIBean.getTipsBean(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? false : false);
            if (C33129mqd.KWHzl((java.util.Collection) investSubscriptionReceiveInfoUIBean.getSwapToToken())) {
                AbstractC23831iKy abstractC23831iKy4 = this.OLrzqt;
                if (abstractC23831iKy4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy4 = null;
                }
                abstractC23831iKy4.djBIcL.setVisibility(0);
                AbstractC23831iKy abstractC23831iKy5 = this.OLrzqt;
                if (abstractC23831iKy5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy5 = null;
                }
                abstractC23831iKy5.KWHzl.setVisibility(0);
                AbstractC23831iKy abstractC23831iKy6 = this.OLrzqt;
                if (abstractC23831iKy6 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy6 = null;
                }
                android.widget.LinearLayout linearLayout2 = abstractC23831iKy6.KWHzl;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                java.util.List<InvestTokenWithAmount> swapToToken = investSubscriptionReceiveInfoUIBean.getSwapToToken();
                Intrinsics.copydefault(swapToToken);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(swapToToken, 10));
                for (InvestTokenWithAmount investTokenWithAmount : swapToToken) {
                    arrayList.add(new InvestTokenWithAmount(0L, investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getCurrencyAmount(), false, false, (java.lang.String) null, investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getTokenLogo(), (java.lang.String) null, investTokenWithAmount.getTokenSymbol(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268434745, (DefaultConstructorMarker) null));
                }
                c27569jxf.AEQbTJ(linearLayout2, arrayList, investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), investSubscriptionReceiveInfoUIBean.getTipsBean(), this.AEQbTJ, true, this.djBIcL);
                if (investSubscriptionReceiveInfoUIBean.getTipsBean().getTipsType() == 1 && investSubscriptionReceiveInfoUIBean.getSwapToToken().size() > 1) {
                    AbstractC23831iKy abstractC23831iKy7 = this.OLrzqt;
                    if (abstractC23831iKy7 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy7 = null;
                    }
                    abstractC23831iKy7.valueOf.setVisibility(0);
                    C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
                    AbstractC23831iKy abstractC23831iKy8 = this.OLrzqt;
                    if (abstractC23831iKy8 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy8 = null;
                    }
                    android.widget.TextView textView = abstractC23831iKy8.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    c27569jxf2.KWHzl(textView, C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, C27491jwG.AEQbTJ(investSubscriptionReceiveInfoUIBean.getSwapToToken(), new Function1() { // from class: o.iUL
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return iUI.EZpvd((InvestTokenWithAmount) obj);
                        }
                    }), null, null, null, 14, null), investSubscriptionReceiveInfoUIBean.getTipsBean().getValueOffset());
                    AbstractC23831iKy abstractC23831iKy9 = this.OLrzqt;
                    if (abstractC23831iKy9 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy9 = null;
                    }
                    C8003auW.copydefault(abstractC23831iKy9.valueOf).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iUN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            iUI.AEQbTJ(this.EZpvd, obj);
                        }
                    });
                }
                if (investSubscriptionReceiveInfoUIBean.getSwapToToken().size() > 3) {
                    AbstractC23831iKy abstractC23831iKy10 = this.OLrzqt;
                    if (abstractC23831iKy10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy10 = null;
                    }
                    abstractC23831iKy10.AkhnZx.setVisibility(0);
                    if (this.AEQbTJ) {
                        AbstractC23831iKy abstractC23831iKy11 = this.OLrzqt;
                        if (abstractC23831iKy11 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy11 = null;
                        }
                        abstractC23831iKy11.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
                        AbstractC23831iKy abstractC23831iKy12 = this.OLrzqt;
                        if (abstractC23831iKy12 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy12 = null;
                        }
                        abstractC23831iKy12.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zKcAg));
                    } else {
                        AbstractC23831iKy abstractC23831iKy13 = this.OLrzqt;
                        if (abstractC23831iKy13 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy13 = null;
                        }
                        abstractC23831iKy13.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
                        AbstractC23831iKy abstractC23831iKy14 = this.OLrzqt;
                        if (abstractC23831iKy14 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy14 = null;
                        }
                        abstractC23831iKy14.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zqTOFw));
                        AbstractC23831iKy abstractC23831iKy15 = this.OLrzqt;
                        if (abstractC23831iKy15 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy15 = null;
                        }
                        abstractC23831iKy15.getRoot().post(new java.lang.Runnable() { // from class: o.iUP
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                iUI.gEmmrt(this.AEQbTJ);
                            }
                        });
                    }
                } else {
                    AbstractC23831iKy abstractC23831iKy16 = this.OLrzqt;
                    if (abstractC23831iKy16 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy16 = null;
                    }
                    abstractC23831iKy16.AkhnZx.setVisibility(8);
                }
            } else {
                AbstractC23831iKy abstractC23831iKy17 = this.OLrzqt;
                if (abstractC23831iKy17 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy17 = null;
                }
                abstractC23831iKy17.djBIcL.setVisibility(8);
                AbstractC23831iKy abstractC23831iKy18 = this.OLrzqt;
                if (abstractC23831iKy18 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy18 = null;
                }
                abstractC23831iKy18.KWHzl.setVisibility(8);
            }
        } else {
            AbstractC23831iKy abstractC23831iKy19 = this.OLrzqt;
            if (abstractC23831iKy19 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy19 = null;
            }
            abstractC23831iKy19.AhwBna.setVisibility(8);
        }
        C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
        AbstractC23831iKy abstractC23831iKy20 = this.OLrzqt;
        if (abstractC23831iKy20 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy20 = null;
        }
        android.widget.ImageView imageView = abstractC23831iKy20.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf3, imageView, investSubscriptionReceiveInfoUIBean.getPlatformLogo(), c27569jxf3.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        AbstractC23831iKy abstractC23831iKy21 = this.OLrzqt;
        if (abstractC23831iKy21 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy21 = null;
        }
        abstractC23831iKy21.AEQbTJ.setText(investSubscriptionReceiveInfoUIBean.getPlatformName());
        AbstractC23831iKy abstractC23831iKy22 = this.OLrzqt;
        if (abstractC23831iKy22 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23831iKy = abstractC23831iKy22;
        }
        android.widget.TextView textView2 = abstractC23831iKy.EZpvd;
        java.lang.Integer investmentCategory = investSubscriptionReceiveInfoUIBean.getInvestmentCategory();
        if (investmentCategory != null && investmentCategory.intValue() == 0) {
            string = requireContext().getString(C25493ixk.FragmentManager.DrqXHJ);
        } else {
            string = requireContext().getString(C25493ixk.FragmentManager.DQzvGN);
        }
        textView2.setText(string);
    }

    public static final java.lang.String EZpvd(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getCurrencyAmount();
    }

    public static final void AEQbTJ(iUI iui, java.lang.Object obj) {
        iui.djBIcL.invoke();
    }

    public static final void gEmmrt(iUI iui) {
        AbstractC23831iKy abstractC23831iKy = iui.OLrzqt;
        AbstractC23831iKy abstractC23831iKy2 = null;
        if (abstractC23831iKy == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23831iKy.getRoot().getLayoutParams();
        AbstractC23831iKy abstractC23831iKy3 = iui.OLrzqt;
        if (abstractC23831iKy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy3 = null;
        }
        layoutParams.height = abstractC23831iKy3.getRoot().getHeight();
        AbstractC23831iKy abstractC23831iKy4 = iui.OLrzqt;
        if (abstractC23831iKy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23831iKy2 = abstractC23831iKy4;
        }
        abstractC23831iKy2.getRoot().setLayoutParams(layoutParams);
    }
}
