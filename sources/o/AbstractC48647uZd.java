package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48647uZd extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final android.widget.ImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;

    public AbstractC48647uZd(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, ConstraintLayout constraintLayout, android.widget.TextView textView, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.AEQbTJ = recyclerView;
        this.copydefault = constraintLayout;
        this.OLrzqt = textView;
        this.KWHzl = imageView;
    }

    public static AbstractC48647uZd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC48647uZd copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC48647uZd) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.unregister, viewGroup, z, obj);
    }
}
