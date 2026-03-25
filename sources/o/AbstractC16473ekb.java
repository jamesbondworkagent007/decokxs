package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16473ekb extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final wYF EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView copydefault;

    public AbstractC16473ekb(java.lang.Object obj, android.view.View view, int i, wYF wyf, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.EZpvd = wyf;
        this.AEQbTJ = appCompatImageView;
        this.copydefault = appCompatTextView;
        this.KWHzl = appCompatTextView2;
    }

    public static AbstractC16473ekb copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16473ekb KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16473ekb) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DCUTEIddSDPG, viewGroup, z, obj);
    }
}
