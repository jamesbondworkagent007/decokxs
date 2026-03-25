package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lBj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C29816lBj extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public java.lang.String EZpvd;
    public Function0<Unit> KWHzl;
    public Function0<Unit> OLrzqt;

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31590lws abstractC31590lwsKWHzl = AbstractC31590lws.KWHzl(android.view.LayoutInflater.from(getContext()));
        Intrinsics.checkNotNullExpressionValue(abstractC31590lwsKWHzl, "");
        copydefault(abstractC31590lwsKWHzl);
        OLrzqt(abstractC31590lwsKWHzl);
        AEQbTJ(abstractC31590lwsKWHzl);
        KWHzl(abstractC31590lwsKWHzl);
        constraintLayout.addView(abstractC31590lwsKWHzl.getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
    }

    public final void copydefault(AbstractC31590lws abstractC31590lws) {
        abstractC31590lws.djBIcL.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.gkJEwt));
        android.widget.TextView textView = abstractC31590lws.AEQbTJ;
        int i = C31351lsQ.Activity.RlQdEF;
        java.lang.String str = this.EZpvd;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("specialRateAmount", str))));
    }

    public final void OLrzqt(AbstractC31590lws abstractC31590lws) {
        wYK wyk = abstractC31590lws.EZpvd;
        wyk.setOnClickListener(new Activity(wyk, 1000L, abstractC31590lws));
    }

    public final void KWHzl(AbstractC31590lws abstractC31590lws) {
        C52794wYp c52794wYp = abstractC31590lws.OLrzqt;
        c52794wYp.setText(C33070mpX.AYXKKw(C31351lsQ.Activity.iZzfmt));
        c52794wYp.setEnabled(false);
        c52794wYp.setOnClickListener(new ActionBar(c52794wYp, 1000L, this));
    }

    public final void AEQbTJ(AbstractC31590lws abstractC31590lws) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C31351lsQ.Activity.QKudOq);
        java.lang.String str = strAYXKKw + " " + C33070mpX.AYXKKw(C31351lsQ.Activity.DAIeex);
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new Application(), strAYXKKw.length() + 1, str.length(), 33);
        abstractC31590lws.KWHzl.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        abstractC31590lws.KWHzl.setText(spannableString);
    }

    /* JADX INFO: renamed from: o.lBj$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public Application() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C31351lsQ.Activity.accept)), C56390yDp.OLrzqt("special", java.lang.Boolean.TRUE));
            C29816lBj c29816lBj = C29816lBj.this;
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            FragmentActivity fragmentActivityRequireActivity = c29816lBj.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, fragmentActivityRequireActivity, bundleBundleOf, null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
            textPaint.setFakeBoldText(true);
            textPaint.setColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        }
    }

    /* JADX INFO: renamed from: o.lBj$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBj.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C29816lBj OLrzqt(@NotNull java.lang.String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(function02, "");
            C29816lBj c29816lBj = new C29816lBj();
            c29816lBj.EZpvd = str;
            c29816lBj.KWHzl = function0;
            c29816lBj.OLrzqt = function02;
            return c29816lBj;
        }
    }

    /* JADX INFO: renamed from: o.lBj$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C29816lBj OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C29816lBj c29816lBj) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c29816lBj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Function0 function0 = this.OLrzqt.OLrzqt;
                Function0 function02 = null;
                if (function0 == null) {
                    Intrinsics.gEmmrt("");
                    function0 = null;
                }
                function0.invoke();
                Function0 function03 = this.OLrzqt.KWHzl;
                if (function03 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    function02 = function03;
                }
                function02.invoke();
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.lBj$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ AbstractC31590lws OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AbstractC31590lws abstractC31590lws) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = abstractC31590lws;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                AbstractC31590lws abstractC31590lws = this.OLrzqt;
                abstractC31590lws.OLrzqt.setEnabled(abstractC31590lws.EZpvd.isChecked());
            }
        }
    }
}
