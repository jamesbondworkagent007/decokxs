package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16609enE extends ViewDataBinding {
    public final AppCompatTextView KWHzl;

    public AbstractC16609enE(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.KWHzl = appCompatTextView;
    }

    public static AbstractC16609enE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16609enE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16609enE) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.invokespecialDPHOMC, viewGroup, z, obj);
    }
}
