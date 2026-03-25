package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.urk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49608urk extends ViewDataBinding {
    public final wYK AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.view.View OLrzqt;

    public AbstractC49608urk(java.lang.Object obj, android.view.View view, int i, wYK wyk, android.widget.TextView textView, android.view.View view2) {
        super(obj, view, i);
        this.AEQbTJ = wyk;
        this.EZpvd = textView;
        this.OLrzqt = view2;
    }

    public static AbstractC49608urk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC49608urk KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC49608urk) ViewDataBinding.inflateInternal(layoutInflater, C49511upt.StateListAnimator.DTwDnp, viewGroup, z, obj);
    }
}
