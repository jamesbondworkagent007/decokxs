package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.PlayerView;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nOu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34029nOu implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.FrameLayout AYXKKw;
    public final PlayerView AhwBna;
    public final android.widget.LinearLayout AkhnZx;
    public final android.widget.ProgressBar EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.SeekBar copydefault;
    public final android.widget.TextView djBIcL;
    public final android.widget.ImageView fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView isConnected;
    public final android.widget.ImageView valueOf;
    public final android.view.View values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AYXKKw;
    }

    public C34029nOu(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.SeekBar seekBar, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.ProgressBar progressBar, @androidx.annotation.NonNull PlayerView playerView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.view.View view) {
        this.AYXKKw = frameLayout;
        this.copydefault = seekBar;
        this.AEQbTJ = imageView;
        this.KWHzl = textView;
        this.OLrzqt = frameLayout2;
        this.EZpvd = progressBar;
        this.AhwBna = playerView;
        this.valueOf = imageView2;
        this.djBIcL = textView2;
        this.gEmmrt = linearLayout;
        this.fetchVPNInfo = imageView3;
        this.AkhnZx = linearLayout2;
        this.isConnected = textView3;
        this.values = view;
    }

    public static C34029nOu AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.UccSpe, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C34029nOu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C35399nuc.StateListAnimator.zsXlph;
        android.widget.SeekBar seekBar = (android.widget.SeekBar) ViewBindings.findChildViewById(view, i);
        if (seekBar != null) {
            i = C35399nuc.StateListAnimator.DBxZfM;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C35399nuc.StateListAnimator.ULRxlR;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C35399nuc.StateListAnimator.DcMfJKDCKfqP;
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = C35399nuc.StateListAnimator.DcMfJKsfEqpH;
                        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) ViewBindings.findChildViewById(view, i);
                        if (progressBar != null) {
                            i = C35399nuc.StateListAnimator.Dfv;
                            PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i);
                            if (playerView != null) {
                                i = C35399nuc.StateListAnimator.aQtmcU;
                                android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = C35399nuc.StateListAnimator.fZc;
                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = C35399nuc.StateListAnimator.GiPPlLgiPPlL;
                                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = C35399nuc.StateListAnimator.DpxfQh;
                                            android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = C35399nuc.StateListAnimator.OqCbbx;
                                                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout2 != null) {
                                                    i = C35399nuc.StateListAnimator.dGrqPl;
                                                    android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C35399nuc.StateListAnimator.OUcgGI))) != null) {
                                                        return new C34029nOu((android.widget.FrameLayout) view, seekBar, imageView, textView, frameLayout, progressBar, playerView, imageView2, textView2, linearLayout, imageView3, linearLayout2, textView3, viewFindChildViewById);
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
