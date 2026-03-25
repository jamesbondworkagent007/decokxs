package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.github.mmin18.widget.RealtimeBlurView;
import com.google.android.exoplayer2.ui.PlayerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16599emv implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final RecyclerView AYXKKw;
    public final RealtimeBlurView EZpvd;
    public final C52794wYp KWHzl;
    public final CardView OLrzqt;
    public final C52794wYp copydefault;
    public final PlayerView djBIcL;
    public final NestedScrollView gEmmrt;
    public final ConstraintLayout valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.valueOf;
    }

    public C16599emv(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull RealtimeBlurView realtimeBlurView, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull PlayerView playerView, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.valueOf = constraintLayout;
        this.KWHzl = c52794wYp;
        this.copydefault = c52794wYp2;
        this.OLrzqt = cardView;
        this.EZpvd = realtimeBlurView;
        this.AEQbTJ = lottieAnimationView;
        this.gEmmrt = nestedScrollView;
        this.djBIcL = playerView;
        this.AYXKKw = recyclerView;
    }

    public static C16599emv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zYHWMc;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C13754dXa.ActionBar.DGUQLIdZmdUa;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C13754dXa.ActionBar.QfZsXX;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = C13754dXa.ActionBar.QOjuYg;
                    RealtimeBlurView realtimeBlurView = (RealtimeBlurView) ViewBindings.findChildViewById(view, i);
                    if (realtimeBlurView != null) {
                        i = C13754dXa.ActionBar.write;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
                        if (lottieAnimationView != null) {
                            i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplBase;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = C13754dXa.ActionBar.putRating;
                                PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i);
                                if (playerView != null) {
                                    i = C13754dXa.ActionBar.getAudioStream;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        return new C16599emv((ConstraintLayout) view, c52794wYp, c52794wYp2, cardView, realtimeBlurView, lottieAnimationView, nestedScrollView, playerView, recyclerView);
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
