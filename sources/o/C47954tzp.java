package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47954tzp extends RecyclerView.ItemDecoration {
    public final C59534zip EZpvd;
    public int OLrzqt;

    public C47954tzp(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        this.EZpvd = c59534zip;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        Application applicationEZpvd = EZpvd(recyclerView);
        if (applicationEZpvd == null) {
            return;
        }
        android.view.View viewAEQbTJ = AEQbTJ(recyclerView, applicationEZpvd.AEQbTJ());
        KWHzl(recyclerView, applicationEZpvd.EZpvd());
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        viewAEQbTJ.draw(canvas);
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
        if (childAdapterPosition != -1 && AEQbTJ(childAdapterPosition) && this.OLrzqt == 0) {
            Intrinsics.checkNotNullExpressionValue(this.EZpvd.getItems(), "");
            if (!r3.isEmpty()) {
                java.lang.Object obj = this.EZpvd.getItems().get(childAdapterPosition);
                Intrinsics.copydefault(obj, "");
                AEQbTJ(recyclerView, (java.lang.String) obj);
            }
        }
    }

    public final Application EZpvd(RecyclerView recyclerView) {
        int childAdapterPosition;
        android.view.View childAt = recyclerView.getChildAt(0);
        if (childAt == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return null;
        }
        for (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt); -1 < childAdapterPosition; childAdapterPosition--) {
            if (childAdapterPosition < this.EZpvd.getItems().size() && AEQbTJ(childAdapterPosition)) {
                java.lang.Object obj = this.EZpvd.getItems().get(childAdapterPosition);
                Intrinsics.copydefault(obj, "");
                return new Application(childAdapterPosition, (java.lang.String) obj);
            }
        }
        return null;
    }

    private final boolean AEQbTJ(int i) {
        return i >= 0 && i < this.EZpvd.getItems().size() && (this.EZpvd.getItems().get(i) instanceof java.lang.String);
    }

    private final void KWHzl(RecyclerView recyclerView, int i) {
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition != -1 && AEQbTJ(childAdapterPosition)) {
                childAt.setAlpha((childAdapterPosition != i || childAt.getBottom() <= 0 || childAt.getBottom() > this.OLrzqt) ? 1.0f : 0.0f);
            }
        }
    }

    public final android.view.View AEQbTJ(RecyclerView recyclerView, java.lang.String str) {
        tMR tmrOLrzqt = tMR.OLrzqt(android.view.LayoutInflater.from(recyclerView.getContext()), recyclerView, false);
        Intrinsics.checkNotNullExpressionValue(tmrOLrzqt, "");
        tmrOLrzqt.EZpvd.setBgColor(C33070mpX.copydefault(C52761wXj.Activity.invokespecialDPHOMC));
        tmrOLrzqt.EZpvd.setTextSize(14.0f);
        tmrOLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
        tmrOLrzqt.EZpvd.setText(str);
        android.view.View root = tmrOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        root.layout(0, 0, root.getMeasuredWidth(), root.getMeasuredHeight());
        this.OLrzqt = root.getMeasuredHeight();
        return root;
    }

    /* JADX INFO: renamed from: o.tzp$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.copydefault;
            }
            if ((i2 & 2) != 0) {
                str = application.KWHzl;
            }
            return application.OLrzqt(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.copydefault == application.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.copydefault) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HeaderInfo(position=" + this.copydefault + ", title=" + this.KWHzl + ")";
        }

        public Application(int i, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = i;
            this.KWHzl = str;
        }
    }
}
