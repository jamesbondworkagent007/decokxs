package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C16522elX implements ViewBinding {
    public final android.view.View EZpvd;
    public final android.widget.TextView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.viewbinding.ViewBinding
    public android.view.View getRoot() {
        return this.EZpvd;
    }

    public C16522elX(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = view;
        this.KWHzl = textView;
    }

    public static C16522elX EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.NonNull android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new java.lang.NullPointerException("parent");
        }
        layoutInflater.inflate(C13754dXa.TaskDescription.DGUQLIdZmdUa, viewGroup);
        return EZpvd(viewGroup);
    }

    public static C16522elX EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.getRccStateFromState;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new C16522elX(view, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
