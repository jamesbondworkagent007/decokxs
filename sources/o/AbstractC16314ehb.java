package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16314ehb extends ViewDataBinding {
    public final RecyclerView EZpvd;
    public final C33537myN KWHzl;
    public final C55113xdn OLrzqt;

    public AbstractC16314ehb(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C55113xdn c55113xdn, RecyclerView recyclerView) {
        super(obj, view, i);
        this.KWHzl = c33537myN;
        this.OLrzqt = c55113xdn;
        this.EZpvd = recyclerView;
    }

    public static AbstractC16314ehb EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16314ehb AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16314ehb) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.uzCIH, null, false, obj);
    }
}
