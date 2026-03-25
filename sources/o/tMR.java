package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: loaded from: classes10.dex */
public abstract class tMR extends ViewDataBinding {
    public final C55251xgS EZpvd;
    public final android.widget.FrameLayout KWHzl;

    public tMR(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, C55251xgS c55251xgS) {
        super(obj, view, i);
        this.KWHzl = frameLayout;
        this.EZpvd = c55251xgS;
    }

    public static tMR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static tMR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (tMR) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.zsXlph, viewGroup, z, obj);
    }
}
