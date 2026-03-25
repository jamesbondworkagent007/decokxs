package o;

import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDWaterFallLayout;
import com.immomo.mls.fun.ui.LuaStaggeredGridLayoutManager;

/* JADX INFO: renamed from: o.aiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7353aiI extends RecyclerView.ItemDecoration {
    public TaskDescription AEQbTJ;
    public int EZpvd;
    public UDWaterFallLayout KWHzl;
    public boolean OLrzqt = false;
    public int copydefault;

    /* JADX INFO: renamed from: o.aiI$TaskDescription */
    public interface TaskDescription {
        void AEQbTJ();
    }

    public int EZpvd(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i4++;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = 1;
            }
        }
        return i4 + 1 > i2 ? i3 + 1 : i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.OLrzqt = z;
    }

    public C7353aiI(UDWaterFallLayout uDWaterFallLayout) {
        this.KWHzl = uDWaterFallLayout;
        this.EZpvd = uDWaterFallLayout.gEmmrt();
        this.copydefault = uDWaterFallLayout.djBIcL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(@androidx.annotation.NonNull android.graphics.Canvas canvas, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        TaskDescription taskDescription = this.AEQbTJ;
        if (taskDescription != null) {
            taskDescription.AEQbTJ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iGEmmrt = this.KWHzl.gEmmrt();
        int iDjBIcL = this.KWHzl.djBIcL();
        LuaStaggeredGridLayoutManager luaStaggeredGridLayoutManager = (LuaStaggeredGridLayoutManager) recyclerView.getLayoutManager();
        super.getItemOffsets(rect, view, recyclerView, state);
        int spanCount = luaStaggeredGridLayoutManager.getSpanCount();
        int itemCount = recyclerView.getAdapter().getItemCount();
        EZpvd(recyclerView.getChildAdapterPosition(view), spanCount);
        EZpvd(itemCount - 1, spanCount);
        if (this.KWHzl.OLrzqt()[3] != Float.MIN_VALUE) {
            float f = this.KWHzl.OLrzqt()[3];
        }
        float f2 = this.KWHzl.OLrzqt()[1];
        rect.bottom = iDjBIcL;
        int i = iGEmmrt / 2;
        rect.left = i;
        rect.right = i;
    }
}
