package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uVQ extends ViewDataBinding {
    public final C55249xgQ EZpvd;
    public final C55258xgZ KWHzl;

    public uVQ(java.lang.Object obj, android.view.View view, int i, C55249xgQ c55249xgQ, C55258xgZ c55258xgZ) {
        super(obj, view, i);
        this.EZpvd = c55249xgQ;
        this.KWHzl = c55258xgZ;
    }

    public static uVQ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static uVQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (uVQ) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.QslYrK, viewGroup, z, obj);
    }
}
