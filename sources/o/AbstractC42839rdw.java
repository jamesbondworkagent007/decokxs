package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.qZH;

/* JADX INFO: renamed from: o.rdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC42839rdw extends ViewDataBinding {
    public final C28005kLj AEQbTJ;
    public final C33546myW AhwBna;
    public final FragmentContainerView EZpvd;
    public final android.widget.HorizontalScrollView KWHzl;
    public final C28005kLj OLrzqt;
    public final FragmentContainerView copydefault;

    public AbstractC42839rdw(java.lang.Object obj, android.view.View view, int i, C28005kLj c28005kLj, FragmentContainerView fragmentContainerView, C28005kLj c28005kLj2, android.widget.HorizontalScrollView horizontalScrollView, FragmentContainerView fragmentContainerView2, C33546myW c33546myW) {
        super(obj, view, i);
        this.AEQbTJ = c28005kLj;
        this.copydefault = fragmentContainerView;
        this.OLrzqt = c28005kLj2;
        this.KWHzl = horizontalScrollView;
        this.EZpvd = fragmentContainerView2;
        this.AhwBna = c33546myW;
    }

    public static AbstractC42839rdw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return EZpvd(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC42839rdw EZpvd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC42839rdw) ViewDataBinding.bind(obj, view, qZH.ActionBar.invokespecialgBtXYZ);
    }
}
