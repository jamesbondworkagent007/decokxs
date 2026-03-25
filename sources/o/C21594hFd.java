package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hFd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21594hFd implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C21594hFd(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = imageView;
        this.KWHzl = constraintLayout2;
        this.copydefault = textView;
    }

    public static C21594hFd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.RXdAnZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21594hFd KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.dNCPSb;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C23274hvD.Application.doInvalidatePanelMenu;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i2);
            if (textView != null) {
                return new C21594hFd(constraintLayout, imageView, constraintLayout, textView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
