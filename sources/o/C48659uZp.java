package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48659uZp implements ViewBinding {
    public final LinearLayoutCompat AEQbTJ;
    public final RecyclerView EZpvd;
    public final OKReminder KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C55372xih copydefault;
    public final android.widget.TextView djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public LinearLayoutCompat getRoot() {
        return this.AEQbTJ;
    }

    public C48659uZp(@androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C55372xih c55372xih, @androidx.annotation.NonNull android.widget.TextView textView) {
        this.AEQbTJ = linearLayoutCompat;
        this.OLrzqt = constraintLayout;
        this.KWHzl = oKReminder;
        this.EZpvd = recyclerView;
        this.copydefault = c55372xih;
        this.djBIcL = textView;
    }

    public static C48659uZp EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.HJWChP, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return KWHzl(viewInflate);
    }

    public static C48659uZp KWHzl(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.gGNlxh;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = C48033uCm.Application.toString;
            OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
            if (oKReminder != null) {
                i = C48033uCm.Application.MediaBrowserCompatMediaItem1;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = C48033uCm.Application.FractionRes;
                    C55372xih c55372xih = (C55372xih) ViewBindings.findChildViewById(view, i);
                    if (c55372xih != null) {
                        i = C48033uCm.Application.onNothingSelected;
                        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new C48659uZp((LinearLayoutCompat) view, constraintLayout, oKReminder, recyclerView, c55372xih, textView);
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
