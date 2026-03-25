package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C46526tXp;

/* JADX INFO: renamed from: o.tXy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46535tXy implements ViewBinding {
    public final ConstraintLayout KWHzl;
    public final OKReminder OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.KWHzl;
    }

    public C46535tXy(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKReminder oKReminder) {
        this.KWHzl = constraintLayout;
        this.OLrzqt = oKReminder;
    }

    public static C46535tXy AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, null, false);
    }

    public static C46535tXy copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C46526tXp.ActionBar.valueOf, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C46535tXy AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C46526tXp.Application.fJNWhG;
        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
        if (oKReminder != null) {
            return new C46535tXy((ConstraintLayout) view, oKReminder);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
