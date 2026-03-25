package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pqx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39369pqx extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public AbstractC36101oPh EZpvd;

    /* JADX INFO: renamed from: o.pqx$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pqx.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C39369pqx EZpvd() {
            return new C39369pqx();
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.AEQbTJ().setVisibility(0);
        wxq.setStyle(2);
        java.lang.String string = getResources().getString(C35964oKf.Fragment.keyboardTargetTextChanged);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.EZpvd = AbstractC36101oPh.KWHzl(getLayoutInflater(), constraintLayout, true);
        android.text.SpannableString spannableString = new android.text.SpannableString(getResources().getString(C35964oKf.Fragment.FHvxmb));
        spannableString.setSpan(new TaskDescription(), 0, spannableString.length(), 0);
        android.text.SpannableString spannableString2 = new android.text.SpannableString(getResources().getString(C35964oKf.Fragment.gCZUJG));
        spannableString2.setSpan(new Activity(), 0, spannableString2.length(), 0);
        AbstractC36101oPh abstractC36101oPh = this.EZpvd;
        if (abstractC36101oPh != null && (textView2 = abstractC36101oPh.EZpvd) != null) {
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        AbstractC36101oPh abstractC36101oPh2 = this.EZpvd;
        if (abstractC36101oPh2 != null && (textView = abstractC36101oPh2.EZpvd) != null) {
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            textView.setText(C33069mpW.KWHzl(resources, C35964oKf.Fragment.FQMcgE, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("termsOfServiceURL", spannableString), C56390yDp.OLrzqt("riskDisclosureURL", spannableString2))));
        }
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.gasjUx));
    }

    /* JADX INFO: renamed from: o.pqx$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C39369pqx.this.OLrzqt("https://www.okx.com/help/terms-of-service");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(C39369pqx.this.getResources().getColor(C52761wXj.Activity.fdOvFl));
        }
    }

    /* JADX INFO: renamed from: o.pqx$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public Activity() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C39369pqx.this.OLrzqt("https://www.okx.com/help/risk-compliance-disclosure");
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setColor(C39369pqx.this.getResources().getColor(C52761wXj.Activity.fdOvFl));
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        view.post(new java.lang.Runnable() { // from class: o.pqz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C39369pqx.copydefault(this.copydefault);
            }
        });
    }

    public static final void copydefault(C39369pqx c39369pqx) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c39369pqx, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str) {
        android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("title", ""));
        android.content.Context context = getContext();
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, bundleBundleOf, null, 4, null);
        }
    }
}
