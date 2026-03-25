package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47318tnl implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C47318tnl(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.copydefault = frameLayout;
        this.AEQbTJ = frameLayout2;
    }

    public static C47318tnl OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C47318tnl copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47315tni.ActionBar.copydefault, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C47318tnl OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.invokespecialaGOrKO;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new C47318tnl((android.widget.FrameLayout) view, frameLayout);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
