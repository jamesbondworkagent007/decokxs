package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C23274hvD;

/* JADX INFO: renamed from: o.hzN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23496hzN implements ViewBinding {
    public final android.widget.LinearLayout AEQbTJ;
    public final C55113xdn AYXKKw;
    public final ConstraintLayout AhwBna;
    public final C55173xeu EZpvd;
    public final C52794wYp KWHzl;
    public final NestedScrollView OLrzqt;
    public final C52794wYp copydefault;
    public final OKReminder gEmmrt;
    public final RecyclerView valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.AhwBna;
    }

    public C23496hzN(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull RecyclerView recyclerView) {
        this.AhwBna = constraintLayout;
        this.copydefault = c52794wYp;
        this.KWHzl = c52794wYp2;
        this.OLrzqt = nestedScrollView;
        this.EZpvd = c55173xeu;
        this.AEQbTJ = linearLayout;
        this.AYXKKw = c55113xdn;
        this.gEmmrt = oKReminder;
        this.valueOf = recyclerView;
    }

    public static C23496hzN copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DGOPHZDGOPHZ, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C23496hzN EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.KDccX;
        C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
        if (c52794wYp != null) {
            i = C23274hvD.Application.hCLrkq;
            C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp2 != null) {
                i = C23274hvD.Application.setSubtitle;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                if (nestedScrollView != null) {
                    i = C23274hvD.Application.setTitle;
                    C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                    if (c55173xeu != null) {
                        i = C23274hvD.Application.IMediaControllerCallback;
                        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = C23274hvD.Application.MediaControllerCompatApi21TransportControls;
                            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                            if (c55113xdn != null) {
                                i = C23274hvD.Application.lambdanew1;
                                OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                if (oKReminder != null) {
                                    i = C23274hvD.Application.ComponentActivity22;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        return new C23496hzN((ConstraintLayout) view, c52794wYp, c52794wYp2, nestedScrollView, c55173xeu, linearLayout, c55113xdn, oKReminder, recyclerView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
