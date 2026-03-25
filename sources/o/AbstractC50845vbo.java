package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50845vbo extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final AppCompatImageView AYXKKw;
    public final Flow AhwBna;
    public final AppCompatTextView EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final AppCompatImageView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView djBIcL;
    public final Group valueOf;

    public AbstractC50845vbo(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView3, android.widget.LinearLayout linearLayout, Flow flow, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView2, Group group) {
        super(obj, view, i);
        this.AEQbTJ = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.OLrzqt = appCompatImageView;
        this.copydefault = appCompatTextView3;
        this.KWHzl = linearLayout;
        this.AhwBna = flow;
        this.djBIcL = appCompatTextView4;
        this.AYXKKw = appCompatImageView2;
        this.valueOf = group;
    }

    public static AbstractC50845vbo OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50845vbo KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50845vbo) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.izFvvl, viewGroup, z, obj);
    }
}
