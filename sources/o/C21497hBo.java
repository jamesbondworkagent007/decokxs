package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hBo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21497hBo implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.RelativeLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.ImageView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.RelativeLayout DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.RelativeLayout djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final android.widget.LinearLayout isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.isConnected;
    }

    public C21497hBo(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout2, @androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout3, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull android.widget.TextView textView9) {
        this.isConnected = linearLayout;
        this.OLrzqt = textView;
        this.copydefault = imageView;
        this.EZpvd = textView2;
        this.AEQbTJ = textView3;
        this.KWHzl = textView4;
        this.AhwBna = imageView2;
        this.valueOf = textView5;
        this.gEmmrt = textView6;
        this.djBIcL = relativeLayout;
        this.AYXKKw = relativeLayout2;
        this.DbNXlk = relativeLayout3;
        this.fetchVPNInfo = textView7;
        this.AkhnZx = imageView3;
        this.values = textView8;
        this.AuCTel = textView9;
    }

    public static C21497hBo OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.iCPUKe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21497hBo EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.igXuih;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.fjfviF;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.Dmq;
                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = C23274hvD.Application.call;
                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = C23274hvD.Application.OUcgGI;
                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = C23274hvD.Application.FF;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.uLLnq;
                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView5 != null) {
                                    i = C23274hvD.Application.OeawrH;
                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView6 != null) {
                                        i = C23274hvD.Application.getDefaultViewModelCreationExtras;
                                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout != null) {
                                            i = C23274hvD.Application.getFullyDrawnReporter;
                                            android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout2 != null) {
                                                i = C23274hvD.Application.getLastCustomNonConfigurationInstance;
                                                android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout3 != null) {
                                                    i = C23274hvD.Application.PickVisualMediaRequestdefault;
                                                    android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView7 != null) {
                                                        i = C23274hvD.Application.getSynchronousResult;
                                                        android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView3 != null) {
                                                            i = C23274hvD.Application.ActivityResultContracts;
                                                            android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = C23274hvD.Application.ActivityResultContractSynchronousResult;
                                                                android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    return new C21497hBo((android.widget.LinearLayout) view, textView, imageView, textView2, textView3, textView4, imageView2, textView5, textView6, relativeLayout, relativeLayout2, relativeLayout3, textView7, imageView3, textView8, textView9);
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
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
