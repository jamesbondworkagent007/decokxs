package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public final class qZV implements ViewBinding {
    public final C34886nks AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final C35144npl EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55258xgZ OLrzqt;
    public final C55113xdn copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public qZV(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull C35144npl c35144npl, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C34886nks c34886nks, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.AhwBna = linearLayout;
        this.OLrzqt = c55258xgZ;
        this.EZpvd = c35144npl;
        this.KWHzl = linearLayout2;
        this.copydefault = c55113xdn;
        this.AEQbTJ = c34886nks;
        this.valueOf = recyclerView;
        this.gEmmrt = textView;
        this.djBIcL = textView2;
        this.AYXKKw = textView3;
        this.fetchVPNInfo = textView4;
    }

    public static qZV KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.fupbxE;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = qZH.StateListAnimator.FSMca;
            C35144npl c35144npl = (C35144npl) ViewBindings.findChildViewById(view, i);
            if (c35144npl != null) {
                i = qZH.StateListAnimator.GPCHlQ;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = qZH.StateListAnimator.ibnZAm;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        i = qZH.StateListAnimator.gdwsGQ;
                        C34886nks c34886nks = (C34886nks) ViewBindings.findChildViewById(view, i);
                        if (c34886nks != null) {
                            i = qZH.StateListAnimator.onLocationChanged;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = qZH.StateListAnimator.hBORwR;
                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = qZH.StateListAnimator.ibrGus;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = qZH.StateListAnimator.IPostMessageServiceStub;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = qZH.StateListAnimator.MediaBrowserCompatItemReceiver;
                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                return new qZV((android.widget.LinearLayout) view, c55258xgZ, c35144npl, linearLayout, c55113xdn, c34886nks, recyclerView, textView, textView2, textView3, textView4);
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
