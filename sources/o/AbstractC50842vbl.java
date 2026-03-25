package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50842vbl extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final C55251xgS KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatTextView djBIcL;

    public AbstractC50842vbl(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.widget.FrameLayout frameLayout, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout, C55251xgS c55251xgS, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = frameLayout;
        this.EZpvd = appCompatImageView2;
        this.copydefault = constraintLayout;
        this.KWHzl = c55251xgS;
        this.djBIcL = appCompatTextView;
        this.AhwBna = appCompatTextView2;
    }

    public static AbstractC50842vbl AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50842vbl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50842vbl) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.iOIMNp, viewGroup, z, obj);
    }
}
