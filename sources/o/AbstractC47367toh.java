package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47367toh extends ViewDataBinding {
    public final C55018xby AEQbTJ;
    public final C52794wYp EZpvd;
    public final C55008xbo KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    public AbstractC47367toh(java.lang.Object obj, android.view.View view, int i, C52794wYp c52794wYp, android.widget.LinearLayout linearLayout, C55008xbo c55008xbo, android.widget.TextView textView, C55018xby c55018xby) {
        super(obj, view, i);
        this.EZpvd = c52794wYp;
        this.copydefault = linearLayout;
        this.KWHzl = c55008xbo;
        this.OLrzqt = textView;
        this.AEQbTJ = c55018xby;
    }

    public static AbstractC47367toh copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47367toh KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47367toh) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.getFieldNames, viewGroup, z, obj);
    }
}
