package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16234egA implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.widget.TextView OLrzqt;
    public final C33537myN copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16234egA(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = constraintLayout;
        this.copydefault = c33537myN;
        this.EZpvd = recyclerView;
        this.OLrzqt = textView;
    }

    public static C16234egA EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C16234egA copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.AEQbTJ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16234egA copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iZzfmt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = C13754dXa.ActionBar.ComponentActivity1;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C16234egA((ConstraintLayout) view, c33537myN, recyclerView, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
