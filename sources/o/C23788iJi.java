package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23788iJi implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final C55258xgZ KWHzl;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C23788iJi(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = imageView;
        this.KWHzl = c55258xgZ;
        this.copydefault = textView;
    }

    public static C23788iJi EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.USBtdM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23788iJi KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C25493ixk.ActionBar.sendBehavioSecData;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C25493ixk.ActionBar.hkDICb;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                i = C25493ixk.ActionBar.STbtMW;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C23788iJi((ConstraintLayout) view, imageView, c55258xgZ, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
