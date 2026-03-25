package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31449luI extends ViewDataBinding {
    public final FragmentContainerView OLrzqt;

    public AbstractC31449luI(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.OLrzqt = fragmentContainerView;
    }

    public static AbstractC31449luI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31449luI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31449luI) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.zLjUOn, viewGroup, z, obj);
    }
}
