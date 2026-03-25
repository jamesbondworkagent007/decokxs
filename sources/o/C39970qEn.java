package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ViewKt;
import com.bumptech.glide.Glide;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.market.ext.UpDownColor;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qEn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39970qEn extends AbstractC39964qEh<C39999qFp, C42945rfw> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42945rfw AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42945rfw c42945rfwCopydefault = C42945rfw.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42945rfwCopydefault, "");
        return c42945rfwCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(@NotNull final C42945rfw c42945rfw, int i, @NotNull final C39999qFp c39999qFp) {
        Intrinsics.checkNotNullParameter(c42945rfw, "");
        Intrinsics.checkNotNullParameter(c39999qFp, "");
        android.widget.ImageView imageView = c42945rfw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        C33054mpH.EZpvd(imageView, C55297xhL.KWHzl(c39999qFp.copydefault(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null)), C52761wXj.TaskDescription.aHXSQp);
        android.widget.ImageView imageView2 = c42945rfw.AEQbTJ;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView2);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
        java.lang.String strKWHzl = C55297xhL.KWHzl(c39999qFp.gEmmrt(), C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null));
        if (strKWHzl == null) {
            strKWHzl = "";
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, strKWHzl, "lfit", C55298xhM.dp2px$default(32.0f, null, 1, null), C55298xhM.dp2px$default(32.0f, null, 1, null)).EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView2.getContext(), 0.5f, C33070mpX.copydefault(C52761wXj.Activity.EZpvd), false, 8, null)).KWHzl(C52761wXj.TaskDescription.aHXSQp).EZpvd(imageView2);
        C42950rgA c42950rgA = c42945rfw.OLrzqt;
        boolean verified = c39999qFp.valueOf().getVerified();
        java.lang.String strOLrzqt = c39999qFp.OLrzqt();
        java.lang.String strKWHzl2 = c39999qFp.KWHzl();
        java.lang.CharSequence charSequenceEZpvd = c39999qFp.EZpvd();
        int color = c42945rfw.getRoot().getContext().getColor(C52761wXj.Activity.zuBGHE);
        android.content.Context context = c42945rfw.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.CharSequence charSequenceCopydefault = qIP.copydefault(charSequenceEZpvd, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, color, context);
        java.lang.String strAYXKKw = c39999qFp.AYXKKw();
        if (strAYXKKw == null) {
            strAYXKKw = "--";
        }
        java.lang.String str = strAYXKKw;
        java.lang.String strDjBIcL = c39999qFp.djBIcL();
        UpDownColor upDownColorAhwBna = c39999qFp.AhwBna();
        java.lang.String strAEQbTJ = AEQbTJ();
        int iDjBIcL = C33570myu.djBIcL(c42945rfw.OLrzqt.getContext());
        int iDpInt$default = C55298xhM.dpInt$default(48, (android.content.Context) null, 1, (java.lang.Object) null);
        int iDpInt$default2 = C55298xhM.dpInt$default(32, (android.content.Context) null, 1, (java.lang.Object) null);
        c42950rgA.setData$OKMarket_market_impl(verified, strOLrzqt, strKWHzl2, charSequenceCopydefault, str, strDjBIcL, upDownColorAhwBna, strAEQbTJ, ((iDjBIcL - iDpInt$default) - iDpInt$default2) - C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null), Intrinsics.EZpvd(c39999qFp.valueOf().getCedefiSupport(), java.lang.Boolean.TRUE), C59449zhJ.gEmmrt(c39999qFp.valueOf().getTokenContractAddress(), AEQbTJ(), true), c39999qFp.valueOf().getBoosted(), c39999qFp.valueOf().getBoostRate(), new Function1() { // from class: o.qEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39970qEn.AEQbTJ(c42945rfw, c39999qFp, (java.lang.String) obj);
            }
        });
        ConstraintLayout root = c42945rfw.getRoot();
        root.setOnClickListener(new Activity(root, 1000L, c42945rfw, c39999qFp, i));
    }

    public static final Unit AEQbTJ(C42945rfw c42945rfw, C39999qFp c39999qFp, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "click_tag_icon")) {
            ConstraintLayout root = c42945rfw.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            qHN qhnOLrzqt = qHO.OLrzqt(root);
            if (qhnOLrzqt != null) {
                java.lang.String tokenContractAddress = c39999qFp.valueOf().getTokenContractAddress();
                if (tokenContractAddress == null) {
                    tokenContractAddress = "";
                }
                java.lang.String tokenSymbol = c39999qFp.valueOf().getTokenSymbol();
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
                java.lang.String chainName = c39999qFp.valueOf().getChainName();
                qhnOLrzqt.EZpvd(tokenContractAddress, tokenSymbol, chainName != null ? chainName : "");
            }
        } else {
            ConstraintLayout root2 = c42945rfw.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            qHN qhnOLrzqt2 = qHO.OLrzqt(root2);
            if (qhnOLrzqt2 != null) {
                java.lang.String tokenContractAddress2 = c39999qFp.valueOf().getTokenContractAddress();
                if (tokenContractAddress2 == null) {
                    tokenContractAddress2 = "";
                }
                java.lang.String tokenSymbol2 = c39999qFp.valueOf().getTokenSymbol();
                if (tokenSymbol2 == null) {
                    tokenSymbol2 = "";
                }
                java.lang.String chainName2 = c39999qFp.valueOf().getChainName();
                qhnOLrzqt2.AEQbTJ(tokenContractAddress2, tokenSymbol2, chainName2 != null ? chainName2 : "");
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qEn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C39999qFp OLrzqt;
        public final /* synthetic */ C42945rfw copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42945rfw c42945rfw, C39999qFp c39999qFp, int i) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c42945rfw;
            this.OLrzqt = c39999qFp;
            this.EZpvd = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.Object objM7377constructorimpl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ConstraintLayout root = this.copydefault.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                try {
                    Result.Application application = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(root));
                } catch (java.lang.Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                    objM7377constructorimpl = null;
                }
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
                if (fragment != null) {
                    boolean z = fragment instanceof qHM;
                    java.lang.Object obj = fragment;
                    if (!z) {
                        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                        while (parentFragment != null && !(parentFragment instanceof qHM)) {
                            parentFragment = parentFragment.getParentFragment();
                        }
                        obj = (qHM) (parentFragment instanceof qHM ? parentFragment : null);
                    }
                    qHM qhm = (qHM) obj;
                    if (qhm != null) {
                        qhm.EZpvd(this.OLrzqt.valueOf(), this.EZpvd);
                    }
                }
            }
        }
    }
}
