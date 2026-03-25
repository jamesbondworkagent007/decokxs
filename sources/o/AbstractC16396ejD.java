package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16396ejD extends ViewDataBinding {
    public final wYC AEQbTJ;
    public final android.widget.FrameLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final wYC copydefault;

    public AbstractC16396ejD(java.lang.Object obj, android.view.View view, int i, wYC wyc, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, wYC wyc2) {
        super(obj, view, i);
        this.AEQbTJ = wyc;
        this.KWHzl = frameLayout;
        this.OLrzqt = imageView;
        this.copydefault = wyc2;
    }

    public static AbstractC16396ejD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16396ejD KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16396ejD) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.dUDNAs, null, false, obj);
    }
}
