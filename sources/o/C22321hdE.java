package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C22366hdx;

/* JADX INFO: renamed from: o.hdE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C22321hdE implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final kBK OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.AEQbTJ;
    }

    public C22321hdE(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull kBK kbk, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayout;
        this.OLrzqt = kbk;
        this.EZpvd = textView;
    }

    public static C22321hdE EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C22366hdx.Activity.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C22321hdE copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C22366hdx.ActionBar.isConnected;
        kBK kbk = (kBK) ViewBindings.findChildViewById(view, i);
        if (kbk != null) {
            i = C22366hdx.ActionBar.DCUTEIddSDPG;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new C22321hdE((android.widget.LinearLayout) view, kbk, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
