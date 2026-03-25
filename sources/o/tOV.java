package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tOV implements ViewBinding {
    public final C46246tNf AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final C54989xbV KWHzl;
    public final C55113xdn OLrzqt;
    public final C46242tNb copydefault;
    public final RecyclerView djBIcL;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.gEmmrt;
    }

    public tOV(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C46242tNb c46242tNb, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C46246tNf c46246tNf, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.gEmmrt = frameLayout;
        this.KWHzl = c54989xbV;
        this.EZpvd = linearLayout;
        this.copydefault = c46242tNb;
        this.OLrzqt = c55113xdn;
        this.AEQbTJ = c46246tNf;
        this.djBIcL = recyclerView;
    }

    public static tOV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47501trL.Application.UhxbNG, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static tOV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        android.view.View viewFindChildViewById2;
        int i = C47501trL.TaskDescription.OJuSTm;
        C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
        if (c54989xbV != null) {
            i = C47501trL.TaskDescription.DNMMPQ;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.aCSzUz))) != null) {
                C46242tNb c46242tNbKWHzl = C46242tNb.KWHzl(viewFindChildViewById);
                i = C47501trL.TaskDescription.registerUser;
                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                if (c55113xdn != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = C47501trL.TaskDescription.DcMfJKdMCrTj))) != null) {
                    C46246tNf c46246tNfAEQbTJ = C46246tNf.AEQbTJ(viewFindChildViewById2);
                    i = C47501trL.TaskDescription.hbZCHz;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        return new tOV((android.widget.FrameLayout) view, c54989xbV, linearLayout, c46242tNbKWHzl, c55113xdn, c46246tNfAEQbTJ, recyclerView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
