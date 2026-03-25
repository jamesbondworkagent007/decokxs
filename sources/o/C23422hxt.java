package o;

import androidx.viewbinding.ViewBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hxt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23422hxt implements ViewBinding {
    public final OKReminder EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public OKReminder getRoot() {
        return this.EZpvd;
    }

    public C23422hxt(@androidx.annotation.NonNull OKReminder oKReminder) {
        this.EZpvd = oKReminder;
    }

    public static C23422hxt KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.fetchVPNInfo, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C23422hxt AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        if (view == null) {
            throw new java.lang.NullPointerException("rootView");
        }
        return new C23422hxt((OKReminder) view);
    }
}
