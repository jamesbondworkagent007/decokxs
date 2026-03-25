package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.emc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16580emc extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final C33603mza AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C33546myW DbNXlk;
    public final AppBarLayout EZpvd;
    public final android.view.View KWHzl;
    public final C19394gAt OLrzqt;
    public final C14707dqY copydefault;
    public final AppCompatImageView djBIcL;
    public final RecyclerView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.FrameLayout valueOf;

    public AbstractC16580emc(java.lang.Object obj, android.view.View view, int i, AppBarLayout appBarLayout, android.view.View view2, ConstraintLayout constraintLayout, C14707dqY c14707dqY, C19394gAt c19394gAt, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, C33603mza c33603mza, C33546myW c33546myW, android.widget.TextView textView, android.widget.TextView textView2, RecyclerView recyclerView) {
        super(obj, view, i);
        this.EZpvd = appBarLayout;
        this.KWHzl = view2;
        this.AEQbTJ = constraintLayout;
        this.copydefault = c14707dqY;
        this.OLrzqt = c19394gAt;
        this.AYXKKw = appCompatTextView;
        this.djBIcL = appCompatImageView;
        this.valueOf = frameLayout;
        this.gEmmrt = linearLayout;
        this.AhwBna = c33603mza;
        this.DbNXlk = c33546myW;
        this.isConnected = textView;
        this.AkhnZx = textView2;
        this.fetchVPNInfo = recyclerView;
    }
}
