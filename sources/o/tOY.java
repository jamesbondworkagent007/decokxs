package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOY implements ViewBinding {
    public final C54989xbV AEQbTJ;
    public final android.widget.LinearLayout AhwBna;
    public final wYF EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C46242tNb OLrzqt;
    public final C55113xdn copydefault;
    public final C46246tNf gEmmrt;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AhwBna;
    }

    public tOY(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull C46242tNb c46242tNb, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C46246tNf c46246tNf, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AhwBna = linearLayout;
        this.AEQbTJ = c54989xbV;
        this.EZpvd = wyf;
        this.KWHzl = linearLayout2;
        this.OLrzqt = c46242tNb;
        this.copydefault = c55113xdn;
        this.gEmmrt = c46246tNf;
        this.valueOf = recyclerView;
    }

    public static tOY AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C47501trL.TaskDescription.OJuSTm;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C47501trL.TaskDescription.igXuih;
            wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
            if (wyf != null) {
                i = C47501trL.TaskDescription.DNMMPQ;
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.aCSzUz))) != null) {
                    C46242tNb c46242tNbKWHzl = C46242tNb.KWHzl(viewFindChildViewById);
                    i = C47501trL.TaskDescription.registerUser;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DcMfJKdMCrTj))) != null) {
                        C46246tNf c46246tNfAEQbTJ = C46246tNf.AEQbTJ(viewFindChildViewById2);
                        i = C47501trL.TaskDescription.gVEiQJ;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new tOY((android.widget.LinearLayout) view, c54989xbV, wyf, linearLayout, c46242tNbKWHzl, c55113xdn, c46246tNfAEQbTJ, recyclerView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
