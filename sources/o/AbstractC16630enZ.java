package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.enZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16630enZ extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView AYXKKw;
    public final AppCompatImageView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.view.View EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final C52794wYp OLrzqt;
    public final fDS copydefault;
    public final AppCompatImageView djBIcL;
    public final C55230xfy fetchVPNInfo;
    public final AppBarLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final android.view.View values;

    public AbstractC16630enZ(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.FrameLayout frameLayout, ConstraintLayout constraintLayout, fDS fds, android.view.View view2, AppBarLayout appBarLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView2, RecyclerView recyclerView, C55230xfy c55230xfy, android.view.View view3, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i);
        this.OLrzqt = c52794wYp;
        this.KWHzl = frameLayout;
        this.AEQbTJ = constraintLayout;
        this.copydefault = fds;
        this.EZpvd = view2;
        this.gEmmrt = appBarLayout;
        this.AhwBna = appCompatImageView;
        this.valueOf = appCompatTextView;
        this.djBIcL = appCompatImageView2;
        this.AYXKKw = recyclerView;
        this.fetchVPNInfo = c55230xfy;
        this.values = view3;
        this.AkhnZx = appCompatTextView2;
        this.isConnected = appCompatTextView3;
    }
}
