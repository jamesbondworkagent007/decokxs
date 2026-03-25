package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21500hBr implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.RelativeLayout AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.RelativeLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.LinearLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.djBIcL;
    }

    public C21500hBr(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.djBIcL = linearLayout;
        this.copydefault = textView;
        this.OLrzqt = imageView;
        this.KWHzl = textView2;
        this.AEQbTJ = textView3;
        this.EZpvd = relativeLayout;
        this.AhwBna = relativeLayout2;
        this.AYXKKw = textView4;
        this.valueOf = imageView2;
        this.gEmmrt = textView5;
        this.AkhnZx = textView6;
    }

    public static C21500hBr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DLGVGj, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21500hBr KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OUcgGI;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.FF;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.uLLnq;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.OeawrH;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C23274hvD.Application.getFullyDrawnReporter;
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = C23274hvD.Application.getLastCustomNonConfigurationInstance;
                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout2 != null) {
                                i = C23274hvD.Application.PickVisualMediaRequestdefault;
                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null) {
                                    i = C23274hvD.Application.getSynchronousResult;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = C23274hvD.Application.ActivityResultContracts;
                                        android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView5 != null) {
                                            i = C23274hvD.Application.ActivityResultContractSynchronousResult;
                                            android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView6 != null) {
                                                return new C21500hBr((android.widget.LinearLayout) view, textView, imageView, textView2, textView3, relativeLayout, relativeLayout2, textView4, imageView2, textView5, textView6);
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
