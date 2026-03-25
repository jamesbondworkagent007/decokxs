package o;

import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8293azx extends ViewDataBinding {
    public final android.widget.LinearLayout KWHzl;

    @Bindable
    public C6714aUa copydefault;

    public abstract void KWHzl(@androidx.annotation.Nullable C6714aUa c6714aUa);

    public AbstractC8293azx(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout) {
        super(obj, view, i);
        this.KWHzl = linearLayout;
    }

    public static AbstractC8293azx OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC8293azx OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC8293azx) ViewDataBinding.bind(obj, view, C8206ayP.Application.wlaJM);
    }
}
