package o;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32235mUm extends android.widget.LinearLayout {
    public InterfaceC32245mUw EZpvd;
    public int KWHzl;
    public RectF OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32235mUm(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setListener(InterfaceC32245mUw interfaceC32245mUw) {
        this.EZpvd = interfaceC32245mUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPanelClickListener(@NotNull InterfaceC32245mUw interfaceC32245mUw) {
        Intrinsics.checkNotNullParameter(interfaceC32245mUw, "");
        this.EZpvd = interfaceC32245mUw;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:13) call: o.mUm.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32235mUm(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32235mUm(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.mUm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mUm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0 && C36246oUr.copydefault().QVAiDq() == 0) {
            if (this.OLrzqt == null) {
                if (C36246oUr.copydefault().QKudOq() == 0) {
                    this.KWHzl = AEQbTJ(20.0f);
                } else {
                    this.KWHzl = AEQbTJ(40.0f);
                }
                this.OLrzqt = new RectF(C33129mqd.djBIcL(java.lang.Integer.valueOf(getLeft())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom() - this.KWHzl)), C33129mqd.djBIcL(java.lang.Integer.valueOf(getRight())), C33129mqd.djBIcL(java.lang.Integer.valueOf(getBottom())));
            }
            RectF rectF = this.OLrzqt;
            if (rectF != null) {
                if (C36246oUr.copydefault().UrRBLY() && C36246oUr.copydefault().fARcdN() != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    InterfaceC32245mUw interfaceC32245mUw = this.EZpvd;
                    if (interfaceC32245mUw != null) {
                        interfaceC32245mUw.EZpvd(1);
                    }
                    return true;
                }
                if (C36246oUr.copydefault().UrRBLY()) {
                    InterfaceC32245mUw interfaceC32245mUw2 = this.EZpvd;
                    if (interfaceC32245mUw2 != null) {
                        interfaceC32245mUw2.EZpvd(0);
                    }
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final int AEQbTJ(float f) {
        return (int) android.util.TypedValue.applyDimension(1, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }
}
