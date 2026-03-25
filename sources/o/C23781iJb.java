package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23781iJb implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View AhwBna;
    public final ConstraintLayout EZpvd;
    public final Group KWHzl;
    public final android.widget.TextView OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C23781iJb(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.view.View view) {
        this.EZpvd = constraintLayout;
        this.copydefault = imageView;
        this.KWHzl = group;
        this.AEQbTJ = textView;
        this.OLrzqt = textView2;
        this.AhwBna = view;
    }

    public static C23781iJb KWHzl(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C25493ixk.ActionBar.copydefault;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.invokespecialdPnHjp;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = C25493ixk.ActionBar.gAnGwV;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C25493ixk.ActionBar.onSessionReady;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C25493ixk.ActionBar.onRepeatModeChanged))) != null) {
                        return new C23781iJb((ConstraintLayout) view, imageView, group, textView, textView2, viewFindChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
