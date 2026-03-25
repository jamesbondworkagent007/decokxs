package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C8114awd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.awv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8132awv extends android.widget.FrameLayout {
    public boolean EZpvd;
    public final C8055avX KWHzl;
    public TaskDescription OLrzqt;
    public InterfaceC8113awc copydefault;

    /* JADX INFO: renamed from: o.awv$TaskDescription */
    public interface TaskDescription {
        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLayoutListener(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTouchListener(InterfaceC8113awc interfaceC8113awc) {
        this.copydefault = interfaceC8113awc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 o.avX)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r3v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(android.content.Context, o.avX, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.awv.<init>(android.content.Context, o.avX, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C8132awv(android.content.Context context, C8055avX c8055avX, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, c8055avX, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8132awv(@NotNull android.content.Context context, @NotNull C8055avX c8055avX, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c8055avX, "");
        this.KWHzl = c8055avX;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.EZpvd) {
            return;
        }
        this.EZpvd = true;
        TaskDescription taskDescription = this.OLrzqt;
        if (taskDescription != null) {
            taskDescription.copydefault();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        InterfaceC8113awc interfaceC8113awc;
        if (motionEvent != null && (interfaceC8113awc = this.copydefault) != null) {
            interfaceC8113awc.copydefault(motionEvent);
        }
        return this.KWHzl.zLjUOn() || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        InterfaceC8113awc interfaceC8113awc;
        if (motionEvent != null && (interfaceC8113awc = this.copydefault) != null) {
            interfaceC8113awc.copydefault(motionEvent);
        }
        return this.KWHzl.zLjUOn() || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        if (this.KWHzl.DbNXlk() && keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            C8129aws.copydefault(this.KWHzl.djBIcL());
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C8114awd.Application applicationKWHzl;
        Function0<Unit> function0AEQbTJ;
        super.onDetachedFromWindow();
        InterfaceC8111awa interfaceC8111awaOLrzqt = this.KWHzl.OLrzqt();
        if (interfaceC8111awaOLrzqt != null) {
            interfaceC8111awaOLrzqt.EZpvd();
        }
        C8114awd c8114awdAYXKKw = this.KWHzl.AYXKKw();
        if (c8114awdAYXKKw == null || (applicationKWHzl = c8114awdAYXKKw.KWHzl()) == null || (function0AEQbTJ = applicationKWHzl.AEQbTJ()) == null) {
            return;
        }
        function0AEQbTJ.invoke();
    }
}
