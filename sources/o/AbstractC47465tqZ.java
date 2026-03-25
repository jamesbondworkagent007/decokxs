package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47465tqZ extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView OLrzqt;

    public AbstractC47465tqZ(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = frameLayout;
        this.OLrzqt = textView;
    }

    public static AbstractC47465tqZ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47465tqZ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47465tqZ) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.Dmq, null, false, obj);
    }
}
