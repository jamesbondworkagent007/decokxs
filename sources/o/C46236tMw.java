package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tMw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46236tMw implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final C57597ylS OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C46236tMw(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C57597ylS c57597ylS, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView) {
        this.copydefault = linearLayout;
        this.OLrzqt = c57597ylS;
        this.AEQbTJ = fragmentContainerView;
    }

    public static C46236tMw copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C46236tMw OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DbNXlk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C46236tMw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.valueOf;
        C57597ylS c57597ylS = (C57597ylS) ViewBindings.findChildViewById(view, i);
        if (c57597ylS != null) {
            i = C47501trL.TaskDescription.fGQ;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView != null) {
                return new C46236tMw((android.widget.LinearLayout) view, c57597ylS, fragmentContainerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
