package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47281tnA extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final wYC copydefault;

    public AbstractC47281tnA(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2) {
        super(obj, view, i);
        this.copydefault = wyc;
        this.AEQbTJ = frameLayout;
        this.KWHzl = frameLayout2;
    }

    public static AbstractC47281tnA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47281tnA KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47281tnA) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AYXKKw, null, false, obj);
    }
}
