package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tON implements ViewBinding {
    public final LinearLayoutCompat KWHzl;
    public final C55159xeg OLrzqt;
    public final tOP copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public tON(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55159xeg c55159xeg, @androidx.annotation.NonNull tOP top) {
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = c55159xeg;
        this.copydefault = top;
    }

    public static tON OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C47501trL.TaskDescription.ffGIBT;
        C55159xeg c55159xeg = (C55159xeg) ViewBindings.findChildViewById(view, i);
        if (c55159xeg != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DGUQLI))) != null) {
            return new tON((LinearLayoutCompat) view, c55159xeg, tOP.copydefault(viewFindChildViewById));
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
