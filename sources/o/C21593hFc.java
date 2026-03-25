package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21593hFc implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C28034kMl AYXKKw;
    public final C28024kMb AhwBna;
    public final NestedScrollView EZpvd;
    public final AppCompatTextView KWHzl;
    public final AppCompatTextView OLrzqt;
    public final AppCompatTextView copydefault;
    public final C28024kMb gEmmrt;
    public final C28024kMb valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.EZpvd;
    }

    public C21593hFc(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull C28024kMb c28024kMb, @androidx.annotation.NonNull C28034kMl c28034kMl, @androidx.annotation.NonNull C28024kMb c28024kMb2, @androidx.annotation.NonNull C28024kMb c28024kMb3) {
        this.EZpvd = nestedScrollView;
        this.copydefault = appCompatTextView;
        this.KWHzl = appCompatTextView2;
        this.AEQbTJ = appCompatTextView3;
        this.OLrzqt = appCompatTextView4;
        this.gEmmrt = c28024kMb;
        this.AYXKKw = c28034kMl;
        this.valueOf = c28024kMb2;
        this.AhwBna = c28024kMb3;
    }

    public static C21593hFc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RLmrWm, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C21593hFc EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.IntDef;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            i = C23274hvD.Application.InterpolatorRes;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView2 != null) {
                i = C23274hvD.Application.LongDef;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView3 != null) {
                    i = C23274hvD.Application.MainThread;
                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView4 != null) {
                        i = C23274hvD.Application.setItemInvoker;
                        C28024kMb c28024kMb = (C28024kMb) ViewBindings.findChildViewById(view, i);
                        if (c28024kMb != null) {
                            i = C23274hvD.Application.setPadding;
                            C28034kMl c28034kMl = (C28034kMl) ViewBindings.findChildViewById(view, i);
                            if (c28034kMl != null) {
                                i = C23274hvD.Application.prefersCondensedTitle;
                                C28024kMb c28024kMb2 = (C28024kMb) ViewBindings.findChildViewById(view, i);
                                if (c28024kMb2 != null) {
                                    i = C23274hvD.Application.setPopupCallback;
                                    C28024kMb c28024kMb3 = (C28024kMb) ViewBindings.findChildViewById(view, i);
                                    if (c28024kMb3 != null) {
                                        return new C21593hFc((NestedScrollView) view, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, c28024kMb, c28034kMl, c28024kMb2, c28024kMb3);
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
