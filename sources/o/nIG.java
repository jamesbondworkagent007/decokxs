package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nIG extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C33537myN OLrzqt;

    public nIG(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.AEQbTJ = frameLayout;
    }

    public static nIG OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nIG KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nIG) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.gHZMYf, null, false, obj);
    }
}
