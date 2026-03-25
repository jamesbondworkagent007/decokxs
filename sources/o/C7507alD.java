package o;

import androidx.recyclerview.widget.GridLayoutManager;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;

/* JADX INFO: renamed from: o.alD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7507alD {
    public static int KWHzl(GridLayoutManager gridLayoutManager, UDCollectionLayout uDCollectionLayout) {
        int iGEmmrt;
        int i;
        if (gridLayoutManager != null && gridLayoutManager.getChildCount() != 0) {
            try {
                int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                android.view.View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition == null) {
                    return 0;
                }
                if (uDCollectionLayout == null) {
                    i = 0;
                    iGEmmrt = 0;
                } else {
                    iGEmmrt = uDCollectionLayout.gEmmrt();
                    i = uDCollectionLayout.EZpvd()[0];
                }
                int width = (-viewFindViewByPosition.getLeft()) + i;
                for (int i2 = 0; i2 < iFindFirstVisibleItemPosition; i2++) {
                    width = width + viewFindViewByPosition.getWidth() + iGEmmrt;
                }
                return width;
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }

    public static int AEQbTJ(GridLayoutManager gridLayoutManager, UDCollectionLayout uDCollectionLayout) {
        int iDjBIcL;
        int i;
        if (gridLayoutManager != null && gridLayoutManager.getChildCount() != 0) {
            try {
                int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
                android.view.View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                if (viewFindViewByPosition == null) {
                    return 0;
                }
                if (uDCollectionLayout == null) {
                    i = 0;
                    iDjBIcL = 0;
                } else {
                    iDjBIcL = uDCollectionLayout.djBIcL();
                    i = uDCollectionLayout.EZpvd()[1];
                }
                int height = (-viewFindViewByPosition.getTop()) + i;
                for (int i2 = 0; i2 < iFindFirstVisibleItemPosition; i2++) {
                    height = height + viewFindViewByPosition.getHeight() + iDjBIcL;
                }
                return height;
            } catch (java.lang.Exception unused) {
            }
        }
        return 0;
    }
}
