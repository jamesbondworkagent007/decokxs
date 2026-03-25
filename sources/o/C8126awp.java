package o;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8126awp extends AbstractC8128awr {
    public float AEQbTJ;
    public float AYXKKw;
    public Region AhwBna;
    public InterfaceC8120awj EZpvd;
    public android.graphics.Paint KWHzl;
    public boolean OLrzqt;
    public android.graphics.Path copydefault;
    public final Region djBIcL;
    public float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8126awp(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8126awp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.awp.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C8126awp(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8126awp(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new android.graphics.Path();
        this.AhwBna = new Region();
        this.djBIcL = new Region();
        this.AYXKKw = 18.0f;
        OLrzqt();
        setWillNotDraw(false);
    }

    public final void OLrzqt() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(Color.parseColor("#AA000000"));
        paint.setStrokeWidth(10.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Unit unit = Unit.INSTANCE;
        this.KWHzl = paint;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.valueOf = i;
        this.AEQbTJ = i2;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        this.copydefault.reset();
        if (this.OLrzqt) {
            android.graphics.Path path = this.copydefault;
            float f = this.valueOf;
            float f2 = this.AEQbTJ;
            path.addCircle(f, f2, java.lang.Math.min(f, f2), Path.Direction.CW);
        } else {
            android.graphics.Path path2 = this.copydefault;
            float f3 = this.valueOf;
            float f4 = this.AEQbTJ;
            path2.addCircle(f3, f4, java.lang.Math.min(f3, f4) - this.AYXKKw, Path.Direction.CW);
            Region region = this.djBIcL;
            int i = (int) this.AYXKKw;
            region.set(i, i, (int) this.valueOf, (int) this.AEQbTJ);
            this.AhwBna.setPath(this.copydefault, this.djBIcL);
        }
        if (canvas != null) {
            android.graphics.Path path3 = this.copydefault;
            android.graphics.Paint paint = this.KWHzl;
            if (paint == null) {
                Intrinsics.gEmmrt("");
            }
            canvas.drawPath(path3, paint);
        }
        super.onDraw(canvas);
    }

    @Override // o.AbstractC8128awr
    public void setTouchRangeListener(@NotNull android.view.MotionEvent motionEvent, InterfaceC8120awj interfaceC8120awj) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.EZpvd = interfaceC8120awj;
        copydefault(motionEvent);
    }

    public final boolean copydefault(android.view.MotionEvent motionEvent) {
        InterfaceC8120awj interfaceC8120awj;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean zContains = this.AhwBna.contains(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        if (zContains != this.OLrzqt) {
            this.OLrzqt = zContains;
            invalidate();
        }
        InterfaceC8120awj interfaceC8120awj2 = this.EZpvd;
        if (interfaceC8120awj2 != null) {
            interfaceC8120awj2.EZpvd(zContains, this);
        }
        if (motionEvent.getAction() == 1 && zContains && (interfaceC8120awj = this.EZpvd) != null) {
            interfaceC8120awj.AEQbTJ();
        }
        return zContains;
    }
}
