package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ekn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16485ekn implements ViewBinding {
    public final PlayerView AEQbTJ;
    public final ConstraintLayout AYXKKw;
    public final android.widget.TextView AhwBna;
    public final AspectRatioFrameLayout AkhnZx;
    public final NestedScrollView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final wXO KWHzl;
    public final android.widget.TextView OLrzqt;
    public final ConstraintLayout copydefault;
    public final AspectRatioFrameLayout djBIcL;
    public final android.widget.TextView gEmmrt;
    public final android.widget.TextView isConnected;
    public final PlayerView valueOf;
    public final NestedScrollView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.DbNXlk;
    }

    public C16485ekn(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull PlayerView playerView, @androidx.annotation.NonNull wXO wxo, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull AspectRatioFrameLayout aspectRatioFrameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull PlayerView playerView2, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull AspectRatioFrameLayout aspectRatioFrameLayout2, @androidx.annotation.NonNull NestedScrollView nestedScrollView2) {
        this.DbNXlk = nestedScrollView;
        this.copydefault = constraintLayout;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = textView;
        this.AEQbTJ = playerView;
        this.KWHzl = wxo;
        this.AhwBna = textView2;
        this.djBIcL = aspectRatioFrameLayout;
        this.AYXKKw = constraintLayout3;
        this.gEmmrt = textView3;
        this.valueOf = playerView2;
        this.isConnected = textView4;
        this.AkhnZx = aspectRatioFrameLayout2;
        this.values = nestedScrollView2;
    }

    public static C16485ekn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.UrRBLY, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C16485ekn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DlmWDR;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C13754dXa.ActionBar.apHBvG;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = C13754dXa.ActionBar.dpErvT;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C13754dXa.ActionBar.gLWkOL;
                    PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i);
                    if (playerView != null) {
                        i = C13754dXa.ActionBar.iOIMNp;
                        wXO wxo = (wXO) ViewBindings.findChildViewById(view, i);
                        if (wxo != null) {
                            i = C13754dXa.ActionBar.sanrWj;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = C13754dXa.ActionBar.ilfrrN;
                                AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) ViewBindings.findChildViewById(view, i);
                                if (aspectRatioFrameLayout != null) {
                                    i = C13754dXa.ActionBar.gvFztT;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = C13754dXa.ActionBar.UJpkuA;
                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = C13754dXa.ActionBar.DDDCac;
                                            PlayerView playerView2 = (PlayerView) ViewBindings.findChildViewById(view, i);
                                            if (playerView2 != null) {
                                                i = C13754dXa.ActionBar.OmYuqg;
                                                android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = C13754dXa.ActionBar.compare;
                                                    AspectRatioFrameLayout aspectRatioFrameLayout2 = (AspectRatioFrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (aspectRatioFrameLayout2 != null) {
                                                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                        return new C16485ekn(nestedScrollView, constraintLayout, constraintLayout2, textView, playerView, wxo, textView2, aspectRatioFrameLayout, constraintLayout3, textView3, playerView2, textView4, aspectRatioFrameLayout2, nestedScrollView);
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
