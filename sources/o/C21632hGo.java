package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21632hGo implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final C24804ikj EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C21632hGo(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C24804ikj c24804ikj, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.AEQbTJ = view;
        this.EZpvd = c24804ikj;
        this.copydefault = appCompatImageView;
        this.KWHzl = appCompatTextView;
        this.OLrzqt = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
    }

    public static C21632hGo copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.getSerial, viewGroup);
        return copydefault(viewGroup);
    }

    public static C21632hGo copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DDjfYY;
        C24804ikj c24804ikj = (C24804ikj) ViewBindings.findChildViewById(view, i);
        if (c24804ikj != null) {
            i = C23274hvD.Application.UvfnWv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.onCloseMenu;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    i = C23274hvD.Application.AppCompatDelegateImplApi26ImplExternalSyntheticApiModelOutline1;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView2 != null) {
                        i = C23274hvD.Application.setExitFadeDuration;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView3 != null) {
                            return new C21632hGo(view, c24804ikj, appCompatImageView, appCompatTextView, appCompatTextView2, appCompatTextView3);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
