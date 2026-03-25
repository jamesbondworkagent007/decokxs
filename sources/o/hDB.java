package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import o.C23274hvD;

/* JADX INFO: loaded from: classes6.dex */
public final class hDB implements ViewBinding {
    public final ConstraintLayout AEQbTJ;
    public final android.widget.ImageView AYXKKw;
    public final android.widget.LinearLayout AhwBna;
    public final AppCompatImageView AkhnZx;
    public final LinearLayoutCompat AuCTel;
    public final android.widget.TextView AuCTelauCTel;
    public final android.widget.TextView AubY;
    public final android.widget.TextView AxsJAY;
    public final android.widget.ImageView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final C52794wYp KWHzl;
    public final C52794wYp OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final android.widget.ImageView djBIcL;
    public final kLE ejfBZ;
    public final android.widget.ImageView fARcdN;
    public final LinearLayoutCompat fIwbmz;
    public final LinearLayoutCompat fJNWhG;
    public final android.widget.FrameLayout fetchVPNInfo;
    public final android.view.View gEmmrt;
    public final android.widget.TextView getFieldNames;
    public final android.widget.TextView getNewProxyInstance;
    public final android.widget.TextView hDKMBd;
    public final android.widget.ImageView isConnected;
    public final android.widget.TextView iwGUEr;
    public final CardView sSMYrx;
    public final android.widget.TextView uzCIH;
    public final Barrier valueOf;
    public final android.widget.ImageView values;
    public final android.widget.TextView wlaJM;
    public final ConstraintLayout zLjUOn;
    public final C25703jDf zsXlph;
    public final android.widget.Space zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRoot()Landroid/view/View; */
    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public CardView getRoot() {
        return this.sSMYrx;
    }

    public hDB(@androidx.annotation.NonNull CardView cardView, @androidx.annotation.NonNull android.widget.TextView textView, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout, @androidx.annotation.NonNull ConstraintLayout constraintLayout, @androidx.annotation.NonNull C52794wYp c52794wYp, @androidx.annotation.NonNull C52794wYp c52794wYp2, @androidx.annotation.NonNull android.widget.ImageView imageView, @androidx.annotation.NonNull android.widget.LinearLayout linearLayout, @androidx.annotation.NonNull android.widget.ImageView imageView2, @androidx.annotation.NonNull android.view.View view, @androidx.annotation.NonNull Barrier barrier, @androidx.annotation.NonNull android.widget.ImageView imageView3, @androidx.annotation.NonNull AppCompatImageView appCompatImageView, @androidx.annotation.NonNull android.widget.ImageView imageView4, @androidx.annotation.NonNull android.widget.FrameLayout frameLayout2, @androidx.annotation.NonNull android.widget.ImageView imageView5, @androidx.annotation.NonNull kLE kle, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat2, @androidx.annotation.NonNull LinearLayoutCompat linearLayoutCompat3, @androidx.annotation.NonNull android.widget.ImageView imageView6, @androidx.annotation.NonNull android.widget.TextView textView2, @androidx.annotation.NonNull android.widget.TextView textView3, @androidx.annotation.NonNull android.widget.TextView textView4, @androidx.annotation.NonNull android.widget.TextView textView5, @androidx.annotation.NonNull android.widget.TextView textView6, @androidx.annotation.NonNull ConstraintLayout constraintLayout2, @androidx.annotation.NonNull android.widget.TextView textView7, @androidx.annotation.NonNull android.widget.TextView textView8, @androidx.annotation.NonNull C25703jDf c25703jDf, @androidx.annotation.NonNull android.widget.TextView textView9, @androidx.annotation.NonNull android.widget.TextView textView10, @androidx.annotation.NonNull android.widget.Space space) {
        this.sSMYrx = cardView;
        this.EZpvd = textView;
        this.copydefault = frameLayout;
        this.AEQbTJ = constraintLayout;
        this.KWHzl = c52794wYp;
        this.OLrzqt = c52794wYp2;
        this.djBIcL = imageView;
        this.AhwBna = linearLayout;
        this.AYXKKw = imageView2;
        this.gEmmrt = view;
        this.valueOf = barrier;
        this.values = imageView3;
        this.AkhnZx = appCompatImageView;
        this.isConnected = imageView4;
        this.fetchVPNInfo = frameLayout2;
        this.DbNXlk = imageView5;
        this.ejfBZ = kle;
        this.AuCTel = linearLayoutCompat;
        this.fJNWhG = linearLayoutCompat2;
        this.fIwbmz = linearLayoutCompat3;
        this.fARcdN = imageView6;
        this.uzCIH = textView2;
        this.getNewProxyInstance = textView3;
        this.hDKMBd = textView4;
        this.iwGUEr = textView5;
        this.getFieldNames = textView6;
        this.zLjUOn = constraintLayout2;
        this.wlaJM = textView7;
        this.AubY = textView8;
        this.zsXlph = c25703jDf;
        this.AuCTelauCTel = textView9;
        this.AxsJAY = textView10;
        this.zuBGHE = space;
    }

    public static hDB copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        android.view.View viewInflate = layoutInflater.inflate(C23274hvD.Activity.glVQsU, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return EZpvd(viewInflate);
    }

    public static hDB EZpvd(@androidx.annotation.NonNull android.view.View view) {
        android.view.View viewFindChildViewById;
        int i = C23274hvD.Application.OLrzqt;
        android.widget.TextView textView = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = C23274hvD.Application.KWHzl;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = C23274hvD.Application.dUDNAs;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = C23274hvD.Application.QXDzTk;
                    C52794wYp c52794wYp = (C52794wYp) ViewBindings.findChildViewById(view, i);
                    if (c52794wYp != null) {
                        i = C23274hvD.Application.akftKQ;
                        C52794wYp c52794wYp2 = (C52794wYp) ViewBindings.findChildViewById(view, i);
                        if (c52794wYp2 != null) {
                            i = C23274hvD.Application.RvdRAu;
                            android.widget.ImageView imageView = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = C23274hvD.Application.FQMcgEfQMcgE;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = C23274hvD.Application.clearRegistrations;
                                    android.widget.ImageView imageView2 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = C23274hvD.Application.hGuIrQ))) != null) {
                                        i = C23274hvD.Application.Qsauvs;
                                        Barrier barrier = (Barrier) ViewBindings.findChildViewById(view, i);
                                        if (barrier != null) {
                                            i = C23274hvD.Application.HJWChPfrwjPh;
                                            android.widget.ImageView imageView3 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = C23274hvD.Application.HJWChPfvRMlC;
                                                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                if (appCompatImageView != null) {
                                                    i = C23274hvD.Application.haRtnV;
                                                    android.widget.ImageView imageView4 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView4 != null) {
                                                        i = C23274hvD.Application.DtA;
                                                        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) ViewBindings.findChildViewById(view, i);
                                                        if (frameLayout2 != null) {
                                                            i = C23274hvD.Application.sYOsaF;
                                                            android.widget.ImageView imageView5 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView5 != null) {
                                                                i = C23274hvD.Application.getRating;
                                                                kLE kle = (kLE) ViewBindings.findChildViewById(view, i);
                                                                if (kle != null) {
                                                                    i = C23274hvD.Application.getMediaController;
                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayoutCompat != null) {
                                                                        i = C23274hvD.Application.getSessionToken2Bundle;
                                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                        if (linearLayoutCompat2 != null) {
                                                                            i = C23274hvD.Application.MediaControllerCompatTransportControls;
                                                                            LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayoutCompat3 != null) {
                                                                                i = C23274hvD.Application.PlaybackStateCompat;
                                                                                android.widget.ImageView imageView6 = (android.widget.ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView6 != null) {
                                                                                    i = C23274hvD.Application.IResultReceiver2;
                                                                                    android.widget.TextView textView2 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView2 != null) {
                                                                                        i = C23274hvD.Application.IResultReceiver2Default;
                                                                                        android.widget.TextView textView3 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView3 != null) {
                                                                                            i = C23274hvD.Application.IResultReceiverStubProxy;
                                                                                            android.widget.TextView textView4 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView4 != null) {
                                                                                                i = C23274hvD.Application.IResultReceiver_Parcel;
                                                                                                android.widget.TextView textView5 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView5 != null) {
                                                                                                    i = C23274hvD.Application.ResultReceiver1;
                                                                                                    android.widget.TextView textView6 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView6 != null) {
                                                                                                        i = C23274hvD.Application.IResultReceiver2StubProxy;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = C23274hvD.Application.IResultReceiver2_Parcel;
                                                                                                            android.widget.TextView textView7 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView7 != null) {
                                                                                                                i = C23274hvD.Application.viewModelsdefault;
                                                                                                                android.widget.TextView textView8 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView8 != null) {
                                                                                                                    i = C23274hvD.Application.ResultReceiverMyRunnable;
                                                                                                                    C25703jDf c25703jDf = (C25703jDf) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (c25703jDf != null) {
                                                                                                                        i = C23274hvD.Application.ActivityViewModelLazyKt;
                                                                                                                        android.widget.TextView textView9 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = C23274hvD.Application.ActivityViewModelLazyKtviewModels4;
                                                                                                                            android.widget.TextView textView10 = (android.widget.TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = C23274hvD.Application.AnimatorRes;
                                                                                                                                android.widget.Space space = (android.widget.Space) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (space != null) {
                                                                                                                                    return new hDB((CardView) view, textView, frameLayout, constraintLayout, c52794wYp, c52794wYp2, imageView, linearLayout, imageView2, viewFindChildViewById, barrier, imageView3, appCompatImageView, imageView4, frameLayout2, imageView5, kle, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, imageView6, textView2, textView3, textView4, textView5, textView6, constraintLayout2, textView7, textView8, c25703jDf, textView9, textView10, space);
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
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
