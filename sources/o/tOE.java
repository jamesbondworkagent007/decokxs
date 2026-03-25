package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOE implements ViewBinding {
    public final ShapeableImageView AEQbTJ;
    public final android.view.View AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final MaterialCardView AkhnZx;
    public final android.widget.LinearLayout EZpvd;
    public final MaterialCardView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final android.widget.TextView djBIcL;
    public final C55113xdn gEmmrt;
    public final android.widget.ImageView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public MaterialCardView getRoot() {
        return this.AkhnZx;
    }

    public tOE(@androidx.annotation.NonNull MaterialCardView materialCardView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull MaterialCardView materialCardView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull ShapeableImageView shapeableImageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.AkhnZx = materialCardView;
        this.OLrzqt = frameLayout;
        this.KWHzl = materialCardView2;
        this.copydefault = textView;
        this.AEQbTJ = shapeableImageView;
        this.EZpvd = linearLayout;
        this.djBIcL = textView2;
        this.AhwBna = frameLayout2;
        this.AYXKKw = view;
        this.gEmmrt = c55113xdn;
        this.valueOf = imageView;
    }

    public static tOE copydefault(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C47501trL.TaskDescription.hUfVAv;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i = C47501trL.TaskDescription.DAIeex;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = C47501trL.TaskDescription.AxsJAYsNCnLh;
                ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(view, i);
                if (shapeableImageView != null) {
                    i = C47501trL.TaskDescription.accept;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C47501trL.TaskDescription.RlQdEF;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = C47501trL.TaskDescription.DQzvGNdrmXxudrmXxu;
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DcMfJKfbSiEC))) != null) {
                                i = C47501trL.TaskDescription.hdpuIA;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C47501trL.TaskDescription.Dap;
                                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        return new tOE(materialCardView, frameLayout, materialCardView, textView, shapeableImageView, linearLayout, textView2, frameLayout2, viewFindChildViewById, c55113xdn, imageView);
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
