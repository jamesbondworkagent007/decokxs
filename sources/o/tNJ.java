package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNJ implements ViewBinding {
    public final tOE AEQbTJ;
    public final RecyclerView EZpvd;
    public final C47735tvi KWHzl;
    public final android.widget.ScrollView OLrzqt;
    public final android.widget.ScrollView copydefault;
    public final C47625tte valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public android.widget.ScrollView getRoot() {
        return this.copydefault;
    }

    public tNJ(@androidx.annotation.NonNull android.widget.ScrollView scrollView, @androidx.annotation.NonNull tOE toe, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C47735tvi c47735tvi, @androidx.annotation.NonNull android.widget.ScrollView scrollView2, @androidx.annotation.NonNull C47625tte c47625tte) {
        this.copydefault = scrollView;
        this.AEQbTJ = toe;
        this.EZpvd = recyclerView;
        this.KWHzl = c47735tvi;
        this.OLrzqt = scrollView2;
        this.valueOf = c47625tte;
    }

    public static tNJ OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.QKudOq;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            tOE toeCopydefault = tOE.copydefault(viewFindChildViewById);
            i = C47501trL.TaskDescription.RIuxYh;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C47501trL.TaskDescription.DlABUU;
                C47735tvi c47735tvi = (C47735tvi) ViewBindings.findChildViewById(view, i);
                if (c47735tvi != null) {
                    android.widget.ScrollView scrollView = (android.widget.ScrollView) view;
                    i = C47501trL.TaskDescription.hgxRZI;
                    C47625tte c47625tte = (C47625tte) ViewBindings.findChildViewById(view, i);
                    if (c47625tte != null) {
                        return new tNJ(scrollView, toeCopydefault, recyclerView, c47735tvi, scrollView, c47625tte);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
