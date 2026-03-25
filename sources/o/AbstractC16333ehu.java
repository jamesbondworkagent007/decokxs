package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16333ehu extends ViewDataBinding {
    public final RecyclerView AEQbTJ;
    public final C52794wYp EZpvd;
    public final C33537myN copydefault;

    public AbstractC16333ehu(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C52794wYp c52794wYp, RecyclerView recyclerView) {
        super(obj, view, i);
        this.copydefault = c33537myN;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = recyclerView;
    }

    public static AbstractC16333ehu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16333ehu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16333ehu) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.AxsJAY, null, false, obj);
    }
}
