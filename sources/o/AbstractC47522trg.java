package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47522trg extends ViewDataBinding {
    public final C54989xbV KWHzl;

    public AbstractC47522trg(java.lang.Object obj, android.view.View view, int i, C54989xbV c54989xbV) {
        super(obj, view, i);
        this.KWHzl = c54989xbV;
    }

    public static AbstractC47522trg KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47522trg EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47522trg) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.WS, viewGroup, z, obj);
    }
}
