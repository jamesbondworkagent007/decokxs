package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ewd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17111ewd implements ViewBinding {
    public final RecyclerView AEQbTJ;
    public final OKEditText KWHzl;
    public final android.view.View OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.OLrzqt;
    }

    public C17111ewd(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull OKEditText oKEditText) {
        this.OLrzqt = view;
        this.AEQbTJ = recyclerView;
        this.KWHzl = oKEditText;
    }

    public static C17111ewd OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.fJk, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C17111ewd KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.RJOkX;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C13754dXa.ActionBar.onSeekTo;
            OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
            if (oKEditText != null) {
                return new C17111ewd(view, recyclerView, oKEditText);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
