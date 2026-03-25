package o;

import androidx.viewbinding.ViewBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43830rwg implements ViewBinding {
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.OLrzqt;
    }

    public C43830rwg(@androidx.annotation.NonNull android.widget.TextView textView) {
        this.OLrzqt = textView;
    }

    public static C43830rwg OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C43662rtX.TaskDescription.ejfBZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C43830rwg KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C43830rwg((android.widget.TextView) view);
    }
}
