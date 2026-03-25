package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47402tpP extends ViewDataBinding {
    public final C55258xgZ AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final C55251xgS copydefault;

    public AbstractC47402tpP(java.lang.Object obj, android.view.View view, int i, C55258xgZ c55258xgZ, android.widget.ImageView imageView, C55251xgS c55251xgS, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view2) {
        super(obj, view, i);
        this.AEQbTJ = c55258xgZ;
        this.KWHzl = imageView;
        this.copydefault = c55251xgS;
        this.EZpvd = textView;
        this.OLrzqt = textView2;
        this.AYXKKw = view2;
    }

    public static AbstractC47402tpP OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47402tpP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47402tpP) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DCJXGO, viewGroup, z, obj);
    }
}
