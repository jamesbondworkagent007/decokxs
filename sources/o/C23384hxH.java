package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23384hxH implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.view.View DbNXlk;
    public final C33537myN EZpvd;
    public final android.widget.ImageView KWHzl;
    public final C55173xeu OLrzqt;
    public final C55113xdn copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final RecyclerView gEmmrt;
    public final android.widget.LinearLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AYXKKw;
    }

    public C23384hxH(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view) {
        this.AYXKKw = constraintLayout;
        this.EZpvd = c33537myN;
        this.OLrzqt = c55173xeu;
        this.KWHzl = imageView;
        this.AEQbTJ = linearLayout;
        this.copydefault = c55113xdn;
        this.gEmmrt = recyclerView;
        this.valueOf = linearLayout2;
        this.AhwBna = textView;
        this.djBIcL = textView2;
        this.fetchVPNInfo = textView3;
        this.DbNXlk = view;
    }

    public static C23384hxH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C23384hxH copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.gHZMYf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23384hxH EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.giSNqX;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C23274hvD.Application.getLaunchPendingIntent;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                        if (c55113xdn != null) {
                            i = C23274hvD.Application.ComponentActivityApi33Impl;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C23274hvD.Application.registerOnBackInvokedCallback;
                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout2 != null) {
                                    i = C23274hvD.Application.valueType;
                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = C23274hvD.Application.dismiss;
                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = C23274hvD.Application.createSeekBar;
                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.dispatchPopulateAccessibilityEvent))) != null) {
                                                return new C23384hxH((ConstraintLayout) view, c33537myN, c55173xeu, imageView, linearLayout, c55113xdn, recyclerView, linearLayout2, textView, textView2, textView3, viewFindChildViewById);
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
