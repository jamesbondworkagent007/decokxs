package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.yrK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57907yrK {
    public static void OLrzqt(android.view.View view, InterfaceC57931yri interfaceC57931yri, final InterfaceC57899yrC interfaceC57899yrC) {
        try {
            if (view instanceof CoordinatorLayout) {
                interfaceC57931yri.copydefault().gEmmrt(false);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    android.view.View childAt = viewGroup.getChildAt(childCount);
                    if (childAt instanceof AppBarLayout) {
                        ((AppBarLayout) childAt).addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: o.yrK.5
                            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                                interfaceC57899yrC.AEQbTJ(i >= 0, appBarLayout.getTotalScrollRange() + i <= 0);
                            }
                        });
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
        }
    }
}
