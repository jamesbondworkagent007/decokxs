package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.euk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17012euk implements ViewBinding {
    public final C33537myN AEQbTJ;
    public final OKReminder AYXKKw;
    public final C55173xeu AhwBna;
    public final android.widget.TextView AkhnZx;
    public final NestedScrollView DbNXlk;
    public final ConstraintLayout EZpvd;
    public final wYK KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C52794wYp copydefault;
    public final C55113xdn djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final ConstraintLayout gEmmrt;
    public final android.widget.Space isConnected;
    public final RecyclerView valueOf;
    public final android.widget.TextView values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public C17012euk(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C33537myN c33537myN, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull wYK wyk, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull ConstraintLayout constraintLayout3, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull OKReminder oKReminder, @androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull android.widget.Space space, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3) {
        this.gEmmrt = constraintLayout;
        this.AEQbTJ = c33537myN;
        this.copydefault = c52794wYp;
        this.KWHzl = wyk;
        this.EZpvd = constraintLayout2;
        this.OLrzqt = constraintLayout3;
        this.AhwBna = c55173xeu;
        this.djBIcL = c55113xdn;
        this.valueOf = recyclerView;
        this.AYXKKw = oKReminder;
        this.DbNXlk = nestedScrollView;
        this.isConnected = space;
        this.AkhnZx = textView;
        this.values = textView2;
        this.fetchVPNInfo = textView3;
    }

    public static C17012euk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, null, false);
    }

    public static C17012euk EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.isElapsedRealtimeNanosAvailable, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return copydefault(viewInflate);
    }

    public static C17012euk copydefault(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.accept;
        C33537myN c33537myN = (C33537myN) ViewBindings.findChildViewById(view, i);
        if (c33537myN != null) {
            i = C13754dXa.ActionBar.zhUgOk;
            C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
            if (c52794wYp != null) {
                i = C13754dXa.ActionBar.dIjzlO;
                wYK wyk = (wYK) ViewBindings.findChildViewById(view, i);
                if (wyk != null) {
                    i = C13754dXa.ActionBar.hOMIpD;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = C13754dXa.ActionBar.registerUser;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = C13754dXa.ActionBar.OStAOF;
                            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
                            if (c55173xeu != null) {
                                i = C13754dXa.ActionBar.INotificationSideChannelStub;
                                C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                if (c55113xdn != null) {
                                    i = C13754dXa.ActionBar.getPackageName;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                    if (recyclerView != null) {
                                        i = C13754dXa.ActionBar.playFromMediaId;
                                        OKReminder oKReminder = (OKReminder) ViewBindings.findChildViewById(view, i);
                                        if (oKReminder != null) {
                                            i = C13754dXa.ActionBar.ensureClassLoader;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi18;
                                                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                                                if (space != null) {
                                                    i = C13754dXa.ActionBar.fullyDrawnReported;
                                                    android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView != null) {
                                                        i = C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResultCompanion;
                                                        android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView2 != null) {
                                                            i = C13754dXa.ActionBar.CheckResult;
                                                            android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView3 != null) {
                                                                return new C17012euk((ConstraintLayout) view, c33537myN, c52794wYp, wyk, constraintLayout, constraintLayout2, c55173xeu, c55113xdn, recyclerView, oKReminder, nestedScrollView, space, textView, textView2, textView3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
