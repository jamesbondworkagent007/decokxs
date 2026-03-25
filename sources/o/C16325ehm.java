package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16325ehm implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C17114ewg EZpvd;
    public final android.widget.FrameLayout KWHzl;
    public final BottomNavigationView OLrzqt;
    public final FragmentContainerView copydefault;
    public final android.widget.FrameLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.valueOf;
    }

    public C16325ehm(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull BottomNavigationView bottomNavigationView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C17114ewg c17114ewg, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.valueOf = frameLayout;
        this.OLrzqt = bottomNavigationView;
        this.AEQbTJ = linearLayout;
        this.EZpvd = c17114ewg;
        this.copydefault = fragmentContainerView;
        this.KWHzl = frameLayout2;
    }

    public static C16325ehm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C16325ehm KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.AuCTelauCTel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16325ehm AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.QIZEnU;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(view, i);
        if (bottomNavigationView != null) {
            i = C13754dXa.ActionBar.OfWYUE;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.INotificationSideChannelStubProxy))) != null) {
                C17114ewg c17114ewgCopydefault = C17114ewg.copydefault(viewFindChildViewById);
                i = C13754dXa.ActionBar.getItem;
                FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView != null) {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
                    return new C16325ehm(frameLayout, bottomNavigationView, linearLayout, c17114ewgCopydefault, fragmentContainerView, frameLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
