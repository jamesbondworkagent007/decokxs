package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: o.eiI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16348eiI extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final C55254xgV OLrzqt;
    public final FragmentContainerView copydefault;
    public final ViewPager2 valueOf;

    public AbstractC16348eiI(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.widget.ImageView imageView, android.widget.TextView textView, FragmentContainerView fragmentContainerView, C55254xgV c55254xgV, ConstraintLayout constraintLayout, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.KWHzl = appCompatImageView;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
        this.copydefault = fragmentContainerView;
        this.OLrzqt = c55254xgV;
        this.AYXKKw = constraintLayout;
        this.valueOf = viewPager2;
    }
}
