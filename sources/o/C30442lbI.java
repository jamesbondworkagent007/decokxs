package o;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lbI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30442lbI extends AbstractC52780wYb {
    public java.lang.String AEQbTJ;
    public boolean EZpvd;
    public Function0<Unit> KWHzl;
    public wYF OLrzqt;

    @Override // o.AbstractC52780wYb
    public boolean OLrzqt() {
        return false;
    }

    public C30442lbI() {
        java.lang.String canonicalName = C30442lbI.class.getCanonicalName();
        this.AEQbTJ = canonicalName == null ? "" : canonicalName;
    }

    @Override // o.AbstractC52780wYb
    public java.lang.CharSequence AEQbTJ() {
        java.lang.String string = getString(C23274hvD.Fragment.aWuQzD);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.AbstractC52780wYb, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.giSNqX), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit));
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        android.view.View viewValueOf = wxq.valueOf();
        ViewGroup.LayoutParams layoutParams = viewValueOf.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = -2;
            layoutParams2.gravity = 1;
            viewValueOf.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    @Override // o.AbstractC52780wYb
    public void copydefault(@NotNull C54953xam c54953xam) {
        Intrinsics.checkNotNullParameter(c54953xam, "");
        java.lang.String string = getString(C23274hvD.Fragment.jFiva);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = getString(C23274hvD.Fragment.iMXFZQ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.copydefault(this, C23274hvD.Fragment.icKaHr, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("freezeAssets", string), C56390yDp.OLrzqt("termsService", string2))));
        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string, 0, false, 6, (java.lang.Object) null) + string.length(), 17);
        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string2, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string2, 0, false, 6, (java.lang.Object) null) + string2.length(), 17);
        spannableStringBuilder.setSpan(new Application(), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string2, 0, false, 6, (java.lang.Object) null), StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) spannableStringBuilder, string2, 0, false, 6, (java.lang.Object) null) + string2.length(), 17);
        c54953xam.OLrzqt.setText(spannableStringBuilder);
        c54953xam.OLrzqt.setTextSize(14.0f);
        c54953xam.OLrzqt.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c54953xam.KWHzl.setText(getString(C23274hvD.Fragment.fiXcQa));
        c54953xam.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.lbR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C30442lbI.EZpvd(this.AEQbTJ, compoundButton, z);
            }
        });
        c54953xam.KWHzl.setContentDescription("web3_dex_understanding_checkbox");
        wYK wyk = c54953xam.KWHzl;
        Intrinsics.checkNotNullExpressionValue(wyk, "");
        ViewGroup.LayoutParams layoutParams = wyk.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -2;
            layoutParams2.startToStart = 0;
            layoutParams2.endToEnd = 0;
            wyk.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* JADX INFO: renamed from: o.lbI$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.content.Context context = C30442lbI.this.getContext();
            if (context != null) {
                C25352ivB.OLrzqt(context, C30442lbI.this.getString(C23274hvD.Fragment.IYdWPz));
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            android.content.Context contextRequireContext = C30442lbI.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            textPaint.setColor(C25382ivf.KWHzl(contextRequireContext, C52761wXj.Activity.fdOvFl));
        }
    }

    public static final void EZpvd(C30442lbI c30442lbI, android.widget.CompoundButton compoundButton, boolean z) {
        C52794wYp c52794wYpCopydefault;
        c30442lbI.EZpvd = z;
        wYF wyf = c30442lbI.OLrzqt;
        if (wyf != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            c52794wYpCopydefault.setEnabled(c30442lbI.EZpvd);
        }
        wYF wyf2 = c30442lbI.OLrzqt;
        if (wyf2 != null) {
            wyf2.setEnabled(c30442lbI.EZpvd);
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        wyf.setEnabled(false);
        wyf.setPrimaryText(getString(C23274hvD.Fragment.fkESqH));
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setContentDescription("web3_dex_start_trading_button");
        }
        this.OLrzqt = wyf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lbI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showBottomSheet$default(C30442lbI c30442lbI, androidx.fragment.app.FragmentManager fragmentManager, Function0 function0, DialogInterface.OnDismissListener onDismissListener, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c30442lbI.OLrzqt(fragmentManager, (Function0<Unit>) function0, onDismissListener);
    }

    public final void OLrzqt(@NotNull androidx.fragment.app.FragmentManager fragmentManager, Function0<Unit> function0, DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.KWHzl = function0;
        setOnDismissListener(onDismissListener);
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag(this.AEQbTJ);
        if (fragmentFindFragmentByTag == null || !fragmentFindFragmentByTag.isVisible()) {
            show(fragmentManager, this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.lbI$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30442lbI OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C30442lbI c30442lbI) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c30442lbI;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C23317hvu.AhwBna(this.OLrzqt.EZpvd);
                this.OLrzqt.dismiss();
                if (!this.OLrzqt.EZpvd || (function0 = this.OLrzqt.KWHzl) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
