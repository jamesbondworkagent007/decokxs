package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hGA implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final C52794wYp AYXKKw;
    public final android.view.View AhwBna;
    public final ConstraintLayout EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55113xdn copydefault;
    public final AppCompatTextView djBIcL;
    public final C52794wYp gEmmrt;
    public final android.view.View valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.valueOf;
    }

    public hGA(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.view.View view2) {
        this.valueOf = view;
        this.AEQbTJ = linearLayoutCompat;
        this.KWHzl = linearLayoutCompat2;
        this.EZpvd = constraintLayout;
        this.OLrzqt = imageView;
        this.copydefault = c55113xdn;
        this.AYXKKw = c52794wYp;
        this.gEmmrt = c52794wYp2;
        this.djBIcL = appCompatTextView;
        this.AhwBna = view2;
    }

    public static hGA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C23274hvD.Activity.iqeXgQ, viewGroup);
        return KWHzl(viewGroup);
    }

    public static hGA KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.profile;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = C23274hvD.Application.DcMfJKDCKfqP;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = C23274hvD.Application.dSJNDS;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C23274hvD.Application.dump;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C23274hvD.Application.PlaybackStateCompatCustomAction1;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.InspectablePropertyFlagEntry;
                            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                            if (c52794wYp != null) {
                                i = C23274hvD.Application.target;
                                C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                if (c52794wYp2 != null) {
                                    i = C23274hvD.Application.setDisplayShowTitleEnabled;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                    if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.requiresActionButton))) != null) {
                                        return new hGA(view, linearLayoutCompat, linearLayoutCompat2, constraintLayout, imageView, c55113xdn, c52794wYp, c52794wYp2, appCompatTextView, viewFindChildViewById);
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
