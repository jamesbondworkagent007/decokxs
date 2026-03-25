package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.ViewKt;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.search.features.navigation.root.ui.NavSearchRootFragment;
import com.okinc.rxutils.RxBus;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import o.rTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qJE extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public android.widget.ImageView EZpvd;
    public C52794wYp KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.invokespecialDaTmkG;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qJE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final qJE copydefault() {
            android.os.Bundle bundle = new android.os.Bundle();
            qJE qje = new qJE();
            qje.setArguments(bundle);
            return qje;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = (C52794wYp) view.findViewById(qZH.StateListAnimator.DDDCac);
        this.EZpvd = (android.widget.ImageView) view.findViewById(qZH.StateListAnimator.fhUrPt);
        if (C33492mxV.OLrzqt()) {
            android.widget.ImageView imageView = this.EZpvd;
            if (imageView != null) {
                C33054mpH.AEQbTJ(imageView, C27992kKx.copydefault.EZpvd("derivative_guide_dark.webp"));
            }
        } else {
            android.widget.ImageView imageView2 = this.EZpvd;
            if (imageView2 != null) {
                C33054mpH.AEQbTJ(imageView2, C27992kKx.copydefault.EZpvd("derivative_guide.webp"));
            }
        }
        C52794wYp c52794wYp = this.KWHzl;
        if (c52794wYp != null) {
            c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.qJI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    qJE.AEQbTJ(this.OLrzqt, view2);
                }
            });
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(final qJE qje, android.view.View view) {
        qje.showLoadingAtOnce();
        rTU rtu = (rTU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(rTU.class));
        if (rtu != null) {
            FragmentActivity fragmentActivityRequireActivity = qje.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            rTU.Application.checkDerivativesQuestion$default(rtu, fragmentActivityRequireActivity, null, OKComplianceRestrictionService.Feature.HIDE_DERIVATIVES_SURVEY_ENTRY.getCode(), new Function1() { // from class: o.qJF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qJE.OLrzqt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            }, new Function1() { // from class: o.qJH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qJE.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            }, new Function1() { // from class: o.qJK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return qJE.AEQbTJ(this.KWHzl, (java.lang.String) obj);
                }
            }, 2, null);
        }
    }

    public static final Unit OLrzqt(qJE qje, boolean z) {
        qje.dismissLoading();
        qje.copydefault();
        RxBus.KWHzl("close_search");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(qJE qje, int i) {
        qje.copydefault();
        RxBus.KWHzl("close_search");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(qJE qje, java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        qje.dismissLoading();
        qje.copydefault();
        RxBus.KWHzl("close_search");
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        java.lang.Object objM7377constructorimpl;
        android.view.View view = getView();
        if (view != null) {
            try {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(ViewKt.findFragment(view));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) objM7377constructorimpl;
            if (fragment != null) {
                if (!(fragment instanceof NavSearchRootFragment)) {
                    androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof NavSearchRootFragment)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    fragment = (NavSearchRootFragment) (parentFragment instanceof NavSearchRootFragment ? parentFragment : null);
                }
                NavSearchRootFragment navSearchRootFragment = (NavSearchRootFragment) fragment;
                if (navSearchRootFragment != null) {
                    navSearchRootFragment.dismissAllowingStateLoss();
                }
            }
        }
    }
}
