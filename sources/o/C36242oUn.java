package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36242oUn extends RecyclerView.ItemDecoration {
    public final ActionBar copydefault;

    /* JADX INFO: renamed from: o.oUn$ActionBar */
    public interface ActionBar {
        boolean AEQbTJ(int i);

        int KWHzl(int i);

        void KWHzl(@NotNull android.view.View view, int i);

        boolean KWHzl();

        int OLrzqt(int i);
    }

    public C36242oUn(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        android.view.View childAt;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        if (!this.copydefault.KWHzl() || (childAt = recyclerView.getChildAt(0)) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return;
        }
        pUU.KWHzl(C56524yIo.AEQbTJ(C36242oUn.class).valueOf(), "topChildPosition: " + childAdapterPosition);
        android.view.View viewAEQbTJ = AEQbTJ(childAdapterPosition, recyclerView);
        copydefault(recyclerView, viewAEQbTJ);
        android.view.View viewEZpvd = EZpvd(recyclerView, viewAEQbTJ.getBottom());
        if (viewEZpvd != null && recyclerView.getChildAdapterPosition(viewEZpvd) >= 0) {
            if (this.copydefault.AEQbTJ(recyclerView.getChildAdapterPosition(viewEZpvd))) {
                AEQbTJ(canvas, viewAEQbTJ, viewEZpvd);
            } else {
                OLrzqt(canvas, viewAEQbTJ);
            }
        }
    }

    private final android.view.View AEQbTJ(int i, RecyclerView recyclerView) {
        int iKWHzl = this.copydefault.KWHzl(i);
        pUU.KWHzl(C56524yIo.AEQbTJ(C36242oUn.class).valueOf(), "headerPosition: " + iKWHzl);
        android.view.View viewInflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(this.copydefault.OLrzqt(iKWHzl), (android.view.ViewGroup) recyclerView, false);
        ActionBar actionBar = this.copydefault;
        Intrinsics.copydefault(viewInflate);
        actionBar.KWHzl(viewInflate, iKWHzl);
        return viewInflate;
    }

    private final void AEQbTJ(android.graphics.Canvas canvas, android.view.View view, android.view.View view2) {
        float top = view2.getTop() - view.getHeight();
        int iSave = canvas.save();
        canvas.translate(0.0f, top);
        try {
            view.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    private final android.view.View EZpvd(RecyclerView recyclerView, int i) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            if (childAt.getBottom() > i && childAt.getTop() <= i) {
                return childAt;
            }
        }
        return null;
    }

    private final void copydefault(android.view.ViewGroup viewGroup, android.view.View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private final void OLrzqt(android.graphics.Canvas canvas, android.view.View view) {
        int iSave = canvas.save();
        canvas.translate(0.0f, 0.0f);
        try {
            view.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
