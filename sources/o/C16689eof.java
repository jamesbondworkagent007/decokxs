package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eof, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16689eof implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.FrameLayout OLrzqt;
    public final C55230xfy copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C16689eof(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.EZpvd = linearLayout;
        this.OLrzqt = frameLayout;
        this.copydefault = c55230xfy;
    }

    public static C16689eof copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.fDu;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = C13754dXa.ActionBar.VisibleForTesting;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                return new C16689eof((android.widget.LinearLayout) view, frameLayout, c55230xfy);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
