package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23382hxF implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final AppCompatTextView AhwBna;
    public final android.widget.LinearLayout EZpvd;
    public final C31222lpu KWHzl;
    public final AppCompatTextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final AppCompatTextView gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C23382hxF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C31222lpu c31222lpu, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4) {
        this.copydefault = constraintLayout;
        this.KWHzl = c31222lpu;
        this.AEQbTJ = linearLayout;
        this.EZpvd = linearLayout2;
        this.OLrzqt = appCompatTextView;
        this.djBIcL = appCompatTextView2;
        this.AhwBna = appCompatTextView3;
        this.gEmmrt = appCompatTextView4;
    }

    public static C23382hxF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.AxsJAY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23382hxF copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dzkkkq;
        C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
        if (c31222lpu != null) {
            i = C23274hvD.Application.onEvent;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C23274hvD.Application.IMediaSessionStubProxy;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = C23274hvD.Application.OpenForTesting;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C23274hvD.Application.AppCompatDelegateImplActionModeCallbackWrapperV91;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                        if (appCompatTextView2 != null) {
                            i = C23274hvD.Application.setVisible;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                            if (appCompatTextView3 != null) {
                                i = C23274hvD.Application.indexOfTransition;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView4 != null) {
                                    return new C23382hxF((ConstraintLayout) view, c31222lpu, linearLayout, linearLayout2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
