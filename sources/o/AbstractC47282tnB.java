package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47282tnB extends ViewDataBinding {
    public final android.widget.FrameLayout EZpvd;

    public AbstractC47282tnB(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
    }

    public static AbstractC47282tnB KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47282tnB KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47282tnB) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.gEmmrt, null, false, obj);
    }
}
