package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: loaded from: classes9.dex */
public final class qZJ implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C52794wYp EZpvd;
    public final AppCompatTextView KWHzl;
    public final NestedScrollView OLrzqt;
    public final C55173xeu copydefault;
    public final android.view.View gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.OLrzqt;
    }

    public qZJ(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull android.view.View view) {
        this.OLrzqt = nestedScrollView;
        this.EZpvd = c52794wYp;
        this.copydefault = c55173xeu;
        this.AEQbTJ = recyclerView;
        this.KWHzl = appCompatTextView;
        this.gEmmrt = view;
    }

    public static qZJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = qZH.StateListAnimator.hUfVAv;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.fZc;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = qZH.StateListAnimator.OCdtug;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = qZH.StateListAnimator.ICustomTabsServiceStub;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = qZH.StateListAnimator.createFromParcel))) != null) {
                        return new qZJ((NestedScrollView) view, c52794wYp, c55173xeu, recyclerView, appCompatTextView, viewFindChildViewById);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
