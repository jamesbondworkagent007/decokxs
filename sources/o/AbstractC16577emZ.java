package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16577emZ extends ViewDataBinding {
    public final android.view.View EZpvd;
    public final RecyclerView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final AppCompatImageView copydefault;

    public AbstractC16577emZ(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, android.view.View view2, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = appCompatImageView;
        this.EZpvd = view2;
        this.KWHzl = recyclerView;
        this.OLrzqt = textView;
    }

    public static AbstractC16577emZ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16577emZ AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16577emZ) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.isReflectionWorking, viewGroup, z, obj);
    }
}
