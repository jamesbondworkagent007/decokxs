package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46260tNt extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    @Bindable
    public java.lang.String djBIcL;

    @Bindable
    public java.lang.String valueOf;

    public abstract void AEQbTJ(@androidx.annotation.Nullable java.lang.String str);

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.String str);

    public AbstractC46260tNt(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.TextView textView2, ConstraintLayout constraintLayout2, android.widget.TextView textView3, android.widget.TextView textView4) {
        super(obj, view, i);
        this.EZpvd = constraintLayout;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.AEQbTJ = constraintLayout2;
        this.OLrzqt = textView3;
        this.AhwBna = textView4;
    }

    public static AbstractC46260tNt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC46260tNt OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC46260tNt) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.giSNqX, viewGroup, z, obj);
    }
}
