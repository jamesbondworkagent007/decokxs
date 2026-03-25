package o;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc;

/* JADX INFO: renamed from: o.wZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC52819wZn implements ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Application {
    public float EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC52819wZn() {
        this(0.0f, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.EZpvd;
    }

    public abstract void AEQbTJ(float f, float f2, RectF rectF, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.TaskDescription taskDescription);

    public final void EZpvd(float f, float f2, RectF rectF, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.TaskDescription taskDescription) {
    }

    public AbstractC52819wZn(float f) {
        this.EZpvd = f;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r1v0 float))
 A[MD:(float):void (m)] (LINE:10) call: o.wZn.<init>(float):void type: THIS */
    public /* synthetic */ AbstractC52819wZn(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    @Override // o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc.Application
    public void OLrzqt(float f, float f2, RectF rectF, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.TaskDescription taskDescription) {
        AEQbTJ(f, f2, rectF, taskDescription);
        EZpvd(f, f2, rectF, taskDescription);
    }
}
