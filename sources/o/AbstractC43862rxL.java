package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43862rxL extends ViewDataBinding {
    public final android.widget.ImageView copydefault;

    public AbstractC43862rxL(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.copydefault = imageView;
    }

    public static AbstractC43862rxL EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC43862rxL KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC43862rxL) ViewDataBinding.inflateInternal(layoutInflater, C43662rtX.TaskDescription.RlQdEF, viewGroup, z, obj);
    }
}
