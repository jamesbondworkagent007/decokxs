package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31412ltY extends ViewDataBinding {
    public final FragmentContainerView EZpvd;

    public AbstractC31412ltY(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView) {
        super(obj, view, i);
        this.EZpvd = fragmentContainerView;
    }

    public static AbstractC31412ltY EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31412ltY KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31412ltY) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.djBIcL, null, false, obj);
    }
}
