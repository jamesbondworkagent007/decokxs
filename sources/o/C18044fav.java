package o;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18044fav extends RecyclerView.ItemDecoration {
    public boolean AEQbTJ;
    public android.view.View EZpvd;
    public final Activity KWHzl;

    /* JADX INFO: renamed from: o.fav$Activity */
    public interface Activity {
        int AYXKKw();

        void OLrzqt(@NotNull android.view.View view);

        void values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.AEQbTJ = z;
    }

    public C18044fav(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.KWHzl = activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        if (!this.AEQbTJ) {
            copydefault();
            return;
        }
        int iAYXKKw = this.KWHzl.AYXKKw();
        if (iAYXKKw == -1) {
            copydefault();
            return;
        }
        android.view.View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            copydefault();
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
        if (childAdapterPosition == -1) {
            copydefault();
            return;
        }
        if (childAdapterPosition < iAYXKKw) {
            copydefault();
            return;
        }
        android.view.View viewCopydefault = copydefault(recyclerView);
        if (viewCopydefault == null) {
            copydefault();
            return;
        }
        OLrzqt(recyclerView, viewCopydefault);
        android.view.View viewCopydefault2 = copydefault(recyclerView, viewCopydefault.getBottom());
        if (viewCopydefault2 == null) {
            copydefault();
        } else if (recyclerView.getChildAdapterPosition(viewCopydefault2) < iAYXKKw) {
            copydefault();
        } else {
            this.KWHzl.OLrzqt(viewCopydefault);
            viewCopydefault.setVisibility(0);
        }
    }

    public final void copydefault() {
        android.view.View view = this.EZpvd;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final android.view.View copydefault(RecyclerView recyclerView) {
        if (this.EZpvd == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) recyclerView.getRootView().findViewById(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi215);
            if (frameLayout == null) {
                return null;
            }
            android.view.View viewInflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(C13754dXa.TaskDescription.DzkRMH, (android.view.ViewGroup) frameLayout, false);
            this.EZpvd = viewInflate;
            frameLayout.addView(viewInflate, new FrameLayout.LayoutParams(-1, -2));
            android.view.View view = this.EZpvd;
            if (view != null) {
                view.setOnClickListener(new Application(view, 1000L, this));
                this.KWHzl.OLrzqt(view);
            }
        }
        return this.EZpvd;
    }

    public final void OLrzqt(android.view.ViewGroup viewGroup, android.view.View view) {
        if (view.getMeasuredWidth() == 0 || view.getMeasuredHeight() == 0) {
            KWHzl(viewGroup, view);
        }
    }

    public final android.view.View copydefault(RecyclerView recyclerView, int i) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            if (childAt.getBottom() > i && childAt.getTop() <= i) {
                return childAt;
            }
        }
        return null;
    }

    private final void KWHzl(android.view.ViewGroup viewGroup, android.view.View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: o.fav$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C18044fav AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C18044fav c18044fav) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c18044fav;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.copydefault();
                this.AEQbTJ.KWHzl.values();
            }
        }
    }
}
