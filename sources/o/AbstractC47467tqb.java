package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47467tqb extends ViewDataBinding {
    public final wYK KWHzl;

    public AbstractC47467tqb(java.lang.Object obj, android.view.View view, int i, wYK wyk) {
        super(obj, view, i);
        this.KWHzl = wyk;
    }

    public static AbstractC47467tqb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47467tqb OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47467tqb) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.RKDWNf, viewGroup, z, obj);
    }
}
