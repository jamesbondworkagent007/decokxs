package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47501trL;

/* JADX INFO: renamed from: o.tOd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46271tOd implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final C46242tNb KWHzl;
    public final RecyclerView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.FrameLayout gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C46271tOd(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull C46242tNb c46242tNb, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2) {
        this.copydefault = frameLayout;
        this.KWHzl = c46242tNb;
        this.AEQbTJ = c55113xdn;
        this.EZpvd = textView;
        this.OLrzqt = recyclerView;
        this.gEmmrt = frameLayout2;
    }

    public static C46271tOd copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47501trL.TaskDescription.aCSzUz;
        android.view.View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            C46242tNb c46242tNbKWHzl = C46242tNb.KWHzl(viewFindChildViewById);
            i = C47501trL.TaskDescription.registerUser;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C47501trL.TaskDescription.fcfzuX;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C47501trL.TaskDescription.FhERFw;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view;
                        return new C46271tOd(frameLayout, c46242tNbKWHzl, c55113xdn, textView, recyclerView, frameLayout);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
