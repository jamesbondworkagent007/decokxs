package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yhA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57367yhA implements ViewBinding {
    public final android.view.View EZpvd;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C57367yhA(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.view.View view2) {
        this.OLrzqt = view;
        this.EZpvd = view2;
    }

    public static C57367yhA OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C57406yhn.TaskDescription.AkhnZx, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C57367yhA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C57406yhn.StateListAnimator.iRxXKY;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            return new C57367yhA(view, viewFindChildViewById);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
