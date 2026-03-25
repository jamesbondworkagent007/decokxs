package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47468tqc extends ViewDataBinding {
    public final C55018xby AEQbTJ;
    public final android.widget.TextView copydefault;

    public AbstractC47468tqc(java.lang.Object obj, android.view.View view, int i, C55018xby c55018xby, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = c55018xby;
        this.copydefault = textView;
    }

    public static AbstractC47468tqc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47468tqc KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47468tqc) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.RdAHlO, viewGroup, z, obj);
    }
}
