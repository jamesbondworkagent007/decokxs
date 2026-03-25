package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C24085iUi extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public boolean KWHzl;
    public AbstractC23817iKk copydefault;
    public final Function0<Unit> valueOf = new Function0() { // from class: o.iUj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24085iUi.AhwBna(this.KWHzl);
        }
    };
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.iUh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C24085iUi.AYXKKw(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.iUl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C24085iUi.EZpvd(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.iUi$TaskDescription */
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

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    /* JADX INFO: renamed from: o.iUi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iUi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C24085iUi newInstance$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 1;
            }
            return actionBar.KWHzl(i);
        }

        public final C24085iUi KWHzl(int i) {
            C24085iUi c24085iUi = new C24085iUi();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type_invest", i);
            c24085iUi.setArguments(bundle);
            return c24085iUi;
        }
    }

    public static final Unit AhwBna(C24085iUi c24085iUi) {
        FragmentActivity activity = c24085iUi.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C25493ixk.FragmentManager.Swccd), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RvdRAu), null, null, null, false, 1976, null);
        }
        return Unit.INSTANCE;
    }

    private final int AEQbTJ() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int AYXKKw(C24085iUi c24085iUi) {
        android.os.Bundle arguments = c24085iUi.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final InterfaceC27093jog EZpvd() {
        return (InterfaceC27093jog) this.EZpvd.getValue();
    }

    public static final InterfaceC27093jog EZpvd(C24085iUi c24085iUi) {
        java.lang.Object obj;
        int iAEQbTJ = c24085iUi.AEQbTJ();
        if (iAEQbTJ == 3) {
            FragmentActivity fragmentActivityRequireActivity = c24085iUi.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity).get(InvestUniv3RedeemViewModel.class);
        } else if (iAEQbTJ == 5) {
            FragmentActivity fragmentActivityRequireActivity2 = c24085iUi.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            obj = new ViewModelProvider(fragmentActivityRequireActivity2).get(InvestUniv3FarmRedeemViewModel.class);
        } else {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = c24085iUi.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            obj = new ViewModelProvider(fragmentRequireParentFragment).get(InvestRedeemViewModel.class);
        }
        return (InterfaceC27093jog) obj;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.copydefault = (AbstractC23817iKk) DataBindingUtil.inflate(getCustomLayoutInflater(), C25493ixk.Activity.fXHmeK, constraintLayout, true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.GhqvEQ));
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AbstractC23817iKk abstractC23817iKk = this.copydefault;
        if (abstractC23817iKk == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk = null;
        }
        C8003auW.copydefault(abstractC23817iKk.DbNXlk).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iUo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24085iUi.EZpvd(this.AEQbTJ, obj);
            }
        });
        EZpvd().DbNXlk().observe(this, new TaskDescription(new Function1() { // from class: o.iUm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24085iUi.copydefault(this.AEQbTJ, (InvestRedeemReceiveInfoUIBean) obj);
            }
        }));
    }

    public static final void EZpvd(C24085iUi c24085iUi, java.lang.Object obj) {
        boolean z = !c24085iUi.KWHzl;
        c24085iUi.KWHzl = z;
        AbstractC23817iKk abstractC23817iKk = null;
        int i = 0;
        if (z) {
            AbstractC23817iKk abstractC23817iKk2 = c24085iUi.copydefault;
            if (abstractC23817iKk2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk2 = null;
            }
            abstractC23817iKk2.DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
            AbstractC23817iKk abstractC23817iKk3 = c24085iUi.copydefault;
            if (abstractC23817iKk3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk3 = null;
            }
            abstractC23817iKk3.DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sIqKDg));
            AbstractC23817iKk abstractC23817iKk4 = c24085iUi.copydefault;
            if (abstractC23817iKk4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23817iKk = abstractC23817iKk4;
            }
            android.widget.LinearLayout linearLayout = abstractC23817iKk.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            return;
        }
        AbstractC23817iKk abstractC23817iKk5 = c24085iUi.copydefault;
        if (abstractC23817iKk5 == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk5 = null;
        }
        abstractC23817iKk5.DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
        AbstractC23817iKk abstractC23817iKk6 = c24085iUi.copydefault;
        if (abstractC23817iKk6 == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk6 = null;
        }
        abstractC23817iKk6.DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.setPageName));
        AbstractC23817iKk abstractC23817iKk7 = c24085iUi.copydefault;
        if (abstractC23817iKk7 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23817iKk = abstractC23817iKk7;
        }
        android.widget.LinearLayout linearLayout2 = abstractC23817iKk.djBIcL;
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

    public static final Unit copydefault(C24085iUi c24085iUi, InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        Intrinsics.copydefault(investRedeemReceiveInfoUIBean);
        c24085iUi.AEQbTJ(investRedeemReceiveInfoUIBean);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(InvestRedeemReceiveInfoUIBean investRedeemReceiveInfoUIBean) {
        java.lang.String string;
        AbstractC23817iKk abstractC23817iKk = null;
        if (C33129mqd.KWHzl((java.util.Collection) investRedeemReceiveInfoUIBean.getReceiveTokenInfo())) {
            AbstractC23817iKk abstractC23817iKk2 = this.copydefault;
            if (abstractC23817iKk2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk2 = null;
            }
            abstractC23817iKk2.EZpvd.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            AbstractC23817iKk abstractC23817iKk3 = this.copydefault;
            if (abstractC23817iKk3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk3 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC23817iKk3.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            c27569jxf.AEQbTJ(linearLayout, investRedeemReceiveInfoUIBean.getReceiveTokenInfo(), investRedeemReceiveInfoUIBean.isInit(), investRedeemReceiveInfoUIBean.isDataErro(), (96 & 16) != 0 ? null : investRedeemReceiveInfoUIBean.getRedeemTips(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? false : false, (96 & 128) != 0 ? null : this.valueOf);
        } else {
            AbstractC23817iKk abstractC23817iKk4 = this.copydefault;
            if (abstractC23817iKk4 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk4 = null;
            }
            abstractC23817iKk4.EZpvd.setVisibility(8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) investRedeemReceiveInfoUIBean.getSwapToToken())) {
            AbstractC23817iKk abstractC23817iKk5 = this.copydefault;
            if (abstractC23817iKk5 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk5 = null;
            }
            abstractC23817iKk5.djBIcL.setVisibility(0);
            AbstractC23817iKk abstractC23817iKk6 = this.copydefault;
            if (abstractC23817iKk6 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk6 = null;
            }
            abstractC23817iKk6.AhwBna.setVisibility(0);
            java.lang.String strKWHzl = C27577jxn.copydefault.KWHzl(investRedeemReceiveInfoUIBean.getReceiveTokenInfo());
            java.lang.String strEZpvd = C27581jxr.EZpvd(investRedeemReceiveInfoUIBean.getSwapToToken(), investRedeemReceiveInfoUIBean.getReceiveTokenInfo());
            AbstractC23817iKk abstractC23817iKk7 = this.copydefault;
            if (abstractC23817iKk7 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk7 = null;
            }
            abstractC23817iKk7.AYXKKw.setText(C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C25493ixk.FragmentManager.GQzpsZsQwTVT, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("fromSymbol", strEZpvd), C56390yDp.OLrzqt("toSymbol", strKWHzl))));
            C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
            AbstractC23817iKk abstractC23817iKk8 = this.copydefault;
            if (abstractC23817iKk8 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk8 = null;
            }
            android.widget.LinearLayout linearLayout2 = abstractC23817iKk8.djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            c27569jxf2.OLrzqt(linearLayout2, investRedeemReceiveInfoUIBean.getSwapToToken(), investRedeemReceiveInfoUIBean.isInit(), investRedeemReceiveInfoUIBean.isDataErro(), investRedeemReceiveInfoUIBean.getRedeemTips(), this.KWHzl, true);
            if (investRedeemReceiveInfoUIBean.getSwapToToken().size() > 3) {
                AbstractC23817iKk abstractC23817iKk9 = this.copydefault;
                if (abstractC23817iKk9 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23817iKk9 = null;
                }
                abstractC23817iKk9.DbNXlk.setVisibility(0);
                if (this.KWHzl) {
                    AbstractC23817iKk abstractC23817iKk10 = this.copydefault;
                    if (abstractC23817iKk10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23817iKk10 = null;
                    }
                    abstractC23817iKk10.DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
                    AbstractC23817iKk abstractC23817iKk11 = this.copydefault;
                    if (abstractC23817iKk11 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23817iKk11 = null;
                    }
                    abstractC23817iKk11.DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sIqKDg));
                } else {
                    AbstractC23817iKk abstractC23817iKk12 = this.copydefault;
                    if (abstractC23817iKk12 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23817iKk12 = null;
                    }
                    abstractC23817iKk12.DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
                    AbstractC23817iKk abstractC23817iKk13 = this.copydefault;
                    if (abstractC23817iKk13 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23817iKk13 = null;
                    }
                    abstractC23817iKk13.DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.setPageName));
                    AbstractC23817iKk abstractC23817iKk14 = this.copydefault;
                    if (abstractC23817iKk14 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23817iKk14 = null;
                    }
                    abstractC23817iKk14.getRoot().post(new java.lang.Runnable() { // from class: o.iUg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C24085iUi.gEmmrt(this.OLrzqt);
                        }
                    });
                }
            } else {
                AbstractC23817iKk abstractC23817iKk15 = this.copydefault;
                if (abstractC23817iKk15 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23817iKk15 = null;
                }
                abstractC23817iKk15.DbNXlk.setVisibility(8);
            }
        } else {
            AbstractC23817iKk abstractC23817iKk16 = this.copydefault;
            if (abstractC23817iKk16 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk16 = null;
            }
            abstractC23817iKk16.AhwBna.setVisibility(8);
            AbstractC23817iKk abstractC23817iKk17 = this.copydefault;
            if (abstractC23817iKk17 == null) {
                Intrinsics.gEmmrt("");
                abstractC23817iKk17 = null;
            }
            abstractC23817iKk17.djBIcL.setVisibility(8);
        }
        C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
        AbstractC23817iKk abstractC23817iKk18 = this.copydefault;
        if (abstractC23817iKk18 == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk18 = null;
        }
        android.widget.ImageView imageView = abstractC23817iKk18.copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf3, imageView, investRedeemReceiveInfoUIBean.getPlatformLogo(), c27569jxf3.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        AbstractC23817iKk abstractC23817iKk19 = this.copydefault;
        if (abstractC23817iKk19 == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk19 = null;
        }
        abstractC23817iKk19.OLrzqt.setText(investRedeemReceiveInfoUIBean.getPlatformName());
        AbstractC23817iKk abstractC23817iKk20 = this.copydefault;
        if (abstractC23817iKk20 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23817iKk = abstractC23817iKk20;
        }
        android.widget.TextView textView = abstractC23817iKk.AEQbTJ;
        java.lang.Integer investmentCategory = investRedeemReceiveInfoUIBean.getInvestmentCategory();
        if (investmentCategory != null && investmentCategory.intValue() == 0) {
            string = requireContext().getString(C25493ixk.FragmentManager.DrqXHJ);
        } else {
            string = requireContext().getString(C25493ixk.FragmentManager.DQzvGN);
        }
        textView.setText(string);
    }

    /* JADX INFO: renamed from: o.iUi$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C24085iUi AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C24085iUi c24085iUi) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c24085iUi;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public static final void gEmmrt(C24085iUi c24085iUi) {
        AbstractC23817iKk abstractC23817iKk = c24085iUi.copydefault;
        AbstractC23817iKk abstractC23817iKk2 = null;
        if (abstractC23817iKk == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23817iKk.getRoot().getLayoutParams();
        AbstractC23817iKk abstractC23817iKk3 = c24085iUi.copydefault;
        if (abstractC23817iKk3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23817iKk3 = null;
        }
        layoutParams.height = abstractC23817iKk3.getRoot().getHeight();
        AbstractC23817iKk abstractC23817iKk4 = c24085iUi.copydefault;
        if (abstractC23817iKk4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23817iKk2 = abstractC23817iKk4;
        }
        abstractC23817iKk2.getRoot().setLayoutParams(layoutParams);
    }
}
