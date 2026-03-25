package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.otV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37419otV extends RecyclerView.ItemDecoration {
    public final TaskDescription EZpvd;

    /* JADX INFO: renamed from: o.otV$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ(@NotNull android.view.View view, int i);

        boolean KWHzl();

        boolean KWHzl(int i);

        int OLrzqt(int i);

        int copydefault(int i);
    }

    public C37419otV(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.EZpvd = taskDescription;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        android.view.View childAt;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        if (!this.EZpvd.KWHzl() || (childAt = recyclerView.getChildAt(0)) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return;
        }
        pUU.KWHzl(C56524yIo.AEQbTJ(C37419otV.class).valueOf(), "topChildPosition: " + childAdapterPosition);
        android.view.View viewOLrzqt = OLrzqt(childAdapterPosition, recyclerView);
        KWHzl(recyclerView, viewOLrzqt);
        android.view.View viewEZpvd = EZpvd(recyclerView, viewOLrzqt.getBottom());
        if (viewEZpvd != null && recyclerView.getChildAdapterPosition(viewEZpvd) >= 0) {
            if (this.EZpvd.KWHzl(recyclerView.getChildAdapterPosition(viewEZpvd))) {
                OLrzqt(canvas, viewOLrzqt, viewEZpvd);
            } else {
                OLrzqt(canvas, viewOLrzqt);
            }
        }
    }

    public final android.view.View OLrzqt(int i, RecyclerView recyclerView) {
        int iOLrzqt = this.EZpvd.OLrzqt(i);
        pUU.KWHzl(C56524yIo.AEQbTJ(C37419otV.class).valueOf(), "headerPosition: " + iOLrzqt);
        android.view.View viewInflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(this.EZpvd.copydefault(iOLrzqt), (android.view.ViewGroup) recyclerView, false);
        TaskDescription taskDescription = this.EZpvd;
        Intrinsics.copydefault(viewInflate);
        taskDescription.AEQbTJ(viewInflate, iOLrzqt);
        return viewInflate;
    }

    private final void OLrzqt(android.graphics.Canvas canvas, android.view.View view) {
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        view.draw(canvas);
        canvas.restore();
    }

    private final void OLrzqt(android.graphics.Canvas canvas, android.view.View view, android.view.View view2) {
        canvas.save();
        canvas.translate(0.0f, view2.getTop() - view.getHeight());
        view.draw(canvas);
        canvas.restore();
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

    private final void KWHzl(android.view.ViewGroup viewGroup, android.view.View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
