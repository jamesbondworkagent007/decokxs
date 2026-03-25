package o;

import androidx.viewbinding.ViewBinding;
import o.C25493ixk;

/* JADX INFO: renamed from: o.iJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23803iJx implements ViewBinding {
    public final android.view.View EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C23803iJx(@androidx.annotation.NonNull android.view.View view) {
        this.EZpvd = view;
    }

    public static C23803iJx KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C25493ixk.Activity.DCUTEIddSDPG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C23803iJx copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23803iJx(view);
    }
}
