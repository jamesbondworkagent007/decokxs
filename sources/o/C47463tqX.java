package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.tqX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47463tqX implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final C55230xfy KWHzl;
    public final android.view.View OLrzqt;
    public final C55113xdn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C47463tqX(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull C55230xfy c55230xfy, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.OLrzqt = view;
        this.KWHzl = c55230xfy;
        this.copydefault = c55113xdn;
        this.AEQbTJ = recyclerView;
    }

    public static C47463tqX copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C47315tni.ActionBar.htlTjW, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C47463tqX KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.sVXHln;
        C55230xfy c55230xfy = (C55230xfy) ViewBindings.findChildViewById(view, i);
        if (c55230xfy != null) {
            i = C47315tni.TaskDescription.zKcAg;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C47315tni.TaskDescription.Swccd;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    return new C47463tqX(view, c55230xfy, c55113xdn, recyclerView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
