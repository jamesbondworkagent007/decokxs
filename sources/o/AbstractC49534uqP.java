package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: o.uqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC49534uqP extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final LinearLayoutCompat AYXKKw;
    public final C55251xgS AhwBna;
    public final ShapeableImageView AkhnZx;
    public final AppCompatImageView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppCompatImageView copydefault;
    public final android.widget.ImageView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final LinearLayoutCompat gEmmrt;
    public final AppCompatTextView isConnected;

    @Bindable
    public ViewOnClickListenerC49657usg valueOf;
    public final C49658ush values;

    public abstract void EZpvd(@androidx.annotation.Nullable ViewOnClickListenerC49657usg viewOnClickListenerC49657usg);

    public AbstractC49534uqP(java.lang.Object obj, android.view.View view, int i, AppCompatImageView appCompatImageView, LinearLayoutCompat linearLayoutCompat, android.widget.LinearLayout linearLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, C55251xgS c55251xgS, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView2, android.widget.TextView textView, C49658ush c49658ush, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = appCompatImageView;
        this.KWHzl = linearLayoutCompat;
        this.EZpvd = linearLayout;
        this.OLrzqt = imageView;
        this.AEQbTJ = imageView2;
        this.djBIcL = imageView3;
        this.AYXKKw = linearLayoutCompat2;
        this.gEmmrt = linearLayoutCompat3;
        this.AhwBna = c55251xgS;
        this.AkhnZx = shapeableImageView;
        this.DbNXlk = appCompatImageView2;
        this.fetchVPNInfo = textView;
        this.values = c49658ush;
        this.isConnected = appCompatTextView;
    }
}
