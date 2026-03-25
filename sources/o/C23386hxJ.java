package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.exoplayer2.ui.PlayerView;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C23386hxJ implements ViewBinding {
    public final PlayerView AEQbTJ;
    public final ConstraintLayout KWHzl;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C23386hxJ(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull PlayerView playerView) {
        this.KWHzl = constraintLayout;
        this.copydefault = imageView;
        this.AEQbTJ = playerView;
    }

    public static C23386hxJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C23386hxJ EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.zLjUOn, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C23386hxJ KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.OTwTPd;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C23274hvD.Application.MediaSessionCompatApi24Callback;
            PlayerView playerView = (PlayerView) ViewBindings.findChildViewById(view, i);
            if (playerView != null) {
                return new C23386hxJ((ConstraintLayout) view, imageView, playerView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
