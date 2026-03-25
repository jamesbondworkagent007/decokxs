package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.okinc.market.widget.calendar.AttrsHolder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.qYY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qYZ implements qYY {
    public final InterfaceC56387yDm AEQbTJ;
    public final android.graphics.Rect EZpvd;
    public final int KWHzl;
    public final AttrsHolder OLrzqt;
    public final int copydefault;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AttrsHolder.DividerStyle.values().length];
            try {
                iArr[AttrsHolder.DividerStyle.DASHED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AttrsHolder.DividerStyle.DOTTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AttrsHolder KWHzl() {
        return this.OLrzqt;
    }

    public qYZ(@NotNull AttrsHolder attrsHolder, int i) {
        Intrinsics.checkNotNullParameter(attrsHolder, "");
        this.OLrzqt = attrsHolder;
        this.KWHzl = i;
        this.copydefault = 7;
        this.EZpvd = new android.graphics.Rect();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYZ.AEQbTJ(this.KWHzl);
            }
        });
    }

    public void EZpvd(boolean z, int i, int i2, int i3, int i4) {
        qYY.ActionBar.copydefault(this, z, i, i2, i3, i4);
    }

    public final android.graphics.Paint EZpvd() {
        return (android.graphics.Paint) this.AEQbTJ.getValue();
    }

    public static final android.graphics.Paint AEQbTJ(qYZ qyz) {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeWidth(qyz.KWHzl().fJNWhG());
        paint.setStyle(Paint.Style.STROKE);
        int i = ActionBar.AEQbTJ[qyz.KWHzl().fIwbmz().ordinal()];
        if (i == 1) {
            paint.setPathEffect(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f));
        } else if (i == 2) {
            paint.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.0f}, 0.0f));
        }
        return paint;
    }

    public void EZpvd(int i, int i2) {
        qYY.ActionBar.OLrzqt(this, i, i2);
        this.EZpvd.set(0, 0, i, i2);
    }

    public void OLrzqt(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        int iWidth = this.EZpvd.width();
        int iHeight = this.EZpvd.height();
        float strokeWidth = EZpvd().getStrokeWidth() / 2;
        EZpvd().setColor(KWHzl().getNewProxyInstance());
        if (KWHzl().iwGUEr()) {
            canvas.drawLine(0.0f, strokeWidth, iWidth, strokeWidth, EZpvd());
        }
        if (KWHzl().getFieldNames()) {
            float f = iHeight - strokeWidth;
            canvas.drawLine(0.0f, f, iWidth, f, EZpvd());
        }
        if (KWHzl().hDKMBd()) {
            int i = this.KWHzl;
            for (int i2 = 1; i2 < i; i2++) {
                float f2 = (i2 * iHeight) / this.KWHzl;
                canvas.drawLine(0.0f, f2, iWidth, f2, EZpvd());
            }
        }
        EZpvd().setColor(KWHzl().wlaJM());
        if (KWHzl().AxsJAY()) {
            canvas.drawLine(strokeWidth, 0.0f, strokeWidth, iHeight, EZpvd());
        }
        if (KWHzl().zuBGHE()) {
            float f3 = iWidth - strokeWidth;
            canvas.drawLine(f3, 0.0f, f3, iHeight, EZpvd());
        }
        if (KWHzl().gHZMYf()) {
            int i3 = this.copydefault;
            for (int i4 = 1; i4 < i3; i4++) {
                float f4 = (i4 * iWidth) / this.copydefault;
                canvas.drawLine(f4, 0.0f, f4, iHeight, EZpvd());
            }
        }
    }
}
