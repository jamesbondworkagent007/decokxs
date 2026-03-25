package o;

import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C47315tni;

/* JADX INFO: renamed from: o.trw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47538trw implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final CardView KWHzl;
    public final android.widget.ImageView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.KWHzl;
    }

    public C47538trw(@androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.KWHzl = cardView;
        this.copydefault = imageView;
        this.AEQbTJ = linearLayout;
        this.EZpvd = textView;
    }

    public static C47538trw KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C47315tni.ActionBar.hCLrkq, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C47538trw OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C47315tni.TaskDescription.OJuSTm;
        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = C47315tni.TaskDescription.RKcVTr;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = C47315tni.TaskDescription.DPHOMC;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    return new C47538trw((CardView) view, imageView, linearLayout, textView);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
