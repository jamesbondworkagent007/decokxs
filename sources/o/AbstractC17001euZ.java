package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17001euZ extends ViewDataBinding {
    public final android.widget.ImageView EZpvd;

    public AbstractC17001euZ(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.EZpvd = imageView;
    }

    public static AbstractC17001euZ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17001euZ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17001euZ) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.fzHEvu, viewGroup, z, obj);
    }
}
