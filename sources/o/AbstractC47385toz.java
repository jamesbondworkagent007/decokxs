package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47385toz extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;

    public AbstractC47385toz(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.FrameLayout frameLayout2, android.widget.LinearLayout linearLayout) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.AEQbTJ = frameLayout2;
        this.KWHzl = linearLayout;
    }

    public static AbstractC47385toz AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47385toz AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47385toz) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.ORxRYg, viewGroup, z, obj);
    }
}
