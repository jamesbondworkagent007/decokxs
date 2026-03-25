package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31528lvi extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C30318lTy EZpvd;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final lTH copydefault;
    public final C31548lwB djBIcL;
    public final C30313lTt gEmmrt;
    public final C31594lww valueOf;

    public AbstractC31528lvi(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, C30318lTy c30318lTy, lTH lth, android.widget.ImageView imageView, android.widget.ImageView imageView2, C31548lwB c31548lwB, C31594lww c31594lww, android.widget.LinearLayout linearLayout, C30313lTt c30313lTt, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.EZpvd = c30318lTy;
        this.copydefault = lth;
        this.KWHzl = imageView;
        this.AEQbTJ = imageView2;
        this.djBIcL = c31548lwB;
        this.valueOf = c31594lww;
        this.AhwBna = linearLayout;
        this.gEmmrt = c30313lTt;
        this.AYXKKw = textView;
    }

    public static AbstractC31528lvi copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31528lvi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31528lvi) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.RJOkX, viewGroup, z, obj);
    }
}
