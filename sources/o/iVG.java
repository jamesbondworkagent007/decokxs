package o;

import android.view.View;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class iVG extends wXX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public AbstractC23817iKk AEQbTJ;
    public boolean KWHzl;
    public final Function0<Unit> djBIcL = new Function0() { // from class: o.iVH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iVG.AYXKKw(this.AEQbTJ);
        }
    };
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.iVL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(iVG.valueOf(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iVI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(iVG.OLrzqt(this.KWHzl));
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull AbstractC23817iKk abstractC23817iKk) {
        Intrinsics.checkNotNullParameter(abstractC23817iKk, "");
        this.AEQbTJ = abstractC23817iKk;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iVG.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ iVG newInstance$default(ActionBar actionBar, InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 1;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            return actionBar.KWHzl(investSubscriptionReceiveInfoUIBean, i, z);
        }

        public final iVG KWHzl(@NotNull InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean, int i, boolean z) {
            Intrinsics.checkNotNullParameter(investSubscriptionReceiveInfoUIBean, "");
            iVG ivg = new iVG();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.redeem_path", investSubscriptionReceiveInfoUIBean);
            bundle.putInt("type_invest", i);
            bundle.putBoolean("key.is_zap_enabled", z);
            ivg.setArguments(bundle);
            return ivg;
        }
    }

    public final AbstractC23817iKk AEQbTJ() {
        AbstractC23817iKk abstractC23817iKk = this.AEQbTJ;
        if (abstractC23817iKk != null) {
            return abstractC23817iKk;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit AYXKKw(iVG ivg) {
        FragmentActivity activity = ivg.getActivity();
        if (activity != null) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, activity, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DQYQgr), C33070mpX.AYXKKw(C25493ixk.FragmentManager.Swccd), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RvdRAu), null, null, null, false, 1976, null);
        }
        return Unit.INSTANCE;
    }

    public static final int valueOf(iVG ivg) {
        android.os.Bundle arguments = ivg.getArguments();
        if (arguments != null) {
            return arguments.getInt("type_invest");
        }
        return 0;
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean OLrzqt(iVG ivg) {
        android.os.Bundle arguments = ivg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key.is_zap_enabled", false);
        }
        return false;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        EZpvd((AbstractC23817iKk) DataBindingUtil.inflate(getCustomLayoutInflater(), C25493ixk.Activity.fXHmeK, constraintLayout, true));
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.GhqvEQ));
        wxq.AEQbTJ().setVisibility(0);
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(false);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C8003auW.copydefault(AEQbTJ().DbNXlk).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.iVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                iVG.KWHzl(this.KWHzl, obj);
            }
        });
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean = (InvestSubscriptionReceiveInfoUIBean) arguments.getParcelable("key.redeem_path");
            if (investSubscriptionReceiveInfoUIBean == null) {
                throw new java.lang.IllegalArgumentException("data is null");
            }
            EZpvd(investSubscriptionReceiveInfoUIBean);
        }
    }

    public static final void KWHzl(iVG ivg, java.lang.Object obj) {
        boolean z = !ivg.KWHzl;
        ivg.KWHzl = z;
        int i = 0;
        if (z) {
            ivg.AEQbTJ().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
            ivg.AEQbTJ().DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sIqKDg));
            android.widget.LinearLayout linearLayout = ivg.AEQbTJ().djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
            while (it.hasNext()) {
                it.next().setVisibility(0);
            }
            return;
        }
        ivg.AEQbTJ().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
        ivg.AEQbTJ().DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.setPageName));
        android.widget.LinearLayout linearLayout2 = ivg.AEQbTJ().djBIcL;
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

    private final void EZpvd(InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBean) {
        java.util.List<InvestTokenWithAmount> investWithToken;
        java.util.List<InvestTokenWithAmount> swapToToken;
        if (KWHzl()) {
            investWithToken = investSubscriptionReceiveInfoUIBean.getSwapToToken();
        } else {
            investWithToken = investSubscriptionReceiveInfoUIBean.getInvestWithToken();
        }
        java.util.List<InvestTokenWithAmount> list = investWithToken;
        if (KWHzl()) {
            swapToToken = investSubscriptionReceiveInfoUIBean.getInvestWithToken();
        } else {
            swapToToken = investSubscriptionReceiveInfoUIBean.getSwapToToken();
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            AEQbTJ().EZpvd.setVisibility(0);
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            android.widget.LinearLayout linearLayout = AEQbTJ().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            Intrinsics.copydefault(list);
            c27569jxf.AEQbTJ(linearLayout, list, investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), (96 & 16) != 0 ? null : investSubscriptionReceiveInfoUIBean.getTipsBean(), (96 & 32) != 0 ? false : false, (96 & 64) != 0 ? false : false, (96 & 128) != 0 ? null : this.djBIcL);
        } else {
            AEQbTJ().EZpvd.setVisibility(8);
        }
        if (C33129mqd.KWHzl((java.util.Collection) swapToToken)) {
            AEQbTJ().valueOf.setVisibility(0);
            AEQbTJ().djBIcL.setVisibility(0);
            AEQbTJ().AhwBna.setVisibility(0);
            C27569jxf c27569jxf2 = C27569jxf.OLrzqt;
            android.widget.LinearLayout linearLayout2 = AEQbTJ().djBIcL;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            Intrinsics.copydefault(swapToToken);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(swapToToken, 10));
            for (InvestTokenWithAmount investTokenWithAmount : swapToToken) {
                arrayList.add(new InvestTokenWithAmount(0L, investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getCurrencyAmount(), false, false, (java.lang.String) null, investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getTokenLogo(), (java.lang.String) null, investTokenWithAmount.getTokenSymbol(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Integer) null, (ButtonType) null, (java.lang.String) null, (java.lang.String) null, (InvestTokenType) null, (java.lang.Long) null, (java.lang.Long) null, 0, (java.lang.String) null, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 268434745, (DefaultConstructorMarker) null));
            }
            c27569jxf2.OLrzqt(linearLayout2, arrayList, investSubscriptionReceiveInfoUIBean.isInit(), investSubscriptionReceiveInfoUIBean.isDataErro(), investSubscriptionReceiveInfoUIBean.getTipsBean(), this.KWHzl, true);
            if (swapToToken.size() > 3) {
                AEQbTJ().DbNXlk.setVisibility(0);
                if (this.KWHzl) {
                    AEQbTJ().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.QKDJJA, 0);
                    AEQbTJ().DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.sIqKDg));
                } else {
                    AEQbTJ().DbNXlk.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C52761wXj.TaskDescription.getAdvertisingId, 0);
                    AEQbTJ().DbNXlk.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.setPageName));
                    AEQbTJ().getRoot().post(new java.lang.Runnable() { // from class: o.iVD
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            iVG.djBIcL(this.AEQbTJ);
                        }
                    });
                }
            } else {
                AEQbTJ().DbNXlk.setVisibility(8);
            }
        } else {
            AEQbTJ().valueOf.setVisibility(8);
        }
        C27569jxf c27569jxf3 = C27569jxf.OLrzqt;
        android.widget.ImageView imageView = AEQbTJ().copydefault;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C27569jxf.loadCircleWithBorder$default(c27569jxf3, imageView, investSubscriptionReceiveInfoUIBean.getPlatformLogo(), c27569jxf3.EZpvd(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
        AEQbTJ().OLrzqt.setText(investSubscriptionReceiveInfoUIBean.getPlatformName());
        AEQbTJ().AEQbTJ.setText(C33070mpX.AYXKKw(C25493ixk.FragmentManager.getValue));
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ iVG KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, iVG ivg) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = ivg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    public static final void djBIcL(iVG ivg) {
        ViewGroup.LayoutParams layoutParams = ivg.AEQbTJ().getRoot().getLayoutParams();
        layoutParams.height = ivg.AEQbTJ().getRoot().getHeight();
        ivg.AEQbTJ().getRoot().setLayoutParams(layoutParams);
    }
}
