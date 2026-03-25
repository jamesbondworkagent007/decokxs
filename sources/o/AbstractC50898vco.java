package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.item.OKRegularCell;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50898vco extends ViewDataBinding {
    public final OKRegularCell AEQbTJ;
    public final android.widget.ImageView copydefault;

    public AbstractC50898vco(java.lang.Object obj, android.view.View view, int i, OKRegularCell oKRegularCell, android.widget.ImageView imageView) {
        super(obj, view, i);
        this.AEQbTJ = oKRegularCell;
        this.copydefault = imageView;
    }

    public static AbstractC50898vco OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50898vco KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50898vco) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.QzqeNH, viewGroup, z, obj);
    }
}
