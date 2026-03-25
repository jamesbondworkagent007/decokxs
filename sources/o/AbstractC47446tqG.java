package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47446tqG extends ViewDataBinding {
    public final C55173xeu OLrzqt;

    public AbstractC47446tqG(java.lang.Object obj, android.view.View view, int i, C55173xeu c55173xeu) {
        super(obj, view, i);
        this.OLrzqt = c55173xeu;
    }

    public static AbstractC47446tqG KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47446tqG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47446tqG) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.QwvEab, viewGroup, z, obj);
    }
}
