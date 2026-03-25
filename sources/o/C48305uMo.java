package o;

import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.MaterialToolbar;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C48305uMo implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final C52794wYp EZpvd;
    public final ConstraintLayout KWHzl;
    public final ComposeView OLrzqt;
    public final MaterialToolbar copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C48305uMo(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull ComposeView composeView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull MaterialToolbar materialToolbar) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = composeView;
        this.EZpvd = c52794wYp;
        this.AEQbTJ = frameLayout;
        this.copydefault = materialToolbar;
    }

    public static C48305uMo AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, null, false);
    }

    public static C48305uMo KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48305uMo AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.aQtmcU;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null) {
            i = C48033uCm.Application.onVolumeChanged;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C48033uCm.Application.ActivityResultCallerKt;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C48033uCm.Application.Ranim;
                    MaterialToolbar materialToolbar = (MaterialToolbar) ViewBindings.findChildViewById(view, i);
                    if (materialToolbar != null) {
                        return new C48305uMo((ConstraintLayout) view, composeView, c52794wYp, frameLayout, materialToolbar);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
