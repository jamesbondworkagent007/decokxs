package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.qZH;

/* JADX INFO: renamed from: o.raI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42640raI implements ViewBinding {
    public final android.widget.TextView EZpvd;
    public final RecyclerView KWHzl;
    public final C40505qYi OLrzqt;
    public final C52794wYp copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.OLrzqt;
    }

    public C42640raI(@androidx.annotation.NonNull C40505qYi c40505qYi, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = c40505qYi;
        this.copydefault = c52794wYp;
        this.KWHzl = recyclerView;
        this.EZpvd = textView;
    }

    public static C42640raI OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.QCjLjM, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42640raI KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = qZH.StateListAnimator.DAIeex;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = qZH.StateListAnimator.onStatusChanged;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = qZH.StateListAnimator.INotificationSideChannelDefault;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C42640raI((C40505qYi) view, c52794wYp, recyclerView, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
