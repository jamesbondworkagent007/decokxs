package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54957xaq implements ViewBinding {
    public final C55001xbh AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.view.View djBIcL;
    public final android.widget.RelativeLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C54957xaq(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55001xbh c55001xbh, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.djBIcL = view;
        this.EZpvd = relativeLayout;
        this.OLrzqt = textView;
        this.AEQbTJ = c55001xbh;
        this.copydefault = linearLayout;
        this.KWHzl = linearLayout2;
        this.gEmmrt = relativeLayout2;
        this.AhwBna = textView2;
    }

    public static C54957xaq EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C52761wXj.Fragment.UeEOUB, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static C54957xaq AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.AxsJAY;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C52761wXj.FragmentManager.QKVWgx;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C52761wXj.FragmentManager.flVtFt;
                C55001xbh c55001xbh = (C55001xbh) ViewBindings.findChildViewById(view, i);
                if (c55001xbh != null) {
                    i = C52761wXj.FragmentManager.RdAHlO;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C52761wXj.FragmentManager.ixgjPv;
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = C52761wXj.FragmentManager.alsFma;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = C52761wXj.FragmentManager.iKEqwx;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C54957xaq(view, relativeLayout, textView, c55001xbh, linearLayout, linearLayout2, relativeLayout2, textView2);
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
