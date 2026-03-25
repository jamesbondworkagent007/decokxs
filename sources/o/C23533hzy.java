package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23533hzy implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;
    public final ConstraintLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.ImageView isConnected;
    public final android.widget.TextView valueOf;
    public final android.widget.ImageView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C23533hzy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.ImageView imageView5, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = imageView;
        this.EZpvd = imageView2;
        this.KWHzl = textView;
        this.copydefault = textView2;
        this.OLrzqt = linearLayout;
        this.AYXKKw = linearLayout2;
        this.AhwBna = imageView3;
        this.valueOf = textView3;
        this.gEmmrt = textView4;
        this.values = imageView4;
        this.isConnected = imageView5;
        this.AkhnZx = textView5;
        this.DbNXlk = textView6;
    }

    public static C23533hzy KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fERRXa, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23533hzy EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.fkESqH;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.geLlBI;
            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = C23274hvD.Application.Swccd;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.DQzvGN;
                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = C23274hvD.Application.getVolumeControl;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.getCurrentVolume;
                            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout2 != null) {
                                i = C23274hvD.Application.getPlaybackSpeed;
                                android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = C23274hvD.Application.ActivityResultContractsOpenDocument;
                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = C23274hvD.Application.getClipDataUrisactivity_release;
                                        android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView4 != null) {
                                            i = C23274hvD.Application.getGmsPickeractivity_release;
                                            android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView4 != null) {
                                                i = C23274hvD.Application.isPhotoPickerAvailable;
                                                android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView5 != null) {
                                                    i = C23274hvD.Application.isGmsPickerAvailableactivity_release;
                                                    android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = C23274hvD.Application.getVisualMimeTypeactivity_release;
                                                        android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            return new C23533hzy((ConstraintLayout) view, imageView, imageView2, textView, textView2, linearLayout, linearLayout2, imageView3, textView3, textView4, imageView4, imageView5, textView5, textView6);
                                                        }
                                                    }
                                                }
                                            }
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
