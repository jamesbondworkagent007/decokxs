package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C43805rwH implements ViewBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.LinearLayout EZpvd;
    public final android.widget.TextView OLrzqt;
    public final android.widget.LinearLayout copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.copydefault;
    }

    public C43805rwH(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout2, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = linearLayout;
        this.EZpvd = linearLayout2;
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
    }

    public static C43805rwH EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.AwvSrB, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C43805rwH AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view;
        int i = C43662rtX.ActionBar.sVXHln;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C43662rtX.ActionBar.sTzBva;
            android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                return new C43805rwH(linearLayout, linearLayout, textView, textView2);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
