package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47337toD extends ViewDataBinding {
    public final C52794wYp AEQbTJ;
    public final wYK KWHzl;

    public AbstractC47337toD(java.lang.Object obj, android.view.View view, int i, wYK wyk, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.KWHzl = wyk;
        this.AEQbTJ = c52794wYp;
    }

    public static AbstractC47337toD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47337toD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47337toD) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DTwDnp, viewGroup, z, obj);
    }
}
