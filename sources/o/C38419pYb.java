package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C38419pYb extends android.widget.FrameLayout implements InterfaceC40497qYa {
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.Boolean EZpvd;
    public android.view.View KWHzl;
    public final /* synthetic */ C40500qYd copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38419pYb(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C38419pYb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40497qYa
    public java.lang.Boolean KWHzl(@NotNull android.view.ViewGroup viewGroup, android.view.View view, @NotNull android.view.MotionEvent motionEvent, boolean z) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(motionEvent, "");
        return this.copydefault.KWHzl(viewGroup, view, motionEvent, z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.pYb.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C38419pYb(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38419pYb(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = new C40500qYd();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.pXZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38419pYb.AEQbTJ(this.OLrzqt);
            }
        });
    }

    private final C38420pYc KWHzl() {
        return (C38420pYc) this.AEQbTJ.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.ViewParent */
    /* JADX WARN: Multi-variable type inference failed */
    public final android.view.View KWHzl(android.view.ViewParent viewParent) {
        android.view.View view = viewParent instanceof android.view.View ? (android.view.View) viewParent : null;
        while (view != null && ((!(view instanceof InterfaceC7475akY)) & (!(view instanceof InterfaceC7534ale)))) {
            java.lang.Object parent = view.getParent();
            view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view instanceof InterfaceC7534ale) {
                view.setNestedScrollingEnabled(true);
            }
        }
        return view;
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    private final android.view.View KWHzl(android.view.ViewGroup viewGroup, float f, float f2) {
        C38420pYc c38420pYcKWHzl;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if ((childAt instanceof C7545alp) && (c38420pYcKWHzl = KWHzl()) != null) {
                c38420pYcKWHzl.copydefault((C7545alp) childAt);
            }
            if (f >= childAt.getLeft() && f < childAt.getRight() && f2 >= childAt.getTop() && f2 < childAt.getBottom()) {
                if (childAt instanceof android.view.ViewGroup) {
                    android.view.View viewKWHzl = KWHzl((android.view.ViewGroup) childAt, f - r5.getLeft(), f2 - r5.getTop());
                    if (viewKWHzl != null) {
                        return viewKWHzl;
                    }
                }
                return childAt;
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        android.view.ViewParent parent;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            android.view.View viewKWHzl = KWHzl(this, motionEvent.getX(), motionEvent.getY());
            this.KWHzl = (viewKWHzl == null || (parent = viewKWHzl.getParent()) == null) ? null : KWHzl(parent);
            this.EZpvd = null;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.KWHzl = null;
            this.EZpvd = null;
        }
        android.view.View view = this.KWHzl;
        if (view != null) {
            this.EZpvd = KWHzl(this, view, motionEvent, true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        java.lang.Boolean bool = this.EZpvd;
        if (bool != null) {
            z = bool.booleanValue();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public static final C38420pYc AEQbTJ(C38419pYb c38419pYb) {
        android.view.View view;
        android.view.ViewParent parent = c38419pYb.getParent();
        while (true) {
            if (parent == null) {
                view = null;
                break;
            }
            if (parent instanceof C38420pYc) {
                view = (android.view.View) parent;
                if (view instanceof C38420pYc) {
                    break;
                }
            }
            parent = parent.getParent();
        }
        return (C38420pYc) view;
    }
}
