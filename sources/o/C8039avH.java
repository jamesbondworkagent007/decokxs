package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.avH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8039avH extends RecyclerView.ItemDecoration {
    public boolean EZpvd;
    public boolean KWHzl;
    public ActionBar OLrzqt;
    public java.util.Map<java.lang.Long, RecyclerView.ViewHolder> copydefault;

    /* JADX INFO: renamed from: o.avH$ActionBar */
    public interface ActionBar<T extends RecyclerView.ViewHolder> {
        long EZpvd(int i);

        void KWHzl(T t, int i);

        T OLrzqt(android.view.ViewGroup viewGroup);
    }

    public C8039avH(ActionBar actionBar) {
        this(actionBar, false);
    }

    public C8039avH(ActionBar actionBar, boolean z) {
        this.EZpvd = false;
        this.OLrzqt = actionBar;
        this.copydefault = new java.util.HashMap();
        this.KWHzl = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (!this.EZpvd && (recyclerView.getAdapter() instanceof AbstractC8041avJ)) {
            int iKWHzl = ((AbstractC8041avJ) recyclerView.getAdapter()).KWHzl();
            ((AbstractC8041avJ) recyclerView.getAdapter()).copydefault();
            int iEZpvd = ((AbstractC8041avJ) recyclerView.getAdapter()).EZpvd();
            if (childAdapterPosition < iKWHzl || childAdapterPosition >= iEZpvd + iKWHzl) {
                return;
            }
            if (childAdapterPosition >= iKWHzl) {
                childAdapterPosition -= iKWHzl;
            }
        }
        rect.set(0, (childAdapterPosition != -1 && AEQbTJ(childAdapterPosition) && EZpvd(childAdapterPosition)) ? KWHzl(copydefault(recyclerView, childAdapterPosition).itemView) : 0, 0, 0);
    }

    public final boolean EZpvd(int i) {
        return i == 0 || this.OLrzqt.EZpvd(i + (-1)) != this.OLrzqt.EZpvd(i);
    }

    public final boolean AEQbTJ(int i) {
        return this.OLrzqt.EZpvd(i) != -1;
    }

    public final RecyclerView.ViewHolder copydefault(RecyclerView recyclerView, int i) {
        long jEZpvd = this.OLrzqt.EZpvd(i);
        if (this.copydefault.containsKey(java.lang.Long.valueOf(jEZpvd))) {
            return this.copydefault.get(java.lang.Long.valueOf(jEZpvd));
        }
        RecyclerView.ViewHolder viewHolderOLrzqt = this.OLrzqt.OLrzqt(recyclerView);
        android.view.View view = viewHolderOLrzqt.itemView;
        this.OLrzqt.KWHzl(viewHolderOLrzqt, i);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getMeasuredHeight(), 0);
        view.measure(android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, recyclerView.getPaddingLeft() + recyclerView.getPaddingRight(), view.getLayoutParams().width), android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, recyclerView.getPaddingTop() + recyclerView.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        this.copydefault.put(java.lang.Long.valueOf(jEZpvd), viewHolderOLrzqt);
        return viewHolderOLrzqt;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        if (recyclerView.getAdapter() == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        long j = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = recyclerView.getChildAt(i2);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            if (!this.EZpvd && (recyclerView.getAdapter() instanceof AbstractC8041avJ)) {
                int iKWHzl = ((AbstractC8041avJ) recyclerView.getAdapter()).KWHzl();
                ((AbstractC8041avJ) recyclerView.getAdapter()).copydefault();
                int iEZpvd = ((AbstractC8041avJ) recyclerView.getAdapter()).EZpvd();
                if (childAdapterPosition >= iKWHzl && childAdapterPosition < iEZpvd + iKWHzl) {
                    if (childAdapterPosition >= iKWHzl) {
                        childAdapterPosition -= iKWHzl;
                    }
                    i = childAdapterPosition;
                    if (i == -1) {
                    }
                }
            } else {
                i = childAdapterPosition;
                if (i == -1 && AEQbTJ(i)) {
                    long jEZpvd = this.OLrzqt.EZpvd(i);
                    if (jEZpvd != j) {
                        android.view.View view = copydefault(recyclerView, i).itemView;
                        canvas.save();
                        float left = childAt.getLeft();
                        float fOLrzqt = OLrzqt(recyclerView, childAt, view, i, i2);
                        canvas.translate(left, fOLrzqt);
                        view.setTranslationX(left);
                        view.setTranslationY(fOLrzqt);
                        view.draw(canvas);
                        canvas.restore();
                        j = jEZpvd;
                    }
                }
            }
        }
    }

    public final int OLrzqt(RecyclerView recyclerView, android.view.View view, android.view.View view2, int i, int i2) {
        int iKWHzl = KWHzl(view2);
        int y = ((int) view.getY()) - iKWHzl;
        if (i2 != 0) {
            return y;
        }
        int childCount = recyclerView.getChildCount();
        long jEZpvd = this.OLrzqt.EZpvd(i);
        int i3 = 1;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(i3));
            if (childAdapterPosition == -1 || this.OLrzqt.EZpvd(childAdapterPosition) == jEZpvd) {
                i3++;
            } else {
                int y2 = ((int) recyclerView.getChildAt(i3).getY()) - (iKWHzl + copydefault(recyclerView, childAdapterPosition).itemView.getHeight());
                if (y2 < 0) {
                    return y2;
                }
            }
        }
        return java.lang.Math.max(0, y);
    }

    public final int KWHzl(android.view.View view) {
        if (this.KWHzl) {
            return 0;
        }
        return view.getHeight();
    }
}
