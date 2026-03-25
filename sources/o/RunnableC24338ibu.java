package o;

import android.graphics.PointF;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ibu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class RunnableC24338ibu implements java.lang.Runnable {
    public final android.widget.TextView OLrzqt;
    public PointF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull PointF pointF) {
        Intrinsics.checkNotNullParameter(pointF, "");
        this.copydefault = pointF;
    }

    public RunnableC24338ibu(@NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "");
        this.OLrzqt = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int measuredWidth = this.OLrzqt.getMeasuredWidth();
        android.widget.TextView textView = this.OLrzqt;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iDpInt$default = C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null);
        PointF pointF = this.copydefault;
        marginLayoutParams.leftMargin = java.lang.Math.max(iDpInt$default, java.lang.Math.min(C23313hvq.EZpvd(pointF != null ? C23313hvq.subCheckS$default(java.lang.Integer.valueOf((int) pointF.x), C23313hvq.divCheckS$default(java.lang.Integer.valueOf(measuredWidth), 2, null, null, null, 14, null), null, null, null, 14, null) : null), C23313hvq.EZpvd(C23313hvq.subCheckS$default(C23313hvq.subCheckS$default(java.lang.Integer.valueOf(C33570myu.djBIcL(C32979mnm.EZpvd.OLrzqt())), java.lang.Integer.valueOf(measuredWidth), null, null, null, 14, null), java.lang.Integer.valueOf(C55298xhM.dpInt$default(6, (android.content.Context) null, 1, (java.lang.Object) null)), null, null, null, 14, null))));
        textView.setLayoutParams(marginLayoutParams);
    }
}
