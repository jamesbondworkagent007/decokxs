package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16896esa extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final wYC copydefault;

    public AbstractC16896esa(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.widget.TextView textView, android.widget.TextView textView2, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.copydefault = wyc;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
        this.KWHzl = constraintLayout;
    }

    public static AbstractC16896esa copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16896esa KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16896esa) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.GcnicV, viewGroup, z, obj);
    }
}
