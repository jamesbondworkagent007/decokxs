package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16761epy implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55251xgS AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final C55251xgS KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.ImageView copydefault;
    public final ConstraintLayout gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C16761epy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull C55251xgS c55251xgS, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull C55251xgS c55251xgS2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.gEmmrt = constraintLayout;
        this.OLrzqt = constraintLayout2;
        this.KWHzl = c55251xgS;
        this.copydefault = imageView;
        this.AEQbTJ = imageView2;
        this.EZpvd = imageView3;
        this.AYXKKw = c55251xgS2;
        this.AhwBna = textView;
        this.valueOf = textView2;
    }

    public static C16761epy EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.DcMfJKsfEqpH, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16761epy OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C13754dXa.ActionBar.OgHfcT;
        C55251xgS c55251xgS = (C55251xgS) ViewBindings.findChildViewById(view, i);
        if (c55251xgS != null) {
            i = C13754dXa.ActionBar.validateAndPutInMap;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C13754dXa.ActionBar.QUeTTI;
                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = C13754dXa.ActionBar.iflRwn;
                    android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = C13754dXa.ActionBar.isSystemFallbackPickerAvailableactivity_release;
                        C55251xgS c55251xgS2 = (C55251xgS) ViewBindings.findChildViewById(view, i);
                        if (c55251xgS2 != null) {
                            i = C13754dXa.ActionBar.InspectablePropertyValueType;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.open;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new C16761epy(constraintLayout, constraintLayout, c55251xgS, imageView, imageView2, imageView3, c55251xgS2, textView, textView2);
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
