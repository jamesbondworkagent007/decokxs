package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16530elf implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final RecyclerView AhwBna;
    public final C52794wYp EZpvd;
    public final C57440yiU KWHzl;
    public final NestedScrollView OLrzqt;
    public final android.view.View copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16530elf(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C57440yiU c57440yiU, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.AEQbTJ = constraintLayout;
        this.EZpvd = c52794wYp;
        this.copydefault = view;
        this.OLrzqt = nestedScrollView;
        this.KWHzl = c57440yiU;
        this.AhwBna = recyclerView;
        this.djBIcL = textView;
        this.AYXKKw = textView2;
    }

    public static C16530elf KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.gmHjFq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16530elf EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.gmHjFq;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.OAhWiU))) != null) {
            i = C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi216;
            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
            if (nestedScrollView != null) {
                i = C13754dXa.ActionBar.getStateLabel;
                C57440yiU c57440yiU = (C57440yiU) ViewBindings.findChildViewById(view, i);
                if (c57440yiU != null) {
                    i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = C13754dXa.ActionBar.getOnBackPressedDispatcher;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = C13754dXa.ActionBar.ComponentActivity1;
                            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                return new C16530elf((ConstraintLayout) view, c52794wYp, viewFindChildViewById, nestedScrollView, c57440yiU, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
