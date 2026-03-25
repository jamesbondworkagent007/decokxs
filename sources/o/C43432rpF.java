package o;

import androidx.viewbinding.ViewBinding;
import o.C43471rps;

/* JADX INFO: renamed from: o.rpF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43432rpF implements ViewBinding {
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.FrameLayout KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.KWHzl;
    }

    public C43432rpF(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.KWHzl = frameLayout;
        this.EZpvd = frameLayout2;
    }

    public static C43432rpF copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43471rps.TaskDescription.OLrzqt, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C43432rpF OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
        return new C43432rpF(frameLayout, frameLayout);
    }
}
