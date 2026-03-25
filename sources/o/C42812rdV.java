package o;

import androidx.viewbinding.ViewBinding;
import o.qZH;

/* JADX INFO: renamed from: o.rdV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C42812rdV implements ViewBinding {
    public final C40505qYi KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C40505qYi getRoot() {
        return this.KWHzl;
    }

    public C42812rdV(@androidx.annotation.NonNull C40505qYi c40505qYi) {
        this.KWHzl = c40505qYi;
    }

    public static C42812rdV EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(qZH.ActionBar.processStrongAuthMessage, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C42812rdV KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C42812rdV((C40505qYi) view);
    }
}
