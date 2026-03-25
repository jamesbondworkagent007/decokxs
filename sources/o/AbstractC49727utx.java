package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C49720utq;

/* JADX INFO: renamed from: o.utx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49727utx extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC49727utx(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.view.View view2, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.copydefault = textView;
        this.KWHzl = view2;
        this.AEQbTJ = textView2;
        this.OLrzqt = textView3;
    }

    public static AbstractC49727utx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC49727utx OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC49727utx) ViewDataBinding.inflateInternal(layoutInflater, C49720utq.ActionBar.AEQbTJ, viewGroup, z, obj);
    }
}
