package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.luP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31456luP extends ViewDataBinding {
    public final C31698mAp AEQbTJ;
    public final android.widget.FrameLayout KWHzl;

    public AbstractC31456luP(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, C31698mAp c31698mAp) {
        super(obj, view, i);
        this.KWHzl = frameLayout;
        this.AEQbTJ = c31698mAp;
    }

    public static AbstractC31456luP AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        return KWHzl(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC31456luP KWHzl(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC31456luP) ViewDataBinding.bind(obj, view, C31351lsQ.ActionBar.gHZMYf);
    }
}
