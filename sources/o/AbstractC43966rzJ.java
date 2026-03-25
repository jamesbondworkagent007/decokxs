package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC43966rzJ extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.FrameLayout copydefault;

    public AbstractC43966rzJ(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.AEQbTJ = imageView;
        this.copydefault = frameLayout;
    }

    public static AbstractC43966rzJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC43966rzJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC43966rzJ) ViewDataBinding.inflateInternal(layoutInflater, C43662rtX.TaskDescription.WS, viewGroup, z, obj);
    }
}
