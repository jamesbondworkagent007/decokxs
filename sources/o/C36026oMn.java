package o;

import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oMn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36026oMn implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final FragmentContainerView EZpvd;
    public final C55113xdn KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final OKReminder copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.RelativeLayout getRoot() {
        return this.OLrzqt;
    }

    public C36026oMn(@androidx.annotation.NonNull android.widget.RelativeLayout relativeLayout, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull OKReminder oKReminder) {
        this.OLrzqt = relativeLayout;
        this.EZpvd = fragmentContainerView;
        this.AEQbTJ = frameLayout;
        this.KWHzl = c55113xdn;
        this.copydefault = oKReminder;
    }

    public static C36026oMn OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.accept;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C35964oKf.StateListAnimator.UJpkuA;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C35964oKf.StateListAnimator.OhcwxsRkSIEV;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null) {
                    i = C35964oKf.StateListAnimator.onPostMessage;
                    OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                    if (oKReminder != null) {
                        return new C36026oMn((android.widget.RelativeLayout) view, fragmentContainerView, frameLayout, c55113xdn, oKReminder);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
