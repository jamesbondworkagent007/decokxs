package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47443tqD extends ViewDataBinding {
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;

    public AbstractC47443tqD(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = recyclerView;
        this.KWHzl = textView;
        this.EZpvd = textView2;
    }

    public static AbstractC47443tqD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47443tqD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47443tqD) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.USBtdM, viewGroup, z, obj);
    }
}
