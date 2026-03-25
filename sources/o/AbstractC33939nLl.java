package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33939nLl extends ViewDataBinding {
    public final C55239xgG AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView OLrzqt;

    @Bindable
    public C37201opP copydefault;

    public abstract void copydefault(@androidx.annotation.Nullable C37201opP c37201opP);

    public AbstractC33939nLl(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, C55239xgG c55239xgG, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = textView;
        this.AEQbTJ = c55239xgG;
        this.OLrzqt = textView2;
    }

    public static AbstractC33939nLl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33939nLl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33939nLl) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.QDqgQU, viewGroup, z, obj);
    }
}
