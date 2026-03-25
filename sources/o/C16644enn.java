package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C13754dXa;

/* JADX INFO: renamed from: o.enn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16644enn implements ViewBinding {
    public final C55173xeu AEQbTJ;
    public final RecyclerView AYXKKw;
    public final ConstraintLayout AhwBna;
    public final AppCompatTextView AkhnZx;
    public final AppCompatTextView DbNXlk;
    public final C33546myW EZpvd;
    public final C33604mzb KWHzl;
    public final C33603mza OLrzqt;
    public final C55113xdn copydefault;
    public final ConstraintLayout djBIcL;
    public final Guideline gEmmrt;
    public final AppCompatTextView isConnected;
    public final Guideline valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.djBIcL;
    }

    public C16644enn(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33546myW c33546myW, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull Guideline guideline, @androidx.annotation.NonNull Guideline guideline2, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull AppCompatTextView appCompatTextView2, @androidx.annotation.NonNull AppCompatTextView appCompatTextView3) {
        this.djBIcL = constraintLayout;
        this.AEQbTJ = c55173xeu;
        this.copydefault = c55113xdn;
        this.KWHzl = c33604mzb;
        this.EZpvd = c33546myW;
        this.OLrzqt = c33603mza;
        this.AYXKKw = recyclerView;
        this.valueOf = guideline;
        this.gEmmrt = guideline2;
        this.AhwBna = constraintLayout2;
        this.AkhnZx = appCompatTextView;
        this.isConnected = appCompatTextView2;
        this.DbNXlk = appCompatTextView3;
    }

    public static C16644enn copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C13754dXa.TaskDescription.RgLUBD, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static C16644enn EZpvd(@androidx.annotation.NonNull android.view.View view) {
        int i = C13754dXa.ActionBar.zFtALg;
        C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
        if (c55173xeu != null) {
            i = C13754dXa.ActionBar.INotificationSideChannelStub;
            C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
            if (c55113xdn != null) {
                i = C13754dXa.ActionBar.play;
                C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                if (c33604mzb != null) {
                    i = C13754dXa.ActionBar.next;
                    C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                    if (c33546myW != null) {
                        i = C13754dXa.ActionBar.isTransportControlEnabled;
                        C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                        if (c33603mza != null) {
                            i = C13754dXa.ActionBar.MediaControllerCompatCallbackStubApi21;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = C13754dXa.ActionBar.onMetadataUpdate;
                                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline != null) {
                                    i = C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0;
                                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline2 != null) {
                                        i = C13754dXa.ActionBar.sendExtras;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = C13754dXa.ActionBar.sendEvent;
                                            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                            if (appCompatTextView != null) {
                                                i = C13754dXa.ActionBar.sendRepeatMode;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatTextView2 != null) {
                                                    i = C13754dXa.ActionBar.sendShuffleMode;
                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                                                    if (appCompatTextView3 != null) {
                                                        return new C16644enn((ConstraintLayout) view, c55173xeu, c55113xdn, c33604mzb, c33546myW, c33603mza, recyclerView, guideline, guideline2, constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3);
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
