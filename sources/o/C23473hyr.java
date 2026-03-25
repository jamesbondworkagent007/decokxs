package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hyr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23473hyr implements ViewBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final LinearLayoutCompat KWHzl;
    public final wYF OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final RecyclerView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.KWHzl;
    }

    public C23473hyr(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull wYF wyf, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.KWHzl = linearLayoutCompat;
        this.OLrzqt = wyf;
        this.AEQbTJ = imageView;
        this.EZpvd = textView;
        this.copydefault = linearLayout;
        this.djBIcL = recyclerView;
    }

    public static C23473hyr EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DAIeex, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OLrzqt(viewInflate);
    }

    public static C23473hyr OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.DBxZfM;
        wYF wyf = (wYF) ViewBindings.findChildViewById(view, i);
        if (wyf != null) {
            i = C23274hvD.Application.dESsmu;
            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = C23274hvD.Application.getMediaDescription;
                android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = C23274hvD.Application.isSessionReady;
                    android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = C23274hvD.Application.ComponentDialogExternalSyntheticApiModelOutline0;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView != null) {
                            return new C23473hyr((LinearLayoutCompat) view, wyf, imageView, textView, linearLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
