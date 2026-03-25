package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16986euK extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView OLrzqt;

    public AbstractC16986euK(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC16986euK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16986euK OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16986euK) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.xxhdY, viewGroup, z, obj);
    }
}
