package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oJy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35956oJy {
    public static final void AEQbTJ(@NotNull RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        oJA oja = oJA.KWHzl;
        oja.AEQbTJ("New Position: " + i);
        EZpvd(recyclerView, i);
        recyclerView.smoothScrollToPosition(i);
        oja.AEQbTJ("Smooth scroll done.");
    }

    public static final void EZpvd(RecyclerView recyclerView, int i) {
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            oJA.KWHzl.AEQbTJ("LayoutManager: Linear.");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof GridLayoutManager) {
            oJA.KWHzl.AEQbTJ("LayoutManager: Grid.");
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
            iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        } else {
            oJA.KWHzl.AEQbTJ("LayoutManager: unsupported. No fast close scroll.");
            return;
        }
        oJA oja = oJA.KWHzl;
        oja.AEQbTJ("First: " + iFindFirstVisibleItemPosition + " <-> Last: " + iFindLastVisibleItemPosition);
        int i2 = iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition;
        int iEZpvd = yII.EZpvd(((double) i2) * oja.OLrzqt());
        int i3 = (iFindLastVisibleItemPosition + iFindFirstVisibleItemPosition) / 2;
        oja.AEQbTJ("Screen: " + i2 + " / Buffer: " + iEZpvd + " / Middle: " + i3);
        int i4 = i - iEZpvd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Close Lower: ");
        sb.append(i4);
        oja.AEQbTJ(sb.toString());
        if (i3 < i4) {
            pUU.EZpvd("FSS", "Fast Scroll to Lower.");
            recyclerView.scrollToPosition(i4);
            return;
        }
        int i5 = i + iEZpvd;
        oja.AEQbTJ("Close Higher: " + i5);
        if (i3 > i5) {
            pUU.EZpvd("FSS", "Fast Scroll to Higher.");
            recyclerView.scrollToPosition(i5);
        } else {
            oja.AEQbTJ("Fast scroll not needed, in close range.");
        }
    }
}
