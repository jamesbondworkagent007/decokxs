package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.trm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47528trm implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C47528trm(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = constraintLayout;
        this.EZpvd = view;
        this.OLrzqt = imageView;
        this.AEQbTJ = imageView2;
        this.KWHzl = textView;
    }

    public static C47528trm copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47315tni.ActionBar.DCUTEIddSDPG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C47528trm OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.hUfVAv;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = C47315tni.TaskDescription.fdOvFl;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C47315tni.TaskDescription.fERRXa;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C47315tni.TaskDescription.dvImUD;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new C47528trm((ConstraintLayout) view, viewFindChildViewById, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
