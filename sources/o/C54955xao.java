package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textview.MaterialTextView;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54955xao implements ViewBinding {
    public final MaterialTextView AEQbTJ;
    public final C55389xiy AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final android.widget.RelativeLayout AkhnZx;
    public final MaterialTextView DbNXlk;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55071xcy OLrzqt;
    public final android.widget.RelativeLayout copydefault;
    public final MaterialTextView djBIcL;
    public final android.widget.RelativeLayout fARcdN;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.RelativeLayout isConnected;
    public final C55070xcx valueOf;
    public final MaterialTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.fARcdN;
    }

    public C54955xao(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55071xcy c55071xcy, @androidx.annotation.NonNull MaterialTextView materialTextView, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull MaterialTextView materialTextView2, @androidx.annotation.NonNull C55389xiy c55389xiy, @androidx.annotation.NonNull C55070xcx c55070xcx, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout4, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout3, @androidx.annotation.NonNull MaterialTextView materialTextView3, @androidx.annotation.NonNull MaterialTextView materialTextView4, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout4) {
        this.fARcdN = relativeLayout;
        this.EZpvd = linearLayout;
        this.OLrzqt = c55071xcy;
        this.AEQbTJ = materialTextView;
        this.copydefault = relativeLayout2;
        this.KWHzl = linearLayout2;
        this.AhwBna = linearLayout3;
        this.djBIcL = materialTextView2;
        this.AYXKKw = c55389xiy;
        this.valueOf = c55070xcx;
        this.gEmmrt = linearLayout4;
        this.AkhnZx = relativeLayout3;
        this.values = materialTextView3;
        this.DbNXlk = materialTextView4;
        this.fetchVPNInfo = textView;
        this.isConnected = relativeLayout4;
    }

    public static C54955xao EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.AxsJAY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54955xao KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.iwGUEr;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = C52761wXj.FragmentManager.uzCIH;
            C55071xcy c55071xcy = (C55071xcy) ViewBindings.findChildViewById(view, i);
            if (c55071xcy != null) {
                i = C52761wXj.FragmentManager.getNewProxyInstance;
                MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                if (materialTextView != null) {
                    i = C52761wXj.FragmentManager.QfsBiF;
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = C52761wXj.FragmentManager.QVAiDq;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C52761wXj.FragmentManager.RJOkX;
                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout3 != null) {
                                i = C52761wXj.FragmentManager.QUSxYX;
                                MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                if (materialTextView2 != null) {
                                    i = C52761wXj.FragmentManager.aKErDB;
                                    C55389xiy c55389xiy = (C55389xiy) ViewBindings.findChildViewById(view, i);
                                    if (c55389xiy != null) {
                                        i = C52761wXj.FragmentManager.UeEOUB;
                                        C55070xcx c55070xcx = (C55070xcx) ViewBindings.findChildViewById(view, i);
                                        if (c55070xcx != null) {
                                            i = C52761wXj.FragmentManager.DsrFlB;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout4 != null) {
                                                i = C52761wXj.FragmentManager.DGgnkA;
                                                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout2 != null) {
                                                    i = C52761wXj.FragmentManager.RKcVTr;
                                                    MaterialTextView materialTextView3 = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                                    if (materialTextView3 != null) {
                                                        i = C52761wXj.FragmentManager.QDqgQU;
                                                        MaterialTextView materialTextView4 = (MaterialTextView) ViewBindings.findChildViewById(view, i);
                                                        if (materialTextView4 != null) {
                                                            i = C52761wXj.FragmentManager.QXDzTk;
                                                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView != null) {
                                                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) view;
                                                                return new C54955xao(relativeLayout3, linearLayout, c55071xcy, materialTextView, relativeLayout, linearLayout2, linearLayout3, materialTextView2, c55389xiy, c55070xcx, linearLayout4, relativeLayout2, materialTextView3, materialTextView4, textView, relativeLayout3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
