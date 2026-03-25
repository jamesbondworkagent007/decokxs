package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eoI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16666eoI extends ViewDataBinding {
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC16666eoI(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = imageView;
        this.copydefault = textView;
    }

    public static AbstractC16666eoI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16666eoI copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16666eoI) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.DcMfJKDCKfqPDCfLja, viewGroup, z, obj);
    }
}
