package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49533uqO extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final AppCompatImageView EZpvd;
    public final C52794wYp KWHzl;
    public final AppCompatTextView OLrzqt;
    public final C52794wYp copydefault;

    public AbstractC49533uqO(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, C52794wYp c52794wYp, AppCompatImageView appCompatImageView, C52794wYp c52794wYp2, AppCompatTextView appCompatTextView3) {
        super(obj, view, i);
        this.OLrzqt = appCompatTextView;
        this.AEQbTJ = appCompatTextView2;
        this.copydefault = c52794wYp;
        this.EZpvd = appCompatImageView;
        this.KWHzl = c52794wYp2;
        this.AhwBna = appCompatTextView3;
    }

    public static AbstractC49533uqO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC49533uqO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC49533uqO) ViewDataBinding.inflateInternal(layoutInflater, C49511upt.StateListAnimator.AkhnZx, viewGroup, z, obj);
    }
}
