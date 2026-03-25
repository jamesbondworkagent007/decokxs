package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16836erT extends ViewDataBinding {
    public final AbstractC17075evu AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final AppCompatImageView KWHzl;
    public final C57303yfq OLrzqt;
    public final AppCompatTextView copydefault;

    public AbstractC16836erT(java.lang.Object obj, android.view.View view, int i, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, C57303yfq c57303yfq, AbstractC17075evu abstractC17075evu, AppCompatTextView appCompatTextView2) {
        super(obj, view, i);
        this.EZpvd = appCompatTextView;
        this.KWHzl = appCompatImageView;
        this.OLrzqt = c57303yfq;
        this.AEQbTJ = abstractC17075evu;
        this.copydefault = appCompatTextView2;
    }

    public static AbstractC16836erT OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16836erT KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16836erT) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.sRzUNh);
    }
}
