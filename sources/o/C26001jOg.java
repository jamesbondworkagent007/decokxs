package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.CoinInfo;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.market.bean.CoinDetailTradeJumpBean;
import com.okinc.business.dexlogic.main.market.bean.DAppInfo;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.MarketDetailActionButton;
import com.okinc.business.dexlogic.main.market.detail.SupportTradeType;
import com.okinc.business.dexlogic.track.enums.KlineType;
import com.okinc.business.dexlogic.track.enums.TradeType;
import com.okinc.business.dexui.main.dappredirect.DAppRedirectFrom;
import com.okinc.business.dexui.main.dappredirect.DexDappRedirectListFragment;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C52761wXj;
import o.C57406yhn;
import o.gKO;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jOg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26001jOg extends AbstractC26007jOm {
    public C23507hzY AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX INFO: renamed from: o.jOg$Application */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketDetailActionButton.values().length];
            try {
                iArr[MarketDetailActionButton.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketDetailActionButton.SwapAndMeme.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketDetailActionButton.SwapAdvancedMeme.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketDetailActionButton.SwapAdvanced.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketDetailActionButton.DAppRedDirectAndMeme.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MarketDetailActionButton.OnlySwap.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[MarketDetailActionButton.OnlyMeme.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[MarketDetailActionButton.OnlyDAppRedirect.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[TradeType.values().length];
            try {
                iArr2[TradeType.SWAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[TradeType.MEME.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[TradeType.ADVANCED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            EZpvd = iArr2;
        }
    }

    /* JADX INFO: renamed from: o.jOg$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public C26001jOg() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$3
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.coindetail.ui.CoinDetailTradeFragment$special$$inlined$activityViewModels$default$6
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

    private final MarketCoinDetailViewModel values() {
        return (MarketCoinDetailViewModel) this.OLrzqt.getValue();
    }

    private final OverviewViewModel AkhnZx() {
        return (OverviewViewModel) this.copydefault.getValue();
    }

    private final TokenBase DbNXlk() {
        android.content.Intent intent;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return (TokenBase) ((android.os.Parcelable) IntentCompat.getParcelableExtra(intent, "token_base", TokenBase.class));
    }

    private final java.lang.String fetchVPNInfo() {
        android.content.Intent intent;
        FragmentActivity activity = getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        return intent.getStringExtra("key.page_from");
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C23507hzY c23507hzYCopydefault = C23507hzY.copydefault(layoutInflater, viewGroup, false);
        this.AEQbTJ = c23507hzYCopydefault;
        if (c23507hzYCopydefault != null) {
            return c23507hzYCopydefault.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ejfBZ();
        view.post(new java.lang.Runnable() { // from class: o.jOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C26001jOg.AEQbTJ(this.AEQbTJ);
            }
        });
    }

    public static final void AEQbTJ(C26001jOg c26001jOg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c26001jOg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void ejfBZ() {
        values().KWHzl().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.jOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26001jOg.copydefault(this.copydefault, (MarketDetailActionButton) obj);
            }
        }));
    }

    public static final Unit copydefault(C26001jOg c26001jOg, MarketDetailActionButton marketDetailActionButton) {
        wYF wyf;
        SupportTradeType supportTradeType;
        TokenBase tokenBaseDbNXlk;
        wYF wyf2;
        C52794wYp c52794wYpAEQbTJ;
        wYF wyf3;
        C23507hzY c23507hzY = c26001jOg.AEQbTJ;
        if (c23507hzY != null && (wyf3 = c23507hzY.KWHzl) != null) {
            wyf3.setVisibility(0);
        }
        C23507hzY c23507hzY2 = c26001jOg.AEQbTJ;
        if (c23507hzY2 != null && (wyf2 = c23507hzY2.KWHzl) != null && (c52794wYpAEQbTJ = wyf2.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        Intrinsics.copydefault(marketDetailActionButton);
        switch (Application.KWHzl[marketDetailActionButton.ordinal()]) {
            case 1:
                C23507hzY c23507hzY3 = c26001jOg.AEQbTJ;
                if (c23507hzY3 != null && (wyf = c23507hzY3.KWHzl) != null) {
                    wyf.setVisibility(8);
                }
                break;
            case 2:
            case 3:
                if (marketDetailActionButton == MarketDetailActionButton.SwapAndMeme) {
                    supportTradeType = SupportTradeType.SwapAndMeme;
                } else {
                    supportTradeType = SupportTradeType.SwapAdvancedMeme;
                }
                if (C22416heu.iwGUEr()) {
                    if (C22416heu.values() && (tokenBaseDbNXlk = c26001jOg.DbNXlk()) != null) {
                        c26001jOg.values().KWHzl(tokenBaseDbNXlk);
                    }
                    c26001jOg.EZpvd(supportTradeType);
                } else {
                    c26001jOg.OLrzqt(SupportTradeType.SwapAndAdvanced);
                }
                break;
            case 4:
                c26001jOg.OLrzqt(SupportTradeType.SwapAndAdvanced);
                break;
            case 5:
                c26001jOg.OLrzqt(SupportTradeType.DAppRedDirectAndMeme);
                break;
            case 6:
                c26001jOg.OLrzqt(SupportTradeType.OnlySwap);
                break;
            case 7:
                c26001jOg.OLrzqt(SupportTradeType.OnlyMeme);
                break;
            case 8:
                showPrimaryGoToDAppButton$default(c26001jOg, false, 1, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(SupportTradeType supportTradeType) {
        wYF wyf;
        values().zsXlph();
        C23507hzY c23507hzY = this.AEQbTJ;
        if (c23507hzY == null || (wyf = c23507hzY.KWHzl) == null) {
            return;
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(0);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        wyf.setType(14);
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        wyf.setPrimaryText(getString(C23274hvD.Fragment.getSessionToken2Bundle));
        wyf.setSecondaryText(getString(C23274hvD.Fragment.rememberLauncherForActivityResult));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYpCopydefault2.getContext(), C57406yhn.Activity.aKErDB);
            if (drawable != null) {
                DrawableCompat.setTintList(drawable, c52794wYpCopydefault2.getTextColors());
                android.content.Context context = c52794wYpCopydefault2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iOLrzqt = C55298xhM.OLrzqt(16, context);
                android.content.Context context2 = c52794wYpCopydefault2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
            } else {
                drawable = null;
            }
            android.content.Context context3 = c52794wYpCopydefault2.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            c52794wYpCopydefault2.setCompoundDrawablePadding(C55298xhM.OLrzqt(8, context3));
            c52794wYpCopydefault2.setCompoundDrawablesRelative(drawable, null, null, null);
        }
        C52794wYp c52794wYpAEQbTJ3 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ3 != null) {
            c52794wYpAEQbTJ3.setOnClickListener(new Activity(c52794wYpAEQbTJ3, 1000L, this, supportTradeType));
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setOnClickListener(new PendingIntent(c52794wYpCopydefault3, 1000L, this));
        }
    }

    /* JADX INFO: renamed from: o.jOg$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ SupportTradeType KWHzl;
        public final /* synthetic */ C26001jOg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C26001jOg c26001jOg, SupportTradeType supportTradeType) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c26001jOg;
            this.KWHzl = supportTradeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.copydefault(this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.jOg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C26001jOg EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ SupportTradeType OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C26001jOg c26001jOg, SupportTradeType supportTradeType) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c26001jOg;
            this.OLrzqt = supportTradeType;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault(this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.jOg$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C26001jOg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C26001jOg c26001jOg) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c26001jOg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.AEQbTJ();
            }
        }
    }

    /* JADX INFO: renamed from: o.jOg$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C26001jOg AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C26001jOg c26001jOg) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c26001jOg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.djBIcL();
            }
        }
    }

    public final void OLrzqt(SupportTradeType supportTradeType) {
        wYF wyf;
        values().zsXlph();
        C23507hzY c23507hzY = this.AEQbTJ;
        if (c23507hzY == null || (wyf = c23507hzY.KWHzl) == null) {
            return;
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
        }
        wyf.setType(5);
        wyf.setPrimaryText(getString(C23274hvD.Fragment.rememberLauncherForActivityResult));
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this, supportTradeType));
        }
    }

    public static /* synthetic */ void showPrimaryGoToDAppButton$default(C26001jOg c26001jOg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c26001jOg.copydefault(z);
    }

    public final void copydefault(boolean z) {
        wYF wyf;
        C23507hzY c23507hzY = this.AEQbTJ;
        if (c23507hzY == null || (wyf = c23507hzY.KWHzl) == null) {
            return;
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setVisibility(8);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setVisibility(0);
            EZpvd(c52794wYpCopydefault);
            c52794wYpCopydefault.setOnClickListener(new StateListAnimator(c52794wYpCopydefault, 1000L, this));
        }
        if (z) {
            wyf.setType(5);
        }
        wyf.setPrimaryText(getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi211));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(SupportTradeType supportTradeType) {
        TradeType tradeType;
        TokenBase tokenBaseDbNXlk = DbNXlk();
        if (tokenBaseDbNXlk != null && tokenBaseDbNXlk.getFromTrading()) {
            requireActivity().finish();
            return;
        }
        KWHzl();
        TradingType tradingTypeAYXKKw = values().AYXKKw();
        if (supportTradeType == SupportTradeType.OnlySwap) {
            tradeType = TradeType.SWAP;
        } else if (tradingTypeAYXKKw != TradingType.Meme) {
            tradeType = tradingTypeAYXKKw == TradingType.Advanced ? TradeType.ADVANCED : TradeType.SWAP;
        } else {
            TokenBase tokenBaseDbNXlk2 = DbNXlk();
            if (!Intrinsics.EZpvd((java.lang.Object) (tokenBaseDbNXlk2 != null ? tokenBaseDbNXlk2.getSource() : null), (java.lang.Object) "cefi_search")) {
                tradeType = TradeType.MEME;
            }
        }
        trackPageEvents$default(this, tradeType, null, null, 6, null);
        int i = Application.EZpvd[tradeType.ordinal()];
        if (i == 1) {
            EZpvd((tradingTypeAYXKKw == TradingType.Meme || tradingTypeAYXKKw == TradingType.Advanced) ? "type_swap" : null);
        } else if (i == 2) {
            AhwBna();
        } else if (i == 3) {
            OLrzqt();
        } else {
            EZpvd((java.lang.String) null);
        }
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
    }

    public final void AEQbTJ() {
        AEQbTJ(TradeType.MEME, TokenDetailClickLayer.GLOBAL, TokenDetailButtonName.QUICK_BUY_BUTTON);
        AYXKKw();
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [279=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0.equals("hot_search") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r0.equals("search") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        o.AbstractC22421hez.Companion.EZpvd(o.AbstractC22421hez.ClipData.EZpvd);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        java.lang.String str;
        java.lang.String sourcePageName;
        java.lang.String moduleId;
        TokenBase tokenBaseDbNXlk = DbNXlk();
        java.lang.String source = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getSource() : null;
        str = "";
        if (source != null) {
            switch (source.hashCode()) {
                case -1195055471:
                    if (source.equals("module_list")) {
                        TokenBase tokenBaseDbNXlk2 = DbNXlk();
                        if (tokenBaseDbNXlk2 == null || (moduleId = tokenBaseDbNXlk2.getModuleId()) == null) {
                            TokenBase tokenBaseDbNXlk3 = DbNXlk();
                            sourcePageName = tokenBaseDbNXlk3 != null ? tokenBaseDbNXlk3.getModuleNameEnglish() : null;
                            if (sourcePageName != null) {
                                str = sourcePageName;
                            }
                        } else {
                            if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) moduleId))) {
                                moduleId = null;
                            }
                            if (moduleId != null) {
                                str = moduleId;
                            }
                        }
                        AbstractC22421hez.Companion.EZpvd(new AbstractC22421hez.AssistContent(str));
                    }
                    break;
                case -906336856:
                    break;
                case 3347760:
                    if (source.equals(TabTitleInfo.KEY_MEME)) {
                        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.FragmentManager.OLrzqt);
                    }
                    break;
                case 83152346:
                    break;
                case 259311234:
                    if (source.equals("cefi_search")) {
                        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.ComponentCallbacks2.EZpvd);
                    }
                    break;
            }
        }
        TokenBase tokenBaseDbNXlk4 = DbNXlk();
        if (tokenBaseDbNXlk4 == null || tokenBaseDbNXlk4.getSrcType() != OKDSourceType.DAPP_SOURCE.getSrcType()) {
            return;
        }
        AbstractC22421hez.Application application = AbstractC22421hez.Companion;
        TokenBase tokenBaseDbNXlk5 = DbNXlk();
        sourcePageName = tokenBaseDbNXlk5 != null ? tokenBaseDbNXlk5.getSourcePageName() : null;
        application.EZpvd(new AbstractC22421hez.Activity(sourcePageName != null ? sourcePageName : ""));
    }

    public final void EZpvd(C52794wYp c52794wYp) {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.dNxZaP);
        if (drawableKWHzl != null) {
            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.htlTjW));
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            int iAhwBna = C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, contextRequireContext)));
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            drawableKWHzl.setBounds(0, 0, iAhwBna, C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(16, contextRequireContext2))));
        } else {
            drawableKWHzl = null;
        }
        c52794wYp.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
        android.content.Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        c52794wYp.setCompoundDrawablePadding(C33129mqd.AhwBna(java.lang.Float.valueOf(C55298xhM.AEQbTJ(8, contextRequireContext3))));
    }

    public final void djBIcL() {
        LatestMarketInfoBean second;
        LatestMarketInfoBean second2;
        ChartDetailFragment.Companion.SubChartTabType subChartTabTypeOLrzqt = ChartDetailFragment.Companion.SubChartTabType.Companion.OLrzqt(values().getFieldNames().getValue());
        TradeType tradeType = TradeType.DAPP;
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = values().valueOf().getValue();
        trackPageClick$default(this, null, (value == null || (second2 = value.getSecond()) == null) ? values().AhwBna().getValue() : java.lang.Boolean.valueOf(second2.isCollectState()), tradeType, subChartTabTypeOLrzqt, null, null, null, null, null, null, null, 2033, null);
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = values().valueOf().getValue();
        if (value2 == null || (second = value2.getSecond()) == null) {
            return;
        }
        DexDappRedirectListFragment.Activity activity = DexDappRedirectListFragment.Companion;
        java.util.List<DAppInfo> dappList = second.getDappList();
        java.lang.String tokenSymbol = second.getTokenSymbol();
        java.lang.String tokenLogoUrl = second.getTokenLogoUrl();
        TokenBase tokenBaseDbNXlk = DbNXlk();
        java.lang.String chainId = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getChainId() : null;
        C21697hIz c21697hIz = new C21697hIz(tokenSymbol, tokenLogoUrl, chainId == null ? "" : chainId, second.getChainName(), second.getChainBWLogoUrl(), second.getTokenContractAddress(), second.getNotSupportTxNativeToken(), false, false, MLKEMEngine.KyberPolyBytes, null);
        DAppRedirectFrom dAppRedirectFrom = DAppRedirectFrom.MARKET;
        java.lang.String strAuCTel = values().AuCTel();
        TokenBase tokenBaseDbNXlk2 = DbNXlk();
        java.lang.String sourcePageName = tokenBaseDbNXlk2 != null ? tokenBaseDbNXlk2.getSourcePageName() : null;
        java.lang.String str = sourcePageName == null ? "" : sourcePageName;
        TokenBase tokenBaseDbNXlk3 = DbNXlk();
        DexDappRedirectListFragment.Activity.newInstance$default(activity, dappList, c21697hIz, null, dAppRedirectFrom, null, null, null, strAuCTel, str, tokenBaseDbNXlk3 != null ? tokenBaseDbNXlk3.getSrcType() : 0, 0, 1136, null).show(getChildFragmentManager(), "javaClass");
    }

    public final void EZpvd(final java.lang.String str) {
        LatestMarketInfoBean second;
        LatestMarketInfoBean second2;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AbstractC7000aZw abstractC7000aZw = parentFragment instanceof AbstractC7000aZw ? (AbstractC7000aZw) parentFragment : null;
        if (abstractC7000aZw != null) {
            abstractC7000aZw.showLoadingAtOnce();
        }
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = values().valueOf().getValue();
        java.lang.String tokenContractAddress = (value == null || (second2 = value.getSecond()) == null) ? null : second2.getTokenContractAddress();
        MarketCoinDetailViewModel marketCoinDetailViewModelValues = values();
        TokenBase tokenBaseDbNXlk = DbNXlk();
        java.lang.String chainId = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        TokenBase tokenBaseDbNXlk2 = DbNXlk();
        java.lang.String tokenContractAddress2 = tokenBaseDbNXlk2 != null ? tokenBaseDbNXlk2.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        if (tokenContractAddress2 == null || tokenContractAddress2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tokenContractAddress2)) {
            tokenContractAddress2 = tokenContractAddress;
        }
        marketCoinDetailViewModelValues.AEQbTJ(chainId, tokenContractAddress2, new Function1() { // from class: o.jOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26001jOg.AEQbTJ(this.copydefault, str, (CoinDetailTradeJumpBean) obj);
            }
        });
        ChartDetailFragment.Companion.SubChartTabType subChartTabTypeOLrzqt = ChartDetailFragment.Companion.SubChartTabType.Companion.OLrzqt(values().getFieldNames().getValue());
        TradeType tradeType = TradeType.SWAP;
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = values().valueOf().getValue();
        trackPageClick$default(this, null, (value2 == null || (second = value2.getSecond()) == null) ? values().AhwBna().getValue() : java.lang.Boolean.valueOf(second.isCollectState()), tradeType, subChartTabTypeOLrzqt, null, null, null, null, null, null, null, 2033, null);
        C21847hOn.KWHzl(true);
    }

    public static final Unit AEQbTJ(C26001jOg c26001jOg, java.lang.String str, CoinDetailTradeJumpBean coinDetailTradeJumpBean) {
        Intrinsics.checkNotNullParameter(coinDetailTradeJumpBean, "");
        c26001jOg.EZpvd(coinDetailTradeJumpBean, str);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        LatestMarketInfoBean second;
        TokenBase tokenBaseDbNXlk = DbNXlk();
        if (tokenBaseDbNXlk != null) {
            tokenBaseDbNXlk.setEventSource("TOKEN_DETAILS");
            tokenBaseDbNXlk.setLocalIsNeedRequestNet(true);
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/meme/swap"), C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", tokenBaseDbNXlk.getChainId()), C56390yDp.OLrzqt("tokenContractAddress", tokenBaseDbNXlk.getTokenContractAddress()), C56390yDp.OLrzqt("transaction_direction", 0), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, ""), C56390yDp.OLrzqt("sourcePageName", tokenBaseDbNXlk.getSourcePageName()), C56390yDp.OLrzqt("sourceType", java.lang.Integer.valueOf(tokenBaseDbNXlk.getSrcType()))), new Function1() { // from class: o.jOh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26001jOg.AYXKKw((AbstractC43238rlX) obj);
                }
            });
        }
        ChartDetailFragment.Companion.SubChartTabType subChartTabTypeOLrzqt = ChartDetailFragment.Companion.SubChartTabType.Companion.OLrzqt(values().getFieldNames().getValue());
        TradeType tradeType = TradeType.MEME;
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = values().valueOf().getValue();
        trackPageClick$default(this, null, (value == null || (second = value.getSecond()) == null) ? values().AhwBna().getValue() : java.lang.Boolean.valueOf(second.isCollectState()), tradeType, subChartTabTypeOLrzqt, null, null, null, null, null, null, null, 2033, null);
    }

    public static final Unit AYXKKw(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        trackPageClick$default(this, null, null, TradeType.ADVANCED, null, null, null, null, null, null, null, null, 2043, null);
        TokenBase tokenBaseDbNXlk = DbNXlk();
        if (tokenBaseDbNXlk != null) {
            tokenBaseDbNXlk.setEventSource("TOKEN_DETAILS");
            tokenBaseDbNXlk.setLocalIsNeedRequestNet(true);
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/advanced/buy"), C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", tokenBaseDbNXlk.getChainId()), C56390yDp.OLrzqt("buyTokenContractAddress", tokenBaseDbNXlk.getTokenContractAddress()), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "")), new Function1() { // from class: o.jOi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26001jOg.KWHzl((AbstractC43238rlX) obj);
                }
            });
        }
    }

    public static final Unit KWHzl(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        TokenBase tokenBaseDbNXlk = DbNXlk();
        if (tokenBaseDbNXlk != null) {
            tokenBaseDbNXlk.setMarketDetailEntry(true);
        }
        values().zLjUOn();
        gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        gKO.StateListAnimator.openMemeQuickTransaction$default(gko, childFragmentManager, values().AuCTel(), DbNXlk(), TransactionType.Buy.getType(), "", null, null, 96, null);
        EZpvd();
    }

    public static /* synthetic */ void openDeeplinkTrade$default(C26001jOg c26001jOg, CoinDetailTradeJumpBean coinDetailTradeJumpBean, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c26001jOg.EZpvd(coinDetailTradeJumpBean, str);
    }

    public final void EZpvd(CoinDetailTradeJumpBean coinDetailTradeJumpBean, java.lang.String str) {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AbstractC7000aZw abstractC7000aZw = parentFragment instanceof AbstractC7000aZw ? (AbstractC7000aZw) parentFragment : null;
        if (abstractC7000aZw != null) {
            abstractC7000aZw.dismissLoading();
        }
        if (getActivity() != null) {
            TokenBase tokenBaseDbNXlk = DbNXlk();
            if (Intrinsics.EZpvd((java.lang.Object) (tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getSource() : null), (java.lang.Object) "cefi_search")) {
                AEQbTJ(coinDetailTradeJumpBean, str);
                return;
            }
            InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            java.lang.String strAEQbTJ = gKZ.EZpvd.AEQbTJ("dex/swap");
            kotlin.Pair[] pairArr = new kotlin.Pair[8];
            DexMultiTokenInfoBean toTokenInfo = coinDetailTradeJumpBean.getToTokenInfo();
            java.lang.String chainId = toTokenInfo != null ? toTokenInfo.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("toChainId", chainId);
            DexMultiTokenInfoBean toTokenInfo2 = coinDetailTradeJumpBean.getToTokenInfo();
            java.lang.String originContractAddress = toTokenInfo2 != null ? toTokenInfo2.getOriginContractAddress() : null;
            if (originContractAddress == null) {
                originContractAddress = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("toTokenContractAddress", originContractAddress);
            DexMultiTokenInfoBean toTokenInfo3 = coinDetailTradeJumpBean.getToTokenInfo();
            java.lang.String strIsNativeToken = toTokenInfo3 != null ? toTokenInfo3.isNativeToken() : null;
            if (strIsNativeToken == null) {
                strIsNativeToken = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("isToNative", strIsNativeToken);
            pairArr[3] = C56390yDp.OLrzqt("isOldTradingDialog", java.lang.Boolean.TRUE);
            pairArr[4] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, "0");
            pairArr[5] = C56390yDp.OLrzqt("tradeMode", Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "type_swap") ? java.lang.Integer.valueOf(TradeMode.SwapMode.getType()) : "");
            TokenBase tokenBaseDbNXlk2 = DbNXlk();
            pairArr[6] = C56390yDp.OLrzqt("sourceType", java.lang.Integer.valueOf(tokenBaseDbNXlk2 != null ? tokenBaseDbNXlk2.getSrcType() : 0));
            TokenBase tokenBaseDbNXlk3 = DbNXlk();
            java.lang.String sourcePageName = tokenBaseDbNXlk3 != null ? tokenBaseDbNXlk3.getSourcePageName() : null;
            pairArr[7] = C56390yDp.OLrzqt("sourcePageName", sourcePageName != null ? sourcePageName : "");
            interfaceC43294rma.KWHzl(fragmentActivityRequireActivity, strAEQbTJ, C56424yEw.gEmmrt(pairArr), new Function1() { // from class: o.jOj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C26001jOg.EZpvd((AbstractC43238rlX) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [463=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd() {
        MemeQuickPopUpSource memeQuickPopUpSource;
        TokenBase tokenBaseDbNXlk = DbNXlk();
        java.lang.String eventSource = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getEventSource() : null;
        if (eventSource != null) {
            switch (eventSource.hashCode()) {
                case 865817355:
                    memeQuickPopUpSource = !eventSource.equals("MARKET_SEARCH") ? MemeQuickPopUpSource.MarketTokenDetailPage : MemeQuickPopUpSource.MarketSearch;
                    break;
                case 1151680217:
                    if (eventSource.equals("MARKET_MY_POSITION")) {
                        memeQuickPopUpSource = MemeQuickPopUpSource.MarketMyPosition;
                        break;
                    }
                    break;
                case 1521089980:
                    if (eventSource.equals("TOKEN_DETAILS")) {
                        memeQuickPopUpSource = MemeQuickPopUpSource.MarketTokenDetailPage;
                        break;
                    }
                    break;
                case 1960146900:
                    if (eventSource.equals("MARKET_MEME_PUMP")) {
                        memeQuickPopUpSource = MemeQuickPopUpSource.MarketMemePump;
                        break;
                    }
                    break;
            }
        }
        MemeQuickPopUpSource.Companion.copydefault(memeQuickPopUpSource);
    }

    public static /* synthetic */ void openTradeAsPopUp$default(C26001jOg c26001jOg, CoinDetailTradeJumpBean coinDetailTradeJumpBean, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        c26001jOg.AEQbTJ(coinDetailTradeJumpBean, str);
    }

    public final void AEQbTJ(CoinDetailTradeJumpBean coinDetailTradeJumpBean, java.lang.String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            java.lang.String strCopydefault = C22380heK.OLrzqt.copydefault(values().AuCTel()).fARcdN().copydefault();
            java.lang.String strAuCTel = values().AuCTel();
            CoinInfo coinInfo = new CoinInfo((java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 15, (DefaultConstructorMarker) null);
            DexMultiTokenInfoBean toTokenInfo = coinDetailTradeJumpBean.getToTokenInfo();
            java.lang.String chainId = toTokenInfo != null ? toTokenInfo.getChainId() : null;
            java.lang.String str2 = chainId == null ? "" : chainId;
            DexMultiTokenInfoBean toTokenInfo2 = coinDetailTradeJumpBean.getToTokenInfo();
            java.lang.String originContractAddress = toTokenInfo2 != null ? toTokenInfo2.getOriginContractAddress() : null;
            java.lang.String str3 = originContractAddress == null ? "" : originContractAddress;
            DexMultiTokenInfoBean toTokenInfo3 = coinDetailTradeJumpBean.getToTokenInfo();
            CoinInfo coinInfo2 = new CoinInfo(str2, str3, toTokenInfo3 != null && toTokenInfo3.isMainChainCoin(), (java.lang.String) null, 8, (DefaultConstructorMarker) null);
            TokenBase tokenBaseDbNXlk = DbNXlk();
            java.lang.String sourcePageName = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getSourcePageName() : null;
            java.lang.String str4 = sourcePageName == null ? "" : sourcePageName;
            TokenBase tokenBaseDbNXlk2 = DbNXlk();
            ((gKO) C43251rlk.copydefault(gKO.class)).EZpvd(activity, values().AuCTel(), new TradeParam(strCopydefault, strAuCTel, coinInfo, coinInfo2, (java.lang.String) null, (java.lang.Integer) null, str, false, "0", java.lang.Boolean.TRUE, false, str4, tokenBaseDbNXlk2 != null ? tokenBaseDbNXlk2.getSrcType() : 0, (java.lang.String) null, 9392, (DefaultConstructorMarker) null));
        }
    }

    public static /* synthetic */ void trackPageEvents$default(C26001jOg c26001jOg, TradeType tradeType, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            tokenDetailClickLayer = TokenDetailClickLayer.GLOBAL;
        }
        if ((i & 4) != 0) {
            tokenDetailButtonName = TokenDetailButtonName.TRADE;
        }
        c26001jOg.AEQbTJ(tradeType, tokenDetailClickLayer, tokenDetailButtonName);
    }

    public final void AEQbTJ(TradeType tradeType, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName) {
        java.lang.Boolean value;
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value2 = values().valueOf().getValue();
        LatestMarketInfoBean second = value2 != null ? value2.getSecond() : null;
        TokenBase tokenBaseDbNXlk = DbNXlk();
        java.lang.String tokenContractAddress = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        java.lang.String tokenSymbol = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        java.lang.String chainId = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String chainName = tokenBaseDbNXlk != null ? tokenBaseDbNXlk.getChainName() : null;
        java.lang.String chainName2 = second != null ? second.getChainName() : null;
        java.lang.String str = chainName2 != null ? chainName2 : "";
        if (chainName == null || chainName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) chainName)) {
            chainName = str;
        }
        if (second != null) {
            value = java.lang.Boolean.valueOf(second.isCollectState());
        } else {
            value = values().AhwBna().getValue();
        }
        trackPageClick$default(this, null, value, tradeType, ChartDetailFragment.Companion.SubChartTabType.Companion.OLrzqt(values().getFieldNames().getValue()), null, null, null, null, null, tokenDetailClickLayer, tokenDetailButtonName, 497, null);
        C21847hOn.EZpvd(tradeType.getValue(), tokenContractAddress, tokenSymbol, chainId, chainName);
    }

    public static /* synthetic */ void trackPageClick$default(C26001jOg c26001jOg, java.lang.String str, java.lang.Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, java.lang.String str2, java.lang.Boolean bool2, java.lang.String str3, java.lang.Boolean bool3, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            tradeType = null;
        }
        if ((i & 8) != 0) {
            subChartTabType = null;
        }
        if ((i & 16) != 0) {
            klineType = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            bool2 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        if ((i & 256) != 0) {
            bool3 = null;
        }
        if ((i & 512) != 0) {
            tokenDetailClickLayer = null;
        }
        if ((i & 1024) != 0) {
            tokenDetailButtonName = null;
        }
        c26001jOg.AEQbTJ(str, bool, tradeType, subChartTabType, klineType, str2, bool2, str3, bool3, tokenDetailClickLayer, tokenDetailButtonName);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.Boolean bool, TradeType tradeType, ChartDetailFragment.Companion.SubChartTabType subChartTabType, KlineType klineType, java.lang.String str2, java.lang.Boolean bool2, java.lang.String str3, java.lang.Boolean bool3, TokenDetailClickLayer tokenDetailClickLayer, TokenDetailButtonName tokenDetailButtonName) {
        TokenBase tokenBaseDbNXlk;
        if (this.AEQbTJ == null || (tokenBaseDbNXlk = DbNXlk()) == null) {
            return;
        }
        TokenBase tokenBaseDbNXlk2 = DbNXlk();
        if (tokenBaseDbNXlk2 != null) {
            tokenBaseDbNXlk2.getMarketTabName();
        }
        java.lang.String tokenContractAddress = tokenBaseDbNXlk.getTokenContractAddress();
        java.lang.String tokenSymbol = tokenBaseDbNXlk.getTokenSymbol();
        java.lang.String chainId = tokenBaseDbNXlk.getChainId();
        java.lang.String strKWHzl = C31256lqb.KWHzl(tokenBaseDbNXlk.getChainName(), (Function0<java.lang.String>) new Function0() { // from class: o.jOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C26001jOg.valueOf(this.OLrzqt);
            }
        });
        java.lang.String strFetchVPNInfo = fetchVPNInfo();
        if (strFetchVPNInfo == null) {
            strFetchVPNInfo = "";
        }
        C21847hOn.trackDexMarketTokenPageClick$default(tokenContractAddress, tokenSymbol, chainId, strKWHzl, null, strFetchVPNInfo, bool, tradeType, subChartTabType, klineType, str2, bool2, str3, bool3, str, tokenDetailButtonName, null, values().getNewProxyInstance(), tokenDetailClickLayer, null, null, AkhnZx().djBIcL(), 1638400, null);
    }

    public static final java.lang.String valueOf(C26001jOg c26001jOg) {
        LatestMarketInfoBean second;
        kotlin.Pair<java.lang.Boolean, LatestMarketInfoBean> value = c26001jOg.values().valueOf().getValue();
        java.lang.String chainName = (value == null || (second = value.getSecond()) == null) ? null : second.getChainName();
        return chainName == null ? "" : chainName;
    }
}
