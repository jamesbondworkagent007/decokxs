package o;

import android.graphics.Paint;
import com.github.mikephil.charting.components.MarkerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.SQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public class qXS extends MarkerView {
    public int AEQbTJ;
    public float EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public int OLrzqt;
    public float copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qXS(@NotNull android.content.Context context) {
        super(context, android.R.layout.test_list_item);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qXW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qXS.EZpvd();
            }
        });
        setCircleColorAndRadius(C41431qqg.getRaiseColor$default(this, 0, 0, 3, null), C41431qqg.OLrzqt(this, SQ.Application.copydefault), C41431qqg.getColor$default(this, C52761wXj.Activity.djBIcL, null, 2, null), C41431qqg.OLrzqt(this, C32113mPz.StateListAnimator.AhwBna));
    }

    private final android.graphics.Paint OLrzqt() {
        return (android.graphics.Paint) this.KWHzl.getValue();
    }

    public static final android.graphics.Paint EZpvd() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        return paint;
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public void draw(android.graphics.Canvas canvas, float f, float f2) {
        OLrzqt().setColor(this.AEQbTJ);
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.copydefault, OLrzqt());
        }
        OLrzqt().setColor(this.OLrzqt);
        if (canvas != null) {
            canvas.drawCircle(f, f2, this.EZpvd, OLrzqt());
        }
        super.draw(canvas, f, f2);
    }

    public final void setCircleColorAndRadius(@androidx.annotation.ColorInt int i, float f, @androidx.annotation.ColorInt int i2, float f2) {
        this.OLrzqt = i;
        this.EZpvd = f;
        this.AEQbTJ = i2;
        this.copydefault = f2;
        invalidate();
    }

    public final void setInnerCircleColor(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
        invalidate();
    }
}
