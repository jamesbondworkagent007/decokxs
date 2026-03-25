package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hHQ implements ViewBinding {
    public final C31222lpu AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;
    public final ConstraintLayout djBIcL;
    public final LinearLayoutCompat valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public hHQ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C31222lpu c31222lpu, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = c31222lpu;
        this.OLrzqt = imageView;
        this.EZpvd = textView;
        this.KWHzl = linearLayoutCompat;
        this.copydefault = textView2;
        this.AYXKKw = textView3;
        this.valueOf = linearLayoutCompat2;
        this.AhwBna = textView4;
    }

    public static hHQ OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.OqHLSf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static hHQ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DAIeex;
        C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
        if (c31222lpu != null) {
            i = C23274hvD.Application.onReceiveResult;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.MediaDescriptionCompatApi21Builder;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.newInstance;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C23274hvD.Application.MediaDescriptionCompatApi23;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C23274hvD.Application.addOnContextAvailableListener;
                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                i = C23274hvD.Application.getDefaultViewModelProviderFactory;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = C23274hvD.Application.ensureViewModelStore;
                                    android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView4 != null) {
                                        return new hHQ((ConstraintLayout) view, c31222lpu, imageView, textView, linearLayoutCompat, textView2, textView3, linearLayoutCompat2, textView4);
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
