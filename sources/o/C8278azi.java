package o;

import androidx.viewbinding.ViewBinding;
import o.C8206ayP;

/* JADX INFO: renamed from: o.azi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C8278azi implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.EZpvd;
    }

    public C8278azi(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.EZpvd = frameLayout;
        this.OLrzqt = frameLayout2;
    }

    public static C8278azi KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C8278azi OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C8206ayP.Application.AkhnZx, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C8278azi KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        return new C8278azi(frameLayout, frameLayout);
    }
}
