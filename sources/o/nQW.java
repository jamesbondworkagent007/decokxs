package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nQW extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final boolean EZpvd;
    public nJE KWHzl;

    public static final boolean AEQbTJ(java.lang.String str) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.EZpvd;
    }

    public final nJE KWHzl() {
        nJE nje = this.KWHzl;
        Intrinsics.copydefault(nje);
        return nje;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nQW.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = nJE.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        final nJE njeKWHzl = KWHzl();
        final java.lang.String string = getString(C35399nuc.LoaderManager.hrjNmC);
        Intrinsics.checkNotNullExpressionValue(string, "");
        C55137xeK c55137xeKOLrzqt = C55137xeK.Companion.KWHzl(C33069mpW.copydefault(C35399nuc.LoaderManager.QfJbVf, C56423yEv.EZpvd(C56390yDp.OLrzqt("here", string)))).OLrzqt(new InterfaceC55228xfw() { // from class: o.nQV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC55228xfw
            public final boolean OLrzqt(java.lang.String str) {
                return nQW.AEQbTJ(str);
            }
        });
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c55137xeKOLrzqt.KWHzl(contextRequireContext, new Function1() { // from class: o.nRd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return nQW.copydefault(njeKWHzl, string, this, (java.lang.CharSequence) obj);
            }
        });
        wYF wyf = njeKWHzl.EZpvd;
        wyf.setType(7);
        wyf.setPrimaryText(getString(C35399nuc.LoaderManager.ejfBZ));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new View.OnClickListener() { // from class: o.nQZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nQW.OLrzqt(this.EZpvd, view);
                }
            });
        }
        wyf.setSecondaryText(getString(C35399nuc.LoaderManager.iwGUEr));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.nRb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nQW.AEQbTJ(this.AEQbTJ, view);
                }
            });
        }
    }

    public static final Unit copydefault(nJE nje, java.lang.String str, nQW nqw, java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        android.widget.TextView textView = nje.AEQbTJ;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(nqw.new StateListAnimator(), iIndexOf$default, str.length() + iIndexOf$default, 33);
        }
        textView.setText(spannableStringBuilder);
        nje.AEQbTJ.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        nje.AEQbTJ.setHighlightColor(C33070mpX.copydefault(android.R.color.transparent));
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = nQW.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C35878oHa.openPageWithInterceptor$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35399nuc.LoaderManager.hOMIpD))), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            textPaint.setUnderlineText(true);
        }
    }

    public static final void OLrzqt(nQW nqw, android.view.View view) {
        FragmentKt.setFragmentResult(nqw, "GROUP_GUIDELINES_BOTTOM_SHEET_REQUEST_KEY", BundleKt.bundleOf(C56390yDp.OLrzqt("GROUP_GUIDELINES_BOTTOM_SHEET_RESULT_KEY", java.lang.Boolean.TRUE)));
        nqw.dismissAllowingStateLoss();
    }

    public static final void AEQbTJ(nQW nqw, android.view.View view) {
        nqw.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.KWHzl = null;
    }
}
