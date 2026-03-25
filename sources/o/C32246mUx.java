package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32246mUx extends ConstraintLayout {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C32246mUx(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:8) call: o.mUx.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C32246mUx(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32246mUx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View next;
        super.onLayout(z, i, i2, i3, i4);
        java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            android.view.View view = next;
            C32247mUy c32247mUy = view instanceof C32247mUy ? (C32247mUy) view : null;
            if (c32247mUy != null && c32247mUy.OLrzqt()) {
                break;
            }
        }
        boolean z2 = next != null;
        for (android.view.View view2 : ViewGroupKt.getChildren(this)) {
            if (z2) {
                C32247mUy c32247mUy2 = view2 instanceof C32247mUy ? (C32247mUy) view2 : null;
                if (c32247mUy2 != null) {
                    c32247mUy2.setVerticalStyle();
                }
            } else {
                C32247mUy c32247mUy3 = view2 instanceof C32247mUy ? (C32247mUy) view2 : null;
                if (c32247mUy3 != null) {
                    c32247mUy3.setHorizontalStyle();
                }
            }
        }
    }
}
