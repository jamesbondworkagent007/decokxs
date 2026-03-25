package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31475lui extends ViewDataBinding {
    public final FragmentContainerView AEQbTJ;

    public AbstractC31475lui(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.AEQbTJ = fragmentContainerView;
    }

    public static AbstractC31475lui OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31475lui OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31475lui) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.AkhnZx, null, false, obj);
    }
}
