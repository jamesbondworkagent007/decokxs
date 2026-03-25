package o;

import android.view.ViewTreeObserver;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class wYA {
    public static /* synthetic */ C52794wYp textButton$default(C52794wYp c52794wYp, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return OLrzqt(c52794wYp, z);
    }

    public static final C52794wYp OLrzqt(@NotNull final C52794wYp c52794wYp, boolean z) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        wYI wyi = new wYI(c52794wYp);
        InterfaceC52764wXm.Application.loadFromAttributes$default(wyi, null, C52761wXj.ActionBar.KDccX, 0, 4, null);
        if (wyi.copydefault() == 1) {
            c52794wYp.setOKDSSize(44);
            c52794wYp.setBackgroundResource(C52761wXj.TaskDescription.flVtFt);
            int i = C52761wXj.ActionBar.heceqZ;
            android.content.Context context = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c52794wYp.setTextColor(C55366xib.KWHzl(i, context));
            c52794wYp.setLoadingRes$OKUILib_uilib(C52761wXj.PendingIntent.fARcdN);
        } else {
            c52794wYp.setOKDSType(258);
            c52794wYp.setOKDSSize(-1);
            android.content.Context context2 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = C55298xhM.copydefault(20.0f, context2);
            android.content.Context context3 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            int iCopydefault2 = C55298xhM.copydefault(24.0f, context3);
            android.content.Context context4 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            int iCopydefault3 = C55298xhM.copydefault(20.0f, context4);
            android.content.Context context5 = c52794wYp.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            c52794wYp.setPaddingRelative(iCopydefault, iCopydefault2, iCopydefault3, C55298xhM.copydefault(24.0f, context5));
            c52794wYp.setTypeface(C55051xce.OLrzqt.valueOf());
        }
        if (wyi.AEQbTJ() > -1.0f) {
            c52794wYp.setButtonCornerRadius(wyi.AEQbTJ());
        }
        c52794wYp.setButtonGravity(TextAlign.LEFT);
        if (z) {
            c52794wYp.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: o.wYz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return wYA.EZpvd(c52794wYp);
                }
            });
        }
        return c52794wYp;
    }

    public static final boolean EZpvd(C52794wYp c52794wYp) {
        android.graphics.drawable.Drawable drawable = c52794wYp.getCompoundDrawables()[2];
        if (drawable == null) {
            return true;
        }
        int compoundDrawablePadding = c52794wYp.getCompoundDrawablePadding();
        int iWidth = drawable.getBounds().width();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (iWidth == 0) {
            iWidth = intrinsicWidth;
        }
        java.lang.CharSequence text = c52794wYp.getText();
        c52794wYp.setPaddingRelative(c52794wYp.getPaddingLeft(), c52794wYp.getPaddingTop(), C56548yJl.copydefault((((c52794wYp.getWidth() - c52794wYp.getPaddingLeft()) - (text != null ? (int) c52794wYp.getPaint().measureText(text.toString()) : 0)) - compoundDrawablePadding) - iWidth, c52794wYp.getPaddingRight()), c52794wYp.getPaddingBottom());
        return true;
    }
}
