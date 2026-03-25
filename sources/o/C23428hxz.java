package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23428hxz implements ViewBinding {
    public final FragmentContainerView AEQbTJ;
    public final C55320xhi AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C55113xdn AkhnZx;
    public final android.widget.TextView AuCTel;
    public final C19936gUv DbNXlk;
    public final C52794wYp EZpvd;
    public final FragmentContainerView KWHzl;
    public final C19926gUl OLrzqt;
    public final ConstraintLayout copydefault;
    public final ConstraintLayout djBIcL;
    public final C55173xeu ejfBZ;
    public final AppCompatTextView fARcdN;
    public final android.widget.TextView fIwbmz;
    public final C25332iui fJNWhG;
    public final FragmentContainerView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.FrameLayout isConnected;
    public final android.widget.ImageView valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.isConnected;
    }

    public C23428hxz(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C19926gUl c19926gUl, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull FragmentContainerView fragmentContainerView3, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C19936gUv c19936gUv, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C25332iui c25332iui, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.isConnected = frameLayout;
        this.OLrzqt = c19926gUl;
        this.copydefault = constraintLayout;
        this.EZpvd = c52794wYp;
        this.KWHzl = fragmentContainerView;
        this.AEQbTJ = fragmentContainerView2;
        this.djBIcL = constraintLayout2;
        this.AhwBna = linearLayoutCompat;
        this.AYXKKw = c55320xhi;
        this.valueOf = imageView;
        this.gEmmrt = linearLayout;
        this.AkhnZx = c55113xdn;
        this.fetchVPNInfo = fragmentContainerView3;
        this.values = nestedScrollView;
        this.DbNXlk = c19936gUv;
        this.AuCTel = textView;
        this.fARcdN = appCompatTextView;
        this.fJNWhG = c25332iui;
        this.fIwbmz = textView2;
        this.ejfBZ = c55173xeu;
    }

    public static C23428hxz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C23428hxz OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fJNWhG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23428hxz copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getFieldNames;
        C19926gUl c19926gUl = (C19926gUl) ViewBindings.findChildViewById(view, i);
        if (c19926gUl != null) {
            i = C23274hvD.Application.dxcTrN;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.RVsVBY;
                C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                if (c52794wYp != null) {
                    i = C23274hvD.Application.zSsVtY;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                    if (fragmentContainerView != null) {
                        i = C23274hvD.Application.DrqXHJ;
                        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                        if (fragmentContainerView2 != null) {
                            i = C23274hvD.Application.zpGcln;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = C23274hvD.Application.DcMfJKDGTeJD;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = C23274hvD.Application.hBUiXU;
                                    C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                    if (c55320xhi != null) {
                                        i = C23274hvD.Application.UnZVfqExternalSyntheticApiModelOutline0;
                                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = C23274hvD.Application.getLaunchPendingIntent;
                                            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                                if (c55113xdn != null) {
                                                    i = C23274hvD.Application.OnBackPressedDispatcherKt;
                                                    FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(view, i);
                                                    if (fragmentContainerView3 != null) {
                                                        i = C23274hvD.Application.ReportDrawn;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                        if (nestedScrollView != null) {
                                                            i = C23274hvD.Application.ActivityResultContractsPickMultipleVisualMediaCompanion;
                                                            C19936gUv c19936gUv = (C19936gUv) ViewBindings.findChildViewById(view, i);
                                                            if (c19936gUv != null) {
                                                                i = C23274hvD.Application.onClick;
                                                                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = C23274hvD.Application.AppCompatDelegateImpl2;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (appCompatTextView != null) {
                                                                        i = C23274hvD.Application.flush;
                                                                        C25332iui c25332iui = (C25332iui) ViewBindings.findChildViewById(view, i);
                                                                        if (c25332iui != null) {
                                                                            i = C23274hvD.Application.parseItem;
                                                                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView2 != null) {
                                                                                i = C23274hvD.Application.getIconTintList;
                                                                                C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                                                                                if (c55173xeu != null) {
                                                                                    return new C23428hxz((android.widget.FrameLayout) view, c19926gUl, constraintLayout, c52794wYp, fragmentContainerView, fragmentContainerView2, constraintLayout2, linearLayoutCompat, c55320xhi, imageView, linearLayout, c55113xdn, fragmentContainerView3, nestedScrollView, c19936gUv, textView, appCompatTextView, c25332iui, textView2, c55173xeu);
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
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
