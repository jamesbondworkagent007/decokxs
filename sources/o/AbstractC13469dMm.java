package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.dLX;

/* JADX INFO: renamed from: o.dMm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13469dMm extends ViewDataBinding {
    public final android.widget.FrameLayout copydefault;

    public AbstractC13469dMm(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.copydefault = frameLayout;
    }

    public static AbstractC13469dMm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC13469dMm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC13469dMm) ViewDataBinding.inflateInternal(layoutInflater, dLX.Fragment.djBIcL, viewGroup, z, obj);
    }
}
