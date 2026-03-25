package o;

import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: renamed from: o.ehJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16296ehJ extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final androidx.appcompat.widget.Toolbar EZpvd;
    public final androidx.legacy.widget.Space KWHzl;
    public final CollapsingToolbarLayout OLrzqt;
    public final AppBarLayout copydefault;

    public AbstractC16296ehJ(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, android.widget.FrameLayout frameLayout, androidx.legacy.widget.Space space, androidx.appcompat.widget.Toolbar toolbar) {
        super(obj, view, i);
        this.copydefault = appBarLayout;
        this.OLrzqt = collapsingToolbarLayout;
        this.AEQbTJ = frameLayout;
        this.KWHzl = space;
        this.EZpvd = toolbar;
    }
}
