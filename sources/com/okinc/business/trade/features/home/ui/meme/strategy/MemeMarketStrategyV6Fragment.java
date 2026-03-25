package com.okinc.business.trade.features.home.ui.meme.strategy;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.tee.common.viewmodel.TradeAutoSellViewModel;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.domain.model.TeeMarketPlaceOrderParams;
import com.okinc.business.dex.tee.quick.market.ui.viewmodel.QuickMarketPlaceOrderViewModel;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeCurrencyBean;
import com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventTrackSubmitType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeTransactionViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketBuyV6ViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketSellV6ViewModel;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.meme.MemeModeTransactionFragment;
import com.okinc.business.trade.features.home.ui.meme.data.MemeStrategyType;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment;
import com.okinc.business.trade.features.home.ui.meme.track.MemeQuickPopUpSource;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC28336kXq;
import o.AbstractC28352kYf;
import o.AbstractC30510lcX;
import o.AbstractC30827liW;
import o.AbstractC31068lmz;
import o.AbstractC31124loB;
import o.AbstractC58185ywX;
import o.ActivityC30497lcK;
import o.C21491hBi;
import o.C22370heA;
import o.C22380heK;
import o.C22400hee;
import o.C22416heu;
import o.C23274hvD;
import o.C23313hvq;
import o.C24339ibv;
import o.C24371ica;
import o.C24375ice;
import o.C24453ieC;
import o.C24695iig;
import o.C25265itU;
import o.C25324iua;
import o.C25325iub;
import o.C25330iug;
import o.C25390ivn;
import o.C25444iwo;
import o.C28109kPf;
import o.C28337kXr;
import o.C28343kXx;
import o.C30501lcO;
import o.C30567ldb;
import o.C30917lkG;
import o.C30922lkL;
import o.C30943lkg;
import o.C31050lmh;
import o.C31052lmj;
import o.C31125loC;
import o.C31134loL;
import o.C31139loQ;
import o.C31153loe;
import o.C31161lom;
import o.C31164lop;
import o.C31167los;
import o.C31168lot;
import o.C31170lov;
import o.C31171low;
import o.C31172lox;
import o.C31173loy;
import o.C31197lpV;
import o.C31200lpY;
import o.C31205lpd;
import o.C31212lpk;
import o.C32113mPz;
import o.C32866mlf;
import o.C33054mpH;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C38303pTu;
import o.C43246rlf;
import o.C43251rlk;
import o.C52761wXj;
import o.C55001xbh;
import o.C55007xbn;
import o.C55097xdX;
import o.C55113xdn;
import o.C55276xgr;
import o.C55296xhK;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.C57656ymY;
import o.C59405zgS;
import o.C59449zhJ;
import o.C59541ziw;
import o.InterfaceC28107kPd;
import o.InterfaceC28268kVc;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC59496ziD;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.ViewOnClickListenerC54939xaY;
import o.dTQ;
import o.gLQ;
import o.gNB;
import o.gOP;
import o.kTF;
import o.kTV;
import o.kVL;
import o.kVW;
import o.kXY;
import o.pUU;
import o.rVN;
import o.yBK;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class MemeMarketStrategyV6Fragment extends AbstractC31068lmz implements C25324iua.Activity {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int valueOf = 8;
    public C21491hBi AYXKKw;
    public final C31139loQ AhwBna;
    public long AuCTel;
    public final InterfaceC56387yDm AuCTelauCTel;
    public Observer<SwapState> AubY;
    public C31171low AwvSrB;
    public final ActivityResultLauncher<Intent> OcIXYQ;
    public final InterfaceC56387yDm QKVWgx;
    public boolean RJOkX;

    @yCM
    public InterfaceC28107kPd activityScopeCache;
    public final InterfaceC56387yDm djBIcL;
    public boolean fARcdN;
    public C31173loy fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public final ActivityResultLauncher<Intent> gEmmrt;
    public C31170lov gHZMYf;
    public final InterfaceC56387yDm getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public C24339ibv hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public C31161lom iwGUEr;
    public final ActivityResultLauncher<MemeSelectionActivityResultContract.Input> uzCIH;
    public C31153loe values;
    public boolean wlaJM;
    public boolean zLjUOn;
    public C31164lop zsXlph;
    public String zuBGHE = "";
    public String DTwDnp = "";
    public String AxsJAY = "low";
    public boolean DbNXlk = true;
    public final InterfaceC56387yDm QOLQEE = C56392yDr.copydefault(new Function0() { // from class: o.lmZ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeMarketStrategyV6Fragment.zuWLRA(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm ejfBZ = C56392yDr.copydefault(new Function0() { // from class: o.lnC
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(MemeMarketStrategyV6Fragment.AxsJAYsNCnLh(this.copydefault));
        }
    });
    public final InterfaceC56387yDm ORxRYg = C56392yDr.copydefault(new Function0() { // from class: o.lnP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeMarketStrategyV6Fragment.getPostValueLengthLimit(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.lnY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeMarketStrategyV6Fragment.flVtFt(this.copydefault);
        }
    });
    public final InterfaceC56387yDm sSMYrx = C56392yDr.copydefault(new Function0() { // from class: o.lob
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return MemeMarketStrategyV6Fragment.DXXBbs(this.OLrzqt);
        }
    });
    public final Function1<Boolean, Unit> QUSxYX = new Function1() { // from class: o.lmE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return MemeMarketStrategyV6Fragment.fetchVPNInfo(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
        }
    };

    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
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

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TransactionType.values().length];
            try {
                iArr[TransactionType.Buy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransactionType.Sell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[UnitType.values().length];
            try {
                iArr2[UnitType.UnitTypePercent.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[UnitType.UnitTypeToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr2;
        }
    }

    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.AEQbTJ, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
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
            Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.AEQbTJ.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    public static final class PictureInPictureParams implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof AbstractC30827liW) {
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

    public static final class SharedElementCallback implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.KWHzl, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof MemeModeTransactionFragment) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.KWHzl.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    public static final class Dialog implements Flow<String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$Dialog$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                MemeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1 memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1;
                if (continuation instanceof MemeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1) {
                    memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1 = (MemeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1) continuation;
                    int i = memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1 = new MemeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (C33129mqd.OLrzqt((CharSequence) obj)) {
                        memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, memeMarketStrategyV6Fragment$setListener$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Dialog(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public MemeMarketStrategyV6Fragment() {
        ActivityResultLauncher<MemeSelectionActivityResultContract.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new MemeSelectionActivityResultContract(), new ActivityResultCallback() { // from class: o.lmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                MemeMarketStrategyV6Fragment.copydefault(this.AEQbTJ, (MemeSelectionActivityResultContract.Output) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.uzCIH = activityResultLauncherRegisterForActivityResult;
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        SharedElementCallback sharedElementCallback = new SharedElementCallback(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(sharedElementCallback));
        final Function0 function0 = null;
        this.getNewProxyInstance = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeModeTransactionViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TradeAutoSellViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$5
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.isConnected = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0() { // from class: o.lmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.fFgQHt(this.copydefault);
            }
        });
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new PictureInPictureParams(this)));
        this.getFieldNames = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeTransactionViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.QKVWgx = C56392yDr.copydefault(new Function0() { // from class: o.lmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.ffGIBT(this.OLrzqt);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AuCTelauCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(QuickMarketPlaceOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                MemeMarketStrategyV6Fragment.AEQbTJ(this.KWHzl, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.gEmmrt = activityResultLauncherRegisterForActivityResult2;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                MemeMarketStrategyV6Fragment.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult3, "");
        this.OcIXYQ = activityResultLauncherRegisterForActivityResult3;
        this.wlaJM = true;
        this.zLjUOn = true;
        this.fetchVPNInfo = true;
        this.AhwBna = new C31139loQ();
        this.RJOkX = true;
        this.AubY = new Observer() { // from class: o.lnt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                MemeMarketStrategyV6Fragment.OLrzqt(this.EZpvd, (SwapState) obj);
            }
        };
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final MemeMarketStrategyV6Fragment KWHzl(@NotNull MemeStrategyType memeStrategyType, @NotNull TokenBase tokenBase, @NotNull TransactionType transactionType, @NotNull String str, int i) {
            Intrinsics.checkNotNullParameter(memeStrategyType, "");
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(str, "");
            MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment = new MemeMarketStrategyV6Fragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("transaction_token", tokenBase);
            bundle.putInt("type", memeStrategyType.getType());
            bundle.putString("transaction_amount", str);
            bundle.putInt("extra_universal_4", transactionType.getType());
            C31125loC.copydefault(bundle, i);
            memeMarketStrategyV6Fragment.setArguments(bundle);
            return memeMarketStrategyV6Fragment;
        }
    }

    public final C31052lmj AwvSrB() {
        return (C31052lmj) this.QOLQEE.getValue();
    }

    public static final C31052lmj zuWLRA(final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return new C31052lmj(memeMarketStrategyV6Fragment.fIwbmz().KWHzl(), new Function0() { // from class: o.lns
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.DCUTEI(this.KWHzl);
            }
        });
    }

    public static final MpcWalletService.MpcWalletAbleStatus DCUTEI(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.zLjUOn().fIwbmz();
    }

    public final C31050lmh getFieldNames() {
        return new C31050lmh(ejfBZ(), ejfBZ().AEQbTJ());
    }

    public final InterfaceC28107kPd fIwbmz() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean QUSxYX() {
        return ((Boolean) this.ejfBZ.getValue()).booleanValue();
    }

    public static final boolean AxsJAYsNCnLh(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        Bundle arguments = memeMarketStrategyV6Fragment.getArguments();
        return arguments != null && arguments.getBoolean("extra_is_from_market");
    }

    private final TransactionType RlQdEF() {
        return (TransactionType) this.ORxRYg.getValue();
    }

    public static final TransactionType getPostValueLengthLimit(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        Bundle arguments = memeMarketStrategyV6Fragment.getArguments();
        if (arguments != null) {
            TransactionType transactionTypeCopydefault = TransactionType.Companion.copydefault(arguments.getInt("extra_universal_4"));
            if (transactionTypeCopydefault != null) {
                return transactionTypeCopydefault;
            }
        }
        return (TransactionType) C31200lpY.throwIfDebug$default(TransactionType.Buy, null, 2, null);
    }

    private final String AxsJAYaxsJAY() {
        return (String) this.AkhnZx.getValue();
    }

    public static final String flVtFt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        String string;
        Bundle arguments = memeMarketStrategyV6Fragment.getArguments();
        return (arguments == null || (string = arguments.getString("extra_universal_3", "")) == null) ? "" : string;
    }

    public final TokenBase iwGUEr() {
        return (TokenBase) this.sSMYrx.getValue();
    }

    public static final TokenBase DXXBbs(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        TokenBase tokenBase;
        Bundle arguments = memeMarketStrategyV6Fragment.getArguments();
        return (arguments == null || (tokenBase = (TokenBase) ((Parcelable) BundleCompat.getParcelable(arguments, "transaction_token", TokenBase.class))) == null) ? new TokenBase(null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -1, null) : tokenBase;
    }

    public static final Unit fetchVPNInfo(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z) {
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 6, null);
        c55097xdX.setLeadingIcon(C33070mpX.KWHzl(C32113mPz.TaskDescription.AkhnZx));
        c55097xdX.setState(2);
        c55097xdX.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.getStateLabel));
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, c55097xdX, 3000L, 0, 0, 0, 28, null);
        return Unit.INSTANCE;
    }

    public static final void copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, MemeSelectionActivityResultContract.Output output) {
        if (output != null) {
            memeMarketStrategyV6Fragment.zLjUOn().djBIcL(output.getPresetType());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeModeTransactionViewModel accept() {
        return (MemeModeTransactionViewModel) this.getNewProxyInstance.getValue();
    }

    public final TradeAutoSellViewModel ejfBZ() {
        return (TradeAutoSellViewModel) this.djBIcL.getValue();
    }

    private final DexHomeViewModel iRxXKY() {
        return (DexHomeViewModel) this.isConnected.getValue();
    }

    public static final DexHomeViewModel fFgQHt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        if (!C31172lox.KWHzl(C31125loC.KWHzl(memeMarketStrategyV6Fragment), C31172lox.Companion.KWHzl())) {
            return null;
        }
        Intrinsics.copydefault(memeMarketStrategyV6Fragment, "");
        Iterator it = C59405zgS.EZpvd(memeMarketStrategyV6Fragment, (Function1<? super MemeMarketStrategyV6Fragment, ? extends MemeMarketStrategyV6Fragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.lmS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.KWHzl((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.Fragment) it.next()) instanceof DexHomeFragment) {
                C31197lpV c31197lpV = C31197lpV.EZpvd;
                InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new Application(memeMarketStrategyV6Fragment)));
                return (DexHomeViewModel) FragmentViewModelLazyKt.createViewModelLazy(memeMarketStrategyV6Fragment, C56524yIo.AEQbTJ(DexHomeViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(memeMarketStrategyV6Fragment, interfaceC56387yDmEZpvd)).getValue();
            }
        }
        return null;
    }

    public static final androidx.fragment.app.Fragment KWHzl(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public final MemeTransactionViewModel uzCIH() {
        return (MemeTransactionViewModel) this.getFieldNames.getValue();
    }

    public final AbstractC28352kYf zLjUOn() {
        return (AbstractC28352kYf) this.QKVWgx.getValue();
    }

    public static final AbstractC28352kYf ffGIBT(final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        int i = TaskDescription.copydefault[memeMarketStrategyV6Fragment.RlQdEF().ordinal()];
        final Function0 function0 = null;
        if (i == 1) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return memeMarketStrategyV6Fragment;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) function02.invoke();
                }
            });
            return (AbstractC28352kYf) FragmentViewModelLazyKt.createViewModelLazy(memeMarketStrategyV6Fragment, C56524yIo.AEQbTJ(MemeMarketBuyV6ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$4
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
                    Function0 function03 = function0;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$5
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
                        defaultViewModelProviderFactory = memeMarketStrategyV6Fragment.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            }).getValue();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return memeMarketStrategyV6Fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        return (AbstractC28352kYf) FragmentViewModelLazyKt.createViewModelLazy(memeMarketStrategyV6Fragment, C56524yIo.AEQbTJ(MemeMarketSellV6ViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$viewModel_delegate$lambda$17$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = memeMarketStrategyV6Fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }

    public final QuickMarketPlaceOrderViewModel getNewProxyInstance() {
        return (QuickMarketPlaceOrderViewModel) this.AuCTelauCTel.getValue();
    }

    public static final void AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        String stringExtra = data.getStringExtra("selected_de_fi_platform_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = data.getStringExtra("selected_de_fi_platform_name");
        memeMarketStrategyV6Fragment.zLjUOn().AhwBna(stringExtra, stringExtra2 != null ? stringExtra2 : "");
        V6BaseQuoteResponse v6BaseQuoteResponse = (V6BaseQuoteResponse) ((Parcelable) IntentCompat.getParcelableExtra(data, "quote_response_from_provider_list", V6BaseQuoteResponse.class));
        if (v6BaseQuoteResponse != null) {
            v6BaseQuoteResponse.setLocalSelectedDeFiPlatformId(stringExtra);
            if (v6BaseQuoteResponse instanceof V6QuoteAndCalldataResponseData) {
                memeMarketStrategyV6Fragment.zLjUOn().KWHzl(C28343kXx.KWHzl((V6QuoteAndCalldataResponseData) v6BaseQuoteResponse));
            } else {
                if (!(v6BaseQuoteResponse instanceof V6QuoteResponseData)) {
                    throw new NoWhenBranchMatchedException();
                }
                memeMarketStrategyV6Fragment.zLjUOn().KWHzl((V6QuoteResponseData) v6BaseQuoteResponse);
            }
        }
    }

    public static final void KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, ActivityResult activityResult) {
        memeMarketStrategyV6Fragment.fJNWhG = true;
        memeMarketStrategyV6Fragment.ejfBZ().KWHzl(memeMarketStrategyV6Fragment.iwGUEr().getChainId());
    }

    public final AbstractC31124loB zuBGHE() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.valueOf;
        }
        return null;
    }

    public final C25325iub gHZMYf() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.AYXKKw;
        }
        return null;
    }

    public final C25265itU zsXlph() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.djBIcL;
        }
        return null;
    }

    public final C24375ice AuCTel() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.copydefault;
        }
        return null;
    }

    public final C25324iua hDKMBd() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.gEmmrt;
        }
        return null;
    }

    private final C55113xdn gkJEwt() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.KWHzl;
        }
        return null;
    }

    public final C30567ldb AubY() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.AEQbTJ;
        }
        return null;
    }

    public final View wlaJM() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.EZpvd;
        }
        return null;
    }

    public final C24453ieC AuCTelauCTel() {
        C21491hBi c21491hBi = this.AYXKKw;
        if (c21491hBi != null) {
            return c21491hBi.AhwBna;
        }
        return null;
    }

    public final boolean fJNWhG() {
        return RlQdEF() == TransactionType.Sell ? !this.wlaJM : this.wlaJM;
    }

    public static final void OLrzqt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (swapState == SwapState.NONE) {
            return;
        }
        C25324iua c25324iuaHDKMBd = memeMarketStrategyV6Fragment.hDKMBd();
        boolean z = false;
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.AEQbTJ(swapState == SwapState.SWAP);
        }
        memeMarketStrategyV6Fragment.AEQbTJ(memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue(), swapState);
        memeMarketStrategyV6Fragment.accept().fJNWhG().setValue(Boolean.FALSE);
        C31170lov c31170lov = memeMarketStrategyV6Fragment.gHZMYf;
        if (c31170lov == null) {
            Intrinsics.gEmmrt("");
            c31170lov = null;
        }
        AbstractC30510lcX value = memeMarketStrategyV6Fragment.ejfBZ().EZpvd().getValue();
        AbstractC30510lcX.StateListAnimator stateListAnimator = value instanceof AbstractC30510lcX.StateListAnimator ? (AbstractC30510lcX.StateListAnimator) value : null;
        if (stateListAnimator != null && !stateListAnimator.EZpvd()) {
            z = true;
        }
        c31170lov.KWHzl(swapState, z);
        memeMarketStrategyV6Fragment.QbewEr();
    }

    public final void OcIXYQ() {
        zLjUOn().QbewEr();
        this.QUSxYX.invoke(Boolean.TRUE);
        zLjUOn().AuCTel().initCheckStep();
        fARcdN();
    }

    public static final Unit RcXXUw(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        C31161lom c31161lom = memeMarketStrategyV6Fragment.iwGUEr;
        if (c31161lom == null) {
            Intrinsics.gEmmrt("");
            c31161lom = null;
        }
        c31161lom.KWHzl(memeMarketStrategyV6Fragment.AuCTel());
        return Unit.INSTANCE;
    }

    public final gOP fetchVPNInfo() {
        return new gOP(new Function0() { // from class: o.lmK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.RcXXUw(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.lmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.aKErDB(this.EZpvd);
            }
        }, null, new Function0() { // from class: o.lmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.dNCPSb(this.EZpvd);
            }
        }, new Function0() { // from class: o.lmP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.dvKsVJ(this.OLrzqt);
            }
        }, new Function0() { // from class: o.lmM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.dxcTrN(this.copydefault);
            }
        }, new Function0() { // from class: o.lmO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.fZBcTu(this.KWHzl);
            }
        }, new Function0() { // from class: o.lmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.finit(this.OLrzqt);
            }
        }, 4, null);
    }

    public static final Unit aKErDB(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        C31161lom c31161lom = memeMarketStrategyV6Fragment.iwGUEr;
        if (c31161lom == null) {
            Intrinsics.gEmmrt("");
            c31161lom = null;
        }
        c31161lom.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit dNCPSb(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        C31161lom c31161lom = memeMarketStrategyV6Fragment.iwGUEr;
        if (c31161lom == null) {
            Intrinsics.gEmmrt("");
            c31161lom = null;
        }
        androidx.fragment.app.FragmentManager childFragmentManager = memeMarketStrategyV6Fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c31161lom.OLrzqt(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit dvKsVJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        AbstractC28352kYf.refreshQuote$default(memeMarketStrategyV6Fragment.zLjUOn(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit dxcTrN(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String strEZpvd = memeMarketStrategyV6Fragment.getNewProxyInstance().EZpvd();
        dTQ.TaskDescription.walletRenewOrReenableTEEAccount$default(dtq, contextRequireContext, strEZpvd == null ? "" : strEZpvd, null, "sa_dex_marketorder_autosell", 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit fZBcTu(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        String strEZpvd = memeMarketStrategyV6Fragment.getNewProxyInstance().EZpvd();
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        dtq.copydefault(contextRequireContext, strEZpvd, Boolean.TRUE, "");
        return Unit.INSTANCE;
    }

    public static final Unit finit(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        String strEZpvd = memeMarketStrategyV6Fragment.getNewProxyInstance().EZpvd();
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        dtq.copydefault(contextRequireContext, strEZpvd, Boolean.TRUE, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateReminderView$default(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, V6BaseQuoteResponse v6BaseQuoteResponse, Throwable th, gOP gop, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateReminderView");
        }
        if ((i & 1) != 0) {
            v6BaseQuoteResponse = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            gop = null;
        }
        memeMarketStrategyV6Fragment.EZpvd(v6BaseQuoteResponse, th, gop);
    }

    private final void EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse, Throwable th, gOP gop) {
        C30567ldb c30567ldb;
        C31164lop c31164lop = this.zsXlph;
        if (c31164lop == null) {
            Intrinsics.gEmmrt("");
            c31164lop = null;
        }
        if (gop == null) {
            gop = fetchVPNInfo();
        }
        C21491hBi c21491hBi = this.AYXKKw;
        c31164lop.OLrzqt(v6BaseQuoteResponse, th, gop, (c21491hBi == null || (c30567ldb = c21491hBi.AEQbTJ) == null) ? false : c30567ldb.copydefault());
    }

    public final void sSMYrx() {
        accept().fJNWhG().setValue(Boolean.TRUE);
        this.AuCTel = System.currentTimeMillis();
        fZBcTu();
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.setVisibility(0);
        }
    }

    public final void values(V6BaseQuoteResponse v6BaseQuoteResponse) {
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.EZpvd(kVL.OLrzqt(v6BaseQuoteResponse), !C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()), zLjUOn().zblBkD(), new Function0() { // from class: o.lnZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.OuxcSI(this.OLrzqt);
                }
            }, false);
        }
    }

    public static final Unit OuxcSI(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        AbstractC28352kYf abstractC28352kYfZLjUOn = memeMarketStrategyV6Fragment.zLjUOn();
        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        abstractC28352kYfZLjUOn.AEQbTJ(contextRequireContext);
        AbstractC28352kYf.trackReferralEventClick$default(memeMarketStrategyV6Fragment.zLjUOn(), memeMarketStrategyV6Fragment.iwGUEr().getChainId(), memeMarketStrategyV6Fragment.RlQdEF(), memeMarketStrategyV6Fragment.accept().OLrzqt(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), memeMarketStrategyV6Fragment.accept().KWHzl(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), null, 16, null);
        return Unit.INSTANCE;
    }

    public final void QOLQEE() {
        if (zLjUOn().zblBkD()) {
            AbstractC28352kYf.trackReferralViewPage$default(zLjUOn(), iwGUEr().getChainId(), RlQdEF(), accept().OLrzqt(C31125loC.KWHzl(this)), accept().KWHzl(C31125loC.KWHzl(this)), null, 16, null);
        }
    }

    public final void copydefault(String str) {
        C25330iug c25330iugKWHzl;
        zLjUOn().AEQbTJ(zLjUOn().AubY(), zLjUOn().gEmmrt());
        pUU.copydefault("memeQuote", "isCustom: " + zLjUOn().AhwBna() + "\n>>>>priorityFee: " + zLjUOn().zLjUOn() + ">>>>>>slippageType: " + zLjUOn().sSMYrx() + ">>>>slippageValue: " + zLjUOn().zuBGHE() + ">>>>>>>" + zLjUOn().AubY());
        Integer numAwvSrB = zLjUOn().AwvSrB();
        SlippageMode slippageMode = SlippageMode.Dynamic;
        int type = slippageMode.getType();
        if (numAwvSrB == null || numAwvSrB.intValue() != type) {
            str = zLjUOn().zuBGHE();
        }
        C25265itU c25265itUZsXlph = zsXlph();
        if (c25265itUZsXlph != null && (c25330iugKWHzl = c25265itUZsXlph.KWHzl()) != null) {
            SlippageMode.Activity activity = SlippageMode.Companion;
            Integer numAwvSrB2 = zLjUOn().AwvSrB();
            c25330iugKWHzl.setSlippageValue(activity.EZpvd(numAwvSrB2 != null ? numAwvSrB2.intValue() : slippageMode.getType()), str);
        }
        C25265itU c25265itUZsXlph2 = zsXlph();
        if (c25265itUZsXlph2 != null) {
            c25265itUZsXlph2.setPriorityFeeValue(zLjUOn().OLrzqt(zLjUOn().AubY(), zLjUOn().gEmmrt()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AYXKKw(V6BaseQuoteResponse v6BaseQuoteResponse) {
        C25330iug c25330iugKWHzl;
        C25330iug c25330iugKWHzl2;
        Integer mevUnstableShowLevel;
        C25330iug c25330iugKWHzl3;
        Integer offlineType;
        C25265itU c25265itUZsXlph = zsXlph();
        if (c25265itUZsXlph != null && (c25330iugKWHzl3 = c25265itUZsXlph.KWHzl()) != null) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            c25330iugKWHzl3.setVisibility(((selectedDeFiPlatform != null && (offlineType = selectedDeFiPlatform.getOfflineType()) != null && offlineType.intValue() == 1) ^ true) == true ? 0 : 8);
        }
        string = null;
        String string = null;
        if (zLjUOn().QSBOWP() == MemeChainType.MemeChainTypeSol) {
            C25265itU c25265itUZsXlph2 = zsXlph();
            if (c25265itUZsXlph2 == null || (c25330iugKWHzl2 = c25265itUZsXlph2.KWHzl()) == null) {
                return;
            }
            String strWlaJM = zLjUOn().wlaJM();
            boolean zDmq = zLjUOn().Dmq();
            DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (selectedDeFiPlatform2 != null && (mevUnstableShowLevel = selectedDeFiPlatform2.getMevUnstableShowLevel()) != null) {
                string = mevUnstableShowLevel.toString();
            }
            if (string == null) {
                string = "";
            }
            c25330iugKWHzl2.setMevDisplayForSol(strWlaJM, zDmq, string, zLjUOn().ORxRYg());
            return;
        }
        C25265itU c25265itUZsXlph3 = zsXlph();
        if (c25265itUZsXlph3 == null || (c25330iugKWHzl = c25265itUZsXlph3.KWHzl()) == null) {
            return;
        }
        String strWlaJM2 = zLjUOn().wlaJM();
        boolean zDmq2 = zLjUOn().Dmq();
        DefiPlatformInfo defiPlatformInfoOxVOHk = zLjUOn().OxVOHk();
        c25330iugKWHzl.setMevDisplayForEVM(strWlaJM2, zDmq2, C33129mqd.gEmmrt(defiPlatformInfoOxVOHk != null ? defiPlatformInfoOxVOHk.getMevUnstableShowLevel() : null), zLjUOn().ORxRYg());
    }

    public final void AxsJAY() {
        fZBcTu();
        accept().fJNWhG().setValue(Boolean.FALSE);
        this.AuCTel = System.currentTimeMillis();
    }

    public final Throwable EZpvd(MemeModeQuoteErrorBean memeModeQuoteErrorBean) {
        int iAhwBna = C33129mqd.AhwBna(memeModeQuoteErrorBean.getCode());
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.setVisibility(C31212lpk.copydefault.AEQbTJ(iAhwBna) ? 0 : 8);
        }
        if (iAhwBna != 0) {
            return new OKServerException(iAhwBna, memeModeQuoteErrorBean.getMsg(), null, null, 12, null);
        }
        C25324iua c25324iuaHDKMBd2 = hDKMBd();
        if (c25324iuaHDKMBd2 != null) {
            c25324iuaHDKMBd2.setVisibility(8);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackSubmitEvent$default(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, EventTrackSubmitType eventTrackSubmitType, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackSubmitEvent");
        }
        if ((i & 2) != 0) {
            map = C56424yEw.KWHzl();
        }
        memeMarketStrategyV6Fragment.KWHzl(eventTrackSubmitType, (Map<String, String>) map);
    }

    public final void KWHzl(EventTrackSubmitType eventTrackSubmitType, Map<String, String> map) {
        zLjUOn().AEQbTJ(eventTrackSubmitType.getType(), RlQdEF(), C25444iwo.EZpvd(C31125loC.KWHzl(this)), C25444iwo.AEQbTJ(C31125loC.KWHzl(this)), C56424yEw.OLrzqt(C56423yEv.EZpvd(C56390yDp.OLrzqt("popup_source", MemeQuickPopUpSource.Companion.EZpvd().getSource())), map));
    }

    private final List<UnsupportedWalletType> DAIeex() {
        if (ejfBZ().EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator) {
            return yDY.gEmmrt(UnsupportedWalletType.HardwareWallet, UnsupportedWalletType.MPCWallet, UnsupportedWalletType.PrivateKeyWallet);
        }
        return yDY.AhwBna();
    }

    public final void fFgQHt() {
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) && this.zLjUOn) {
            this.zLjUOn = false;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MemeMarketStrategyV6Fragment$showAutoSellGuideIfNeeded$1(this, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zLjUOn().OLrzqt(iwGUEr());
        zLjUOn().copydefault(fIwbmz().KWHzl());
        zLjUOn().fjfviF();
        zLjUOn().OLrzqt(C31125loC.KWHzl(this));
        zLjUOn().copydefault(C31125loC.KWHzl(this));
        C24371ica.OLrzqt.KWHzl(iwGUEr().getTokenContractAddress(), RlQdEF() == TransactionType.Buy ? DexTrackEventParameter.ButtonName.BUY.getValue() : DexTrackEventParameter.ButtonName.SELL.getValue(), iZzfmt(), iwGUEr().getEventSource(), DexTrackEventParameter.AEQbTJ.KWHzl(RlQdEF()));
        C22380heK.OLrzqt.copydefault(fIwbmz().KWHzl()).EZpvd(true).gEmmrt().AEQbTJ();
    }

    public final void fARcdN() {
        InterfaceC28268kVc first;
        String strCopydefault;
        Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = zLjUOn().DCUTEI();
        if (pairDCUTEI == null || (first = pairDCUTEI.getFirst()) == null || (strCopydefault = first.copydefault()) == null) {
            return;
        }
        uzCIH().OLrzqt(fIwbmz().KWHzl(), iwGUEr().getChainId(), strCopydefault);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21491hBi c21491hBiKWHzl = C21491hBi.KWHzl(layoutInflater, viewGroup, false);
        this.AYXKKw = c21491hBiKWHzl;
        if (c21491hBiKWHzl != null) {
            return c21491hBiKWHzl.getRoot();
        }
        return null;
    }

    public final void DTwDnp() {
        C31164lop c31164lop;
        C31161lom c31161lom;
        C31153loe c31153loe;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        this.values = new C31153loe(this, contextRequireContext, fIwbmz(), iwGUEr(), new Function1() { // from class: o.lnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        });
        this.iwGUEr = new C31161lom(this, fIwbmz(), iwGUEr(), zLjUOn(), RlQdEF(), C31125loC.KWHzl(this), QUSxYX(), new Function0() { // from class: o.lnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.fvQaOB(this.AEQbTJ);
            }
        }, null);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        C25265itU c25265itUZsXlph = zsXlph();
        this.zsXlph = new C31164lop(contextRequireContext2, c25265itUZsXlph != null ? c25265itUZsXlph.OLrzqt() : null, zLjUOn(), accept(), fIwbmz(), iwGUEr(), RlQdEF(), AwvSrB(), new Function0() { // from class: o.lnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.gGvvIC(this.copydefault);
            }
        });
        AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
        InterfaceC28107kPd interfaceC28107kPdFIwbmz = fIwbmz();
        TokenBase tokenBaseIwGUEr = iwGUEr();
        TransactionType transactionTypeRlQdEF = RlQdEF();
        C25265itU c25265itUZsXlph2 = zsXlph();
        C21491hBi c21491hBi = this.AYXKKw;
        C30567ldb c30567ldb = c21491hBi != null ? c21491hBi.AEQbTJ : null;
        C25324iua c25324iuaHDKMBd = hDKMBd();
        C31164lop c31164lop2 = this.zsXlph;
        if (c31164lop2 == null) {
            Intrinsics.gEmmrt("");
            c31164lop = null;
        } else {
            c31164lop = c31164lop2;
        }
        this.gHZMYf = new C31170lov(abstractC28352kYfZLjUOn, interfaceC28107kPdFIwbmz, tokenBaseIwGUEr, transactionTypeRlQdEF, c25265itUZsXlph2, c30567ldb, c25324iuaHDKMBd, c31164lop, new Function2() { // from class: o.lnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MemeMarketStrategyV6Fragment.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (SwapState) obj2);
            }
        }, new Function0() { // from class: o.lnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.gasjUx(this.EZpvd);
            }
        }, new Function0() { // from class: o.lno
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.iRxXKY(this.OLrzqt);
            }
        });
        AbstractC28352kYf abstractC28352kYfZLjUOn2 = zLjUOn();
        C31161lom c31161lom2 = this.iwGUEr;
        if (c31161lom2 == null) {
            Intrinsics.gEmmrt("");
            c31161lom = null;
        } else {
            c31161lom = c31161lom2;
        }
        C31153loe c31153loe2 = this.values;
        if (c31153loe2 == null) {
            Intrinsics.gEmmrt("");
            c31153loe = null;
        } else {
            c31153loe = c31153loe2;
        }
        TransactionType transactionTypeRlQdEF2 = RlQdEF();
        TokenBase tokenBaseIwGUEr2 = iwGUEr();
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        this.AwvSrB = new C31171low(abstractC28352kYfZLjUOn2, c31161lom, c31153loe, transactionTypeRlQdEF2, tokenBaseIwGUEr2, childFragmentManager, contextRequireContext3, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), new Function0() { // from class: o.lnm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.iZzfmt(this.KWHzl);
            }
        }, new Function0() { // from class: o.lnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.hUfVAv(this.EZpvd);
            }
        }, new Function0() { // from class: o.lnn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.AxsJAYaxsJAY(this.KWHzl);
            }
        }, new Function2() { // from class: o.lnr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MemeMarketStrategyV6Fragment.AEQbTJ(this.copydefault, (EventTrackSubmitType) obj, (java.util.Map) obj2);
            }
        }, new Function0() { // from class: o.lnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.gkJEwt(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.lni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.QKudOq(this.AEQbTJ);
            }
        }, AuCTel(), getNewProxyInstance());
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str) {
        memeMarketStrategyV6Fragment.EZpvd(str);
        return Unit.INSTANCE;
    }

    public static final Unit fvQaOB(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        memeMarketStrategyV6Fragment.OcIXYQ();
        return Unit.INSTANCE;
    }

    public static final C31050lmh gGvvIC(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.getFieldNames();
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z, SwapState swapState) {
        memeMarketStrategyV6Fragment.AEQbTJ(z, swapState);
        return Unit.INSTANCE;
    }

    public static final Unit gasjUx(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        memeMarketStrategyV6Fragment.fZBcTu();
        return Unit.INSTANCE;
    }

    public static final gOP iRxXKY(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.fetchVPNInfo();
    }

    public static final Unit iZzfmt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        memeMarketStrategyV6Fragment.giSNqX();
        return Unit.INSTANCE;
    }

    public static final Unit hUfVAv(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        memeMarketStrategyV6Fragment.finit();
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAYaxsJAY(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        if (memeMarketStrategyV6Fragment.getActivity() != null) {
            memeMarketStrategyV6Fragment.zLjUOn().copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, EventTrackSubmitType eventTrackSubmitType, Map map) {
        Intrinsics.checkNotNullParameter(eventTrackSubmitType, "");
        Intrinsics.checkNotNullParameter(map, "");
        memeMarketStrategyV6Fragment.KWHzl(eventTrackSubmitType, (Map<String, String>) map);
        return Unit.INSTANCE;
    }

    public static final List gkJEwt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.DAIeex();
    }

    public static final Map QKudOq(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.dvKsVJ();
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        DTwDnp();
        QKVWgx();
        aKErDB();
        ORxRYg();
        dNCPSb();
        RcXXUw();
        RJOkX();
        UeEOUB();
        djSkpj();
        AkhnZx();
        QKudOq();
    }

    public final void QKVWgx() {
        zLjUOn().AuCTel().initStep();
        this.hDKMBd = new C24339ibv(fIwbmz().KWHzl(), false, iwGUEr(), zLjUOn(), !zLjUOn().AhwBna(iwGUEr().getChainId()));
    }

    public final void aKErDB() {
        C24375ice c24375iceAuCTel = AuCTel();
        if (c24375iceAuCTel != null) {
            c24375iceAuCTel.m8628setTradeStateButtonQuoteInfokY7h8eo(iwGUEr().getTokenSymbol(), iwGUEr().getTokenSymbol(), RlQdEF(), false, false, false, C31172lox.Companion.OLrzqt(), "", "", false);
        }
        QfsBiF();
        copydefault(new MemeSelectionActivityResultContract.Output(zLjUOn().getFieldNames()));
        C25325iub c25325iubGHZMYf = gHZMYf();
        if (c25325iubGHZMYf != null) {
            c25325iubGHZMYf.setVisibility(RlQdEF() == TransactionType.Sell ? 0 : 8);
        }
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.KWHzl(C31125loC.KWHzl(this));
            c25324iuaHDKMBd.setCallback$OKDex_dex_impl(this);
        }
    }

    public final void ORxRYg() {
        this.DTwDnp = zLjUOn().sSMYrx() == SlippageFeeType.SlippageCustom.getValue() ? "custom" : "low";
        this.zuBGHE = C31167los.copydefault(zLjUOn().AubY());
    }

    public final void dNCPSb() {
        OLrzqt(zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress()));
        C25325iub c25325iubGHZMYf = gHZMYf();
        if (c25325iubGHZMYf != null) {
            c25325iubGHZMYf.setupListeners(new Function0() { // from class: o.lmQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.valueOf();
                }
            }, new Function0() { // from class: o.lmU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.DCJXGO(this.AEQbTJ);
                }
            });
        }
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit DCJXGO(final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = memeMarketStrategyV6Fragment.zLjUOn().copydefault(memeMarketStrategyV6Fragment.iwGUEr().getChainId(), memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress());
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        final String str = tokenContractAddress == null ? "" : tokenContractAddress;
        C30943lkg c30943lkgCopydefault = C30943lkg.Companion.copydefault(C31125loC.KWHzl(memeMarketStrategyV6Fragment), memeMarketStrategyV6Fragment.iwGUEr().getChainId(), str, memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress(), TransactionType.Sell.getType(), new Function1() { // from class: o.lna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.KWHzl(this.AEQbTJ, str, (MemeCurrencyBean) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = memeMarketStrategyV6Fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30943lkgCopydefault.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str, MemeCurrencyBean memeCurrencyBean) {
        Intrinsics.checkNotNullParameter(memeCurrencyBean, "");
        memeMarketStrategyV6Fragment.copydefault(memeCurrencyBean.getCurrencyTokenInfo());
        if (C31172lox.KWHzl(C31125loC.KWHzl(memeMarketStrategyV6Fragment), C31172lox.Companion.OLrzqt())) {
            RxBus.AEQbTJ(new C30922lkL(memeCurrencyBean.getCurrencyTokenInfo(), str));
        }
        return Unit.INSTANCE;
    }

    public final void RcXXUw() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress());
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
            String chainId = iwGUEr().getChainId();
            String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            abstractC31124loBZuBGHE.setLevelValue(abstractC28352kYfZLjUOn.OLrzqt(chainId, tokenContractAddress), zLjUOn().AEQbTJ(iwGUEr().getChainId()), RlQdEF());
        }
    }

    public final void RJOkX() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress());
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        int i = TaskDescription.copydefault[RlQdEF().ordinal()];
        if (i == 1) {
            AEQbTJ(tokenContractAddress);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(tokenContractAddress);
        }
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            abstractC31124loBZuBGHE.copydefault(RlQdEF(), false);
        }
    }

    public final void AEQbTJ(String str) {
        int iAEQbTJ = zLjUOn().AEQbTJ(iwGUEr().getChainId(), str);
        zLjUOn().EZpvd(iAEQbTJ);
        this.AxsJAY = C31167los.copydefault(iAEQbTJ);
        if (iAEQbTJ == 3 || AxsJAYaxsJAY().length() > 0) {
            String strKWHzl = zLjUOn().KWHzl(str);
            String strAxsJAYaxsJAY = AxsJAYaxsJAY();
            if (strAxsJAYaxsJAY != null && strAxsJAYaxsJAY.length() != 0) {
                strKWHzl = strAxsJAYaxsJAY;
            }
            AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
            if (abstractC31124loBZuBGHE != null) {
                abstractC31124loBZuBGHE.copydefault();
            }
            zLjUOn().AEQbTJ(strKWHzl, true);
            AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
            if (abstractC31124loBZuBGHE2 != null) {
                abstractC31124loBZuBGHE2.setInputEditText(strKWHzl);
            }
            EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
            if (strKWHzl.length() == 0) {
                zLjUOn().AuCTel().initRefreshCheckStep();
                return;
            }
            return;
        }
        AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
        if (abstractC31124loBZuBGHE3 != null) {
            abstractC31124loBZuBGHE3.OLrzqt(iAEQbTJ);
        }
        String strKWHzl2 = zLjUOn().KWHzl(RlQdEF().getType(), iwGUEr().getChainId(), str, iAEQbTJ);
        zLjUOn().AEQbTJ(strKWHzl2, false);
        EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(strKWHzl2));
    }

    public final void OLrzqt(String str) {
        if (AxsJAYaxsJAY().length() > 0) {
            AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
            if (abstractC31124loBZuBGHE != null) {
                abstractC31124loBZuBGHE.copydefault();
            }
            zLjUOn().OLrzqt(UnitType.UnitTypeToken);
            AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
            if (abstractC31124loBZuBGHE2 != null) {
                abstractC31124loBZuBGHE2.setUnit(zLjUOn().OcIXYQ().name(), iwGUEr().getTokenLogoUrl());
            }
            zLjUOn().AEQbTJ(AxsJAYaxsJAY(), true);
            AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
            if (abstractC31124loBZuBGHE3 != null) {
                abstractC31124loBZuBGHE3.setInputEditText(AxsJAYaxsJAY());
            }
            this.AxsJAY = "custom";
            zLjUOn().EZpvd(3);
            EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
            return;
        }
        zLjUOn().OLrzqt(UnitType.UnitTypePercent);
        AbstractC31124loB abstractC31124loBZuBGHE4 = zuBGHE();
        if (abstractC31124loBZuBGHE4 != null) {
            AbstractC31124loB.setUnit$default(abstractC31124loBZuBGHE4, "%", null, 2, null);
        }
        zLjUOn().EZpvd(0);
        zLjUOn().AEQbTJ(zLjUOn().KWHzl(RlQdEF().getType(), iwGUEr().getChainId(), str, 0), false);
        String str2 = (String) CollectionsKt___CollectionsKt.AkhnZx(zLjUOn().AEQbTJ(iwGUEr().getChainId()), 0);
        if (str2 == null) {
            str2 = "";
        }
        EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(str2));
    }

    public final void UeEOUB() {
        this.fIwbmz = new C31173loy(zLjUOn(), iwGUEr(), C31125loC.KWHzl(this), RlQdEF(), new Function0() { // from class: o.lmR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.OqFWZa(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.lmT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.ODWQjV(this.KWHzl);
            }
        }, new Function0() { // from class: o.lmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(MemeMarketStrategyV6Fragment.DarRvM(this.KWHzl));
            }
        }, new Function1() { // from class: o.lmV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AYXKKw(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.lmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AhwBna(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }, null);
    }

    public static final AbstractC31124loB OqFWZa(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.zuBGHE();
    }

    public static final C25265itU ODWQjV(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.zsXlph();
    }

    public static final boolean DarRvM(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        return memeMarketStrategyV6Fragment.fetchVPNInfo;
    }

    public static final Unit AYXKKw(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z) {
        memeMarketStrategyV6Fragment.fetchVPNInfo = z;
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z) {
        setViewsInvalidState$default(memeMarketStrategyV6Fragment, z, null, 2, null);
        return Unit.INSTANCE;
    }

    public final void djSkpj() {
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            c24453ieCAuCTelauCTel.setOnExpandStateChangeListener(new Function1() { // from class: o.lmA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        C24453ieC c24453ieCAuCTelauCTel2 = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel2 != null) {
            c24453ieCAuCTelauCTel2.setRateSwitchListener(new Function0() { // from class: o.lmy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.accept(this.OLrzqt);
                }
            });
        }
        C24453ieC c24453ieCAuCTelauCTel3 = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel3 != null) {
            c24453ieCAuCTelauCTel3.setVisibility(8);
        }
        C24453ieC c24453ieCAuCTelauCTel4 = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel4 != null) {
            c24453ieCAuCTelauCTel4.copydefault();
        }
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.setVisibility(8);
        }
    }

    public static final Unit gEmmrt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z) {
        C25324iua c25324iuaHDKMBd = memeMarketStrategyV6Fragment.hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.setVisibility(z ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit accept(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        C24453ieC c24453ieCAuCTelauCTel;
        memeMarketStrategyV6Fragment.wlaJM = !memeMarketStrategyV6Fragment.wlaJM;
        V6QuoteResponseData value = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
        if (value != null && (c24453ieCAuCTelauCTel = memeMarketStrategyV6Fragment.AuCTelauCTel()) != null) {
            C28337kXr labelData$default = C28343kXx.getLabelData$default(value, memeMarketStrategyV6Fragment.fJNWhG(), (String) null, C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf()), 2, (Object) null);
            Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c24453ieCAuCTelauCTel.setRateInfo(C31134loL.copydefault(labelData$default, contextRequireContext));
        }
        return Unit.INSTANCE;
    }

    public final void AhwBna(V6BaseQuoteResponse v6BaseQuoteResponse) {
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            C28337kXr labelData$default = C28343kXx.getLabelData$default(v6BaseQuoteResponse, fJNWhG(), (String) null, C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf()), 2, (Object) null);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c24453ieCAuCTelauCTel.setRateInfo(C31134loL.copydefault(labelData$default, contextRequireContext));
        }
        C24453ieC c24453ieCAuCTelauCTel2 = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel2 != null) {
            c24453ieCAuCTelauCTel2.setRateClickable(v6BaseQuoteResponse.isQuoteAmountNotEmpty());
        }
    }

    public final void OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        String tokenSymbol;
        C25325iub c25325iubGHZMYf = gHZMYf();
        if (c25325iubGHZMYf != null) {
            String string = getString(C23274hvD.Fragment.onReceiveResult);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (dexMultiTokenInfoBean == null || (tokenSymbol = dexMultiTokenInfoBean.getTokenSymbol()) == null) {
                tokenSymbol = "--";
            }
            c25325iubGHZMYf.setupView(new C25325iub.TaskDescription(string, 0, 0, tokenSymbol, ContextCompat.getColor(requireContext(), C52761wXj.Activity.fdOvFl), true, dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenLogoUrl() : null, true, 6, null));
        }
    }

    public final void AkhnZx() {
        C30567ldb c30567ldbAubY = AubY();
        if (c30567ldbAubY != null) {
            c30567ldbAubY.setOnAutoSellCheckboxClickListener(new View.OnClickListener() { // from class: o.lmG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MemeMarketStrategyV6Fragment.AEQbTJ(this.copydefault, view);
                }
            });
        }
        C30567ldb c30567ldbAubY2 = AubY();
        if (c30567ldbAubY2 != null) {
            c30567ldbAubY2.setOnEditButtonClickListener(new View.OnClickListener() { // from class: o.lmJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    MemeMarketStrategyV6Fragment.copydefault(this.copydefault, view);
                }
            });
        }
    }

    public static final void AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, View view) {
        LifecycleOwner viewLifecycleOwner = memeMarketStrategyV6Fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MemeMarketStrategyV6Fragment$buildAutoSellInputView$1$1(memeMarketStrategyV6Fragment, null), 3, null);
    }

    public static final void copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, View view) {
        C32866mlf.onEvent$default("DEXTrade_Home_FullPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.lnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.OLrzqt((EventParamsList) obj);
            }
        }, 1, (Object) null);
        LifecycleOwner viewLifecycleOwner = memeMarketStrategyV6Fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MemeMarketStrategyV6Fragment$buildAutoSellInputView$2$2(memeMarketStrategyV6Fragment, null), 3, null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "business_type", "quick", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_name", "quick", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "auto_sell_edit", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x00e5 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(gLQ glq) {
        SwapState swapState;
        SwapState swapState2;
        SwapState value;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        CommonDexInfo commonDexInfo2;
        DexMultiTokenInfoBean fromToken2;
        InterfaceC28268kVc second;
        InterfaceC28268kVc first;
        if (zLjUOn().DCUTEIdCUTEI()) {
            return;
        }
        if (!glq.AEQbTJ()) {
            Object tokenContractAddress = null;
            if (glq instanceof gLQ.ActionBar) {
                swapState2 = SwapState.SA_NOT_SMART_ACCOUNT;
            } else if (glq instanceof gLQ.FragmentManager) {
                swapState2 = SwapState.SA_DISABLED;
            } else if (glq instanceof gLQ.Activity) {
                swapState2 = SwapState.SA_NEED_TO_UPDATE_APP;
            } else {
                if (!(glq instanceof gLQ.AssistContent)) {
                    if (!Intrinsics.EZpvd(glq, gLQ.Dialog.OLrzqt) && !Intrinsics.EZpvd(glq, gLQ.LoaderManager.AEQbTJ) && !(glq instanceof gLQ.Application) && !(glq instanceof gLQ.PendingIntent) && !(glq instanceof gLQ.StateListAnimator) && !Intrinsics.EZpvd(glq, gLQ.TaskDescription.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pUU.copydefault(getTAG(), "SmartAccountState for auto-sell: " + glq);
                    swapState = null;
                    if (swapState != null) {
                        V6QuoteResponseData value2 = zLjUOn().USBtdM().getValue();
                        C24375ice c24375iceAuCTel = AuCTel();
                        if (c24375iceAuCTel != null) {
                            Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = zLjUOn().DCUTEI();
                            String strOLrzqt = (pairDCUTEI == null || (first = pairDCUTEI.getFirst()) == null) ? null : first.OLrzqt();
                            if (strOLrzqt == null) {
                                strOLrzqt = "";
                            }
                            Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI2 = zLjUOn().DCUTEI();
                            String strOLrzqt2 = (pairDCUTEI2 == null || (second = pairDCUTEI2.getSecond()) == null) ? null : second.OLrzqt();
                            if (strOLrzqt2 == null) {
                                strOLrzqt2 = "";
                            }
                            TransactionType transactionTypeRlQdEF = RlQdEF();
                            int iOLrzqt = C31172lox.Companion.OLrzqt();
                            String strCopydefault = copydefault(value2);
                            String strEZpvd = EZpvd(value2);
                            if (value2 != null && (commonDexInfo2 = value2.getCommonDexInfo()) != null && (fromToken2 = commonDexInfo2.getFromToken()) != null) {
                                tokenContractAddress = fromToken2.getTokenContractAddress();
                            }
                            c24375iceAuCTel.m8626setTradeStateButtonrh5Nn64(swapState, strOLrzqt, strOLrzqt2, transactionTypeRlQdEF, true, false, false, iOLrzqt, strCopydefault, strEZpvd, copydefault(tokenContractAddress != null ? tokenContractAddress : "", iwGUEr().getChainId(), (value2 == null || (commonDexInfo = value2.getCommonDexInfo()) == null || (fromToken = commonDexInfo.getFromToken()) == null) ? false : fromToken.isMainChainCoin()));
                            tokenContractAddress = Unit.INSTANCE;
                        }
                        if (tokenContractAddress != null) {
                            return;
                        }
                    }
                    value = zLjUOn().AuCTel().getCurrentState().getValue();
                    if (value == null) {
                        value = SwapState.SWAP;
                    }
                    AEQbTJ(zLjUOn().USBtdM().getValue(), value);
                    return;
                }
                swapState2 = SwapState.SA_SERVICE_UPGRADED_ACCOUNT;
            }
            swapState = swapState2;
            if (swapState != null) {
            }
            value = zLjUOn().AuCTel().getCurrentState().getValue();
            if (value == null) {
            }
            AEQbTJ(zLjUOn().USBtdM().getValue(), value);
            return;
        }
        SwapState value3 = zLjUOn().AuCTel().getCurrentState().getValue();
        if (value3 == null) {
            value3 = SwapState.SWAP;
        }
        AEQbTJ(zLjUOn().USBtdM().getValue(), value3);
    }

    public final void values() {
        View viewFindViewById;
        TextView textView;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AbstractC30827liW abstractC30827liW = parentFragment instanceof AbstractC30827liW ? (AbstractC30827liW) parentFragment : null;
        View view = abstractC30827liW != null ? abstractC30827liW.getView() : null;
        if (view != null && (textView = (TextView) view.findViewById(C23274hvD.Application.RawRes)) != null) {
            textView.setEnabled(false);
        }
        if (view != null && (viewFindViewById = view.findViewById(C23274hvD.Application.DcMfJKDcMfJK)) != null) {
            viewFindViewById.setEnabled(false);
        }
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            abstractC31124loBZuBGHE.setInputEnabled(false);
            abstractC31124loBZuBGHE.setValueTextColor(C52761wXj.Activity.UlJrfe);
        }
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            this.RJOkX = c25324iuaHDKMBd.getVisibility() == 0;
            c25324iuaHDKMBd.setVisibility(8);
        }
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            c24453ieCAuCTelauCTel.setVisibility(8);
        }
    }

    public final void isConnected() {
        View viewFindViewById;
        TextView textView;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AbstractC30827liW abstractC30827liW = parentFragment instanceof AbstractC30827liW ? (AbstractC30827liW) parentFragment : null;
        View view = abstractC30827liW != null ? abstractC30827liW.getView() : null;
        if (view != null && (textView = (TextView) view.findViewById(C23274hvD.Application.RawRes)) != null) {
            textView.setEnabled(true);
        }
        if (view != null && (viewFindViewById = view.findViewById(C23274hvD.Application.DcMfJKDcMfJK)) != null) {
            viewFindViewById.setEnabled(true);
        }
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            abstractC31124loBZuBGHE.setInputEnabled(true);
            QVAiDq();
            abstractC31124loBZuBGHE.setValueTextColor(C52761wXj.Activity.fdOvFl);
        }
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.setVisibility(this.RJOkX ? 0 : 8);
        }
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            c24453ieCAuCTelauCTel.setVisibility(0);
        }
        AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
        if (abstractC31124loBZuBGHE2 != null) {
            abstractC31124loBZuBGHE2.OLrzqt(zLjUOn().OLrzqt());
        }
    }

    public final void QVAiDq() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress());
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        int iAEQbTJ = zLjUOn().AEQbTJ(iwGUEr().getChainId(), tokenContractAddress);
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            abstractC31124loBZuBGHE.OLrzqt(iAEQbTJ);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openAutoSellStrategySetupActivity$default(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAutoSellStrategySetupActivity");
        }
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        memeMarketStrategyV6Fragment.AEQbTJ((List<? extends AdvancedAutoSellStrategy>) list);
    }

    public final void AEQbTJ(List<? extends AdvancedAutoSellStrategy> list) {
        Intent intent = new Intent(requireActivity(), (Class<?>) ActivityC30497lcK.class);
        intent.putParcelableArrayListExtra("strategies", new ArrayList<>(list));
        intent.putExtra("business_type", "quick");
        this.OcIXYQ.launch(intent);
    }

    private final void QKudOq() {
        C25265itU c25265itUZsXlph = zsXlph();
        if (c25265itUZsXlph != null) {
            c25265itUZsXlph.setEventTrackCallback(new Function1() { // from class: o.lnX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.AEQbTJ(this.copydefault, (java.lang.String) obj);
                }
            });
        }
        C25265itU c25265itUZsXlph2 = zsXlph();
        if (c25265itUZsXlph2 != null) {
            c25265itUZsXlph2.EZpvd(new Function0() { // from class: o.lnT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.giSNqX(this.AEQbTJ);
                }
            });
        }
        zLjUOn().iZzfmt();
        zLjUOn().AuCTel().getCurrentState().observe(getViewLifecycleOwner(), this.AubY);
        EZpvd(RlQdEF(), iwGUEr());
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            abstractC31124loBZuBGHE.setUnitSelectClickListener(childFragmentManager, iwGUEr().getTokenSymbol(), iwGUEr().getTokenLogoUrl(), String.valueOf(iwGUEr().getDecimals()), new Function1() { // from class: o.lnW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.OLrzqt(this.KWHzl, (C55276xgr) obj);
                }
            });
        }
        AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
        if (abstractC31124loBZuBGHE2 != null) {
            abstractC31124loBZuBGHE2.copydefault(new Function1() { // from class: o.lnV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.copydefault(this.copydefault, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        C22380heK.OLrzqt.copydefault(fIwbmz().KWHzl()).EZpvd(true).gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, zLjUOn().OJuSTm(), null, new StateListAnimator(), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MemeMarketStrategyV6Fragment$initListener$7(this, null), 3, null);
        C25390ivn.collectOnViewLifecycle$default(this, ejfBZ().EZpvd(), null, new FragmentManager(), 2, null);
    }

    public static final Unit AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str) {
        MemeStrategyType memeStrategyType;
        Intrinsics.checkNotNullParameter(str, "");
        C24371ica c24371ica = C24371ica.OLrzqt;
        String tokenContractAddress = memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress();
        String value = DexTrackEventParameter.ButtonName.BUY.getValue();
        String strIZzfmt = memeMarketStrategyV6Fragment.iZzfmt();
        String eventSource = memeMarketStrategyV6Fragment.iwGUEr().getEventSource();
        int i = TaskDescription.copydefault[memeMarketStrategyV6Fragment.RlQdEF().ordinal()];
        if (i == 1) {
            memeStrategyType = MemeStrategyType.BuyNow;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            memeStrategyType = MemeStrategyType.SellNow;
        }
        c24371ica.OLrzqt(str, tokenContractAddress, value, strIZzfmt, eventSource, memeStrategyType);
        return Unit.INSTANCE;
    }

    public static final Unit giSNqX(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        DexMultiTokenInfoBean fromToken;
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken2;
        V6QuoteResponseData value = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
        if (value != null) {
            DefiChainInfo defiChainInfoOLrzqt = memeMarketStrategyV6Fragment.zLjUOn().OLrzqt(memeMarketStrategyV6Fragment.iwGUEr().getChainId());
            boolean supportEip1559 = defiChainInfoOLrzqt != null ? defiChainInfoOLrzqt.getSupportEip1559() : true;
            if (memeMarketStrategyV6Fragment.zLjUOn().EZpvd(memeMarketStrategyV6Fragment.iwGUEr().getChainId())) {
                ActivityResultLauncher<MemeSelectionActivityResultContract.Input> activityResultLauncher = memeMarketStrategyV6Fragment.uzCIH;
                String chainId = memeMarketStrategyV6Fragment.iwGUEr().getChainId();
                CommonDexInfo commonDexInfo = value.getCommonDexInfo();
                String chainLogoUrl = null;
                String fromTokenValue = commonDexInfo != null ? commonDexInfo.getFromTokenValue() : null;
                String str = fromTokenValue == null ? "" : fromTokenValue;
                CommonDexInfo commonDexInfo2 = value.getCommonDexInfo();
                String fromTokenAmount = commonDexInfo2 != null ? commonDexInfo2.getFromTokenAmount() : null;
                String str2 = fromTokenAmount == null ? "" : fromTokenAmount;
                boolean zDmq = memeMarketStrategyV6Fragment.zLjUOn().Dmq();
                DefiPlatformInfo selectedDeFiPlatform = value.getSelectedDeFiPlatform();
                String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
                String str3 = receiveAmount == null ? "" : receiveAmount;
                DefiPlatformInfo selectedDeFiPlatform2 = value.getSelectedDeFiPlatform();
                String toTokenValue = selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getToTokenValue() : null;
                String str4 = toTokenValue == null ? "" : toTokenValue;
                DefiPlatformInfo selectedDeFiPlatform3 = value.getSelectedDeFiPlatform();
                String strIsEnableMev = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.isEnableMev() : null;
                String str5 = strIsEnableMev == null ? "" : strIsEnableMev;
                String strIsConnected = memeMarketStrategyV6Fragment.zLjUOn().isConnected();
                CommonDexInfo commonDexInfo3 = value.getCommonDexInfo();
                String tokenContractAddress = (commonDexInfo3 == null || (fromToken2 = commonDexInfo3.getFromToken()) == null) ? null : fromToken2.getTokenContractAddress();
                String str6 = tokenContractAddress == null ? "" : tokenContractAddress;
                CommonDexInfo commonDexInfo4 = value.getCommonDexInfo();
                String tokenContractAddress2 = (commonDexInfo4 == null || (toToken = commonDexInfo4.getToToken()) == null) ? null : toToken.getTokenContractAddress();
                String str7 = tokenContractAddress2 == null ? "" : tokenContractAddress2;
                CommonDexInfo commonDexInfo5 = value.getCommonDexInfo();
                if (commonDexInfo5 != null && (fromToken = commonDexInfo5.getFromToken()) != null) {
                    chainLogoUrl = fromToken.getChainLogoUrl();
                }
                activityResultLauncher.launch(new MemeSelectionActivityResultContract.Input(new MemeQuoteAdapter(chainId, str, str2, zDmq, str3, str4, str5, supportEip1559, strIsConnected, str6, str7, chainLogoUrl == null ? "" : chainLogoUrl), MemeTransactionSceneType.Market.getValue(), memeMarketStrategyV6Fragment.zLjUOn().getFieldNames(), memeMarketStrategyV6Fragment.RlQdEF().getType()));
                AbstractC28336kXq.trackDexTradeHomeFullPageClick$default(memeMarketStrategyV6Fragment.zLjUOn(), memeMarketStrategyV6Fragment.accept().OLrzqt(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), memeMarketStrategyV6Fragment.accept().KWHzl(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.PRESET_ENTER.getButtonName()), C56390yDp.OLrzqt("popup_source", memeMarketStrategyV6Fragment.accept().AEQbTJ(C31125loC.KWHzl(memeMarketStrategyV6Fragment)))), null, 8, null);
            }
        }
        C24371ica.OLrzqt.AEQbTJ(DexTrackEventParameter.ButtonName.SELL.getValue(), memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress(), memeMarketStrategyV6Fragment.iwGUEr().getChainName());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, C55276xgr c55276xgr) {
        MemeStrategyType memeStrategyType;
        AbstractC28352kYf abstractC28352kYfZLjUOn = memeMarketStrategyV6Fragment.zLjUOn();
        Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        abstractC28352kYfZLjUOn.OLrzqt((UnitType) objOLrzqt);
        memeMarketStrategyV6Fragment.zLjUOn().AEQbTJ("", false);
        memeMarketStrategyV6Fragment.QfsBiF();
        C24371ica c24371ica = C24371ica.OLrzqt;
        String value = memeMarketStrategyV6Fragment.zLjUOn().OcIXYQ() == UnitType.UnitTypePercent ? DexTrackEventParameter.ButtonName.CUSTOM_PERCENTAGE.getValue() : DexTrackEventParameter.ButtonName.CUSTOM_AMOUNT.getValue();
        String tokenContractAddress = memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress();
        String value2 = DexTrackEventParameter.ButtonName.SELL.getValue();
        String strIZzfmt = memeMarketStrategyV6Fragment.iZzfmt();
        String eventSource = memeMarketStrategyV6Fragment.iwGUEr().getEventSource();
        int i = TaskDescription.copydefault[memeMarketStrategyV6Fragment.RlQdEF().ordinal()];
        if (i == 1) {
            memeStrategyType = MemeStrategyType.BuyNow;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            memeStrategyType = MemeStrategyType.SellNow;
        }
        c24371ica.OLrzqt(value, tokenContractAddress, value2, strIZzfmt, eventSource, memeStrategyType);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, int i) {
        C21491hBi c21491hBi;
        C25324iua c25324iua;
        memeMarketStrategyV6Fragment.AxsJAY = C31167los.copydefault(i);
        memeMarketStrategyV6Fragment.zLjUOn().EZpvd(i);
        memeMarketStrategyV6Fragment.EZpvd(i);
        memeMarketStrategyV6Fragment.KWHzl(i);
        if (i == 3 && C23313hvq.copydefault(memeMarketStrategyV6Fragment.zLjUOn().zsXlph(), 0) && (c21491hBi = memeMarketStrategyV6Fragment.AYXKKw) != null && (c25324iua = c21491hBi.gEmmrt) != null) {
            c25324iua.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, List list) {
        if (list == null || list.isEmpty()) {
            return Unit.INSTANCE;
        }
        AbstractC28352kYf.refreshQuote$default(memeMarketStrategyV6Fragment.zLjUOn(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(MemeMarketStrategyV6Fragment.this, C23274hvD.Fragment.onSetShuffleMode, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str))), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            }
            MemeMarketStrategyV6Fragment.this.zLjUOn().ixgjPv();
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(AbstractC30510lcX abstractC30510lcX, Continuation<? super Unit> continuation) {
            MemeMarketStrategyV6Fragment.this.zLjUOn().OLrzqt(abstractC30510lcX);
            C30567ldb c30567ldbAubY = MemeMarketStrategyV6Fragment.this.AubY();
            if (c30567ldbAubY != null) {
                c30567ldbAubY.setStateNew(abstractC30510lcX);
            }
            if (abstractC30510lcX instanceof AbstractC30510lcX.TaskDescription) {
                C30567ldb c30567ldbAubY2 = MemeMarketStrategyV6Fragment.this.AubY();
                if (c30567ldbAubY2 != null) {
                    c30567ldbAubY2.setVisibility(8);
                }
                View viewWlaJM = MemeMarketStrategyV6Fragment.this.wlaJM();
                if (viewWlaJM != null) {
                    viewWlaJM.setVisibility(C31172lox.KWHzl(C31125loC.KWHzl(MemeMarketStrategyV6Fragment.this), C31172lox.Companion.OLrzqt()) ? 0 : 8);
                }
            } else if (abstractC30510lcX instanceof AbstractC30510lcX.StateListAnimator) {
                C30567ldb c30567ldbAubY3 = MemeMarketStrategyV6Fragment.this.AubY();
                if (c30567ldbAubY3 != null) {
                    c30567ldbAubY3.setVisibility(0);
                }
                View viewWlaJM2 = MemeMarketStrategyV6Fragment.this.wlaJM();
                if (viewWlaJM2 != null) {
                    viewWlaJM2.setVisibility(0);
                }
                if (MemeMarketStrategyV6Fragment.this.ejfBZ().AEQbTJ(MemeMarketStrategyV6Fragment.this.iwGUEr().getChainId())) {
                    return Unit.INSTANCE;
                }
                AbstractC30510lcX.StateListAnimator stateListAnimator = (AbstractC30510lcX.StateListAnimator) abstractC30510lcX;
                if (!stateListAnimator.EZpvd()) {
                    MemeMarketStrategyV6Fragment.this.fARcdN = true;
                    MemeMarketStrategyV6Fragment.this.dxcTrN();
                    MemeMarketStrategyV6Fragment.this.values();
                } else if (MemeMarketStrategyV6Fragment.this.fARcdN) {
                    MemeMarketStrategyV6Fragment.this.fARcdN = false;
                    MemeMarketStrategyV6Fragment.this.zLjUOn().copydefault(false);
                    MemeMarketStrategyV6Fragment.this.isConnected();
                }
                MemeMarketStrategyV6Fragment.this.copydefault(stateListAnimator.copydefault());
                MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment = MemeMarketStrategyV6Fragment.this;
                MemeMarketStrategyV6Fragment.updateReminderView$default(memeMarketStrategyV6Fragment, memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue(), null, null, 4, null);
            } else if (abstractC30510lcX instanceof AbstractC30510lcX.Activity) {
                C30567ldb c30567ldbAubY4 = MemeMarketStrategyV6Fragment.this.AubY();
                if (c30567ldbAubY4 != null) {
                    c30567ldbAubY4.setVisibility(0);
                }
                View viewWlaJM3 = MemeMarketStrategyV6Fragment.this.wlaJM();
                if (viewWlaJM3 != null) {
                    viewWlaJM3.setVisibility(0);
                }
                if (MemeMarketStrategyV6Fragment.this.fARcdN) {
                    MemeMarketStrategyV6Fragment.this.zLjUOn().copydefault(false);
                    MemeMarketStrategyV6Fragment.this.isConnected();
                }
                MemeMarketStrategyV6Fragment.this.copydefault(gLQ.TaskDescription.copydefault);
                MemeMarketStrategyV6Fragment.updateReminderView$default(MemeMarketStrategyV6Fragment.this, null, null, null, 7, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(int i) {
        try {
            Result.Application application = Result.Companion;
            int i2 = TaskDescription.copydefault[RlQdEF().ordinal()];
            if (i2 == 1) {
                AEQbTJ(i);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(i);
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final void AEQbTJ(int i) {
        C55001xbh c55001xbhEZpvd;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress());
        String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        zLjUOn().KWHzl(iwGUEr().getChainId(), tokenContractAddress, i);
        if (i != 3) {
            String strKWHzl = zLjUOn().KWHzl(RlQdEF().getType(), iwGUEr().getChainId(), tokenContractAddress, i);
            EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(strKWHzl));
            zLjUOn().AEQbTJ(strKWHzl, false);
            AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
            if (abstractC31124loBZuBGHE != null) {
                abstractC31124loBZuBGHE.setInputEditText("");
            }
            gGvvIC();
            return;
        }
        AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
        String strIsConnected = (abstractC31124loBZuBGHE2 == null || (c55001xbhEZpvd = abstractC31124loBZuBGHE2.EZpvd()) == null) ? null : c55001xbhEZpvd.isConnected();
        AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
        if (abstractC31124loBZuBGHE3 != null) {
            abstractC31124loBZuBGHE3.setInputEditText(strIsConnected == null ? "" : strIsConnected);
        }
        boolean zCopydefault = (strIsConnected == null || strIsConnected.length() == 0) | C23313hvq.copydefault(strIsConnected, 0);
        setViewsInvalidState$default(this, zCopydefault, null, 2, null);
        if (zCopydefault) {
            dxcTrN();
        } else {
            zLjUOn().KWHzl(strIsConnected != null ? strIsConnected : "", tokenContractAddress);
        }
        EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
    }

    public final void dxcTrN() {
        zLjUOn().QbewEr();
    }

    public final void copydefault(int i) {
        UnitType unitTypeAEQbTJ;
        C55001xbh c55001xbhEZpvd;
        if (i == 0 || i == 1 || i == 2) {
            zLjUOn().OLrzqt(UnitType.UnitTypePercent);
            AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
            if (abstractC31124loBZuBGHE != null) {
                AbstractC31124loB.setUnit$default(abstractC31124loBZuBGHE, "%", null, 2, null);
            }
            AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
            int type = RlQdEF().getType();
            String chainId = iwGUEr().getChainId();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress());
            String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            String strKWHzl = abstractC28352kYfZLjUOn.KWHzl(type, chainId, tokenContractAddress, i);
            zLjUOn().AEQbTJ(strKWHzl, false);
            EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(strKWHzl));
            AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
            if (abstractC31124loBZuBGHE2 != null) {
                abstractC31124loBZuBGHE2.setInputEditText("");
            }
            QfsBiF();
            gGvvIC();
            return;
        }
        if (i != 3) {
            return;
        }
        AbstractC28352kYf abstractC28352kYfZLjUOn2 = zLjUOn();
        AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
        if (abstractC31124loBZuBGHE3 == null || (unitTypeAEQbTJ = abstractC31124loBZuBGHE3.AEQbTJ()) == null) {
            unitTypeAEQbTJ = UnitType.UnitTypePercent;
        }
        abstractC28352kYfZLjUOn2.OLrzqt(unitTypeAEQbTJ);
        if (zLjUOn().OcIXYQ() == UnitType.UnitTypePercent) {
            AbstractC31124loB abstractC31124loBZuBGHE4 = zuBGHE();
            if (abstractC31124loBZuBGHE4 != null) {
                AbstractC31124loB.setUnit$default(abstractC31124loBZuBGHE4, "%", null, 2, null);
            }
        } else {
            AbstractC31124loB abstractC31124loBZuBGHE5 = zuBGHE();
            if (abstractC31124loBZuBGHE5 != null) {
                abstractC31124loBZuBGHE5.setUnit(zLjUOn().OcIXYQ().name(), iwGUEr().getTokenLogoUrl());
            }
        }
        AbstractC31124loB abstractC31124loBZuBGHE6 = zuBGHE();
        String strIsConnected = (abstractC31124loBZuBGHE6 == null || (c55001xbhEZpvd = abstractC31124loBZuBGHE6.EZpvd()) == null) ? null : c55001xbhEZpvd.isConnected();
        zLjUOn().AEQbTJ(strIsConnected == null ? "" : strIsConnected, true);
        AbstractC31124loB abstractC31124loBZuBGHE7 = zuBGHE();
        if (abstractC31124loBZuBGHE7 != null) {
            abstractC31124loBZuBGHE7.setInputEditText(strIsConnected != null ? strIsConnected : "");
        }
        setViewsInvalidState$default(this, strIsConnected == null || strIsConnected.length() == 0 || C23313hvq.copydefault(strIsConnected, 0) || !zLjUOn().AhwBna(iwGUEr().getChainId()), null, 2, null);
        QfsBiF();
        gGvvIC();
        EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
        zLjUOn().EZpvd(i);
    }

    public final void gGvvIC() {
        zLjUOn().AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
    }

    public final void KWHzl(int i) {
        AbstractC28336kXq.trackDexTradeHomeFullPageClick$default(zLjUOn(), accept().OLrzqt(C31125loC.KWHzl(this)), accept().KWHzl(C31125loC.KWHzl(this)), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.QUICK_BUTTON.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, C31167los.EZpvd(i)), C56390yDp.OLrzqt("popup_source", accept().AEQbTJ(C31125loC.KWHzl(this)))), null, 8, null);
    }

    public final void QfsBiF() {
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhEZpvd2;
        C55001xbh c55001xbhEZpvd3;
        int i = TaskDescription.OLrzqt[zLjUOn().OcIXYQ().ordinal()];
        if (i == 1) {
            InputFilter[] inputFilterArr = {new InputFilter() { // from class: o.lmW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.text.InputFilter
                public final java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i2, int i3, android.text.Spanned spanned, int i4, int i5) {
                    return MemeMarketStrategyV6Fragment.KWHzl(charSequence, i2, i3, spanned, i4, i5);
                }
            }, new C55007xbn(2, false, null, null, false, false, 62, null)};
            AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
            if (abstractC31124loBZuBGHE == null || (c55001xbhEZpvd = abstractC31124loBZuBGHE.EZpvd()) == null) {
                return;
            }
            c55001xbhEZpvd.setFilters(inputFilterArr);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
        if (abstractC31124loBZuBGHE2 != null && (c55001xbhEZpvd3 = abstractC31124loBZuBGHE2.EZpvd()) != null) {
            c55001xbhEZpvd3.setFilters(null);
        }
        String strUlJrfe = zLjUOn().UlJrfe();
        AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
        if (abstractC31124loBZuBGHE3 == null || (c55001xbhEZpvd2 = abstractC31124loBZuBGHE3.EZpvd()) == null) {
            return;
        }
        c55001xbhEZpvd2.setMaxDecimalValue(C22370heA.OLrzqt(strUlJrfe));
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:java.lang.Object:CAST), (wrap:java.lang.Object:CAST) */
    public static final CharSequence KWHzl(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) spanned);
            sb.append((Object) charSequence);
            String string = sb.toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String strReplace$default = C59449zhJ.replace$default(string, C38303pTu.EZpvd(locale), JwtUtilsKt.JWT_DELIMITER, false, 4, (Object) null);
            if (C23313hvq.OLrzqt(strReplace$default, 100)) {
                return "";
            }
            if (!Intrinsics.EZpvd((Object) strReplace$default, (Object) "100.")) {
                return null;
            }
            for (int iFIwbmz = StringsKt__StringsKt.fIwbmz((CharSequence) strReplace$default); -1 < iFIwbmz; iFIwbmz--) {
                strReplace$default.charAt(iFIwbmz);
                if (!C59449zhJ.endsWith$default(string, JwtUtilsKt.JWT_DELIMITER, false, 2, null)) {
                    String strSubstring = strReplace$default.substring(0, iFIwbmz + 1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    return strSubstring;
                }
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public final void copydefault(MemeSelectionActivityResultContract.Output output) {
        zLjUOn().AEQbTJ(output);
        pUU.copydefault("updateTransactionSetting", "isCustom: " + zLjUOn().AhwBna() + "\n>>>>priorityFee: " + zLjUOn().zLjUOn() + ">>>>>>slippageType: " + zLjUOn().sSMYrx() + ">>>>slippageValue: " + zLjUOn().zuBGHE());
        this.zuBGHE = C31167los.OLrzqt(zLjUOn().AubY());
        this.DTwDnp = C31167los.copydefault(zLjUOn().sSMYrx());
        C25265itU c25265itUZsXlph = zsXlph();
        if (c25265itUZsXlph != null) {
            C25330iug c25330iugKWHzl = c25265itUZsXlph.KWHzl();
            PresetUserConfigBean presetUserConfigBeanEZpvd = zLjUOn().getNewProxyInstance().EZpvd(iwGUEr().getChainId(), output.getPresetType());
            String name = presetUserConfigBeanEZpvd != null ? presetUserConfigBeanEZpvd.getName() : null;
            if (name == null) {
                name = "";
            }
            c25330iugKWHzl.setPresetName(name);
            c25265itUZsXlph.KWHzl().setInitPriorityFee(PriorityFeeType.Companion.copydefault(zLjUOn().AubY()), zLjUOn().zLjUOn());
            String strQSLkRj = zLjUOn().QSLkRj();
            C25330iug c25330iugKWHzl2 = c25265itUZsXlph.KWHzl();
            SlippageMode.Activity activity = SlippageMode.Companion;
            Integer numAwvSrB = zLjUOn().AwvSrB();
            c25330iugKWHzl2.setSlippageValue(activity.EZpvd(numAwvSrB != null ? numAwvSrB.intValue() : SlippageMode.Dynamic.getType()), strQSLkRj);
            if (Intrinsics.EZpvd((Object) zLjUOn().isConnected(), (Object) MemeChainType.MemeChainTypeSol.getValue())) {
                C25330iug c25330iugKWHzl3 = c25265itUZsXlph.KWHzl();
                String strWlaJM = zLjUOn().wlaJM();
                boolean zZuWLRA = zLjUOn().zuWLRA();
                DefiPlatformInfo defiPlatformInfoOxVOHk = zLjUOn().OxVOHk();
                c25330iugKWHzl3.setMevDisplayForSol(strWlaJM, zZuWLRA, C33129mqd.gEmmrt(defiPlatformInfoOxVOHk != null ? defiPlatformInfoOxVOHk.getMevUnstableShowLevel() : null), zLjUOn().ORxRYg());
                return;
            }
            C25330iug c25330iugKWHzl4 = c25265itUZsXlph.KWHzl();
            String strQCjLjM = zLjUOn().QCjLjM();
            boolean zDmq = zLjUOn().Dmq();
            DefiPlatformInfo defiPlatformInfoOxVOHk2 = zLjUOn().OxVOHk();
            c25330iugKWHzl4.setMevDisplayForEVM(strQCjLjM, zDmq, C33129mqd.gEmmrt(defiPlatformInfoOxVOHk2 != null ? defiPlatformInfoOxVOHk2.getMevUnstableShowLevel() : null), zLjUOn().ORxRYg());
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        LiveData<C22400hee> liveDataEZpvd;
        zLjUOn().gasjUx();
        zLjUOn().gkJEwt();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                MemeMarketStrategyV6Fragment.valueOf(this.AEQbTJ, z);
            }
        });
        C25390ivn.collectOnViewLifecycle$default(this, getNewProxyInstance().OLrzqt(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, new Dialog(getNewProxyInstance().AEQbTJ()), null, LoaderManager.OLrzqt, 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, getNewProxyInstance().copydefault(), null, new VoiceInteractor(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, zLjUOn().ffGIBT(), null, new AssistContent(), 2, null);
        accept().isConnected().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AYXKKw(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().RdAHlO().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.gEmmrt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().USBtdM().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.KWHzl(this.KWHzl, (V6QuoteResponseData) obj);
            }
        }));
        zLjUOn().OBJEWx().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AEQbTJ(this.KWHzl, (MemeModeQuoteErrorBean) obj);
            }
        }));
        C24375ice c24375iceAuCTel = AuCTel();
        if (c24375iceAuCTel != null) {
            Function1<? super SwapState, Unit> function1 = new Function1() { // from class: o.lnM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.EZpvd(this.EZpvd, (SwapState) obj);
                }
            };
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c24375iceAuCTel.EZpvd(function1, childFragmentManager, AxsJAYsNCnLh());
        }
        C24375ice c24375iceAuCTel2 = AuCTel();
        if (c24375iceAuCTel2 != null) {
            c24375iceAuCTel2.EZpvd(new Function0() { // from class: o.lnR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeMarketStrategyV6Fragment.RlQdEF(this.OLrzqt);
                }
            });
        }
        accept().fetchVPNInfo().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.KWHzl(this.copydefault, (TransactionType) obj);
            }
        }));
        accept().DbNXlk().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.copydefault(this.OLrzqt, (MpcWalletService.MpcWalletAbleStatus) obj);
            }
        }));
        uzCIH().EZpvd().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AEQbTJ(this.KWHzl, (kXY) obj);
            }
        }));
        zLjUOn().dHguZz().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AhwBna(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        accept().hDKMBd().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.AEQbTJ(this.KWHzl, (com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState) obj);
            }
        }));
        zLjUOn().KWHzl().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.KWHzl(this.copydefault, (kXY) obj);
            }
        }));
        LiveData<Boolean> liveDataDNCPSb = zLjUOn().dNCPSb();
        if (liveDataDNCPSb != null) {
            liveDataDNCPSb.observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.djBIcL(this.copydefault, (java.lang.Boolean) obj);
                }
            }));
        }
        zLjUOn().QkdxfA().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.copydefault(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
        MemeTransactionViewModel memeTransactionViewModelUzCIH = uzCIH();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        new C30917lkG(abstractC28352kYfZLjUOn, memeTransactionViewModelUzCIH, viewLifecycleOwner).copydefault(RlQdEF(), iwGUEr(), new Function0() { // from class: o.lnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.DAIeex(this.EZpvd);
            }
        }, new yHO() { // from class: o.lnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return MemeMarketStrategyV6Fragment.KWHzl(this.AEQbTJ, (DexMultiTokenInfoBean) obj, ((java.lang.Integer) obj2).intValue(), (java.lang.String) obj3);
            }
        }, new Function0() { // from class: o.lnD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return MemeMarketStrategyV6Fragment.AhwBna();
            }
        });
        zLjUOn().QfsBiF().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.valueOf(this.EZpvd, (java.lang.String) obj);
            }
        }));
        zLjUOn().OqFWZa().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeMarketStrategyV6Fragment.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        DexHomeViewModel dexHomeViewModelIRxXKY = iRxXKY();
        if (dexHomeViewModelIRxXKY != null && (liveDataEZpvd = dexHomeViewModelIRxXKY.EZpvd()) != null) {
            liveDataEZpvd.observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.lnG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.copydefault(this.EZpvd, (C22400hee) obj);
                }
            }));
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass27(null), 3, null);
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) && RlQdEF() == TransactionType.Sell) {
            AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C30922lkL.class, new String[0]);
            final Function1 function12 = new Function1() { // from class: o.lnE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.copydefault(this.AEQbTJ, (C30922lkL) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lnI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeMarketStrategyV6Fragment.OLrzqt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.lnF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.OLrzqt((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lnL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    MemeMarketStrategyV6Fragment.KWHzl(function13, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            yBK.EZpvd(interfaceC58217yxCAEQbTJ, gasjUx());
        }
    }

    public static final void valueOf(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z) {
        AbstractC31124loB abstractC31124loBZuBGHE;
        C55001xbh c55001xbhEZpvd;
        if (z || (abstractC31124loBZuBGHE = memeMarketStrategyV6Fragment.zuBGHE()) == null || (c55001xbhEZpvd = abstractC31124loBZuBGHE.EZpvd()) == null) {
            return;
        }
        c55001xbhEZpvd.clearFocus();
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return KWHzl(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                MemeMarketStrategyV6Fragment.this.showLoading();
            } else {
                MemeMarketStrategyV6Fragment.this.dismissLoading();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        public static final LoaderManager<T> OLrzqt = new LoaderManager<>();

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final class VoiceInteractor<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(SignAndBroadcastRes signAndBroadcastRes, Continuation<? super Unit> continuation) {
            AbstractC31124loB abstractC31124loBZuBGHE = MemeMarketStrategyV6Fragment.this.zuBGHE();
            if (abstractC31124loBZuBGHE != null && !abstractC31124loBZuBGHE.KWHzl()) {
                AbstractC31124loB abstractC31124loBZuBGHE2 = MemeMarketStrategyV6Fragment.this.zuBGHE();
                if (abstractC31124loBZuBGHE2 != null) {
                    abstractC31124loBZuBGHE2.setInputEditText("");
                }
                MemeMarketStrategyV6Fragment.this.dxcTrN();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            MemeMarketStrategyV6Fragment.this.DXXBbs();
            return Unit.INSTANCE;
        }
    }

    public static final Unit AYXKKw(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Boolean bool) {
        memeMarketStrategyV6Fragment.fARcdN();
        AbstractC28352kYf.refreshQuote$default(memeMarketStrategyV6Fragment.zLjUOn(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Boolean bool) {
        if (bool.booleanValue()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - memeMarketStrategyV6Fragment.AuCTel;
            long j = jCurrentTimeMillis < 500 ? 500 - jCurrentTimeMillis : 0L;
            C25325iub c25325iubGHZMYf = memeMarketStrategyV6Fragment.gHZMYf();
            if (c25325iubGHZMYf != null) {
                c25325iubGHZMYf.copydefault(j);
            }
            C24453ieC c24453ieCAuCTelauCTel = memeMarketStrategyV6Fragment.AuCTelauCTel();
            if (c24453ieCAuCTelauCTel != null) {
                c24453ieCAuCTelauCTel.copydefault(j);
            }
            C25324iua c25324iuaHDKMBd = memeMarketStrategyV6Fragment.hDKMBd();
            if (c25324iuaHDKMBd != null) {
                c25324iuaHDKMBd.OLrzqt(j);
            }
        } else {
            memeMarketStrategyV6Fragment.fZBcTu();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, V6QuoteResponseData v6QuoteResponseData) {
        C25330iug c25330iugKWHzl;
        Integer offlineType;
        AutoSlippageInfo autoSlippageInfo;
        if (v6QuoteResponseData == null) {
            return Unit.INSTANCE;
        }
        memeMarketStrategyV6Fragment.sSMYrx();
        DefiPlatformInfo selectedDeFiPlatform = v6QuoteResponseData.getSelectedDeFiPlatform();
        String autoSlippage = (selectedDeFiPlatform == null || (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getAutoSlippage();
        if (autoSlippage == null) {
            autoSlippage = "";
        }
        memeMarketStrategyV6Fragment.values(v6QuoteResponseData);
        memeMarketStrategyV6Fragment.QOLQEE();
        memeMarketStrategyV6Fragment.valueOf(v6QuoteResponseData);
        memeMarketStrategyV6Fragment.copydefault(autoSlippage);
        updateReminderView$default(memeMarketStrategyV6Fragment, v6QuoteResponseData, null, null, 6, null);
        DefiPlatformInfo selectedDeFiPlatform2 = v6QuoteResponseData.getSelectedDeFiPlatform();
        boolean z = (selectedDeFiPlatform2 == null || (offlineType = selectedDeFiPlatform2.getOfflineType()) == null || offlineType.intValue() != 1) ? false : true;
        C25265itU c25265itUZsXlph = memeMarketStrategyV6Fragment.zsXlph();
        if (c25265itUZsXlph != null && (c25330iugKWHzl = c25265itUZsXlph.KWHzl()) != null) {
            c25330iugKWHzl.setVisibility(z ^ true ? 0 : 8);
        }
        memeMarketStrategyV6Fragment.AhwBna(v6QuoteResponseData);
        memeMarketStrategyV6Fragment.flVtFt();
        memeMarketStrategyV6Fragment.AYXKKw(v6QuoteResponseData);
        memeMarketStrategyV6Fragment.fFgQHt();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) memeMarketStrategyV6Fragment, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, MemeModeQuoteErrorBean memeModeQuoteErrorBean) {
        if (Intrinsics.EZpvd(memeModeQuoteErrorBean, MemeModeQuoteErrorBean.Companion.copydefault())) {
            return Unit.INSTANCE;
        }
        memeMarketStrategyV6Fragment.AxsJAY();
        Intrinsics.copydefault(memeModeQuoteErrorBean);
        updateReminderView$default(memeMarketStrategyV6Fragment, null, memeMarketStrategyV6Fragment.EZpvd(memeModeQuoteErrorBean), null, 4, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) memeMarketStrategyV6Fragment, false, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        C31171low c31171low = memeMarketStrategyV6Fragment.AwvSrB;
        if (c31171low != null) {
            c31171low.copydefault(swapState);
        }
        return Unit.INSTANCE;
    }

    public static final Unit RlQdEF(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        CommonDexInfo commonDexInfo;
        DefiPlatformInfo selectedDeFiPlatform;
        V6QuoteResponseData value = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
        if (value != null && (commonDexInfo = value.getCommonDexInfo()) != null && commonDexInfo.getFromToken() != null && commonDexInfo.getToToken() != null) {
            AbstractC28352kYf abstractC28352kYfZLjUOn = memeMarketStrategyV6Fragment.zLjUOn();
            String chainId = memeMarketStrategyV6Fragment.iwGUEr().getChainId();
            String tokenContractAddress = commonDexInfo.getFromToken().getTokenContractAddress();
            String tokenContractAddress2 = commonDexInfo.getToToken().getTokenContractAddress();
            String decimals = commonDexInfo.getFromToken().getDecimals();
            SwapState swapState = Intrinsics.EZpvd(memeMarketStrategyV6Fragment.zLjUOn().OqFWZa().getValue(), Boolean.TRUE) ? SwapState.APPROVED_AND_NEED_CANCEL_APPROVE : SwapState.APPROVE;
            String fromTokenAmount = commonDexInfo.getFromTokenAmount();
            String str = fromTokenAmount == null ? "" : fromTokenAmount;
            TradeStatePool tradeStatePoolAuCTel = memeMarketStrategyV6Fragment.zLjUOn().AuCTel();
            V6QuoteResponseData value2 = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
            String defiPlatformId = (value2 == null || (selectedDeFiPlatform = value2.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform.getDefiPlatformId();
            abstractC28352kYfZLjUOn.OLrzqt(chainId, tokenContractAddress, tokenContractAddress2, decimals, memeMarketStrategyV6Fragment, swapState, str, tradeStatePoolAuCTel, defiPlatformId == null ? "" : defiPlatformId);
        }
        memeMarketStrategyV6Fragment.zLjUOn().AEQbTJ(EventTrackSubmitType.APPROVE.getType(), memeMarketStrategyV6Fragment.RlQdEF(), C25444iwo.EZpvd(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), C25444iwo.AEQbTJ(C31125loC.KWHzl(memeMarketStrategyV6Fragment)), C56423yEv.EZpvd(C56390yDp.OLrzqt("popup_source", MemeQuickPopUpSource.Companion.EZpvd().getSource())));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, TransactionType transactionType) {
        C24375ice c24375iceAuCTel;
        InterfaceC28268kVc second;
        InterfaceC28268kVc first;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        CommonDexInfo commonDexInfo2;
        DexMultiTokenInfoBean fromToken2;
        boolean zIsMainChainCoin = false;
        if (transactionType == memeMarketStrategyV6Fragment.RlQdEF()) {
            if (C23313hvq.OLrzqt(memeMarketStrategyV6Fragment.zLjUOn().zsXlph(), 0)) {
                memeMarketStrategyV6Fragment.zLjUOn().RdAHlO().setValue(Boolean.TRUE);
            }
            memeMarketStrategyV6Fragment.fARcdN();
        } else {
            memeMarketStrategyV6Fragment.zLjUOn().QbewEr();
        }
        if (transactionType == TransactionType.Sell) {
            memeMarketStrategyV6Fragment.OLrzqt(memeMarketStrategyV6Fragment.zLjUOn().copydefault(memeMarketStrategyV6Fragment.iwGUEr().getChainId(), memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress()));
            if (memeMarketStrategyV6Fragment.fetchVPNInfo) {
                memeMarketStrategyV6Fragment.uzCIH().OLrzqt().setValue(Integer.valueOf(transactionType.getType()));
            }
        } else {
            memeMarketStrategyV6Fragment.uzCIH().OLrzqt().setValue(Integer.valueOf(transactionType.getType()));
        }
        if (memeMarketStrategyV6Fragment.accept().AuCTel().getValue().booleanValue()) {
            String strOLrzqt = null;
            updateReminderView$default(memeMarketStrategyV6Fragment, null, null, null, 7, null);
            V6QuoteResponseData value = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
            String tokenContractAddress = (value == null || (commonDexInfo2 = value.getCommonDexInfo()) == null || (fromToken2 = commonDexInfo2.getFromToken()) == null) ? null : fromToken2.getTokenContractAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            if (value != null && (commonDexInfo = value.getCommonDexInfo()) != null && (fromToken = commonDexInfo.getFromToken()) != null) {
                zIsMainChainCoin = fromToken.isMainChainCoin();
            }
            String chainId = memeMarketStrategyV6Fragment.iwGUEr().getChainId();
            SwapState value2 = memeMarketStrategyV6Fragment.zLjUOn().AuCTel().getCurrentState().getValue();
            if (value2 != null && (c24375iceAuCTel = memeMarketStrategyV6Fragment.AuCTel()) != null) {
                SwapState swapStateIsButtonStateInterception = value2.isButtonStateInterception(!memeMarketStrategyV6Fragment.zLjUOn().AhwBna(memeMarketStrategyV6Fragment.iwGUEr().getChainId()), memeMarketStrategyV6Fragment.zLjUOn().values(memeMarketStrategyV6Fragment.iwGUEr().getChainId()));
                Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = memeMarketStrategyV6Fragment.zLjUOn().DCUTEI();
                String strOLrzqt2 = (pairDCUTEI == null || (first = pairDCUTEI.getFirst()) == null) ? null : first.OLrzqt();
                String str = strOLrzqt2 == null ? "" : strOLrzqt2;
                Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI2 = memeMarketStrategyV6Fragment.zLjUOn().DCUTEI();
                if (pairDCUTEI2 != null && (second = pairDCUTEI2.getSecond()) != null) {
                    strOLrzqt = second.OLrzqt();
                }
                c24375iceAuCTel.m8626setTradeStateButtonrh5Nn64(swapStateIsButtonStateInterception, str, strOLrzqt == null ? "" : strOLrzqt, memeMarketStrategyV6Fragment.RlQdEF(), memeMarketStrategyV6Fragment.fvQaOB(), false, false, (768 & 128) != 0 ? C31172lox.Companion.KWHzl() : C31172lox.Companion.OLrzqt(), (768 & 256) != 0 ? null : null, (768 & 512) != 0 ? null : null, memeMarketStrategyV6Fragment.copydefault(tokenContractAddress, chainId, zIsMainChainCoin));
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        memeMarketStrategyV6Fragment.zLjUOn().EZpvd(mpcWalletAbleStatus);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, kXY kxy) {
        memeMarketStrategyV6Fragment.zLjUOn().KWHzl().setValue(kxy);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Boolean bool) {
        if (bool.booleanValue()) {
            C55113xdn c55113xdnGkJEwt = memeMarketStrategyV6Fragment.gkJEwt();
            if (c55113xdnGkJEwt != null) {
                C55113xdn.showLoading$default(c55113xdnGkJEwt, 0L, 1, null);
            }
        } else {
            C55113xdn c55113xdnGkJEwt2 = memeMarketStrategyV6Fragment.gkJEwt();
            if (c55113xdnGkJEwt2 != null) {
                c55113xdnGkJEwt2.copydefault();
            }
        }
        if (C31172lox.KWHzl(C31125loC.KWHzl(memeMarketStrategyV6Fragment), C31172lox.Companion.OLrzqt())) {
            Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C33054mpH.OLrzqt(contextRequireContext, memeMarketStrategyV6Fragment.getView());
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState swapState) {
        memeMarketStrategyV6Fragment.fARcdN();
        memeMarketStrategyV6Fragment.zLjUOn().AuCTel().initCheckStep();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, kXY kxy) {
        if (memeMarketStrategyV6Fragment.RlQdEF() == TransactionType.Buy) {
            memeMarketStrategyV6Fragment.zLjUOn().DAIeex();
        } else {
            memeMarketStrategyV6Fragment.zLjUOn().AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Boolean bool) {
        DefiPlatformInfo selectedDeFiPlatform;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanODXsMY = memeMarketStrategyV6Fragment.zLjUOn().ODXsMY();
        if (dexMultiTokenInfoBeanODXsMY != null) {
            pUU.copydefault("approveStateLiveData", "state: >>>>>>>>>>>>>>>>>>>执行了" + memeMarketStrategyV6Fragment.RlQdEF().getType());
            AbstractC28352kYf abstractC28352kYfZLjUOn = memeMarketStrategyV6Fragment.zLjUOn();
            String chainId = dexMultiTokenInfoBeanODXsMY.getChainId();
            String tokenContractAddress = dexMultiTokenInfoBeanODXsMY.getTokenContractAddress();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanHrNTAI = memeMarketStrategyV6Fragment.zLjUOn().hrNTAI();
            String defiPlatformId = null;
            String tokenContractAddress2 = dexMultiTokenInfoBeanHrNTAI != null ? dexMultiTokenInfoBeanHrNTAI.getTokenContractAddress() : null;
            if (tokenContractAddress2 == null) {
                tokenContractAddress2 = "";
            }
            String decimals = dexMultiTokenInfoBeanODXsMY.getDecimals();
            String strZsXlph = memeMarketStrategyV6Fragment.zLjUOn().zsXlph();
            TradeStatePool tradeStatePoolAuCTel = memeMarketStrategyV6Fragment.zLjUOn().AuCTel();
            V6QuoteResponseData value = memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue();
            if (value != null && (selectedDeFiPlatform = value.getSelectedDeFiPlatform()) != null) {
                defiPlatformId = selectedDeFiPlatform.getDefiPlatformId();
            }
            abstractC28352kYfZLjUOn.EZpvd(chainId, tokenContractAddress, tokenContractAddress2, decimals, strZsXlph, tradeStatePoolAuCTel, defiPlatformId == null ? "" : defiPlatformId);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Pair pair) {
        String str = (String) pair.getFirst();
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            C31153loe c31153loe = null;
            if (iHashCode != 46730318) {
                if (iHashCode == 1223485535 && str.equals("1000005555")) {
                    C31153loe c31153loe2 = memeMarketStrategyV6Fragment.values;
                    if (c31153loe2 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        c31153loe = c31153loe2;
                    }
                    c31153loe.EZpvd((String) pair.getSecond());
                } else {
                    C55326xho.toast$default((String) pair.getSecond(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                }
            } else if (str.equals("10052")) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = memeMarketStrategyV6Fragment.zLjUOn().valueOf(memeMarketStrategyV6Fragment.iwGUEr().getChainId());
                C31153loe c31153loe3 = memeMarketStrategyV6Fragment.values;
                if (c31153loe3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    c31153loe = c31153loe3;
                }
                c31153loe.OLrzqt(dexMultiTokenInfoBeanValueOf.isMainChainCoin() ? "" : dexMultiTokenInfoBeanValueOf.getTokenContractAddress(), dexMultiTokenInfoBeanValueOf.getTokenSymbol());
            }
        } else if (str.equals("0")) {
            AbstractC31124loB abstractC31124loBZuBGHE = memeMarketStrategyV6Fragment.zuBGHE();
            if (abstractC31124loBZuBGHE != null && !abstractC31124loBZuBGHE.KWHzl()) {
                AbstractC31124loB abstractC31124loBZuBGHE2 = memeMarketStrategyV6Fragment.zuBGHE();
                if (abstractC31124loBZuBGHE2 != null) {
                    abstractC31124loBZuBGHE2.setInputEditText("");
                }
                memeMarketStrategyV6Fragment.dxcTrN();
                memeMarketStrategyV6Fragment.zLjUOn().DCUTEIddSDPG();
            } else {
                memeMarketStrategyV6Fragment.zLjUOn().WS();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DAIeex(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment) {
        memeMarketStrategyV6Fragment.QfsBiF();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        memeMarketStrategyV6Fragment.AEQbTJ(dexMultiTokenInfoBean, i, str);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str) {
        Intrinsics.copydefault((Object) str);
        memeMarketStrategyV6Fragment.copydefault(new MemeSelectionActivityResultContract.Output(str));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, Boolean bool) {
        updateReminderView$default(memeMarketStrategyV6Fragment, memeMarketStrategyV6Fragment.zLjUOn().USBtdM().getValue(), null, null, 6, null);
        if (bool.booleanValue()) {
            memeMarketStrategyV6Fragment.AEQbTJ(true, SwapState.APPROVED_AND_NEED_CANCEL_APPROVE);
        } else if (C24695iig.AEQbTJ(memeMarketStrategyV6Fragment.fIwbmz().KWHzl(), true).AEQbTJ() > 0) {
            memeMarketStrategyV6Fragment.AEQbTJ(false, SwapState.APPROVE_SUCCESS);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, C22400hee c22400hee) {
        if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_Click")) {
            AbstractC28336kXq.trackDexTradeHomeFullPageClick$default(memeMarketStrategyV6Fragment.zLjUOn(), c22400hee.KWHzl(), null, C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", c22400hee.AEQbTJ()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, c22400hee.copydefault()), C56390yDp.OLrzqt("popup_source", memeMarketStrategyV6Fragment.accept().AEQbTJ(C31125loC.KWHzl(memeMarketStrategyV6Fragment)))), null, 10, null);
        } else {
            AbstractC28336kXq.trackDexTradeHomeFullPageView$default(memeMarketStrategyV6Fragment.zLjUOn(), memeMarketStrategyV6Fragment.iwGUEr().getChainId(), memeMarketStrategyV6Fragment.RlQdEF(), c22400hee.KWHzl(), null, null, null, 56, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment$setListener$27, reason: invalid class name */
    public static final class AnonymousClass27 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass27(Continuation<? super AnonymousClass27> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MemeMarketStrategyV6Fragment.this.new AnonymousClass27(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass27) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Unit> sharedFlowODWQjV = MemeMarketStrategyV6Fragment.this.zLjUOn().ODWQjV();
                final MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment = MemeMarketStrategyV6Fragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.ui.meme.strategy.MemeMarketStrategyV6Fragment.setListener.27.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        Context contextRequireContext = memeMarketStrategyV6Fragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                        C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 4, null);
                        c55097xdX.setState(1);
                        String string = memeMarketStrategyV6Fragment.requireContext().getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi26);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        c55097xdX.setTitle(string);
                        Drawable drawable = ContextCompat.getDrawable(memeMarketStrategyV6Fragment.requireContext(), C52761wXj.TaskDescription.RXzakW);
                        if (drawable != null) {
                            drawable.setTint(ContextCompat.getColor(memeMarketStrategyV6Fragment.requireContext(), C52761wXj.Activity.fdOvFl));
                        } else {
                            drawable = null;
                        }
                        c55097xdX.setLeadingIcon(drawable);
                        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowODWQjV.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, C30922lkL c30922lkL) {
        if (Intrinsics.EZpvd((Object) c30922lkL.KWHzl().getChainId(), (Object) memeMarketStrategyV6Fragment.iwGUEr().getChainId()) && !Intrinsics.EZpvd((Object) c30922lkL.KWHzl().getTokenContractAddress(), (Object) memeMarketStrategyV6Fragment.iwGUEr().getTokenContractAddress())) {
            memeMarketStrategyV6Fragment.copydefault(c30922lkL.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public final Map<String, String> dvKsVJ() {
        if (ejfBZ().EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator) {
            AbstractC30510lcX value = ejfBZ().EZpvd().getValue();
            Intrinsics.copydefault(value, "");
            Pair pairOLrzqt = C56390yDp.OLrzqt("tp", C30501lcO.copydefault(((AbstractC30510lcX.StateListAnimator) value).AEQbTJ()));
            AbstractC30510lcX value2 = ejfBZ().EZpvd().getValue();
            Intrinsics.copydefault(value2, "");
            return C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("sl", C30501lcO.AEQbTJ(((AbstractC30510lcX.StateListAnimator) value2).AEQbTJ())));
        }
        return C56424yEw.KWHzl();
    }

    public final void fZBcTu() {
        C25265itU c25265itUZsXlph = zsXlph();
        if (c25265itUZsXlph != null) {
            c25265itUZsXlph.EZpvd();
        }
        C25325iub c25325iubGHZMYf = gHZMYf();
        if (c25325iubGHZMYf != null) {
            c25325iubGHZMYf.gEmmrt();
        }
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            c24453ieCAuCTelauCTel.gEmmrt();
        }
        C25324iua c25324iuaHDKMBd = hDKMBd();
        if (c25324iuaHDKMBd != null) {
            c25324iuaHDKMBd.AhwBna();
        }
    }

    private final void copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C22380heK.OLrzqt.copydefault(fIwbmz().KWHzl()).EZpvd(true).gEmmrt().AEQbTJ();
        zLjUOn().gEmmrt(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
        OLrzqt(dexMultiTokenInfoBean);
        kVW.EZpvd.OLrzqt(fIwbmz().KWHzl(), RlQdEF(), iwGUEr(), zLjUOn().copydefault(iwGUEr().getChainId(), iwGUEr().getTokenContractAddress()), C31125loC.KWHzl(this));
        AbstractC28352kYf.refreshQuote$default(zLjUOn(), false, 1, null);
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, int i, String str) {
        C55001xbh c55001xbhEZpvd;
        C55001xbh c55001xbhEZpvd2;
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
            String chainId = iwGUEr().getChainId();
            String tokenContractAddress = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenContractAddress() : null;
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            abstractC31124loBZuBGHE.setLevelValue(abstractC28352kYfZLjUOn.OLrzqt(chainId, tokenContractAddress), zLjUOn().AEQbTJ(iwGUEr().getChainId()), RlQdEF());
        }
        AbstractC31124loB abstractC31124loBZuBGHE2 = zuBGHE();
        if (abstractC31124loBZuBGHE2 != null) {
            abstractC31124loBZuBGHE2.OLrzqt(i);
        }
        if (i == 3) {
            AbstractC31124loB abstractC31124loBZuBGHE3 = zuBGHE();
            if (abstractC31124loBZuBGHE3 == null || (c55001xbhEZpvd2 = abstractC31124loBZuBGHE3.EZpvd()) == null) {
                return;
            }
            c55001xbhEZpvd2.setText(str);
            return;
        }
        AbstractC31124loB abstractC31124loBZuBGHE4 = zuBGHE();
        if (abstractC31124loBZuBGHE4 == null || (c55001xbhEZpvd = abstractC31124loBZuBGHE4.EZpvd()) == null) {
            return;
        }
        c55001xbhEZpvd.setText("");
    }

    public final void AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, SwapState swapState) {
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        CommonDexInfo commonDexInfo2;
        DexMultiTokenInfoBean fromToken2;
        C30567ldb c30567ldb;
        V6QuoteResponseData value = zLjUOn().USBtdM().getValue();
        C21491hBi c21491hBi = this.AYXKKw;
        boolean zIsMainChainCoin = false;
        SwapState swapState2 = (value == null || value.isOKXPlatform() || !((c21491hBi == null || (c30567ldb = c21491hBi.AEQbTJ) == null) ? false : c30567ldb.copydefault())) ? swapState : SwapState.NoSupportTPLS;
        C24375ice c24375iceAuCTel = AuCTel();
        if (c24375iceAuCTel != null) {
            String strAEQbTJ = AEQbTJ(v6BaseQuoteResponse);
            String strKWHzl = KWHzl(v6BaseQuoteResponse);
            if (v6BaseQuoteResponse != null && (commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo()) != null && (fromToken2 = commonDexInfo2.getFromToken()) != null) {
                zIsMainChainCoin = fromToken2.isMainChainCoin();
            }
            String chainId = iwGUEr().getChainId();
            String tokenContractAddress = (v6BaseQuoteResponse == null || (commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo()) == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getTokenContractAddress();
            if (tokenContractAddress == null) {
                tokenContractAddress = "";
            }
            c24375iceAuCTel.m8626setTradeStateButtonrh5Nn64(swapState2.isButtonStateInterception(!zLjUOn().AhwBna(iwGUEr().getChainId()), zLjUOn().values(iwGUEr().getChainId())), strAEQbTJ, strKWHzl, RlQdEF(), fvQaOB(), false, false, C31172lox.Companion.OLrzqt(), copydefault(v6BaseQuoteResponse), EZpvd(v6BaseQuoteResponse), copydefault(tokenContractAddress, chainId, zIsMainChainCoin));
        }
    }

    public final void valueOf(V6BaseQuoteResponse v6BaseQuoteResponse) {
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        CommonDexInfo commonDexInfo2;
        DexMultiTokenInfoBean fromToken2;
        C24375ice c24375iceAuCTel = AuCTel();
        if (c24375iceAuCTel == null) {
            return;
        }
        String strAEQbTJ = AEQbTJ(v6BaseQuoteResponse);
        String strKWHzl = KWHzl(v6BaseQuoteResponse);
        boolean zIsMainChainCoin = (v6BaseQuoteResponse == null || (commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo()) == null || (fromToken2 = commonDexInfo2.getFromToken()) == null) ? false : fromToken2.isMainChainCoin();
        String chainId = iwGUEr().getChainId();
        String tokenContractAddress = (v6BaseQuoteResponse == null || (commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo()) == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getTokenContractAddress();
        if (tokenContractAddress == null) {
            tokenContractAddress = "";
        }
        c24375iceAuCTel.m8628setTradeStateButtonQuoteInfokY7h8eo(strAEQbTJ, strKWHzl, RlQdEF(), fvQaOB(), false, false, C31172lox.Companion.OLrzqt(), copydefault(v6BaseQuoteResponse), EZpvd(v6BaseQuoteResponse), copydefault(tokenContractAddress, chainId, zIsMainChainCoin));
    }

    public final boolean fvQaOB() {
        return !(zLjUOn().AuCTel().getCurrentState().getValue() == SwapState.STAND_BY_LEVERAGE_WARNING || zLjUOn().AuCTel().getCurrentState().getValue() == SwapState.STAND_BY_DISH_WARNING) || (RlQdEF() == TransactionType.Sell && C23313hvq.OLrzqt(zLjUOn().zsXlph(), 0) && zLjUOn().AhwBna(iwGUEr().getChainId()));
    }

    public final boolean copydefault(String str, String str2, boolean z) {
        if (z) {
            str = "";
        }
        return C22380heK.OLrzqt.copydefault("default_trade").fARcdN().copydefault(str, C33129mqd.valueOf(str2));
    }

    public final String EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse) {
        DefiPlatformInfo selectedDeFiPlatform;
        String toTokenValue;
        return (v6BaseQuoteResponse == null || (selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform()) == null || (toTokenValue = selectedDeFiPlatform.getToTokenValue()) == null) ? "" : toTokenValue;
    }

    public final String copydefault(V6BaseQuoteResponse v6BaseQuoteResponse) {
        DefiPlatformInfo selectedDeFiPlatform;
        String receiveAmount;
        return (v6BaseQuoteResponse == null || (selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform()) == null || (receiveAmount = selectedDeFiPlatform.getReceiveAmount()) == null) ? "" : receiveAmount;
    }

    public final String KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse) {
        InterfaceC28268kVc second;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean toToken;
        String tokenSymbol;
        if (v6BaseQuoteResponse != null && (commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo()) != null && (toToken = commonDexInfo.getToToken()) != null && (tokenSymbol = toToken.getTokenSymbol()) != null) {
            return tokenSymbol;
        }
        Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = zLjUOn().DCUTEI();
        String strOLrzqt = (pairDCUTEI == null || (second = pairDCUTEI.getSecond()) == null) ? null : second.OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public final String AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse) {
        InterfaceC28268kVc first;
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        String tokenSymbol;
        if (v6BaseQuoteResponse != null && (commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo()) != null && (fromToken = commonDexInfo.getFromToken()) != null && (tokenSymbol = fromToken.getTokenSymbol()) != null) {
            return tokenSymbol;
        }
        Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = zLjUOn().DCUTEI();
        String strOLrzqt = (pairDCUTEI == null || (first = pairDCUTEI.getFirst()) == null) ? null : first.OLrzqt();
        return strOLrzqt == null ? "" : strOLrzqt;
    }

    public static /* synthetic */ void setViewsInvalidState$default(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z, SwapState swapState, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setViewsInvalidState");
        }
        if ((i & 2) != 0) {
            swapState = null;
        }
        memeMarketStrategyV6Fragment.AEQbTJ(z, swapState);
    }

    public final void AEQbTJ(boolean z, SwapState swapState) {
        C24453ieC c24453ieCAuCTelauCTel;
        C31170lov c31170lov = this.gHZMYf;
        if (c31170lov == null) {
            Intrinsics.gEmmrt("");
            c31170lov = null;
        }
        c31170lov.KWHzl(z, swapState);
        if (!z || (c24453ieCAuCTelauCTel = AuCTelauCTel()) == null) {
            return;
        }
        c24453ieCAuCTelauCTel.setVisibility(8);
    }

    public final void flVtFt() {
        boolean z = zLjUOn().USBtdM().getValue() != null;
        C24453ieC c24453ieCAuCTelauCTel = AuCTelauCTel();
        if (c24453ieCAuCTelauCTel != null) {
            c24453ieCAuCTelauCTel.setVisibility(z ? 0 : 8);
        }
        if (!z) {
            C25324iua c25324iuaHDKMBd = hDKMBd();
            if (c25324iuaHDKMBd != null) {
                c25324iuaHDKMBd.setVisibility(8);
                return;
            }
            return;
        }
        C25324iua c25324iuaHDKMBd2 = hDKMBd();
        if (c25324iuaHDKMBd2 != null) {
            C24453ieC c24453ieCAuCTelauCTel2 = AuCTelauCTel();
            c25324iuaHDKMBd2.setVisibility((c24453ieCAuCTelauCTel2 == null || !c24453ieCAuCTelauCTel2.EZpvd()) ? 8 : 0);
        }
    }

    public final void finit() {
        InterfaceC9738bbJ interfaceC9738bbJDUDNAs;
        V6QuoteResponseData value = zLjUOn().USBtdM().getValue();
        C31153loe c31153loe = null;
        if ((value != null ? value.getCommonDexInfo() : null) == null) {
            C55326xho.toast$default(C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (!zLjUOn().igXuih() && (interfaceC9738bbJDUDNAs = zLjUOn().dUDNAs()) != null) {
            FragmentActivity activity = getActivity();
            AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
            if (abstractActivityC33041mov != null) {
                String strKWHzl = fIwbmz().KWHzl();
                androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                C31205lpd.AEQbTJ(abstractActivityC33041mov, strKWHzl, parentFragmentManager, interfaceC9738bbJDUDNAs);
            }
        }
        C31153loe c31153loe2 = this.values;
        if (c31153loe2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c31153loe = c31153loe2;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        c31153loe.KWHzl(contextRequireContext, zLjUOn().USBtdM().getValue(), new MemeMarketStrategyV6Fragment$submitOrder$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C28109kPf AxsJAYsNCnLh() {
        String strEZpvd = zLjUOn().EZpvd();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanODXsMY = zLjUOn().ODXsMY();
        String chainName = dexMultiTokenInfoBeanODXsMY != null ? dexMultiTokenInfoBeanODXsMY.getChainName() : null;
        if (chainName == null) {
            chainName = "";
        }
        return new C28109kPf(strEZpvd, chainName, TabTitleInfo.KEY_MEME, "swap", "", getNewProxyInstance().copydefault(zLjUOn().EZpvd()));
    }

    public static /* synthetic */ void startSubmitOrder$default(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startSubmitOrder");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        memeMarketStrategyV6Fragment.EZpvd(str);
    }

    public final void EZpvd(String str) {
        V6QuoteResponseData value = zLjUOn().USBtdM().getValue();
        if (value == null) {
            return;
        }
        zLjUOn().accept();
        if (djBIcL(value)) {
            gEmmrt(value);
        } else {
            KWHzl(str);
        }
    }

    public final boolean djBIcL(V6BaseQuoteResponse v6BaseQuoteResponse) {
        V6CalldataResponseData transactionData;
        if (getNewProxyInstance().copydefault(iwGUEr().getChainId()) && v6BaseQuoteResponse.isOKXPlatform()) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (((selectedDeFiPlatform == null || (transactionData = selectedDeFiPlatform.getTransactionData()) == null) ? null : transactionData.getApproveTxInfo()) == null && ((ejfBZ().EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator) || !C22416heu.AuCTel())) {
                return true;
            }
        }
        return false;
    }

    public final void gEmmrt(V6BaseQuoteResponse v6BaseQuoteResponse) {
        TeeMarketPlaceOrderParams teeMarketPlaceOrderParamsOLrzqt = OLrzqt(v6BaseQuoteResponse);
        if (teeMarketPlaceOrderParamsOLrzqt == null) {
            return;
        }
        QuickMarketPlaceOrderViewModel newProxyInstance = getNewProxyInstance();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        QuickMarketPlaceOrderViewModel.submitPlaceOrderV6$default(newProxyInstance, teeMarketPlaceOrderParamsOLrzqt, fragmentActivityRequireActivity, hUfVAv(), false, 8, null);
    }

    public final TeeMarketPlaceOrderParams OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse) {
        PlaceOrderParams placeOrderParamsDmfpNf = zLjUOn().dmfpNf();
        AbstractC30510lcX value = ejfBZ().EZpvd().getValue();
        AbstractC30510lcX.StateListAnimator stateListAnimator = value instanceof AbstractC30510lcX.StateListAnimator ? (AbstractC30510lcX.StateListAnimator) value : null;
        List<AdvancedAutoSellStrategy> listAEQbTJ = stateListAnimator != null ? stateListAnimator.AEQbTJ() : null;
        List<String> value2 = zLjUOn().RKDWNf().getValue();
        String strAEQbTJ = getNewProxyInstance().AEQbTJ(iwGUEr().getChainId());
        String strKWHzl = getNewProxyInstance().KWHzl();
        String strEZpvd = getNewProxyInstance().EZpvd();
        int type = RlQdEF().getType();
        return gNB.OLrzqt(v6BaseQuoteResponse, placeOrderParamsDmfpNf, strKWHzl, strAEQbTJ, strAEQbTJ, strEZpvd, String.valueOf(type), listAEQbTJ, value2, C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) ? TradeMode.MemeMode : TradeMode.QuickMode);
    }

    public final void KWHzl(String str) {
        AbstractC28352kYf abstractC28352kYfZLjUOn = zLjUOn();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        AbstractC28352kYf.submitOrder$default(abstractC28352kYfZLjUOn, fragmentActivityRequireActivity, str, false, 4, null);
    }

    public static final class Activity implements InterfaceC9740bbL.TaskDescription {
        public Activity() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            MemeMarketStrategyV6Fragment.this.getNewProxyInstance().OLrzqt(true);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            MemeMarketStrategyV6Fragment.this.getNewProxyInstance().OLrzqt(false);
        }
    }

    private final InterfaceC9740bbL.TaskDescription hUfVAv() {
        return new Activity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DXXBbs() {
        FragmentActivity activity;
        if (C22416heu.fIwbmz() && getNewProxyInstance().OLrzqt(iwGUEr().getChainId())) {
            InterfaceC9738bbJ interfaceC9738bbJDUDNAs = zLjUOn().dUDNAs();
            if ((interfaceC9738bbJDUDNAs == null || !interfaceC9738bbJDUDNAs.gHZMYf()) && kTV.Companion.EZpvd() && (activity = getActivity()) != null) {
                activity.startActivity(kTF.Companion.KWHzl(activity, AutoConfirmEntryType.MARKET, "txn_popup"));
            }
        }
    }

    public final void EZpvd(final TransactionType transactionType, final TokenBase tokenBase) {
        AbstractC31124loB abstractC31124loBZuBGHE = zuBGHE();
        if (abstractC31124loBZuBGHE != null) {
            abstractC31124loBZuBGHE.setTransactionViewEventTrackCallback(new Function1() { // from class: o.lne
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return MemeMarketStrategyV6Fragment.EZpvd(tokenBase, transactionType, this, (java.lang.String) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(TokenBase tokenBase, TransactionType transactionType, MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, String str) {
        MemeStrategyType memeStrategyType;
        Intrinsics.checkNotNullParameter(str, "");
        C24371ica c24371ica = C24371ica.OLrzqt;
        String tokenContractAddress = tokenBase.getTokenContractAddress();
        String value = (TransactionType.Buy == transactionType ? DexTrackEventParameter.ButtonName.BUY : DexTrackEventParameter.ButtonName.SELL).getValue();
        String strIZzfmt = memeMarketStrategyV6Fragment.iZzfmt();
        String eventSource = tokenBase.getEventSource();
        int i = TaskDescription.copydefault[transactionType.ordinal()];
        if (i == 1) {
            memeStrategyType = MemeStrategyType.BuyNow;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            memeStrategyType = MemeStrategyType.SellNow;
        }
        c24371ica.OLrzqt(str, tokenContractAddress, value, strIZzfmt, eventSource, memeStrategyType);
        return Unit.INSTANCE;
    }

    private final String iZzfmt() {
        return QUSxYX() ? "MARKET" : "DEX";
    }

    public final void giSNqX() {
        CommonDexInfo commonDexInfo;
        DexMultiTokenInfoBean fromToken;
        V6QuoteResponseData value;
        CommonDexInfo commonDexInfo2;
        DexMultiTokenInfoBean toToken;
        DefiPlatformInfo selectedDeFiPlatform;
        DefiPlatformInfo selectedDeFiPlatform2;
        CommonDexInfo commonDexInfo3;
        V6QuoteResponseData value2 = zLjUOn().USBtdM().getValue();
        if (value2 == null || (commonDexInfo = value2.getCommonDexInfo()) == null || (fromToken = commonDexInfo.getFromToken()) == null || (value = zLjUOn().USBtdM().getValue()) == null || (commonDexInfo2 = value.getCommonDexInfo()) == null || (toToken = commonDexInfo2.getToToken()) == null) {
            return;
        }
        V6QuoteResponseData value3 = zLjUOn().USBtdM().getValue();
        String toTokenValue = null;
        String fromTokenAmount = (value3 == null || (commonDexInfo3 = value3.getCommonDexInfo()) == null) ? null : commonDexInfo3.getFromTokenAmount();
        String str = fromTokenAmount == null ? "" : fromTokenAmount;
        V6QuoteResponseData value4 = zLjUOn().USBtdM().getValue();
        String receiveAmount = (value4 == null || (selectedDeFiPlatform2 = value4.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform2.getReceiveAmount();
        String str2 = receiveAmount == null ? "" : receiveAmount;
        V6QuoteResponseData value5 = zLjUOn().USBtdM().getValue();
        if (value5 != null && (selectedDeFiPlatform = value5.getSelectedDeFiPlatform()) != null) {
            toTokenValue = selectedDeFiPlatform.getToTokenValue();
        }
        C31168lot.copydefault.OLrzqt(fIwbmz().KWHzl(), fromToken, toToken, str, str2, toTokenValue == null ? "" : toTokenValue, this.DTwDnp);
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onVisible() {
        MemeModeTransactionFragment memeModeTransactionFragmentDbNXlk;
        super.onVisible();
        zLjUOn().DarRvM();
        C31173loy c31173loy = this.fIwbmz;
        if (c31173loy != null) {
            c31173loy.AEQbTJ();
        }
        if (RlQdEF() == accept().fetchVPNInfo().getValue() && !this.fetchVPNInfo) {
            if (zLjUOn().AuCTel().isQuoteStep()) {
                zLjUOn().QbewEr();
                zLjUOn().copydefault(false);
            }
            if (!C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.KWHzl()) && (memeModeTransactionFragmentDbNXlk = DbNXlk()) != null) {
                memeModeTransactionFragmentDbNXlk.hDKMBd();
            }
        }
        zLjUOn().EZpvd(new Function2() { // from class: o.lmL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return MemeMarketStrategyV6Fragment.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        if (accept().AuCTel().getValue().booleanValue()) {
            updateReminderView$default(this, null, null, null, 7, null);
        }
        if (!this.fJNWhG && C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) && RlQdEF() == TransactionType.Buy) {
            ejfBZ().EZpvd(iwGUEr().getChainId());
        } else {
            this.fJNWhG = false;
        }
    }

    public static final Unit OLrzqt(MemeMarketStrategyV6Fragment memeMarketStrategyV6Fragment, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z && !memeMarketStrategyV6Fragment.fetchVPNInfo) {
            memeMarketStrategyV6Fragment.zLjUOn().AuCTel().initCheckStep();
        }
        return Unit.INSTANCE;
    }

    public final MemeModeTransactionFragment DbNXlk() {
        for (androidx.fragment.app.Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof MemeModeTransactionFragment) {
                return (MemeModeTransactionFragment) parentFragment;
            }
        }
        return null;
    }

    public final void QbewEr() {
        if (this.DbNXlk && C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt())) {
            accept().EZpvd(C31125loC.KWHzl(this));
            this.DbNXlk = false;
        }
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        this.fetchVPNInfo = false;
        if (RlQdEF() == accept().fetchVPNInfo().getValue()) {
            zLjUOn().QbewEr();
        }
        C31173loy c31173loy = this.fIwbmz;
        if (c31173loy != null) {
            c31173loy.EZpvd();
        }
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        zLjUOn().QbewEr();
        zLjUOn().hUfVAv();
        zLjUOn().run();
        this.hDKMBd = null;
        this.AhwBna.AEQbTJ();
        this.AYXKKw = null;
    }

    @Override // o.C25324iua.Activity
    public void KWHzl() {
        V6QuoteResponseData value = zLjUOn().USBtdM().getValue();
        if (value != null) {
            C31161lom c31161lom = this.iwGUEr;
            if (c31161lom == null) {
                Intrinsics.gEmmrt("");
                c31161lom = null;
            }
            c31161lom.EZpvd(value, zLjUOn().QKudOq(), zLjUOn().QCjLjM(), zLjUOn().QVsKAR(), getNewProxyInstance().OLrzqt(iwGUEr().getChainId()), this.gEmmrt);
        }
    }

    @Override // o.C25324iua.Activity
    public void copydefault() {
        View viewInflate = LayoutInflater.from(requireContext()).inflate(C23274hvD.Activity.sZqaRl, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(C23274hvD.Application.onApplyThemeResource);
        TextView textView2 = (TextView) viewInflate.findViewById(C23274hvD.Application.StandaloneActionMode);
        textView2.setVisibility(0);
        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DPHOMC));
        textView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.Rtjmuc));
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.SQPLEi);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (C31172lox.KWHzl(C31125loC.KWHzl(this), C31172lox.Companion.OLrzqt()) && RlQdEF() == TransactionType.Buy) {
            if (z) {
                ejfBZ().KWHzl();
            } else {
                ejfBZ().EZpvd(iwGUEr().getChainId());
            }
        }
    }
}
