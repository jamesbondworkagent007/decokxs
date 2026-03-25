package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47389tpC extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View AYXKKw;
    public final C55258xgZ EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55251xgS copydefault;

    public AbstractC47389tpC(java.lang.Object obj, android.view.View view, int i, C55258xgZ c55258xgZ, android.widget.ImageView imageView, C55251xgS c55251xgS, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view2) {
        super(obj, view, i);
        this.EZpvd = c55258xgZ;
        this.OLrzqt = imageView;
        this.copydefault = c55251xgS;
        this.AEQbTJ = textView;
        this.KWHzl = textView2;
        this.AYXKKw = view2;
    }

    public static AbstractC47389tpC OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47389tpC OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47389tpC) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.OqFWZa, viewGroup, z, obj);
    }
}
