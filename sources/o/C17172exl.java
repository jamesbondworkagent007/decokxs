package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17172exl implements ViewBinding {
    public final ShapeableImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.TextView AhwBna;
    public final androidx.legacy.widget.Space EZpvd;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final ConstraintLayout copydefault;
    public final android.widget.TextView djBIcL;
    public final ShapeableImageView gEmmrt;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.copydefault;
    }

    public C17172exl(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull androidx.legacy.widget.Space space, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4) {
        this.copydefault = constraintLayout;
        this.KWHzl = constraintLayout2;
        this.AEQbTJ = shapeableImageView;
        this.OLrzqt = imageView;
        this.EZpvd = space;
        this.gEmmrt = shapeableImageView2;
        this.AYXKKw = textView;
        this.valueOf = textView2;
        this.djBIcL = textView3;
        this.AhwBna = textView4;
    }

    public static C17172exl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QjzqRB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17172exl copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DcMfJKsuEgdN;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.isBrowsable;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = C13754dXa.ActionBar.setMediaController;
                android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = C13754dXa.ActionBar.unregisterMediaButtonEventReceiver;
                    androidx.legacy.widget.Space space = (androidx.legacy.widget.Space) ViewBindings.findChildViewById(view, i);
                    if (space != null) {
                        i = C13754dXa.ActionBar.PlaybackStateCompatApi22;
                        ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                        if (shapeableImageView2 != null) {
                            i = C13754dXa.ActionBar.getFillInIntent;
                            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView != null) {
                                i = C13754dXa.ActionBar.getFlagsValues;
                                android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = C13754dXa.ActionBar.BinderThread;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C13754dXa.ActionBar.toInclusive;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            return new C17172exl((ConstraintLayout) view, constraintLayout, shapeableImageView, imageView, space, shapeableImageView2, textView, textView2, textView3, textView4);
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
