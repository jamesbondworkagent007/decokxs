package o;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ViewTreeObserverOnGlobalLayoutListenerC52808wZc;

/* JADX INFO: renamed from: o.wZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C52823wZr extends AbstractC52819wZn {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C52823wZr() {
        this(0.0f, 1, null);
    }

    public C52823wZr(float f) {
        super(f);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:float:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r1v0 float))
 A[MD:(float):void (m)] (LINE:9) call: o.wZr.<init>(float):void type: THIS */
    public /* synthetic */ C52823wZr(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    @Override // o.AbstractC52819wZn
    public void AEQbTJ(float f, float f2, RectF rectF, ViewTreeObserverOnGlobalLayoutListenerC52808wZc.TaskDescription taskDescription) {
        Intrinsics.copydefault(taskDescription);
        Intrinsics.copydefault(rectF);
        taskDescription.OLrzqt(f + rectF.width() + AEQbTJ());
        taskDescription.EZpvd(rectF.top);
    }
}
