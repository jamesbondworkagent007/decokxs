package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49530uqL extends ViewDataBinding {
    public final C55052xcf AEQbTJ;

    public AbstractC49530uqL(java.lang.Object obj, android.view.View view, int i, C55052xcf c55052xcf) {
        super(obj, view, i);
        this.AEQbTJ = c55052xcf;
    }

    public static AbstractC49530uqL copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC49530uqL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC49530uqL) ViewDataBinding.inflateInternal(layoutInflater, C49511upt.StateListAnimator.isConnected, viewGroup, z, obj);
    }
}
