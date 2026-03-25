package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes24.dex */
public final class tND implements ViewBinding {
    public final C49352umt AEQbTJ;
    public final FragmentContainerView EZpvd;
    public final android.widget.ScrollView KWHzl;
    public final C47820txN OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.KWHzl;
    }

    public tND(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull C49352umt c49352umt, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C47820txN c47820txN, @androidx.annotation.NonNull ConstraintLayout constraintLayout) {
        this.KWHzl = scrollView;
        this.AEQbTJ = c49352umt;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = c47820txN;
        this.copydefault = constraintLayout;
    }

    public static tND KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DKtBnz;
        C49352umt c49352umt = (C49352umt) ViewBindings.findChildViewById(view, i);
        if (c49352umt != null) {
            i = C47501trL.TaskDescription.DLGVGj;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                i = C47501trL.TaskDescription.ExKek;
                C47820txN c47820txN = (C47820txN) ViewBindings.findChildViewById(view, i);
                if (c47820txN != null) {
                    i = C47501trL.TaskDescription.QKDJJA;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        return new tND((android.widget.ScrollView) view, c49352umt, fragmentContainerView, c47820txN, constraintLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
