package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nKu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C33921nKu implements ViewBinding {
    public final OKReminder EZpvd;
    public final OKReminder copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OKReminder getRoot() {
        return this.EZpvd;
    }

    public C33921nKu(@androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull OKReminder oKReminder2) {
        this.EZpvd = oKReminder;
        this.copydefault = oKReminder2;
    }

    public static C33921nKu EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C35399nuc.Dialog.DCUTEIdCUTEI, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C33921nKu copydefault(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        OKReminder oKReminder = (OKReminder) view;
        return new C33921nKu(oKReminder, oKReminder);
    }
}
