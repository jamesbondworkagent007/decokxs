package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16237egD extends ViewDataBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final RecyclerView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final android.widget.TextView copydefault;
    public final androidx.appcompat.widget.Toolbar djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final NestedScrollView valueOf;

    public AbstractC16237egD(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, C52794wYp c52794wYp, android.widget.TextView textView2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, RecyclerView recyclerView, android.widget.ImageView imageView, android.widget.ImageView imageView2, NestedScrollView nestedScrollView, androidx.appcompat.widget.Toolbar toolbar) {
        super(obj, view, i);
        this.copydefault = textView;
        this.KWHzl = c52794wYp;
        this.EZpvd = textView2;
        this.OLrzqt = linearLayoutCompat;
        this.AEQbTJ = linearLayoutCompat2;
        this.AYXKKw = recyclerView;
        this.gEmmrt = imageView;
        this.AhwBna = imageView2;
        this.valueOf = nestedScrollView;
        this.djBIcL = toolbar;
    }

    public static AbstractC16237egD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16237egD copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16237egD) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.EZpvd, null, false, obj);
    }
}
