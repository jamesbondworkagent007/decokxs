package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44619saO extends RecyclerView.ItemDecoration {
    public final C59534zip EZpvd;
    public int copydefault;

    public C44619saO(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        this.EZpvd = c59534zip;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        TaskDescription taskDescriptionKWHzl = KWHzl(recyclerView);
        if (taskDescriptionKWHzl == null) {
            return;
        }
        android.view.View viewKWHzl = KWHzl(recyclerView, taskDescriptionKWHzl.OLrzqt());
        AEQbTJ(recyclerView, taskDescriptionKWHzl.EZpvd());
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        viewKWHzl.draw(canvas);
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1 && EZpvd(childAdapterPosition) && this.copydefault == 0) {
            Intrinsics.checkNotNullExpressionValue(this.EZpvd.getItems(), "");
            if (!r3.isEmpty()) {
                java.lang.Object obj = this.EZpvd.getItems().get(childAdapterPosition);
                Intrinsics.copydefault(obj, "");
                KWHzl(recyclerView, (C44617saM) obj);
            }
        }
    }

    public final TaskDescription KWHzl(RecyclerView recyclerView) {
        int childAdapterPosition;
        android.view.View childAt = recyclerView.getChildAt(0);
        if (childAt == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return null;
        }
        for (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt); -1 < childAdapterPosition; childAdapterPosition--) {
            if (childAdapterPosition < this.EZpvd.getItems().size() && EZpvd(childAdapterPosition)) {
                java.lang.Object obj = this.EZpvd.getItems().get(childAdapterPosition);
                Intrinsics.copydefault(obj, "");
                return new TaskDescription(childAdapterPosition, (C44617saM) obj);
            }
        }
        return null;
    }

    public final boolean EZpvd(int i) {
        return i >= 0 && i < this.EZpvd.getItems().size() && (this.EZpvd.getItems().get(i) instanceof C44617saM);
    }

    public final void AEQbTJ(RecyclerView recyclerView, int i) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && EZpvd(childAdapterPosition)) {
                childAt.setAlpha((childAdapterPosition != i || childAt.getBottom() <= 0 || childAt.getBottom() > this.copydefault) ? 1.0f : 0.0f);
            }
        }
    }

    public final android.view.View KWHzl(RecyclerView recyclerView, C44617saM c44617saM) {
        rYJ ryjOLrzqt = rYJ.OLrzqt(android.view.LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        Intrinsics.checkNotNullExpressionValue(ryjOLrzqt, "");
        ryjOLrzqt.AEQbTJ.setTextSize(14.0f);
        ryjOLrzqt.AEQbTJ.setText(Intrinsics.EZpvd((java.lang.Object) c44617saM.EZpvd(), (java.lang.Object) C44617saM.Companion.copydefault().EZpvd()) ? C33070mpX.AYXKKw(rXV.TaskDescription.EZpvd) : c44617saM.EZpvd());
        android.widget.FrameLayout root = ryjOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        root.layout(0, 0, root.getMeasuredWidth(), root.getMeasuredHeight());
        this.copydefault = root.getMeasuredHeight();
        return root;
    }

    /* JADX INFO: renamed from: o.saO$TaskDescription */
    public static final class TaskDescription {
        public final C44617saM AEQbTJ;
        public final int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, C44617saM c44617saM, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = taskDescription.EZpvd;
            }
            if ((i2 & 2) != 0) {
                c44617saM = taskDescription.AEQbTJ;
            }
            return taskDescription.KWHzl(i, c44617saM);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(int i, @NotNull C44617saM c44617saM) {
            Intrinsics.checkNotNullParameter(c44617saM, "");
            return new TaskDescription(i, c44617saM);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C44617saM OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.EZpvd == taskDescription.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.EZpvd) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HeaderInfo(position=" + this.EZpvd + ", title=" + this.AEQbTJ + ")";
        }

        public TaskDescription(int i, @NotNull C44617saM c44617saM) {
            Intrinsics.checkNotNullParameter(c44617saM, "");
            this.EZpvd = i;
            this.AEQbTJ = c44617saM;
        }
    }
}
