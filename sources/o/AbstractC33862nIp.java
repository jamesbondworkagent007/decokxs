package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33862nIp extends ViewDataBinding {
    public final C33537myN EZpvd;
    public final android.widget.FrameLayout copydefault;

    public AbstractC33862nIp(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.EZpvd = c33537myN;
        this.copydefault = frameLayout;
    }

    public static AbstractC33862nIp KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33862nIp copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33862nIp) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.AuCTel, null, false, obj);
    }
}
