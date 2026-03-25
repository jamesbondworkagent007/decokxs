package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50834vbd extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;

    public AbstractC50834vbd(java.lang.Object obj, android.view.View view, int i, android.view.View view2, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = view2;
        this.OLrzqt = textView;
        this.KWHzl = textView2;
    }

    public static AbstractC50834vbd AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50834vbd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50834vbd) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.RZMhtF, viewGroup, z, obj);
    }
}
