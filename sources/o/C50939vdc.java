package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.vdc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50939vdc implements ViewBinding {
    public final android.widget.GridLayout AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final AppCompatTextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.GridLayout getRoot() {
        return this.AEQbTJ;
    }

    public C50939vdc(@androidx.annotation.NonNull android.widget.GridLayout gridLayout, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6) {
        this.AEQbTJ = gridLayout;
        this.copydefault = appCompatTextView;
        this.EZpvd = appCompatTextView2;
        this.KWHzl = appCompatTextView3;
        this.OLrzqt = appCompatTextView4;
        this.valueOf = appCompatTextView5;
        this.AhwBna = appCompatTextView6;
    }

    public static C50939vdc copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.OeawrH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C50939vdc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.onPostCreate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C48033uCm.Application.onMenuOpened;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = C48033uCm.Application.isHandleNativeActionModesEnabled;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = C48033uCm.Application.attachToWindow;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null) {
                        i = C48033uCm.Application.applyFixedSizeWindow;
                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView5 != null) {
                            i = C48033uCm.Application.onCreateView;
                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView6 != null) {
                                return new C50939vdc((android.widget.GridLayout) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
