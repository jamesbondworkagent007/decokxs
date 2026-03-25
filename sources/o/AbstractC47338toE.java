package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47338toE extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.ToggleButton AhwBna;
    public final android.widget.ScrollView AkhnZx;
    public final syZ DbNXlk;
    public final C55008xbo EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.view.View OLrzqt;
    public final syW copydefault;
    public final android.widget.TextView djBIcL;
    public final RecyclerView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final C45863szc valueOf;
    public final android.widget.ToggleButton values;

    public AbstractC47338toE(java.lang.Object obj, android.view.View view, int i, syW syw, android.widget.ImageView imageView, C55008xbo c55008xbo, android.widget.LinearLayout linearLayout, android.view.View view2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, C45863szc c45863szc, android.widget.ToggleButton toggleButton, android.widget.ToggleButton toggleButton2, RecyclerView recyclerView, syZ syz, android.widget.ScrollView scrollView, android.widget.TextView textView4) {
        super(obj, view, i);
        this.copydefault = syw;
        this.AEQbTJ = imageView;
        this.EZpvd = c55008xbo;
        this.KWHzl = linearLayout;
        this.OLrzqt = view2;
        this.AYXKKw = textView;
        this.gEmmrt = textView2;
        this.djBIcL = textView3;
        this.valueOf = c45863szc;
        this.AhwBna = toggleButton;
        this.values = toggleButton2;
        this.fetchVPNInfo = recyclerView;
        this.DbNXlk = syz;
        this.AkhnZx = scrollView;
        this.isConnected = textView4;
    }

    public static AbstractC47338toE KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47338toE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47338toE) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.OcIXYQ, viewGroup, z, obj);
    }
}
