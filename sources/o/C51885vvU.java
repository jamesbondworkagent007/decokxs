package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadPendingSignalBotPresenter;
import com.okinc.unify_trade.biz.SignalBotSummaryBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51885vvU extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public uZD AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public uZY KWHzl;

    public C51885vvU() {
        final Function0 function0 = new Function0() { // from class: o.vwb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51885vvU.EZpvd(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.manager.fragment.signalbot.SignalBotLeadDataDialogFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotLeadPendingSignalBotPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.manager.fragment.signalbot.SignalBotLeadDataDialogFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.manager.fragment.signalbot.SignalBotLeadDataDialogFragment$special$$inlined$viewModels$default$3
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.userpage.manager.fragment.signalbot.SignalBotLeadDataDialogFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final ViewModelStoreOwner EZpvd(C51885vvU c51885vvU) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c51885vvU.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final BotLeadPendingSignalBotPresenter AEQbTJ() {
        return (BotLeadPendingSignalBotPresenter) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.vvU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C51885vvU KWHzl() {
            C51885vvU c51885vvU = new C51885vvU();
            c51885vvU.setArguments(new android.os.Bundle());
            return c51885vvU;
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        uZY uzyEZpvd = uZY.EZpvd(android.view.LayoutInflater.from(getContext()), c52781wYc, true);
        this.KWHzl = uzyEZpvd;
        if (uzyEZpvd != null) {
            uzyEZpvd.KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.isElapsedRealtimeNanosAvailable));
            android.widget.ImageView imageView = uzyEZpvd.OLrzqt;
            imageView.setOnClickListener(new Activity(imageView, 1000L, this));
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        this.AEQbTJ = uZD.KWHzl(android.view.LayoutInflater.from(getContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt();
        copydefault();
        KWHzl();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void OLrzqt() {
        uZD uzd;
        SignalBotSummaryBean value = AEQbTJ().copydefault().getValue();
        if (value == null || (uzd = this.AEQbTJ) == null) {
            return;
        }
        final C51959vwp c51959vwp = uzd.fetchVPNInfo;
        int i = C55688xof.Application.onPlayFromUri;
        java.lang.String ccy = value.getCcy();
        if (ccy == null) {
            ccy = "";
        }
        c51959vwp.setTitleClick(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))), new Function0() { // from class: o.vvZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51885vvU.valueOf(c51959vwp);
            }
        });
        java.lang.String accumulatedProfitSharing = value.getAccumulatedProfitSharing();
        java.lang.String str = accumulatedProfitSharing == null ? "" : accumulatedProfitSharing;
        java.lang.String ccy2 = value.getCcy();
        c51959vwp.setContent(C56033xvF.getBotPnl$default("", "", str, ccy2 == null ? "" : ccy2, false, false, null, false, null, null, null, 2032, null));
        final C51959vwp c51959vwp2 = uzd.DbNXlk;
        int i2 = C55688xof.Application.onRemoveQueueItem;
        java.lang.String ccy3 = value.getCcy();
        if (ccy3 == null) {
            ccy3 = "";
        }
        c51959vwp2.setTitleClick(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy3))), new Function0() { // from class: o.vvY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51885vvU.gEmmrt(c51959vwp2);
            }
        });
        java.lang.String estimatedProfitSharing = value.getEstimatedProfitSharing();
        java.lang.String str2 = estimatedProfitSharing == null ? "" : estimatedProfitSharing;
        java.lang.String ccy4 = value.getCcy();
        c51959vwp2.setContent(C56033xvF.getBotPnl$default("", "", str2, ccy4 == null ? "" : ccy4, false, false, null, false, null, null, null, 2032, null));
        C51959vwp c51959vwp3 = uzd.values;
        C51959vwp.setTitleClick$default(c51959vwp3, C33070mpX.AYXKKw(C55688xof.Application.DRuYWY), null, 2, null);
        xMR xmr = xMR.copydefault;
        java.lang.String profitSharingFollowerCount = value.getProfitSharingFollowerCount();
        c51959vwp3.setContent(xmr.copydefault(profitSharingFollowerCount != null ? profitSharingFollowerCount : ""));
    }

    public static final Unit valueOf(C51959vwp c51959vwp) {
        android.content.Context context = c51959vwp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.SFHvfS));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vwd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51885vvU.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit gEmmrt(C51959vwp c51959vwp) {
        android.content.Context context = c51959vwp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.hTAtCx));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vvX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51885vvU.AYXKKw(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault() {
        uZD uzd;
        SignalBotSummaryBean value = AEQbTJ().copydefault().getValue();
        if (value == null || (uzd = this.AEQbTJ) == null) {
            return;
        }
        final C51959vwp c51959vwp = uzd.AYXKKw;
        int i = C55688xof.Application.MediaSessionCompatCallbackCallbackHandler;
        java.lang.String ccy = value.getCcy();
        if (ccy == null) {
            ccy = "";
        }
        c51959vwp.setTitleClick(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy))), new Function0() { // from class: o.vvV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51885vvU.copydefault(c51959vwp);
            }
        });
        java.lang.String accumulatedSubscriptionIncome = value.getAccumulatedSubscriptionIncome();
        java.lang.String str = accumulatedSubscriptionIncome == null ? "" : accumulatedSubscriptionIncome;
        java.lang.String ccy2 = value.getCcy();
        c51959vwp.setContent(C56033xvF.getBotPnl$default("", "", str, ccy2 == null ? "" : ccy2, false, false, null, false, null, null, null, 2032, null));
        final C51959vwp c51959vwp2 = uzd.isConnected;
        int i2 = C55688xof.Application.onSkipToNext;
        java.lang.String ccy3 = value.getCcy();
        if (ccy3 == null) {
            ccy3 = "";
        }
        c51959vwp2.setTitleClick(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", ccy3))), new Function0() { // from class: o.vvW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51885vvU.AYXKKw(c51959vwp2);
            }
        });
        java.lang.String estimatedSubscriptionIncome = value.getEstimatedSubscriptionIncome();
        java.lang.String str2 = estimatedSubscriptionIncome == null ? "" : estimatedSubscriptionIncome;
        java.lang.String ccy4 = value.getCcy();
        c51959vwp2.setContent(C56033xvF.getBotPnl$default("", "", str2, ccy4 == null ? "" : ccy4, false, false, null, false, null, null, null, 2032, null));
        C51959vwp c51959vwp3 = uzd.valueOf;
        C51959vwp.setTitleClick$default(c51959vwp3, C33070mpX.AYXKKw(C55688xof.Application.DRuYWY), null, 2, null);
        xMR xmr = xMR.copydefault;
        java.lang.String subscriptionFollowerCount = value.getSubscriptionFollowerCount();
        c51959vwp3.setContent(xmr.copydefault(subscriptionFollowerCount != null ? subscriptionFollowerCount : ""));
    }

    public static final Unit copydefault(C51959vwp c51959vwp) {
        android.content.Context context = c51959vwp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.RjCdvpRjCdvp));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vwc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51885vvU.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AYXKKw(C51959vwp c51959vwp) {
        android.content.Context context = c51959vwp.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.onLost));
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vwa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51885vvU.djBIcL(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl() {
        uZD uzd;
        SignalBotSummaryBean value = AEQbTJ().copydefault().getValue();
        if (value == null || (uzd = this.AEQbTJ) == null) {
            return;
        }
        C51959vwp c51959vwp = uzd.KWHzl;
        C51959vwp.setTitleClick$default(c51959vwp, C33070mpX.AYXKKw(C55688xof.Application.DRuYWY), null, 2, null);
        xMR xmr = xMR.copydefault;
        java.lang.String freeFollowerCount = value.getFreeFollowerCount();
        if (freeFollowerCount == null) {
            freeFollowerCount = "";
        }
        c51959vwp.setContent(xmr.copydefault(freeFollowerCount));
    }

    /* JADX INFO: renamed from: o.vvU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C51885vvU copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51885vvU c51885vvU) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = c51885vvU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }
}
