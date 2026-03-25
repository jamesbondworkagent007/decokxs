package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uWy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48587uWy extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView copydefault;

    public AbstractC48587uWy(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatImageView;
        this.AEQbTJ = appCompatTextView2;
    }

    public static AbstractC48587uWy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48587uWy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48587uWy) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.sIqKDg, viewGroup, z, obj);
    }
}
