package o;

import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16636enf extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final RecyclerView EZpvd;
    public final C33537myN KWHzl;
    public final Group OLrzqt;
    public final C55173xeu copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC16636enf(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, Group group, C55173xeu c55173xeu, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.KWHzl = c33537myN;
        this.OLrzqt = group;
        this.copydefault = c55173xeu;
        this.EZpvd = recyclerView;
        this.AEQbTJ = textView;
        this.djBIcL = textView2;
        this.AYXKKw = textView3;
    }

    public static AbstractC16636enf AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16636enf copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16636enf) ViewDataBinding.bind(obj, view, C13754dXa.TaskDescription.DQzvGNdrmXxudrmXxu);
    }
}
