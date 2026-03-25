package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes18.dex */
public final class hBH implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final C24239iaA KWHzl;
    public final AppCompatTextView OLrzqt;
    public final C22108hYe copydefault;
    public final C22108hYe valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public hBH(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C22108hYe c22108hYe, @androidx.annotation.NonNull C24239iaA c24239iaA, @androidx.annotation.NonNull C22108hYe c22108hYe2) {
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = view;
        this.OLrzqt = appCompatTextView;
        this.copydefault = c22108hYe;
        this.KWHzl = c24239iaA;
        this.valueOf = c22108hYe2;
    }

    public static hBH copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RZNAhV, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hBH AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.MediaMetadataCompatBuilder;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C23274hvD.Application.lambdanew2;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                i = C23274hvD.Application.onAttachedToWindow;
                C22108hYe c22108hYe = (C22108hYe) ViewBindings.findChildViewById(view, i);
                if (c22108hYe != null) {
                    i = C23274hvD.Application.getActionProvider;
                    C24239iaA c24239iaA = (C24239iaA) ViewBindings.findChildViewById(view, i);
                    if (c24239iaA != null) {
                        i = C23274hvD.Application.setIconTintList;
                        C22108hYe c22108hYe2 = (C22108hYe) ViewBindings.findChildViewById(view, i);
                        if (c22108hYe2 != null) {
                            return new hBH((LinearLayoutCompat) view, viewFindChildViewById, appCompatTextView, c22108hYe, c24239iaA, c22108hYe2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
