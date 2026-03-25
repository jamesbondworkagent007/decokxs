package o;

import androidx.viewbinding.ViewBinding;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46287tOt implements ViewBinding {
    public final android.view.View EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C46287tOt(@androidx.annotation.NonNull android.view.View view) {
        this.EZpvd = view;
    }

    public static C46287tOt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.htlTjW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C46287tOt EZpvd(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C46287tOt(view);
    }
}
