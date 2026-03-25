package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: renamed from: o.uTx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48505uTx extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C55173xeu EZpvd;
    public final C52794wYp KWHzl;
    public final Group OLrzqt;
    public final FragmentContainerView copydefault;
    public final android.widget.ImageView djBIcL;
    public final ConstraintLayout gEmmrt;
    public final NestedScrollView valueOf;

    public AbstractC48505uTx(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView, Group group, C52794wYp c52794wYp, C55173xeu c55173xeu, AppCompatImageView appCompatImageView, NestedScrollView nestedScrollView, AppCompatTextView appCompatTextView, android.widget.ImageView imageView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.copydefault = fragmentContainerView;
        this.OLrzqt = group;
        this.KWHzl = c52794wYp;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = appCompatImageView;
        this.valueOf = nestedScrollView;
        this.AYXKKw = appCompatTextView;
        this.djBIcL = imageView;
        this.gEmmrt = constraintLayout;
    }
}
