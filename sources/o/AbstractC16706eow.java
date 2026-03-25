package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.eow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16706eow extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final RecyclerView KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;

    public AbstractC16706eow(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.ImageView imageView, LinearLayoutCompat linearLayoutCompat, RecyclerView recyclerView, AppCompatImageView appCompatImageView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.AEQbTJ = textView;
        this.EZpvd = imageView;
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = recyclerView;
        this.copydefault = appCompatImageView;
        this.djBIcL = textView2;
        this.gEmmrt = textView3;
    }
}
