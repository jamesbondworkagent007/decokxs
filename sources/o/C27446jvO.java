package o;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.okinc.business.invest_biz.ui.widget.transaction.CircularCountdownProgressView$start$1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jvO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27446jvO extends android.view.View {
    public int AEQbTJ;
    public int AYXKKw;
    public final android.graphics.Paint AhwBna;
    public float AkhnZx;
    public Job EZpvd;
    public final android.graphics.Paint KWHzl;
    public float OLrzqt;
    public TaskDescription copydefault;
    public int djBIcL;
    public final long fetchVPNInfo;
    public boolean gEmmrt;
    public float isConnected;
    public int valueOf;
    public CoroutineScope values;

    /* JADX INFO: renamed from: o.jvO$TaskDescription */
    public interface TaskDescription {
        default void AEQbTJ(int i, int i2, float f) {
        }

        void KWHzl();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27446jvO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C27446jvO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCountdownListener(TaskDescription taskDescription) {
        this.copydefault = taskDescription;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.jvO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C27446jvO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27446jvO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        this.KWHzl = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        this.AhwBna = paint2;
        this.djBIcL = 15;
        this.fetchVPNInfo = 100L;
        this.AkhnZx = 6.0f;
        this.isConnected = -90.0f;
        this.AEQbTJ = context.getColor(C52761wXj.Activity.ORxRYg);
        this.AYXKKw = context.getColor(C52761wXj.Activity.fdOvFl);
        setVisibility(8);
        if (attributeSet != null) {
            copydefault(attributeSet);
        }
    }

    public final void copydefault(android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C25493ixk.PendingIntent.OLrzqt);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.djBIcL = typedArrayObtainStyledAttributes.getInteger(C25493ixk.PendingIntent.KWHzl, 15);
            this.AkhnZx = typedArrayObtainStyledAttributes.getDimension(C25493ixk.PendingIntent.AEQbTJ, 6.0f);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(C25493ixk.PendingIntent.EZpvd, 0);
            if (resourceId != 0) {
                this.AEQbTJ = ContextCompat.getColor(getContext(), resourceId);
            } else {
                this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C25493ixk.PendingIntent.EZpvd, this.AEQbTJ);
            }
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C25493ixk.PendingIntent.copydefault, 0);
            if (resourceId2 != 0) {
                this.AYXKKw = ContextCompat.getColor(getContext(), resourceId2);
            } else {
                this.AYXKKw = typedArrayObtainStyledAttributes.getColor(C25493ixk.PendingIntent.copydefault, this.AYXKKw);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int iCopydefault = C56548yJl.copydefault((int) ((this.AkhnZx * 2) + getPaddingStart() + getPaddingEnd()), getSuggestedMinimumWidth());
        if (mode == Integer.MIN_VALUE) {
            size = C56548yJl.valueOf(iCopydefault, size);
        } else if (mode != 1073741824) {
            size = iCopydefault;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = C56548yJl.valueOf(iCopydefault, size2);
        } else if (mode2 != 1073741824) {
            size2 = iCopydefault;
        }
        int iCopydefault2 = C56548yJl.copydefault(size, size2);
        setMeasuredDimension(iCopydefault2, iCopydefault2);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = 2;
        float f2 = width / f;
        float f3 = height / f;
        float fCopydefault = C56548yJl.copydefault(((java.lang.Math.min(width, height) / f) - ((getPaddingStart() + getPaddingEnd()) / 2.0f)) - (this.AkhnZx / f), 0.0f);
        RectF rectF = new RectF(f2 - fCopydefault, f3 - fCopydefault, f2 + fCopydefault, f3 + fCopydefault);
        this.KWHzl.setColor(this.AEQbTJ);
        this.KWHzl.setStrokeWidth(this.AkhnZx);
        canvas.drawArc(rectF, 0.0f, 360.0f, false, this.KWHzl);
        if (this.OLrzqt > 0.0f) {
            this.AhwBna.setColor(this.AYXKKw);
            this.AhwBna.setStrokeWidth(this.AkhnZx);
            canvas.drawArc(rectF, this.isConnected, this.OLrzqt * 360.0f, false, this.AhwBna);
        }
    }

    public final void setMaxCountdownTime(int i) {
        if (i > 0) {
            this.djBIcL = i;
            this.valueOf = i;
            this.OLrzqt = 0.0f;
            invalidate();
        }
    }

    public final void setStrokeWidth(float f) {
        this.AkhnZx = f * getResources().getDisplayMetrics().density;
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.AEQbTJ = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        this.AYXKKw = i;
        invalidate();
    }

    public final void OLrzqt() {
        if (this.gEmmrt) {
            return;
        }
        KWHzl();
        boolean z = this.valueOf <= 0;
        this.gEmmrt = true;
        if (z) {
            this.valueOf = this.djBIcL;
            this.OLrzqt = 0.0f;
        }
        setVisibility(0);
        invalidate();
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
        this.values = CoroutineScope;
        this.EZpvd = CoroutineScope != null ? BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new CircularCountdownProgressView$start$1(this, null), 3, null) : null;
    }

    public final void KWHzl() {
        this.gEmmrt = false;
        Job job = this.EZpvd;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.EZpvd = null;
        CoroutineScope coroutineScope = this.values;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        this.values = null;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        KWHzl();
    }
}
