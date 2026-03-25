package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C57406yhn;

/* JADX INFO: renamed from: o.yib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C57447yib implements ViewBinding {
    public final OKEditText KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKEditText getRoot() {
        return this.KWHzl;
    }

    public C57447yib(@androidx.annotation.NonNull OKEditText oKEditText) {
        this.KWHzl = oKEditText;
    }

    public static C57447yib EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C57406yhn.TaskDescription.QbewEr, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C57447yib KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C57447yib((OKEditText) view);
    }
}
