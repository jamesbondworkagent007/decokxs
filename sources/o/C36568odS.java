package o;

import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.odS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36568odS {
    public final RecyclerView EZpvd;
    public final ActionBar OLrzqt;
    public final LifecycleCoroutineScope copydefault;

    public C36568odS(@NotNull RecyclerView recyclerView, @NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        this.EZpvd = recyclerView;
        this.copydefault = lifecycleCoroutineScope;
        this.OLrzqt = new ActionBar(recyclerView.getContext());
    }

    /* JADX INFO: renamed from: o.odS$ActionBar */
    public static final class ActionBar extends LinearSmoothScroller {
        public boolean KWHzl;

        public ActionBar(android.content.Context context) {
            super(context);
            this.KWHzl = true;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateTimeForScrolling(int i) {
            if (this.KWHzl) {
                return super.calculateTimeForScrolling(i);
            }
            return 0;
        }
    }

    public static /* synthetic */ void scrollTo$default(C36568odS c36568odS, int i, boolean z, Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        c36568odS.copydefault(i, z, function0);
    }

    public final void copydefault(int i, boolean z, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        RecyclerView.LayoutManager layoutManager = this.EZpvd.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        RecyclerView.Adapter adapter = this.EZpvd.getAdapter();
        if (linearLayoutManager == null || adapter == null || i == -1) {
            return;
        }
        linearLayoutManager.scrollToPosition(i);
        RecyclerView recyclerView = this.EZpvd;
        android.view.ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new StateListAnimator(viewTreeObserver, recyclerView, z, this, i, linearLayoutManager, function0));
    }

    public final void copydefault(int i, LinearLayoutManager linearLayoutManager) {
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition != null) {
            int height = this.EZpvd.getHeight();
            int height2 = viewFindViewByPosition.getHeight();
            int top = viewFindViewByPosition.getTop();
            viewFindViewByPosition.getBottom();
            this.EZpvd.scrollBy(0, top - ((height / 2) - (height2 / 2)));
        }
    }

    /* JADX INFO: renamed from: o.odS$StateListAnimator */
    public static final class StateListAnimator implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ C36568odS AhwBna;
        public final /* synthetic */ LinearLayoutManager EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ Function0 copydefault;
        public final /* synthetic */ android.view.ViewTreeObserver valueOf;

        public StateListAnimator(android.view.ViewTreeObserver viewTreeObserver, android.view.View view, boolean z, C36568odS c36568odS, int i, LinearLayoutManager linearLayoutManager, Function0 function0) {
            this.valueOf = viewTreeObserver;
            this.KWHzl = view;
            this.OLrzqt = z;
            this.AhwBna = c36568odS;
            this.AEQbTJ = i;
            this.EZpvd = linearLayoutManager;
            this.copydefault = function0;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            (this.valueOf.isAlive() ? this.valueOf : this.KWHzl.getViewTreeObserver()).removeOnGlobalLayoutListener(this);
            if (this.OLrzqt) {
                this.AhwBna.OLrzqt.setTargetPosition(this.AEQbTJ);
                this.EZpvd.startSmoothScroll(this.AhwBna.OLrzqt);
            } else {
                this.AhwBna.copydefault(this.AEQbTJ, this.EZpvd);
            }
            this.copydefault.invoke();
        }
    }
}
