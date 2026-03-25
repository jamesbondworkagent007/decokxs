package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes16.dex */
public final class nTY extends AbstractC52780wYb {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final boolean OLrzqt;
    public boolean copydefault;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.nUa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(nTY.AYXKKw());
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.nTZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(nTY.KWHzl());
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.nUc
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nTY.djBIcL(this.copydefault);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.nUg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nTY.copydefault(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.nUh
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return nTY.OLrzqt(this.copydefault);
        }
    });
    public final java.lang.String AhwBna = C33070mpX.AYXKKw(C35399nuc.LoaderManager.aWJMta);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Ljava/lang/CharSequence; */
    @Override // o.AbstractC52780wYb
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    public final int AkhnZx() {
        return ((java.lang.Number) this.valueOf.getValue()).intValue();
    }

    public static final int AYXKKw() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV);
    }

    public final int valueOf() {
        return ((java.lang.Number) this.AEQbTJ.getValue()).intValue();
    }

    public static final int KWHzl() {
        return C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
    }

    public final android.widget.ScrollView AhwBna() {
        return (android.widget.ScrollView) this.gEmmrt.getValue();
    }

    public static final android.widget.ScrollView djBIcL(nTY nty) {
        android.widget.ScrollView scrollView = new android.widget.ScrollView(nty.requireContext());
        scrollView.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        scrollView.setOverScrollMode(2);
        scrollView.setHorizontalScrollBarEnabled(false);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setClipToPadding(false);
        return scrollView;
    }

    public final oIW gEmmrt() {
        return (oIW) this.KWHzl.getValue();
    }

    public static final oIW copydefault(nTY nty) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, C55298xhM.dp2px$default(100.0f, null, 1, null));
        layoutParams.topToBottom = C35399nuc.StateListAnimator.alsFma;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = nty.AkhnZx();
        layoutParams.setMarginStart(nty.valueOf());
        layoutParams.setMarginEnd(nty.valueOf());
        android.content.Context contextRequireContext = nty.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        oIW oiw = new oIW(contextRequireContext, null, 0, 6, null);
        oiw.setId(android.view.View.generateViewId());
        oiw.setLayoutParams(layoutParams);
        oiw.setMaxLength(java.lang.Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_AES_128_GCM_SHA256));
        oiw.setShowCount(true);
        oiw.setSizeType(44);
        return oiw;
    }

    public final OKReminder djBIcL() {
        return (OKReminder) this.djBIcL.getValue();
    }

    public static final OKReminder OLrzqt(nTY nty) {
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-1, -2);
        layoutParams.topToBottom = nty.gEmmrt().getId();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = C55298xhM.dp2px$default(20.0f, null, 1, null);
        layoutParams.setMarginStart(nty.valueOf());
        layoutParams.setMarginEnd(nty.valueOf());
        android.content.Context contextRequireContext = nty.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        OKReminder oKReminder = new OKReminder(contextRequireContext, null, 0, 6, null);
        oKReminder.setLayoutParams(layoutParams);
        return oKReminder;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nTY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final nTY AEQbTJ(boolean z, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            nTY nty = new nTY();
            nty.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PARAM_IS_PAID_GROUP", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("KEY_PARAM_UNIT", str), C56390yDp.OLrzqt("KEY_PARAM_VALUE", str2)));
            return nty;
        }
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.view.View viewValueOf = wxq.valueOf();
        ViewGroup.LayoutParams layoutParams = viewValueOf.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = AkhnZx();
            viewValueOf.setLayoutParams(marginLayoutParams);
            wxq.AYXKKw().setTextAppearance(C52761wXj.LoaderManager.uzCIH);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.view.ViewParent parent = constraintLayout.getParent();
        Intrinsics.copydefault(parent, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        int iIndexOfChild = viewGroup.indexOfChild(constraintLayout);
        viewGroup.removeView(constraintLayout);
        viewGroup.addView(AhwBna(), iIndexOfChild, layoutParams);
        constraintLayout.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.ffGIBT), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.ffGIBT));
        AhwBna().addView(constraintLayout);
        constraintLayout.addView(gEmmrt());
        android.os.Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("KEY_PARAM_IS_PAID_GROUP")) {
            return;
        }
        OKReminder oKReminderDjBIcL = djBIcL();
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString("KEY_PARAM_UNIT") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle arguments3 = getArguments();
        java.lang.String string2 = arguments3 != null ? arguments3.getString("KEY_PARAM_VALUE") : null;
        java.lang.String str = string + pTB.formatLocalizedWithMinPrecision$default(string2 != null ? string2 : "", 2, null, 2, null);
        oKReminderDjBIcL.setStyle(0);
        oKReminderDjBIcL.setCloseIconVisibility(false);
        oKReminderDjBIcL.setMessage(C33069mpW.copydefault(this, C35399nuc.LoaderManager.dkJJWw, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str))));
        constraintLayout.addView(djBIcL());
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        c54953xam.OLrzqt.setTextAppearance(C52761wXj.LoaderManager.valueOf);
        c54953xam.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG));
        c54953xam.OLrzqt.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zEHIKV));
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        wyk.setVisibility(8);
        C55001xbh c55001xbhCopydefault = gEmmrt().copydefault();
        if (c55001xbhCopydefault != null) {
            c55001xbhCopydefault.setHint(C33070mpX.AYXKKw(C35399nuc.LoaderManager.HJWChPRGtXKCDKRTZD));
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ nTY KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, nTY nty) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = nty;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.copydefault = true;
                this.KWHzl.dismiss();
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.QsIRgs));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new TaskDescription(c52794wYpCopydefault, 1000L, this));
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        android.os.Bundle bundleBundleOf;
        android.text.Editable text;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (this.copydefault) {
            kotlin.Pair[] pairArr = new kotlin.Pair[1];
            C55001xbh c55001xbhCopydefault = gEmmrt().copydefault();
            pairArr[0] = C56390yDp.OLrzqt("KEY_REQUEST_REASON", (c55001xbhCopydefault == null || (text = c55001xbhCopydefault.getText()) == null) ? null : text.toString());
            bundleBundleOf = BundleKt.bundleOf(pairArr);
        } else {
            bundleBundleOf = BundleKt.bundleOf();
        }
        FragmentKt.setFragmentResult(this, "RESULT_KEY_JOIN_REQUEST_FORM", bundleBundleOf);
        super.onDismiss(dialogInterface);
    }
}
