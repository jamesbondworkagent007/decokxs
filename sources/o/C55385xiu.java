package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import o.C55386xiv;

/* JADX INFO: renamed from: o.xiu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55385xiu implements ViewBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C55162xej EZpvd;
    public final OKVerticalSeparatorView KWHzl;
    public final C55162xej OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.AEQbTJ;
    }

    public C55385xiu(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull C55162xej c55162xej, @androidx.annotation.NonNull C55162xej c55162xej2, @androidx.annotation.NonNull OKVerticalSeparatorView oKVerticalSeparatorView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.AEQbTJ = relativeLayout;
        this.EZpvd = c55162xej;
        this.OLrzqt = c55162xej2;
        this.KWHzl = oKVerticalSeparatorView;
        this.copydefault = textView;
        this.AYXKKw = textView2;
        this.djBIcL = textView3;
    }

    public static C55385xiu OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C55386xiv.StateListAnimator.EZpvd, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C55385xiu EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C55386xiv.Activity.EZpvd;
        C55162xej c55162xej = (C55162xej) ViewBindings.findChildViewById(view, i);
        if (c55162xej != null) {
            i = C55386xiv.Activity.AEQbTJ;
            C55162xej c55162xej2 = (C55162xej) ViewBindings.findChildViewById(view, i);
            if (c55162xej2 != null) {
                i = C55386xiv.Activity.copydefault;
                OKVerticalSeparatorView oKVerticalSeparatorView = (OKVerticalSeparatorView) ViewBindings.findChildViewById(view, i);
                if (oKVerticalSeparatorView != null) {
                    i = C55386xiv.Activity.KWHzl;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C55386xiv.Activity.OLrzqt;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C55386xiv.Activity.djBIcL;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new C55385xiu((android.widget.RelativeLayout) view, c55162xej, c55162xej2, oKVerticalSeparatorView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
