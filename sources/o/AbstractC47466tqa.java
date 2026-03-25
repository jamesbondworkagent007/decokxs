package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47466tqa extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;

    public AbstractC47466tqa(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
    }

    public static AbstractC47466tqa AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47466tqa OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47466tqa) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.OBJEWx, viewGroup, z, obj);
    }
}
