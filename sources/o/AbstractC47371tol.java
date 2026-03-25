package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tol, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47371tol extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView EZpvd;

    public AbstractC47371tol(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = frameLayout;
        this.EZpvd = textView;
    }

    public static AbstractC47371tol KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47371tol OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47371tol) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AubY, viewGroup, z, obj);
    }
}
