package com.okinc.dexkline.dexui.main.market.detail.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.bean.TokenInfoForAlert;
import com.okinc.core.util.SPUtils;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.RedirectionType;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.dexkline.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinSharedViewModel;
import com.okinc.dexkline.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.overview.domain.MemeInfo;
import com.okinc.dexkline.market.features.overview.domain.Overview;
import com.okinc.dexkline.market.features.overview.ui.OverviewViewModel;
import com.okinc.dexkline.market.features.risk_control.ui.RiskControlViewModel;
import com.okinc.dexkline.market.features.token_detail.RealtimeDataViewModel;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import com.okinc.kline.ui.viewmodel.KlineHeaderViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC32194mSz;
import o.ActivityC38834pgs;
import o.C32193mSy;
import o.C32237mUo;
import o.C33057mpK;
import o.C33070mpX;
import o.C33129mqd;
import o.C33624mzv;
import o.C34498ndH;
import o.C34587ner;
import o.C34604nfI;
import o.C34607nfL;
import o.C34656ngH;
import o.C34663ngO;
import o.C35964oKf;
import o.C35966oKh;
import o.C36059oNt;
import o.C36236oUh;
import o.C38685peB;
import o.C43251rlk;
import o.C52761wXj;
import o.C52794wYp;
import o.C55113xdn;
import o.C55173xeu;
import o.C55254xgV;
import o.C55296xhK;
import o.C55326xho;
import o.C56104xwX;
import o.C56391yDq;
import o.C56392yDr;
import o.C56524yIo;
import o.InterfaceC13655dTj;
import o.InterfaceC32140mQz;
import o.InterfaceC43033rhe;
import o.InterfaceC46557tYt;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC8104awT;
import o.ViewOnClickListenerC54939xaY;
import o.mRE;
import o.mRG;
import o.mRU;
import o.mRV;
import o.mRW;
import o.mRY;
import o.mTU;
import o.mUA;
import o.mUM;
import o.mUN;
import o.mUO;
import o.mUR;
import o.oNW;
import o.pES;
import o.pFP;
import o.pFQ;
import o.rVN;
import o.yCM;
import okhttp3.internal.ws.WebSocketProtocol;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class DexMarketDetailFragment extends AbstractC32194mSz<oNW> implements mRY, InterfaceC13655dTj {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public boolean AYXKKw;
    public mRW AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public mRV copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fIwbmz;
    public LatestMarketInfoBean fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public boolean gEmmrt;
    public TokenBase iwGUEr;

    @yCM
    public InterfaceC46557tYt upDownTimeZoneService;
    public boolean valueOf;
    public final InterfaceC56387yDm values;

    @yCM
    public C34587ner walletUseCase;
    public final InterfaceC56387yDm ejfBZ = C34656ngH.EZpvd(this);
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.mSd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return DexMarketDetailFragment.AkhnZx(this.OLrzqt);
        }
    });
    public final List<Function1<LatestMarketInfoBean, Unit>> AEQbTJ = new ArrayList();
    public boolean OLrzqt = true;
    public String fARcdN = "";
    public final TaskStackBuilder isConnected = new TaskStackBuilder();

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RedirectionType.values().length];
            try {
                iArr[RedirectionType.TRADER_DETAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    public static final /* synthetic */ class SharedElementCallback implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
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
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    private final void OLrzqt(String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final String wlaJM() {
        return "unknown";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull mRW mrw) {
        Intrinsics.checkNotNullParameter(mrw, "");
        this.AhwBna = mrw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ oNW AEQbTJ(DexMarketDetailFragment dexMarketDetailFragment) {
        return (oNW) dexMarketDetailFragment.KWHzl();
    }

    public DexMarketDetailFragment() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(KlineHeaderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$6
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RealtimeDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$9
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinSharedViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$12
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(RiskControlViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$15
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$16
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$17
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment$special$$inlined$activityViewModels$default$18
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

    private final String zsXlph() {
        return (String) this.ejfBZ.getValue();
    }

    private final String AubY() {
        return (String) this.DbNXlk.getValue();
    }

    public static final String AkhnZx(DexMarketDetailFragment dexMarketDetailFragment) {
        Bundle arguments = dexMarketDetailFragment.getArguments();
        return C34663ngO.AEQbTJ(arguments != null ? arguments.getString("key.page_from") : null, new Function0() { // from class: o.mSu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexMarketDetailFragment.wlaJM();
            }
        });
    }

    private final KlineHeaderViewModel getNewProxyInstance() {
        return (KlineHeaderViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarketCoinDetailViewModel uzCIH() {
        return (MarketCoinDetailViewModel) this.values.getValue();
    }

    private final RealtimeDataViewModel AuCTelauCTel() {
        return (RealtimeDataViewModel) this.AuCTel.getValue();
    }

    public final RiskControlViewModel AhwBna() {
        return (RiskControlViewModel) this.fIwbmz.getValue();
    }

    public final OverviewViewModel djBIcL() {
        return (OverviewViewModel) this.AkhnZx.getValue();
    }

    public final C34587ner values() {
        C34587ner c34587ner = this.walletUseCase;
        if (c34587ner != null) {
            return c34587ner;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC46557tYt isConnected() {
        InterfaceC46557tYt interfaceC46557tYt = this.upDownTimeZoneService;
        if (interfaceC46557tYt != null) {
            return interfaceC46557tYt;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int KWHzl(ArrayList<CoinDetailTabInfo> arrayList) {
        mRV mrv;
        if (arrayList != null) {
            return C32193mSy.AEQbTJ.AEQbTJ(this.iwGUEr, arrayList);
        }
        TokenBase tokenBase = this.iwGUEr;
        if (C33129mqd.OLrzqt((CharSequence) (tokenBase != null ? tokenBase.getMarketTabName() : null))) {
            TokenBase tokenBase2 = this.iwGUEr;
            String marketTabName = tokenBase2 != null ? tokenBase2.getMarketTabName() : null;
            if (marketTabName != null) {
                switch (marketTabName.hashCode()) {
                    case -1361632171:
                        if (marketTabName.equals("charts") && this.gEmmrt) {
                            return 1;
                        }
                        break;
                    case 3237038:
                        if (marketTabName.equals("info") && !this.gEmmrt) {
                        }
                        break;
                    case 93166555:
                        if (marketTabName.equals("audit") && (mrv = this.copydefault) != null && mrv.getItemCount() > 2) {
                            return 2;
                        }
                        break;
                    case 1544803905:
                        marketTabName.equals("default");
                        break;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskStackBuilder extends ViewPager2.OnPageChangeCallback {
        public TaskStackBuilder() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2 viewPager2;
            super.onPageSelected(i);
            oNW onwAEQbTJ = DexMarketDetailFragment.AEQbTJ(DexMarketDetailFragment.this);
            if (onwAEQbTJ == null || (viewPager2 = onwAEQbTJ.AEQbTJ) == null) {
                return;
            }
            DexMarketDetailFragment dexMarketDetailFragment = DexMarketDetailFragment.this;
            mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(dexMarketDetailFragment), null, null, new DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(dexMarketDetailFragment, i, viewPager2, null), 3, null);
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ DexMarketDetailFragment KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(View view, long j, DexMarketDetailFragment dexMarketDetailFragment) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = dexMarketDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AuCTel();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ DexMarketDetailFragment KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, DexMarketDetailFragment dexMarketDetailFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = dexMarketDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.DbNXlk();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ DexMarketDetailFragment OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, DexMarketDetailFragment dexMarketDetailFragment) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = dexMarketDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.DbNXlk();
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ DexMarketDetailFragment AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(View view, long j, DexMarketDetailFragment dexMarketDetailFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = dexMarketDetailFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AuCTel();
            }
        }
    }

    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.fARcdN = arguments.getString("firstTab", "");
            this.valueOf = arguments.getBoolean("is_show_price_alert", false);
            TokenBase tokenBase = (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "token_base", TokenBase.class));
            this.iwGUEr = tokenBase;
            if (tokenBase != null) {
                RiskControlViewModel.fetchRiskControlBanner$default(AhwBna(), tokenBase.getChainId(), tokenBase.getTokenContractAddress(), null, 4, null);
                AhwBna().copydefault(tokenBase.getChainId(), tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol());
                djBIcL().AEQbTJ(tokenBase);
                OverviewViewModel.getOverviewData$default(djBIcL(), false, 1, null);
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public oNW KWHzl(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNW onwOLrzqt = oNW.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onwOLrzqt, "");
        return onwOLrzqt;
    }

    @Override // o.mRH, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        zLjUOn();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull oNW onw, Bundle bundle) {
        Intrinsics.checkNotNullParameter(onw, "");
        uzCIH().fetchVPNInfo().setValue(Boolean.TRUE);
        if (this.iwGUEr != null) {
            mUR.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DexMarketDetailFragment$initView$1$1(this, null), 3, null);
        }
        initAppBarInfo$default(this, null, 1, null);
        copydefault(SPUtils.getBoolean("trade_button_left", true));
    }

    @Override // o.mRH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        hDKMBd();
    }

    public static /* synthetic */ void initAppBarInfo$default(DexMarketDetailFragment dexMarketDetailFragment, LatestMarketInfoBean latestMarketInfoBean, int i, Object obj) {
        if ((i & 1) != 0) {
            latestMarketInfoBean = null;
        }
        dexMarketDetailFragment.copydefault(latestMarketInfoBean);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(LatestMarketInfoBean latestMarketInfoBean) {
        if (latestMarketInfoBean != null) {
            oNW onw = (oNW) KWHzl();
            if (onw != null) {
                mUA muaValueOf = valueOf();
                if (muaValueOf != null) {
                    muaValueOf.setTitleAndContract(latestMarketInfoBean.getTokenSymbol(), latestMarketInfoBean.getTokenContractAddress());
                }
                AEQbTJ(latestMarketInfoBean.getTokenContractAddress());
                mUA muaValueOf2 = valueOf();
                if (muaValueOf2 != null) {
                    muaValueOf2.setCoinChainCoinImageUrl(latestMarketInfoBean.getChainLogoUrl(), latestMarketInfoBean.getTokenLogoUrl());
                }
            } else {
                onw = null;
            }
            if (onw != null) {
                return;
            }
        }
        TokenBase tokenBase = this.iwGUEr;
        if (tokenBase == null || ((oNW) KWHzl()) == null) {
            return;
        }
        mUA muaValueOf3 = valueOf();
        if (muaValueOf3 != null) {
            muaValueOf3.setTitleAndContract(tokenBase.getTokenSymbol(), tokenBase.getTokenContractAddress());
        }
        AEQbTJ(tokenBase.getTokenContractAddress());
        mUA muaValueOf4 = valueOf();
        if (muaValueOf4 != null) {
            muaValueOf4.setCoinChainCoinImageUrl(tokenBase.getChainLogoUrl(), tokenBase.getTokenLogoUrl());
        }
    }

    public final void AEQbTJ(final String str) {
        List<View> listKWHzl;
        mUA muaValueOf = valueOf();
        if (muaValueOf == null || (listKWHzl = muaValueOf.KWHzl()) == null) {
            return;
        }
        for (final View view : listKWHzl) {
            mUO.setOnDoubleCheckClickListener$default(view, 0L, new Function1() { // from class: o.mSx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.KWHzl(view, str, this, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(View view, String str, DexMarketDetailFragment dexMarketDetailFragment, View view2) {
        Intrinsics.checkNotNullParameter(view2, "");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C32237mUo.KWHzl(context, str);
        trackPageClick$default(dexMarketDetailFragment, null, null, null, str, null, null, null, 119, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zuBGHE() {
        C55173xeu c55173xeu;
        C36059oNt c36059oNt;
        LinearLayoutCompat linearLayoutCompat;
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        oNW onw = (oNW) KWHzl();
        if (onw != null && (c55254xgV = onw.copydefault) != null) {
            c55254xgV.setVisibility(8);
        }
        oNW onw2 = (oNW) KWHzl();
        if (onw2 != null && (viewPager2 = onw2.AEQbTJ) != null) {
            viewPager2.setVisibility(8);
        }
        oNW onw3 = (oNW) KWHzl();
        if (onw3 != null && (c36059oNt = onw3.OLrzqt) != null && (linearLayoutCompat = c36059oNt.copydefault) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        oNW onw4 = (oNW) KWHzl();
        if (onw4 == null || (c55173xeu = onw4.AhwBna) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        String string = getString(C35964oKf.Fragment.hCLrkq);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        String string2 = getString(C35966oKh.TaskDescription.djBIcL);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu.setSubTitle((CharSequence) string2);
        c55173xeu.setEmptyTypeImage(8);
        String string3 = getString(C35964oKf.Fragment.AwvSrB);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        c55173xeu.setRetry(string3);
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mSq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                DexMarketDetailFragment.AEQbTJ(this.EZpvd, view);
            }
        });
    }

    public static final void AEQbTJ(DexMarketDetailFragment dexMarketDetailFragment, View view) {
        dexMarketDetailFragment.getFieldNames();
        dexMarketDetailFragment.hDKMBd();
    }

    private final void hDKMBd() {
        uzCIH().OLrzqt(this.iwGUEr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getFieldNames() {
        MarketCoinDetailViewModel marketCoinDetailViewModelUzCIH = uzCIH();
        String strZsXlph = zsXlph();
        TokenBase tokenBase = this.iwGUEr;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        TokenBase tokenBase2 = this.iwGUEr;
        String chainId = tokenBase2 != null ? tokenBase2.getChainId() : null;
        marketCoinDetailViewModelUzCIH.AEQbTJ(this, strZsXlph, tokenContractAddress, chainId != null ? chainId : "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AxsJAY() {
        C55173xeu c55173xeu;
        C36059oNt c36059oNt;
        LinearLayoutCompat linearLayoutCompat;
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        oNW onw = (oNW) KWHzl();
        if (onw != null && (c55254xgV = onw.copydefault) != null) {
            c55254xgV.setVisibility(8);
        }
        oNW onw2 = (oNW) KWHzl();
        if (onw2 != null && (viewPager2 = onw2.AEQbTJ) != null) {
            viewPager2.setVisibility(8);
        }
        oNW onw3 = (oNW) KWHzl();
        if (onw3 != null && (c36059oNt = onw3.OLrzqt) != null && (linearLayoutCompat = c36059oNt.copydefault) != null) {
            linearLayoutCompat.setVisibility(8);
        }
        oNW onw4 = (oNW) KWHzl();
        if (onw4 == null || (c55173xeu = onw4.AhwBna) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        String string = getString(C35964oKf.Fragment.ROgMPW);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setSubTitle((CharSequence) string);
        c55173xeu.setEmptyTypeImage(7);
        c55173xeu.setTitle("");
        c55173xeu.setRetry("");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gHZMYf() {
        C36059oNt c36059oNt;
        LinearLayoutCompat linearLayoutCompat;
        oNW onw = (oNW) KWHzl();
        if (onw != null) {
            onw.AhwBna.setVisibility(8);
            onw.copydefault.setVisibility(0);
            onw.AEQbTJ.setVisibility(0);
            oNW onw2 = (oNW) KWHzl();
            if (onw2 != null && (c36059oNt = onw2.OLrzqt) != null && (linearLayoutCompat = c36059oNt.copydefault) != null) {
                linearLayoutCompat.setVisibility(0);
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (String) null, 2, (Object) null);
    }

    public static /* synthetic */ void trackPageClick$default(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Boolean bool5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            bool3 = null;
        }
        if ((i & 32) != 0) {
            bool4 = null;
        }
        if ((i & 64) != 0) {
            bool5 = null;
        }
        dexMarketDetailFragment.EZpvd(bool, str, bool2, str2, bool3, bool4, bool5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(Boolean bool, String str, Boolean bool2, String str2, Boolean bool3, Boolean bool4, Boolean bool5) {
        TokenBase tokenBase;
        oNW onw = (oNW) KWHzl();
        if (onw == null || (tokenBase = this.iwGUEr) == null) {
            return;
        }
        String strOLrzqt = mRG.OLrzqt(onw.AEQbTJ.getCurrentItem(), this.gEmmrt);
        TokenBase tokenBase2 = this.iwGUEr;
        if (tokenBase2 != null) {
            tokenBase2.getMarketTabName();
        }
        mRG.OLrzqt(tokenBase.getTokenContractAddress(), tokenBase.getTokenSymbol(), tokenBase.getChainId(), C34663ngO.AEQbTJ(tokenBase.getChainName(), new Function0() { // from class: o.mSl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return DexMarketDetailFragment.isConnected(this.OLrzqt);
            }
        }), strOLrzqt, AubY(), bool, str, bool2, str2, bool3, bool4, bool5);
    }

    public static final String isConnected(DexMarketDetailFragment dexMarketDetailFragment) {
        LatestMarketInfoBean second;
        Pair<Boolean, LatestMarketInfoBean> value = dexMarketDetailFragment.uzCIH().AhwBna().getValue();
        String chainName = (value == null || (second = value.getSecond()) == null) ? null : second.getChainName();
        return chainName == null ? "" : chainName;
    }

    public final void fIwbmz() {
        LatestMarketInfoBean latestMarketInfoBean = this.fJNWhG;
        if (latestMarketInfoBean == null || !AhwBna().AYXKKw().getValue().booleanValue() || this.AYXKKw) {
            return;
        }
        this.AYXKKw = true;
        OLrzqt(latestMarketInfoBean);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(LatestMarketInfoBean latestMarketInfoBean) {
        final ArrayList<CoinDetailTabInfo> arrayListCopydefault = C32193mSy.AEQbTJ.copydefault(this, zsXlph(), this.iwGUEr, latestMarketInfoBean, uzCIH(), AhwBna(), AubY());
        this.copydefault = new mRU(this, arrayListCopydefault);
        oNW onw = (oNW) KWHzl();
        if (onw != null) {
            onw.AEQbTJ.setAdapter(this.copydefault);
            onw.AEQbTJ.setCurrentItem(KWHzl(arrayListCopydefault), false);
            new TabLayoutMediator(onw.copydefault.copydefault(), onw.AEQbTJ, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.mSb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    DexMarketDetailFragment.EZpvd(arrayListCopydefault, this, tab, i);
                }
            }).attach();
        }
    }

    public static final void EZpvd(ArrayList arrayList, DexMarketDetailFragment dexMarketDetailFragment, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        Object obj = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        CoinDetailTabInfo coinDetailTabInfo = (CoinDetailTabInfo) obj;
        tab.setText(coinDetailTabInfo.getTabTitle());
        tab.setContentDescription(coinDetailTabInfo.getTabContentDesc());
        if (coinDetailTabInfo.getTabType() == CoinDetailTabType.ASSESSMENT && dexMarketDetailFragment.AhwBna().OLrzqt()) {
            tab.setIcon(C33070mpX.KWHzl(C52761wXj.TaskDescription.zNQIcI));
            Drawable icon = tab.getIcon();
            if (icon != null) {
                C33057mpK.copydefault(icon, mUM.copydefault(C52761wXj.Activity.DQzvGN));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        final oNW onw = (oNW) KWHzl();
        if (onw != null) {
            getNewProxyInstance().OLrzqt().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.AYXKKw(this.KWHzl, (java.lang.Boolean) obj);
                }
            }));
            getNewProxyInstance().EZpvd().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
                }
            }));
            getNewProxyInstance().KWHzl().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.gEmmrt(this.EZpvd, (java.lang.Boolean) obj);
                }
            }));
            onw.copydefault.copydefault().clearOnTabSelectedListeners();
            onw.copydefault.AEQbTJ(new LoaderManager());
            uzCIH().fetchVPNInfo().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.fetchVPNInfo(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
            mUN.collectOnViewLifecycle$default(this, AuCTelauCTel().OLrzqt(), null, new PendingIntent(), 2, null);
            uzCIH().gEmmrt().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.OLrzqt(this.EZpvd, (InterfaceC32140mQz) obj);
                }
            }));
            uzCIH().AhwBna().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.AEQbTJ(this.OLrzqt, (kotlin.Pair) obj);
                }
            }));
            uzCIH().iwGUEr().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.DbNXlk(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
            uzCIH().AYXKKw().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.KWHzl(this.OLrzqt, (Unit) obj);
                }
            }));
            uzCIH().OLrzqt().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.values(this.AEQbTJ, (java.lang.Boolean) obj);
                }
            }));
            uzCIH().EZpvd().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.AkhnZx(this.KWHzl, (java.lang.Boolean) obj);
                }
            }));
            onw.AEQbTJ.registerOnPageChangeCallback(this.isConnected);
            uzCIH().AuCTel().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mRZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.OLrzqt(this.KWHzl, onw, (java.lang.Boolean) obj);
                }
            }));
            uzCIH().fIwbmz().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.EZpvd(this.OLrzqt, (java.lang.String) obj);
                }
            }));
            uzCIH().AEQbTJ().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.EZpvd(onw, (java.lang.Boolean) obj);
                }
            }));
            uzCIH().valueOf().observe(getViewLifecycleOwner(), new SharedElementCallback(new Function1() { // from class: o.mSg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return DexMarketDetailFragment.copydefault(this.AEQbTJ, (java.util.List) obj);
                }
            }));
            mUN.collectOnViewLifecycle$default(this, AhwBna().EZpvd(), null, new TaskDescription(), 2, null);
            mUN.collectOnViewLifecycle$default(this, AhwBna().AEQbTJ(), null, new Activity(), 2, null);
            mUN.collectOnViewLifecycle$default(this, AhwBna().AYXKKw(), null, new Application(), 2, null);
            C52794wYp c52794wYp = onw.OLrzqt.gEmmrt;
            c52794wYp.setOnClickListener(new Fragment(c52794wYp, 1000L, this));
            C52794wYp c52794wYp2 = onw.OLrzqt.AYXKKw;
            c52794wYp2.setOnClickListener(new FragmentManager(c52794wYp2, 1000L, this));
            C33624mzv c33624mzv = onw.OLrzqt.AEQbTJ;
            c33624mzv.setOnClickListener(new Dialog(c33624mzv, 1000L, this));
            C33624mzv c33624mzv2 = onw.OLrzqt.OLrzqt;
            c33624mzv2.setOnClickListener(new VoiceInteractor(c33624mzv2, 1000L, this));
        }
    }

    public static final Unit AYXKKw(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        trackPageClick$default(dexMarketDetailFragment, null, null, Boolean.TRUE, null, null, null, null, 123, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        trackPageClick$default(dexMarketDetailFragment, Boolean.TRUE, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        trackPageClick$default(dexMarketDetailFragment, null, null, null, null, null, null, Boolean.TRUE, 63, null);
        return Unit.INSTANCE;
    }

    public static final class LoaderManager implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public LoaderManager() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            int position = tab.getPosition();
            if (!DexMarketDetailFragment.this.OLrzqt) {
                DexMarketDetailFragment.this.OLrzqt(position);
            }
            DexMarketDetailFragment.this.OLrzqt = false;
        }
    }

    public static final Unit fetchVPNInfo(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        FragmentActivity activity = dexMarketDetailFragment.getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            if (bool.booleanValue()) {
                activityC38834pgs.fetchVPNInfo();
            } else {
                activityC38834pgs.OLrzqt();
            }
        }
        return Unit.INSTANCE;
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(TokenDetail tokenDetail, Continuation<? super Unit> continuation) {
            mUA muaValueOf = DexMarketDetailFragment.this.valueOf();
            if (muaValueOf != null) {
                String strKWHzl = tokenDetail.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "";
                }
                muaValueOf.AEQbTJ(strKWHzl);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(DexMarketDetailFragment dexMarketDetailFragment, InterfaceC32140mQz interfaceC32140mQz) {
        oNW onw;
        ViewPager2 viewPager2;
        if (interfaceC32140mQz != null && (onw = (oNW) dexMarketDetailFragment.KWHzl()) != null && (viewPager2 = onw.AEQbTJ) != null) {
            viewPager2.setCurrentItem(interfaceC32140mQz.KWHzl(), false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DexMarketDetailFragment dexMarketDetailFragment, Pair pair) {
        mUA muaValueOf;
        String changeUtc0;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            TokenBase tokenBase = dexMarketDetailFragment.iwGUEr;
            if (tokenBase != null) {
                LatestMarketInfoBean latestMarketInfoBean = (LatestMarketInfoBean) pair.getSecond();
                String tokenContractAddress = latestMarketInfoBean != null ? latestMarketInfoBean.getTokenContractAddress() : null;
                String str = tokenContractAddress == null ? "" : tokenContractAddress;
                LatestMarketInfoBean latestMarketInfoBean2 = (LatestMarketInfoBean) pair.getSecond();
                String chainLogoUrl = latestMarketInfoBean2 != null ? latestMarketInfoBean2.getChainLogoUrl() : null;
                dexMarketDetailFragment.iwGUEr = tokenBase.copy((1073741813 & 1) != 0 ? tokenBase.chainId : null, (1073741813 & 2) != 0 ? tokenBase.tokenContractAddress : str, (1073741813 & 4) != 0 ? tokenBase.tokenLogoUrl : null, (1073741813 & 8) != 0 ? tokenBase.chainLogoUrl : chainLogoUrl == null ? "" : chainLogoUrl, (1073741813 & 16) != 0 ? tokenBase.chainBWLogoUrl : null, (1073741813 & 32) != 0 ? tokenBase.tokenSymbol : null, (1073741813 & 64) != 0 ? tokenBase.tokenName : null, (1073741813 & 128) != 0 ? tokenBase.isCollected : 0, (1073741813 & 256) != 0 ? tokenBase.decimals : 0, (1073741813 & 512) != 0 ? tokenBase.isCustomToken : 0, (1073741813 & 1024) != 0 ? tokenBase.isSubscribe : 0, (1073741813 & 2048) != 0 ? tokenBase.uniqueId : null, (1073741813 & 4096) != 0 ? tokenBase.source : null, (1073741813 & 8192) != 0 ? tokenBase.tokenSource : null, (1073741813 & 16384) != 0 ? tokenBase.type : null, (1073741813 & 32768) != 0 ? tokenBase.chainName : null, (1073741813 & 65536) != 0 ? tokenBase.isLeveraged : null, (1073741813 & 131072) != 0 ? tokenBase.isSafeMoonToken : 0, (1073741813 & 262144) != 0 ? tokenBase.isHoneypot : 0, (1073741813 & 524288) != 0 ? tokenBase.localIsNeedRequestNet : false, (1073741813 & 1048576) != 0 ? tokenBase.eventSource : null, (1073741813 & 2097152) != 0 ? tokenBase.marketTabName : null, (1073741813 & 4194304) != 0 ? tokenBase.showSourceAlert : false, (1073741813 & 8388608) != 0 ? tokenBase.fromTrading : false, (1073741813 & 16777216) != 0 ? tokenBase.moduleNameEnglish : null, (1073741813 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? tokenBase.sourcePageName : null, (1073741813 & 67108864) != 0 ? tokenBase.srcType : 0, (1073741813 & 134217728) != 0 ? tokenBase.isHighRisk : false, (1073741813 & 268435456) != 0 ? tokenBase.referralCode : null, (1073741813 & 536870912) != 0 ? tokenBase.riskControlLevel : null);
            }
            dexMarketDetailFragment.gEmmrt = ((LatestMarketInfoBean) pair.getSecond()).isShowInfoTab();
            dexMarketDetailFragment.copydefault((LatestMarketInfoBean) pair.getSecond());
            if ((!((LatestMarketInfoBean) pair.getSecond()).isSupportTxPrice() || dexMarketDetailFragment.gEmmrt) && (muaValueOf = dexMarketDetailFragment.valueOf()) != null) {
                muaValueOf.KWHzl(mTU.OLrzqt.KWHzl(((LatestMarketInfoBean) pair.getSecond()).getPrice()));
            }
            int iEZpvd = dexMarketDetailFragment.isConnected().EZpvd();
            if (iEZpvd == 1) {
                changeUtc0 = ((LatestMarketInfoBean) pair.getSecond()).getChangeUtc0();
            } else if (iEZpvd == 2) {
                changeUtc0 = ((LatestMarketInfoBean) pair.getSecond()).getChangeUtc8();
            } else {
                changeUtc0 = ((LatestMarketInfoBean) pair.getSecond()).getChange();
            }
            mUA muaValueOf2 = dexMarketDetailFragment.valueOf();
            if (muaValueOf2 != null) {
                muaValueOf2.AEQbTJ(changeUtc0);
            }
            mRW mrw = dexMarketDetailFragment.AhwBna;
            if (mrw != null) {
                mrw.AEQbTJ((LatestMarketInfoBean) pair.getSecond());
            }
            LatestMarketInfoBean latestMarketInfoBean3 = (LatestMarketInfoBean) pair.getSecond();
            mUA muaValueOf3 = dexMarketDetailFragment.valueOf();
            if (muaValueOf3 != null) {
                muaValueOf3.setShowTokenAddress(true ^ latestMarketInfoBean3.getNotSupportTxNativeToken());
            }
            dexMarketDetailFragment.fJNWhG = latestMarketInfoBean3;
            dexMarketDetailFragment.fIwbmz();
            dexMarketDetailFragment.gHZMYf();
            LatestMarketInfoBean latestMarketInfoBean4 = (LatestMarketInfoBean) pair.getSecond();
            Iterator<T> it = dexMarketDetailFragment.AEQbTJ.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(latestMarketInfoBean4);
            }
            dexMarketDetailFragment.AEQbTJ.clear();
            if (dexMarketDetailFragment.valueOf) {
                dexMarketDetailFragment.AuCTel();
            }
            if (dexMarketDetailFragment.fARcdN.length() > 0) {
                dexMarketDetailFragment.KWHzl(dexMarketDetailFragment.fARcdN);
                dexMarketDetailFragment.fARcdN = "";
            }
        } else {
            if (((LatestMarketInfoBean) pair.getSecond()).isWaitState()) {
                return Unit.INSTANCE;
            }
            if (((LatestMarketInfoBean) pair.getSecond()).isCoinNotSupport()) {
                dexMarketDetailFragment.AxsJAY();
            } else {
                dexMarketDetailFragment.zuBGHE();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        Intrinsics.copydefault(bool);
        dexMarketDetailFragment.AEQbTJ(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(DexMarketDetailFragment dexMarketDetailFragment, Unit unit) {
        dexMarketDetailFragment.dismissLoading();
        C55326xho.toastWithFailedIcon$default(C35964oKf.Fragment.dPnHjp, 0, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit values(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        if (bool.booleanValue()) {
            Context contextRequireContext = dexMarketDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            mUO.OLrzqt(contextRequireContext, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(DexMarketDetailFragment dexMarketDetailFragment, Boolean bool) {
        dexMarketDetailFragment.dismissLoading();
        if (bool.booleanValue()) {
            Context contextRequireContext = dexMarketDetailFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            mUO.OLrzqt(contextRequireContext, false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(DexMarketDetailFragment dexMarketDetailFragment, oNW onw, Boolean bool) {
        mRV mrv = dexMarketDetailFragment.copydefault;
        onw.AEQbTJ.setCurrentItem(C33129mqd.AhwBna(mrv != null ? mRE.subCheckS$default(Integer.valueOf(mrv.getItemCount()), 1, null, null, null, 14, null) : null), true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(DexMarketDetailFragment dexMarketDetailFragment, String str) {
        mUA muaValueOf = dexMarketDetailFragment.valueOf();
        if (muaValueOf != null) {
            Intrinsics.copydefault((Object) str);
            muaValueOf.KWHzl(str);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(oNW onw, Boolean bool) {
        onw.AEQbTJ.setUserInputEnabled(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DexMarketDetailFragment dexMarketDetailFragment, List list) {
        Pair<Boolean, LatestMarketInfoBean> value = dexMarketDetailFragment.uzCIH().AhwBna().getValue();
        if (value != null && value.getSecond() != null) {
            Overview overviewEZpvd = dexMarketDetailFragment.djBIcL().AEQbTJ().getValue().EZpvd();
            MemeInfo memeInfoEZpvd = overviewEZpvd != null ? overviewEZpvd.EZpvd() : null;
            Intrinsics.copydefault(list);
            dexMarketDetailFragment.djBIcL().AEQbTJ(C34607nfL.AEQbTJ(memeInfoEZpvd, list));
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return EZpvd(((Number) obj).intValue(), continuation);
        }

        public final Object EZpvd(int i, Continuation<? super Unit> continuation) {
            FragmentActivity activity = DexMarketDetailFragment.this.getActivity();
            if (activity == null) {
                return Unit.INSTANCE;
            }
            if (i >= 5) {
                final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                final DexMarketDetailFragment dexMarketDetailFragment = DexMarketDetailFragment.this;
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.zDGrpR));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.Dap));
                viewOnClickListenerC54939xaY.setCancelable(false);
                viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C35964oKf.Fragment.QbewEr), new View.OnClickListener() { // from class: o.mSt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        DexMarketDetailFragment.TaskDescription.EZpvd(viewOnClickListenerC54939xaY, dexMarketDetailFragment, view);
                    }
                });
                viewOnClickListenerC54939xaY.show();
            }
            return Unit.INSTANCE;
        }

        public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, DexMarketDetailFragment dexMarketDetailFragment, View view) {
            viewOnClickListenerC54939xaY.dismiss();
            FragmentActivity activity = dexMarketDetailFragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            AppCompatImageView appCompatImageViewEZpvd;
            mUA muaValueOf = DexMarketDetailFragment.this.valueOf();
            if (muaValueOf != null && (appCompatImageViewEZpvd = muaValueOf.EZpvd()) != null) {
                appCompatImageViewEZpvd.setVisibility(z ? 0 : 8);
                if (z) {
                    C34604nfI c34604nfIOLrzqt = C34498ndH.OLrzqt.OLrzqt();
                    Drawable drawableCopydefault = c34604nfIOLrzqt.copydefault();
                    if (drawableCopydefault != null) {
                        Integer numKWHzl = c34604nfIOLrzqt.KWHzl();
                        if (numKWHzl != null) {
                            DrawableCompat.setTint(drawableCopydefault, numKWHzl.intValue());
                        }
                    } else {
                        drawableCopydefault = null;
                    }
                    appCompatImageViewEZpvd.setImageDrawable(drawableCopydefault);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return AEQbTJ(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                DexMarketDetailFragment.this.fIwbmz();
            }
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(int i) {
        TokenBase tokenBase = this.iwGUEr;
        String tokenContractAddress = tokenBase != null ? tokenBase.getTokenContractAddress() : null;
        String str = tokenContractAddress == null ? "" : tokenContractAddress;
        TokenBase tokenBase2 = this.iwGUEr;
        String tokenSymbol = tokenBase2 != null ? tokenBase2.getTokenSymbol() : null;
        String str2 = tokenSymbol == null ? "" : tokenSymbol;
        TokenBase tokenBase3 = this.iwGUEr;
        String chainId = tokenBase3 != null ? tokenBase3.getChainId() : null;
        String str3 = chainId == null ? "" : chainId;
        TokenBase tokenBase4 = this.iwGUEr;
        String chainName = tokenBase4 != null ? tokenBase4.getChainName() : null;
        mRG.AEQbTJ(str, str2, str3, chainName == null ? "" : chainName, mRG.OLrzqt(i, this.gEmmrt), C33129mqd.gEmmrt(uzCIH().ejfBZ().getValue()), AubY(), (MLKEMEngine.KyberPolyBytes & 128) != 0 ? null : null, (MLKEMEngine.KyberPolyBytes & 256) != 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        C36059oNt c36059oNt;
        C33624mzv c33624mzv;
        C36059oNt c36059oNt2;
        C33624mzv c33624mzv2;
        C36059oNt c36059oNt3;
        C33624mzv c33624mzv3;
        C36059oNt c36059oNt4;
        C33624mzv c33624mzv4;
        int i = z ? C52761wXj.TaskDescription.addPreRequisiteCollector : C52761wXj.TaskDescription.invokespecialhrnhsO;
        oNW onw = (oNW) KWHzl();
        if (onw != null && (c36059oNt4 = onw.OLrzqt) != null && (c33624mzv4 = c36059oNt4.AEQbTJ) != null) {
            c33624mzv4.setSelected(z);
        }
        oNW onw2 = (oNW) KWHzl();
        if (onw2 != null && (c36059oNt3 = onw2.OLrzqt) != null && (c33624mzv3 = c36059oNt3.OLrzqt) != null) {
            c33624mzv3.setSelected(z);
        }
        oNW onw3 = (oNW) KWHzl();
        if (onw3 != null && (c36059oNt2 = onw3.OLrzqt) != null && (c33624mzv2 = c36059oNt2.AEQbTJ) != null) {
            pFQ.AEQbTJ(c33624mzv2, i);
        }
        oNW onw4 = (oNW) KWHzl();
        if (onw4 == null || (c36059oNt = onw4.OLrzqt) == null || (c33624mzv = c36059oNt.OLrzqt) == null) {
            return;
        }
        pFQ.AEQbTJ(c33624mzv, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        InterfaceC43033rhe interfaceC43033rhe;
        if (!pFP.isLogin$default(pFP.OLrzqt, null, 1, null)) {
            InterfaceC8104awT interfaceC8104awT = (InterfaceC8104awT) C43251rlk.copydefault(InterfaceC8104awT.class);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, contextRequireContext, null, 2, null);
            return;
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (uzCIH().getNewProxyInstance() || this.valueOf) {
            AwvSrB();
        } else {
            TokenInfoForAlert tokenInfoForAlertFetchVPNInfo = fetchVPNInfo();
            if (tokenInfoForAlertFetchVPNInfo != null && (interfaceC43033rhe = (InterfaceC43033rhe) C43251rlk.OLrzqt(InterfaceC43033rhe.class)) != null) {
                InterfaceC43033rhe.StateListAnimator.gotoAllPriceRemindActivity$default(interfaceC43033rhe, context, null, tokenInfoForAlertFetchVPNInfo, 2, null);
            }
        }
        trackPageClick$default(this, null, null, null, null, Boolean.TRUE, null, null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, null);
    }

    private final void AwvSrB() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DexMarketDetailFragment$showPriceAlert$1(this, context, null), 3, null);
    }

    public final TokenInfoForAlert fetchVPNInfo() {
        Pair<Boolean, LatestMarketInfoBean> value = uzCIH().AhwBna().getValue();
        LatestMarketInfoBean second = value != null ? value.getSecond() : null;
        if (second == null) {
            return null;
        }
        TokenBase tokenBase = this.iwGUEr;
        String chainId = tokenBase != null ? tokenBase.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        return new TokenInfoForAlert(chainId, second.getChainName(), second.getTokenContractAddress(), second.getTokenLogoUrl(), second.getChainLogoUrl(), StringsKt__StringsKt.hDKMBd((CharSequence) second.getTokenSymbol()).toString(), second.getPrice(), second.getMarketCap(), true, 0, 512, null);
    }

    public final void DbNXlk() {
        if (AhwBna().EZpvd().getValue().intValue() >= 3 && C36236oUh.EZpvd.zsXlph()) {
            Context context = getContext();
            if (context != null) {
                pES.EZpvd.OLrzqt(context, new Function1() { // from class: o.mSs
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DexMarketDetailFragment.OLrzqt(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
                return;
            }
            return;
        }
        AkhnZx();
    }

    public static final Unit OLrzqt(DexMarketDetailFragment dexMarketDetailFragment, boolean z) {
        dexMarketDetailFragment.AkhnZx();
        if (z) {
            C36236oUh.EZpvd.AEQbTJ(false);
        }
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        Context context;
        String chainId;
        String tokenContractAddress;
        Pair<Boolean, LatestMarketInfoBean> value = uzCIH().AhwBna().getValue();
        if (value != null && value.getSecond() != null && (context = getContext()) != null) {
            C56104xwX c56104xwX = C56104xwX.AEQbTJ;
            TokenBase tokenBase = this.iwGUEr;
            if (tokenBase == null || (chainId = tokenBase.getChainId()) == null) {
                chainId = "";
            }
            TokenBase tokenBase2 = this.iwGUEr;
            if (tokenBase2 == null || (tokenContractAddress = tokenBase2.getTokenContractAddress()) == null) {
                tokenContractAddress = "";
            }
            c56104xwX.AEQbTJ(context, chainId, tokenContractAddress, "dex_kline_page", AubY());
        }
        trackPageClick$default(this, null, null, null, null, null, Boolean.TRUE, null, 95, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRY
    public void copydefault(int i) {
        mUA muaValueOf;
        if (((oNW) KWHzl()) == null || (muaValueOf = valueOf()) == null) {
            return;
        }
        muaValueOf.OLrzqt(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwGUEr() {
        CoinDetailRedirection coinDetailRedirection;
        Bundle arguments = getArguments();
        if (arguments == null || (coinDetailRedirection = (CoinDetailRedirection) arguments.getParcelable("coin_detail_redirection")) == null) {
            return;
        }
        if (ActionBar.EZpvd[coinDetailRedirection.getType().ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        OLrzqt(coinDetailRedirection.getValue());
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.remove("coin_detail_redirection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        C36059oNt c36059oNt;
        LinearLayout linearLayout;
        C36059oNt c36059oNt2;
        LinearLayout linearLayout2;
        C36059oNt c36059oNt3;
        LinearLayout linearLayout3;
        C36059oNt c36059oNt4;
        LinearLayout linearLayout4;
        if (z) {
            oNW onw = (oNW) KWHzl();
            if (onw != null && (c36059oNt4 = onw.OLrzqt) != null && (linearLayout4 = c36059oNt4.KWHzl) != null) {
                linearLayout4.setVisibility(0);
            }
            oNW onw2 = (oNW) KWHzl();
            if (onw2 == null || (c36059oNt3 = onw2.OLrzqt) == null || (linearLayout3 = c36059oNt3.EZpvd) == null) {
                return;
            }
            linearLayout3.setVisibility(8);
            return;
        }
        oNW onw3 = (oNW) KWHzl();
        if (onw3 != null && (c36059oNt2 = onw3.OLrzqt) != null && (linearLayout2 = c36059oNt2.KWHzl) != null) {
            linearLayout2.setVisibility(8);
        }
        oNW onw4 = (oNW) KWHzl();
        if (onw4 == null || (c36059oNt = onw4.OLrzqt) == null || (linearLayout = c36059oNt.EZpvd) == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.mRH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        List<View> listKWHzl;
        oNW onw = (oNW) KWHzl();
        if (onw != null) {
            onw.copydefault.copydefault().clearOnTabSelectedListeners();
            onw.AEQbTJ.unregisterOnPageChangeCallback(this.isConnected);
            onw.AEQbTJ.setAdapter(null);
        }
        mUA muaValueOf = valueOf();
        if (muaValueOf != null && (listKWHzl = muaValueOf.KWHzl()) != null) {
            Iterator<T> it = listKWHzl.iterator();
            while (it.hasNext()) {
                mUO.setOnDoubleCheckClickListener$default((View) it.next(), 0L, new Function1() { // from class: o.mSo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return DexMarketDetailFragment.KWHzl((android.view.View) obj);
                    }
                }, 1, null);
            }
        }
        this.copydefault = null;
        this.AhwBna = null;
        super.onDestroyView();
    }

    public static final Unit KWHzl(View view) {
        Intrinsics.checkNotNullParameter(view, "");
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ DexMarketDetailFragment newInstance$default(StateListAnimator stateListAnimator, TokenBase tokenBase, String str, String str2, CoinDetailRedirection coinDetailRedirection, boolean z, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                coinDetailRedirection = null;
            }
            CoinDetailRedirection coinDetailRedirection2 = coinDetailRedirection;
            if ((i & 16) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                str3 = "";
            }
            return stateListAnimator.OLrzqt(tokenBase, str, str2, coinDetailRedirection2, z2, str3);
        }

        public final DexMarketDetailFragment OLrzqt(@NotNull TokenBase tokenBase, @NotNull String str, @NotNull String str2, CoinDetailRedirection coinDetailRedirection, boolean z, String str3) {
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            DexMarketDetailFragment dexMarketDetailFragment = new DexMarketDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("token_base", tokenBase);
            C34656ngH.AEQbTJ(bundle, str);
            bundle.putString("key.page_from", str2);
            bundle.putParcelable("coin_detail_redirection", coinDetailRedirection);
            bundle.putBoolean("is_show_price_alert", z);
            bundle.putString("firstTab", str3);
            dexMarketDetailFragment.setArguments(bundle);
            return dexMarketDetailFragment;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC13655dTj
    public void copydefault() {
        C55113xdn c55113xdn;
        oNW onw = (oNW) KWHzl();
        if (onw == null || (c55113xdn = onw.gEmmrt) == null) {
            return;
        }
        c55113xdn.KWHzl(0L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC13655dTj
    public void AEQbTJ() {
        C55113xdn c55113xdn;
        oNW onw = (oNW) KWHzl();
        if (onw == null || (c55113xdn = onw.gEmmrt) == null) {
            return;
        }
        c55113xdn.copydefault();
    }

    public final mUA valueOf() {
        C38685peB c38685peBAYXKKw = AYXKKw();
        if (c38685peBAYXKKw != null) {
            return c38685peBAYXKKw.isConnected();
        }
        return null;
    }

    public final C38685peB AYXKKw() {
        FragmentActivity activity = getActivity();
        ActivityC38834pgs activityC38834pgs = activity instanceof ActivityC38834pgs ? (ActivityC38834pgs) activity : null;
        if (activityC38834pgs != null) {
            return activityC38834pgs.valueOf();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final int gEmmrt() {
        C36059oNt c36059oNt;
        LinearLayoutCompat linearLayoutCompat;
        oNW onw = (oNW) KWHzl();
        if (onw == null || (c36059oNt = onw.OLrzqt) == null || (linearLayoutCompat = c36059oNt.copydefault) == null) {
            return 0;
        }
        return linearLayoutCompat.getMeasuredHeight();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(String str) {
        Object objM7377constructorimpl;
        oNW onw;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        RecyclerView.Adapter adapter;
        try {
            Result.Application application = Result.Companion;
            int iCopydefault = copydefault(str);
            if (iCopydefault > -1) {
                oNW onw2 = (oNW) KWHzl();
                if (iCopydefault < ((onw2 == null || (viewPager22 = onw2.AEQbTJ) == null || (adapter = viewPager22.getAdapter()) == null) ? 0 : adapter.getItemCount()) && (onw = (oNW) KWHzl()) != null && (viewPager2 = onw.AEQbTJ) != null) {
                    viewPager2.setCurrentItem(iCopydefault, false);
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            getTAG();
            thM7380exceptionOrNullimpl.getMessage();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [909=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final int copydefault(String str) {
        CoinDetailTabType coinDetailTabType;
        switch (str.hashCode()) {
            case 3076010:
                coinDetailTabType = !str.equals("data") ? null : CoinDetailTabType.DATA;
                break;
            case 3138974:
                coinDetailTabType = !str.equals("feed") ? null : CoinDetailTabType.FEEDS;
                break;
            case 3237038:
                coinDetailTabType = !str.equals("info") ? null : CoinDetailTabType.INFO;
                break;
            case 3500751:
                coinDetailTabType = !str.equals(VerifyDAppDomainResponse.LEVEL_RISK) ? null : CoinDetailTabType.ASSESSMENT;
                break;
            default:
                coinDetailTabType = null;
                break;
        }
        if (coinDetailTabType != null) {
            mRV mrv = this.copydefault;
            mRU mru = mrv instanceof mRU ? (mRU) mrv : null;
            Integer numValueOf = mru != null ? Integer.valueOf(mru.KWHzl(coinDetailTabType)) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }
}
