package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57383yhQ extends ViewDataBinding {
    public final C55249xgQ AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final C55251xgS DbNXlk;
    public final android.view.View EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.view.View OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fJNWhG;
    public final android.widget.TextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.LinearLayout valueOf;
    public final android.widget.TextView values;

    public AbstractC57383yhQ(java.lang.Object obj, android.view.View view, int i, C55249xgQ c55249xgQ, android.view.View view2, android.view.View view3, android.view.View view4, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, ConstraintLayout constraintLayout, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, C55251xgS c55251xgS, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7) {
        super(obj, view, i);
        this.AEQbTJ = c55249xgQ;
        this.copydefault = view2;
        this.OLrzqt = view3;
        this.EZpvd = view4;
        this.KWHzl = imageView;
        this.AhwBna = imageView2;
        this.AYXKKw = imageView3;
        this.gEmmrt = constraintLayout;
        this.djBIcL = linearLayout;
        this.valueOf = linearLayout2;
        this.DbNXlk = c55251xgS;
        this.values = textView;
        this.isConnected = textView2;
        this.AkhnZx = textView3;
        this.fetchVPNInfo = textView4;
        this.ejfBZ = textView5;
        this.fARcdN = textView6;
        this.fJNWhG = textView7;
    }

    public static AbstractC57383yhQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC57383yhQ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC57383yhQ) ViewDataBinding.inflateInternal(layoutInflater, C57406yhn.TaskDescription.wlaJM, viewGroup, z, obj);
    }
}
