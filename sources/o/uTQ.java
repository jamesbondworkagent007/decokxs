package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uTQ extends ViewDataBinding {
    public final Group AEQbTJ;
    public final RecyclerView AYXKKw;
    public final Barrier AhwBna;
    public final AppCompatTextView EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;
    public final AppCompatTextView djBIcL;
    public final C33546myW gEmmrt;
    public final ConstraintLayout isConnected;
    public final AppCompatTextView valueOf;

    public uTQ(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, Group group, android.widget.FrameLayout frameLayout, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, Barrier barrier, C33546myW c33546myW, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
        this.AEQbTJ = group;
        this.KWHzl = frameLayout;
        this.EZpvd = appCompatTextView2;
        this.copydefault = appCompatImageView;
        this.AYXKKw = recyclerView;
        this.valueOf = appCompatTextView3;
        this.djBIcL = appCompatTextView4;
        this.AhwBna = barrier;
        this.gEmmrt = c33546myW;
        this.isConnected = constraintLayout;
    }
}
