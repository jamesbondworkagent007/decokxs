package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.epX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16734epX implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final LinearLayoutCompat KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C16734epX(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = linearLayoutCompat;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
    }

    public static C16734epX EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.QKDJJA, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16734epX KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.DHEdFZ;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C13754dXa.ActionBar.parseResult;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C16734epX((LinearLayoutCompat) view, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
