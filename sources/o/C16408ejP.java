package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16408ejP implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final C33537myN OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16408ejP(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = constraintLayout;
        this.OLrzqt = c33537myN;
        this.EZpvd = frameLayout;
        this.KWHzl = textView;
    }

    public static C16408ejP AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C16408ejP EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.Dmq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C16408ejP copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iZzfmt;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.RSmiaq;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C13754dXa.ActionBar.PlaybackStateCompatBuilder;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C16408ejP((ConstraintLayout) view, c33537myN, frameLayout, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
