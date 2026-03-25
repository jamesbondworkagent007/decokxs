package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nVO extends AbstractC52785wYg {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nVM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nVO.AhwBna(this.copydefault));
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nVT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(nVO.AYXKKw(this.KWHzl));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nVS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(nVO.OLrzqt(this.OLrzqt));
        }
    });
    public final boolean copydefault = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52785wYg
    public boolean AhwBna() {
        return this.copydefault;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nVO.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ nVO newInstance$default(Activity activity, boolean z, int i, boolean z2, int i2, java.lang.Object obj) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return activity.OLrzqt(z, i, z2);
        }

        public final nVO OLrzqt(boolean z, int i, boolean z2) {
            nVO nvo = new nVO();
            nvo.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_IS_GROUP_FULL", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_GROUP_CAPACITY", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("KEY_IS_BANNER_ENTRY", java.lang.Boolean.valueOf(z2))));
            return nvo;
        }
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.AEQbTJ.getValue()).booleanValue();
    }

    public static final boolean AhwBna(nVO nvo) {
        android.os.Bundle arguments = nvo.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_GROUP_FULL", false);
        }
        return false;
    }

    public final boolean KWHzl() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean AYXKKw(nVO nvo) {
        android.os.Bundle arguments = nvo.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_IS_BANNER_ENTRY", false);
        }
        return false;
    }

    public final int OLrzqt() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int OLrzqt(nVO nvo) {
        android.os.Bundle arguments = nvo.getArguments();
        if (arguments != null) {
            return arguments.getInt("KEY_GROUP_CAPACITY", 0);
        }
        return 0;
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.AbstractC52785wYg
    public void AEQbTJ(@NotNull C54954xan c54954xan) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(c54954xan, "");
        c54954xan.KWHzl.setImageResource(C52761wXj.TaskDescription.NRYds);
        c54954xan.KWHzl.setImageTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        AppCompatTextView appCompatTextView = c54954xan.AEQbTJ;
        if (KWHzl()) {
            if (copydefault()) {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.finishInit);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.FYtjSf);
            }
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.FSMca);
        }
        appCompatTextView.setText(strAYXKKw);
        c54954xan.AEQbTJ.setTextSize(18.0f);
        c54954xan.OLrzqt.setText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.dlRikr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatICUNumber$default(java.lang.Integer.valueOf(OLrzqt()), null, C38307pTy.Companion.EZpvd(0), null, null, 13, null)))));
        AppCompatTextView appCompatTextView2 = c54954xan.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            marginLayoutParams.bottomMargin = C55298xhM.OLrzqt(8, contextRequireContext);
            appCompatTextView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // o.AbstractC52785wYg, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setVisibility(0);
        wyf.setType(7);
        wyf.setPrimaryText(getString(KWHzl() ? C35399nuc.LoaderManager.sIqKDg : C35399nuc.LoaderManager.fdt));
        wyf.setSecondaryText(getString(C35399nuc.LoaderManager.iwGUEr));
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new StateListAnimator(c52794wYpAEQbTJ, 1000L, this));
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ nVO EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, nVO nvo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = nvo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                FragmentKt.setFragmentResult(this.EZpvd, "INCREASE_GROUP_SIZE_REQUEST", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_INCREASE_ACCEPTED", java.lang.Boolean.TRUE), C56390yDp.OLrzqt("KEY_GROUP_CAPACITY", java.lang.Integer.valueOf(this.EZpvd.OLrzqt()))));
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ nVO AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, nVO nvo) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = nvo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
