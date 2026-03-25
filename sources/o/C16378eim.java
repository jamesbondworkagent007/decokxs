package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eim, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16378eim implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final C33537myN EZpvd;
    public final android.widget.TextView KWHzl;
    public final RecyclerView OLrzqt;
    public final C19597gIg copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C16378eim(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C19597gIg c19597gIg, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = linearLayoutCompat;
        this.copydefault = c19597gIg;
        this.EZpvd = c33537myN;
        this.OLrzqt = recyclerView;
        this.KWHzl = textView;
        this.AhwBna = textView2;
    }

    public static C16378eim OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, null, false);
    }

    public static C16378eim OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gGvvIC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16378eim KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.iRxXKY;
        C19597gIg c19597gIg = (C19597gIg) ViewBindings.findChildViewById(view, i);
        if (c19597gIg != null) {
            i = C13754dXa.ActionBar.accept;
            C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
            if (c33537myN != null) {
                i = C13754dXa.ActionBar.getPlaybackType;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C13754dXa.ActionBar.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner2;
                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = C13754dXa.ActionBar.getClipDataUrisactivity_release;
                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            return new C16378eim((LinearLayoutCompat) view, c19597gIg, c33537myN, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
