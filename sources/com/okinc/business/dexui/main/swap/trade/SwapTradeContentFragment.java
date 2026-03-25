package com.okinc.business.dexui.main.swap.trade;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderListPageType;
import com.okinc.business.dexlogic.bean.ChainInfoVO;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.EventTrackSubmitType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.IgnoreLastValueObserver;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexlogic.track.enums.SwapType;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.route.SmartRoutingData;
import com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams;
import com.okinc.business.dexui.main.swap.setting.widget.NetWorkFeeShowType;
import com.okinc.business.dexui.main.swap.trade.SwapTradeContentFragment;
import com.okinc.business.dexui.main.swap.trade.input.widget.CrossValueDifferenceData;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.business.dexui.main.swap.widget.SettingItemData;
import com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import com.okinc.business.dexui.main.swap.widget.slippage.DynamicParam;
import com.okinc.business.dexui.main.swap.widget.slippage.FixedParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageParams;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.SubHelper;
import com.okinc.wallet.api.WalletDexService;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.AbstractActivityC33041mov;
import o.AbstractC22408hem;
import o.AbstractC22410heo;
import o.AbstractC22802hmI;
import o.AbstractC22885hnm;
import o.AbstractC23101hrq;
import o.AbstractC24472ieV;
import o.ActivityC22185hab;
import o.ActivityC25050ipR;
import o.ActivityC30530lcr;
import o.C22333hdQ;
import o.C22337hdU;
import o.C22370heA;
import o.C22372heC;
import o.C22380heK;
import o.C22400hee;
import o.C22409hen;
import o.C22803hmJ;
import o.C22806hmM;
import o.C22814hmU;
import o.C22825hmf;
import o.C22877hne;
import o.C22901hoB;
import o.C22947hov;
import o.C23077hrS;
import o.C23081hrW;
import o.C23138hsa;
import o.C23154hsq;
import o.C23271hvA;
import o.C23274hvD;
import o.C23310hvn;
import o.C23313hvq;
import o.C23314hvr;
import o.C23317hvu;
import o.C23328hwE;
import o.C24354icJ;
import o.C24369icY;
import o.C24461ieK;
import o.C24467ieQ;
import o.C24469ieS;
import o.C24614ihE;
import o.C24631ihV;
import o.C24679iiQ;
import o.C24694iif;
import o.C24695iig;
import o.C24717ijB;
import o.C24718ijC;
import o.C24795ika;
import o.C24797ikc;
import o.C24800ikf;
import o.C24806ikl;
import o.C24812ikr;
import o.C24995ioP;
import o.C25035ipC;
import o.C25049ipQ;
import o.C25052ipT;
import o.C25083ipy;
import o.C25286itp;
import o.C25287itq;
import o.C25352ivB;
import o.C25416iwM;
import o.C25445iwp;
import o.C25632jAp;
import o.C28385kZl;
import o.C31197lpV;
import o.C31200lpY;
import o.C31205lpd;
import o.C31256lqb;
import o.C32113mPz;
import o.C32866mlf;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C54978xbK;
import o.C55001xbh;
import o.C55097xdX;
import o.C55296xhK;
import o.C55298xhM;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.C56524yIo;
import o.C57656ymY;
import o.C59405zgS;
import o.C59541ziw;
import o.InterfaceC22598hiQ;
import o.InterfaceC22903hoD;
import o.InterfaceC23194htd;
import o.InterfaceC24361icQ;
import o.InterfaceC28107kPd;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC59496ziD;
import o.InterfaceC9738bbJ;
import o.ViewOnClickListenerC24460ieJ;
import o.ViewOnClickListenerC54939xaY;
import o.gKR;
import o.gKW;
import o.hBP;
import o.hGZ;
import o.rVN;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapTradeContentFragment extends AbstractC24472ieV implements InterfaceC22903hoD {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public hBP AhwBna;
    public C25083ipy AkhnZx;
    public C25286itp AuCTel;
    public InterfaceC24361icQ AuCTelauCTel;
    public Observer<SwapState> AubY;
    public final TaskDescription DbNXlk;

    @yCM
    public InterfaceC28107kPd activityScopeCache;
    public int ejfBZ;
    public C24995ioP fetchVPNInfo;
    public C24812ikr getNewProxyInstance;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> hDKMBd;

    @yCM
    public C25445iwp handleBridgeEventTrackUtils;
    public final InterfaceC56387yDm isConnected;
    public C24718ijC iwGUEr;
    public Function1<? super Boolean, Unit> sSMYrx;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> uzCIH;
    public boolean values;
    public Function1<? super Boolean, Unit> wlaJM;
    public ActivityResultLauncher<Intent> zLjUOn;
    public C22806hmM.Activity zsXlph;
    public final Object AYXKKw = new Object();
    public boolean fJNWhG = true;
    public final Object zuBGHE = new Object();
    public final Observer<CurrentChain> getFieldNames = new Observer() { // from class: o.igg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(java.lang.Object obj) {
            SwapTradeContentFragment.OLrzqt(this.AEQbTJ, (CurrentChain) obj);
        }
    };
    public final InterfaceC56387yDm fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.igj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapTradeContentFragment.QOLQEE(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm fIwbmz = C56392yDr.copydefault(new Function0() { // from class: o.igk
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapTradeContentFragment.ORxRYg(this.KWHzl);
        }
    });

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C22806hmM.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.zsXlph = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.RzdrRQ;
    }

    public static final class PendingIntent implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof DexHomeFragment) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.OLrzqt.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ SwapTradeContentFragment EZpvd;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, SwapTradeContentFragment swapTradeContentFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = swapTradeContentFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                SwapTradeContentFragment swapTradeContentFragment = this.EZpvd;
                Intent intent = new Intent(this.EZpvd.requireContext(), (Class<?>) ActivityC22185hab.class);
                OrderListPageType orderListPageType = OrderListPageType.Bridge;
                Intrinsics.copydefault(orderListPageType, "");
                intent.putExtra("type", (Parcelable) orderListPageType);
                intent.putExtra("extra_universal_1", true);
                swapTradeContentFragment.startActivity(intent);
            }
        }
    }

    public SwapTradeContentFragment() {
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new PendingIntent(this)));
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        this.AubY = new Observer() { // from class: o.igi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.AhwBna(this.OLrzqt, (SwapState) obj);
            }
        };
        this.hDKMBd = new IgnoreLastValueObserver<>(new Function1() { // from class: o.igh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AhwBna(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        });
        this.uzCIH = new IgnoreLastValueObserver<>(new Function1() { // from class: o.igl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.gEmmrt(this.OLrzqt, (DexMultiTokenInfoBean) obj);
            }
        });
        this.DbNXlk = new TaskDescription();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.SwapTradeContentFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ SwapTradeContentFragment newInstance$default(StateListAnimator stateListAnimator, String str, TradeParam tradeParam, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            return stateListAnimator.copydefault(str, tradeParam, function1, function12);
        }

        public final SwapTradeContentFragment copydefault(@NotNull String str, TradeParam tradeParam, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12) {
            Intrinsics.checkNotNullParameter(str, "");
            SwapTradeContentFragment swapTradeContentFragment = new SwapTradeContentFragment();
            swapTradeContentFragment.sSMYrx = function1;
            swapTradeContentFragment.wlaJM = function12;
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("trade_data", tradeParam);
            swapTradeContentFragment.setArguments(bundle);
            return swapTradeContentFragment;
        }
    }

    public final C25445iwp fetchVPNInfo() {
        C25445iwp c25445iwp = this.handleBridgeEventTrackUtils;
        if (c25445iwp != null) {
            return c25445iwp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void OLrzqt(SwapTradeContentFragment swapTradeContentFragment, CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        swapTradeContentFragment.isConnected().KWHzl(currentChain);
    }

    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.AhwBna != null) {
            isConnected().AEQbTJ(str, new Function1() { // from class: o.ifP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.djBIcL(this.copydefault, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit djBIcL(SwapTradeContentFragment swapTradeContentFragment, String str) {
        C24795ika c24795ika;
        Intrinsics.checkNotNullParameter(str, "");
        hBP hbp = swapTradeContentFragment.AhwBna;
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            c24795ika.setFromCheckData(str);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements ViewModelProvider.Factory {
        public ActionBar() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23154hsq(C23328hwE.Companion.OLrzqt(), SwapTradeContentFragment.this.AEQbTJ(), SwapTradeContentFragment.this.EZpvd(), null, null, null, null, null, null, null, null, 2040, null);
        }
    }

    public final C23154hsq isConnected() {
        return (C23154hsq) this.fARcdN.getValue();
    }

    public static final C23154hsq QOLQEE(SwapTradeContentFragment swapTradeContentFragment) {
        return (C23154hsq) new ViewModelProvider(swapTradeContentFragment, swapTradeContentFragment.new ActionBar()).get(C23154hsq.class);
    }

    public static final class Fragment implements ViewModelProvider.Factory {
        public Fragment() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23138hsa(C23328hwE.Companion.OLrzqt(), SwapTradeContentFragment.this.AEQbTJ(), SwapTradeContentFragment.this.EZpvd());
        }
    }

    public final C23138hsa AkhnZx() {
        return (C23138hsa) this.fIwbmz.getValue();
    }

    public static final C23138hsa ORxRYg(SwapTradeContentFragment swapTradeContentFragment) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = swapTradeContentFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (C23138hsa) new ViewModelProvider(fragmentRequireParentFragment, swapTradeContentFragment.new Fragment()).get(C23138hsa.class);
    }

    public final DexHomeViewModel valueOf() {
        return (DexHomeViewModel) this.isConnected.getValue();
    }

    public final InterfaceC28107kPd djBIcL() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final void AhwBna(SwapTradeContentFragment swapTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        hBP hbp = swapTradeContentFragment.AhwBna;
        if (hbp != null) {
            hbp.AEQbTJ.setTradeStateButton(swapState.isButtonStateInterception(swapTradeContentFragment.djBIcL().OLrzqt()), swapTradeContentFragment.isConnected().QUSxYX().copydefault(), swapTradeContentFragment.isConnected().QUSxYX().valueOf(), false, (16 & 16) != 0, (16 & 32) != 0 ? null : null, new Function1() { // from class: o.ifZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.copydefault(((java.lang.Boolean) obj).booleanValue());
                }
            });
            if (swapState.isDAppRedirectState()) {
                hbp.valueOf.DbNXlk();
                C24995ioP c24995ioP = swapTradeContentFragment.fetchVPNInfo;
                if (c24995ioP != null) {
                    FragmentManager childFragmentManager = swapTradeContentFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    ErrorNoticeView errorNoticeView = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                    FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    C24995ioP.updateErrorState$default(c24995ioP, swapState, childFragmentManager, errorNoticeView, fragmentActivityRequireActivity, null, null, null, new Function1() { // from class: o.ifW
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return SwapTradeContentFragment.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                        }
                    }, WalletImportError.ERROR_CODE_AA_EXIST, null);
                }
            }
            Function1<? super Boolean, Unit> function1 = swapTradeContentFragment.wlaJM;
            if (function1 != null) {
                C22825hmf c22825hmf = C22825hmf.OLrzqt;
                String strAEQbTJ = swapTradeContentFragment.AEQbTJ();
                DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
                String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
                String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
                function1.invoke(Boolean.valueOf(c22825hmf.OLrzqt(strAEQbTJ, chainId, chainId2 != null ? chainId2 : "")));
            }
            if (swapState == SwapState.NO_WALLET) {
                swapTradeContentFragment.AuCTel();
            }
        }
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AhwBna(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        swapTradeContentFragment.AEQbTJ(dexMultiTokenInfoBean);
        hBP hbp = swapTradeContentFragment.AhwBna;
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                c24795ika.setFromHighRiskVisible(z);
            }
        }
        if (dexMultiTokenInfoBean != null) {
            swapTradeContentFragment.isConnected().OFhtUX().setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit gEmmrt(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        String tokenContractAddress;
        String chainId;
        C24795ika c24795ika;
        swapTradeContentFragment.EZpvd(dexMultiTokenInfoBean);
        hBP hbp = swapTradeContentFragment.AhwBna;
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                c24795ika.setToHighRiskVisible(z);
            }
        }
        C22806hmM c22806hmMFHqPtx = swapTradeContentFragment.isConnected().fHqPtx();
        LifecycleOwner viewLifecycleOwner = swapTradeContentFragment.getViewLifecycleOwner();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        if (dexMultiTokenInfoBean == null || (tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress()) == null) {
            tokenContractAddress = "";
        }
        if (dexMultiTokenInfoBean != null && (chainId = dexMultiTokenInfoBean.getChainId()) != null) {
            str = chainId;
        }
        c22806hmMFHqPtx.OLrzqt(viewLifecycleOwner, tokenContractAddress, str, swapTradeContentFragment.zsXlph);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        hBP hbp = this.AhwBna;
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setFromInputConfig(new Function1() { // from class: o.iga
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(dexMultiTokenInfoBean, (C24806ikl) obj);
            }
        });
    }

    public static final Unit EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, C24806ikl c24806ikl) {
        String decimals;
        Intrinsics.checkNotNullParameter(c24806ikl, "");
        if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
            decimals = "12";
        }
        c24806ikl.setMaxDecimalValue(C22370heA.OLrzqt(decimals));
        return Unit.INSTANCE;
    }

    public final void EZpvd(final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        hBP hbp = this.AhwBna;
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setReceiveInputConfig(new Function1() { // from class: o.igp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(dexMultiTokenInfoBean, (C24806ikl) obj);
            }
        });
    }

    public static final Unit AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, C24806ikl c24806ikl) {
        String decimals;
        Intrinsics.checkNotNullParameter(c24806ikl, "");
        if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
            decimals = "12";
        }
        c24806ikl.setMaxDecimalValue(C22370heA.OLrzqt(decimals));
        return Unit.INSTANCE;
    }

    public static final class TaskDescription extends FragmentManager.FragmentLifecycleCallbacks {
        public TaskDescription() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentAttached(FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, Context context) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            super.onFragmentAttached(fragmentManager, fragment, context);
            if (fragment instanceof DialogFragment) {
                SwapTradeContentFragment.this.values = true;
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDetached(FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDetached(fragmentManager, fragment);
            if (fragment instanceof DialogFragment) {
                SwapTradeContentFragment.this.values = false;
            }
        }
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onVisible() {
        FragmentManager supportFragmentManager;
        dismissLoading();
        C22901hoB c22901hoBZuBGHE = isConnected().zuBGHE();
        if (c22901hoBZuBGHE != null) {
            c22901hoBZuBGHE.AEQbTJ();
        }
        AbstractC23101hrq.onVisible$default(isConnected(), false, 1, null);
        isConnected().zLjUOn().KWHzl().observeForever(this.hDKMBd);
        isConnected().zLjUOn().EZpvd().observeForever(this.uzCIH);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.registerFragmentLifecycleCallbacks(this.DbNXlk, true);
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onInvisible() {
        FragmentManager supportFragmentManager;
        C22901hoB c22901hoBZuBGHE = isConnected().zuBGHE();
        if (c22901hoBZuBGHE != null) {
            c22901hoBZuBGHE.AYXKKw();
        }
        isConnected().ixgjPv();
        isConnected().zLjUOn().KWHzl().removeObserver(this.hDKMBd);
        isConnected().zLjUOn().EZpvd().removeObserver(this.uzCIH);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.DbNXlk);
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        this.AhwBna = hBP.EZpvd(view);
        isConnected().EZpvd(getActivity());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.iwGUEr = new C24718ijC(childFragmentManager, getActivity(), isConnected(), new Function0() { // from class: o.ifK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.DTwDnp(this.EZpvd);
            }
        });
        hBP hbp = this.AhwBna;
        if (hbp != null) {
            AEQbTJ(hbp);
            copydefault(hbp);
            KWHzl(hbp);
        }
        view.post(new Runnable() { // from class: o.ifV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapTradeContentFragment.OcIXYQ(this.EZpvd);
            }
        });
    }

    public static final Unit DTwDnp(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.values();
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(SwapTradeContentFragment swapTradeContentFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) swapTradeContentFragment, true, (String) null, 2, (Object) null);
    }

    public final void AEQbTJ(final hBP hbp) {
        C24800ikf c24800ikf;
        C24806ikl c24806iklAEQbTJ;
        hbp.AYXKKw.setContentDescription("web3_dex_bridge_container");
        this.AuCTel = new C25286itp(AEQbTJ());
        hbp.AYXKKw.setContentBinding(hbp);
        C24995ioP c24995ioP = new C24995ioP(AEQbTJ(), isConnected(), this, true, djBIcL().OLrzqt());
        this.fetchVPNInfo = c24995ioP;
        C25049ipQ c25049ipQ = hbp.AYXKKw;
        Intrinsics.copydefault(c24995ioP);
        c25049ipQ.setErrorStateHandle(c24995ioP);
        C24461ieK c24461ieKValueOf = hbp.valueOf.valueOf();
        if (c24461ieKValueOf != null) {
            c24461ieKValueOf.setRateSwitchListener(new Function0() { // from class: o.igr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.djBIcL(this.KWHzl, hbp);
                }
            });
        }
        isConnected().AEQbTJ(new C22901hoB(isConnected(), new WeakReference(this), null, 4, null));
        isConnected().QkdxfA().setValue(Boolean.FALSE);
        Context context = getContext();
        if (context != null) {
            hbp.OLrzqt.setLeftRightMargin(C55298xhM.OLrzqt(12, context));
        }
        Context context2 = getContext();
        this.AkhnZx = context2 != null ? new C25083ipy(context2, null, 0, AEQbTJ(), 6, null) : null;
        hGZ hgzEZpvd = hbp.OLrzqt.EZpvd();
        if (hgzEZpvd == null || (c24800ikf = hgzEZpvd.copydefault) == null || (c24806iklAEQbTJ = c24800ikf.AEQbTJ()) == null) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C24812ikr c24812ikr = new C24812ikr(fragmentActivityRequireActivity);
        this.getNewProxyInstance = c24812ikr;
        c24812ikr.setPriceCallback(new Function2() { // from class: o.igz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SwapTradeContentFragment.EZpvd(this.KWHzl, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        new C54978xbK(fragmentActivityRequireActivity2, this.getNewProxyInstance, getViewLifecycleOwner()).copydefault(yEE.gEmmrt(c24806iklAEQbTJ));
    }

    public static final Unit djBIcL(SwapTradeContentFragment swapTradeContentFragment, hBP hbp) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.RATE.getValue(), false, null, 12, null);
        C23154hsq c23154hsqIsConnected = swapTradeContentFragment.isConnected();
        if (c23154hsqIsConnected.QwvEab() && (quotePriceResAxsJAYsNCnLh = c23154hsqIsConnected.AxsJAYsNCnLh()) != null) {
            c23154hsqIsConnected.wlaJM().OLrzqt(!c23154hsqIsConnected.wlaJM().AEQbTJ());
            C24461ieK c24461ieKValueOf = hbp.valueOf.valueOf();
            if (c24461ieKValueOf != null) {
                QuotePriceRes value = c23154hsqIsConnected.AubY().getValue();
                if (value == null) {
                    value = quotePriceResAxsJAYsNCnLh;
                }
                C23081hrW c23081hrWWlaJM = swapTradeContentFragment.isConnected().wlaJM();
                ConsumeData<TradeInputGroup> value2 = swapTradeContentFragment.isConnected().dmfpNf().getValue();
                Intrinsics.copydefault(value2);
                C23077hrS labelData$default = C23081hrW.getLabelData$default(c23081hrWWlaJM, value2.getData(), quotePriceResAxsJAYsNCnLh, null, 4, null);
                Context contextRequireContext = swapTradeContentFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c24461ieKValueOf.setRateInfo(value, C25287itq.copydefault(labelData$default, contextRequireContext));
            }
        }
        swapTradeContentFragment.fetchVPNInfo().AEQbTJ(new AbstractC22410heo.ActionBar(swapTradeContentFragment.fIwbmz(), EventPageNameType.BRIDGE.getPageName(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.RATE_SWITCH.getButtonName()))));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        swapTradeContentFragment.valueOf().EZpvd(new C22400hee("DEXTrade_Home_FullPage_Click", EventPageNameType.BRIDGE.getPageName(), ButtonType.QUICK_BUTTON.getType(), C22409hen.KWHzl(i)));
        swapTradeContentFragment.AhwBna(str);
        EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(str));
        return Unit.INSTANCE;
    }

    public final void copydefault(final hBP hbp) {
        View viewOLrzqt;
        AkhnZx().AEQbTJ().observeForever(this.getFieldNames);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C59541ziw.EZpvd(activity, this, new Application(hbp));
        }
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = hbp.valueOf.djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL != null) {
            viewOnClickListenerC24460ieJDjBIcL.copydefault(new Function0() { // from class: o.igb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.getNewProxyInstance(this.copydefault);
                }
            });
        }
        C24467ieQ c24467ieQEZpvd = hbp.valueOf.EZpvd();
        if (c24467ieQEZpvd != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c24467ieQEZpvd.setupDialogReference(childFragmentManager, getActivity());
        }
        hbp.OLrzqt.setActionCallBack(new Function0() { // from class: o.ifu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.AEQbTJ(this.AEQbTJ, hbp);
            }
        });
        hbp.OLrzqt.KWHzl(new Function0() { // from class: o.ifG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.AubY(this.copydefault);
            }
        });
        hbp.OLrzqt.setFromCoinSelectClick(new Function1() { // from class: o.ifC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(this.OLrzqt, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setChainFromSelectClick(new Function1() { // from class: o.ifE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(this.AEQbTJ, (C24800ikf) obj);
            }
        });
        hbp.OLrzqt.setToCoinSelectClick(new Function1() { // from class: o.ifF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(this.AEQbTJ, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setChainToSelectClick(new Function1() { // from class: o.ifI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(this.OLrzqt, (C24800ikf) obj);
            }
        });
        ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL2 = hbp.valueOf.djBIcL();
        if (viewOnClickListenerC24460ieJDjBIcL2 != null) {
            viewOnClickListenerC24460ieJDjBIcL2.setTitleInfoCallBack(AEQbTJ(), new Function0() { // from class: o.ifH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.zsXlph(this.copydefault);
                }
            });
        }
        hbp.OLrzqt.setFromToChangeClick(new Function1() { // from class: o.ifL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AYXKKw(this.OLrzqt, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setClickValueDifferenceCallBack(new Function0() { // from class: o.ifJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.AuCTelauCTel(this.AEQbTJ);
            }
        });
        hbp.OLrzqt.setInputFocusCallBack(new Function0() { // from class: o.ign
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.OLrzqt(hbp);
            }
        });
        this.zLjUOn = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.igE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SwapTradeContentFragment.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        C24469ieS c24469ieSAkhnZx = hbp.valueOf.AkhnZx();
        if (c24469ieSAkhnZx != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c24469ieSAkhnZx, 0L, new Function1() { // from class: o.igL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.KWHzl(this.OLrzqt, (android.view.View) obj);
                }
            }, 1, null);
        }
        C24469ieS c24469ieSAkhnZx2 = hbp.valueOf.AkhnZx();
        if (c24469ieSAkhnZx2 != null) {
            c24469ieSAkhnZx2.setTitleCallBack(new Function1() { // from class: o.igU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.EZpvd(this.OLrzqt, (SettingItemData) obj);
                }
            });
        }
        C24461ieK c24461ieKValueOf = hbp.valueOf.valueOf();
        if (c24461ieKValueOf != null) {
            c24461ieKValueOf.setTitleInfoCallBack(getActivity(), AEQbTJ(), new Function0() { // from class: o.ifl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.zLjUOn(this.copydefault);
                }
            });
        }
        C24614ihE c24614ihE = hbp.AEQbTJ;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            C33570myu.copydefault((android.app.Activity) activity2);
        }
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c24795ika, "");
        c24614ihE.KWHzl(c24795ika, isConnected(), this, false, new Function0() { // from class: o.ifn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.wlaJM(this.OLrzqt);
            }
        }, new Function0() { // from class: o.ifr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.valueOf(this.OLrzqt, hbp);
            }
        }, new Function0() { // from class: o.ifo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.AxsJAY(this.copydefault);
            }
        }, new Function0() { // from class: o.ifp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.gHZMYf(this.OLrzqt);
            }
        }, new Function0() { // from class: o.ifv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.AwvSrB(this.EZpvd);
            }
        }, new Function0() { // from class: o.ifw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.zuBGHE(this.OLrzqt);
            }
        }, new Function1() { // from class: o.ift
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(this.copydefault, (SwapState) obj);
            }
        });
        C24614ihE.approveConfirm$default(c24614ihE, AEQbTJ(), isConnected(), this, null, new Function1() { // from class: o.ifs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(this.KWHzl, (android.os.Bundle) obj);
            }
        }, new Function1() { // from class: o.ify
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(this.KWHzl, (SwapState) obj);
            }
        }, 8, null);
        hbp.OLrzqt.setClickCallback(new Function0() { // from class: o.ifB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.sSMYrx(this.AEQbTJ);
            }
        });
        C24467ieQ c24467ieQEZpvd2 = hbp.valueOf.EZpvd();
        if (c24467ieQEZpvd2 != null && (viewOLrzqt = c24467ieQEZpvd2.OLrzqt()) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(viewOLrzqt, 0L, new Function1() { // from class: o.ifx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.OLrzqt(this.EZpvd, (android.view.View) obj);
                }
            }, 1, null);
        }
        LinearLayout linearLayout = hbp.KWHzl;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
        C22380heK.OLrzqt.copydefault(AEQbTJ()).copydefault().gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new Observer() { // from class: o.ifA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        });
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new SwapTradeContentFragment$addListener$22(this, null));
        valueOf().EZpvd().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ifD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.OLrzqt, (C22400hee) obj);
            }
        }));
    }

    public static final class Application implements InterfaceC59496ziD {
        public final /* synthetic */ hBP AEQbTJ;

        public Application(hBP hbp) {
            this.AEQbTJ = hbp;
        }

        @Override // o.InterfaceC59496ziD
        public void OLrzqt(boolean z) {
            C24812ikr c24812ikr;
            if (SwapTradeContentFragment.this.isConnected().UeEOUB() && (c24812ikr = SwapTradeContentFragment.this.getNewProxyInstance) != null) {
                c24812ikr.setVisibility(SwapTradeContentFragment.this.isConnected().DcqEDu() ? 0 : 8);
            }
            if (z) {
                return;
            }
            this.AEQbTJ.AYXKKw.setScrollingEnabled(true);
            this.AEQbTJ.OLrzqt.KWHzl();
            this.AEQbTJ.OLrzqt.AEQbTJ();
        }
    }

    public static final Unit getNewProxyInstance(final SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.isConnected().copydefault(new Function1() { // from class: o.ifg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(this.EZpvd, (InterfaceC9738bbJ) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        String strKWHzl;
        if ((interfaceC9738bbJ == null || !interfaceC9738bbJ.getFieldNames()) && !swapTradeContentFragment.isConnected().QUSxYX().AkhnZx()) {
            CrossValueDifferenceData crossValueDifferenceDataDWgRXt = swapTradeContentFragment.isConnected().DWgRXt();
            C22333hdQ c22333hdQKWHzl = swapTradeContentFragment.isConnected().RJOkX().KWHzl();
            C22337hdU c22337hdUAEQbTJ = swapTradeContentFragment.isConnected().RJOkX().AEQbTJ();
            Pair[] pairArr = new Pair[9];
            String strOLrzqt = c22333hdQKWHzl != null ? c22333hdQKWHzl.OLrzqt() : null;
            if (strOLrzqt == null) {
                strOLrzqt = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("chain", strOLrzqt);
            String strCopydefault = c22337hdUAEQbTJ != null ? c22337hdUAEQbTJ.copydefault() : null;
            if (strCopydefault == null) {
                strCopydefault = "";
            }
            pairArr[1] = C56390yDp.OLrzqt("value1", strCopydefault);
            String strKWHzl2 = c22337hdUAEQbTJ != null ? c22337hdUAEQbTJ.KWHzl() : null;
            if (strKWHzl2 == null) {
                strKWHzl2 = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("amount1", strKWHzl2);
            pairArr[3] = C56390yDp.OLrzqt(TabTitleInfo.KEY_BRIDGE, crossValueDifferenceDataDWgRXt.getBridgeName());
            String strDjBIcL = c22333hdQKWHzl != null ? c22333hdQKWHzl.djBIcL() : null;
            if (strDjBIcL == null) {
                strDjBIcL = "";
            }
            pairArr[4] = C56390yDp.OLrzqt("value2", strDjBIcL);
            String strAhwBna = c22333hdQKWHzl != null ? c22333hdQKWHzl.AhwBna() : null;
            if (strAhwBna == null) {
                strAhwBna = "";
            }
            pairArr[5] = C56390yDp.OLrzqt("amount2", strAhwBna);
            String strGEmmrt = c22333hdQKWHzl != null ? c22333hdQKWHzl.gEmmrt() : null;
            if (strGEmmrt == null) {
                strGEmmrt = "";
            }
            pairArr[6] = C56390yDp.OLrzqt("toChain", strGEmmrt);
            String strCopydefault2 = c22333hdQKWHzl != null ? c22333hdQKWHzl.copydefault() : null;
            if (strCopydefault2 == null) {
                strCopydefault2 = "";
            }
            pairArr[7] = C56390yDp.OLrzqt("value3", strCopydefault2);
            String strAEQbTJ = c22333hdQKWHzl != null ? c22333hdQKWHzl.AEQbTJ() : null;
            if (strAEQbTJ == null) {
                strAEQbTJ = "";
            }
            pairArr[8] = C56390yDp.OLrzqt("amount3", strAEQbTJ);
            ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(pairArr);
            if (C23313hvq.copydefault(c22333hdQKWHzl != null ? c22333hdQKWHzl.EZpvd() : null, "0")) {
                String strEZpvd = c22337hdUAEQbTJ != null ? c22337hdUAEQbTJ.EZpvd() : null;
                if (strEZpvd == null) {
                    strEZpvd = "";
                }
                arrayMapArrayMapOf.put("amount1", strEZpvd);
                String strKWHzl3 = c22333hdQKWHzl != null ? c22333hdQKWHzl.KWHzl() : null;
                if (strKWHzl3 == null) {
                    strKWHzl3 = "";
                }
                arrayMapArrayMapOf.put("amount2", strKWHzl3);
                String strAYXKKw = c22333hdQKWHzl != null ? c22333hdQKWHzl.AYXKKw() : null;
                arrayMapArrayMapOf.put("symbol", strAYXKKw != null ? strAYXKKw : "");
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi21, arrayMapArrayMapOf);
            } else {
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.RbVjfb, arrayMapArrayMapOf);
            }
            FragmentActivity activity = swapTradeContentFragment.getActivity();
            if (activity != null) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi215);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.ihnvzI, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
                viewOnClickListenerC54939xaY.show();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, hBP hbp) {
        C25352ivB.startVibrator$default(0L, 1, null);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.MAX.getValue(), false, null, 12, null);
        C25286itp c25286itp = swapTradeContentFragment.AuCTel;
        if (c25286itp != null) {
            c25286itp.AEQbTJ(hbp.OLrzqt, swapTradeContentFragment.isConnected());
        }
        swapTradeContentFragment.fetchVPNInfo().AEQbTJ(new AbstractC22410heo.ActionBar(swapTradeContentFragment.fIwbmz(), EventPageNameType.BRIDGE.getPageName(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.MAX.getButtonName()))));
        return Unit.INSTANCE;
    }

    public static final Unit AubY(SwapTradeContentFragment swapTradeContentFragment) {
        C25286itp c25286itp = swapTradeContentFragment.AuCTel;
        if (c25286itp != null) {
            C25286itp.showReverseTipDialog$default(c25286itp, swapTradeContentFragment.requireActivity(), swapTradeContentFragment.isConnected(), false, 4, null);
        }
        C32866mlf.onEvent$default("app_swap_all_balance_info", (TrackChannel[]) null, new Function1() { // from class: o.igc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        swapTradeContentFragment.gEmmrt(true);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.SELECT_FROM_TOKEN.getValue(), false, null, 12, null);
        swapTradeContentFragment.EZpvd(ButtonType.TRADE.getType(), TrackButtonName.TOKEN_FROM.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        swapTradeContentFragment.gEmmrt(true);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.SELECT_FROM_CHAIN.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        swapTradeContentFragment.gEmmrt(false);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.SELECT_TO_TOKEN.getValue(), false, null, 12, null);
        swapTradeContentFragment.EZpvd(ButtonType.TRADE.getType(), TrackButtonName.TOKEN_TO.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapTradeContentFragment swapTradeContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        swapTradeContentFragment.gEmmrt(false);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.SELECT_TO_CHAIN.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(final SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.isConnected().copydefault(new Function1() { // from class: o.ifN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(this.copydefault, (InterfaceC9738bbJ) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapTradeContentFragment swapTradeContentFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames()) {
            String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.iWlNch, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("payChain", swapTradeContentFragment.isConnected().QUSxYX().OLrzqt())));
            FragmentActivity activity = swapTradeContentFragment.getActivity();
            if (activity != null) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
                viewOnClickListenerC54939xaY.show();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SwapTradeContentFragment swapTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        ConsumeData<TradeInputGroup> value = swapTradeContentFragment.isConnected().dmfpNf().getValue();
        if (value != null) {
            value.getData().getFromData().getData().getEditData().setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
            swapTradeContentFragment.isConnected().finit().AkhnZx();
            setInputHintContent$default(swapTradeContentFragment, false, null, 2, null);
            if (swapTradeContentFragment.isConnected().QUSxYX().isConnected()) {
                swapTradeContentFragment.ejfBZ = 0;
            }
            swapTradeContentFragment.AuCTel();
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.FROM_TO_REVERT.getValue(), false, null, 12, null);
        }
        swapTradeContentFragment.EZpvd(ButtonType.TRADE.getType(), TrackButtonName.TRADE_DIRECTION_SWITCH.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit AuCTelauCTel(SwapTradeContentFragment swapTradeContentFragment) {
        Context context = swapTradeContentFragment.getContext();
        if (context != null) {
            if (swapTradeContentFragment.isConnected().QUSxYX().AkhnZx()) {
                View viewInflate = LayoutInflater.from(swapTradeContentFragment.requireContext()).inflate(C23274hvD.Activity.sZqaRl, (ViewGroup) null, false);
                TextView textView = (TextView) viewInflate.findViewById(C23274hvD.Application.onApplyThemeResource);
                TextView textView2 = (TextView) viewInflate.findViewById(C23274hvD.Application.StandaloneActionMode);
                QuotePriceRes quotePriceResAxsJAYsNCnLh = swapTradeContentFragment.isConnected().AxsJAYsNCnLh();
                if (quotePriceResAxsJAYsNCnLh != null && quotePriceResAxsJAYsNCnLh.isValueDiffWarningForSingleChain()) {
                    textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR));
                    textView2.setVisibility(8);
                } else {
                    textView2.setVisibility(0);
                    textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DPHOMC));
                    textView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.Rtjmuc));
                }
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.SQPLEi);
                Intrinsics.copydefault(viewInflate);
                viewOnClickListenerC54939xaY.EZpvd(viewInflate);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            } else {
                CrossValueDifferenceData crossValueDifferenceDataDWgRXt = swapTradeContentFragment.isConnected().DWgRXt();
                C24797ikc c24797ikc = new C24797ikc(context);
                c24797ikc.OLrzqt(crossValueDifferenceDataDWgRXt);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY2.setTitle(C23274hvD.Fragment.SQPLEi);
                viewOnClickListenerC54939xaY2.EZpvd(c24797ikc);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY2, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY2.show();
            }
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.VALUE_DIFFERENCE.getValue(), false, null, 12, null);
        }
        swapTradeContentFragment.EZpvd(ButtonType.EXPLAIN.getType(), TrackButtonName.RATE_DIFF_EXPLAIN.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(hBP hbp) {
        hbp.AYXKKw.setScrollingEnabled(false);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, ActivityResult activityResult) {
        CacheStatus cacheStatusOLrzqt;
        if (activityResult.getResultCode() == -1) {
            Intent data = activityResult.getData();
            AdvanceSlippageCache advanceSlippageCache = data != null ? (AdvanceSlippageCache) ((Parcelable) IntentCompat.getParcelableExtra(data, "data", AdvanceSlippageCache.class)) : null;
            AdvanceSlippageCache advanceSlippageCache2 = advanceSlippageCache instanceof AdvanceSlippageCache ? advanceSlippageCache : null;
            String strKWHzl = swapTradeContentFragment.isConnected().QfsBiF().KWHzl();
            C22814hmU c22814hmUQfsBiF = swapTradeContentFragment.isConnected().QfsBiF();
            if (advanceSlippageCache2 == null || (cacheStatusOLrzqt = advanceSlippageCache2.OLrzqt()) == null) {
                cacheStatusOLrzqt = CacheStatus.NONE;
            }
            c22814hmUQfsBiF.AEQbTJ(strKWHzl, cacheStatusOLrzqt);
            if (advanceSlippageCache2 != null) {
                swapTradeContentFragment.isConnected().KWHzl(advanceSlippageCache2);
            }
            swapTradeContentFragment.isConnected().AEQbTJ();
        }
    }

    public static final Unit KWHzl(final SwapTradeContentFragment swapTradeContentFragment, View view) {
        Object next;
        Object next2;
        String strOLrzqt;
        Intrinsics.checkNotNullParameter(view, "");
        QuotePriceRes quotePriceResAxsJAYsNCnLh = swapTradeContentFragment.isConnected().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            Iterator<T> it = C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).copydefault().AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((SlippageConfigVo) next).isCross()) {
                    break;
                }
            }
            SlippageConfigVo slippageConfigVo = (SlippageConfigVo) next;
            Iterator<T> it2 = C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).copydefault().AEQbTJ().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((SlippageConfigVo) next2).isSingle()) {
                    break;
                }
            }
            SlippageConfigVo slippageConfigVo2 = (SlippageConfigVo) next2;
            String minValue = slippageConfigVo2 != null ? slippageConfigVo2.getMinValue() : null;
            if (minValue == null) {
                minValue = "";
            }
            String minValue2 = slippageConfigVo != null ? slippageConfigVo.getMinValue() : null;
            if (minValue2 == null) {
                minValue2 = "";
            }
            String slippageFixedMin = quotePriceResAxsJAYsNCnLh.getSlippageFixedMin(minValue, minValue2);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
            boolean zGEmmrt = swapTradeContentFragment.isConnected().QfsBiF().gEmmrt();
            ActivityResultLauncher<Intent> activityResultLauncher = swapTradeContentFragment.zLjUOn;
            if (activityResultLauncher != null) {
                Intent intent = new Intent(swapTradeContentFragment.getActivity(), (Class<?>) ActivityC30530lcr.class);
                C31200lpY.EZpvd(intent, "default_trade");
                SlippageMode slippageModeCopydefault = swapTradeContentFragment.isConnected().DCUTEI().copydefault();
                boolean zIsSingle = quotePriceResAxsJAYsNCnLh.isSingle();
                boolean safeMoonToken = quotePriceResAxsJAYsNCnLh.getSafeMoonToken();
                DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceResAxsJAYsNCnLh.autoSlippageInfo();
                String referenceSlippage = dexAutoSlippageInfoParamAutoSlippageInfo != null ? dexAutoSlippageInfoParamAutoSlippageInfo.getReferenceSlippage() : null;
                String strAutoSlippage = quotePriceResAxsJAYsNCnLh.autoSlippage();
                if (referenceSlippage == null || referenceSlippage.length() == 0) {
                    referenceSlippage = strAutoSlippage;
                }
                QuoteSlippageParams quoteSlippageParams = new QuoteSlippageParams(safeMoonToken, zIsSingle, referenceSlippage);
                TradeMode tradeMode = TradeMode.Bridge;
                DynamicParam dynamicParam = new DynamicParam(false, null, null, quotePriceResAxsJAYsNCnLh.autoSlippage(), null, null, null, null, false, false, swapTradeContentFragment.isConnected().QUSxYX().djBIcL(), quotePriceResAxsJAYsNCnLh.getSafeMoonToken(), quotePriceResAxsJAYsNCnLh.isBridge(), false, null, 25588, null);
                String str = (slippageModeCopydefault != SlippageMode.Fixed || (strOLrzqt = swapTradeContentFragment.isConnected().DCUTEI().OLrzqt(null)) == null) ? "" : strOLrzqt;
                String maxValue = slippageConfigVo != null ? slippageConfigVo.getMaxValue() : null;
                if (maxValue == null) {
                    maxValue = "";
                }
                SlippageViewParam slippageViewParam = new SlippageViewParam(tradeMode, slippageModeCopydefault, dynamicParam, new FixedParam(str, null, maxValue, slippageFixedMin, null, false, null, null, null, null, 992, null));
                TradeMode tradeMode2 = TradeMode.SwapMarket;
                boolean zDjBIcL = swapTradeContentFragment.isConnected().QfsBiF().djBIcL();
                String chainName = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainName() : null;
                String str2 = chainName == null ? "" : chainName;
                String chainName2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainName() : null;
                String str3 = chainName2 == null ? "" : chainName2;
                String chainLogoUrl = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainLogoUrl() : null;
                String str4 = chainLogoUrl == null ? "" : chainLogoUrl;
                String chainLogoUrl2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainLogoUrl() : null;
                MevSimpleParam mevSimpleParam = new MevSimpleParam(tradeMode2, zDjBIcL, zGEmmrt, new MevInfoParam(zGEmmrt, str2, str3, str4, chainLogoUrl2 == null ? "" : chainLogoUrl2, swapTradeContentFragment.isConnected().igXuih(), swapTradeContentFragment.isConnected().fERRXa()));
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2 = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
                String tokenSymbol = dexMultiTokenInfoBeanValueOf2 != null ? dexMultiTokenInfoBeanValueOf2.getTokenSymbol() : null;
                intent.putExtra("data", new AdvanceSlippageParams(quoteSlippageParams, mevSimpleParam, slippageViewParam, new MinimumReceivedParam(tradeMode2, null, tokenSymbol == null ? "" : tokenSymbol, quotePriceResAxsJAYsNCnLh.receiveAmount(), quotePriceResAxsJAYsNCnLh.toToken().getDecimals(), false, 34, null)));
                activityResultLauncher.launch(intent);
            }
        }
        C32866mlf.onEvent$default("app_swap_advance", (TrackChannel[]) null, new Function1() { // from class: o.ifS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(this.KWHzl, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        swapTradeContentFragment.EZpvd(ButtonType.TRADE.getType(), TrackButtonName.SLIPPAGE_ENTER.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("business_type", swapTradeContentFragment.EZpvd(swapTradeContentFragment.AEQbTJ()), true);
        eventParamsList.put(EopTrackEvent.KEY_BUTTON_NAME, DexSwapFullClick.SLIPPAGE.getValue(), true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, SettingItemData settingItemData) {
        Intrinsics.checkNotNullParameter(settingItemData, "");
        FragmentActivity activity = swapTradeContentFragment.getActivity();
        if (activity != null) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.KWHzl(C23274hvD.Activity.DjwCMv);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
            viewOnClickListenerC54939xaY.show();
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.TOOLTIP_SLIPPAGE.getValue(), false, null, 12, null);
            swapTradeContentFragment.EZpvd(ButtonType.EXPLAIN.getType(), TrackButtonName.SLIPPAGE_EXPLAIN.getButtonName());
        }
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.EZpvd(ButtonType.EXPLAIN.getType(), TrackButtonName.BRIDGE_RATE_EXPLAIN.getButtonName());
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(SwapTradeContentFragment swapTradeContentFragment) {
        refresh$default(swapTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(final SwapTradeContentFragment swapTradeContentFragment, final hBP hbp) {
        swapTradeContentFragment.isConnected().copydefault(new Function0() { // from class: o.igd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.gEmmrt(this.OLrzqt, hbp);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SwapTradeContentFragment swapTradeContentFragment, hBP hbp) {
        swapTradeContentFragment.isConnected().dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        String strAEQbTJ = swapTradeContentFragment.AEQbTJ();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (!c22825hmf.KWHzl(strAEQbTJ, chainId, chainId2 != null ? chainId2 : "")) {
            hbp.OLrzqt.setFromEnableEdit(true);
        }
        refresh$default(swapTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.DbNXlk();
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(SwapTradeContentFragment swapTradeContentFragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        swapTradeContentFragment.dismissLoading();
        if (swapTradeContentFragment.getActivity() != null && (dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault()) != null) {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            String strSubCheckS$default = C23313hvq.subCheckS$default(swapTradeContentFragment.isConnected().gHZMYf(), swapTradeContentFragment.isConnected().DbNXlk(), null, null, null, 14, null);
            RoundingMode roundingMode = RoundingMode.DOWN;
            String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.HJWChPQdUnVm, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("unablevalue", C23271hvA.getShowData$default(c23271hvA, strSubCheckS$default, false, roundingMode, false, false, 26, null)), C56390yDp.OLrzqt("symbol", dexMultiTokenInfoBeanCopydefault.getTokenSymbol()), C56390yDp.OLrzqt("value", C23271hvA.getShowData$default(c23271hvA, swapTradeContentFragment.isConnected().DbNXlk(), false, roundingMode, false, false, 26, null)), C56390yDp.OLrzqt("symbol", dexMultiTokenInfoBeanCopydefault.getTokenSymbol())));
            FragmentActivity activity = swapTradeContentFragment.getActivity();
            if (activity != null) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(SwapTradeContentFragment swapTradeContentFragment) {
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.ADD_FUNDS.getValue(), false, null, 12, null);
        swapTradeContentFragment.fARcdN();
        swapTradeContentFragment.fetchVPNInfo().AEQbTJ(new AbstractC22410heo.ActionBar(swapTradeContentFragment.fIwbmz(), EventPageNameType.BRIDGE.getPageName(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.DEPOSIT.getButtonName()))));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (swapState == SwapState.SWAP) {
            swapTradeContentFragment.copydefault(EventTrackSubmitType.SUBMIT);
        } else if (swapState == SwapState.NO_WALLET) {
            swapTradeContentFragment.copydefault(EventTrackSubmitType.CONNECTED_WALLET);
        } else if (swapState.isDAppRedirectState()) {
            swapTradeContentFragment.copydefault(EventTrackSubmitType.DAPP);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapTradeContentFragment swapTradeContentFragment, Bundle bundle) {
        swapTradeContentFragment.AEQbTJ(bundle);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (swapState == SwapState.APPROVE) {
            swapTradeContentFragment.copydefault(EventTrackSubmitType.APPROVE);
        } else if (swapState == SwapState.APPROVED_AND_NEED_CANCEL_APPROVE) {
            swapTradeContentFragment.copydefault(EventTrackSubmitType.REVOKE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit sSMYrx(SwapTradeContentFragment swapTradeContentFragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        String str = chainId2 != null ? chainId2 : "";
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        if (!c22825hmf.EZpvd(swapTradeContentFragment.AEQbTJ(), chainId, false) && !c22825hmf.KWHzl(swapTradeContentFragment.AEQbTJ(), chainId, str) && swapTradeContentFragment.getActivity() != null) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C23274hvD.Fragment.ResultReceiver1), 0, 1, (Object) null);
        }
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapTradeContentFragment.AEQbTJ(), DexSwapFullClick.MODIFY_TO_AMOUNT.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        swapTradeContentFragment.ejfBZ();
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(SwapTradeContentFragment swapTradeContentFragment, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        displayQuoteResultPanel$default(swapTradeContentFragment, false, 1, null);
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, C22400hee c22400hee) {
        if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_Click")) {
            swapTradeContentFragment.fetchVPNInfo().AEQbTJ(new AbstractC22410heo.ActionBar(swapTradeContentFragment.isConnected().hDKMBd(), c22400hee.KWHzl(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, c22400hee.copydefault()), C56390yDp.OLrzqt("button_type", c22400hee.AEQbTJ()))));
        } else if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_View")) {
            swapTradeContentFragment.fetchVPNInfo().AEQbTJ(new AbstractC22410heo.Application(swapTradeContentFragment.isConnected().hDKMBd(), c22400hee.KWHzl(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), null, null, 96, null));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(String str, String str2) {
        fetchVPNInfo().AEQbTJ(new AbstractC22410heo.ActionBar(fIwbmz(), EventPageNameType.BRIDGE.getPageName(), BusinessType.BRIDGE.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.BRIDGE.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", str), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str2))));
    }

    public final void fJNWhG() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        isConnected().DCUTEIddSDPG();
        C25416iwM c25416iwMDCUTEI = isConnected().DCUTEI();
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = isConnected().AxsJAYsNCnLh();
        String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh2 != null ? quotePriceResAxsJAYsNCnLh2.autoSlippage() : null);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        boolean zEZpvd = isConnected().DCUTEI().EZpvd();
        QuotePriceRes quotePriceResAxsJAYsNCnLh3 = isConnected().AxsJAYsNCnLh();
        if ((quotePriceResAxsJAYsNCnLh3 == null || !quotePriceResAxsJAYsNCnLh3.isIntentBridge()) && (quotePriceResAxsJAYsNCnLh = isConnected().AxsJAYsNCnLh()) != null && quotePriceResAxsJAYsNCnLh.isSlipPageFluctuationThreshold() && !zEZpvd) {
            isConnected().dvKsVJ().setValue(Boolean.FALSE);
            C25352ivB.EZpvd(getActivity(), strOLrzqt, new Function0() { // from class: o.ifR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.QVAiDq(this.OLrzqt);
                }
            }, new Function0() { // from class: o.ifU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.QbewEr(this.EZpvd);
                }
            });
        } else {
            C24718ijC c24718ijC = this.iwGUEr;
            if (c24718ijC != null) {
                c24718ijC.copydefault();
            }
        }
    }

    public static final Unit QVAiDq(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.isConnected().dvKsVJ().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit QbewEr(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.isConnected().dvKsVJ().setValue(Boolean.TRUE);
        C24718ijC c24718ijC = swapTradeContentFragment.iwGUEr;
        if (c24718ijC != null) {
            c24718ijC.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = isConnected().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null && quotePriceResAxsJAYsNCnLh.isIntentBridge() && !C23317hvu.AEQbTJ(false)) {
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            C24679iiQ c24679iiQKWHzl = C24679iiQ.Companion.KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.getQueue), C33070mpX.AYXKKw(C23274hvD.Fragment.fastForward), (12 & 4) != 0 ? null : null, (12 & 8) != 0 ? Boolean.FALSE : null, C33070mpX.AYXKKw(C23274hvD.Fragment.onPlayFromUri), C33070mpX.AYXKKw(C23274hvD.Fragment.onPlayFromSearch), (12 & 64) != 0 ? "" : C33070mpX.AYXKKw(C23274hvD.Fragment.sendRequest), new Function0() { // from class: o.igo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.copydefault(booleanRef, this);
                }
            }, new Function0() { // from class: o.igm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.QKVWgx(this.EZpvd);
                }
            }, (12 & 512) != 0 ? null : new CompoundButton.OnCheckedChangeListener() { // from class: o.igt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    SwapTradeContentFragment.copydefault(booleanRef, compoundButton, z);
                }
            });
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c24679iiQKWHzl.show(childFragmentManager);
            return;
        }
        fJNWhG();
    }

    public static final Unit copydefault(Ref.BooleanRef booleanRef, SwapTradeContentFragment swapTradeContentFragment) {
        C23317hvu.OLrzqt(false, booleanRef.element);
        swapTradeContentFragment.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(SwapTradeContentFragment swapTradeContentFragment) {
        swapTradeContentFragment.isConnected().dvKsVJ().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Ref.BooleanRef booleanRef, CompoundButton compoundButton, boolean z) {
        booleanRef.element = z;
    }

    public final void fARcdN() {
        Unit unit;
        InterfaceC9738bbJ interfaceC9738bbJQSLkRj = isConnected().QSLkRj();
        if (interfaceC9738bbJQSLkRj != null) {
            if (interfaceC9738bbJQSLkRj.zLjUOn()) {
                uzCIH();
                unit = Unit.INSTANCE;
            } else {
                FragmentActivity activity = getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    String strAEQbTJ = AEQbTJ();
                    FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C31205lpd.AEQbTJ(abstractActivityC33041mov, strAEQbTJ, parentFragmentManager, interfaceC9738bbJQSLkRj);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        uzCIH();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void uzCIH() {
        String originContractAddress;
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = isConnected().QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault2 == null || !dexMultiTokenInfoBeanCopydefault2.isMainChainCoin()) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = isConnected().QUSxYX().copydefault();
            originContractAddress = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getOriginContractAddress() : null;
            if (originContractAddress == null) {
                originContractAddress = "";
            }
        }
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, abstractActivityC33041mov, chainId, originContractAddress, null, null, isConnected().gEmmrt(), 24, null);
        copydefault(EventTrackSubmitType.DEPOSIT);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void values() {
        String data;
        String str;
        String strKWHzl;
        TradeInputGroup data2;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data3;
        FromToBalance balance;
        final QuotePriceRes quotePriceResAxsJAYsNCnLh = isConnected().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            C25416iwM c25416iwMDCUTEI = isConnected().DCUTEI();
            String strKWHzl2 = isConnected().finit().KWHzl();
            String strKWHzl3 = C31256lqb.KWHzl(c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh.autoSlippage()), (Function0<String>) new Function0() { // from class: o.igu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapTradeContentFragment.AEQbTJ(quotePriceResAxsJAYsNCnLh);
                }
            });
            boolean zEZpvd = c25416iwMDCUTEI.EZpvd();
            if (quotePriceResAxsJAYsNCnLh.fromToken().isMainChainCoin()) {
                ConsumeData<TradeInputGroup> value = isConnected().dmfpNf().getValue();
                if (value == null || (data2 = value.getData()) == null || (fromData = data2.getFromData()) == null || (data3 = fromData.getData()) == null || (balance = data3.getBalance()) == null || (data = balance.getData()) == null) {
                    str = "";
                }
                C22901hoB c22901hoBZuBGHE = isConnected().zuBGHE();
                String str2 = (c22901hoBZuBGHE != null || (strKWHzl = c22901hoBZuBGHE.KWHzl()) == null) ? "" : strKWHzl;
                String strAhwBna = isConnected().finit().AhwBna();
                DefiChainInfo newProxyInstance = isConnected().getNewProxyInstance();
                String gasPriceScalar = newProxyInstance == null ? newProxyInstance.getGasPriceScalar() : null;
                TransactionBean transactionBean = new TransactionBean(strKWHzl2, strKWHzl3, zEZpvd, str, str2, quotePriceResAxsJAYsNCnLh, strAhwBna, gasPriceScalar != null ? "" : gasPriceScalar, (String) null, (TransactionType) null, (OrderIdTypeData) null, (String) null, (String) null, isConnected().gEmmrt(), isConnected().QfsBiF().gEmmrt(), isConnected().QfsBiF().djBIcL(), 0L, (String) null, (TransactionBean.SwapType) null, (MergeCallData) null, (ServiceFeeInfo) null, c25416iwMDCUTEI.copydefault(), c25416iwMDCUTEI.OLrzqt(), c25416iwMDCUTEI.AEQbTJ(), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (AccountInfo) null, (PresetRouteType) null, (TeeSaStatus) null, false, -14737664, 0, (DefaultConstructorMarker) null);
                Context contextRequireContext = requireContext();
                Intent intent = new Intent(requireContext(), (Class<?>) ActivityC25050ipR.class);
                C31200lpY.EZpvd(intent, AEQbTJ());
                intent.putExtra("data", transactionBean);
                intent.putExtra("swap_type", false);
                contextRequireContext.startActivity(intent);
            } else {
                data = "0";
            }
            str = data;
            C22901hoB c22901hoBZuBGHE2 = isConnected().zuBGHE();
            if (c22901hoBZuBGHE2 != null) {
                String strAhwBna2 = isConnected().finit().AhwBna();
                DefiChainInfo newProxyInstance2 = isConnected().getNewProxyInstance();
                if (newProxyInstance2 == null) {
                }
                TransactionBean transactionBean2 = new TransactionBean(strKWHzl2, strKWHzl3, zEZpvd, str, str2, quotePriceResAxsJAYsNCnLh, strAhwBna2, gasPriceScalar != null ? "" : gasPriceScalar, (String) null, (TransactionType) null, (OrderIdTypeData) null, (String) null, (String) null, isConnected().gEmmrt(), isConnected().QfsBiF().gEmmrt(), isConnected().QfsBiF().djBIcL(), 0L, (String) null, (TransactionBean.SwapType) null, (MergeCallData) null, (ServiceFeeInfo) null, c25416iwMDCUTEI.copydefault(), c25416iwMDCUTEI.OLrzqt(), c25416iwMDCUTEI.AEQbTJ(), (String) null, (Boolean) null, (String) null, (String) null, (String) null, (AccountInfo) null, (PresetRouteType) null, (TeeSaStatus) null, false, -14737664, 0, (DefaultConstructorMarker) null);
                Context contextRequireContext2 = requireContext();
                Intent intent2 = new Intent(requireContext(), (Class<?>) ActivityC25050ipR.class);
                C31200lpY.EZpvd(intent2, AEQbTJ());
                intent2.putExtra("data", transactionBean2);
                intent2.putExtra("swap_type", false);
                contextRequireContext2.startActivity(intent2);
            }
        }
        copydefault(EventTrackSubmitType.SUBMIT);
    }

    public static final String AEQbTJ(QuotePriceRes quotePriceRes) {
        return quotePriceRes.autoSlippage();
    }

    public final void copydefault(EventTrackSubmitType eventTrackSubmitType) {
        AbstractC22410heo abstractC22410heoValueOf = isConnected().valueOf(eventTrackSubmitType.getType());
        if (abstractC22410heoValueOf != null) {
            fetchVPNInfo().AEQbTJ(abstractC22410heoValueOf);
        }
    }

    public final void ejfBZ() {
        final QuotePriceRes quotePriceResAxsJAYsNCnLh = isConnected().AxsJAYsNCnLh();
        boolean zAkhnZx = isConnected().QUSxYX().AkhnZx();
        final C24354icJ c24354icJOLrzqt = C24354icJ.Companion.OLrzqt(false);
        this.AuCTelauCTel = c24354icJOLrzqt;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c24354icJOLrzqt.AEQbTJ(zAkhnZx, childFragmentManager, new Function1() { // from class: o.igv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.AEQbTJ, quotePriceResAxsJAYsNCnLh, c24354icJOLrzqt, (PathRouterUi) obj);
            }
        });
        C32866mlf.onEvent$default("app_swap_smart_router_click", (TrackChannel[]) null, new Function1() { // from class: o.igy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.valueOf(this.AEQbTJ, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        EZpvd(ButtonType.OTHERS.getType(), TrackButtonName.BRIDGE_ROUTER_ENTER.getButtonName());
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, QuotePriceRes quotePriceRes, final C24354icJ c24354icJ, PathRouterUi pathRouterUi) {
        List<DeFiPlatformForSwap> listAhwBna;
        DexMultiTokenInfoBean token;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        Intrinsics.checkNotNullParameter(pathRouterUi, "");
        C24369icY.StateListAnimator stateListAnimator = C24369icY.Companion;
        String strAEQbTJ = swapTradeContentFragment.AEQbTJ();
        if (quotePriceRes == null || (listAhwBna = quotePriceRes.getDefiPlatformInfoList()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        List<DeFiPlatformForSwap> list = listAhwBna;
        List<PathSelectionRouterItem> pathSelectionRouterList = quotePriceRes != null ? quotePriceRes.getPathSelectionRouterList() : null;
        String swapType = quotePriceRes != null ? quotePriceRes.getSwapType() : null;
        stateListAnimator.AEQbTJ(strAEQbTJ, new SmartRoutingData(list, pathSelectionRouterList, swapType == null ? "" : swapType, (quotePriceRes == null || (dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken()) == null) ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : dexMultiTokenInfoBeanFromToken, (quotePriceRes == null || (token = quotePriceRes.toToken()) == null) ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : token), pathRouterUi, new Function0() { // from class: o.ige
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapTradeContentFragment.OLrzqt(c24354icJ);
            }
        }).show(swapTradeContentFragment.getChildFragmentManager(), "javaClass");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24354icJ c24354icJ) {
        c24354icJ.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(SwapTradeContentFragment swapTradeContentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", swapTradeContentFragment.isConnected().QCjLjM(), false);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final hBP hbp) {
        isConnected().QKVWgx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AYXKKw(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        }));
        isConnected().RKDWNf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.valueOf(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        }));
        isConnected().dvKsVJ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ihb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.gEmmrt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        C22380heK.OLrzqt.copydefault(AEQbTJ()).copydefault().valueOf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ihg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.KWHzl, (TradeParam) obj);
            }
        }));
        C23314hvr<String> c23314hvrRdAHlO = isConnected().RdAHlO();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c23314hvrRdAHlO.observe(viewLifecycleOwner, new Observer() { // from class: o.ihi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.copydefault((java.lang.String) obj);
            }
        });
        C23314hvr<Boolean> c23314hvrValueOf = isConnected().valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c23314hvrValueOf.observe(viewLifecycleOwner2, new LoaderManager(new Function1() { // from class: o.ihf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        isConnected().OBJEWx().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ifk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(this.EZpvd, hbp, (java.lang.Boolean) obj);
            }
        }));
        isConnected().fJNWhG().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ifm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(this.KWHzl, hbp, (java.lang.Boolean) obj);
            }
        }));
        isConnected().hUfVAv().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ifj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.OLrzqt, hbp, (ConsumeData) obj);
            }
        }));
        isConnected().OJuSTm().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ifq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        }));
        isConnected().QKudOq().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(hbp, this, (java.lang.Boolean) obj);
            }
        }));
        isConnected().RlQdEF().getBtcFreeGasLiveData().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(this.copydefault, hbp, (WalletDexService.FeeInfo) obj);
            }
        }));
        isConnected().RlQdEF().getAaWalletFreeGasLiveData().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(this.OLrzqt, hbp, (WalletDexService.AAFreeGasInfo) obj);
            }
        }));
        C23314hvr<String> c23314hvrAhwBna = isConnected().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c23314hvrAhwBna.observe(viewLifecycleOwner3, new LoaderManager(new Function1() { // from class: o.igF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.valueOf(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        isConnected().dmfpNf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(this.AEQbTJ, hbp, (ConsumeData) obj);
            }
        }));
        isConnected().AubY().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.KWHzl, hbp, (QuotePriceRes) obj);
            }
        }));
        isConnected().djBIcL().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AEQbTJ(hbp, this, (ConsumeData) obj);
            }
        }));
        isConnected().dHguZz().getCurrentState().observe(this, this.AubY);
        isConnected().QOLQEE().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.djBIcL(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        isConnected().getPostValueLengthLimit().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AYXKKw(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        isConnected().djSkpj().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(hbp, this, (Triple) obj);
            }
        }));
        isConnected().OHqIaq().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(this.AEQbTJ, hbp, (Triple) obj);
            }
        }));
        isConnected().QkdxfA().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(hbp, this, (java.lang.Boolean) obj);
            }
        }));
        isConnected().OcIXYQ().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.djBIcL(this.copydefault, hbp, (java.lang.Boolean) obj);
            }
        }));
        hbp.OLrzqt.copydefault(new View.OnFocusChangeListener() { // from class: o.igQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                SwapTradeContentFragment.OLrzqt(this.OLrzqt, view, z);
            }
        });
        hbp.OLrzqt.EZpvd(new View.OnFocusChangeListener() { // from class: o.igR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                SwapTradeContentFragment.AEQbTJ(this.OLrzqt, view, z);
            }
        });
        isConnected().DTwDnp().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(hbp, (java.lang.Boolean) obj);
            }
        }));
        isConnected().gkJEwt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.copydefault(hbp, this, (kotlin.Pair) obj);
            }
        }));
        isConnected().DCJXGO().observe(getViewLifecycleOwner(), new Observer() { // from class: o.igW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.AhwBna(this.copydefault, (java.lang.Boolean) obj);
            }
        });
        isConnected().OFhtUX().observe(getViewLifecycleOwner(), new Observer() { // from class: o.igV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.valueOf(this.KWHzl, (java.lang.Boolean) obj);
            }
        });
        isConnected().hrNTAI().observe(getViewLifecycleOwner(), new Observer() { // from class: o.igY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapTradeContentFragment.OLrzqt((java.lang.String) obj);
            }
        });
        C23314hvr<String> c23314hvrDLWbHP = isConnected().DLWbHP();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c23314hvrDLWbHP.observe(viewLifecycleOwner4, new LoaderManager(new Function1() { // from class: o.ihd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.gEmmrt(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        isConnected().ODXsMY().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.iha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.EZpvd(hbp, this, (QuotePriceRes) obj);
            }
        }));
        isConnected().zLjUOn().gEmmrt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.ihc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AhwBna(this.copydefault, (java.lang.String) obj);
            }
        }));
        isConnected().zLjUOn().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.igZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit AYXKKw(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        swapTradeContentFragment.AEQbTJ(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        swapTradeContentFragment.EZpvd(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            swapTradeContentFragment.showLoadingAtOnceCannotCancel();
        } else {
            swapTradeContentFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, TradeParam tradeParam) {
        if (!Intrinsics.EZpvd(tradeParam, TradeParam.Companion.AEQbTJ())) {
            C23310hvn c23310hvn = C23310hvn.copydefault;
            String name = Companion.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            C23310hvn.i$default(c23310hvn, name, "swap info = " + tradeParam.getFromCoinInfo().getChainId(), null, 4, null);
            C23154hsq c23154hsqIsConnected = swapTradeContentFragment.isConnected();
            Intrinsics.copydefault(tradeParam);
            c23154hsqIsConnected.OLrzqt(tradeParam, false);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
    }

    public static final Unit KWHzl(SwapTradeContentFragment swapTradeContentFragment, boolean z) {
        FragmentActivity activity;
        if (z && (activity = swapTradeContentFragment.getActivity()) != null) {
            C25352ivB.KWHzl((Context) activity, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, final hBP hbp, Boolean bool) {
        if (bool.booleanValue()) {
            C24995ioP c24995ioP = swapTradeContentFragment.fetchVPNInfo;
            if (c24995ioP != null) {
                c24995ioP.AkhnZx();
            }
            swapTradeContentFragment.AuCTel();
        }
        swapTradeContentFragment.isConnected().copydefault(new Function1() { // from class: o.igf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(hbp, (InterfaceC9738bbJ) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(hBP hbp, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames()) {
            hbp.OLrzqt.setReverseTipVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, Boolean bool) {
        if (bool.booleanValue()) {
            C24995ioP c24995ioP = swapTradeContentFragment.fetchVPNInfo;
            if (c24995ioP != null) {
                FragmentManager childFragmentManager = swapTradeContentFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c24995ioP.OLrzqt(hbp, childFragmentManager, fragmentActivityRequireActivity);
            }
        } else {
            ApproveStatusGroup approveStatusGroup = swapTradeContentFragment.isConnected().isConnected().getApproveStatusGroup();
            if (approveStatusGroup != null && !approveStatusGroup.isNeedCancelApprove(swapTradeContentFragment.isConnected().AkhnZx(), swapTradeContentFragment.isConnected().QUSxYX().copydefault()) && !swapTradeContentFragment.isConnected().QVsKAR().isWalletError(swapTradeContentFragment.AEQbTJ())) {
                hbp.EZpvd.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final SwapTradeContentFragment swapTradeContentFragment, hBP hbp, ConsumeData consumeData) {
        C24995ioP c24995ioP;
        QuoteErrorBean quoteErrorBean = (QuoteErrorBean) consumeData.consumeData();
        if (quoteErrorBean != null) {
            if (quoteErrorBean.isQuoteErrorValueOutOfScope() && swapTradeContentFragment.isConnected().htlTjW()) {
                Pair pairOLrzqt = C56390yDp.OLrzqt(quoteErrorBean.getCrossMiniAmount(), quoteErrorBean.getCrossMaxAmount());
                if (C23313hvq.KWHzl(quoteErrorBean.getAmount(), pairOLrzqt.getFirst())) {
                    swapTradeContentFragment.isConnected().EZpvd(true);
                    swapTradeContentFragment.OLrzqt(true, (String) pairOLrzqt.getFirst());
                    swapTradeContentFragment.isConnected().RlQdEF().disposeQuote();
                }
            }
            SwapType swapType = swapTradeContentFragment.isConnected().QUSxYX().AkhnZx() ? SwapType.SWAP : SwapType.CROSS_CHAIN_SWAP;
            if (!swapTradeContentFragment.isConnected().QUSxYX().AkhnZx() && (c24995ioP = swapTradeContentFragment.fetchVPNInfo) != null) {
                C24694iif c24694iifAEQbTJ = C24695iig.AEQbTJ(swapTradeContentFragment.AEQbTJ(), false);
                FragmentManager childFragmentManager = swapTradeContentFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                c24995ioP.OLrzqt(quoteErrorBean, hbp, c24694iifAEQbTJ, childFragmentManager, fragmentActivityRequireActivity, swapType, swapTradeContentFragment.isConnected().dNCPSb().valueOf(), new SwapTradeContentFragment$addDataListener$9$1$1(swapTradeContentFragment), (256 & 256) != 0, (256 & 512) != 0 ? new Function0() { // from class: o.ipo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C24995ioP.djBIcL();
                    }
                } : new Function0() { // from class: o.ifY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return SwapTradeContentFragment.hDKMBd(this.KWHzl);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(SwapTradeContentFragment swapTradeContentFragment) {
        FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        String strAEQbTJ = swapTradeContentFragment.AEQbTJ();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        C25352ivB.OLrzqt((Context) fragmentActivityRequireActivity, strAEQbTJ, chainId != null ? chainId : "", false);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, Pair pair) {
        swapTradeContentFragment.AkhnZx().AEQbTJ().setValue(pair.getFirst());
        swapTradeContentFragment.isConnected().hrNTAI().setValue(((CurrentChain) pair.getFirst()).getData().getChainId());
        if (C22372heC.AEQbTJ(swapTradeContentFragment.AEQbTJ())) {
            swapTradeContentFragment.isConnected().DCJXGO().setValue(Boolean.TRUE);
        }
        swapTradeContentFragment.isConnected().OFhtUX().setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(hBP hbp, SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            if (hbp.EZpvd.getVisibility() != 0) {
                displayQuoteResultPanel$default(swapTradeContentFragment, false, 1, null);
                hbp.valueOf.KWHzl(true);
                swapTradeContentFragment.AhwBna(true);
            } else {
                swapTradeContentFragment.AhwBna(false);
            }
            hbp.valueOf.OLrzqt(100L);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, WalletDexService.FeeInfo feeInfo) {
        NetWorkFeeShowType networkFeeShowType;
        if (swapTradeContentFragment.isConnected().AxsJAYsNCnLh() != null) {
            AbstractC22802hmI abstractC22802hmIOLrzqt = swapTradeContentFragment.isConnected().RJOkX().OLrzqt();
            Context contextRequireContext = swapTradeContentFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            String strCopydefault = abstractC22802hmIOLrzqt.EZpvd(contextRequireContext).copydefault();
            ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = hbp.valueOf.djBIcL();
            if (viewOnClickListenerC24460ieJDjBIcL != null) {
                boolean zAkhnZx = swapTradeContentFragment.isConnected().QUSxYX().AkhnZx();
                QuotePriceRes quotePrice = swapTradeContentFragment.isConnected().RlQdEF().getQuotePrice();
                if (quotePrice == null || (networkFeeShowType = quotePrice.getNetworkFeeShowType()) == null) {
                    networkFeeShowType = NetWorkFeeShowType.NOT_FREE;
                }
                viewOnClickListenerC24460ieJDjBIcL.OLrzqt(strCopydefault, !zAkhnZx, strCopydefault, networkFeeShowType);
            }
            if (!swapTradeContentFragment.isConnected().RlQdEF().isInitFee()) {
                hbp.valueOf.fARcdN();
                swapTradeContentFragment.isConnected().RlQdEF().setInitFee(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, WalletDexService.AAFreeGasInfo aAFreeGasInfo) {
        if (swapTradeContentFragment.isConnected().AxsJAYsNCnLh() != null) {
            AbstractC22802hmI abstractC22802hmIOLrzqt = swapTradeContentFragment.isConnected().RJOkX().OLrzqt();
            Context contextRequireContext = swapTradeContentFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C22803hmJ c22803hmJEZpvd = abstractC22802hmIOLrzqt.EZpvd(contextRequireContext);
            ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = hbp.valueOf.djBIcL();
            if (viewOnClickListenerC24460ieJDjBIcL != null) {
                ViewOnClickListenerC24460ieJ.initData$default(viewOnClickListenerC24460ieJDjBIcL, c22803hmJEZpvd.copydefault(), !swapTradeContentFragment.isConnected().QUSxYX().AkhnZx(), null, null, 12, null);
            }
            if (!swapTradeContentFragment.isConnected().RlQdEF().isInitFee()) {
                hbp.valueOf.fARcdN();
                swapTradeContentFragment.isConnected().RlQdEF().setInitFee(true);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(final SwapTradeContentFragment swapTradeContentFragment, String str) {
        DefiChainInfo newProxyInstance = swapTradeContentFragment.isConnected().getNewProxyInstance();
        String baseToken = newProxyInstance != null ? newProxyInstance.getBaseToken() : null;
        if (baseToken == null) {
            baseToken = "";
        }
        String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.RWIpjU, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("nativeToken", baseToken)));
        FragmentActivity activity = swapTradeContentFragment.getActivity();
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(strKWHzl);
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.adjustVolume, new View.OnClickListener() { // from class: o.igq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapTradeContentFragment.copydefault(viewOnClickListenerC54939xaY, swapTradeContentFragment, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags, new View.OnClickListener() { // from class: o.igs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapTradeContentFragment.EZpvd(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, SwapTradeContentFragment swapTradeContentFragment, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        interfaceC23194htdFARcdN.copydefault(abstractActivityC33041mov, chainId, "");
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, ConsumeData consumeData) {
        String chainId;
        TradeInputGroup tradeInputGroup = (TradeInputGroup) consumeData.consumeData();
        if (tradeInputGroup != null) {
            AbstractC22885hnm abstractC22885hnmFinit = swapTradeContentFragment.isConnected().finit();
            String strAEQbTJ = swapTradeContentFragment.isConnected().QUSxYX().AEQbTJ();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
            if (dexMultiTokenInfoBeanValueOf == null || (chainId = dexMultiTokenInfoBeanValueOf.getChainId()) == null) {
                chainId = "";
            }
            hbp.OLrzqt.setFromEnableEdit(abstractC22885hnmFinit.AEQbTJ(strAEQbTJ, chainId));
            TradeInputData tradeInputDataConsumeData = tradeInputGroup.getFromData().consumeData();
            if (tradeInputDataConsumeData != null) {
                tradeInputDataConsumeData.setFrom(true);
                hbp.OLrzqt.setFromData(swapTradeContentFragment.isConnected().finit().OLrzqt(tradeInputDataConsumeData));
            }
            TradeInputData tradeInputDataConsumeData2 = tradeInputGroup.getToData().consumeData();
            if (tradeInputDataConsumeData2 != null) {
                tradeInputDataConsumeData2.setFrom(false);
                hbp.OLrzqt.setToData(swapTradeContentFragment.isConnected().finit().OLrzqt(tradeInputDataConsumeData2));
            }
            swapTradeContentFragment.isConnected().WS();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final SwapTradeContentFragment swapTradeContentFragment, hBP hbp, QuotePriceRes quotePriceRes) {
        if (swapTradeContentFragment.isConnected().QwvEab() && quotePriceRes.getSuccess()) {
            C25049ipQ c25049ipQ = hbp.AYXKKw;
            String strAEQbTJ = swapTradeContentFragment.AEQbTJ();
            Intrinsics.copydefault(quotePriceRes);
            C23154hsq c23154hsqIsConnected = swapTradeContentFragment.isConnected();
            FragmentManager childFragmentManager = swapTradeContentFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FragmentActivity fragmentActivityRequireActivity = swapTradeContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25049ipQ.EZpvd(strAEQbTJ, quotePriceRes, c23154hsqIsConnected, true, childFragmentManager, fragmentActivityRequireActivity, new SwapTradeContentFragment$addDataListener$16$1(swapTradeContentFragment), new Function1() { // from class: o.igx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.OLrzqt(this.KWHzl, (AbstractC22408hem) obj);
                }
            });
            swapTradeContentFragment.AuCTel();
            swapTradeContentFragment.AhwBna(true);
        } else {
            swapTradeContentFragment.AhwBna(false);
            if (quotePriceRes.isReset()) {
                C25049ipQ c25049ipQ2 = hbp.AYXKKw;
                C23154hsq c23154hsqIsConnected2 = swapTradeContentFragment.isConnected();
                FragmentManager childFragmentManager2 = swapTradeContentFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                FragmentActivity fragmentActivityRequireActivity2 = swapTradeContentFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                c25049ipQ2.copydefault(c23154hsqIsConnected2, childFragmentManager2, fragmentActivityRequireActivity2, swapTradeContentFragment.AEQbTJ(), new SwapTradeContentFragment$addDataListener$16$3(swapTradeContentFragment));
            } else {
                hbp.AYXKKw.KWHzl();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, AbstractC22408hem abstractC22408hem) {
        Intrinsics.checkNotNullParameter(abstractC22408hem, "");
        if (abstractC22408hem instanceof AbstractC22408hem.TaskDescription) {
            AbstractC22408hem.TaskDescription taskDescription = (AbstractC22408hem.TaskDescription) abstractC22408hem;
            swapTradeContentFragment.EZpvd(taskDescription.KWHzl(), taskDescription.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(hBP hbp, SwapTradeContentFragment swapTradeContentFragment, ConsumeData consumeData) {
        Boolean bool = (Boolean) consumeData.consumeData();
        if (bool != null && bool.booleanValue()) {
            C24469ieS c24469ieSAkhnZx = hbp.valueOf.AkhnZx();
            if (c24469ieSAkhnZx != null) {
                C24469ieS.setSlippagePanel$default(c24469ieSAkhnZx, false, swapTradeContentFragment.isConnected(), 1, null);
            }
            QuotePriceRes quotePriceResAxsJAYsNCnLh = swapTradeContentFragment.isConnected().AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh != null) {
                hbp.valueOf.OLrzqt(swapTradeContentFragment.AEQbTJ(), swapTradeContentFragment.isConnected(), quotePriceResAxsJAYsNCnLh);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            swapTradeContentFragment.showLoading();
        } else {
            swapTradeContentFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        swapTradeContentFragment.isConnected().zblBkD();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final hBP hbp, final SwapTradeContentFragment swapTradeContentFragment, final Triple triple) {
        hbp.OLrzqt.gEmmrt();
        if (triple != null) {
            swapTradeContentFragment.isConnected().copydefault(new Function1() { // from class: o.ifT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.AEQbTJ(hbp, triple, swapTradeContentFragment, (InterfaceC9738bbJ) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final hBP hbp, final Triple triple, final SwapTradeContentFragment swapTradeContentFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && !interfaceC9738bbJ.getFieldNames()) {
            hbp.OLrzqt.setToHeterogeneousChain((DefiChainInfo) triple.getFirst());
            hbp.OLrzqt.setToHeterogeneousAddress((C22947hov) triple.getSecond());
            hbp.OLrzqt.setOnHeterogeneousClickListener(new View.OnClickListener() { // from class: o.ifM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapTradeContentFragment.AEQbTJ(this.EZpvd, triple, hbp, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(final SwapTradeContentFragment swapTradeContentFragment, Triple triple, final hBP hbp, View view) {
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        String chainId;
        InterfaceC9738bbJ interfaceC9738bbJQSLkRj;
        C22947hov c22947hov;
        TradeParam tradeParamEZpvd = swapTradeContentFragment.EZpvd();
        String strEZpvd = null;
        String strCopydefault = ((tradeParamEZpvd != null ? tradeParamEZpvd.getBtcAddressType() : null) == null || (c22947hov = (C22947hov) triple.getSecond()) == null) ? null : c22947hov.copydefault();
        TradeParam tradeParamEZpvd2 = swapTradeContentFragment.EZpvd();
        if ((tradeParamEZpvd2 != null ? tradeParamEZpvd2.getBtcAddressType() : null) != null && triple.getThird() != null && (dexMultiTokenInfoBean = (DexMultiTokenInfoBean) triple.getThird()) != null && (chainId = dexMultiTokenInfoBean.getChainId()) != null && (interfaceC9738bbJQSLkRj = swapTradeContentFragment.isConnected().QSLkRj()) != null) {
            strEZpvd = interfaceC9738bbJQSLkRj.EZpvd(C33129mqd.valueOf(chainId));
        }
        C24717ijB.StateListAnimator stateListAnimator = C24717ijB.Companion;
        FragmentManager childFragmentManager = swapTradeContentFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        stateListAnimator.KWHzl(childFragmentManager, swapTradeContentFragment.AEQbTJ(), (DexMultiTokenInfoBean) triple.getThird(), strCopydefault, strEZpvd, new Function1() { // from class: o.ifz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(this.copydefault, hbp, (C22947hov) obj);
            }
        });
    }

    public static final Unit KWHzl(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, C22947hov c22947hov) {
        Intrinsics.checkNotNullParameter(c22947hov, "");
        swapTradeContentFragment.isConnected().AEQbTJ(c22947hov);
        hbp.OLrzqt.setToHeterogeneousAddress(c22947hov);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapTradeContentFragment swapTradeContentFragment, final hBP hbp, final Triple triple) {
        if (triple != null) {
            swapTradeContentFragment.isConnected().copydefault(new Function1() { // from class: o.ifi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapTradeContentFragment.AEQbTJ(hbp, triple, (InterfaceC9738bbJ) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(hBP hbp, Triple triple, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && !interfaceC9738bbJ.getFieldNames()) {
            hbp.OLrzqt.setToHeterogeneousChain((DefiChainInfo) triple.getFirst());
            hbp.OLrzqt.setToHeterogeneousAddress((C22947hov) triple.getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(hBP hbp, SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.copydefault(bool);
        c24795ika.setEnableEdit(bool.booleanValue());
        if (!bool.booleanValue()) {
            swapTradeContentFragment.isConnected().isConnected(false);
        }
        InterfaceC22598hiQ interfaceC22598hiQCopydefault = C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DefiChainInfo defiChainInfoKWHzl = interfaceC22598hiQCopydefault.KWHzl(chainId);
        if (defiChainInfoKWHzl != null && defiChainInfoKWHzl.bridgeMarketUnsupportedNetworkForDAppRedirect()) {
            hbp.OLrzqt.setToBalanceInfoPanelVisibility(false);
        } else {
            hbp.OLrzqt.setToBalanceInfoPanelVisibility(true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SwapTradeContentFragment swapTradeContentFragment, hBP hbp, Boolean bool) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        String str = chainId2 != null ? chainId2 : "";
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        boolean zEZpvd = c22825hmf.EZpvd(swapTradeContentFragment.AEQbTJ(), chainId, false);
        boolean zEZpvd2 = c22825hmf.EZpvd(swapTradeContentFragment.AEQbTJ(), str, false);
        hbp.OLrzqt.setFromBalanceInfoPanelVisibility(!zEZpvd);
        hbp.OLrzqt.setToBalanceInfoPanelVisibility(!zEZpvd2);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(SwapTradeContentFragment swapTradeContentFragment, View view, boolean z) {
        swapTradeContentFragment.isConnected().AYXKKw(z);
    }

    public static final void AEQbTJ(SwapTradeContentFragment swapTradeContentFragment, View view, boolean z) {
        swapTradeContentFragment.isConnected().djBIcL(z);
    }

    public static final Unit OLrzqt(hBP hbp, Boolean bool) {
        if (bool.booleanValue()) {
            hbp.OLrzqt.setProgressBarVisibility(0);
        } else {
            hbp.OLrzqt.setProgressBarVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(hBP hbp, SwapTradeContentFragment swapTradeContentFragment, Pair pair) {
        C25286itp c25286itp;
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.copydefault(c24795ika);
        if (c24795ika.getVisibility() == 0 && (c25286itp = swapTradeContentFragment.AuCTel) != null) {
            c25286itp.OLrzqt(swapTradeContentFragment.requireActivity(), swapTradeContentFragment.isConnected(), c24795ika, (String) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        String chainId;
        if (bool.booleanValue()) {
            C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).copydefault().gEmmrt().AEQbTJ();
            C23154hsq c23154hsqIsConnected = swapTradeContentFragment.isConnected();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
            if (dexMultiTokenInfoBeanCopydefault == null || (chainId = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
                chainId = "";
            }
            c23154hsqIsConnected.copydefault(chainId);
            return;
        }
        String str = (String) CollectionsKt___CollectionsKt.RcXXUw(swapTradeContentFragment.isConnected().getFieldNames().gEmmrt().KWHzl().keySet());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = swapTradeContentFragment.isConnected().QUSxYX().copydefault();
        String chainId2 = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapTradeContentFragment.isConnected().QUSxYX().valueOf();
        String chainId3 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (Intrinsics.EZpvd((Object) str, (Object) C24695iig.copydefault(chainId2, chainId3))) {
            return;
        }
        C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).copydefault().gEmmrt().AEQbTJ();
        if (Intrinsics.EZpvd((Object) chainId2, (Object) chainId3)) {
            swapTradeContentFragment.isConnected().copydefault(swapTradeContentFragment.isConnected().QUSxYX().AEQbTJ());
        }
    }

    public static final void valueOf(SwapTradeContentFragment swapTradeContentFragment, Boolean bool) {
        String chainId;
        if (bool.booleanValue()) {
            swapTradeContentFragment.isConnected().values().EZpvd();
        }
        String strEZpvd = swapTradeContentFragment.isConnected().values().KWHzl().EZpvd();
        DexMultiTokenInfoBean value = swapTradeContentFragment.isConnected().zLjUOn().KWHzl().getValue();
        if (value == null || (chainId = value.getChainId()) == null) {
            chainId = "";
        }
        String strKWHzl = C22380heK.OLrzqt.copydefault(swapTradeContentFragment.AEQbTJ()).fARcdN().KWHzl(chainId);
        if (strKWHzl.length() == 0) {
            swapTradeContentFragment.isConnected().values().EZpvd();
            return;
        }
        String strKWHzl2 = swapTradeContentFragment.isConnected().finit().KWHzl();
        if (Intrinsics.EZpvd((Object) strEZpvd, (Object) swapTradeContentFragment.isConnected().values().copydefault(strKWHzl, strKWHzl2))) {
            return;
        }
        swapTradeContentFragment.isConnected().values().EZpvd();
        swapTradeContentFragment.isConnected().KWHzl(strKWHzl, strKWHzl2);
    }

    public static final void OLrzqt(String str) {
        C24631ihV c24631ihV = C24631ihV.KWHzl;
        Intrinsics.copydefault((Object) str);
        c24631ihV.OLrzqt("Web3_DEX_BRIDGE", str);
    }

    public static final Unit gEmmrt(SwapTradeContentFragment swapTradeContentFragment, String str) {
        InterfaceC24361icQ interfaceC24361icQ;
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((CharSequence) str) && (interfaceC24361icQ = swapTradeContentFragment.AuCTelauCTel) != null && !interfaceC24361icQ.KWHzl() && !swapTradeContentFragment.values) {
            String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getResultContract, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str)));
            FragmentActivity activity = swapTradeContentFragment.getActivity();
            if (activity != null) {
                C25352ivB.OLrzqt(activity, "", strKWHzl, C23274hvD.Fragment.setRccState);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hBP hbp, SwapTradeContentFragment swapTradeContentFragment, QuotePriceRes quotePriceRes) {
        C25035ipC c25035ipC = hbp.valueOf;
        Intrinsics.copydefault(quotePriceRes);
        c25035ipC.KWHzl(quotePriceRes, swapTradeContentFragment.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(SwapTradeContentFragment swapTradeContentFragment, String str) {
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putInt("result", -1);
        bundleBundleOf.putString("data", str);
        swapTradeContentFragment.KWHzl(bundleBundleOf);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SwapTradeContentFragment swapTradeContentFragment, String str) {
        Intrinsics.copydefault((Object) str);
        showNotification$default(swapTradeContentFragment, str, 0, 0L, false, null, 30, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showNotification$default(SwapTradeContentFragment swapTradeContentFragment, String str, int i, long j, boolean z, Drawable drawable, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = 3000;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            drawable = null;
        }
        swapTradeContentFragment.copydefault(str, i3, j2, z2, drawable);
    }

    public final void copydefault(String str, int i, long j, boolean z, Drawable drawable) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setState(i);
        c55097xdX.setType(1);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        if (z && drawable != null) {
            c55097xdX.setLeadingIcon(drawable);
        }
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 0, 0, 0, 28, null);
    }

    public final void AhwBna(boolean z) {
        Integer value;
        boolean z2 = z && (value = AkhnZx().OLrzqt().getValue()) != null && value.intValue() > 0;
        hBP hbp = this.AhwBna;
        if (hbp != null) {
            View view = hbp.copydefault;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(z2 ? 0 : 8);
            LinearLayout linearLayout = hbp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(z2 ? 0 : 8);
            hbp.AhwBna.setText(String.valueOf(AkhnZx().OLrzqt().getValue()));
        }
        AkhnZx().AEQbTJ(!z);
    }

    public final void gEmmrt(boolean z) {
        String strGEmmrt;
        List listEZpvd;
        this.fJNWhG = z;
        Integer numGEmmrt = isConnected().gEmmrt();
        if (numGEmmrt != null) {
            numGEmmrt.intValue();
            strGEmmrt = isConnected().gEmmrt("0");
        } else {
            strGEmmrt = null;
        }
        C25632jAp c25632jAp = C25632jAp.KWHzl;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TradingBizType tradingBizType = TradingBizType.Bridge;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = isConnected().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = isConnected().QUSxYX().valueOf();
        String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = isConnected().QUSxYX().copydefault();
        String originContractAddress = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getOriginContractAddress() : null;
        String str = originContractAddress == null ? "" : originContractAddress;
        if (z) {
            listEZpvd = yDY.AhwBna();
        } else {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = isConnected().QUSxYX().copydefault();
            String chainId3 = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getChainId() : null;
            listEZpvd = C56402yEa.EZpvd(chainId3 != null ? chainId3 : "");
        }
        c25632jAp.copydefault(childFragmentManager, new C28385kZl(tradingBizType, chainId, chainId2, z, true, str, listEZpvd, strGEmmrt), new Function1() { // from class: o.ifX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.djBIcL(this.KWHzl, (DexMultiTokenInfoBean) obj);
            }
        });
    }

    public static final Unit djBIcL(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        onSearchItemClick$default(swapTradeContentFragment, dexMultiTokenInfoBean, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AkhnZx = null;
        this.fetchVPNInfo = null;
        this.AuCTel = null;
        this.wlaJM = null;
        this.zLjUOn = null;
        isConnected().dHguZz().getCurrentState().removeObserver(this.AubY);
        C33050mpD.OLrzqt(this.AYXKKw);
        C33050mpD.OLrzqt(this.zuBGHE);
        isConnected().call();
        isConnected().fHqPtx().AEQbTJ();
        SubHelper.AEQbTJ(this);
    }

    public final void AEQbTJ(Bundle bundle) {
        if ((bundle != null && bundle.getInt("result") != -1) || isConnected().QUSxYX().copydefault() == null || isConnected().wlaJM().KWHzl() == null) {
            return;
        }
        C22380heK.OLrzqt.copydefault(AEQbTJ()).DbNXlk().KWHzl(isConnected().QUSxYX().copydefault(), isConnected().QUSxYX().valueOf(), (bundle != null ? bundle.getBoolean("extra_universal_1", false) : false ? ApproveStatus.CANCEL_APPROVING : ApproveStatus.APPROVING).getType(), isConnected().uzCIH());
        isConnected().dNCPSb().KWHzl();
    }

    public final void KWHzl(Bundle bundle) {
        String string;
        C25035ipC c25035ipC;
        C25052ipT c25052ipTFetchVPNInfo;
        C25035ipC c25035ipC2;
        LinearLayout linearLayoutFIwbmz;
        if (bundle == null || (string = bundle.getString("data")) == null) {
            string = "";
        }
        if (bundle == null || bundle.getInt("result") == -1) {
            if (C33129mqd.OLrzqt((CharSequence) string)) {
                isConnected().RlQdEF().disposeQuote();
                AbstractC23101hrq.clearInput$default(isConnected(), false, 1, null);
                AhwBna(false);
                hBP hbp = this.AhwBna;
                if (hbp != null && (c25035ipC2 = hbp.valueOf) != null && (linearLayoutFIwbmz = c25035ipC2.fIwbmz()) != null) {
                    linearLayoutFIwbmz.setVisibility(8);
                }
                hBP hbp2 = this.AhwBna;
                if (hbp2 != null && (c25035ipC = hbp2.valueOf) != null && (c25052ipTFetchVPNInfo = c25035ipC.fetchVPNInfo()) != null) {
                    c25052ipTFetchVPNInfo.setVisibility(8);
                }
                if (EZpvd() != null) {
                    C22380heK.OLrzqt.copydefault(AEQbTJ()).DbNXlk().AEQbTJ(new gKW(true, new gKR(string), null, 4, null));
                    return;
                }
                return;
            }
            return;
        }
        C32866mlf.onEvent$default("app_swap_contract_interaction_reject_click", (TrackChannel[]) null, new Function1() { // from class: o.ifO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit KWHzl(SwapTradeContentFragment swapTradeContentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", swapTradeContentFragment.isConnected().QCjLjM(), false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onSearchItemClick$default(SwapTradeContentFragment swapTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        swapTradeContentFragment.EZpvd(dexMultiTokenInfoBean, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        DexMultiTokenInfoBean fromDexMultiTokenInfoVO;
        C25049ipQ c25049ipQ;
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        List<ChainInfoVO> bridgeSupportChainInfoList;
        ChainInfoVO chainInfoVO;
        String chainId;
        DefiChainInfo defiChainInfoKWHzl;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO2;
        if (this.fJNWhG) {
            String chainId2 = dexMultiTokenInfoBean.getChainId();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = isConnected().QUSxYX().valueOf();
            if (Intrinsics.EZpvd((Object) chainId2, (Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null))) {
                C22380heK c22380heK = C22380heK.OLrzqt;
                DefiChainInfo defiChainInfoKWHzl2 = c22380heK.copydefault(AEQbTJ()).copydefault().KWHzl(dexMultiTokenInfoBean.getChainId());
                if (defiChainInfoKWHzl2 == null || (dexDefaultFromToTokenShowVO2 = defiChainInfoKWHzl2.getDexDefaultFromToTokenShowVO()) == null || (fromDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO2.getToCrossDexMultiTokenInfoVO()) == null) {
                    fromDexMultiTokenInfoVO = (defiChainInfoKWHzl2 == null || (bridgeSupportChainInfoList = defiChainInfoKWHzl2.getBridgeSupportChainInfoList()) == null || (chainInfoVO = (ChainInfoVO) CollectionsKt___CollectionsKt.AkhnZx(bridgeSupportChainInfoList, 0)) == null || (chainId = chainInfoVO.getChainId()) == null || (defiChainInfoKWHzl = c22380heK.copydefault(AEQbTJ()).copydefault().KWHzl(chainId)) == null || (dexDefaultFromToTokenShowVO = defiChainInfoKWHzl.getDexDefaultFromToTokenShowVO()) == null) ? null : dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO();
                }
            }
        }
        ConsumeData<TradeInputGroup> value = isConnected().dmfpNf().getValue();
        if (value != null && (data = value.getData()) != null && (fromData = data.getFromData()) != null && (data2 = fromData.getData()) != null && (editData = data2.getEditData()) != null) {
            editData.setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
        }
        if (this.fJNWhG) {
            isConnected().finit().KWHzl(dexMultiTokenInfoBean);
            if (fromDexMultiTokenInfoVO != null) {
                isConnected().finit().AEQbTJ(fromDexMultiTokenInfoVO);
            }
        } else {
            isConnected().finit().AEQbTJ(dexMultiTokenInfoBean);
        }
        if (!isConnected().htlTjW()) {
            setInputHintContent$default(this, false, null, 2, null);
        }
        if (C22372heC.AEQbTJ(AEQbTJ())) {
            if (this.fJNWhG) {
                C23317hvu.AYXKKw(dexMultiTokenInfoBean.getChainId());
                if (fromDexMultiTokenInfoVO != null) {
                    C23317hvu.djBIcL(fromDexMultiTokenInfoVO.getChainId());
                }
            } else {
                C23317hvu.djBIcL(dexMultiTokenInfoBean.getChainId());
            }
            if (z && isConnected().QUSxYX().AkhnZx()) {
                isConnected().DCJXGO().setValue(Boolean.TRUE);
            }
        } else if (this.fJNWhG) {
            isConnected().AYXKKw(dexMultiTokenInfoBean.getChainId());
            if (fromDexMultiTokenInfoVO != null) {
                isConnected().AhwBna(fromDexMultiTokenInfoVO.getChainId());
            }
        } else {
            isConnected().AhwBna(dexMultiTokenInfoBean.getChainId());
        }
        if (isConnected().QUSxYX().isConnected()) {
            this.ejfBZ = 0;
        }
        getQuotePrice$default(this, false, 1, null);
        hBP hbp = this.AhwBna;
        if (hbp != null && (c25049ipQ = hbp.AYXKKw) != null) {
            C23154hsq c23154hsqIsConnected = isConnected();
            String strAEQbTJ = AEQbTJ();
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C25049ipQ.checkError$default(c25049ipQ, c23154hsqIsConnected, strAEQbTJ, childFragmentManager, fragmentActivityRequireActivity, false, new SwapTradeContentFragment$onSearchItemClick$4(this), 16, null);
        }
        C24995ioP c24995ioP = this.fetchVPNInfo;
        if (c24995ioP != null) {
            c24995ioP.AkhnZx();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.SwapTradeContentFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(SwapTradeContentFragment swapTradeContentFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        swapTradeContentFragment.copydefault((Function1<? super Boolean, Unit>) function1);
    }

    public final void copydefault(final Function1<? super Boolean, Unit> function1) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = isConnected().QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanValueOf != null) {
            C22806hmM c22806hmMFHqPtx = isConnected().fHqPtx();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c22806hmMFHqPtx.OLrzqt(viewLifecycleOwner, dexMultiTokenInfoBeanValueOf.getTokenContractAddress(), dexMultiTokenInfoBeanValueOf.getChainId(), this.zsXlph);
        }
        AbstractC23101hrq.getCoinAssets$default(isConnected(), null, 1, null);
        AbstractC23101hrq.getQuotePrice$default(isConnected(), false, false, new Function1() { // from class: o.ifQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.KWHzl(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 3, null);
    }

    public static final Unit KWHzl(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public final void AuCTel() {
        C25035ipC c25035ipC;
        LinearLayout linearLayoutAhwBna;
        C25035ipC c25035ipC2;
        LinearLayout linearLayoutAhwBna2;
        C25035ipC c25035ipC3;
        SwapState value = isConnected().dHguZz().getCurrentState().getValue();
        if (value != null && value.isDAppRedirectState()) {
            hBP hbp = this.AhwBna;
            if (hbp != null && (c25035ipC3 = hbp.valueOf) != null) {
                c25035ipC3.DbNXlk();
            }
            if (isConnected().QUSxYX().AkhnZx()) {
                return;
            }
            isConnected().dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
            return;
        }
        if (djBIcL().OLrzqt()) {
            hBP hbp2 = this.AhwBna;
            if (hbp2 == null || (c25035ipC2 = hbp2.valueOf) == null || (linearLayoutAhwBna2 = c25035ipC2.AhwBna()) == null) {
                return;
            }
            linearLayoutAhwBna2.setVisibility(8);
            return;
        }
        hBP hbp3 = this.AhwBna;
        if (hbp3 == null || (c25035ipC = hbp3.valueOf) == null || (linearLayoutAhwBna = c25035ipC.AhwBna()) == null || linearLayoutAhwBna.getVisibility() != 8) {
            return;
        }
        displayQuoteResultPanel$default(this, false, 1, null);
    }

    public static /* synthetic */ void displayQuoteResultPanel$default(SwapTradeContentFragment swapTradeContentFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        swapTradeContentFragment.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        C25035ipC c25035ipC;
        LinearLayout linearLayoutAhwBna;
        AhwBna(true);
        hBP hbp = this.AhwBna;
        if (hbp == null || (c25035ipC = hbp.valueOf) == null || (linearLayoutAhwBna = c25035ipC.AhwBna()) == null) {
            return;
        }
        linearLayoutAhwBna.setVisibility((!z || djBIcL().OLrzqt()) ? 8 : 0);
    }

    public static /* synthetic */ void getQuotePrice$default(SwapTradeContentFragment swapTradeContentFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        swapTradeContentFragment.valueOf(z);
    }

    public final void valueOf(boolean z) {
        C23154hsq c23154hsqIsConnected = isConnected();
        c23154hsqIsConnected.RlQdEF().disposeQuote();
        AbstractC23101hrq.getQuotePrice$default(c23154hsqIsConnected, z, false, null, 6, null);
    }

    @Override // o.InterfaceC22903hoD
    public void AEQbTJ(final int i) {
        isConnected().copydefault(new Function1() { // from class: o.igw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapTradeContentFragment.OLrzqt(this.copydefault, i, (InterfaceC9738bbJ) obj);
            }
        });
    }

    public static final Unit OLrzqt(SwapTradeContentFragment swapTradeContentFragment, int i, InterfaceC9738bbJ interfaceC9738bbJ) {
        C24795ika c24795ika;
        hBP hbp = swapTradeContentFragment.AhwBna;
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (interfaceC9738bbJ == null || interfaceC9738bbJ.getFieldNames()) {
                i = 8;
            }
            c24795ika.setReverseTipVisibility(i);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC22903hoD
    public void KWHzl() {
        setInputHintContent$default(this, false, null, 2, null);
    }

    @Override // o.InterfaceC22903hoD
    public void KWHzl(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        C24795ika c24795ika;
        C24795ika c24795ika2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBP hbp = this.AhwBna;
        if (hbp != null && (c24795ika2 = hbp.OLrzqt) != null) {
            c24795ika2.KWHzl(function2);
        }
        hBP hbp2 = this.AhwBna;
        if (hbp2 == null || (c24795ika = hbp2.OLrzqt) == null) {
            return;
        }
        c24795ika.AEQbTJ(function22);
    }

    @Override // o.InterfaceC22903hoD
    public void EZpvd(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        C24795ika c24795ika;
        C24795ika c24795ika2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBP hbp = this.AhwBna;
        if (hbp != null && (c24795ika2 = hbp.OLrzqt) != null) {
            c24795ika2.OLrzqt(function2);
        }
        hBP hbp2 = this.AhwBna;
        if (hbp2 == null || (c24795ika = hbp2.OLrzqt) == null) {
            return;
        }
        c24795ika.djBIcL(function22);
    }

    public static /* synthetic */ void setInputHintContent$default(SwapTradeContentFragment swapTradeContentFragment, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        swapTradeContentFragment.OLrzqt(z, str);
    }

    public final void OLrzqt(boolean z, String str) {
        C24795ika c24795ika;
        hBP hbp = this.AhwBna;
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setInputHintContent(z, str);
    }

    public final void AYXKKw(boolean z) {
        isConnected().KWHzl();
        AbstractC23101hrq.refreshData$default(isConnected(), false, 1, null);
        Function1<? super Boolean, Unit> function1 = this.sSMYrx;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 6, null);
        c55097xdX.setLeadingIcon(C33070mpX.KWHzl(C32113mPz.TaskDescription.AkhnZx));
        c55097xdX.setState(2);
        c55097xdX.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.getStateLabel));
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public final String EZpvd(String str) {
        String strOLrzqt = C23317hvu.OLrzqt();
        int iHashCode = strOLrzqt.hashCode();
        if (iHashCode != -1380801655) {
            if (iHashCode != 3543443) {
                if (iHashCode == 1608138186 && strOLrzqt.equals(TabTitleInfo.KEY_LIMIT_ORDER)) {
                    return BusinessType.LIMIT.getValue();
                }
            } else if (strOLrzqt.equals("swap")) {
                return BusinessType.SWAP.getValue();
            }
        } else if (strOLrzqt.equals(TabTitleInfo.KEY_BRIDGE)) {
            return BusinessType.BRIDGE.getValue();
        }
        return BusinessType.SWAP.getValue();
    }

    public final AbstractC23101hrq AhwBna() {
        if (isAdded()) {
            return isConnected();
        }
        return null;
    }

    private final String fIwbmz() {
        return isConnected().hDKMBd();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C24795ika c24795ika;
        C25035ipC c25035ipC;
        super.onDestroyView();
        AkhnZx().AEQbTJ().removeObserver(this.getFieldNames);
        this.AuCTelauCTel = null;
        hBP hbp = this.AhwBna;
        if (hbp != null && (c25035ipC = hbp.valueOf) != null) {
            c25035ipC.KWHzl();
        }
        hBP hbp2 = this.AhwBna;
        if (hbp2 != null && (c24795ika = hbp2.OLrzqt) != null) {
            c24795ika.valueOf();
        }
        this.AhwBna = null;
    }
}
