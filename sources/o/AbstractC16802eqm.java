package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16802eqm extends ViewDataBinding {

    @Bindable
    public C19420gBs AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final AppCompatTextView copydefault;

    public abstract void EZpvd(@androidx.annotation.Nullable C19420gBs c19420gBs);

    public AbstractC16802eqm(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.KWHzl = appCompatImageView;
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatTextView2;
    }

    public static AbstractC16802eqm OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16802eqm copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16802eqm) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.FQMcgE, viewGroup, z, obj);
    }
}
