package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21554hDr implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final AppCompatImageView EZpvd;
    public final C52794wYp KWHzl;
    public final android.view.View OLrzqt;
    public final AppCompatTextView copydefault;
    public final gWH djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C21554hDr(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull gWH gwh) {
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = c52794wYp;
        this.EZpvd = appCompatImageView;
        this.copydefault = appCompatTextView;
        this.OLrzqt = view;
        this.djBIcL = gwh;
    }

    public static C21554hDr OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DlABUU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C21554hDr AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.gSBher;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.dhOYXF;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C23274hvD.Application.parseItem;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.expandActionView))) != null) {
                    i = C23274hvD.Application.setShowAsAction;
                    gWH gwh = (gWH) ViewBindings.findChildViewById(view, i);
                    if (gwh != null) {
                        return new C21554hDr((LinearLayoutCompat) view, c52794wYp, appCompatImageView, appCompatTextView, viewFindChildViewById, gwh);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
