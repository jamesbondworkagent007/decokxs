package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16301ehO extends ViewDataBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C16797eqh EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C16797eqh OLrzqt;
    public final C16797eqh copydefault;
    public final RecyclerView djBIcL;
    public final AppCompatTextView gEmmrt;
    public final android.widget.ImageView valueOf;

    public AbstractC16301ehO(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, C16797eqh c16797eqh, C16797eqh c16797eqh2, C16797eqh c16797eqh3, android.widget.ImageView imageView, android.widget.ImageView imageView2, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = c16797eqh;
        this.EZpvd = c16797eqh2;
        this.copydefault = c16797eqh3;
        this.KWHzl = imageView;
        this.valueOf = imageView2;
        this.djBIcL = recyclerView;
        this.gEmmrt = appCompatTextView;
    }

    public static AbstractC16301ehO copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16301ehO KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16301ehO) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.QVAiDq, null, false, obj);
    }
}
