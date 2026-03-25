package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uSh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48462uSh extends ViewDataBinding {
    public final C55251xgS KWHzl;
    public final C55251xgS OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC48462uSh(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, C55251xgS c55251xgS, C55251xgS c55251xgS2) {
        super(obj, view, i);
        this.copydefault = textView;
        this.OLrzqt = c55251xgS;
        this.KWHzl = c55251xgS2;
    }

    public static AbstractC48462uSh EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48462uSh AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48462uSh) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.reset, viewGroup, z, obj);
    }
}
