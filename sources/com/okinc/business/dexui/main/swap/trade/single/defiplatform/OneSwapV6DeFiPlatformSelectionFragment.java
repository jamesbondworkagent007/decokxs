package com.okinc.business.dexui.main.swap.trade.single.defiplatform;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.DexPairInfo;
import com.okinc.business.dex.trade.core.domain.model.DexRouter;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.route.dag.model.DexEdgeItem;
import com.okinc.business.dexui.main.swap.route.dag.model.DexRouteUIModel;
import com.okinc.business.dexui.main.swap.route.dag.model.UiPoolInfoModel;
import com.okinc.business.dexui.main.swap.route.dag.model.UiTokenInfoModel;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.adapter.DeFiPlatformListAdapter;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC22407hel;
import o.AbstractC25021iop;
import o.C21670hHz;
import o.C22372heC;
import o.C22380heK;
import o.C22416heu;
import o.C23274hvD;
import o.C24410idM;
import o.C24694iif;
import o.C24695iig;
import o.C24994ioO;
import o.C25352ivB;
import o.C25382ivf;
import o.C25390ivn;
import o.C25452iww;
import o.C31200lpY;
import o.C32866mlf;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C52761wXj;
import o.C55173xeu;
import o.C55296xhK;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56443yFo;
import o.C56524yIo;
import o.InterfaceC24993ioN;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC54939xaY;
import o.pTB;
import o.pTD;
import o.pUU;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yHO;
import o.yHT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class OneSwapV6DeFiPlatformSelectionFragment extends AbstractC25021iop {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public yHT<? super String, ? super String, ? super V6BaseQuoteResponse, ? super Boolean, Unit> AYXKKw;
    public final ActivityResultLauncher<DexRouteUIModel> AhwBna;
    public boolean AuCTel;
    public boolean DbNXlk;
    public Job djBIcL;
    public String ejfBZ;

    @yCM
    public C25452iww eventTrackUtils;
    public String fARcdN;
    public boolean fJNWhG;
    public V6BaseQuoteResponse fetchVPNInfo;
    public final InterfaceC56387yDm getNewProxyInstance;
    public V6QuoteRequestWrapper isConnected;

    @yCM
    public C24994ioO strategy;
    public C21670hHz valueOf;
    public DeFiPlatformListAdapter values;
    public final InterfaceC56387yDm fIwbmz = C31200lpY.copydefault(this);
    public DeFiPlatformSelectionSource AkhnZx = DeFiPlatformSelectionSource.UNKNOWN;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DeFiPlatformSelectionSource.values().length];
            try {
                iArr[DeFiPlatformSelectionSource.ADVANCED_MODE_BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeFiPlatformSelectionSource.MEME_MODE_BUY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeFiPlatformSelectionSource.ADVANCED_MODE_SELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeFiPlatformSelectionSource.MEME_MODE_SELL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    public static final void KWHzl(Unit unit) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.OGitdB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    public OneSwapV6DeFiPlatformSelectionFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$special$$inlined$viewModels$default$2
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
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OneSwapV6DeFiPlatformSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = true;
        ActivityResultLauncher<DexRouteUIModel> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new C24410idM(), new ActivityResultCallback() { // from class: o.iov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                OneSwapV6DeFiPlatformSelectionFragment.KWHzl((Unit) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.AhwBna = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String isConnected() {
        return (String) this.fIwbmz.getValue();
    }

    public final OneSwapV6DeFiPlatformSelectionViewModel djBIcL() {
        return (OneSwapV6DeFiPlatformSelectionViewModel) this.getNewProxyInstance.getValue();
    }

    public final C24994ioO AYXKKw() {
        C24994ioO c24994ioO = this.strategy;
        if (c24994ioO != null) {
            return c24994ioO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C25452iww gEmmrt() {
        C25452iww c25452iww = this.eventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Object serializable;
        Intrinsics.checkNotNullParameter(view, "");
        C32866mlf.onEvent$default("DEXSwap_Swap_ProviderList_View", (TrackChannel[]) null, new Function1() { // from class: o.iow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OneSwapV6DeFiPlatformSelectionFragment.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (Object) null);
        this.valueOf = C21670hHz.OLrzqt(view);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.fARcdN = arguments.getString("selected_de_fi_platform_id");
            this.ejfBZ = arguments.getString("selected_de_fi_platform_name");
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("de_fi_platform_selection_source", DeFiPlatformSelectionSource.class);
            } else {
                serializable = (DeFiPlatformSelectionSource) arguments.getSerializable("de_fi_platform_selection_source");
            }
            DeFiPlatformSelectionSource deFiPlatformSelectionSource = (DeFiPlatformSelectionSource) serializable;
            if (deFiPlatformSelectionSource == null) {
                deFiPlatformSelectionSource = DeFiPlatformSelectionSource.UNKNOWN;
            }
            this.AkhnZx = deFiPlatformSelectionSource;
            this.isConnected = (V6QuoteRequestWrapper) ((Parcelable) BundleCompat.getParcelable(arguments, "quote_price_request_object", V6QuoteRequestWrapper.class));
            this.fetchVPNInfo = (V6BaseQuoteResponse) ((Parcelable) BundleCompat.getParcelable(arguments, "quote_price_response_object", V6BaseQuoteResponse.class));
            arguments.remove("quote_price_request_object");
            arguments.remove("quote_price_response_object");
        }
        AkhnZx();
    }

    public final void AkhnZx() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        yHT<? super String, ? super String, ? super V6BaseQuoteResponse, ? super Boolean, Unit> yht;
        ConstraintLayout constraintLayoutOLrzqt;
        DeFiPlatformSelectionSource deFiPlatformSelectionSource = this.AkhnZx;
        if (deFiPlatformSelectionSource != DeFiPlatformSelectionSource.MEME_MODE_BUY && deFiPlatformSelectionSource != DeFiPlatformSelectionSource.MEME_MODE_SELL) {
            C25452iww c25452iwwGEmmrt = gEmmrt();
            V6BaseQuoteResponse v6BaseQuoteResponse = this.fetchVPNInfo;
            String chainId = v6BaseQuoteResponse != null ? AYXKKw().OLrzqt(v6BaseQuoteResponse).getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            c25452iwwGEmmrt.OLrzqt(new AbstractC22407hel.LoaderManager(chainId, "provider_list", this.AkhnZx.getBusinessType(), TrackOrderType.SWAP.getType(), AhwBna()));
        }
        V6BaseQuoteResponse v6BaseQuoteResponse2 = this.fetchVPNInfo;
        if (v6BaseQuoteResponse2 == null) {
            pUU.copydefault("OneSwapV6DeFiPlatformSelectionFragment", "quoteResponse is null, cannot proceed");
            if (this.isConnected == null) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            C21670hHz c21670hHz = this.valueOf;
            if (c21670hHz == null || (constraintLayoutOLrzqt = c21670hHz.getRoot()) == null) {
                return;
            }
            constraintLayoutOLrzqt.post(new Runnable() { // from class: o.ioD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    OneSwapV6DeFiPlatformSelectionFragment.fARcdN(this.EZpvd);
                }
            });
            return;
        }
        if (v6BaseQuoteResponse2 != null && (yht = this.AYXKKw) != null) {
            String str = this.fARcdN;
            Intrinsics.copydefault((Object) str);
            String str2 = this.ejfBZ;
            Intrinsics.copydefault((Object) str2);
            yht.invoke(str, str2, v6BaseQuoteResponse2, Boolean.FALSE);
        }
        values();
        DbNXlk();
        valueOf();
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJValueOf2 = c22380heK.copydefault("default_trade").fARcdN().valueOf();
        if ((interfaceC9738bbJValueOf2 == null || !interfaceC9738bbJValueOf2.getFieldNames()) && ((interfaceC9738bbJValueOf = c22380heK.copydefault("default_trade").fARcdN().valueOf()) == null || !interfaceC9738bbJValueOf.ORxRYg())) {
            C21670hHz c21670hHz2 = this.valueOf;
            if (c21670hHz2 != null && (frameLayout = c21670hHz2.AEQbTJ) != null) {
                frameLayout.setVisibility(0);
            }
            OLrzqt();
            return;
        }
        C21670hHz c21670hHz3 = this.valueOf;
        if (c21670hHz3 == null || (frameLayout2 = c21670hHz3.AEQbTJ) == null) {
            return;
        }
        frameLayout2.setVisibility(4);
    }

    public static final void fARcdN(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        oneSwapV6DeFiPlatformSelectionFragment.OLrzqt();
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ OneSwapV6DeFiPlatformSelectionFragment KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(View view, long j, OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = oneSwapV6DeFiPlatformSelectionFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.KWHzl((Map<String, String>) C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "router_explain")));
                Context contextRequireContext = this.KWHzl.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.DGUQLIhJrIAr));
                viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.setRepeatMode));
                String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ OneSwapV6DeFiPlatformSelectionFragment AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(View view, long j, OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = oneSwapV6DeFiPlatformSelectionFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl((Map<String, String>) C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "provider_list_close")));
                this.AEQbTJ.requireActivity().getOnBackPressedDispatcher().onBackPressed();
            }
        }
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ OneSwapV6DeFiPlatformSelectionFragment EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(View view, long j, OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = oneSwapV6DeFiPlatformSelectionFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.copydefault("refresh");
                this.EZpvd.KWHzl((Map<String, String>) C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "quote_refresh")));
                Job job = this.EZpvd.djBIcL;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                this.EZpvd.OLrzqt();
            }
        }
    }

    private final void values() {
        FrameLayout frameLayout;
        ImageView imageView;
        ImageView imageView2;
        RecyclerView recyclerView;
        View view;
        ViewGroup.LayoutParams layoutParams;
        C21670hHz c21670hHz = this.valueOf;
        if (c21670hHz != null && (view = c21670hHz.values) != null && (layoutParams = view.getLayoutParams()) != null) {
            layoutParams.height = C33570myu.gEmmrt(requireContext());
        }
        String strIsConnected = isConnected();
        V6BaseQuoteResponse v6BaseQuoteResponse = this.fetchVPNInfo;
        DeFiPlatformListAdapter deFiPlatformListAdapter = null;
        this.values = new DeFiPlatformListAdapter(strIsConnected, v6BaseQuoteResponse != null ? AYXKKw().AhwBna(v6BaseQuoteResponse) : null, new yHO() { // from class: o.ioC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return OneSwapV6DeFiPlatformSelectionFragment.EZpvd(this.KWHzl, (java.lang.String) obj, (java.lang.String) obj2, ((java.lang.Boolean) obj3).booleanValue());
            }
        }, new Function0() { // from class: o.ioz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OneSwapV6DeFiPlatformSelectionFragment.getFieldNames(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.ioA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OneSwapV6DeFiPlatformSelectionFragment.iwGUEr(this.EZpvd);
            }
        }, new Function0() { // from class: o.ioE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OneSwapV6DeFiPlatformSelectionFragment.getNewProxyInstance(this.OLrzqt);
            }
        }, new Function0() { // from class: o.ioH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OneSwapV6DeFiPlatformSelectionFragment.hDKMBd(this.OLrzqt);
            }
        });
        C21670hHz c21670hHz2 = this.valueOf;
        if (c21670hHz2 != null && (recyclerView = c21670hHz2.gEmmrt) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            DeFiPlatformListAdapter deFiPlatformListAdapter2 = this.values;
            if (deFiPlatformListAdapter2 == null) {
                Intrinsics.gEmmrt("");
                deFiPlatformListAdapter2 = null;
            }
            recyclerView.setAdapter(deFiPlatformListAdapter2);
        }
        V6BaseQuoteResponse v6BaseQuoteResponse2 = this.fetchVPNInfo;
        if (v6BaseQuoteResponse2 != null) {
            DeFiPlatformListAdapter deFiPlatformListAdapter3 = this.values;
            if (deFiPlatformListAdapter3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                deFiPlatformListAdapter = deFiPlatformListAdapter3;
            }
            deFiPlatformListAdapter.submitList(mapToDeFiProviderListItem$default(this, AYXKKw().copydefault(v6BaseQuoteResponse2), AYXKKw().EZpvd(v6BaseQuoteResponse2), null, 2, null));
        }
        C21670hHz c21670hHz3 = this.valueOf;
        if (c21670hHz3 != null && (imageView2 = c21670hHz3.copydefault) != null) {
            imageView2.setOnClickListener(new FragmentManager(imageView2, 1000L, this));
        }
        C21670hHz c21670hHz4 = this.valueOf;
        if (c21670hHz4 != null && (imageView = c21670hHz4.EZpvd) != null) {
            imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
        }
        C21670hHz c21670hHz5 = this.valueOf;
        if (c21670hHz5 == null || (frameLayout = c21670hHz5.AEQbTJ) == null) {
            return;
        }
        frameLayout.setOnClickListener(new LoaderManager(frameLayout, 1000L, this));
    }

    public static final Unit EZpvd(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        oneSwapV6DeFiPlatformSelectionFragment.KWHzl(C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "provider_select"), C56390yDp.OLrzqt("selected_provider", str2)));
        oneSwapV6DeFiPlatformSelectionFragment.copydefault("provider_card");
        yHT<? super String, ? super String, ? super V6BaseQuoteResponse, ? super Boolean, Unit> yht = oneSwapV6DeFiPlatformSelectionFragment.AYXKKw;
        if (yht != null) {
            V6BaseQuoteResponse v6BaseQuoteResponse = oneSwapV6DeFiPlatformSelectionFragment.fetchVPNInfo;
            Intrinsics.copydefault(v6BaseQuoteResponse);
            yht.invoke(str, str2, v6BaseQuoteResponse, Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        DexRouteUIModel dexRouteUIModel;
        Object next;
        List<DexRouter> dexRouterList;
        oneSwapV6DeFiPlatformSelectionFragment.KWHzl(C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "route_click")));
        oneSwapV6DeFiPlatformSelectionFragment.copydefault("okxdex_router");
        V6BaseQuoteResponse v6BaseQuoteResponse = oneSwapV6DeFiPlatformSelectionFragment.fetchVPNInfo;
        if (v6BaseQuoteResponse != null) {
            Iterator<T> it = oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().copydefault(v6BaseQuoteResponse).iterator();
            while (true) {
                dexRouteUIModel = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (Object) "11")) {
                    break;
                }
            }
            DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) next;
            ActivityResultLauncher<DexRouteUIModel> activityResultLauncher = oneSwapV6DeFiPlatformSelectionFragment.AhwBna;
            if (defiPlatformInfo != null && (dexRouterList = defiPlatformInfo.getDexRouterList()) != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(dexRouterList, 10));
                for (DexRouter dexRouter : dexRouterList) {
                    DexPairInfo dexPairInfo = dexRouter.getDexPairInfo();
                    String percent = dexPairInfo != null ? dexPairInfo.getPercent() : null;
                    String str = "";
                    String str2 = percent == null ? "" : percent;
                    DexMultiTokenInfoBean fromToken = dexRouter.getFromToken();
                    String tokenSymbol = fromToken != null ? fromToken.getTokenSymbol() : null;
                    if (tokenSymbol == null) {
                        tokenSymbol = "";
                    }
                    DexMultiTokenInfoBean fromToken2 = dexRouter.getFromToken();
                    String tokenContractAddress = fromToken2 != null ? fromToken2.getTokenContractAddress() : null;
                    if (tokenContractAddress == null) {
                        tokenContractAddress = "";
                    }
                    DexMultiTokenInfoBean fromToken3 = dexRouter.getFromToken();
                    String tokenLogoUrl = fromToken3 != null ? fromToken3.getTokenLogoUrl() : null;
                    if (tokenLogoUrl == null) {
                        tokenLogoUrl = "";
                    }
                    DexMultiTokenInfoBean fromToken4 = dexRouter.getFromToken();
                    String chainLogoUrl = fromToken4 != null ? fromToken4.getChainLogoUrl() : null;
                    if (chainLogoUrl == null) {
                        chainLogoUrl = "";
                    }
                    UiTokenInfoModel uiTokenInfoModel = new UiTokenInfoModel(tokenSymbol, tokenContractAddress, tokenLogoUrl, chainLogoUrl);
                    DexMultiTokenInfoBean toToken = dexRouter.getToToken();
                    String tokenSymbol2 = toToken != null ? toToken.getTokenSymbol() : null;
                    if (tokenSymbol2 == null) {
                        tokenSymbol2 = "";
                    }
                    DexMultiTokenInfoBean toToken2 = dexRouter.getToToken();
                    String tokenContractAddress2 = toToken2 != null ? toToken2.getTokenContractAddress() : null;
                    if (tokenContractAddress2 == null) {
                        tokenContractAddress2 = "";
                    }
                    DexMultiTokenInfoBean toToken3 = dexRouter.getToToken();
                    String tokenLogoUrl2 = toToken3 != null ? toToken3.getTokenLogoUrl() : null;
                    if (tokenLogoUrl2 == null) {
                        tokenLogoUrl2 = "";
                    }
                    DexMultiTokenInfoBean toToken4 = dexRouter.getToToken();
                    String chainLogoUrl2 = toToken4 != null ? toToken4.getChainLogoUrl() : null;
                    if (chainLogoUrl2 == null) {
                        chainLogoUrl2 = "";
                    }
                    UiTokenInfoModel uiTokenInfoModel2 = new UiTokenInfoModel(tokenSymbol2, tokenContractAddress2, tokenLogoUrl2, chainLogoUrl2);
                    String fromIndex = dexRouter.getFromIndex();
                    String str3 = fromIndex == null ? "" : fromIndex;
                    String toIndex = dexRouter.getToIndex();
                    String str4 = toIndex == null ? "" : toIndex;
                    DexPairInfo dexPairInfo2 = dexRouter.getDexPairInfo();
                    String percent2 = dexPairInfo2 != null ? dexPairInfo2.getPercent() : null;
                    if (percent2 == null) {
                        percent2 = "";
                    }
                    DexPairInfo dexPairInfo3 = dexRouter.getDexPairInfo();
                    String okLinkUrl = dexPairInfo3 != null ? dexPairInfo3.getOkLinkUrl() : null;
                    if (okLinkUrl == null) {
                        okLinkUrl = "";
                    }
                    DexPairInfo dexPairInfo4 = dexRouter.getDexPairInfo();
                    String dexName = dexPairInfo4 != null ? dexPairInfo4.getDexName() : null;
                    if (dexName == null) {
                        dexName = "";
                    }
                    DexPairInfo dexPairInfo5 = dexRouter.getDexPairInfo();
                    String poolAddress = dexPairInfo5 != null ? dexPairInfo5.getPoolAddress() : null;
                    if (poolAddress != null) {
                        str = poolAddress;
                    }
                    arrayList.add(new DexEdgeItem(str2, str3, str4, uiTokenInfoModel, uiTokenInfoModel2, new UiPoolInfoModel(percent2, okLinkUrl, dexName, str)));
                }
                dexRouteUIModel = new DexRouteUIModel(arrayList);
            }
            activityResultLauncher.launch(dexRouteUIModel);
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        oneSwapV6DeFiPlatformSelectionFragment.KWHzl(C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "liquidity_explain")));
        Context contextRequireContext = oneSwapV6DeFiPlatformSelectionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.DfrfUJ));
        String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        oneSwapV6DeFiPlatformSelectionFragment.KWHzl(C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "liquidity_enter")));
        V6BaseQuoteResponse v6BaseQuoteResponse = oneSwapV6DeFiPlatformSelectionFragment.fetchVPNInfo;
        if (v6BaseQuoteResponse != null) {
            Context contextRequireContext = oneSwapV6DeFiPlatformSelectionFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C25352ivB.OLrzqt(contextRequireContext, oneSwapV6DeFiPlatformSelectionFragment.isConnected(), oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().OLrzqt(v6BaseQuoteResponse).getChainId(), true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        Context contextRequireContext = oneSwapV6DeFiPlatformSelectionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.DlABUU));
        String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return EZpvd((InterfaceC24993ioN) obj, (Continuation<? super Unit>) continuation);
        }

        public final Object EZpvd(InterfaceC24993ioN interfaceC24993ioN, Continuation<? super Unit> continuation) {
            RecyclerView recyclerView;
            C55173xeu c55173xeu;
            C55173xeu c55173xeu2;
            C55173xeu c55173xeu3;
            C55173xeu c55173xeu4;
            C55173xeu c55173xeu5;
            C55173xeu c55173xeu6;
            RecyclerView recyclerView2;
            C55173xeu c55173xeu7;
            C55173xeu c55173xeu8;
            C55173xeu c55173xeu9;
            C55173xeu c55173xeu10;
            C55173xeu c55173xeu11;
            RecyclerView recyclerView3;
            CircularProgressIndicator circularProgressIndicator;
            ImageView imageView;
            FrameLayout frameLayout;
            C21670hHz c21670hHz;
            RecyclerView recyclerView4;
            if (!(interfaceC24993ioN instanceof InterfaceC24993ioN.TaskDescription)) {
                DeFiPlatformListAdapter deFiPlatformListAdapter = null;
                Drawable drawable = null;
                if (interfaceC24993ioN instanceof InterfaceC24993ioN.Application) {
                    V6BaseQuoteResponse v6BaseQuoteResponse = OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo;
                    if (v6BaseQuoteResponse != null && OneSwapV6DeFiPlatformSelectionFragment.this.AYXKKw().copydefault(v6BaseQuoteResponse).isEmpty() && (c21670hHz = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf) != null && (recyclerView4 = c21670hHz.gEmmrt) != null) {
                        recyclerView4.setVisibility(8);
                    }
                    C21670hHz c21670hHz2 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz2 != null && (frameLayout = c21670hHz2.AEQbTJ) != null) {
                        frameLayout.setClickable(false);
                    }
                    C21670hHz c21670hHz3 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz3 != null && (imageView = c21670hHz3.AhwBna) != null) {
                        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.iFnJKK);
                        if (drawableKWHzl != null) {
                            drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
                            drawable = drawableKWHzl;
                        }
                        imageView.setImageDrawable(drawable);
                    }
                    C21670hHz c21670hHz4 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz4 != null && (circularProgressIndicator = c21670hHz4.djBIcL) != null) {
                        circularProgressIndicator.setIndicatorColor(C25382ivf.KWHzl(C52761wXj.Activity.UlJrfe));
                    }
                } else if (interfaceC24993ioN instanceof InterfaceC24993ioN.Activity) {
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) OneSwapV6DeFiPlatformSelectionFragment.this, false, (String) null, 2, (Object) null);
                    C21670hHz c21670hHz5 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz5 != null && (recyclerView3 = c21670hHz5.gEmmrt) != null) {
                        recyclerView3.setVisibility(8);
                    }
                    C21670hHz c21670hHz6 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz6 != null && (c55173xeu11 = c21670hHz6.KWHzl) != null) {
                        c55173xeu11.setVisibility(0);
                    }
                    C21670hHz c21670hHz7 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz7 != null && (c55173xeu10 = c21670hHz7.KWHzl) != null) {
                        c55173xeu10.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.onSessionEvent));
                    }
                    C21670hHz c21670hHz8 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz8 != null && (c55173xeu9 = c21670hHz8.KWHzl) != null) {
                        c55173xeu9.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.onAudioInfoChanged));
                    }
                    C21670hHz c21670hHz9 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz9 != null && (c55173xeu8 = c21670hHz9.KWHzl) != null) {
                        c55173xeu8.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp));
                    }
                    C21670hHz c21670hHz10 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz10 != null && (c55173xeu7 = c21670hHz10.KWHzl) != null) {
                        final OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment = OneSwapV6DeFiPlatformSelectionFragment.this;
                        c55173xeu7.setRetryClickListener(new View.OnClickListener() { // from class: o.ioI
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                OneSwapV6DeFiPlatformSelectionFragment.ActionBar.EZpvd(oneSwapV6DeFiPlatformSelectionFragment, view);
                            }
                        });
                    }
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo = null;
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo();
                } else if (interfaceC24993ioN instanceof InterfaceC24993ioN.StateListAnimator) {
                    if (OneSwapV6DeFiPlatformSelectionFragment.this.AuCTel) {
                        C55326xho.toast$default(OneSwapV6DeFiPlatformSelectionFragment.this.getString(C23274hvD.Fragment.DrNnAm), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        OneSwapV6DeFiPlatformSelectionFragment.this.AuCTel = false;
                    }
                    C21670hHz c21670hHz11 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz11 != null && (recyclerView2 = c21670hHz11.gEmmrt) != null) {
                        recyclerView2.setVisibility(8);
                    }
                    C21670hHz c21670hHz12 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz12 != null && (c55173xeu6 = c21670hHz12.KWHzl) != null) {
                        c55173xeu6.setVisibility(0);
                    }
                    C21670hHz c21670hHz13 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz13 != null && (c55173xeu5 = c21670hHz13.KWHzl) != null) {
                        c55173xeu5.setTitle("");
                    }
                    C21670hHz c21670hHz14 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz14 != null && (c55173xeu4 = c21670hHz14.KWHzl) != null) {
                        c55173xeu4.setSubTitle((CharSequence) OneSwapV6DeFiPlatformSelectionFragment.this.KWHzl(((InterfaceC24993ioN.StateListAnimator) interfaceC24993ioN).KWHzl()));
                    }
                    C21670hHz c21670hHz15 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz15 != null && (c55173xeu3 = c21670hHz15.KWHzl) != null) {
                        c55173xeu3.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.uzCIH));
                    }
                    C21670hHz c21670hHz16 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz16 != null && (c55173xeu2 = c21670hHz16.KWHzl) != null) {
                        final OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment2 = OneSwapV6DeFiPlatformSelectionFragment.this;
                        c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.ioG
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                OneSwapV6DeFiPlatformSelectionFragment.ActionBar.KWHzl(oneSwapV6DeFiPlatformSelectionFragment2, view);
                            }
                        });
                    }
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo = null;
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo();
                } else {
                    if (!(interfaceC24993ioN instanceof InterfaceC24993ioN.ActionBar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) OneSwapV6DeFiPlatformSelectionFragment.this, true, (String) null, 2, (Object) null);
                    OneSwapV6DeFiPlatformSelectionFragment.this.AuCTel = true;
                    OneSwapV6DeFiPlatformSelectionFragment.this.fJNWhG = true;
                    C21670hHz c21670hHz17 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz17 != null && (c55173xeu = c21670hHz17.KWHzl) != null) {
                        c55173xeu.setVisibility(8);
                    }
                    C21670hHz c21670hHz18 = OneSwapV6DeFiPlatformSelectionFragment.this.valueOf;
                    if (c21670hHz18 != null && (recyclerView = c21670hHz18.gEmmrt) != null) {
                        recyclerView.setVisibility(0);
                    }
                    InterfaceC24993ioN.ActionBar actionBar = (InterfaceC24993ioN.ActionBar) interfaceC24993ioN;
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo = actionBar.KWHzl();
                    C24994ioO c24994ioOAYXKKw = OneSwapV6DeFiPlatformSelectionFragment.this.AYXKKw();
                    V6BaseQuoteResponse v6BaseQuoteResponseKWHzl = actionBar.KWHzl();
                    String str = OneSwapV6DeFiPlatformSelectionFragment.this.fARcdN;
                    if (str == null) {
                        str = "";
                    }
                    if (c24994ioOAYXKKw.OLrzqt(v6BaseQuoteResponseKWHzl, str)) {
                        C55328xhq c55328xhq = C55328xhq.OLrzqt;
                        OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment3 = OneSwapV6DeFiPlatformSelectionFragment.this;
                        int i = C23274hvD.Fragment.onSetShuffleMode;
                        String str2 = oneSwapV6DeFiPlatformSelectionFragment3.ejfBZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        C55328xhq.show$default(c55328xhq, C33069mpW.copydefault(oneSwapV6DeFiPlatformSelectionFragment3, i, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str2))), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                        OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment4 = OneSwapV6DeFiPlatformSelectionFragment.this;
                        DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(oneSwapV6DeFiPlatformSelectionFragment4.AYXKKw().copydefault(actionBar.KWHzl()));
                        oneSwapV6DeFiPlatformSelectionFragment4.fARcdN = defiPlatformInfo != null ? defiPlatformInfo.getDefiPlatformId() : null;
                        OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment5 = OneSwapV6DeFiPlatformSelectionFragment.this;
                        DefiPlatformInfo defiPlatformInfo2 = (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(oneSwapV6DeFiPlatformSelectionFragment5.AYXKKw().copydefault(actionBar.KWHzl()));
                        oneSwapV6DeFiPlatformSelectionFragment5.ejfBZ = defiPlatformInfo2 != null ? defiPlatformInfo2.getName() : null;
                    }
                    C24994ioO c24994ioOAYXKKw2 = OneSwapV6DeFiPlatformSelectionFragment.this.AYXKKw();
                    V6BaseQuoteResponse v6BaseQuoteResponseKWHzl2 = actionBar.KWHzl();
                    String str3 = OneSwapV6DeFiPlatformSelectionFragment.this.fARcdN;
                    Intrinsics.copydefault((Object) str3);
                    c24994ioOAYXKKw2.EZpvd(v6BaseQuoteResponseKWHzl2, str3);
                    yHT yht = OneSwapV6DeFiPlatformSelectionFragment.this.AYXKKw;
                    if (yht != null) {
                        String str4 = OneSwapV6DeFiPlatformSelectionFragment.this.fARcdN;
                        Intrinsics.copydefault((Object) str4);
                        String str5 = OneSwapV6DeFiPlatformSelectionFragment.this.ejfBZ;
                        Intrinsics.copydefault((Object) str5);
                        V6BaseQuoteResponse v6BaseQuoteResponse2 = OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo;
                        Intrinsics.copydefault(v6BaseQuoteResponse2);
                        yht.invoke(str4, str5, v6BaseQuoteResponse2, C56443yFo.KWHzl(false));
                    }
                    DeFiPlatformListAdapter deFiPlatformListAdapter2 = OneSwapV6DeFiPlatformSelectionFragment.this.values;
                    if (deFiPlatformListAdapter2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        deFiPlatformListAdapter = deFiPlatformListAdapter2;
                    }
                    OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment6 = OneSwapV6DeFiPlatformSelectionFragment.this;
                    deFiPlatformListAdapter.submitList(oneSwapV6DeFiPlatformSelectionFragment6.KWHzl(oneSwapV6DeFiPlatformSelectionFragment6.AYXKKw().copydefault(actionBar.KWHzl()), OneSwapV6DeFiPlatformSelectionFragment.this.AYXKKw().EZpvd(actionBar.KWHzl()), OneSwapV6DeFiPlatformSelectionFragment.this.djBIcL().copydefault().getValue()));
                    OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo();
                }
            }
            return Unit.INSTANCE;
        }

        public static final void EZpvd(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, View view) {
            oneSwapV6DeFiPlatformSelectionFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
        }

        public static final void KWHzl(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, View view) {
            V6QuoteRequestWrapper v6QuoteRequestWrapper = oneSwapV6DeFiPlatformSelectionFragment.isConnected;
            if (v6QuoteRequestWrapper != null) {
                Context contextRequireContext = oneSwapV6DeFiPlatformSelectionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C25352ivB.OLrzqt(contextRequireContext, oneSwapV6DeFiPlatformSelectionFragment.isConnected(), v6QuoteRequestWrapper.OLrzqt(), true);
            }
        }
    }

    public final void DbNXlk() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, djBIcL().OLrzqt(), null, new ActionBar(), 2, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner2, djBIcL().copydefault(), null, new Application(), 2, null);
        C22380heK.OLrzqt.copydefault(isConnected()).EZpvd(true).gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.ioB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OneSwapV6DeFiPlatformSelectionFragment.EZpvd(this.EZpvd, (java.util.List) obj);
            }
        }));
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<String, ApproveStatusGroup> map, Continuation<? super Unit> continuation) {
            V6BaseQuoteResponse v6BaseQuoteResponse = OneSwapV6DeFiPlatformSelectionFragment.this.fetchVPNInfo;
            if (v6BaseQuoteResponse != null) {
                OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment = OneSwapV6DeFiPlatformSelectionFragment.this;
                DeFiPlatformListAdapter deFiPlatformListAdapter = oneSwapV6DeFiPlatformSelectionFragment.values;
                if (deFiPlatformListAdapter == null) {
                    Intrinsics.gEmmrt("");
                    deFiPlatformListAdapter = null;
                }
                deFiPlatformListAdapter.submitList(oneSwapV6DeFiPlatformSelectionFragment.KWHzl(oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().copydefault(v6BaseQuoteResponse), oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().EZpvd(v6BaseQuoteResponse), map));
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, List list) {
        RecyclerView recyclerView;
        C55173xeu c55173xeu;
        if (list == null || list.isEmpty() || oneSwapV6DeFiPlatformSelectionFragment.DbNXlk) {
            oneSwapV6DeFiPlatformSelectionFragment.DbNXlk = false;
            return Unit.INSTANCE;
        }
        V6QuoteRequestWrapper v6QuoteRequestWrapper = oneSwapV6DeFiPlatformSelectionFragment.isConnected;
        oneSwapV6DeFiPlatformSelectionFragment.isConnected = v6QuoteRequestWrapper != null ? v6QuoteRequestWrapper.KWHzl(oneSwapV6DeFiPlatformSelectionFragment.isConnected()) : null;
        C21670hHz c21670hHz = oneSwapV6DeFiPlatformSelectionFragment.valueOf;
        if (c21670hHz != null && (c55173xeu = c21670hHz.KWHzl) != null) {
            c55173xeu.setVisibility(8);
        }
        C21670hHz c21670hHz2 = oneSwapV6DeFiPlatformSelectionFragment.valueOf;
        if (c21670hHz2 != null && (recyclerView = c21670hHz2.gEmmrt) != null) {
            recyclerView.setVisibility(0);
        }
        DeFiPlatformListAdapter deFiPlatformListAdapter = oneSwapV6DeFiPlatformSelectionFragment.values;
        if (deFiPlatformListAdapter == null) {
            Intrinsics.gEmmrt("");
            deFiPlatformListAdapter = null;
        }
        deFiPlatformListAdapter.submitList(C56402yEa.EZpvd(DeFiPlatformListAdapter.ActionBar.C0332ActionBar.KWHzl));
        Job job = oneSwapV6DeFiPlatformSelectionFragment.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        oneSwapV6DeFiPlatformSelectionFragment.OLrzqt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt() {
        CircularProgressIndicator circularProgressIndicator;
        C21670hHz c21670hHz = this.valueOf;
        if (c21670hHz != null && (circularProgressIndicator = c21670hHz.djBIcL) != null) {
            circularProgressIndicator.setProgressCompat(0, true);
        }
        V6QuoteRequestWrapper v6QuoteRequestWrapper = this.isConnected;
        if (v6QuoteRequestWrapper != null) {
            OneSwapV6DeFiPlatformSelectionViewModel oneSwapV6DeFiPlatformSelectionViewModelDjBIcL = djBIcL();
            String strIsConnected = isConnected();
            Bundle arguments = getArguments();
            oneSwapV6DeFiPlatformSelectionViewModelDjBIcL.AEQbTJ(strIsConnected, arguments != null ? arguments.getBoolean("is_using_smart_account", false) : false, v6QuoteRequestWrapper);
        }
    }

    public final void valueOf() {
        V6BaseQuoteResponse v6BaseQuoteResponse = this.fetchVPNInfo;
        if (v6BaseQuoteResponse == null || !AYXKKw().AEQbTJ(v6BaseQuoteResponse)) {
            return;
        }
        djBIcL().AEQbTJ(isConnected(), AYXKKw().KWHzl(v6BaseQuoteResponse), AYXKKw().OLrzqt(v6BaseQuoteResponse), C22380heK.OLrzqt.copydefault("default_trade").fARcdN().KWHzl(AYXKKw().OLrzqt(v6BaseQuoteResponse).getChainId()), AYXKKw().OLrzqt(v6BaseQuoteResponse).getChainId(), AYXKKw().OLrzqt(v6BaseQuoteResponse).getTokenContractAddress(), AYXKKw().AhwBna(v6BaseQuoteResponse).getTokenContractAddress());
    }

    public final boolean OLrzqt(ApproveStatusGroup approveStatusGroup) {
        return (approveStatusGroup == null || approveStatusGroup.getNeedApprove() || approveStatusGroup.getApproveStatus() != ApproveStatus.APPROVED) ? false : true;
    }

    public final void fetchVPNInfo() {
        ImageView imageView;
        CircularProgressIndicator circularProgressIndicator;
        FrameLayout frameLayout;
        Job job = this.djBIcL;
        if (job == null || !(job == null || job.isActive())) {
            C21670hHz c21670hHz = this.valueOf;
            if (c21670hHz != null && (frameLayout = c21670hHz.AEQbTJ) != null) {
                frameLayout.setClickable(true);
            }
            C21670hHz c21670hHz2 = this.valueOf;
            if (c21670hHz2 != null && (circularProgressIndicator = c21670hHz2.djBIcL) != null) {
                circularProgressIndicator.setIndicatorColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            }
            C21670hHz c21670hHz3 = this.valueOf;
            if (c21670hHz3 != null && (imageView = c21670hHz3.AhwBna) != null) {
                Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.iFnJKK);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
            }
            Job job2 = this.djBIcL;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
            }
            this.djBIcL = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new OneSwapV6DeFiPlatformSelectionFragment$startCountDownTimer$2(this, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Job job = this.djBIcL;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.djBIcL = null;
        this.valueOf = null;
        this.AYXKKw = null;
        this.fARcdN = null;
        this.ejfBZ = null;
        this.isConnected = null;
        this.fetchVPNInfo = null;
    }

    public final void copydefault(final String str) {
        C32866mlf.onEvent$default("DEXSwap_ProviderList_SelectProvider_Click", (TrackChannel[]) null, new Function1() { // from class: o.iou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OneSwapV6DeFiPlatformSelectionFragment.EZpvd(this.AEQbTJ, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "trade_dialog", oneSwapV6DeFiPlatformSelectionFragment.EZpvd(oneSwapV6DeFiPlatformSelectionFragment.isConnected()), false, 4, null);
        V6BaseQuoteResponse v6BaseQuoteResponse = oneSwapV6DeFiPlatformSelectionFragment.fetchVPNInfo;
        if (v6BaseQuoteResponse != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().OLrzqt(v6BaseQuoteResponse);
            EventParamsList.put$default(eventParamsList, "from_token_name", dexMultiTokenInfoBeanOLrzqt.getTokenName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "from_token_address", dexMultiTokenInfoBeanOLrzqt.getTokenContractAddress(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "from_token_amount", oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().KWHzl(v6BaseQuoteResponse), false, 4, null);
            EventParamsList.put$default(eventParamsList, "wallet_address", C22380heK.OLrzqt.copydefault("default_trade").fARcdN().KWHzl(dexMultiTokenInfoBeanOLrzqt.getChainId()), false, 4, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAhwBna = oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().AhwBna(v6BaseQuoteResponse);
            EventParamsList.put$default(eventParamsList, "to_token_name", dexMultiTokenInfoBeanAhwBna.getTokenName(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "to_token_address", dexMultiTokenInfoBeanAhwBna.getTokenContractAddress(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, "source_from", DexTrackEventParameter.AEQbTJ.OLrzqt(oneSwapV6DeFiPlatformSelectionFragment.isConnected()), false, 4, null);
        V6BaseQuoteResponse v6BaseQuoteResponse2 = oneSwapV6DeFiPlatformSelectionFragment.fetchVPNInfo;
        if (v6BaseQuoteResponse2 != null) {
            EventParamsList.put$default(eventParamsList, "chain", oneSwapV6DeFiPlatformSelectionFragment.AYXKKw().OLrzqt(v6BaseQuoteResponse2).getChainName(), false, 4, null);
        }
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final String AhwBna() {
        int i = Activity.KWHzl[this.AkhnZx.ordinal()];
        if (i == 1 || i == 2) {
            return TrackTransactionDirection.BUY.getValue();
        }
        if (i == 3 || i == 4) {
            return TrackTransactionDirection.SELL.getValue();
        }
        return TrackTransactionDirection.NA.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackNewActionEvents$default(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = new HashMap();
        }
        oneSwapV6DeFiPlatformSelectionFragment.KWHzl((Map<String, String>) map);
    }

    public final void KWHzl(Map<String, String> map) {
        V6BaseQuoteResponse v6BaseQuoteResponse = this.fetchVPNInfo;
        if (v6BaseQuoteResponse != null) {
            gEmmrt().OLrzqt(new AbstractC22407hel.FragmentManager(AYXKKw().OLrzqt(v6BaseQuoteResponse).getChainId(), "provider_list", this.AkhnZx.getBusinessType(), TrackOrderType.SWAP.getType(), AhwBna(), map));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List mapToDeFiProviderListItem$default(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment, List list, String str, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        return oneSwapV6DeFiPlatformSelectionFragment.KWHzl(list, str, map);
    }

    public static final Unit uzCIH(OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment) {
        V6QuoteRequestWrapper v6QuoteRequestWrapper = oneSwapV6DeFiPlatformSelectionFragment.isConnected;
        if (v6QuoteRequestWrapper != null) {
            Context contextRequireContext = oneSwapV6DeFiPlatformSelectionFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C25352ivB.OLrzqt(contextRequireContext, oneSwapV6DeFiPlatformSelectionFragment.isConnected(), v6QuoteRequestWrapper.OLrzqt(), true);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.defiplatform.OneSwapV6DeFiPlatformSelectionFragment$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OneSwapV6DeFiPlatformSelectionFragment newInstance$default(TaskDescription taskDescription, Bundle bundle, yHT yht, int i, Object obj) {
            if ((i & 2) != 0) {
                yht = null;
            }
            return taskDescription.EZpvd(bundle, yht);
        }

        public final OneSwapV6DeFiPlatformSelectionFragment EZpvd(Bundle bundle, yHT<? super String, ? super String, ? super V6BaseQuoteResponse, ? super Boolean, Unit> yht) {
            OneSwapV6DeFiPlatformSelectionFragment oneSwapV6DeFiPlatformSelectionFragment = new OneSwapV6DeFiPlatformSelectionFragment();
            oneSwapV6DeFiPlatformSelectionFragment.setArguments(bundle);
            Bundle arguments = oneSwapV6DeFiPlatformSelectionFragment.getArguments();
            if (arguments != null) {
                C31200lpY.EZpvd(arguments, oneSwapV6DeFiPlatformSelectionFragment.isConnected());
            }
            oneSwapV6DeFiPlatformSelectionFragment.AYXKKw = yht;
            return oneSwapV6DeFiPlatformSelectionFragment;
        }
    }

    public final String EZpvd(String str) {
        return C22372heC.AEQbTJ(str) ? "no" : "yes";
    }

    public final String KWHzl(int i) {
        ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", pTB.formatUpToMax$default(C33129mqd.EZpvd(Integer.valueOf(i)), 0, null, 3, null)));
        return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C23274hvD.FragmentManager.fIwbmz, i, arrayMapArrayMapOf);
    }

    public final List<DeFiPlatformListAdapter.ActionBar> KWHzl(List<DefiPlatformInfo> list, String str, Map<String, ApproveStatusGroup> map) {
        boolean z;
        List listAhwBna;
        String tokenLogoUrl;
        DexMultiTokenInfoBean fromToken;
        String tokenLogoUrl2;
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) obj;
            String defiPlatformId = defiPlatformInfo.getDefiPlatformId();
            String name = defiPlatformInfo.getName();
            String logo = defiPlatformInfo.getLogo();
            String receiveAmount = defiPlatformInfo.getReceiveAmount();
            String toTokenValue = defiPlatformInfo.getToTokenValue();
            String quoteNetWorkFeeOfMoney = str.length() == 0 ? defiPlatformInfo.getQuoteNetWorkFeeOfMoney() : str;
            List<DexRouter> dexRouterList = defiPlatformInfo.getDexRouterList();
            if (dexRouterList == null || dexRouterList.isEmpty() || !C22416heu.isConnected()) {
                listAhwBna = yDY.AhwBna();
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (DexRouter dexRouter : defiPlatformInfo.getDexRouterList()) {
                    if (arrayList2.isEmpty() && (fromToken = dexRouter.getFromToken()) != null && (tokenLogoUrl2 = fromToken.getTokenLogoUrl()) != null) {
                        arrayList2.add(tokenLogoUrl2);
                    }
                    DexMultiTokenInfoBean toToken = dexRouter.getToToken();
                    if (toToken != null && (tokenLogoUrl = toToken.getTokenLogoUrl()) != null && arrayList2.size() < 4 && arrayList2.indexOf(tokenLogoUrl) == -1) {
                        arrayList2.add(tokenLogoUrl);
                    }
                }
                listAhwBna = arrayList2;
            }
            arrayList.add(new DeFiPlatformListAdapter.ActionBar.Activity(defiPlatformId, name, logo, receiveAmount, toTokenValue, quoteNetWorkFeeOfMoney, listAhwBna, defiPlatformInfo.getReducePercent(), i == 0, OLrzqt(map.get(defiPlatformInfo.getDefiPlatformId())), Intrinsics.EZpvd((Object) defiPlatformInfo.getDefiPlatformId(), (Object) this.fARcdN), defiPlatformInfo.isPMM()));
            i++;
        }
        List<DeFiPlatformListAdapter.ActionBar> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
        if (!this.fJNWhG) {
            listFJNWhG.add(DeFiPlatformListAdapter.ActionBar.C0332ActionBar.KWHzl);
        }
        InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault("default_trade").fARcdN().valueOf();
        if (interfaceC9738bbJValueOf != null) {
            z = true;
            if (!interfaceC9738bbJValueOf.ORxRYg()) {
            }
            return listFJNWhG;
        }
        z = true;
        if (interfaceC9738bbJValueOf == null || interfaceC9738bbJValueOf.getFieldNames() != z) {
            C24694iif c24694iifAEQbTJ = C24695iig.AEQbTJ(isConnected(), z);
            V6BaseQuoteResponse v6BaseQuoteResponse = this.fetchVPNInfo;
            if (v6BaseQuoteResponse != null && AYXKKw().OLrzqt(v6BaseQuoteResponse, c24694iifAEQbTJ)) {
                listFJNWhG.add(0, new DeFiPlatformListAdapter.ActionBar.Application("", KWHzl(c24694iifAEQbTJ.AEQbTJ()), C33070mpX.AYXKKw(C23274hvD.Fragment.uzCIH), new Function0() { // from class: o.ioF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return OneSwapV6DeFiPlatformSelectionFragment.uzCIH(this.EZpvd);
                    }
                }));
            }
            return listFJNWhG;
        }
        return listFJNWhG;
    }
}
