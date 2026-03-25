package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16685eob implements ViewBinding {
    public final C55113xdn AEQbTJ;
    public final RecyclerView EZpvd;
    public final C55230xfy KWHzl;
    public final ConstraintLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.OLrzqt;
    }

    public C16685eob(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55230xfy c55230xfy) {
        this.OLrzqt = constraintLayout;
        this.AEQbTJ = c55113xdn;
        this.EZpvd = recyclerView;
        this.KWHzl = c55230xfy;
    }

    public static C16685eob copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.ROgMPW, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C16685eob OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C13754dXa.ActionBar.getQueue;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C13754dXa.ActionBar.getCallingPackage;
                C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
                if (c55230xfy != null) {
                    return new C16685eob((ConstraintLayout) view, c55113xdn, recyclerView, c55230xfy);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
