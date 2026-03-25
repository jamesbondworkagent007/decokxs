package o;

import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pyW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39764pyW extends LinearSnapHelper {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public android.view.View AEQbTJ;
    public boolean AYXKKw;
    public android.view.View AhwBna;
    public android.view.View EZpvd;
    public android.content.Context KWHzl;
    public boolean copydefault;
    public int djBIcL;
    public OrientationHelper gEmmrt;
    public int isConnected;
    public final RecyclerView valueOf;
    public android.widget.Scroller values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AYXKKw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.EZpvd = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.isConnected = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.view.View view) {
        this.AEQbTJ = view;
    }

    /* JADX INFO: renamed from: o.pyW$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pyW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public C39764pyW(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.valueOf = recyclerView;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public void attachToRecyclerView(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.KWHzl = recyclerView.getContext();
            this.values = new android.widget.Scroller(this.KWHzl, new android.view.animation.DecelerateInterpolator());
        } else {
            this.values = null;
            this.KWHzl = null;
        }
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper, androidx.recyclerview.widget.RecyclerView.OnFlingListener
    public boolean onFling(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.valueOf.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        double minFlingVelocity = this.valueOf.getMinFlingVelocity();
        if (java.lang.Math.abs(i2) > minFlingVelocity || java.lang.Math.abs(i) > minFlingVelocity) {
            OLrzqt(layoutManager, i);
        }
        return super.onFling(0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(RecyclerView.LayoutManager layoutManager, int i) {
        RecyclerView.SmoothScroller smoothScrollerCreateScroller;
        int i2;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) || (smoothScrollerCreateScroller = createScroller(layoutManager)) == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            boolean z = ViewCompat.getLayoutDirection(this.valueOf) == 1;
            android.view.View viewFindSnapView = this.AEQbTJ;
            if (viewFindSnapView == null) {
                viewFindSnapView = findSnapView(layoutManager);
            }
            if (viewFindSnapView == null) {
                return false;
            }
            int position = layoutManager.getPosition(viewFindSnapView);
            this.AEQbTJ = viewFindSnapView;
            int iAEQbTJ = yII.AEQbTJ(i);
            if (iAEQbTJ != -1) {
                if (iAEQbTJ != 1) {
                    return true;
                }
                i2 = z ? position - 1 : position + 1;
            } else if (z) {
            }
            if (i2 < ((LinearLayoutManager) layoutManager).getItemCount() && i2 >= 0) {
                RecyclerView.Adapter adapter = this.valueOf.getAdapter();
                Intrinsics.copydefault(adapter, "");
                android.view.View viewEZpvd = ((oZI) adapter).EZpvd(i2);
                this.AhwBna = viewEZpvd;
                this.EZpvd = viewEZpvd;
                smoothScrollerCreateScroller.setTargetPosition(i2);
                layoutManager.startSmoothScroll(smoothScrollerCreateScroller);
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(RecyclerView.LayoutManager layoutManager) {
        return AEQbTJ(layoutManager, OLrzqt(layoutManager));
    }

    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public int[] calculateDistanceToFinalSnap(@NotNull RecyclerView.LayoutManager layoutManager, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(layoutManager, "");
        Intrinsics.checkNotNullParameter(view, "");
        return new int[]{KWHzl(view, OLrzqt(layoutManager)), 0};
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public int[] calculateScrollDistance(int i, int i2) {
        int[] iArr = new int[2];
        OrientationHelper orientationHelper = this.gEmmrt;
        if (orientationHelper == null) {
            return iArr;
        }
        if (this.djBIcL == 0) {
            this.djBIcL = (orientationHelper.getEndAfterPadding() - orientationHelper.getStartAfterPadding()) / 2;
        }
        android.widget.Scroller scroller = this.values;
        if (scroller != null) {
            int i3 = this.djBIcL;
            scroller.fling(0, 0, i, i2, -i3, i3, 0, 0);
        }
        android.widget.Scroller scroller2 = this.values;
        iArr[0] = scroller2 != null ? scroller2.getFinalX() : 0;
        android.widget.Scroller scroller3 = this.values;
        iArr[1] = scroller3 != null ? scroller3.getFinalY() : 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public RecyclerView.SmoothScroller createScroller(@NotNull RecyclerView.LayoutManager layoutManager) {
        Intrinsics.checkNotNullParameter(layoutManager, "");
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider)) {
            return super.createScroller(layoutManager);
        }
        android.content.Context context = this.KWHzl;
        if (context == null) {
            return null;
        }
        return new Application(context, this, layoutManager);
    }

    /* JADX INFO: renamed from: o.pyW$Application */
    public static final class Application extends LinearSmoothScroller {
        public final /* synthetic */ C39764pyW AEQbTJ;
        public final /* synthetic */ RecyclerView.LayoutManager copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(android.content.Context context, C39764pyW c39764pyW, RecyclerView.LayoutManager layoutManager) {
            super(context);
            this.AEQbTJ = c39764pyW;
            this.copydefault = layoutManager;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(android.view.View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(state, "");
            Intrinsics.checkNotNullParameter(action, "");
            int[] iArrCalculateDistanceToFinalSnap = this.AEQbTJ.calculateDistanceToFinalSnap(this.copydefault, view);
            action.update(iArrCalculateDistanceToFinalSnap[0], iArrCalculateDistanceToFinalSnap[1], 250, this.mDecelerateInterpolator);
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(android.util.DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "");
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public final int KWHzl(android.view.View view, OrientationHelper orientationHelper) {
        int iAEQbTJ;
        boolean z = ViewCompat.getLayoutDirection(this.valueOf) == 1;
        if (this.copydefault) {
            iAEQbTJ = orientationHelper.getDecoratedStart(view);
        } else {
            RecyclerView.LayoutManager layoutManager = this.valueOf.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            iAEQbTJ = AEQbTJ((LinearLayoutManager) layoutManager, orientationHelper);
        }
        return z ? orientationHelper.getDecoratedEnd(view) - orientationHelper.getEndAfterPadding() : iAEQbTJ - orientationHelper.getStartAfterPadding();
    }

    public final int AEQbTJ(LinearLayoutManager linearLayoutManager, OrientationHelper orientationHelper) {
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        android.view.View view = this.AhwBna;
        int position = view != null ? linearLayoutManager.getPosition(view) : iFindFirstVisibleItemPosition;
        int iMax = java.lang.Math.max(position, iFindFirstVisibleItemPosition);
        int i = 0;
        for (int iMin = java.lang.Math.min(position, iFindFirstVisibleItemPosition); iMin < iMax; iMin++) {
            RecyclerView.Adapter adapter = this.valueOf.getAdapter();
            Intrinsics.copydefault(adapter, "");
            android.view.View viewEZpvd = ((oZI) adapter).EZpvd(iMin);
            if (viewEZpvd != null) {
                int decoratedMeasuredWidth = linearLayoutManager.getDecoratedMeasuredWidth(viewEZpvd);
                ViewGroup.LayoutParams layoutParams = viewEZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams, "");
                int i2 = ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).leftMargin;
                ViewGroup.LayoutParams layoutParams2 = viewEZpvd.getLayoutParams();
                Intrinsics.copydefault(layoutParams2, "");
                i += decoratedMeasuredWidth + i2 + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams2)).rightMargin;
            }
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            return 0;
        }
        boolean z = ViewCompat.getLayoutDirection(this.valueOf) == 1;
        if (position >= iFindFirstVisibleItemPosition || z) {
            int decoratedStart = orientationHelper.getDecoratedStart(viewFindViewByPosition);
            return i + decoratedStart;
        }
        return (-i) + orientationHelper.getDecoratedStart(viewFindViewByPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.view.View AEQbTJ(RecyclerView.LayoutManager layoutManager, OrientationHelper orientationHelper) {
        int childCount;
        android.view.View viewEZpvd;
        android.view.View viewEZpvd2;
        android.view.View view = this.EZpvd;
        if (view != null) {
            return view;
        }
        if (layoutManager == null || (childCount = layoutManager.getChildCount()) == 0) {
            return null;
        }
        boolean z = ViewCompat.getLayoutDirection(this.valueOf) == 1;
        int endAfterPadding = z ? orientationHelper.getEndAfterPadding() : orientationHelper.getStartAfterPadding();
        this.copydefault = false;
        int i = Integer.MAX_VALUE;
        android.view.View view2 = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = layoutManager.getChildAt(i2);
            int iAbs = java.lang.Math.abs((z ? orientationHelper.getDecoratedEnd(childAt) : orientationHelper.getDecoratedStart(childAt)) - endAfterPadding);
            if (iAbs < i) {
                if (this.AYXKKw || this.AEQbTJ == null) {
                    this.copydefault = true;
                    view2 = childAt;
                    i = iAbs;
                } else if (Intrinsics.EZpvd(childAt != null ? java.lang.Float.valueOf(childAt.getAlpha()) : null, 0.0f)) {
                }
            }
        }
        if (!this.copydefault) {
            android.view.View view3 = this.AEQbTJ;
            java.lang.Integer numValueOf = view3 != null ? java.lang.Integer.valueOf(layoutManager.getPosition(view3)) : null;
            pUU.KWHzl("findFirstView", "cant findView: closestView: adapterPosition " + numValueOf);
            if (numValueOf != null) {
                int i3 = this.isConnected;
                if (i3 == 1) {
                    RecyclerView.Adapter adapter = this.valueOf.getAdapter();
                    Intrinsics.copydefault(adapter, "");
                    oZI ozi = (oZI) adapter;
                    int iIntValue = numValueOf.intValue();
                    viewEZpvd = ozi.EZpvd(z ? iIntValue - 1 : iIntValue + 1);
                } else if (i3 != 2) {
                    viewEZpvd = this.AEQbTJ;
                } else {
                    RecyclerView.Adapter adapter2 = this.valueOf.getAdapter();
                    Intrinsics.copydefault(adapter2, "");
                    oZI ozi2 = (oZI) adapter2;
                    int iIntValue2 = numValueOf.intValue();
                    viewEZpvd = ozi2.EZpvd(z ? iIntValue2 + 1 : iIntValue2 - 1);
                }
                this.AhwBna = viewEZpvd;
            }
            view2 = this.AhwBna;
        } else if (view2 != null) {
            int position = layoutManager.getPosition(view2);
            pUU.KWHzl("findFirstView", "findView: closestView: adapterPosition " + position);
            int i4 = this.isConnected;
            if (i4 == 1) {
                RecyclerView.Adapter adapter3 = this.valueOf.getAdapter();
                Intrinsics.copydefault(adapter3, "");
                viewEZpvd2 = ((oZI) adapter3).EZpvd(position + 1);
            } else if (i4 == 2) {
                RecyclerView.Adapter adapter4 = this.valueOf.getAdapter();
                Intrinsics.copydefault(adapter4, "");
                viewEZpvd2 = ((oZI) adapter4).EZpvd(position - 1);
            } else {
                RecyclerView.Adapter adapter5 = this.valueOf.getAdapter();
                Intrinsics.copydefault(adapter5, "");
                viewEZpvd2 = ((oZI) adapter5).EZpvd(position);
            }
            this.AhwBna = viewEZpvd2;
        }
        this.EZpvd = view2;
        return view2;
    }

    public final OrientationHelper OLrzqt(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.gEmmrt;
        if (orientationHelper != null) {
            return orientationHelper;
        }
        OrientationHelper orientationHelperCreateHorizontalHelper = OrientationHelper.createHorizontalHelper(layoutManager);
        Intrinsics.checkNotNullExpressionValue(orientationHelperCreateHorizontalHelper, "");
        return orientationHelperCreateHorizontalHelper;
    }
}
