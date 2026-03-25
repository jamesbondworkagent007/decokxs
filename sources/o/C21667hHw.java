package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21667hHw implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final FragmentContainerView AYXKKw;
    public final FragmentContainerView AhwBna;
    public final C30845lio DbNXlk;
    public final C22281hcR EZpvd;
    public final OKReminder KWHzl;
    public final ConstraintLayout OLrzqt;
    public final Guideline copydefault;
    public final FragmentContainerView djBIcL;
    public final ConstraintLayout fetchVPNInfo;
    public final C55113xdn gEmmrt;
    public final ViewPager2 isConnected;
    public final FragmentContainerView valueOf;
    public final C31216lpo values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.fetchVPNInfo;
    }

    public C21667hHw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull C22281hcR c22281hcR, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView4, @androidx.annotation.NonNull C30845lio c30845lio, @androidx.annotation.NonNull C31216lpo c31216lpo, @androidx.annotation.NonNull ViewPager2 viewPager2) {
        this.fetchVPNInfo = constraintLayout;
        this.KWHzl = oKReminder;
        this.OLrzqt = constraintLayout2;
        this.copydefault = guideline;
        this.EZpvd = c22281hcR;
        this.AEQbTJ = c55173xeu;
        this.AYXKKw = fragmentContainerView;
        this.gEmmrt = c55113xdn;
        this.valueOf = fragmentContainerView2;
        this.djBIcL = fragmentContainerView3;
        this.AhwBna = fragmentContainerView4;
        this.DbNXlk = c30845lio;
        this.values = c31216lpo;
        this.isConnected = viewPager2;
    }

    public static C21667hHw OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ardYFU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C21667hHw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.QOLQEE;
        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
        if (oKReminder != null) {
            i = C23274hvD.Application.fZBcTu;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.DPHNDa;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline != null) {
                    i = C23274hvD.Application.gbIfDn;
                    C22281hcR c22281hcR = (C22281hcR) ViewBindings.findChildViewById(view, i);
                    if (c22281hcR != null) {
                        i = C23274hvD.Application.dXcUrg;
                        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                        if (c55173xeu != null) {
                            i = C23274hvD.Application.MediaBrowserCompatSubscription;
                            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                            if (fragmentContainerView != null) {
                                i = C23274hvD.Application.MediaControllerCompatApi23;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C23274hvD.Application.onPause;
                                    FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                    if (fragmentContainerView2 != null) {
                                        i = C23274hvD.Application.MediaSessionCompatResultReceiverWrapper;
                                        FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                        if (fragmentContainerView3 != null) {
                                            i = C23274hvD.Application.MediaSessionCompatApi23;
                                            FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                            if (fragmentContainerView4 != null) {
                                                i = C23274hvD.Application.accesstrackPipAnimationHintViewpositionInWindow;
                                                C30845lio c30845lio = (C30845lio) ViewBindings.findChildViewById(view, i);
                                                if (c30845lio != null) {
                                                    i = C23274hvD.Application.getCapacity;
                                                    C31216lpo c31216lpo = (C31216lpo) ViewBindings.findChildViewById(view, i);
                                                    if (c31216lpo != null) {
                                                        i = C23274hvD.Application.getIntent;
                                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
                                                        if (viewPager2 != null) {
                                                            return new C21667hHw((ConstraintLayout) view, oKReminder, constraintLayout, guideline, c22281hcR, c55173xeu, fragmentContainerView, c55113xdn, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, c30845lio, c31216lpo, viewPager2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
