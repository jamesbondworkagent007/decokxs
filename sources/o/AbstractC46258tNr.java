package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import o.C47501trL;

/* JADX INFO: renamed from: o.tNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46258tNr extends ViewDataBinding {
    public final android.widget.ImageButton AEQbTJ;
    public final android.widget.ImageButton AYXKKw;
    public final android.widget.ImageButton AhwBna;
    public final FragmentContainerView AkhnZx;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C33537myN OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final FragmentContainerView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ImageButton gEmmrt;
    public final android.widget.ImageButton valueOf;

    public AbstractC46258tNr(java.lang.Object obj, android.view.View view, int i, C33537myN c33537myN, android.widget.LinearLayout linearLayout, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout2, android.widget.ImageButton imageButton, android.widget.ImageButton imageButton2, android.widget.ImageButton imageButton3, android.widget.ImageButton imageButton4, android.widget.ImageButton imageButton5, FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = c33537myN;
        this.copydefault = linearLayout;
        this.EZpvd = frameLayout;
        this.KWHzl = linearLayout2;
        this.AEQbTJ = imageButton;
        this.gEmmrt = imageButton2;
        this.AhwBna = imageButton3;
        this.valueOf = imageButton4;
        this.AYXKKw = imageButton5;
        this.djBIcL = fragmentContainerView;
        this.AkhnZx = fragmentContainerView2;
        this.fetchVPNInfo = textView;
    }

    public static AbstractC46258tNr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC46258tNr copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC46258tNr) ViewDataBinding.inflateInternal(layoutInflater, C47501trL.Application.RcXXUw, null, false, obj);
    }
}
