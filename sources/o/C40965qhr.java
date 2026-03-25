package o;

import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.api.bean.KlineEventCalendarEntity;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$addCalendarEvent$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$deleteCalendarEvent$1;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$setupView$2$4;
import com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.model.MarketDiscoverOverviewTradeCalendarVo;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qhr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40965qhr extends wXX {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public ActivityResultLauncher<java.lang.String[]> KWHzl;
    public C42685rbA copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.qhs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40965qhr.gEmmrt(this.KWHzl);
        }
    });
    public java.lang.String AEQbTJ = "";
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.qhq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C40965qhr.values();
        }
    });
    public java.lang.String valueOf = "";

    public C40965qhr() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(pGZ.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.discover.features.markets.sub.overview.ui.fragment.sub.tradingcalendar.ui.fragment.MarketOverallCalendarEconomicDialogFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: o.qhr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qhr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C40965qhr AEQbTJ(@NotNull MarketDiscoverOverviewTradeCalendarVo.EconomicVo economicVo) {
            Intrinsics.checkNotNullParameter(economicVo, "");
            C40965qhr c40965qhr = new C40965qhr();
            C6779aVn.copydefault(c40965qhr).putParcelable(MarketDiscoverOverviewTradeCalendarVo.EconomicVo.class.getName(), economicVo);
            return c40965qhr;
        }
    }

    public final MarketDiscoverOverviewTradeCalendarVo.EconomicVo gEmmrt() {
        return (MarketDiscoverOverviewTradeCalendarVo.EconomicVo) this.OLrzqt.getValue();
    }

    public static final MarketDiscoverOverviewTradeCalendarVo.EconomicVo gEmmrt(C40965qhr c40965qhr) {
        MarketDiscoverOverviewTradeCalendarVo.EconomicVo economicVo = (MarketDiscoverOverviewTradeCalendarVo.EconomicVo) c40965qhr.requireArguments().getParcelable(MarketDiscoverOverviewTradeCalendarVo.EconomicVo.class.getName());
        return economicVo == null ? new MarketDiscoverOverviewTradeCalendarVo.EconomicVo(null, null, null, null, null, null, null, null, false, 0L, 1023, null) : economicVo;
    }

    private final InterfaceC48893ueK isConnected() {
        return (InterfaceC48893ueK) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC48893ueK values() {
        return (InterfaceC48893ueK) C43251rlk.OLrzqt(InterfaceC48893ueK.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pGZ fetchVPNInfo() {
        return (pGZ) this.djBIcL.getValue();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        android.view.View viewFindViewById = wxq.findViewById(C52761wXj.FragmentManager.DNMMPQ);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(qZH.PendingIntent.aVhqwO));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C42685rbA.AEQbTJ(getCustomLayoutInflater(), constraintLayout, true);
        AkhnZx();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void AkhnZx() {
        C42685rbA c42685rbA = this.copydefault;
        if (c42685rbA != null) {
            c42685rbA.AEQbTJ.setImageResource(C52761wXj.TaskDescription.ihnvzI);
            c42685rbA.DbNXlk.setText(gEmmrt().djBIcL());
            c42685rbA.OLrzqt.setText(gEmmrt().OLrzqt());
            c42685rbA.AYXKKw.setText(gEmmrt().AYXKKw());
            c42685rbA.copydefault.setText(gEmmrt().copydefault());
            c42685rbA.AhwBna.setText(AEQbTJ(gEmmrt().AhwBna()));
        }
        if (getContext() != null) {
            this.AEQbTJ = fetchVPNInfo().AEQbTJ(C55608xnE.OLrzqt());
            this.KWHzl = pDY.copydefault.copydefault(this, new Function0() { // from class: o.qhA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40965qhr.isConnected(this.OLrzqt);
                }
            }, new Function0() { // from class: o.qhB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40965qhr.AEQbTJ();
                }
            }, new Function0() { // from class: o.qhp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40965qhr.values(this.AEQbTJ);
                }
            });
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new MarketOverallCalendarEconomicDialogFragment$setupView$2$4(this, null));
        }
    }

    public static final Unit isConnected(C40965qhr c40965qhr) {
        c40965qhr.AhwBna();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ() {
        return Unit.INSTANCE;
    }

    public static final Unit values(C40965qhr c40965qhr) {
        c40965qhr.DbNXlk();
        return Unit.INSTANCE;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        java.lang.String str2 = new SimpleDateFormat("MM/dd, HH:mm", java.util.Locale.getDefault()).format(new Date(C33129mqd.valueOf(str)));
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    public final void KWHzl(C42685rbA c42685rbA) {
        pGS pgs = c42685rbA.valueOf;
        Intrinsics.copydefault(pgs);
        pgs.setVisibility(C33129mqd.valueOf(gEmmrt().AhwBna()) > java.lang.System.currentTimeMillis() ? 0 : 8);
        if (pgs.getVisibility() == 0) {
            pgs.setOnClickListener(new ActionBar(pgs, 1000L, this));
            pgs.EZpvd(gEmmrt().gEmmrt(), C33492mxV.OLrzqt());
        }
    }

    public final void OLrzqt() {
        if (gEmmrt().gEmmrt()) {
            AYXKKw();
        } else {
            djBIcL();
        }
    }

    public final void AYXKKw() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.KWHzl(activity, new Function0() { // from class: o.qht
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40965qhr.AkhnZx(this.copydefault);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.qhr$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C40965qhr AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C40965qhr c40965qhr) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c40965qhr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.OLrzqt();
            }
        }
    }

    public static final Unit AkhnZx(C40965qhr c40965qhr) {
        c40965qhr.valueOf();
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketOverallCalendarEconomicDialogFragment$deleteCalendarEvent$1(this, null), 3, null);
    }

    public final void EZpvd(boolean z) {
        gEmmrt().copydefault(z);
        C42685rbA c42685rbA = this.copydefault;
        if (c42685rbA != null) {
            KWHzl(c42685rbA);
        }
    }

    public final void djBIcL() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            pDY pdy = pDY.copydefault;
            if (pdy.AEQbTJ(activity)) {
                AhwBna();
                return;
            }
            ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.KWHzl;
            if (activityResultLauncher != null) {
                pdy.copydefault(this, activityResultLauncher);
            }
        }
    }

    public final void AhwBna() {
        AbstractC58185ywX<C48887ueE> abstractC58185ywXAEQbTJ;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        if (this.valueOf.length() == 0) {
            InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
            if (interfaceC48893ueKIsConnected == null || (abstractC58185ywXAEQbTJ = interfaceC48893ueKIsConnected.AEQbTJ("https://www.okx.com/", new C48891ueI("market_calendar", this.AEQbTJ, false, null, null, 28, null))) == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXAEQbTJ, this)) == null) {
                return;
            }
            final Function1 function1 = new Function1() { // from class: o.qhw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40965qhr.copydefault(this.AEQbTJ, (C48887ueE) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.qhy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40965qhr.AEQbTJ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.qhu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C40965qhr.copydefault(this.copydefault, (java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.qhv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C40965qhr.KWHzl(function12, obj);
                }
            });
            return;
        }
        copydefault();
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C40965qhr c40965qhr, C48887ueE c48887ueE) {
        c40965qhr.valueOf = c48887ueE.OLrzqt();
        c40965qhr.copydefault();
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C40965qhr c40965qhr, java.lang.Throwable th) {
        c40965qhr.copydefault();
        C41298qoF.e$default(C41298qoF.AEQbTJ, "MarketOverallCalendarEconomicDialogFragment", "createShortLink error: " + th.getMessage(), null, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketOverallCalendarEconomicDialogFragment$addCalendarEvent$1(this, null), 3, null);
    }

    private final void DbNXlk() {
        final FragmentActivity activity = getActivity();
        if (activity != null) {
            pDB.OLrzqt.AEQbTJ(activity, new Function0() { // from class: o.qhx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C40965qhr.EZpvd(activity);
                }
            });
        }
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity) {
        pDY.copydefault.KWHzl(fragmentActivity);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ActivityResultLauncher<java.lang.String[]> activityResultLauncher = this.KWHzl;
        if (activityResultLauncher != null) {
            pDY.copydefault.EZpvd(activityResultLauncher);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        MarketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1 marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1;
        C40965qhr c40965qhr;
        if (continuation instanceof MarketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1) {
            marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1 = (MarketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1) continuation;
            int i = marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1 = new MarketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            if (C33129mqd.valueOf(gEmmrt().AhwBna()) > java.lang.System.currentTimeMillis()) {
                pGZ pgzFetchVPNInfo = fetchVPNInfo();
                java.lang.String strAEQbTJ = gEmmrt().AEQbTJ();
                marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.L$0 = this;
                marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.label = 1;
                objEZpvd = pgzFetchVPNInfo.EZpvd(strAEQbTJ, marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c40965qhr = this;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c40965qhr = (C40965qhr) marketOverallCalendarEconomicDialogFragment$dealWithCalendarEventStatus$1.L$0;
        C56391yDq.AEQbTJ(objEZpvd);
        KlineEventCalendarEntity klineEventCalendarEntity = (KlineEventCalendarEntity) objEZpvd;
        if (klineEventCalendarEntity != null) {
            c40965qhr.gEmmrt().copydefault(klineEventCalendarEntity.getEventId() > -1);
            c40965qhr.gEmmrt().AEQbTJ(klineEventCalendarEntity.getEventId());
        } else {
            c40965qhr.gEmmrt().copydefault(false);
            c40965qhr.gEmmrt().AEQbTJ(-1L);
        }
        return Unit.INSTANCE;
    }
}
