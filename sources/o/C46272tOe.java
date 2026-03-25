package o;

import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46272tOe implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final NestedScrollView AYXKKw;
    public final FragmentContainerView EZpvd;
    public final FragmentContainerView KWHzl;
    public final FragmentContainerView OLrzqt;
    public final android.view.View copydefault;
    public final FragmentContainerView gEmmrt;
    public final OKReminder valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.AYXKKw;
    }

    public C46272tOe(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView4, @androidx.annotation.NonNull OKReminder oKReminder) {
        this.AYXKKw = nestedScrollView;
        this.EZpvd = fragmentContainerView;
        this.OLrzqt = fragmentContainerView2;
        this.KWHzl = fragmentContainerView3;
        this.copydefault = view;
        this.AEQbTJ = view2;
        this.gEmmrt = fragmentContainerView4;
        this.valueOf = oKReminder;
    }

    public static C46272tOe OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C47501trL.TaskDescription.DbNXlk;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
        if (fragmentContainerView != null) {
            i = C47501trL.TaskDescription.hrNTAI;
            FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
            if (fragmentContainerView2 != null) {
                i = C47501trL.TaskDescription.DGOPHZDGOPHZ;
                FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                if (fragmentContainerView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.RXzakW))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.TarCU))) != null) {
                    i = C47501trL.TaskDescription.DGGHxk;
                    FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView4 != null) {
                        i = C47501trL.TaskDescription.UfveVb;
                        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                        if (oKReminder != null) {
                            return new C46272tOe((NestedScrollView) view, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, viewFindChildViewById, viewFindChildViewById2, fragmentContainerView4, oKReminder);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
