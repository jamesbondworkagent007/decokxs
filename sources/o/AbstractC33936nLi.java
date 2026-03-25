package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33936nLi extends ViewDataBinding {
    public final android.widget.TextView EZpvd;

    @Bindable
    public C37199opN KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;

    public abstract void OLrzqt(@androidx.annotation.Nullable C37199opN c37199opN);

    public AbstractC33936nLi(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.OLrzqt = imageView2;
        this.EZpvd = textView;
    }

    public static AbstractC33936nLi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33936nLi AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33936nLi) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.QIZEnU, viewGroup, z, obj);
    }
}
