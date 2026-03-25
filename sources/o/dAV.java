package o;

import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class dAV implements ViewPager2.PageTransformer {
    public final float EZpvd;
    public final float KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public dAV() {
        this(0.0f, 1, null);
    }

    public dAV(float f) {
        this.KWHzl = f;
        this.EZpvd = 0.5f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0007: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.85f float) : (r1v0 float))
 A[MD:(float):void (m)] (LINE:6) call: o.dAV.<init>(float):void type: THIS */
    public /* synthetic */ dAV(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.85f : f);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NotNull android.view.View view, float f) {
        Intrinsics.checkNotNullParameter(view, "");
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2.0f);
        float f2 = width;
        view.setPivotX(f2 / 2.0f);
        if (f < -1.0f) {
            view.setScaleX(this.KWHzl);
            view.setScaleY(this.KWHzl);
            view.setPivotX(f2);
            return;
        }
        if (f > 1.0f) {
            view.setScaleX(this.KWHzl);
            view.setScaleY(this.KWHzl);
            view.setPivotX(0.0f);
            return;
        }
        if (f < 0.0f) {
            float f3 = 1;
            float f4 = this.KWHzl;
            float f5 = ((f3 + f) * (f3 - f4)) + f4;
            view.setScaleX(f5);
            view.setScaleY(f5);
            float f6 = this.EZpvd;
            view.setPivotX(f2 * (f6 + ((-f) * f6)));
            return;
        }
        float f7 = 1;
        float f8 = f7 - f;
        float f9 = this.KWHzl;
        float f10 = ((f7 - f9) * f8) + f9;
        view.setScaleX(f10);
        view.setScaleY(f10);
        view.setPivotX(f2 * f8 * this.EZpvd);
    }
}
