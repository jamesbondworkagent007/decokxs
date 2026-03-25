package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17109ewb implements ViewBinding {
    public final C52794wYp AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final C17090ewI KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C17109ewb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C17090ewI c17090ewI, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c52794wYp;
        this.KWHzl = c17090ewI;
        this.EZpvd = imageView;
        this.copydefault = textView;
    }

    public static C17109ewb copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.akftKQ;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.drbYRJ))) != null) {
            C17090ewI c17090ewIKWHzl = C17090ewI.KWHzl(viewFindChildViewById);
            i = C13754dXa.ActionBar.zEkrwr;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C13754dXa.ActionBar.getViewModelStore;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C17109ewb((ConstraintLayout) view, c52794wYp, c17090ewIKWHzl, imageView, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
