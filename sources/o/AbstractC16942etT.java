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

/* JADX INFO: renamed from: o.etT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16942etT extends ViewDataBinding {
    public final CollapsingToolbarLayout AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final androidx.appcompat.widget.Toolbar AkhnZx;
    public final Barrier DbNXlk;
    public final Guideline EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppBarLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final CoordinatorLayout fetchVPNInfo;
    public final AppCompatImageView gEmmrt;
    public final C52794wYp isConnected;
    public final LinearLayoutCompat valueOf;
    public final android.widget.TextView values;

    public AbstractC16942etT(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, CollapsingToolbarLayout collapsingToolbarLayout, android.widget.FrameLayout frameLayout, Guideline guideline, AppCompatImageView appCompatImageView, android.widget.TextView textView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView2, android.widget.LinearLayout linearLayout, Barrier barrier, C52794wYp c52794wYp, CoordinatorLayout coordinatorLayout, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = appBarLayout;
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = collapsingToolbarLayout;
        this.KWHzl = frameLayout;
        this.EZpvd = guideline;
        this.gEmmrt = appCompatImageView;
        this.djBIcL = textView;
        this.valueOf = linearLayoutCompat;
        this.AYXKKw = appCompatImageView2;
        this.AhwBna = linearLayout;
        this.DbNXlk = barrier;
        this.isConnected = c52794wYp;
        this.fetchVPNInfo = coordinatorLayout;
        this.AkhnZx = toolbar;
        this.values = textView2;
    }
}
