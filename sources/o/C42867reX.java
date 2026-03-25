package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.reX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42867reX implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final AppCompatTextView EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public C42867reX(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.AEQbTJ = view;
        this.EZpvd = appCompatTextView;
    }

    public static C42867reX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DxnCrt, viewGroup);
        return copydefault(viewGroup);
    }

    public static C42867reX copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.getDefaultImpl;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
        if (appCompatTextView != null) {
            return new C42867reX(view, appCompatTextView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
