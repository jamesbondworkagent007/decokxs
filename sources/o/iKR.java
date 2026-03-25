package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: loaded from: classes15.dex */
public final class iKR implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.view.View AhwBna;
    public final android.view.View EZpvd;
    public final C27224jrE KWHzl;
    public final C27224jrE OLrzqt;
    public final C27271jrz copydefault;
    public final C27224jrE djBIcL;
    public final C27206jqn gEmmrt;
    public final C27172jqF valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.AEQbTJ;
    }

    public iKR(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C27224jrE c27224jrE, @androidx.annotation.NonNull C27271jrz c27271jrz, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull C27224jrE c27224jrE2, @androidx.annotation.NonNull android.view.View view3, @androidx.annotation.NonNull C27224jrE c27224jrE3, @androidx.annotation.NonNull C27206jqn c27206jqn, @androidx.annotation.NonNull C27172jqF c27172jqF) {
        this.AEQbTJ = view;
        this.OLrzqt = c27224jrE;
        this.copydefault = c27271jrz;
        this.EZpvd = view2;
        this.KWHzl = c27224jrE2;
        this.AhwBna = view3;
        this.djBIcL = c27224jrE3;
        this.gEmmrt = c27206jqn;
        this.valueOf = c27172jqF;
    }

    public static iKR AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C25493ixk.Activity.DTg, viewGroup);
        return copydefault(viewGroup);
    }

    public static iKR copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C25493ixk.ActionBar.newPercentageRating;
        C27224jrE c27224jrE = (C27224jrE) ViewBindings.findChildViewById(view, i);
        if (c27224jrE != null) {
            i = C25493ixk.ActionBar.ParceledListSliceAdapterApi21;
            C27271jrz c27271jrz = (C27271jrz) ViewBindings.findChildViewById(view, i);
            if (c27271jrz != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.newHeartRating))) != null) {
                i = C25493ixk.ActionBar.RatingCompat;
                C27224jrE c27224jrE2 = (C27224jrE) ViewBindings.findChildViewById(view, i);
                if (c27224jrE2 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.fromRating))) != null) {
                    i = C25493ixk.ActionBar.newThumbRating;
                    C27224jrE c27224jrE3 = (C27224jrE) ViewBindings.findChildViewById(view, i);
                    if (c27224jrE3 != null) {
                        i = C25493ixk.ActionBar.getPercentRating;
                        C27206jqn c27206jqn = (C27206jqn) ViewBindings.findChildViewById(view, i);
                        if (c27206jqn != null) {
                            i = C25493ixk.ActionBar.RatingCompat1;
                            C27172jqF c27172jqF = (C27172jqF) ViewBindings.findChildViewById(view, i);
                            if (c27172jqF != null) {
                                return new iKR(view, c27224jrE, c27271jrz, viewFindChildViewById, c27224jrE2, viewFindChildViewById2, c27224jrE3, c27206jqn, c27172jqF);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
