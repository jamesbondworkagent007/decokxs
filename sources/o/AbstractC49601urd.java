package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.urd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49601urd extends ViewDataBinding {
    public final C55239xgG AEQbTJ;
    public final C55258xgZ KWHzl;
    public final android.widget.ImageView OLrzqt;

    public AbstractC49601urd(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C55239xgG c55239xgG, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.AEQbTJ = c55239xgG;
        this.KWHzl = c55258xgZ;
    }

    public static AbstractC49601urd KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC49601urd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC49601urd) ViewDataBinding.inflateInternal(layoutInflater, C49511upt.StateListAnimator.zsXlph, viewGroup, z, obj);
    }
}
