package o;

import androidx.core.os.BundleKt;
import com.okinc.web.WebActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ruw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43740ruw extends android.text.style.ClickableSpan {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C43740ruw() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C43740ruw(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:18) call: o.ruw.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ C43740ruw(java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull android.text.TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "");
        textPaint.setUnderlineText(true);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setHighlightColor(0);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", this.copydefault));
            WebActivity.TaskDescription taskDescription = WebActivity.Companion;
            android.content.Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.app.Activity activityCopydefault = copydefault(context);
            if (activityCopydefault == null) {
                activityCopydefault = C54819xWm.KWHzl().AEQbTJ();
            }
            android.app.Activity activity = activityCopydefault;
            Intrinsics.copydefault(activity);
            WebActivity.TaskDescription.openPage$default(taskDescription, activity, bundleBundleOf, null, 4, null);
            return;
        }
        InterfaceC45748swL interfaceC45748swL = (InterfaceC45748swL) C43251rlk.copydefault(InterfaceC45748swL.class);
        android.content.Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        interfaceC45748swL.EZpvd(context2);
    }

    public final android.app.Activity copydefault(android.content.Context context) {
        while (context instanceof android.content.ContextWrapper) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
            context = ((android.content.ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
