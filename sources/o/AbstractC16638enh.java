package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16638enh extends ViewDataBinding {
    public final C33537myN AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C55173xeu OLrzqt;
    public final RecyclerView copydefault;

    public AbstractC16638enh(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, C55173xeu c55173xeu, RecyclerView recyclerView, android.widget.TextView textView) {
        super(obj, view, i);
        this.AEQbTJ = c33537myN;
        this.OLrzqt = c55173xeu;
        this.copydefault = recyclerView;
        this.EZpvd = textView;
    }

    public static AbstractC16638enh EZpvd(@androidx.annotation.NonNull android.view.View view) {
        return OLrzqt(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16638enh OLrzqt(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16638enh) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.DcMfJK);
    }
}
