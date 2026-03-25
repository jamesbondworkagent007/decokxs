package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31466luZ extends ViewDataBinding {
    public final FragmentContainerView EZpvd;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;

    public AbstractC31466luZ(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.copydefault = constraintLayout;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = imageView;
    }

    public static AbstractC31466luZ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31466luZ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31466luZ) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.DTwDnp, viewGroup, z, obj);
    }
}
