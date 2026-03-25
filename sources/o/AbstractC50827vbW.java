package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vbW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50827vbW extends ViewDataBinding {
    public final OKAlertBanner AEQbTJ;

    public AbstractC50827vbW(java.lang.Object obj, android.view.View view, int i, OKAlertBanner oKAlertBanner) {
        super(obj, view, i);
        this.AEQbTJ = oKAlertBanner;
    }

    public static AbstractC50827vbW KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return OLrzqt(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC50827vbW OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC50827vbW) ViewDataBinding.inflateInternal(layoutInflater, C48033uCm.Activity.apLTlu, viewGroup, z, obj);
    }
}
