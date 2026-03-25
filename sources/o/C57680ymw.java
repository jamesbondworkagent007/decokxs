package o;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.widget.dialog.behavior.ViewPagerBottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.ymw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57680ymw {
    public static WeakReference<RecyclerView> AEQbTJ;

    public static void KWHzl(RecyclerView recyclerView) {
        android.view.View viewAEQbTJ = AEQbTJ(recyclerView);
        if (viewAEQbTJ != null) {
            ViewPagerBottomSheetBehavior.AEQbTJ(viewAEQbTJ).EZpvd((android.view.View) recyclerView);
            AEQbTJ = new WeakReference<>(recyclerView);
        }
    }

    public static android.view.View AEQbTJ(android.view.View view) {
        while (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).getBehavior() instanceof ViewPagerBottomSheetBehavior)) {
                return view;
            }
            java.lang.Object parent = view.getParent();
            view = (parent == null || !(parent instanceof android.view.View)) ? null : (android.view.View) parent;
        }
        return null;
    }
}
