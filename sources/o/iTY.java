package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iTY extends iTL {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public StateListAnimator AEQbTJ;
    public ProductDetailsUserTradeAction EZpvd;
    public final boolean KWHzl;
    public java.lang.Long OLrzqt = 0L;

    /* JADX INFO: loaded from: classes15.dex */
    public interface StateListAnimator {
        void EZpvd(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(ProductDetailsUserTradeAction productDetailsUserTradeAction) {
        this.EZpvd = productDetailsUserTradeAction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateListAnimator OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.Long l) {
        this.OLrzqt = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public android.view.View copydefault(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.iTL
    public boolean djBIcL() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsUserTradeAction gEmmrt() {
        return this.EZpvd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iTY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ iTY newInstance$default(ActionBar actionBar, java.lang.String str, int i, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, StateListAnimator stateListAnimator, int i2, java.lang.Object obj) {
            ProductDetailsUserTradeAction productDetailsUserTradeAction2 = (i2 & 4) != 0 ? null : productDetailsUserTradeAction;
            if ((i2 & 8) != 0) {
                l = 0L;
            }
            return actionBar.OLrzqt(str, i, productDetailsUserTradeAction2, l, (i2 & 16) != 0 ? null : stateListAnimator);
        }

        public final iTY OLrzqt(@NotNull java.lang.String str, int i, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l, StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(str, "");
            iTY ity = new iTY();
            ity.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("rate", str), C56390yDp.OLrzqt("rateType", java.lang.Integer.valueOf(i))));
            ity.KWHzl(productDetailsUserTradeAction);
            ity.OLrzqt(l);
            ity.copydefault(stateListAnimator);
            return ity;
        }
    }

    public final java.lang.String copydefault() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString("rate");
        }
        return null;
    }

    public final int KWHzl() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("rateType", -1);
        }
        return -1;
    }

    @Override // o.iTL
    public android.view.View OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        iJX ijxEZpvd = iJX.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ijxEZpvd, "");
        int iKWHzl = KWHzl();
        if (iKWHzl == 0) {
            string = getString(C25493ixk.FragmentManager.hlXVux);
        } else if (iKWHzl == 1) {
            string = getString(C25493ixk.FragmentManager.processStrongAuthMessage);
        } else {
            android.widget.LinearLayout root = ijxEZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            return root;
        }
        Intrinsics.copydefault((java.lang.Object) string);
        ijxEZpvd.OLrzqt.setText(C33069mpW.copydefault(this, C25493ixk.FragmentManager.wlaJM, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("ratetype", string), C56390yDp.OLrzqt("num", C27492jwH.formatRatePercentWithoutPercentageSign$default(C27492jwH.OLrzqt, copydefault(), false, 2, null)))));
        C52794wYp c52794wYp = ijxEZpvd.AEQbTJ;
        c52794wYp.setOnClickListener(new Activity(c52794wYp, 1000L, this));
        C52794wYp c52794wYp2 = ijxEZpvd.copydefault;
        c52794wYp2.setOnClickListener(new TaskDescription(c52794wYp2, 1000L, this));
        android.widget.LinearLayout root2 = ijxEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "");
        return root2;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ iTY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, iTY ity) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = ity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.dismiss();
                StateListAnimator stateListAnimatorOLrzqt = this.copydefault.OLrzqt();
                if (stateListAnimatorOLrzqt != null) {
                    stateListAnimatorOLrzqt.EZpvd(this.copydefault.gEmmrt(), this.copydefault.EZpvd());
                }
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ iTY AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, iTY ity) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = ity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismiss();
            }
        }
    }
}
