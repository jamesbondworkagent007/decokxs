package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hCV implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C24251iaM AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.view.View OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final AppCompatTextView djBIcL;
    public final C24254iaP gEmmrt;
    public final AppCompatTextView valueOf;
    public final AppCompatTextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public hCV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout4, @androidx.annotation.NonNull C24254iaP c24254iaP, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3, @androidx.annotation.NonNull AppCompatTextView appCompatTextView4, @androidx.annotation.NonNull AppCompatTextView appCompatTextView5, @androidx.annotation.NonNull C24251iaM c24251iaM) {
        this.AhwBna = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.AEQbTJ = constraintLayout3;
        this.OLrzqt = view;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = constraintLayout4;
        this.gEmmrt = c24254iaP;
        this.djBIcL = appCompatTextView;
        this.valueOf = appCompatTextView2;
        this.AYXKKw = appCompatTextView3;
        this.values = appCompatTextView4;
        this.DbNXlk = appCompatTextView5;
        this.AkhnZx = c24251iaM;
    }

    public static hCV EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.cancel, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hCV EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.invokespecialaVhqwO;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C23274hvD.Application.DaTmkG;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.MediaMetadataCompatBitmapKey))) != null) {
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
                                i = C23274hvD.Application.AppCompatDelegateImpl61;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C23274hvD.Application.AppCompatDelegateImplPanelMenuPresenterCallback;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = C23274hvD.Application.parseItem;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                        if (appCompatTextView5 != null) {
                                            i = C23274hvD.Application.onWindowAttributesChanged;
                                            C24251iaM c24251iaM = (C24251iaM) ViewBindings.findChildViewById(view, i);
                                            if (c24251iaM != null) {
                                                return new hCV(constraintLayout3, constraintLayout, constraintLayout2, viewFindChildViewById, linearLayoutCompat, constraintLayout3, c24254iaP, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, c24251iaM);
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
