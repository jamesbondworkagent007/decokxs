package o;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.okex.common.ui.util.ViewsKt$afterLayoutStableHeight$1;
import com.okinc.okex.common.ui.util.ViewsKt$afterLayoutStableHeight$heightFlow$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sos, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45391sos {
    public static /* synthetic */ void afterLayoutStableHeight$default(android.view.View view, LifecycleOwner lifecycleOwner, long j, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            j = 100;
        }
        long j2 = j;
        if ((i3 & 4) != 0) {
            i = 3;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 30;
        }
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), C44711scA.EZpvd.KWHzl().getImmediate(), null, new ViewsKt$afterLayoutStableHeight$1(FlowKt.flow(new ViewsKt$afterLayoutStableHeight$heightFlow$1(i2, j2, view, i4, null)), function1, null), 2, null);
    }

    public static final boolean OLrzqt(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.text.Layout layout = textView.getLayout();
        return (layout == null || layout.getLineCount() == 0 || layout.getLineBottom(layout.getLineCount() - 1) <= textView.getHeight() - textView.getPaddingBottom()) ? false : true;
    }

    public static /* synthetic */ void detectLinks$default(android.widget.TextView textView, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        AEQbTJ(textView, i);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        C45370soX c45370soX = C45370soX.copydefault;
        android.text.util.Linkify.addLinks(spannableString, c45370soX.djBIcL(), (java.lang.String) null);
        android.text.util.Linkify.addLinks(spannableString, c45370soX.copydefault(), (java.lang.String) null);
        java.util.Iterator itEZpvd = yHX.EZpvd((android.text.style.URLSpan[]) spannableString.getSpans(0, spannableString.length(), android.text.style.URLSpan.class));
        while (itEZpvd.hasNext()) {
            android.text.style.URLSpan uRLSpan = (android.text.style.URLSpan) itEZpvd.next();
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(uRLSpan, spanStart, spanEnd, 33);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(i), spanStart, spanEnd, 33);
        }
        textView.setText(spannableString);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public static final void AEQbTJ(@NotNull C55258xgZ c55258xgZ) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(c55258xgZ, "");
        java.lang.Object parent = c55258xgZ.getParent();
        final android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        c55258xgZ.setOnClickListener(new View.OnClickListener() { // from class: o.sov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C45391sos.OLrzqt(view, view2);
            }
        });
        c55258xgZ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.sot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view2) {
                return C45391sos.EZpvd(view, view2);
            }
        });
        C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setEllipsize(TextUtils.TruncateAt.END);
        c55320xhiKWHzl.setShowAttachmentView(false);
    }

    public static final void OLrzqt(android.view.View view, android.view.View view2) {
        if (view != null) {
            view.setPressed(true);
            view.setPressed(false);
            view.performClick();
        }
    }

    public static final boolean EZpvd(android.view.View view, android.view.View view2) {
        if (view != null) {
            return view.performLongClick();
        }
        return false;
    }
}
