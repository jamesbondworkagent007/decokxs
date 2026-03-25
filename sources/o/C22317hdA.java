package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22317hdA implements ViewBinding {
    public final C28067kNr AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final AppCompatTextView AhwBna;
    public final AppCompatTextView AkhnZx;
    public final android.view.View DbNXlk;
    public final AppCompatImageView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final Group OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final AppCompatTextView djBIcL;
    public final android.view.View ejfBZ;
    public final AppCompatTextView fetchVPNInfo;
    public final C31222lpu gEmmrt;
    public final AppCompatTextView isConnected;
    public final ConstraintLayout valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C22317hdA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C28067kNr c28067kNr, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C31222lpu c31222lpu, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull AppCompatTextView appCompatTextView6, @androidx.annotation.NonNull AppCompatTextView appCompatTextView7, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.valueOf = constraintLayout;
        this.AEQbTJ = c28067kNr;
        this.EZpvd = appCompatImageView;
        this.OLrzqt = group;
        this.KWHzl = linearLayoutCompat;
        this.copydefault = linearLayout;
        this.gEmmrt = c31222lpu;
        this.AhwBna = appCompatTextView;
        this.AYXKKw = appCompatTextView2;
        this.djBIcL = appCompatTextView3;
        this.isConnected = appCompatTextView4;
        this.AkhnZx = appCompatTextView5;
        this.fetchVPNInfo = appCompatTextView6;
        this.values = appCompatTextView7;
        this.DbNXlk = view;
        this.ejfBZ = view2;
    }

    public static C22317hdA EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.AhwBna, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C22317hdA AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C22366hdx.ActionBar.zLjUOn;
        C28067kNr c28067kNr = (C28067kNr) ViewBindings.findChildViewById(view, i);
        if (c28067kNr != null) {
            i = C22366hdx.ActionBar.dvKsVJ;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C22366hdx.ActionBar.fZBcTu;
                Group group = (Group) ViewBindings.findChildViewById(view, i);
                if (group != null) {
                    i = C22366hdx.ActionBar.giSNqX;
                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat != null) {
                        i = C22366hdx.ActionBar.DarRvM;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C22366hdx.ActionBar.zuWLRA;
                            C31222lpu c31222lpu = (C31222lpu) ViewBindings.findChildViewById(view, i);
                            if (c31222lpu != null) {
                                i = C22366hdx.ActionBar.call;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C22366hdx.ActionBar.WS;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C22366hdx.ActionBar.RXzakW;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView3 != null) {
                                            i = C22366hdx.ActionBar.dLBcXg;
                                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView4 != null) {
                                                i = C22366hdx.ActionBar.hvKCwS;
                                                AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView5 != null) {
                                                    i = C22366hdx.ActionBar.zDUObI;
                                                    AppCompatTextView appCompatTextView6 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView6 != null) {
                                                        i = C22366hdx.ActionBar.zhUgOk;
                                                        AppCompatTextView appCompatTextView7 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                        if (appCompatTextView7 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C22366hdx.ActionBar.getLabel))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C22366hdx.ActionBar.DGUQLIDGUQLI))) != null) {
                                                            return new C22317hdA((ConstraintLayout) view, c28067kNr, appCompatImageView, group, linearLayoutCompat, linearLayout, c31222lpu, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, viewFindChildViewById, viewFindChildViewById2);
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
