package o;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hST extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public InterfaceC21980hTl AEQbTJ;
    public int OLrzqt;
    public RectF copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hST(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC21980hTl interfaceC21980hTl) {
        this.AEQbTJ = interfaceC21980hTl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPanelClickListener(@NotNull InterfaceC21980hTl interfaceC21980hTl) {
        Intrinsics.checkNotNullParameter(interfaceC21980hTl, "");
        this.AEQbTJ = interfaceC21980hTl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:12) call: o.hST.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ hST(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hST(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hST.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && C36246oUr.copydefault().QVAiDq() == 0) {
            if (this.copydefault == null) {
                if (C36246oUr.copydefault().QKudOq() == 0) {
                    this.OLrzqt = KWHzl(20.0f);
                } else {
                    this.OLrzqt = KWHzl(40.0f);
                }
                this.copydefault = new RectF(C33129mqd.djBIcL(java.lang.Integer.valueOf(getLeft())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom() - this.OLrzqt)), C33129mqd.djBIcL(java.lang.Integer.valueOf(getRight())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom())));
            }
            RectF rectF = this.copydefault;
            if (rectF != null) {
                if (C36246oUr.copydefault().UrRBLY() && C36246oUr.copydefault().fARcdN() != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    InterfaceC21980hTl interfaceC21980hTl = this.AEQbTJ;
                    if (interfaceC21980hTl != null) {
                        interfaceC21980hTl.copydefault(1);
                    }
                    return true;
                }
                if (C36246oUr.copydefault().UrRBLY()) {
                    InterfaceC21980hTl interfaceC21980hTl2 = this.AEQbTJ;
                    if (interfaceC21980hTl2 != null) {
                        interfaceC21980hTl2.copydefault(0);
                    }
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int KWHzl(float f) {
        return (int) android.util.TypedValue.applyDimension(1, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }
}
