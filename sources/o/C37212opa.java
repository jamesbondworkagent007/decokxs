package o;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C37157ooY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37212opa extends AppCompatImageView {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final android.graphics.Matrix AEQbTJ;
    public float EZpvd;
    public boolean KWHzl;
    public C37157ooY copydefault;
    public float gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37212opa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37212opa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxZoomScale(float f) {
        this.gEmmrt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSquareSize(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.opa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C37212opa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37212opa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = new android.graphics.Matrix();
        this.EZpvd = 300.0f;
        this.gEmmrt = 4.0f;
        setScaleType(ImageView.ScaleType.MATRIX);
        this.copydefault = new C37157ooY(new C37157ooY.ActionBar() { // from class: o.opa.4
            @Override // o.C37157ooY.ActionBar
            public void OLrzqt(android.graphics.Matrix matrix) {
                if (C37212opa.this.KWHzl) {
                    return;
                }
                C37212opa.this.AEQbTJ.set(matrix);
                C37212opa c37212opa = C37212opa.this;
                c37212opa.setImageMatrix(c37212opa.AEQbTJ);
            }
        });
    }

    public final void copydefault(@NotNull final android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "");
        post(new java.lang.Runnable() { // from class: o.opc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C37212opa.OLrzqt(this.OLrzqt, bitmap);
            }
        });
    }

    public static final void OLrzqt(C37212opa c37212opa, android.graphics.Bitmap bitmap) {
        if (c37212opa.getWidth() <= 0 || c37212opa.getHeight() <= 0 || c37212opa.EZpvd <= 0.0f || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return;
        }
        c37212opa.KWHzl = true;
        int width = c37212opa.getWidth();
        int height = c37212opa.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        float fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(C55298xhM.dp2px$default(c37212opa.EZpvd, null, 1, null)));
        float f = width2;
        float f2 = height2;
        float fMax = java.lang.Math.max(fDjBIcL / f, fDjBIcL / f2);
        c37212opa.AEQbTJ.reset();
        c37212opa.AEQbTJ.setScale(fMax, fMax);
        c37212opa.AEQbTJ.postTranslate((width - (f * fMax)) / 2.0f, (height - (f2 * fMax)) / 2.0f);
        c37212opa.setImageMatrix(c37212opa.AEQbTJ);
        c37212opa.copydefault.EZpvd(c37212opa.AEQbTJ);
        c37212opa.copydefault.EZpvd(fMax, c37212opa.gEmmrt * fMax);
        c37212opa.KWHzl = false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.copydefault.copydefault(motionEvent);
    }

    /* JADX INFO: renamed from: o.opa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
