package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oNm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36052oNm implements ViewBinding {
    public final AppCompatImageView AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final C55258xgZ KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final C55249xgQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.OLrzqt;
    }

    public C36052oNm(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55258xgZ c55258xgZ, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C55249xgQ c55249xgQ) {
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = c55258xgZ;
        this.AEQbTJ = appCompatImageView;
        this.EZpvd = frameLayout;
        this.copydefault = c55249xgQ;
    }

    public static C36052oNm AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.dUDNAs, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C36052oNm KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C35964oKf.StateListAnimator.ITrustedWebActivityServiceDefault;
        C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
        if (c55258xgZ != null) {
            i = C35964oKf.StateListAnimator.INotificationSideChannel_Parcel;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = C35964oKf.StateListAnimator.access000;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = C35964oKf.StateListAnimator.RemoteActionCompatParcelizer;
                    C55249xgQ c55249xgQ = (C55249xgQ) ViewBindings.findChildViewById(view, i);
                    if (c55249xgQ != null) {
                        return new C36052oNm((LinearLayoutCompat) view, c55258xgZ, appCompatImageView, frameLayout, c55249xgQ);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
