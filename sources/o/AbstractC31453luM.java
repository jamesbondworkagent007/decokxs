package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31453luM extends ViewDataBinding {
    public final FragmentContainerView AEQbTJ;

    public AbstractC31453luM(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.AEQbTJ = fragmentContainerView;
    }

    public static AbstractC31453luM KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31453luM OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31453luM) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.zsXlph, viewGroup, z, obj);
    }
}
