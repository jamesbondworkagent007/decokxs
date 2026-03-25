package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uTr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48499uTr extends ViewDataBinding {
    public final C55258xgZ EZpvd;
    public final android.widget.TextView OLrzqt;

    public AbstractC48499uTr(java.lang.Object obj, android.view.View view, int i, C55258xgZ c55258xgZ, android.widget.TextView textView) {
        super(obj, view, i);
        this.EZpvd = c55258xgZ;
        this.OLrzqt = textView;
    }

    public static AbstractC48499uTr copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48499uTr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48499uTr) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.dzkkkq, viewGroup, z, obj);
    }
}
