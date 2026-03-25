package o;

import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48329uNl implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final ShapeableImageView AYXKKw;
    public final CardView EZpvd;
    public final ShapeableImageView KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ShapeableImageView copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.TextView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.EZpvd;
    }

    public C48329uNl(@androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull ShapeableImageView shapeableImageView2, @androidx.annotation.NonNull ShapeableImageView shapeableImageView3, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.EZpvd = cardView;
        this.OLrzqt = textView;
        this.KWHzl = shapeableImageView;
        this.AEQbTJ = linearLayout;
        this.copydefault = shapeableImageView2;
        this.AYXKKw = shapeableImageView3;
        this.djBIcL = textView2;
        this.valueOf = textView3;
    }

    public static C48329uNl KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.UeEOUB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48329uNl AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.getCurrentVolume;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C48033uCm.Application.ActivityResultCallerLauncher;
            ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
            if (shapeableImageView != null) {
                i = C48033uCm.Application.r8lambda7lLdjm1L5OSJIz1pWP4kzityPws;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = C48033uCm.Application.registerForActivityResultlambda1;
                    ShapeableImageView shapeableImageView2 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                    if (shapeableImageView2 != null) {
                        i = C48033uCm.Application.ActivityResultCallerKtExternalSyntheticLambda0;
                        ShapeableImageView shapeableImageView3 = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                        if (shapeableImageView3 != null) {
                            i = C48033uCm.Application.open;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C48033uCm.Application.IntRange;
                                android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new C48329uNl((CardView) view, textView, shapeableImageView, linearLayout, shapeableImageView2, shapeableImageView3, textView2, textView3);
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
