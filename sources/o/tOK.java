package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOK implements ViewBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final OKEditText KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.AEQbTJ;
    }

    public tOK(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull OKEditText oKEditText) {
        this.AEQbTJ = frameLayout;
        this.KWHzl = oKEditText;
    }

    public static tOK KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.DGUQLI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static tOK OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.iPSTqm;
        OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
        if (oKEditText != null) {
            return new tOK((android.widget.FrameLayout) view, oKEditText);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
