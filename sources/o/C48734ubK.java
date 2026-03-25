package o;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.ubK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C48734ubK extends LinearSnapHelper {
    @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
    public android.view.View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (!EZpvd(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(0);
            }
            if (!AEQbTJ(linearLayoutManager)) {
                return linearLayoutManager.findViewByPosition(linearLayoutManager.getItemCount() - 1);
            }
        }
        return super.findSnapView(layoutManager);
    }

    public boolean EZpvd(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0;
    }

    public boolean AEQbTJ(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1;
    }
}
