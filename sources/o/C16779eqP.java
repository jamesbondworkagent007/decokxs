package o;

import androidx.viewbinding.ViewBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16779eqP implements ViewBinding {
    public final android.widget.TextView OLrzqt;
    public final android.widget.TextView copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.widget.TextView getRoot() {
        return this.copydefault;
    }

    public C16779eqP(@androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2) {
        this.copydefault = textView;
        this.OLrzqt = textView2;
    }

    public static C16779eqP copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.FYtjSf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C16779eqP KWHzl(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        android.widget.TextView textView = (android.widget.TextView) view;
        return new C16779eqP(textView, textView);
    }
}
