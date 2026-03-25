package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C35399nuc;

/* JADX INFO: loaded from: classes18.dex */
public final class nKJ implements ViewBinding {
    public final OKReminder AEQbTJ;
    public final OKReminder EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OKReminder getRoot() {
        return this.EZpvd;
    }

    public nKJ(@androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull OKReminder oKReminder2) {
        this.EZpvd = oKReminder;
        this.AEQbTJ = oKReminder2;
    }

    public static nKJ copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DcqEDu, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static nKJ AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKReminder oKReminder = (OKReminder) view;
        return new nKJ(oKReminder, oKReminder);
    }
}
