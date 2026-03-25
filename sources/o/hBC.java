package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.uilab.view.OKSortTextView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hBC implements ViewBinding {
    public final OKSortTextView AEQbTJ;
    public final C33546myW AhwBna;
    public final C33546myW EZpvd;
    public final C55113xdn KWHzl;
    public final LinearLayoutCompat OLrzqt;
    public final OKSortTextView copydefault;
    public final RecyclerView djBIcL;
    public final OKReminder gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C33546myW getRoot() {
        return this.AhwBna;
    }

    public hBC(@androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull OKSortTextView oKSortTextView, @androidx.annotation.NonNull OKSortTextView oKSortTextView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33546myW c33546myW2, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AhwBna = c33546myW;
        this.copydefault = oKSortTextView;
        this.AEQbTJ = oKSortTextView2;
        this.OLrzqt = linearLayoutCompat;
        this.KWHzl = c55113xdn;
        this.EZpvd = c33546myW2;
        this.gEmmrt = oKReminder;
        this.djBIcL = recyclerView;
    }

    public static hBC OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.Th, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hBC AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.getOptionsList;
        OKSortTextView oKSortTextView = (OKSortTextView) ViewBindings.findChildViewById(view, i);
        if (oKSortTextView != null) {
            i = C23274hvD.Application.getIconBitmap;
            OKSortTextView oKSortTextView2 = (OKSortTextView) ViewBindings.findChildViewById(view, i);
            if (oKSortTextView2 != null) {
                i = C23274hvD.Application.MediaControllerCompatMediaControllerImpl;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                    C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                    if (c55113xdn != null) {
                        C33546myW c33546myW = (C33546myW) view;
                        i = C23274hvD.Application.addOnConfigurationChangedListener;
                        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                        if (oKReminder != null) {
                            i = C23274hvD.Application.onDraw;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                return new hBC(c33546myW, oKSortTextView, oKSortTextView2, linearLayoutCompat, c55113xdn, c33546myW, oKReminder, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
