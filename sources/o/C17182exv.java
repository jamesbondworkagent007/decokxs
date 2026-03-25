package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.exv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17182exv implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final RecyclerView EZpvd;
    public final android.view.View OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C17182exv(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = recyclerView;
        this.OLrzqt = view;
        this.copydefault = textView;
    }

    public static C17182exv EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C13754dXa.ActionBar.skipToNext;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C13754dXa.ActionBar.MediaSessionCompatCallbackStubApi23))) != null) {
            i = C13754dXa.ActionBar.ComponentActivity1;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C17182exv((android.widget.LinearLayout) view, recyclerView, viewFindChildViewById, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
