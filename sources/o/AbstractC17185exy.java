package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.item.OKRegularCell;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17185exy extends ViewDataBinding {
    public final OKRegularCell KWHzl;
    public final C33609mzg OLrzqt;

    public AbstractC17185exy(java.lang.Object obj, android.view.View view, int i, OKRegularCell oKRegularCell, C33609mzg c33609mzg) {
        super(obj, view, i);
        this.KWHzl = oKRegularCell;
        this.OLrzqt = c33609mzg;
    }

    public static AbstractC17185exy OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17185exy copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17185exy) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.OqhRBMiKdSzF);
    }
}
