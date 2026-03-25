package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.web.WebActivity;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35399nuc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class nFM extends AbstractC52779wYa {
    public static final Activity Companion = new Activity(null);

    @Override // o.AbstractC52779wYa, o.wXX
    public float getHeightScale() {
        return -1.0f;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nFM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final nFM KWHzl() {
            return new nFM();
        }

        public final boolean copydefault() {
            return (!((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).djSkpj() || SPUtils.getBoolean("chat_disclaimer_shown", false) || mNP.AEQbTJ.copydefault()) ? false : true;
        }

        public final void OLrzqt() {
            SPUtils.put("chat_disclaimer_shown", java.lang.Boolean.TRUE);
        }
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        int iOLrzqt = C55298xhM.OLrzqt(8, contextRequireContext);
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), iOLrzqt, constraintLayout.getPaddingEnd(), C55298xhM.OLrzqt(12, contextRequireContext2));
    }

    @Override // o.AbstractC52779wYa
    public void OLrzqt(@NotNull C54956xap c54956xap) {
        Intrinsics.checkNotNullParameter(c54956xap, "");
        AppCompatImageView appCompatImageView = c54956xap.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        android.content.Context context = c54956xap.OLrzqt.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C33054mpH.loadUrl$default(appCompatImageView, C43454rpb.copydefault("images/im/privacy_notice.webp", context, true), null, 0, 0, 14, null);
        c54956xap.valueOf.setText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.ihnvzI));
        c54956xap.valueOf.setTextAlignment(4);
        c54956xap.valueOf.setTextAppearance(C52761wXj.LoaderManager.hDKMBd);
        c54956xap.AEQbTJ.setText("");
        c54956xap.AEQbTJ.setVisibility(8);
        AppCompatTextView appCompatTextView = c54956xap.KWHzl;
        appCompatTextView.setVisibility(0);
        appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        appCompatTextView.setText(AEQbTJ());
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(requireContext().getColor(C52761wXj.Activity.DCUTEIddSDPG));
        c54956xap.EZpvd.setVisibility(8);
    }

    @Override // o.AbstractC52779wYa, o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C35399nuc.LoaderManager.reset));
        wyf.setOKDSSize(52);
        wyf.setOnClickListener(new ActionBar(wyf, 1000L, this));
        wyf.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.nFP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return nFM.KWHzl(view);
            }
        });
    }

    public static final boolean KWHzl(android.view.View view) {
        SPUtils.put("chat_disclaimer_shown", java.lang.Boolean.TRUE);
        return true;
    }

    public final java.lang.CharSequence AEQbTJ() {
        java.lang.Object objM7377constructorimpl;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35399nuc.LoaderManager.aCSzUz);
        java.lang.String strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C35399nuc.LoaderManager.zLAIeZ), C56423yEv.EZpvd(C56390yDp.OLrzqt("privacyPolicy", strAYXKKw)));
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strOLrzqt);
        try {
            Result.Application application = Result.Companion;
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strOLrzqt, strAYXKKw, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default >= 0) {
                spannableStringBuilder.setSpan(new TaskDescription(), iIndexOf$default, strAYXKKw.length() + iIndexOf$default, 33);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DisclaimerBottomSheet", "Failed to create clickable text", thM7380exceptionOrNullimpl);
        }
        return spannableStringBuilder;
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            pUU.KWHzl("DisclaimerBottomSheet", "Privacy Policy clicked from bottom sheet");
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = nFM.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C35878oHa.openPageWithInterceptor$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35399nuc.LoaderManager.processStrongAuthMessage))), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(nFM.this.requireContext().getColor(C52761wXj.Activity.fdOvFl));
            textPaint.setUnderlineText(true);
        }
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ nFM KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, nFM nfm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = nfm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                pUU.KWHzl("DisclaimerBottomSheet", "Go to chat clicked");
                nFM.Companion.OLrzqt();
                this.KWHzl.dismiss();
            }
        }
    }
}
