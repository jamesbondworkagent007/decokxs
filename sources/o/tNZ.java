package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: loaded from: classes19.dex */
public final class tNZ implements ViewBinding {
    public final C33546myW AEQbTJ;
    public final android.widget.ImageView EZpvd;
    public final RecyclerView KWHzl;
    public final C46478tVv OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public tNZ(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C46478tVv c46478tVv, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull android.widget.ImageView imageView) {
        this.copydefault = linearLayout;
        this.OLrzqt = c46478tVv;
        this.KWHzl = recyclerView;
        this.AEQbTJ = c33546myW;
        this.EZpvd = imageView;
    }

    public static tNZ copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.dUDNAs;
        C46478tVv c46478tVv = (C46478tVv) ViewBindings.findChildViewById(view, i);
        if (c46478tVv != null) {
            i = C47501trL.TaskDescription.DztXDE;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C47501trL.TaskDescription.DBAlnt;
                C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                if (c33546myW != null) {
                    i = C47501trL.TaskDescription.RXdAnZ;
                    android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new tNZ((android.widget.LinearLayout) view, c46478tVv, recyclerView, c33546myW, imageView);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
