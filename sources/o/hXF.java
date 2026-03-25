package o;

import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class hXF extends android.widget.FrameLayout {
    public final InterfaceC56387yDm KWHzl;

    public static final android.view.View AEQbTJ(hXF hxf) {
        return hxf.findViewById(C23274hvD.Application.RzdrRQ);
    }

    private final android.view.View EZpvd() {
        java.lang.Object value = this.KWHzl.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (android.view.View) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXF(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hXF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hXF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.hXH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return hXF.AEQbTJ(this.OLrzqt);
            }
        });
        AEQbTJ(context);
    }

    public final void AEQbTJ(android.content.Context context) {
        android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.pause, (android.view.ViewGroup) this, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hXF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setProgress$default(hXF hxf, kotlin.Pair pair, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pair = null;
        }
        hxf.setProgress(pair);
    }

    public final void setProgress(final kotlin.Pair<java.lang.Long, java.lang.Long> pair) {
        if (pair != null) {
            long jLongValue = pair.getSecond().longValue();
            if (jLongValue == -1) {
                post(new java.lang.Runnable() { // from class: o.hXD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hXF.copydefault(this.AEQbTJ);
                    }
                });
            } else if (jLongValue == -100) {
                post(new java.lang.Runnable() { // from class: o.hXG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hXF.AhwBna(this.AEQbTJ);
                    }
                });
            } else {
                post(new java.lang.Runnable() { // from class: o.hXM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        hXF.setProgress$lambda$4$lambda$3(this.EZpvd, pair);
                    }
                });
            }
            EZpvd().setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(hXF hxf) {
        ViewGroup.LayoutParams layoutParams = hxf.EZpvd().getLayoutParams();
        layoutParams.height = C33129mqd.AhwBna(C23313hvq.mulCheckS$default(java.lang.Integer.valueOf(hxf.getHeight()), java.lang.Double.valueOf(0.8d), null, null, null, 14, null));
        hxf.EZpvd().setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AhwBna(hXF hxf) {
        ViewGroup.LayoutParams layoutParams = hxf.EZpvd().getLayoutParams();
        layoutParams.height = hxf.getHeight();
        hxf.EZpvd().setLayoutParams(layoutParams);
    }

    public static final void setProgress$lambda$4$lambda$3(hXF hxf, kotlin.Pair pair) {
        ViewGroup.LayoutParams layoutParams = hxf.EZpvd().getLayoutParams();
        layoutParams.height = C33129mqd.AhwBna(C23313hvq.mulCheckS$default(C23313hvq.divCheckS$default(java.lang.Integer.valueOf(hxf.getHeight()), pair.getSecond(), null, null, null, 14, null), C23313hvq.subCheckS$default(pair.getSecond(), pair.getFirst(), null, null, null, 14, null), null, null, null, 14, null));
        hxf.EZpvd().setLayoutParams(layoutParams);
    }
}
