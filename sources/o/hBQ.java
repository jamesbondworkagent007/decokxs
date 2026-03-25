package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBQ implements ViewBinding {
    public final hYH AEQbTJ;
    public final AppCompatTextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.view.View OLrzqt;
    public final C24288iax copydefault;
    public final hYH djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public hBQ(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull hYH hyh, @androidx.annotation.NonNull C24288iax c24288iax, @androidx.annotation.NonNull hYH hyh2) {
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = view;
        this.EZpvd = appCompatTextView;
        this.AEQbTJ = hyh;
        this.copydefault = c24288iax;
        this.djBIcL = hyh2;
    }

    public static hBQ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RTWSvT, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hBQ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaMetadataCompatBuilder;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.lambdanew2;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.onAttachedToWindow;
                hYH hyh = (hYH) ViewBindings.findChildViewById(view, i);
                if (hyh != null) {
                    i = C23274hvD.Application.getActionProvider;
                    C24288iax c24288iax = (C24288iax) ViewBindings.findChildViewById(view, i);
                    if (c24288iax != null) {
                        i = C23274hvD.Application.setIconTintList;
                        hYH hyh2 = (hYH) ViewBindings.findChildViewById(view, i);
                        if (hyh2 != null) {
                            return new hBQ((LinearLayoutCompat) view, viewFindChildViewById, appCompatTextView, hyh, c24288iax, hyh2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
