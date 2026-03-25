package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: renamed from: o.emd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16581emd extends ViewDataBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final RecyclerView AkhnZx;
    public final ConstraintLayout DbNXlk;
    public final C57439yiT EZpvd;
    public final AppBarLayout KWHzl;
    public final gBL OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final Group fJNWhG;
    public final CardView fetchVPNInfo;
    public final NestedScrollView gEmmrt;
    public final C33546myW isConnected;
    public final C21321gxZ valueOf;
    public final C33603mza values;

    public AbstractC16581emd(java.lang.Object obj, android.view.View view, int i, C57439yiT c57439yiT, AppBarLayout appBarLayout, android.widget.ImageView imageView, gBL gbl, android.view.View view2, android.widget.ImageView imageView2, C21321gxZ c21321gxZ, android.widget.TextView textView, NestedScrollView nestedScrollView, android.widget.TextView textView2, ConstraintLayout constraintLayout, CardView cardView, RecyclerView recyclerView, C33603mza c33603mza, C33546myW c33546myW, Group group) {
        super(obj, view, i);
        this.EZpvd = c57439yiT;
        this.KWHzl = appBarLayout;
        this.copydefault = imageView;
        this.OLrzqt = gbl;
        this.AEQbTJ = view2;
        this.AYXKKw = imageView2;
        this.valueOf = c21321gxZ;
        this.djBIcL = textView;
        this.gEmmrt = nestedScrollView;
        this.AhwBna = textView2;
        this.DbNXlk = constraintLayout;
        this.fetchVPNInfo = cardView;
        this.AkhnZx = recyclerView;
        this.values = c33603mza;
        this.isConnected = c33546myW;
        this.fJNWhG = group;
    }
}
