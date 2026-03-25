package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eje, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16423eje implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final C17409fEg EZpvd;
    public final C55230xfy KWHzl;
    public final C55113xdn OLrzqt;
    public final RecyclerView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16423eje(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C17409fEg c17409fEg) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c55113xdn;
        this.KWHzl = c55230xfy;
        this.copydefault = recyclerView;
        this.EZpvd = c17409fEg;
    }

    public static C16423eje EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C16423eje EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QHmsKR, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16423eje KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.INotificationSideChannelStubProxy;
        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
        if (c55113xdn != null) {
            i = C13754dXa.ActionBar.getCallingPackage;
            C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
            if (c55230xfy != null) {
                i = C13754dXa.ActionBar.sendSessionEvent;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191;
                    C17409fEg c17409fEg = (C17409fEg) ViewBindings.findChildViewById(view, i);
                    if (c17409fEg != null) {
                        return new C16423eje((ConstraintLayout) view, c55113xdn, c55230xfy, recyclerView, c17409fEg);
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
