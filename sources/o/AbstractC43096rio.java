package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C43084ric;

/* JADX INFO: renamed from: o.rio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43096rio extends ViewDataBinding {

    @Bindable
    public C43155rju AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.view.View copydefault;

    public abstract void copydefault(@androidx.annotation.Nullable C43155rju c43155rju);

    public AbstractC43096rio(java.lang.Object obj, android.view.View view, int i, android.view.View view2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.copydefault = view2;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.EZpvd = imageView;
    }

    public static AbstractC43096rio copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC43096rio KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC43096rio) ViewDataBinding.inflateInternal(layoutInflater, C43084ric.Application.EZpvd, viewGroup, z, obj);
    }
}
