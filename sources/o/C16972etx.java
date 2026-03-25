package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16972etx implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.view.ViewStub EZpvd;
    public final C18027fae KWHzl;
    public final android.widget.LinearLayout OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C16972etx(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.view.ViewStub viewStub, @androidx.annotation.NonNull C18027fae c18027fae, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2) {
        this.AEQbTJ = linearLayout;
        this.EZpvd = viewStub;
        this.KWHzl = c18027fae;
        this.OLrzqt = linearLayout2;
    }

    public static C16972etx AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.wlaJM;
        android.view.ViewStub viewStub = (android.view.ViewStub) ViewBindings.findChildViewById(view, i);
        if (viewStub != null) {
            i = C13754dXa.ActionBar.getElevation;
            C18027fae c18027fae = (C18027fae) ViewBindings.findChildViewById(view, i);
            if (c18027fae != null) {
                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
                return new C16972etx(linearLayout, viewStub, c18027fae, linearLayout);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
