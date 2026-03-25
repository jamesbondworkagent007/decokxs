package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.ltO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31402ltO extends ViewDataBinding {
    public final ConstraintLayout OLrzqt;
    public final FragmentContainerView copydefault;

    public AbstractC31402ltO(java.lang.Object obj, android.view.View view, int i, FragmentContainerView fragmentContainerView, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.copydefault = fragmentContainerView;
        this.OLrzqt = constraintLayout;
    }

    public static AbstractC31402ltO AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31402ltO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31402ltO) ViewDataBinding.inflateInternal(layoutInflater, C31351lsQ.ActionBar.AEQbTJ, null, false, obj);
    }
}
