package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23425hxw implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C24254iaP AYXKKw;
    public final ConstraintLayout AhwBna;
    public final AppCompatTextView AkhnZx;
    public final C25405iwB DbNXlk;
    public final android.view.View EZpvd;
    public final C52794wYp KWHzl;
    public final ConstraintLayout OLrzqt;
    public final androidx.legacy.widget.Space copydefault;
    public final LinearLayoutCompat djBIcL;
    public final C24251iaM ejfBZ;
    public final C24328ibk fJNWhG;
    public final AppCompatTextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final AppCompatTextView isConnected;
    public final AppCompatTextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C23425hxw(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull androidx.legacy.widget.Space space, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull C24254iaP c24254iaP, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull C25405iwB c25405iwB, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull C24328ibk c24328ibk, @androidx.annotation.NonNull C24251iaM c24251iaM) {
        this.gEmmrt = constraintLayout;
        this.copydefault = space;
        this.OLrzqt = constraintLayout2;
        this.AEQbTJ = constraintLayout3;
        this.KWHzl = c52794wYp;
        this.EZpvd = view;
        this.djBIcL = linearLayoutCompat;
        this.AhwBna = constraintLayout4;
        this.AYXKKw = c24254iaP;
        this.valueOf = appCompatTextView;
        this.isConnected = appCompatTextView2;
        this.DbNXlk = c25405iwB;
        this.values = appCompatTextView3;
        this.AkhnZx = appCompatTextView4;
        this.fetchVPNInfo = appCompatTextView5;
        this.fJNWhG = c24328ibk;
        this.ejfBZ = c24251iaM;
    }

    public static C23425hxw EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fIwbmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23425hxw copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.USBtdM;
        androidx.legacy.widget.Space space = (androidx.legacy.widget.Space) ViewBindings.findChildViewById(view, i);
        if (space != null) {
            i = C23274hvD.Application.invokespecialaVhqwO;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = C23274hvD.Application.DaTmkG;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout2 != null) {
                    i = C23274hvD.Application.HJWChPdNQGVJ;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompatBitmapKey))) != null) {
                        i = C23274hvD.Application.MediaControllerCompatMediaControllerImplApi23;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                            i = C23274hvD.Application.setOwners;
                            C24254iaP c24254iaP = (C24254iaP) ViewBindings.findChildViewById(view, i);
                            if (c24254iaP != null) {
                                i = C23274hvD.Application.newTab;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView != null) {
                                    i = C23274hvD.Application.onNavigationItemSelected;
                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView2 != null) {
                                        i = C23274hvD.Application.syncState;
                                        C25405iwB c25405iwB = (C25405iwB) ViewBindings.findChildViewById(view, i);
                                        if (c25405iwB != null) {
                                            i = C23274hvD.Application.AppCompatDelegateImpl61;
                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView3 != null) {
                                                i = C23274hvD.Application.AppCompatDelegateImplPanelMenuPresenterCallback;
                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView4 != null) {
                                                    i = C23274hvD.Application.parseItem;
                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView5 != null) {
                                                        i = C23274hvD.Application.readItem;
                                                        C24328ibk c24328ibk = (C24328ibk) ViewBindings.findChildViewById(view, i);
                                                        if (c24328ibk != null) {
                                                            i = C23274hvD.Application.onWindowAttributesChanged;
                                                            C24251iaM c24251iaM = (C24251iaM) ViewBindings.findChildViewById(view, i);
                                                            if (c24251iaM != null) {
                                                                return new C23425hxw(constraintLayout3, space, constraintLayout, constraintLayout2, c52794wYp, viewFindChildViewById, linearLayoutCompat, constraintLayout3, c24254iaP, appCompatTextView, appCompatTextView2, c25405iwB, appCompatTextView3, appCompatTextView4, appCompatTextView5, c24328ibk, c24251iaM);
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
