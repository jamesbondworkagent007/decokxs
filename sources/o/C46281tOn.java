package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46281tOn implements ViewBinding {
    public final wYE AEQbTJ;
    public final android.widget.FrameLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.OLrzqt;
    }

    public C46281tOn(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull wYE wye) {
        this.OLrzqt = frameLayout;
        this.AEQbTJ = wye;
    }

    public static C46281tOn AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.QwvEab, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46281tOn AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.ODCBUN;
        wYE wye = (wYE) ViewBindings.findChildViewById(view, i);
        if (wye != null) {
            return new C46281tOn((android.widget.FrameLayout) view, wye);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
