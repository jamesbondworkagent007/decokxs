package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hAV implements ViewBinding {
    public final LottieAnimationView AEQbTJ;
    public final C55113xdn AYXKKw;
    public final LinearLayoutCompat AhwBna;
    public final C33546myW AkhnZx;
    public final RecyclerView DbNXlk;
    public final C25455iwz EZpvd;
    public final C54989xbV KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final C55173xeu copydefault;
    public final LinearLayoutCompat djBIcL;
    public final ConstraintLayout gEmmrt;
    public final C33603mza isConnected;
    public final android.widget.ImageView valueOf;
    public final C33604mzb values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.gEmmrt;
    }

    public hAV(@androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull LottieAnimationView lottieAnimationView, @androidx.annotation.NonNull C55173xeu c55173xeu, @androidx.annotation.NonNull C54989xbV c54989xbV, @androidx.annotation.NonNull C25455iwz c25455iwz, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull C55113xdn c55113xdn, @androidx.annotation.NonNull C33604mzb c33604mzb, @androidx.annotation.NonNull C33603mza c33603mza, @androidx.annotation.NonNull RecyclerView recyclerView, @androidx.annotation.NonNull C33546myW c33546myW) {
        this.gEmmrt = constraintLayout;
        this.AEQbTJ = lottieAnimationView;
        this.copydefault = c55173xeu;
        this.KWHzl = c54989xbV;
        this.EZpvd = c25455iwz;
        this.OLrzqt = imageView;
        this.valueOf = imageView2;
        this.AhwBna = linearLayoutCompat;
        this.djBIcL = linearLayoutCompat2;
        this.AYXKKw = c55113xdn;
        this.values = c33604mzb;
        this.isConnected = c33603mza;
        this.DbNXlk = recyclerView;
        this.AkhnZx = c33546myW;
    }

    public static hAV copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.DUUtXg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return AEQbTJ(viewInflate);
    }

    public static hAV AEQbTJ(@androidx.annotation.NonNull android.view.View view) {
        int i = C23274hvD.Application.finit;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) ViewBindings.findChildViewById(view, i);
        if (lottieAnimationView != null) {
            i = C23274hvD.Application.QOjuYg;
            C55173xeu c55173xeu = (C55173xeu) ViewBindings.findChildViewById(view, i);
            if (c55173xeu != null) {
                i = C23274hvD.Application.HJWChPiaHEvk;
                C54989xbV c54989xbV = (C54989xbV) ViewBindings.findChildViewById(view, i);
                if (c54989xbV != null) {
                    i = C23274hvD.Application.nriSR;
                    C25455iwz c25455iwz = (C25455iwz) ViewBindings.findChildViewById(view, i);
                    if (c25455iwz != null) {
                        i = C23274hvD.Application.hijVBL;
                        android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = C23274hvD.Application.INotificationSideChannelStubProxy;
                            android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = C23274hvD.Application.getRepeatMode;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = C23274hvD.Application.playFromUri;
                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat2 != null) {
                                        i = C23274hvD.Application.MediaControllerCompatApi24TransportControls;
                                        C55113xdn c55113xdn = (C55113xdn) ViewBindings.findChildViewById(view, i);
                                        if (c55113xdn != null) {
                                            i = C23274hvD.Application.saveState;
                                            C33604mzb c33604mzb = (C33604mzb) ViewBindings.findChildViewById(view, i);
                                            if (c33604mzb != null) {
                                                i = C23274hvD.Application.ComponentActivityReportFullyDrawnExecutor;
                                                C33603mza c33603mza = (C33603mza) ViewBindings.findChildViewById(view, i);
                                                if (c33603mza != null) {
                                                    i = C23274hvD.Application.FullyDrawnReporterKt;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                    if (recyclerView != null) {
                                                        i = C23274hvD.Application.ActivityResultLauncherHolder;
                                                        C33546myW c33546myW = (C33546myW) ViewBindings.findChildViewById(view, i);
                                                        if (c33546myW != null) {
                                                            return new hAV((ConstraintLayout) view, lottieAnimationView, c55173xeu, c54989xbV, c25455iwz, imageView, imageView2, linearLayoutCompat, linearLayoutCompat2, c55113xdn, c33604mzb, c33603mza, recyclerView, c33546myW);
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
