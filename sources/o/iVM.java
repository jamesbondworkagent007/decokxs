package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iVM extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public boolean EZpvd;
    public AbstractC23831iKy KWHzl;
    public final Function0<Unit> AEQbTJ = new Function0() { // from class: o.iVK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iVM.OLrzqt(this.EZpvd);
        }
    };
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.iVR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(iVM.copydefault(this.OLrzqt));
        }
    });

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ iVM newInstance$default(ActionBar actionBar, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return actionBar.KWHzl(investSubscriptionReceiveInfoUIBean, i);
        }

        public final iVM KWHzl(@NotNull InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean, int i) {
            Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
            iVM ivm = new iVM();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("type_invest", i);
            bundle.putParcelable("key.trx_process_data", investSubscriptionReceiveInfoUIBean);
            ivm.setArguments(bundle);
            return ivm;
        }
    }

    public static final Unit OLrzqt(iVM ivm) {
        FragmentActivity activity = ivm.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C25493ixk.FragmentManager.Swccd), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RvdRAu), null, null, null, false, 1976, null);
        }
        return Unit.INSTANCE;
    }

    public static final int copydefault(iVM ivm) {
        android.os.Bundle arguments = ivm.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.KWHzl = (AbstractC23831iKy) DataBindingUtil.inflate(getCustomLayoutInflater(), C25493ixk.Activity.iPSTqm, constraintLayout, true);
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
        AbstractC23831iKy abstractC23831iKy = this.KWHzl;
        if (abstractC23831iKy == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy = null;
        }
        C8003auW.copydefault(abstractC23831iKy.AkhnZx).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iVM.copydefault(this.KWHzl, obj);
            }
        });
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean = (InvestSubscriptionReceiveInfoUIBean) arguments.getParcelable("key.trx_process_data");
            if (investSubscriptionReceiveInfoUIBean == null) {
                throw new java.lang.IllegalArgumentException("data is null");
            }
            AEQbTJ(investSubscriptionReceiveInfoUIBean);
        }
    }

    public static final void copydefault(iVM ivm, java.lang.Object obj) {
        boolean z = !ivm.EZpvd;
        ivm.EZpvd = z;
        AbstractC23831iKy abstractC23831iKy = null;
        int i = 0;
        if (z) {
            AbstractC23831iKy abstractC23831iKy2 = ivm.KWHzl;
            if (abstractC23831iKy2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy2 = null;
            }
            abstractC23831iKy2.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
            AbstractC23831iKy abstractC23831iKy3 = ivm.KWHzl;
            if (abstractC23831iKy3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy3 = null;
            }
            abstractC23831iKy3.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zKcAg));
            AbstractC23831iKy abstractC23831iKy4 = ivm.KWHzl;
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
        AbstractC23831iKy abstractC23831iKy5 = ivm.KWHzl;
        if (abstractC23831iKy5 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy5 = null;
        }
        abstractC23831iKy5.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
        AbstractC23831iKy abstractC23831iKy6 = ivm.KWHzl;
        if (abstractC23831iKy6 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy6 = null;
        }
        abstractC23831iKy6.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zqTOFw));
        AbstractC23831iKy abstractC23831iKy7 = ivm.KWHzl;
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

    private final void AEQbTJ(InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        java.lang.String string;
        AbstractC23831iKy abstractC23831iKy = null;
        if (investSubscriptionReceiveInfoUIBean.getInvestWithToken() != null) {
            AbstractC23831iKy abstractC23831iKy2 = this.KWHzl;
            if (abstractC23831iKy2 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy2 = null;
            }
            abstractC23831iKy2.AhwBna.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            AbstractC23831iKy abstractC23831iKy3 = this.KWHzl;
            if (abstractC23831iKy3 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy3 = null;
            }
            android.widget.LinearLayout linearLayout = abstractC23831iKy3.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            c27569jxf.OLrzqt(linearLayout, investSubscriptionReceiveInfoUIBean.getInvestWithToken(), investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), (96 & 16) != 0 ? null : investSubscriptionReceiveInfoUIBean.getTipsBean(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? false : false);
            if (C33129mqd.KWHzl((java.util.Collection) investSubscriptionReceiveInfoUIBean.getSwapToToken())) {
                AbstractC23831iKy abstractC23831iKy4 = this.KWHzl;
                if (abstractC23831iKy4 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy4 = null;
                }
                abstractC23831iKy4.djBIcL.setVisibility(0);
                AbstractC23831iKy abstractC23831iKy5 = this.KWHzl;
                if (abstractC23831iKy5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy5 = null;
                }
                abstractC23831iKy5.KWHzl.setVisibility(0);
                AbstractC23831iKy abstractC23831iKy6 = this.KWHzl;
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
                c27569jxf.AEQbTJ(linearLayout2, arrayList, investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), investSubscriptionReceiveInfoUIBean.getTipsBean(), this.EZpvd, true, this.AEQbTJ);
                if (investSubscriptionReceiveInfoUIBean.getTipsBean().getTipsType() == 1 && investSubscriptionReceiveInfoUIBean.getSwapToToken().size() > 1) {
                    AbstractC23831iKy abstractC23831iKy7 = this.KWHzl;
                    if (abstractC23831iKy7 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy7 = null;
                    }
                    abstractC23831iKy7.valueOf.setVisibility(0);
                    C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
                    AbstractC23831iKy abstractC23831iKy8 = this.KWHzl;
                    if (abstractC23831iKy8 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy8 = null;
                    }
                    android.widget.TextView textView = abstractC23831iKy8.valueOf;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    c27569jxf2.KWHzl(textView, C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, C27491jwG.AEQbTJ(investSubscriptionReceiveInfoUIBean.getSwapToToken(), new Function1() { // from class: o.iVN
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return iVM.KWHzl((InvestTokenWithAmount) obj);
                        }
                    }), null, null, null, 14, null), investSubscriptionReceiveInfoUIBean.getTipsBean().getValueOffset());
                    AbstractC23831iKy abstractC23831iKy9 = this.KWHzl;
                    if (abstractC23831iKy9 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy9 = null;
                    }
                    C8003auW.copydefault(abstractC23831iKy9.valueOf).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iVP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            iVM.OLrzqt(this.OLrzqt, obj);
                        }
                    });
                }
                if (investSubscriptionReceiveInfoUIBean.getSwapToToken().size() > 3) {
                    AbstractC23831iKy abstractC23831iKy10 = this.KWHzl;
                    if (abstractC23831iKy10 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy10 = null;
                    }
                    abstractC23831iKy10.AkhnZx.setVisibility(0);
                    if (this.EZpvd) {
                        AbstractC23831iKy abstractC23831iKy11 = this.KWHzl;
                        if (abstractC23831iKy11 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy11 = null;
                        }
                        abstractC23831iKy11.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
                        AbstractC23831iKy abstractC23831iKy12 = this.KWHzl;
                        if (abstractC23831iKy12 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy12 = null;
                        }
                        abstractC23831iKy12.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zKcAg));
                    } else {
                        AbstractC23831iKy abstractC23831iKy13 = this.KWHzl;
                        if (abstractC23831iKy13 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy13 = null;
                        }
                        abstractC23831iKy13.AkhnZx.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
                        AbstractC23831iKy abstractC23831iKy14 = this.KWHzl;
                        if (abstractC23831iKy14 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy14 = null;
                        }
                        abstractC23831iKy14.AkhnZx.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zqTOFw));
                        AbstractC23831iKy abstractC23831iKy15 = this.KWHzl;
                        if (abstractC23831iKy15 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23831iKy15 = null;
                        }
                        abstractC23831iKy15.getRoot().post(new java.lang.Runnable() { // from class: o.iVQ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                iVM.AYXKKw(this.OLrzqt);
                            }
                        });
                    }
                } else {
                    AbstractC23831iKy abstractC23831iKy16 = this.KWHzl;
                    if (abstractC23831iKy16 == null) {
                        Intrinsics.gEmmrt("");
                        abstractC23831iKy16 = null;
                    }
                    abstractC23831iKy16.AkhnZx.setVisibility(8);
                }
            } else {
                AbstractC23831iKy abstractC23831iKy17 = this.KWHzl;
                if (abstractC23831iKy17 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy17 = null;
                }
                abstractC23831iKy17.djBIcL.setVisibility(8);
                AbstractC23831iKy abstractC23831iKy18 = this.KWHzl;
                if (abstractC23831iKy18 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23831iKy18 = null;
                }
                abstractC23831iKy18.KWHzl.setVisibility(8);
            }
        } else {
            AbstractC23831iKy abstractC23831iKy19 = this.KWHzl;
            if (abstractC23831iKy19 == null) {
                Intrinsics.gEmmrt("");
                abstractC23831iKy19 = null;
            }
            abstractC23831iKy19.AhwBna.setVisibility(8);
        }
        C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
        AbstractC23831iKy abstractC23831iKy20 = this.KWHzl;
        if (abstractC23831iKy20 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy20 = null;
        }
        android.widget.ImageView imageView = abstractC23831iKy20.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf3, imageView, investSubscriptionReceiveInfoUIBean.getPlatformLogo(), c27569jxf3.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        AbstractC23831iKy abstractC23831iKy21 = this.KWHzl;
        if (abstractC23831iKy21 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy21 = null;
        }
        abstractC23831iKy21.AEQbTJ.setText(investSubscriptionReceiveInfoUIBean.getPlatformName());
        AbstractC23831iKy abstractC23831iKy22 = this.KWHzl;
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

    public static final java.lang.String KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getCurrencyAmount();
    }

    public static final void OLrzqt(iVM ivm, java.lang.Object obj) {
        ivm.AEQbTJ.invoke();
    }

    public static final void AYXKKw(iVM ivm) {
        AbstractC23831iKy abstractC23831iKy = ivm.KWHzl;
        AbstractC23831iKy abstractC23831iKy2 = null;
        if (abstractC23831iKy == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy = null;
        }
        ViewGroup.LayoutParams layoutParams = abstractC23831iKy.getRoot().getLayoutParams();
        AbstractC23831iKy abstractC23831iKy3 = ivm.KWHzl;
        if (abstractC23831iKy3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23831iKy3 = null;
        }
        layoutParams.height = abstractC23831iKy3.getRoot().getHeight();
        AbstractC23831iKy abstractC23831iKy4 = ivm.KWHzl;
        if (abstractC23831iKy4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23831iKy2 = abstractC23831iKy4;
        }
        abstractC23831iKy2.getRoot().setLayoutParams(layoutParams);
    }
}
