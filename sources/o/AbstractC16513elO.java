package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16513elO extends ViewDataBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C57422yiC EZpvd;
    public final android.view.View KWHzl;
    public final C57508yjj OLrzqt;
    public final C57468yiw copydefault;
    public final android.widget.TextView valueOf;

    public AbstractC16513elO(java.lang.Object obj, android.view.View view, int i, C57422yiC c57422yiC, C57508yjj c57508yjj, C57468yiw c57468yiw, android.view.View view2, AppCompatImageView appCompatImageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.EZpvd = c57422yiC;
        this.OLrzqt = c57508yjj;
        this.copydefault = c57468yiw;
        this.KWHzl = view2;
        this.AEQbTJ = appCompatImageView;
        this.AhwBna = textView;
        this.valueOf = textView2;
    }

    public static AbstractC16513elO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16513elO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16513elO) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DGUQLIDGUQLI, viewGroup, z, obj);
    }
}
