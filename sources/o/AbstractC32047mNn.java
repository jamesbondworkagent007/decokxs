package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC32047mNn extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final RecyclerView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final TabLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.ImageView valueOf;

    public AbstractC32047mNn(java.lang.Object obj, android.view.View view, int i, TabLayout tabLayout, RecyclerView recyclerView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4, android.widget.TextView textView4) {
        super(obj, view, i);
        this.copydefault = tabLayout;
        this.EZpvd = recyclerView;
        this.KWHzl = textView;
        this.OLrzqt = textView2;
        this.AEQbTJ = textView3;
        this.gEmmrt = imageView;
        this.djBIcL = imageView2;
        this.valueOf = imageView3;
        this.AYXKKw = imageView4;
        this.AhwBna = textView4;
    }

    public static AbstractC32047mNn OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC32047mNn EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC32047mNn) ViewDataBinding.inflateInternal(layoutInflater, C31976mKx.Application.QOLQEE, viewGroup, z, obj);
    }
}
