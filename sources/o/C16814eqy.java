package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16814eqy implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.EZpvd;
    }

    public C16814eqy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.EZpvd = constraintLayout;
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = constraintLayout2;
        this.copydefault = imageView;
    }

    public static C16814eqy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.Dap, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16814eqy KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.gezFCt;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = C13754dXa.ActionBar.MediaSessionCompat3;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                return new C16814eqy(constraintLayout, linearLayoutCompat, constraintLayout, imageView);
            }
            i = i2;
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
