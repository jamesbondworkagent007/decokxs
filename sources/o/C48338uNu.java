package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48338uNu implements ViewBinding {
    public final AppCompatTextView AEQbTJ;
    public final C47988uAv AYXKKw;
    public final C55018xby AhwBna;
    public final C53573wnz DbNXlk;
    public final C47988uAv EZpvd;
    public final C55320xhi KWHzl;
    public final C53513wms OLrzqt;
    public final Barrier copydefault;
    public final C53573wnz djBIcL;
    public final ConstraintLayout fetchVPNInfo;
    public final C55320xhi gEmmrt;
    public final NestedScrollView isConnected;
    public final C53573wnz valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public NestedScrollView getRoot() {
        return this.isConnected;
    }

    public C48338uNu(@androidx.annotation.NonNull NestedScrollView nestedScrollView, @androidx.annotation.NonNull C53513wms c53513wms, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull C55320xhi c55320xhi, @androidx.annotation.NonNull AppCompatTextView appCompatTextView, @androidx.annotation.NonNull C47988uAv c47988uAv, @androidx.annotation.NonNull C47988uAv c47988uAv2, @androidx.annotation.NonNull C55018xby c55018xby, @androidx.annotation.NonNull C55320xhi c55320xhi2, @androidx.annotation.NonNull C53573wnz c53573wnz, @androidx.annotation.NonNull C53573wnz c53573wnz2, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C53573wnz c53573wnz3) {
        this.isConnected = nestedScrollView;
        this.OLrzqt = c53513wms;
        this.copydefault = barrier;
        this.KWHzl = c55320xhi;
        this.AEQbTJ = appCompatTextView;
        this.EZpvd = c47988uAv;
        this.AYXKKw = c47988uAv2;
        this.AhwBna = c55018xby;
        this.gEmmrt = c55320xhi2;
        this.valueOf = c53573wnz;
        this.djBIcL = c53573wnz2;
        this.fetchVPNInfo = constraintLayout;
        this.DbNXlk = c53573wnz3;
    }

    public static C48338uNu KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C48033uCm.Activity.gGvvIC, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static C48338uNu AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C48033uCm.Application.DCUTEIdCUTEI;
        C53513wms c53513wms = (C53513wms) ViewBindings.findChildViewById(view, i);
        if (c53513wms != null) {
            i = C48033uCm.Application.UscePu;
            Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
            if (barrier != null) {
                i = C48033uCm.Application.OAUGar;
                C55320xhi c55320xhi = (C55320xhi) ViewBindings.findChildViewById(view, i);
                if (c55320xhi != null) {
                    i = C48033uCm.Application.OeZisf;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
                    if (appCompatTextView != null) {
                        i = C48033uCm.Application.ZxnNGp;
                        C47988uAv c47988uAv = (C47988uAv) ViewBindings.findChildViewById(view, i);
                        if (c47988uAv != null) {
                            i = C48033uCm.Application.DhEJvI;
                            C47988uAv c47988uAv2 = (C47988uAv) ViewBindings.findChildViewById(view, i);
                            if (c47988uAv2 != null) {
                                i = C48033uCm.Application.f1065a;
                                C55018xby c55018xby = (C55018xby) ViewBindings.findChildViewById(view, i);
                                if (c55018xby != null) {
                                    i = C48033uCm.Application.onConnected;
                                    C55320xhi c55320xhi2 = (C55320xhi) ViewBindings.findChildViewById(view, i);
                                    if (c55320xhi2 != null) {
                                        i = C48033uCm.Application.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
                                        C53573wnz c53573wnz = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                        if (c53573wnz != null) {
                                            i = C48033uCm.Application.getQueueId;
                                            C53573wnz c53573wnz2 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                            if (c53573wnz2 != null) {
                                                i = C48033uCm.Application.OnBackPressedDispatcherKtaddCallbackcallback1;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = C48033uCm.Application.ActivityResult1;
                                                    C53573wnz c53573wnz3 = (C53573wnz) ViewBindings.findChildViewById(view, i);
                                                    if (c53573wnz3 != null) {
                                                        return new C48338uNu((NestedScrollView) view, c53513wms, barrier, c55320xhi, appCompatTextView, c47988uAv, c47988uAv2, c55018xby, c55320xhi2, c53573wnz, c53573wnz2, constraintLayout, c53573wnz3);
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
