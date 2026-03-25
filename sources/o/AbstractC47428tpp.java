package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47428tpp extends ViewDataBinding {
    public final C52794wYp AEQbTJ;

    public AbstractC47428tpp(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp) {
        super(obj, view, i);
        this.AEQbTJ = c52794wYp;
    }

    public static AbstractC47428tpp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47428tpp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47428tpp) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.fvQaOB, viewGroup, z, obj);
    }
}
