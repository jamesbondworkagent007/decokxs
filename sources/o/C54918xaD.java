package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C52761wXj;

/* JADX INFO: renamed from: o.xaD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54918xaD implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final C52794wYp AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final C55317xhf KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final C55317xhf copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.RelativeLayout fetchVPNInfo;
    public final android.widget.RelativeLayout gEmmrt;
    public final android.widget.RelativeLayout isConnected;
    public final android.widget.LinearLayout valueOf;
    public final C52794wYp values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.isConnected;
    }

    public C54918xaD(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull C55317xhf c55317xhf, @androidx.annotation.NonNull C55317xhf c55317xhf2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout3, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout3, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout4, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.isConnected = relativeLayout;
        this.OLrzqt = relativeLayout2;
        this.copydefault = c55317xhf;
        this.KWHzl = c55317xhf2;
        this.EZpvd = imageView;
        this.AEQbTJ = imageView2;
        this.AYXKKw = linearLayout;
        this.djBIcL = linearLayout2;
        this.valueOf = linearLayout3;
        this.AhwBna = c52794wYp;
        this.gEmmrt = relativeLayout3;
        this.fetchVPNInfo = relativeLayout4;
        this.values = c52794wYp2;
        this.AkhnZx = textView;
        this.DbNXlk = textView2;
    }

    public static C54918xaD AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C52761wXj.Fragment.gasjUx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C54918xaD KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C52761wXj.FragmentManager.QKudOq;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = C52761wXj.FragmentManager.QSBOWP;
            C55317xhf c55317xhf = (C55317xhf) ViewBindings.findChildViewById(view, i);
            if (c55317xhf != null) {
                i = C52761wXj.FragmentManager.OBJEWx;
                C55317xhf c55317xhf2 = (C55317xhf) ViewBindings.findChildViewById(view, i);
                if (c55317xhf2 != null) {
                    i = C52761wXj.FragmentManager.hrNTAI;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C52761wXj.FragmentManager.QVsKAR;
                        android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = C52761wXj.FragmentManager.fERRXa;
                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = C52761wXj.FragmentManager.igXuih;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C52761wXj.FragmentManager.Dmq;
                                    android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout3 != null) {
                                        i = C52761wXj.FragmentManager.QIZEnU;
                                        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                        if (c52794wYp != null) {
                                            i = C52761wXj.FragmentManager.aHXSQp;
                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout2 != null) {
                                                i = C52761wXj.FragmentManager.akftKQ;
                                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout3 != null) {
                                                    i = C52761wXj.FragmentManager.vLaW;
                                                    C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                                    if (c52794wYp2 != null) {
                                                        i = C52761wXj.FragmentManager.DQYQgr;
                                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = C52761wXj.FragmentManager.fXYAwm;
                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView2 != null) {
                                                                return new C54918xaD((android.widget.RelativeLayout) view, relativeLayout, c55317xhf, c55317xhf2, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, c52794wYp, relativeLayout2, relativeLayout3, c52794wYp2, textView, textView2);
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
