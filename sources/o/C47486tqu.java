package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47486tqu implements ViewBinding {
    public final android.view.View EZpvd;
    public final RecyclerView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C47486tqu(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.EZpvd = view;
        this.OLrzqt = recyclerView;
    }

    public static C47486tqu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C47315tni.ActionBar.OxVOHk, viewGroup);
        return copydefault(viewGroup);
    }

    public static C47486tqu copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.Swccd;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            return new C47486tqu(view, recyclerView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
