package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ens, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16649ens implements ViewBinding {
    public final android.widget.LinearLayout EZpvd;
    public final RecyclerView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.EZpvd;
    }

    public C16649ens(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayout;
        this.OLrzqt = recyclerView;
        this.copydefault = textView;
    }

    public static C16649ens copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = C13754dXa.ActionBar.ComponentActivity1;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C16649ens((android.widget.LinearLayout) view, recyclerView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
