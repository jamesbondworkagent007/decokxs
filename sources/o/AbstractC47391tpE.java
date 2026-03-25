package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tpE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47391tpE extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final C52794wYp EZpvd;
    public final android.widget.TextView KWHzl;

    public AbstractC47391tpE(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.KWHzl = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC47391tpE OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47391tpE KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47391tpE) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DXXBbs, viewGroup, z, obj);
    }
}
