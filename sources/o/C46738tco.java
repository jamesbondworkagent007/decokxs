package o;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.lite.home.bean.ProductMatrixSource;
import com.okinc.okmarket.ui.market.CrSwitchMarketFragment$changeErrorState$1$1;
import com.okinc.okmarket.ui.market.CrSwitchMarketFragment$initTradeFillContent$1;
import com.okinc.okmarket.ui.market.CrSwitchMarketFragment$showNewMarket$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.AbstractC33244msm;
import o.InterfaceC54581xNr;
import o.qZH;
import o.sxH;
import o.sxI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tco, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46738tco extends C46699tcB {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public Job copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.tcp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46738tco.OLrzqt(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.tcq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46738tco.copydefault(this.AEQbTJ);
        }
    });
    public final FragmentManager.FragmentLifecycleCallbacks AEQbTJ = new ActionBar();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C46699tcB, o.AbstractC32996moC
    public int getLayoutId() {
        return qZH.ActionBar.AYXKKw;
    }

    /* JADX INFO: renamed from: o.tco$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tco.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public C46738tco() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C46701tcD.class), new Function0<ViewModelStore>() { // from class: com.okinc.okmarket.ui.market.CrSwitchMarketFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.okmarket.ui.market.CrSwitchMarketFragment$special$$inlined$activityViewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okmarket.ui.market.CrSwitchMarketFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final qZK copydefault() {
        return (qZK) this.EZpvd.getValue();
    }

    public static final qZK OLrzqt(C46738tco c46738tco) {
        qZK qzkAEQbTJ = qZK.AEQbTJ(c46738tco.requireView());
        Intrinsics.checkNotNullExpressionValue(qzkAEQbTJ, "");
        return qzkAEQbTJ;
    }

    public final C46701tcD OLrzqt() {
        return (C46701tcD) this.djBIcL.getValue();
    }

    @Override // o.C46699tcB
    public AbstractC32998moE KWHzl() {
        return (AbstractC32998moE) this.KWHzl.getValue();
    }

    public static final AbstractC32998moE copydefault(C46738tco c46738tco) {
        if ((C34703nhO.AEQbTJ() && c46738tco.OLrzqt().OLrzqt()) || c46738tco.OLrzqt().KWHzl()) {
            return new kEX();
        }
        return new kEW();
    }

    @Override // o.C46699tcB
    public void EZpvd() {
        Job job = this.copydefault;
        if (job == null || !job.isActive()) {
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CrSwitchMarketFragment$showNewMarket$1(this, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: o.tco$ActionBar */
    public static final class ActionBar extends FragmentManager.FragmentLifecycleCallbacks {
        public ActionBar() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentResumed(fragmentManager, fragment);
            if (Intrinsics.EZpvd(fragment, C46738tco.this.KWHzl())) {
                C46738tco.this.EZpvd(false);
                C46738tco.this.getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this);
            }
        }
    }

    @Override // o.C46699tcB, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        copydefault().AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.tcn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C46738tco.OLrzqt(this.AEQbTJ, view2);
            }
        });
        if (!OLrzqt().OLrzqt() && !OLrzqt().KWHzl()) {
            copydefault(true);
        } else {
            copydefault(false);
        }
    }

    public static final void OLrzqt(C46738tco c46738tco, android.view.View view) {
        sxI sxi = (sxI) C43251rlk.copydefault(sxI.class);
        android.content.Context contextRequireContext = c46738tco.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        sxI.ActionBar.goToCRSearch$default(sxi, contextRequireContext, AbstractC33244msm.ActionBar.KWHzl.EZpvd(), sxH.ActionBar.OLrzqt, false, 8, null);
    }

    public final void copydefault(boolean z) {
        android.widget.FrameLayout frameLayout = copydefault().valueOf;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        copydefault().getRoot().setPadding(0, C33570myu.OLrzqt(), 0, 0);
        android.content.Context context = getContext();
        if (context != null) {
            android.view.View viewKWHzl = ((svI) C43251rlk.copydefault(svI.class)).KWHzl(context, ProductMatrixSource.SimpleDiscover);
            copydefault().copydefault.setVisibility(8);
            copydefault().copydefault.addView(viewKWHzl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        CrSwitchMarketFragment$initTradeFillContent$1 crSwitchMarketFragment$initTradeFillContent$1;
        C46738tco c46738tco;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof CrSwitchMarketFragment$initTradeFillContent$1) {
            crSwitchMarketFragment$initTradeFillContent$1 = (CrSwitchMarketFragment$initTradeFillContent$1) continuation;
            int i = crSwitchMarketFragment$initTradeFillContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                crSwitchMarketFragment$initTradeFillContent$1.label = i - Integer.MIN_VALUE;
            } else {
                crSwitchMarketFragment$initTradeFillContent$1 = new CrSwitchMarketFragment$initTradeFillContent$1(this, continuation);
            }
        }
        java.lang.Object obj = crSwitchMarketFragment$initTradeFillContent$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = crSwitchMarketFragment$initTradeFillContent$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            EZpvd(false);
            try {
                Result.Application application = Result.Companion;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                if (interfaceC54581xNrOLrzqt == null || !InterfaceC54581xNr.TaskDescription.isInit$default(interfaceC54581xNrOLrzqt, null, 1, null)) {
                    InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
                    crSwitchMarketFragment$initTradeFillContent$1.L$0 = this;
                    crSwitchMarketFragment$initTradeFillContent$1.label = 1;
                    if (C55608xnE.AEQbTJ(interfaceC54577xNnKWHzl, this, crSwitchMarketFragment$initTradeFillContent$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                c46738tco = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c46738tco = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c46738tco = (C46738tco) crSwitchMarketFragment$initTradeFillContent$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(c46738tco.getTAG(), "showNewMarket", thM7380exceptionOrNullimpl);
            try {
                Result.Application application3 = Result.Companion;
                c46738tco.EZpvd(true);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th3) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46738tco, false, (java.lang.String) null, 2, (java.lang.Object) null);
        }
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            try {
                Result.Application application5 = Result.Companion;
                if (c46738tco.getContext() != null) {
                    try {
                        c46738tco.getChildFragmentManager().beginTransaction().replace(qZH.StateListAnimator.isReflectionWorking, c46738tco.KWHzl(), c46738tco.KWHzl().getClass().getSimpleName()).commitAllowingStateLoss();
                        if (c46738tco.isVisibled()) {
                            c46738tco.KWHzl().setUserVisibleHint(true);
                            c46738tco.KWHzl().onVisible();
                        }
                        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46738tco, true, (java.lang.String) null, 2, (java.lang.Object) null);
                    } catch (java.lang.Exception e) {
                        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c46738tco, false, (java.lang.String) null, 2, (java.lang.Object) null);
                        pUU.AEQbTJ(c46738tco.getTAG(), "show new market", e);
                    }
                    c46738tco.getChildFragmentManager().registerFragmentLifecycleCallbacks(c46738tco.AEQbTJ, true);
                    c46738tco.KWHzl(true);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th4) {
                Result.Application application6 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
            }
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        if (isResumed()) {
            android.widget.FrameLayout frameLayout = copydefault().EZpvd;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(z ? 0 : 8);
            AEQbTJ(false);
            if (z) {
                copydefault().KWHzl.setEmptyTypeImage(8);
                copydefault().KWHzl.setTitle(C33070mpX.AYXKKw(qZH.PendingIntent.DsL));
                copydefault().KWHzl.setRetry(C33070mpX.AYXKKw(qZH.PendingIntent.fetchVPNInfo));
                copydefault().KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.tcr
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C46738tco.EZpvd(this.copydefault, view);
                    }
                });
            }
        }
    }

    public static final void EZpvd(C46738tco c46738tco, android.view.View view) {
        c46738tco.OLrzqt(false);
        c46738tco.EZpvd(false);
        c46738tco.AEQbTJ(true);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(c46738tco), null, null, new CrSwitchMarketFragment$changeErrorState$1$1(c46738tco, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this.AEQbTJ);
    }
}
