package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.tob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47361tob implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C55173xeu OLrzqt;
    public final android.widget.FrameLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.FrameLayout getRoot() {
        return this.copydefault;
    }

    public C47361tob(@androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55173xeu c55173xeu) {
        this.copydefault = frameLayout;
        this.AEQbTJ = recyclerView;
        this.OLrzqt = c55173xeu;
    }

    public static C47361tob copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.iCPUKe;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C47315tni.TaskDescription.gGNlxh;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                return new C47361tob((android.widget.FrameLayout) view, recyclerView, c55173xeu);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
