package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.esu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16916esu implements ViewBinding {
    public final android.view.View AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final AppCompatImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C16916esu(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = view;
        this.copydefault = appCompatImageView;
        this.OLrzqt = imageView;
        this.KWHzl = textView;
        this.AhwBna = textView2;
    }

    public static C16916esu copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.getLocation, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16916esu EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.OAhWiU;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C13754dXa.ActionBar.sJPPOI;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C13754dXa.ActionBar.zHQtTQ;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13754dXa.ActionBar.getDefaultViewModelCreationExtras;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C13754dXa.ActionBar.ensureViewModelStore;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C16916esu((ConstraintLayout) view, viewFindChildViewById, appCompatImageView, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
