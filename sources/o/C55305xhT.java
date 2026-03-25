package o;

import android.view.accessibility.AccessibilityNodeInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xhT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55305xhT extends android.view.TouchDelegate {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final android.graphics.Rect OLrzqt = new android.graphics.Rect();
    public final InterfaceC56387yDm AEQbTJ;
    public android.view.TouchDelegate copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55305xhT(@NotNull android.view.View view) {
        super(OLrzqt, view);
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.xhU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C55305xhT.KWHzl();
            }
        });
    }

    /* JADX INFO: renamed from: o.xhT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xhT.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.util.ArrayList<android.view.TouchDelegate> EZpvd() {
        return (java.util.ArrayList) this.AEQbTJ.getValue();
    }

    public static final java.util.ArrayList KWHzl() {
        return new java.util.ArrayList();
    }

    public final void EZpvd(@NotNull android.view.TouchDelegate touchDelegate) {
        Intrinsics.checkNotNullParameter(touchDelegate, "");
        EZpvd().add(touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        int action = motionEvent.getAction();
        android.view.TouchDelegate touchDelegate = null;
        if (action == 0) {
            java.util.Iterator<android.view.TouchDelegate> it = EZpvd().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                android.view.TouchDelegate next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "");
                android.view.TouchDelegate touchDelegate2 = next;
                if (touchDelegate2.onTouchEvent(motionEvent)) {
                    this.copydefault = touchDelegate2;
                    return true;
                }
            }
        } else if (action == 1) {
            android.view.TouchDelegate touchDelegate3 = this.copydefault;
            this.copydefault = null;
            touchDelegate = touchDelegate3;
        } else if (action == 3) {
            this.copydefault = null;
        }
        if (touchDelegate != null) {
            return touchDelegate.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.TouchDelegate
    public boolean onTouchExplorationHoverEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        android.view.TouchDelegate touchDelegate = this.copydefault;
        if (touchDelegate != null) {
            return touchDelegate.onTouchExplorationHoverEvent(motionEvent);
        }
        return super.onTouchExplorationHoverEvent(motionEvent);
    }

    @Override // android.view.TouchDelegate
    public AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        android.view.TouchDelegate touchDelegate = this.copydefault;
        if (touchDelegate != null && (touchDelegateInfo = touchDelegate.getTouchDelegateInfo()) != null) {
            return touchDelegateInfo;
        }
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo2 = super.getTouchDelegateInfo();
        Intrinsics.checkNotNullExpressionValue(touchDelegateInfo2, "");
        return touchDelegateInfo2;
    }
}
