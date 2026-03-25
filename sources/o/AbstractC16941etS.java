package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* JADX INFO: renamed from: o.etS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16941etS extends ViewDataBinding {
    public final CollapsingToolbarLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final Barrier DbNXlk;
    public final Guideline EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final AppBarLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatImageView djBIcL;
    public final C52794wYp fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final CoordinatorLayout isConnected;
    public final android.widget.LinearLayout valueOf;
    public final androidx.appcompat.widget.Toolbar values;

    public AbstractC16941etS(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, CollapsingToolbarLayout collapsingToolbarLayout, android.widget.FrameLayout frameLayout, Guideline guideline, AppCompatImageView appCompatImageView, android.widget.TextView textView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, android.widget.LinearLayout linearLayout, Barrier barrier, C52794wYp c52794wYp, CoordinatorLayout coordinatorLayout, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = appBarLayout;
        this.copydefault = constraintLayout;
        this.AEQbTJ = collapsingToolbarLayout;
        this.KWHzl = frameLayout;
        this.EZpvd = guideline;
        this.djBIcL = appCompatImageView;
        this.AYXKKw = textView;
        this.gEmmrt = linearLayoutCompat;
        this.AhwBna = appCompatImageView2;
        this.valueOf = linearLayout;
        this.DbNXlk = barrier;
        this.fetchVPNInfo = c52794wYp;
        this.isConnected = coordinatorLayout;
        this.values = toolbar;
        this.AkhnZx = textView2;
    }
}
