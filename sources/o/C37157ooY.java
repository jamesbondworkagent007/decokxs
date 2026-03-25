package o;

import android.graphics.PointF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37157ooY {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final ActionBar AEQbTJ;
    public int DbNXlk;
    public float OLrzqt;
    public float gEmmrt;
    public float isConnected = 1.0f;
    public float djBIcL = 4.0f;
    public final float[] copydefault = new float[9];
    public final android.graphics.Matrix EZpvd = new android.graphics.Matrix();
    public final android.graphics.Matrix valueOf = new android.graphics.Matrix();
    public final PointF AhwBna = new PointF();
    public final PointF AYXKKw = new PointF();

    /* JADX INFO: renamed from: o.ooY$ActionBar */
    public interface ActionBar {
        void OLrzqt(android.graphics.Matrix matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(float f, float f2) {
        this.isConnected = f;
        this.djBIcL = f2;
    }

    public C37157ooY(ActionBar actionBar) {
        this.AEQbTJ = actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean copydefault(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.DbNXlk = 1;
            this.AhwBna.set(motionEvent.getX(), motionEvent.getY());
            this.valueOf.set(this.EZpvd);
            EZpvd("ACTION_DOWN", this.valueOf);
        } else if (actionMasked == 1) {
            this.DbNXlk = 0;
            EZpvd("ACTION_UP/ACTION_POINTER_UP", this.EZpvd);
        } else if (actionMasked == 2) {
            int i = this.DbNXlk;
            if (i == 1) {
                float x = motionEvent.getX();
                float f = this.AhwBna.x;
                float y = motionEvent.getY();
                float f2 = this.AhwBna.y;
                this.EZpvd.set(this.valueOf);
                this.EZpvd.postTranslate(x - f, y - f2);
                KWHzl();
            } else if (i == 2) {
                float fEZpvd = EZpvd(motionEvent);
                if (fEZpvd > 10.0f) {
                    this.EZpvd.set(this.valueOf);
                    float f3 = fEZpvd / this.gEmmrt;
                    android.graphics.Matrix matrix = this.EZpvd;
                    PointF pointF = this.AYXKKw;
                    matrix.postScale(f3, f3, pointF.x, pointF.y);
                }
                float fAEQbTJ = AEQbTJ(motionEvent);
                float f4 = this.OLrzqt;
                android.graphics.Matrix matrix2 = this.EZpvd;
                PointF pointF2 = this.AYXKKw;
                matrix2.postRotate(fAEQbTJ - f4, pointF2.x, pointF2.y);
                PointF pointF3 = this.AYXKKw;
                copydefault(pointF3.x, pointF3.y);
                KWHzl();
            }
            EZpvd("ACTION_MOVE", this.EZpvd);
        } else if (actionMasked == 5) {
            this.DbNXlk = 2;
            this.gEmmrt = EZpvd(motionEvent);
            this.OLrzqt = AEQbTJ(motionEvent);
            if (this.gEmmrt > 10.0f) {
                this.valueOf.set(this.EZpvd);
                EZpvd(this.AYXKKw, motionEvent);
            }
        } else if (actionMasked == 6) {
        }
        return true;
    }

    public final void KWHzl() {
        ActionBar actionBar = this.AEQbTJ;
        if (actionBar != null) {
            actionBar.OLrzqt(this.EZpvd);
        }
    }

    public final float EZpvd(android.view.MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) java.lang.Math.sqrt((x * x) + (y * y));
    }

    public final float AEQbTJ(android.view.MotionEvent motionEvent) {
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    public final void EZpvd(PointF pointF, android.view.MotionEvent motionEvent) {
        float f = 2;
        pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / f, (motionEvent.getY(0) + motionEvent.getY(1)) / f);
    }

    public final void EZpvd(android.graphics.Matrix matrix) {
        this.EZpvd.set(matrix);
    }

    public final void EZpvd(java.lang.String str, android.graphics.Matrix matrix) {
        matrix.getValues(this.copydefault);
        java.lang.String string = java.util.Arrays.toString(this.copydefault);
        Intrinsics.checkNotNullExpressionValue(string, "");
        pUU.EZpvd("CropMatrixGestureDetector", str + " - Matrix: " + string);
    }

    public final void copydefault(float f, float f2) {
        float fOLrzqt = OLrzqt();
        float f3 = this.isConnected;
        if (fOLrzqt < f3) {
            float f4 = f3 / fOLrzqt;
            this.EZpvd.postScale(f4, f4, f, f2);
            return;
        }
        float f5 = this.djBIcL;
        if (fOLrzqt > f5) {
            float f6 = f5 / fOLrzqt;
            this.EZpvd.postScale(f6, f6, f, f2);
        }
    }

    public final float OLrzqt() {
        float[] fArr = new float[9];
        this.EZpvd.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[3];
        return (float) java.lang.Math.sqrt((f * f) + (f2 * f2));
    }

    /* JADX INFO: renamed from: o.ooY$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ooY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
