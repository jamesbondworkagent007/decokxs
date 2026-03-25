package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tPp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46310tPp implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.view.View EZpvd;
    public final C55258xgZ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C46310tPp(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull C55258xgZ c55258xgZ) {
        this.EZpvd = view;
        this.AEQbTJ = textView;
        this.OLrzqt = c55258xgZ;
    }

    public static C46310tPp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C47501trL.Application.fsSxsn, viewGroup);
        return copydefault(viewGroup);
    }

    public static C46310tPp copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.DGOPHZ;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C47501trL.TaskDescription.DPHOMC;
            C55258xgZ c55258xgZ = (C55258xgZ) ViewBindings.findChildViewById(view, i);
            if (c55258xgZ != null) {
                return new C46310tPp(view, textView, c55258xgZ);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
