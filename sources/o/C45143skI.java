package o;

import android.os.Build;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45143skI extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public Function0<Unit> OLrzqt;
    public AbstractC47440tqA copydefault;

    /* JADX INFO: renamed from: o.skI$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.skI.Activity.<init>():void type: THIS */
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
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC47440tqA abstractC47440tqA = (AbstractC47440tqA) DataBindingUtil.inflate(getCustomLayoutInflater(), C47315tni.ActionBar.QVsKAR, constraintLayout, true);
        this.copydefault = abstractC47440tqA;
        AbstractC47440tqA abstractC47440tqA2 = null;
        if (abstractC47440tqA == null) {
            Intrinsics.gEmmrt("");
            abstractC47440tqA = null;
        }
        abstractC47440tqA.OLrzqt.post(new java.lang.Runnable() { // from class: o.skH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45143skI.copydefault(this.AEQbTJ);
            }
        });
        AbstractC47440tqA abstractC47440tqA3 = this.copydefault;
        if (abstractC47440tqA3 == null) {
            Intrinsics.gEmmrt("");
            abstractC47440tqA3 = null;
        }
        android.widget.TextView textView = abstractC47440tqA3.KWHzl;
        java.lang.String string = getString(C47315tni.PendingIntent.UhxbNG);
        Intrinsics.checkNotNullExpressionValue(string, "");
        textView.setText(EZpvd(C33069mpW.copydefault(this, C47315tni.PendingIntent.Ufzxmz, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("okxRiskControlGuide", string))), string, textView.getContext().getColor(C52761wXj.Activity.Dmq), new Function0() { // from class: o.skG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45143skI.EZpvd(this.copydefault);
            }
        }));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        AbstractC47440tqA abstractC47440tqA4 = this.copydefault;
        if (abstractC47440tqA4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC47440tqA2 = abstractC47440tqA4;
        }
        android.widget.TextView textView2 = abstractC47440tqA2.copydefault;
        java.lang.String string2 = getString(C47315tni.PendingIntent.ULRxlR);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        textView2.setText(EZpvd(C33069mpW.copydefault(this, C47315tni.PendingIntent.RXzakW, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("transactionAppeal", string2))), string2, textView2.getContext().getColor(C52761wXj.Activity.Dmq), new Function0() { // from class: o.skF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45143skI.djBIcL(this.copydefault);
            }
        }));
        textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
    }

    public static final void copydefault(C45143skI c45143skI) {
        AbstractC47440tqA abstractC47440tqA = c45143skI.copydefault;
        AbstractC47440tqA abstractC47440tqA2 = null;
        if (abstractC47440tqA == null) {
            Intrinsics.gEmmrt("");
            abstractC47440tqA = null;
        }
        int measuredHeight = abstractC47440tqA.OLrzqt.getMeasuredHeight();
        AbstractC47440tqA abstractC47440tqA3 = c45143skI.copydefault;
        if (abstractC47440tqA3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC47440tqA2 = abstractC47440tqA3;
        }
        android.view.View view = abstractC47440tqA2.djBIcL;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = measuredHeight;
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final Unit EZpvd(C45143skI c45143skI) {
        java.lang.String string = c45143skI.getString(C47315tni.PendingIntent.TarCU);
        Intrinsics.checkNotNullExpressionValue(string, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context contextRequireContext = c45143skI.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", string)), null, 4, null);
            c45143skI.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C45143skI c45143skI) {
        Function0<Unit> function0 = c45143skI.OLrzqt;
        if (function0 != null) {
            function0.invoke();
        }
        c45143skI.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.skI$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ Function0<Unit> EZpvd;

        public TaskDescription(Function0<Unit> function0, int i) {
            this.EZpvd = function0;
            this.AEQbTJ = i;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.EZpvd.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setColor(this.AEQbTJ);
            textPaint.setUnderlineText(true);
            if (Build.VERSION.SDK_INT >= 29) {
                textPaint.underlineColor = this.AEQbTJ;
            } else {
                textPaint.setShadowLayer(1.0f, 0.0f, 1.0f, this.AEQbTJ);
            }
        }
    }

    public final java.lang.CharSequence EZpvd(java.lang.String str, java.lang.String str2, final int i, final Function0<Unit> function0) {
        return C33061mpO.setupSpanStyles$default(new android.text.SpannableString(str), new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.skM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C45143skI.KWHzl(function0, i, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(Function0 function0, int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new TaskDescription(function0, i));
        return Unit.INSTANCE;
    }
}
