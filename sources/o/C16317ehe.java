package o;

import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.list.OKAnchorSelection;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ehe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C16317ehe implements ViewBinding {
    public final android.widget.LinearLayout KWHzl;
    public final OKAnchorSelection OLrzqt;
    public final C55378xin copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.LinearLayout getRoot() {
        return this.KWHzl;
    }

    public C16317ehe(@androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull OKAnchorSelection oKAnchorSelection, @androidx.annotation.NonNull C55378xin c55378xin) {
        this.KWHzl = linearLayout;
        this.OLrzqt = oKAnchorSelection;
        this.copydefault = c55378xin;
    }

    public static C16317ehe EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C16317ehe EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.fIwbmz, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16317ehe EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.hUfVAv;
        OKAnchorSelection oKAnchorSelection = (OKAnchorSelection) ViewBindings.findChildViewById(view, i);
        if (oKAnchorSelection != null) {
            i = C13754dXa.ActionBar.IResultReceiver2;
            C55378xin c55378xin = (C55378xin) ViewBindings.findChildViewById(view, i);
            if (c55378xin != null) {
                return new C16317ehe((android.widget.LinearLayout) view, oKAnchorSelection, c55378xin);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
