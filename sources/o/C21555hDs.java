package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hDs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21555hDs implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final LinearLayoutCompat EZpvd;
    public final android.widget.TextView KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.EZpvd;
    }

    public C21555hDs(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.EZpvd = linearLayoutCompat;
        this.AEQbTJ = linearLayoutCompat2;
        this.KWHzl = textView;
    }

    public static C21555hDs AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DcMfJKfwDlxl, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C21555hDs KWHzl(@androidx.annotation.NonNull android.view.View view) {
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
        int i = C23274hvD.Application.cleanup;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new C21555hDs(linearLayoutCompat, linearLayoutCompat, textView);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
