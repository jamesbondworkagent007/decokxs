package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGZ implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.view.View EZpvd;
    public final C24814ikt KWHzl;
    public final android.view.View OLrzqt;
    public final C24800ikf copydefault;
    public final C24800ikf djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public hGZ(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C24814ikt c24814ikt, @androidx.annotation.NonNull C24800ikf c24800ikf, @androidx.annotation.NonNull C24800ikf c24800ikf2) {
        this.EZpvd = view;
        this.AEQbTJ = appCompatImageView;
        this.OLrzqt = view2;
        this.KWHzl = c24814ikt;
        this.copydefault = c24800ikf;
        this.djBIcL = c24800ikf2;
    }

    public static hGZ KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.OKSWiw, viewGroup);
        return EZpvd(viewGroup);
    }

    public static hGZ EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.MediaBrowserCompatMediaBrowserImplApi215;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0))) != null) {
            i = C23274hvD.Application.ActivityResultContractsStartIntentSenderForResult;
            C24814ikt c24814ikt = (C24814ikt) ViewBindings.findChildViewById(view, i);
            if (c24814ikt != null) {
                i = C23274hvD.Application.onActionModeStarted;
                C24800ikf c24800ikf = (C24800ikf) ViewBindings.findChildViewById(view, i);
                if (c24800ikf != null) {
                    i = C23274hvD.Application.setChecked;
                    C24800ikf c24800ikf2 = (C24800ikf) ViewBindings.findChildViewById(view, i);
                    if (c24800ikf2 != null) {
                        return new hGZ(view, appCompatImageView, viewFindChildViewById, c24814ikt, c24800ikf, c24800ikf2);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
