package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17044evP extends ViewDataBinding {
    public final C55008xbo OLrzqt;
    public final AbstractC17050evV copydefault;

    public AbstractC17044evP(java.lang.Object obj, android.view.View view, int i, C55008xbo c55008xbo, AbstractC17050evV abstractC17050evV) {
        super(obj, view, i);
        this.OLrzqt = c55008xbo;
        this.copydefault = abstractC17050evV;
    }

    public static AbstractC17044evP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC17044evP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC17044evP) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.aWJMta, null, false, obj);
    }
}
