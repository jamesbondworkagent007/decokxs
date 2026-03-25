package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.ViewKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qSQ extends C40369qTh {
    public final InterfaceC56387yDm AEQbTJ;
    public final /* synthetic */ qZC EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public boolean copydefault;
    public RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSQ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qSQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd.EZpvd(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoHideKeyboardByScrollingEnable$OKMarket_market_impl(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.qSQ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ qSQ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qSQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new qZC();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qSS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSQ.KWHzl(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSQ.EZpvd(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qSP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qSQ.AEQbTJ();
            }
        });
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    public final android.view.View EZpvd(android.view.ViewGroup viewGroup, float f, float f2) {
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if ((!(childAt instanceof FragmentContainerView) || ((android.view.ViewGroup) childAt).getChildCount() != 0) && !isConnected().contains(childAt) && f >= childAt.getLeft() && f < childAt.getRight() && f2 >= childAt.getTop() && f2 < childAt.getBottom()) {
                if (childAt instanceof android.view.ViewGroup) {
                    android.view.View viewEZpvd = EZpvd((android.view.ViewGroup) childAt, f - r4.getLeft(), f2 - r4.getTop());
                    if (viewEZpvd != null) {
                        return viewEZpvd;
                    }
                }
                return childAt;
            }
        }
    }

    private final BottomSheetBehavior<android.widget.FrameLayout> AkhnZx() {
        return (BottomSheetBehavior) this.AEQbTJ.getValue();
    }

    public final void djBIcL() {
        BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehaviorAkhnZx = AkhnZx();
        if (bottomSheetBehaviorAkhnZx != null) {
            try {
                java.lang.reflect.Field declaredField = bottomSheetBehaviorAkhnZx.getClass().getDeclaredField("nestedScrollingChildRef");
                declaredField.setAccessible(true);
                RecyclerView recyclerView = this.valueOf;
                if (recyclerView != null) {
                    declaredField.set(bottomSheetBehaviorAkhnZx, new WeakReference(recyclerView));
                    Unit unit = Unit.INSTANCE;
                }
            } catch (java.lang.Exception e) {
                C40375qTn.AEQbTJ.KWHzl("NavSearchNestedScrollRootLayout", "Failed to set nestedScrollingChildRef via reflection", e);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    public static final class ActionBar extends RecyclerView.OnScrollListener {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if ((i == 1 || i == 2) && qSQ.this.copydefault()) {
                qSQ.this.EZpvd(recyclerView);
            }
        }
    }

    private final ActionBar DbNXlk() {
        return (ActionBar) this.OLrzqt.getValue();
    }

    public static final ActionBar EZpvd(qSQ qsq) {
        return qsq.new ActionBar();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            RecyclerView recyclerView = this.valueOf;
            if (recyclerView != null) {
                recyclerView.setNestedScrollingEnabled(false);
            }
            RecyclerView recyclerView2 = this.valueOf;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(DbNXlk());
            }
            android.view.View viewEZpvd = EZpvd(this, motionEvent.getX(), motionEvent.getY());
            RecyclerView recyclerViewAEQbTJ = viewEZpvd != null ? AEQbTJ(viewEZpvd) : null;
            this.valueOf = recyclerViewAEQbTJ;
            if (recyclerViewAEQbTJ != null) {
                recyclerViewAEQbTJ.removeOnScrollListener(DbNXlk());
            }
            RecyclerView recyclerView3 = this.valueOf;
            if (recyclerView3 != null) {
                recyclerView3.addOnScrollListener(DbNXlk());
            }
            RecyclerView recyclerView4 = this.valueOf;
            if (recyclerView4 != null) {
                recyclerView4.setNestedScrollingEnabled(true);
            }
            djBIcL();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private final java.util.Set<android.view.View> isConnected() {
        return (java.util.Set) this.KWHzl.getValue();
    }

    public static final java.util.Set AEQbTJ() {
        return new LinkedHashSet();
    }

    public final void setNestedFindingIgnoreViews$OKMarket_market_impl(@NotNull android.view.View... viewArr) {
        Intrinsics.checkNotNullParameter(viewArr, "");
        isConnected().clear();
        C56406yEe.KWHzl(isConnected(), viewArr);
    }

    public final RecyclerView AEQbTJ(android.view.View view) {
        android.view.View view2;
        android.view.ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                view2 = null;
                break;
            }
            if (parent instanceof RecyclerView) {
                view2 = (android.view.View) parent;
                if (view2 instanceof RecyclerView) {
                    break;
                }
            }
            parent = parent.getParent();
        }
        RecyclerView recyclerView = (RecyclerView) view2;
        if (recyclerView == null) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        boolean z = layoutManager instanceof LinearLayoutManager;
        if (!z || ((LinearLayoutManager) layoutManager).getOrientation() != 1) {
            if (z && ((LinearLayoutManager) layoutManager).getOrientation() == 0) {
                return null;
            }
            if (!recyclerView.canScrollVertically(1) && !recyclerView.canScrollVertically(-1)) {
                return null;
            }
        }
        return recyclerView;
    }

    public static final BottomSheetBehavior KWHzl(qSQ qsq) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(qsq));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
        BottomSheetDialogFragment bottomSheetDialogFragment = fragment instanceof BottomSheetDialogFragment ? (BottomSheetDialogFragment) fragment : null;
        android.app.Dialog dialog = bottomSheetDialogFragment != null ? bottomSheetDialogFragment.getDialog() : null;
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            return bottomSheetDialog.getBehavior();
        }
        return null;
    }
}
