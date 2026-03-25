package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47400tpN extends ViewDataBinding {
    public final android.widget.TextView KWHzl;

    public AbstractC47400tpN(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView) {
        super(obj, view, i);
        this.KWHzl = textView;
    }

    public static AbstractC47400tpN AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47400tpN EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47400tpN) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.zuWLRA, viewGroup, z, obj);
    }
}
