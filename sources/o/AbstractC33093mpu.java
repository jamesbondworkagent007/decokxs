package o;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.mpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33093mpu extends ViewDataBinding {
    public final AppBarLayout AEQbTJ;
    public final androidx.appcompat.widget.Toolbar EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final CoordinatorLayout OLrzqt;

    @Bindable
    public boolean copydefault;
    public final android.widget.TextView djBIcL;

    public abstract void EZpvd(boolean z);

    public AbstractC33093mpu(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, android.widget.FrameLayout frameLayout, CoordinatorLayout coordinatorLayout, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = appBarLayout;
        this.KWHzl = frameLayout;
        this.OLrzqt = coordinatorLayout;
        this.EZpvd = toolbar;
        this.djBIcL = textView;
    }
}
