package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17048evT implements ViewBinding {
    public final OKEditText AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public OKEditText getRoot() {
        return this.AEQbTJ;
    }

    public C17048evT(@androidx.annotation.NonNull OKEditText oKEditText) {
        this.AEQbTJ = oKEditText;
    }

    public static C17048evT KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.iMXFZQ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17048evT copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C17048evT((OKEditText) view);
    }
}
