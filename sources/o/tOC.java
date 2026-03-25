package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOC implements ViewBinding {
    public final android.widget.TextView KWHzl;
    public final android.view.View OLrzqt;
    public final C55320xhi copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public tOC(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = view;
        this.copydefault = c55320xhi;
        this.KWHzl = textView;
    }

    public static tOC AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C47501trL.Application.heceqZ, viewGroup);
        return AEQbTJ(viewGroup);
    }

    public static tOC AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.HrMTQN;
        C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
        if (c55320xhi != null) {
            i = C47501trL.TaskDescription.adevsa;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new tOC(view, c55320xhi, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
