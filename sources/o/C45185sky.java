package o;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C45185sky;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45185sky {
    public static final void EZpvd(@NotNull RecyclerView recyclerView, @NotNull C45001shZ c45001shZ, @NotNull Function1<? super java.lang.Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(c45001shZ, "");
        Intrinsics.checkNotNullParameter(function1, "");
        recyclerView.setAdapter(c45001shZ);
        int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
        int iDp2px$default2 = C55298xhM.dp2px$default(8.0f, null, 1, null);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 1, 0, false));
        recyclerView.setClipToPadding(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        if (recyclerView.getItemDecorationCount() > 0) {
            for (int itemDecorationCount = recyclerView.getItemDecorationCount() - 1; -1 < itemDecorationCount; itemDecorationCount--) {
                recyclerView.removeItemDecorationAt(itemDecorationCount);
            }
        }
        recyclerView.addItemDecoration(new Application(iDp2px$default, iDp2px$default2));
        recyclerView.addOnChildAttachStateChangeListener(new PendingIntent(c45001shZ, iDp2px$default));
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.copydefault(layoutManager, "");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        recyclerView.addOnScrollListener(new TaskDescription(c45001shZ, booleanRef, function1, recyclerView, gridLayoutManager));
        recyclerView.addOnChildAttachStateChangeListener(new StateListAnimator(booleanRef, recyclerView, c45001shZ, function1, gridLayoutManager));
        ActionBar actionBar = new ActionBar(booleanRef, recyclerView, booleanRef2, c45001shZ, iDp2px$default, function1, gridLayoutManager);
        if (!booleanRef2.element) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(actionBar);
            booleanRef2.element = true;
        }
        c45001shZ.registerAdapterDataObserver(new Activity(recyclerView, booleanRef2, actionBar, booleanRef, c45001shZ, iDp2px$default));
        KWHzl(c45001shZ, recyclerView, iDp2px$default);
    }

    public static final void KWHzl(C45001shZ c45001shZ, RecyclerView recyclerView, int i) {
        if (c45001shZ.getItemCount() <= 1) {
            if (recyclerView.getPaddingLeft() == i && recyclerView.getPaddingRight() == i) {
                return;
            }
            recyclerView.setPadding(i, recyclerView.getPaddingTop(), i, recyclerView.getPaddingBottom());
            return;
        }
        if (recyclerView.getPaddingLeft() == 0 && recyclerView.getPaddingRight() == 0) {
            return;
        }
        recyclerView.setPadding(0, recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
    }

    /* JADX INFO: renamed from: o.sky$Application */
    public static final class Application extends RecyclerView.ItemDecoration {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int KWHzl;

        public Application(int i, int i2) {
            this.KWHzl = i;
            this.AEQbTJ = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
            Intrinsics.checkNotNullParameter(rect, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(state, "");
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount <= 1) {
                return;
            }
            boolean z = ViewCompat.getLayoutDirection(recyclerView) == 1;
            boolean z2 = childAdapterPosition == 0;
            boolean z3 = childAdapterPosition == itemCount - 1;
            rect.set(0, 0, 0, 0);
            if (!z) {
                if (z2) {
                    rect.left = this.KWHzl;
                }
                rect.right = z3 ? this.KWHzl : this.AEQbTJ;
            } else {
                if (z2) {
                    rect.right = this.KWHzl;
                }
                rect.left = z3 ? this.KWHzl : this.AEQbTJ;
            }
        }
    }

    public static final int OLrzqt(C45001shZ c45001shZ, int i) {
        int iOLrzqt = C33097mpy.OLrzqt(C32979mnm.EZpvd.OLrzqt());
        if (c45001shZ.getItemCount() <= 1) {
            return C56548yJl.copydefault(iOLrzqt - (i * 2), 0);
        }
        return C56548yJl.copydefault(yII.EZpvd(iOLrzqt * 0.75f), 0);
    }

    public static final void KWHzl(RecyclerView recyclerView, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (i <= 0) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            if (childAt != null && (layoutParams = childAt.getLayoutParams()) != null && layoutParams.width != i) {
                layoutParams.width = i;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: renamed from: o.sky$PendingIntent */
    public static final class PendingIntent implements RecyclerView.OnChildAttachStateChangeListener {
        public final /* synthetic */ C45001shZ KWHzl;
        public final /* synthetic */ int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public PendingIntent(C45001shZ c45001shZ, int i) {
            this.KWHzl = c45001shZ;
            this.OLrzqt = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            int iOLrzqt = C45185sky.OLrzqt(this.KWHzl, this.OLrzqt);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || iOLrzqt <= 0 || layoutParams.width == iOLrzqt) {
                return;
            }
            layoutParams.width = iOLrzqt;
            view.setLayoutParams(layoutParams);
        }
    }

    public static final void OLrzqt(C45001shZ c45001shZ, Ref.BooleanRef booleanRef, Function1<? super java.lang.Integer, Unit> function1, RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
        int iCopydefault = copydefault(recyclerView, gridLayoutManager);
        if (iCopydefault == -1) {
            return;
        }
        if (c45001shZ.getItemCount() <= 1) {
            if (booleanRef.element) {
                return;
            }
            function1.invoke(java.lang.Integer.valueOf(iCopydefault));
            booleanRef.element = true;
            return;
        }
        function1.invoke(java.lang.Integer.valueOf(iCopydefault));
    }

    /* JADX INFO: renamed from: o.sky$TaskDescription */
    public static final class TaskDescription extends RecyclerView.OnScrollListener {
        public final /* synthetic */ RecyclerView AEQbTJ;
        public final /* synthetic */ GridLayoutManager EZpvd;
        public final /* synthetic */ C45001shZ KWHzl;
        public final /* synthetic */ Ref.BooleanRef OLrzqt;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(C45001shZ c45001shZ, Ref.BooleanRef booleanRef, Function1<? super java.lang.Integer, Unit> function1, RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
            this.KWHzl = c45001shZ;
            this.OLrzqt = booleanRef;
            this.copydefault = function1;
            this.AEQbTJ = recyclerView;
            this.EZpvd = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            if (i == 0) {
                if (this.KWHzl.getItemCount() > 1 || !this.OLrzqt.element) {
                    final C45001shZ c45001shZ = this.KWHzl;
                    final Ref.BooleanRef booleanRef = this.OLrzqt;
                    final Function1<java.lang.Integer, Unit> function1 = this.copydefault;
                    final RecyclerView recyclerView2 = this.AEQbTJ;
                    final GridLayoutManager gridLayoutManager = this.EZpvd;
                    recyclerView.post(new java.lang.Runnable() { // from class: o.skv
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C45185sky.TaskDescription.AEQbTJ(c45001shZ, booleanRef, function1, recyclerView2, gridLayoutManager);
                        }
                    });
                }
            }
        }

        public static final void AEQbTJ(C45001shZ c45001shZ, Ref.BooleanRef booleanRef, Function1 function1, RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
            C45185sky.OLrzqt(c45001shZ, booleanRef, function1, recyclerView, gridLayoutManager);
        }
    }

    /* JADX INFO: renamed from: o.sky$StateListAnimator */
    public static final class StateListAnimator implements RecyclerView.OnChildAttachStateChangeListener {
        public final /* synthetic */ C45001shZ AEQbTJ;
        public final /* synthetic */ RecyclerView EZpvd;
        public final /* synthetic */ GridLayoutManager KWHzl;
        public final /* synthetic */ Function1<java.lang.Integer, Unit> OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Ref.BooleanRef booleanRef, RecyclerView recyclerView, C45001shZ c45001shZ, Function1<? super java.lang.Integer, Unit> function1, GridLayoutManager gridLayoutManager) {
            this.copydefault = booleanRef;
            this.EZpvd = recyclerView;
            this.AEQbTJ = c45001shZ;
            this.OLrzqt = function1;
            this.KWHzl = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            final Ref.BooleanRef booleanRef = this.copydefault;
            if (!booleanRef.element) {
                final RecyclerView recyclerView = this.EZpvd;
                final C45001shZ c45001shZ = this.AEQbTJ;
                final Function1<java.lang.Integer, Unit> function1 = this.OLrzqt;
                final GridLayoutManager gridLayoutManager = this.KWHzl;
                recyclerView.post(new java.lang.Runnable() { // from class: o.skw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C45185sky.StateListAnimator.copydefault(c45001shZ, booleanRef, function1, recyclerView, gridLayoutManager);
                    }
                });
            }
            this.EZpvd.removeOnChildAttachStateChangeListener(this);
        }

        public static final void copydefault(C45001shZ c45001shZ, Ref.BooleanRef booleanRef, Function1 function1, RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
            C45185sky.OLrzqt(c45001shZ, booleanRef, function1, recyclerView, gridLayoutManager);
        }
    }

    /* JADX INFO: renamed from: o.sky$ActionBar */
    public static final class ActionBar implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Function1<java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ GridLayoutManager EZpvd;
        public final /* synthetic */ C45001shZ KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;
        public final /* synthetic */ Ref.BooleanRef gEmmrt;
        public final /* synthetic */ RecyclerView valueOf;

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Ref.BooleanRef booleanRef, RecyclerView recyclerView, Ref.BooleanRef booleanRef2, C45001shZ c45001shZ, int i, Function1<? super java.lang.Integer, Unit> function1, GridLayoutManager gridLayoutManager) {
            this.copydefault = booleanRef;
            this.valueOf = recyclerView;
            this.gEmmrt = booleanRef2;
            this.KWHzl = c45001shZ;
            this.OLrzqt = i;
            this.AEQbTJ = function1;
            this.EZpvd = gridLayoutManager;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C45185sky.KWHzl(this.valueOf, C45185sky.OLrzqt(this.KWHzl, this.OLrzqt));
            if (!this.copydefault.element && this.valueOf.getChildCount() != 0) {
                C45185sky.OLrzqt(this.KWHzl, this.copydefault, this.AEQbTJ, this.valueOf, this.EZpvd);
            }
            this.valueOf.invalidateItemDecorations();
            this.valueOf.getViewTreeObserver().removeOnPreDrawListener(this);
            this.gEmmrt.element = false;
            return true;
        }
    }

    /* JADX INFO: renamed from: o.sky$Activity */
    public static final class Activity extends RecyclerView.AdapterDataObserver {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ C45001shZ OLrzqt;
        public final /* synthetic */ Ref.BooleanRef copydefault;
        public final /* synthetic */ RecyclerView valueOf;

        public Activity(RecyclerView recyclerView, Ref.BooleanRef booleanRef, ActionBar actionBar, Ref.BooleanRef booleanRef2, C45001shZ c45001shZ, int i) {
            this.valueOf = recyclerView;
            this.copydefault = booleanRef;
            this.EZpvd = actionBar;
            this.KWHzl = booleanRef2;
            this.OLrzqt = c45001shZ;
            this.AEQbTJ = i;
        }

        public final void AEQbTJ() {
            final RecyclerView recyclerView = this.valueOf;
            final Ref.BooleanRef booleanRef = this.copydefault;
            final ActionBar actionBar = this.EZpvd;
            final Ref.BooleanRef booleanRef2 = this.KWHzl;
            final C45001shZ c45001shZ = this.OLrzqt;
            final int i = this.AEQbTJ;
            recyclerView.post(new java.lang.Runnable() { // from class: o.skA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45185sky.Activity.KWHzl(recyclerView, booleanRef, actionBar, booleanRef2, c45001shZ, i);
                }
            });
        }

        public static final void KWHzl(RecyclerView recyclerView, Ref.BooleanRef booleanRef, ActionBar actionBar, Ref.BooleanRef booleanRef2, C45001shZ c45001shZ, int i) {
            C45185sky.KWHzl(c45001shZ, recyclerView, i);
            C45185sky.KWHzl(recyclerView, C45185sky.OLrzqt(c45001shZ, i));
            recyclerView.invalidateItemDecorations();
            if (!booleanRef.element) {
                recyclerView.getViewTreeObserver().addOnPreDrawListener(actionBar);
                booleanRef.element = true;
            }
            booleanRef2.element = false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            AEQbTJ();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            AEQbTJ();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            AEQbTJ();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            AEQbTJ();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, java.lang.Object obj) {
            AEQbTJ();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            AEQbTJ();
        }
    }

    public static final int copydefault(RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
        int iAbs;
        int i = -1;
        if (recyclerView.getChildCount() == 0) {
            return -1;
        }
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition != -1) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = ((recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight()) / 2;
            if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                int i2 = Integer.MAX_VALUE;
                while (true) {
                    android.view.View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null && (iAbs = java.lang.Math.abs(((viewFindViewByPosition.getLeft() + viewFindViewByPosition.getRight()) / 2) - (paddingLeft + width))) < i2) {
                        i = iFindFirstVisibleItemPosition;
                        i2 = iAbs;
                    }
                    if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                        break;
                    }
                    iFindFirstVisibleItemPosition++;
                }
            }
        }
        return i;
    }
}
