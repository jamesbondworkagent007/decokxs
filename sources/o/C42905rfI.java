package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.rfI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C42905rfI implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final Group EZpvd;
    public final RecyclerView KWHzl;
    public final android.view.View copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.copydefault;
    }

    public C42905rfI(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Group group, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView) {
        this.copydefault = view;
        this.EZpvd = group;
        this.KWHzl = recyclerView;
        this.AEQbTJ = appCompatTextView;
    }

    public static C42905rfI AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(qZH.ActionBar.DuXjdv, viewGroup);
        return KWHzl(viewGroup);
    }

    public static C42905rfI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.HJWChPzRXNTw;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.mayLaunchUrl;
                AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                if (appCompatTextView != null) {
                    return new C42905rfI(view, group, recyclerView, appCompatTextView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
