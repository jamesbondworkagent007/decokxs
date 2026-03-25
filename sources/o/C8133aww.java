package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8049avR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8133aww extends AbstractC8128awr {
    public int AEQbTJ;
    public android.graphics.Path AYXKKw;
    public android.graphics.Paint AhwBna;
    public float AkhnZx;
    public final Region DbNXlk;
    public boolean EZpvd;
    public float KWHzl;
    public InterfaceC8120awj OLrzqt;
    public int copydefault;
    public Region djBIcL;
    public RectF gEmmrt;
    public float isConnected;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8133aww(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8133aww(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:18) call: o.aww.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C8133aww(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8133aww(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = Color.parseColor("#99000000");
        this.copydefault = Color.parseColor("#99FF0000");
        this.AYXKKw = new android.graphics.Path();
        this.gEmmrt = new RectF();
        this.djBIcL = new Region();
        this.DbNXlk = new Region();
        this.isConnected = C8124awn.EZpvd.OLrzqt(context, 4.0f);
        if (attributeSet != null) {
            copydefault(attributeSet);
        }
        KWHzl();
        setWillNotDraw(false);
    }

    public final void copydefault(android.util.AttributeSet attributeSet) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C8049avR.TaskDescription.AEQbTJ, 0, 0);
        this.AEQbTJ = typedArrayObtainStyledAttributes.getColor(C8049avR.TaskDescription.OLrzqt, this.AEQbTJ);
        this.copydefault = typedArrayObtainStyledAttributes.getColor(C8049avR.TaskDescription.KWHzl, this.copydefault);
        this.valueOf = typedArrayObtainStyledAttributes.getInt(C8049avR.TaskDescription.copydefault, this.valueOf);
        this.isConnected = typedArrayObtainStyledAttributes.getDimension(C8049avR.TaskDescription.djBIcL, this.isConnected);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void KWHzl() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(this.AEQbTJ);
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Unit unit = Unit.INSTANCE;
        this.AhwBna = paint;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.AkhnZx = i;
        this.KWHzl = i2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        this.AYXKKw.reset();
        if (this.EZpvd) {
            android.graphics.Paint paint = this.AhwBna;
            if (paint == null) {
                Intrinsics.gEmmrt("");
            }
            paint.setColor(this.copydefault);
            int i = this.valueOf;
            if (i == 0) {
                this.gEmmrt.set(getPaddingLeft(), 0.0f, this.AkhnZx - getPaddingRight(), this.KWHzl * 2);
                this.AYXKKw.addOval(this.gEmmrt, Path.Direction.CW);
            } else if (i == 1) {
                this.gEmmrt.set(getPaddingLeft(), 0.0f, this.AkhnZx - getPaddingRight(), this.KWHzl);
                this.AYXKKw.addRect(this.gEmmrt, Path.Direction.CW);
            } else if (i == 2) {
                android.graphics.Path path = this.AYXKKw;
                float f = this.AkhnZx / 2;
                float f2 = this.KWHzl;
                path.addCircle(f, f2, f2, Path.Direction.CW);
            }
        } else {
            android.graphics.Paint paint2 = this.AhwBna;
            if (paint2 == null) {
                Intrinsics.gEmmrt("");
            }
            paint2.setColor(this.AEQbTJ);
            int i2 = this.valueOf;
            if (i2 == 0) {
                RectF rectF = this.gEmmrt;
                float paddingLeft = getPaddingLeft();
                float f3 = this.isConnected;
                float f4 = this.AkhnZx;
                float paddingRight = getPaddingRight();
                float f5 = this.isConnected;
                rectF.set(paddingLeft + f3, f3, (f4 - paddingRight) - f5, (this.KWHzl - f5) * 2);
                this.AYXKKw.addOval(this.gEmmrt, Path.Direction.CW);
                Region region = this.DbNXlk;
                int paddingLeft2 = getPaddingLeft();
                int i3 = (int) this.isConnected;
                region.set(paddingLeft2 + i3, i3, (int) ((this.AkhnZx - getPaddingRight()) - this.isConnected), (int) this.KWHzl);
            } else if (i2 == 1) {
                this.gEmmrt.set(getPaddingLeft(), this.isConnected, this.AkhnZx - getPaddingRight(), this.KWHzl);
                this.AYXKKw.addRect(this.gEmmrt, Path.Direction.CW);
                this.DbNXlk.set(getPaddingLeft(), (int) this.isConnected, ((int) this.AkhnZx) - getPaddingRight(), (int) this.KWHzl);
            } else if (i2 == 2) {
                android.graphics.Path path2 = this.AYXKKw;
                float f6 = this.AkhnZx / 2;
                float f7 = this.KWHzl;
                path2.addCircle(f6, f7, f7 - this.isConnected, Path.Direction.CW);
                this.DbNXlk.set(0, (int) this.isConnected, (int) this.AkhnZx, (int) this.KWHzl);
            }
            this.djBIcL.setPath(this.AYXKKw, this.DbNXlk);
        }
        if (canvas != null) {
            android.graphics.Path path3 = this.AYXKKw;
            android.graphics.Paint paint3 = this.AhwBna;
            if (paint3 == null) {
                Intrinsics.gEmmrt("");
            }
            canvas.drawPath(path3, paint3);
        }
        super.onDraw(canvas);
    }

    @Override // o.AbstractC8128awr
    public void setTouchRangeListener(@NotNull android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.OLrzqt = interfaceC8120awj;
        copydefault(motionEvent);
    }

    private final boolean copydefault(android.view.MotionEvent motionEvent) {
        InterfaceC8120awj interfaceC8120awj;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean zContains = this.djBIcL.contains(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        if (zContains != this.EZpvd) {
            this.EZpvd = zContains;
            invalidate();
        }
        InterfaceC8120awj interfaceC8120awj2 = this.OLrzqt;
        if (interfaceC8120awj2 != null) {
            interfaceC8120awj2.EZpvd(zContains, this);
        }
        if (motionEvent.getAction() == 1 && zContains && (interfaceC8120awj = this.OLrzqt) != null) {
            interfaceC8120awj.AEQbTJ();
        }
        return zContains;
    }
}
