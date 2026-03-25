package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.edit.OKEditText;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hEA implements ViewBinding {
    public final OKEditText EZpvd;
    public final android.widget.TextView OLrzqt;
    public final LinearLayoutCompat copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.copydefault;
    }

    public hEA(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull OKEditText oKEditText, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.copydefault = linearLayoutCompat;
        this.EZpvd = oKEditText;
        this.OLrzqt = textView;
    }

    public static hEA AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.sVvuFk, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hEA EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.iWlNch;
        OKEditText oKEditText = (OKEditText) ViewBindings.findChildViewById(view, i);
        if (oKEditText != null) {
            i = C23274hvD.Application.setHasDecor;
            android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new hEA((LinearLayoutCompat) view, oKEditText, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
