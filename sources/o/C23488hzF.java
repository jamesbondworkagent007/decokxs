package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23488hzF implements ViewBinding {
    public final OKAnchorSelection AEQbTJ;
    public final C52794wYp AYXKKw;
    public final C55173xeu AhwBna;
    public final android.view.View DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final Group KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final AppCompatImageView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final AppCompatTextView isConnected;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C23488hzF(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.valueOf = constraintLayout;
        this.AEQbTJ = oKAnchorSelection;
        this.copydefault = linearLayoutCompat;
        this.EZpvd = imageView;
        this.KWHzl = group;
        this.OLrzqt = linearLayoutCompat2;
        this.AhwBna = c55173xeu;
        this.djBIcL = appCompatImageView;
        this.AYXKKw = c52794wYp;
        this.gEmmrt = textView;
        this.DbNXlk = view;
        this.isConnected = appCompatTextView;
    }

    public static C23488hzF copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C23488hzF KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.ixgjPv, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23488hzF OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.RcXXUw;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            i = C23274hvD.Application.dxcTrN;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat != null) {
                i = C23274hvD.Application.accept;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.scanPackages;
                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                    if (group != null) {
                        i = C23274hvD.Application.fmB;
                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat2 != null) {
                            i = C23274hvD.Application.HJWChPHhYHK;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C23274hvD.Application.DDNONI;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                if (appCompatImageView != null) {
                                    i = C23274hvD.Application.MediaSessionCompatOnActiveChangeListener;
                                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                                    if (c52794wYp != null) {
                                        i = C23274hvD.Application.getExtraBinder;
                                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.setContentdefault))) != null) {
                                            i = C23274hvD.Application.GravityInt;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                return new C23488hzF((ConstraintLayout) view, oKAnchorSelection, linearLayoutCompat, imageView, group, linearLayoutCompat2, c55173xeu, appCompatImageView, c52794wYp, textView, viewFindChildViewById, appCompatTextView);
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
