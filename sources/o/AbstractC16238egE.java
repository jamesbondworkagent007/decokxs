package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16238egE extends ViewDataBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final AppCompatImageView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final C57591ylM DbNXlk;
    public final OKAlertBanner EZpvd;
    public final android.view.View KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C17110ewc copydefault;
    public final AppCompatImageView djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final NestedScrollView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final android.widget.LinearLayout fetchVPNInfo;
    public final android.widget.ImageView gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final RecyclerView isConnected;
    public final android.widget.TextView iwGUEr;
    public final android.widget.ImageView valueOf;
    public final android.widget.LinearLayout values;

    public AbstractC16238egE(java.lang.Object obj, android.view.View view, int i, OKAlertBanner oKAlertBanner, ConstraintLayout constraintLayout, android.view.View view2, C17110ewc c17110ewc, android.widget.FrameLayout frameLayout, AppCompatImageView appCompatImageView, android.widget.ImageView imageView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4, AppCompatImageView appCompatImageView2, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2, RecyclerView recyclerView, C57591ylM c57591ylM, NestedScrollView nestedScrollView, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6) {
        super(obj, view, i);
        this.EZpvd = oKAlertBanner;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = view2;
        this.copydefault = c17110ewc;
        this.OLrzqt = frameLayout;
        this.djBIcL = appCompatImageView;
        this.AYXKKw = imageView;
        this.AhwBna = imageView2;
        this.gEmmrt = imageView3;
        this.valueOf = imageView4;
        this.AkhnZx = appCompatImageView2;
        this.values = linearLayout;
        this.fetchVPNInfo = linearLayout2;
        this.isConnected = recyclerView;
        this.DbNXlk = c57591ylM;
        this.fIwbmz = nestedScrollView;
        this.ejfBZ = textView;
        this.fJNWhG = textView2;
        this.AuCTel = textView3;
        this.fARcdN = textView4;
        this.iwGUEr = textView5;
        this.getFieldNames = textView6;
    }

    public static AbstractC16238egE copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC16238egE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC16238egE) ViewDataBinding.inflateInternal(layoutInflater, C13754dXa.TaskDescription.OLrzqt, null, false, obj);
    }
}
