package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.okinc.im.imui.picker.CropShape;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37213opb extends android.view.View {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public CropShape EZpvd;
    public float KWHzl;

    /* JADX INFO: renamed from: o.opb$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CropShape.values().length];
            try {
                iArr[CropShape.CIRCLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CropShape.SQUARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C37213opb(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:15) call: o.opb.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C37213opb(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37213opb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = 300.0f;
        this.EZpvd = CropShape.SQUARE;
        this.AEQbTJ = 1426063360;
    }

    public final void setSquareSize(float f) {
        this.KWHzl = f;
        invalidate();
    }

    public final void setCropShape(@NotNull CropShape cropShape) {
        Intrinsics.checkNotNullParameter(cropShape, "");
        this.EZpvd = cropShape;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        PointF pointF = new PointF(getWidth() / 2, getHeight() / 2);
        float f = this.KWHzl;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(f, context);
        android.graphics.Path path = new android.graphics.Path();
        int i = ActionBar.EZpvd[this.EZpvd.ordinal()];
        if (i == 1) {
            path.addCircle(pointF.x, pointF.y, iCopydefault / 2, Path.Direction.CCW);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RectF rectF = new RectF();
            float f2 = pointF.x;
            float f3 = iCopydefault / 2;
            rectF.left = f2 - f3;
            rectF.right = f2 + f3;
            float f4 = pointF.y;
            rectF.top = f4 - f3;
            rectF.bottom = f4 + f3;
            path.addRect(rectF, Path.Direction.CCW);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawColor(this.AEQbTJ);
        canvas.restore();
    }

    /* JADX INFO: renamed from: o.opb$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
