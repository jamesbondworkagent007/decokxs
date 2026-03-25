package o;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: o.qxB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C41771qxB extends android.widget.LinearLayout {
    public final InterfaceC56387yDm KWHzl;

    public C41771qxB(android.content.Context context) {
        super(context);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C41771qxB.EZpvd());
            }
        });
    }

    public C41771qxB(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C41771qxB.EZpvd());
            }
        });
    }

    public C41771qxB(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qxz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C41771qxB.EZpvd());
            }
        });
    }

    private final int OLrzqt() {
        return ((java.lang.Number) this.KWHzl.getValue()).intValue();
    }

    public static final int EZpvd() {
        return C33570myu.EZpvd() / 2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE || size >= OLrzqt()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), size);
    }
}
