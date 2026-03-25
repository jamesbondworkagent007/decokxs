package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16728epR extends ViewDataBinding {
    public final AppCompatImageView EZpvd;
    public final AppCompatTextView copydefault;

    public AbstractC16728epR(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.EZpvd = appCompatImageView;
        this.copydefault = appCompatTextView;
    }

    public static AbstractC16728epR OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16728epR KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16728epR) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DzkRMH, viewGroup, z, obj);
    }
}
