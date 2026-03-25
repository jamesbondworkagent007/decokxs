package o;

import androidx.viewbinding.ViewBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43826rwc implements ViewBinding {
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C43826rwc(@androidx.annotation.NonNull android.view.View view) {
        this.copydefault = view;
    }

    public static C43826rwc OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.fIwbmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C43826rwc KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C43826rwc(view);
    }
}
