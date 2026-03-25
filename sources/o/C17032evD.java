package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17032evD implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView EZpvd;
    public final android.view.View KWHzl;
    public final C57289yfc OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.view.View djBIcL;
    public final android.widget.LinearLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.djBIcL;
    }

    public C17032evD(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C57289yfc c57289yfc, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.djBIcL = view;
        this.OLrzqt = c57289yfc;
        this.copydefault = constraintLayout;
        this.KWHzl = view2;
        this.EZpvd = textView;
        this.AEQbTJ = imageView;
        this.gEmmrt = linearLayout;
        this.AhwBna = textView2;
    }

    public static C17032evD OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.setProfilesSinceInitCount, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C17032evD EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.DTwDnp;
        C57289yfc c57289yfc = (C57289yfc) ViewBindings.findChildViewById(view, i);
        if (c57289yfc != null) {
            i = C13754dXa.ActionBar.fmB;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.OAhWiU))) != null) {
                i = C13754dXa.ActionBar.OAUGar;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C13754dXa.ActionBar.ikEgkI;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = C13754dXa.ActionBar.getActiveNotifications;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C13754dXa.ActionBar.PickVisualMediaRequest;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C17032evD(view, c57289yfc, constraintLayout, viewFindChildViewById, textView, imageView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
