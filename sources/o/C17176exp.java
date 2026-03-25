package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17176exp implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final ConstraintLayout EZpvd;
    public final ConstraintLayout KWHzl;
    public final ShapeableImageView OLrzqt;
    public final androidx.legacy.widget.Space copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView gEmmrt;
    public final ShapeableImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C17176exp(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull androidx.legacy.widget.Space space, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.KWHzl = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.AEQbTJ = imageView;
        this.OLrzqt = shapeableImageView;
        this.copydefault = space;
        this.valueOf = shapeableImageView2;
        this.gEmmrt = textView;
        this.AhwBna = textView2;
        this.djBIcL = textView3;
        this.AYXKKw = textView4;
    }

    public static C17176exp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gqESXP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C17176exp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DcMfJKsuEgdN;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.onAvailable;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C13754dXa.ActionBar.isBrowsable;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C13754dXa.ActionBar.unregisterMediaButtonEventReceiver;
                    androidx.legacy.widget.Space space = (androidx.legacy.widget.Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C13754dXa.ActionBar.PlaybackStateCompatApi22;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                        if (shapeableImageView2 != null) {
                            i = C13754dXa.ActionBar.ContextAwareKt;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.getFillInIntent;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C13754dXa.ActionBar.getFlagsValues;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C13754dXa.ActionBar.toInclusive;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C17176exp((ConstraintLayout) view, constraintLayout, imageView, shapeableImageView, space, shapeableImageView2, textView, textView2, textView3, textView4);
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
