package com.okinc.business.dexui.main.swap.trade.transaction;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.trade.common.boost.model.BoostEstimateVolumeResponse;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MergeQuoteCallDataReq;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TradeMode;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.error.BtcEncryptException;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.CallDataError;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import com.okinc.web3Uilib.bean.TransactionButtonGroupInfoBean;
import com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean;
import com.okinc.web3Uilib.bean.TransactionGeneralInfoBean;
import com.okinc.web3Uilib.bean.TransactionHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionNetworkFeeBean;
import com.okinc.web3Uilib.bean.TransactionTopHeaderInfoBean;
import com.okinc.web3Uilib.bean.TransactionTopReminderInfoBean;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.AbstractC22974hpV;
import o.AbstractC22977hpY;
import o.AbstractC22992hpn;
import o.AbstractC23346hwW;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.AbstractC9832bcy;
import o.C19757gOe;
import o.C19758gOf;
import o.C21615hFy;
import o.C22333hdQ;
import o.C22380heK;
import o.C22416heu;
import o.C22971hpS;
import o.C23016hqK;
import o.C23212htv;
import o.C23272hvB;
import o.C23274hvD;
import o.C23301hve;
import o.C23313hvq;
import o.C23319hvw;
import o.C23322hvz;
import o.C24324ibg;
import o.C24695iig;
import o.C25142irD;
import o.C25143irE;
import o.C25144irF;
import o.C25145irG;
import o.C25147irI;
import o.C25148irJ;
import o.C25150irL;
import o.C25189iry;
import o.C25281itk;
import o.C25352ivB;
import o.C25382ivf;
import o.C25389ivm;
import o.C25404iwA;
import o.C31131loI;
import o.C32979mnm;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C43246rlf;
import o.C52761wXj;
import o.C52794wYp;
import o.C54845xXl;
import o.C55051xce;
import o.C55097xdX;
import o.C55113xdn;
import o.C55173xeu;
import o.C55296xhK;
import o.C55326xho;
import o.C56379yDe;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C56532yIw;
import o.C57406yhn;
import o.C57431yiL;
import o.C57436yiQ;
import o.C57468yiw;
import o.C57656ymY;
import o.C58156yvv;
import o.C58266yxz;
import o.C6777aVl;
import o.C9746bbR;
import o.C9748bbT;
import o.C9754bbZ;
import o.C9784bcC;
import o.C9786bcE;
import o.C9808bca;
import o.C9863bdc;
import o.C9868bdh;
import o.C9885bdy;
import o.InterfaceC22824hme;
import o.InterfaceC23194htd;
import o.InterfaceC25054ipV;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC9731bbC;
import o.InterfaceC9734bbF;
import o.InterfaceC9736bbH;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.InterfaceC9749bbU;
import o.InterfaceC9752bbX;
import o.ViewOnClickListenerC54939xaY;
import o.kTF;
import o.kTV;
import o.pUU;
import o.yBK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class TransactionPageFragment<VM extends AbstractC22977hpY> extends AbstractC23346hwW implements InterfaceC25054ipV {
    public final InterfaceC56387yDm EZpvd;

    @yCM
    public C19757gOe estimateBoostVolumeUseCase;
    public VM fARcdN;
    public C21615hFy gEmmrt;

    @yCM
    public C23212htv walletReferralUseCase;
    public final OrderRetryHelper values = new OrderRetryHelper("TransactionPageFragment");
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.iqy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(TransactionPageFragment.AuCTelauCTel(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.iqx
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.AhwBna();
        }
    });
    public final Function0<Unit> DbNXlk = new Function0() { // from class: o.iqw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.AubY(this.AEQbTJ);
        }
    };
    public final Function0<Unit> fetchVPNInfo = new Function0() { // from class: o.iqz
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.zsXlph(this.OLrzqt);
        }
    };
    public final Function0<Unit> AkhnZx = new Function0() { // from class: o.iqv
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.wlaJM(this.OLrzqt);
        }
    };
    public final Function0<Unit> valueOf = new Function0() { // from class: o.iqA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.iwGUEr(this.OLrzqt);
        }
    };
    public final Function0<Unit> AhwBna = new Function0() { // from class: o.iqE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.hDKMBd(this.KWHzl);
        }
    };
    public boolean AYXKKw = true;
    public final Function0<Unit> KWHzl = new Function0() { // from class: o.iqB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.fIwbmz(this.OLrzqt);
        }
    };
    public final Function0<Unit> copydefault = new Function0() { // from class: o.iqD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return TransactionPageFragment.uzCIH(this.KWHzl);
        }
    };

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    public abstract void AEQbTJ(@NotNull AbstractC9832bcy abstractC9832bcy, @NotNull String str);

    public abstract Object EZpvd(@NotNull Continuation<? super List<? extends Object>> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object KWHzl(@NotNull Continuation<? super C25144irF> continuation) {
        return AEQbTJ(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull VM vm) {
        Intrinsics.checkNotNullParameter(vm, "");
        this.fARcdN = vm;
    }

    public abstract void ORxRYg();

    public abstract VM QKVWgx();

    public abstract void copydefault(AbstractC9832bcy abstractC9832bcy);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String fARcdN() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21615hFy fJNWhG() {
        return this.gEmmrt;
    }

    public boolean gHZMYf() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.OmJATG;
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32998moE
    public void onInvisible() {
    }

    public abstract void valueOf();

    public void zuBGHE() {
    }

    public TransactionPageFragment() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C22971hpS.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.transaction.TransactionPageFragment$special$$inlined$activityViewModels$default$3
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

    public final C22971hpS DbNXlk() {
        return (C22971hpS) this.EZpvd.getValue();
    }

    public final VM zLjUOn() {
        VM vm = this.fARcdN;
        if (vm != null) {
            return vm;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C19757gOe AuCTel() {
        C19757gOe c19757gOe = this.estimateBoostVolumeUseCase;
        if (c19757gOe != null) {
            return c19757gOe;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C23212htv AubY() {
        C23212htv c23212htv = this.walletReferralUseCase;
        if (c23212htv != null) {
            return c23212htv;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean AwvSrB() {
        return ((Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean AuCTelauCTel(TransactionPageFragment transactionPageFragment) {
        Bundle arguments = transactionPageFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("swap_type");
        }
        return false;
    }

    public final C25142irD zsXlph() {
        return (C25142irD) this.isConnected.getValue();
    }

    public static final C25142irD AhwBna() {
        return new C25142irD();
    }

    public final QuotePriceRes getNewProxyInstance() {
        return zLjUOn().AkhnZx();
    }

    public final DexMultiTokenInfoBean fIwbmz() {
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            return newProxyInstance.fromToken();
        }
        return null;
    }

    public final DexMultiTokenInfoBean uzCIH() {
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        if (newProxyInstance != null) {
            return newProxyInstance.toToken();
        }
        return null;
    }

    @Override // o.AbstractC23346hwW, o.AbstractC32996moC
    public void initView(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        OLrzqt(QKVWgx());
        this.gEmmrt = C21615hFy.EZpvd(view);
        aKErDB();
        wlaJM();
        valueOf();
        UeEOUB();
        gEmmrt();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.irD.register$default(o.irD, boolean, int, java.lang.Object):void */
    private final void aKErDB() {
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null) {
            zLjUOn().copydefault(DbNXlk().valueOf());
            c21615hFy.AhwBna.setLayoutManager(new LinearLayoutManager(requireContext()));
            c21615hFy.AhwBna.setAdapter(zsXlph());
            C25142irD.register$default(zsXlph(), false, 1, null);
            c21615hFy.AYXKKw.copydefault().setContentDescription("web3_dex_transaction_reject_button");
        }
    }

    public void wlaJM() {
        CDNSourceManager.ImageSource imageSource;
        C57431yiL c57431yiL;
        String swapTypeTitle;
        QuotePriceRes quotePriceRes;
        CommonDexInfo commonDexInfo;
        QuotePriceRes quotePriceRes2;
        View view;
        C57436yiQ c57436yiQ;
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null && (c57436yiQ = c21615hFy.OLrzqt) != null) {
            c57436yiQ.setVisibility(8);
        }
        C21615hFy c21615hFy2 = this.gEmmrt;
        if (c21615hFy2 != null && (view = c21615hFy2.copydefault) != null) {
            view.setVisibility(8);
        }
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        if (transactionBeanFJNWhG != null && (quotePriceRes2 = transactionBeanFJNWhG.getQuotePriceRes()) != null && quotePriceRes2.isSingle()) {
            imageSource = CDNSourceManager.ImageSource.SwapTransactionLogo;
        } else {
            imageSource = CDNSourceManager.ImageSource.BridgeTransactionLogo;
        }
        C21615hFy c21615hFy3 = this.gEmmrt;
        if (c21615hFy3 != null && (c57431yiL = c21615hFy3.KWHzl) != null) {
            Context context = getContext();
            String strOLrzqt = context != null ? CDNSourceManager.EZpvd.OLrzqt(imageSource, context) : null;
            TransactionBean transactionBeanFJNWhG2 = zLjUOn().fJNWhG();
            if (transactionBeanFJNWhG2 == null || (quotePriceRes = transactionBeanFJNWhG2.getQuotePriceRes()) == null || (commonDexInfo = quotePriceRes.getCommonDexInfo()) == null || (swapTypeTitle = commonDexInfo.getSwapTypeTitle()) == null) {
                swapTypeTitle = "";
            }
            c57431yiL.setViewDataBean(new TransactionTopHeaderInfoBean(strOLrzqt, null, swapTypeTitle, null, null, null, null, null, 250, null));
        }
        AYXKKw();
        C23301hve.KWHzl("swap");
        DbNXlk().copydefault().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.irx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.KWHzl, (Triple) obj);
            }
        }));
    }

    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, Triple triple) {
        if (!((CallDataError) triple.getThird()).getResStatus()) {
            transactionPageFragment.AEQbTJ((MergeCallData) triple.getSecond());
            pUU.EZpvd("TransactionPageFragment", "initData: it.third.resStatus != true");
        } else {
            transactionPageFragment.zLjUOn().gEmmrt().setValue(triple.getThird());
            transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
            pUU.EZpvd("TransactionPageFragment", "initData: it.third.resStatus == true");
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hpY.getWalletAddressByType$default(o.hpY, java.lang.String, o.bbJ, int, java.lang.Object):java.lang.String */
    public final void AEQbTJ(MergeCallData mergeCallData) {
        TeeSaStatus teeSaStatus;
        QuotePriceRes quotePriceRes;
        final QuotePriceRes quotePriceRes2;
        if (mergeCallData != null) {
            TransactionBean transactionBeanValueOf = DbNXlk().valueOf();
            if ((transactionBeanValueOf != null ? transactionBeanValueOf.getQuotePriceRes() : null) != null) {
                TransactionBean transactionBeanValueOf2 = DbNXlk().valueOf();
                if (transactionBeanValueOf2 == null || (quotePriceRes = transactionBeanValueOf2.getQuotePriceRes()) == null || !quotePriceRes.isPMM()) {
                    AbstractC22974hpV abstractC22974hpVEjfBZ = ejfBZ();
                    TransactionBean transactionBeanValueOf3 = DbNXlk().valueOf();
                    QuotePriceRes quotePriceRes3 = transactionBeanValueOf3 != null ? transactionBeanValueOf3.getQuotePriceRes() : null;
                    Intrinsics.copydefault(quotePriceRes3);
                    boolean zAwvSrB = AwvSrB();
                    String strGEmmrt = DbNXlk().gEmmrt();
                    TransactionBean transactionBeanValueOf4 = DbNXlk().valueOf();
                    if (transactionBeanValueOf4 == null || (teeSaStatus = transactionBeanValueOf4.getTeeSaStatus()) == null) {
                        teeSaStatus = TeeSaStatus.NON_TEE_ACTIVE_AND_EXPIRED;
                    }
                    AbstractC58185ywX<Triple<InterfaceC9734bbF, String, Object>> abstractC58185ywXCopydefault = abstractC22974hpVEjfBZ.copydefault(quotePriceRes3, zAwvSrB, mergeCallData, strGEmmrt, teeSaStatus);
                    LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                    AbstractC58185ywX abstractC58185ywXKWHzl = C58156yvv.OLrzqt(abstractC58185ywXCopydefault, viewLifecycleOwner, Lifecycle.Event.ON_DESTROY).copydefault(C58266yxz.OLrzqt()).KWHzl(C58266yxz.OLrzqt());
                    final Function1 function1 = new Function1() { // from class: o.irt
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return TransactionPageFragment.KWHzl(this.copydefault, (Triple) obj);
                        }
                    };
                    InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.irA
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            TransactionPageFragment.values(function1, obj);
                        }
                    };
                    final Function1 function12 = new Function1() { // from class: o.iqq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return TransactionPageFragment.djBIcL(this.OLrzqt, (java.lang.Throwable) obj);
                        }
                    };
                    abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iqu
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            TransactionPageFragment.DbNXlk(function12, obj);
                        }
                    });
                    return;
                }
                pUU.EZpvd("TransactionPageFragment", "initSwap: QuoteRequest.isAutoOrNormalMode(activityViewModel.transactionBean?.quotePriceRes?.tradingModeType ?: ) else");
                TransactionBean transactionBeanValueOf5 = DbNXlk().valueOf();
                if (transactionBeanValueOf5 == null || (quotePriceRes2 = transactionBeanValueOf5.getQuotePriceRes()) == null) {
                    return;
                }
                String chainId = quotePriceRes2.fromToken().getChainId();
                String walletAddressByType$default = AbstractC22977hpY.getWalletAddressByType$default(zLjUOn(), chainId, null, 2, null);
                pUU.EZpvd("TransactionPageFragment", "before fetchQuoteCallData");
                AbstractC22977hpY abstractC22977hpYZLjUOn = zLjUOn();
                AbstractC22992hpn abstractC22992hpn = abstractC22977hpYZLjUOn instanceof AbstractC22992hpn ? (AbstractC22992hpn) abstractC22977hpYZLjUOn : null;
                if (abstractC22992hpn != null) {
                    abstractC22992hpn.copydefault(walletAddressByType$default, chainId, mergeCallData, new Function1() { // from class: o.iqr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return TransactionPageFragment.AEQbTJ(quotePriceRes2, this, (InterfaceC9734bbF) obj);
                        }
                    });
                    return;
                }
                return;
            }
            MutableLiveData<Boolean> mutableLiveDataAEQbTJ = DbNXlk().AEQbTJ();
            Boolean bool = Boolean.FALSE;
            mutableLiveDataAEQbTJ.setValue(bool);
            zLjUOn().gEmmrt().setValue(new CallDataError((String) null, (String) null, true, 3, (DefaultConstructorMarker) null));
            zLjUOn().DbNXlk().setValue(bool);
            pUU.EZpvd("TransactionPageFragment", "activityViewModel.transactionBean?.quotePriceRes == null");
        }
    }

    public static final void values(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(TransactionPageFragment transactionPageFragment, Triple triple) throws Exception {
        if (triple.getFirst() == null) {
            pUU.EZpvd("TransactionPageFragment", "it.first == null");
            throw new Exception("ITransaction = " + triple.getFirst());
        }
        pUU.EZpvd("TransactionPageFragment", "it.first != null before");
        MutableLiveData<QuotePriceRes> mutableLiveDataHDKMBd = transactionPageFragment.zLjUOn().hDKMBd();
        TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
        mutableLiveDataHDKMBd.setValue(transactionBeanValueOf != null ? transactionBeanValueOf.getQuotePriceRes() : null);
        C23016hqK c23016hqK = C23016hqK.copydefault;
        AbstractC22974hpV abstractC22974hpVEjfBZ = transactionPageFragment.ejfBZ();
        Intrinsics.copydefault(triple);
        c23016hqK.KWHzl(abstractC22974hpVEjfBZ, triple, transactionPageFragment);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(transactionPageFragment), null, null, new TransactionPageFragment$initSwap$1$1$1(transactionPageFragment, null), 3, null);
        pUU.EZpvd("TransactionPageFragment", "it.first != null after");
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(TransactionPageFragment transactionPageFragment, Throwable th) {
        C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
        MutableLiveData<Boolean> mutableLiveDataAEQbTJ = transactionPageFragment.DbNXlk().AEQbTJ();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataAEQbTJ.setValue(bool);
        pUU.EZpvd("TransactionPageFragment", "initSwap: onError");
        transactionPageFragment.zLjUOn().gEmmrt().setValue(new CallDataError((String) null, (String) null, true, 3, (DefaultConstructorMarker) null));
        transactionPageFragment.zLjUOn().DbNXlk().setValue(bool);
        if (th instanceof OKServerException) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            OKServerException oKServerException = (OKServerException) th;
            Throwable origin = oKServerException.getOrigin();
            Throwable origin2 = oKServerException.getOrigin();
            taskDescription.EZpvd(new Exception("event: fetchQuoteCallData\n, cause: fetchQuoteCallData request error \nurl: " + origin + " stack: " + (origin2 != null ? C56379yDe.AEQbTJ(origin2) : null)));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(QuotePriceRes quotePriceRes, TransactionPageFragment transactionPageFragment, InterfaceC9734bbF interfaceC9734bbF) {
        if (interfaceC9734bbF != null) {
            MutableLiveData<QuotePriceRes> mutableLiveDataHDKMBd = transactionPageFragment.zLjUOn().hDKMBd();
            TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
            mutableLiveDataHDKMBd.setValue(transactionBeanValueOf != null ? transactionBeanValueOf.getQuotePriceRes() : null);
            pUU.EZpvd("TransactionPageFragment", " fetchQuoteCallData handleData前");
            C23016hqK.copydefault.KWHzl(transactionPageFragment.ejfBZ(), new Triple<>(interfaceC9734bbF, "", quotePriceRes), transactionPageFragment);
            transactionPageFragment.ejfBZ().EZpvd(interfaceC9734bbF);
            if (BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(transactionPageFragment), null, null, new TransactionPageFragment$initSwap$1$3$1$1$1(transactionPageFragment, null), 3, null) == null) {
                MutableLiveData<Boolean> mutableLiveDataAEQbTJ = transactionPageFragment.DbNXlk().AEQbTJ();
                Boolean bool = Boolean.FALSE;
                mutableLiveDataAEQbTJ.setValue(bool);
                transactionPageFragment.zLjUOn().gEmmrt().setValue(new CallDataError((String) null, (String) null, true, 3, (DefaultConstructorMarker) null));
                transactionPageFragment.zLjUOn().DbNXlk().setValue(bool);
                Unit unit = Unit.INSTANCE;
            }
        }
        pUU.EZpvd("TransactionPageFragment", "after fetchQuoteCallData");
        return Unit.INSTANCE;
    }

    private final void UeEOUB() {
        zLjUOn().values().observe(this, new ActionBar(new Function1() { // from class: o.iqt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.AYXKKw(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.iqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.djBIcL(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final Unit AYXKKw(TransactionPageFragment transactionPageFragment, Boolean bool) {
        QuotePriceRes quotePriceRes;
        TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
        if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isPMM()) {
            transactionPageFragment.copydefault((AbstractC9832bcy) null);
        } else {
            transactionPageFragment.values.EZpvd();
            transactionPageFragment.KWHzl(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(TransactionPageFragment transactionPageFragment, Boolean bool) {
        FragmentActivity activity = transactionPageFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(boolean z) {
        TransactionBean transactionBeanValueOf;
        ejfBZ().OLrzqt();
        zLjUOn().DbNXlk().setValue(Boolean.TRUE);
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        if (interfaceC9734bbFHDKMBd == null) {
            return;
        }
        boolean z2 = (z || (transactionBeanValueOf = DbNXlk().valueOf()) == null || !transactionBeanValueOf.getDexAutoConfirmEnabled()) ? false : true;
        pUU.KWHzl(TransactionPageFragment.class.getName(), "submitSwapOrder - silentSignWhenAvailable -> " + z2);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        AbstractC58260yxt<ResponseData<C9748bbT>> abstractC58260yxtCopydefault = interfaceC9740bbLAYXKKw.copydefault(activity, interfaceC9734bbFHDKMBd, new TaskDescription(this), z2);
        final Function1 function1 = new Function1() { // from class: o.iqL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.OLrzqt(this.KWHzl, (ResponseData) obj);
            }
        };
        InterfaceC58227yxM<? super ResponseData<C9748bbT>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iqW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.irk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.valueOf(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.ejfBZ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, zLjUOn().call());
    }

    public static final class TaskDescription implements InterfaceC9740bbL.TaskDescription {
        public final /* synthetic */ TransactionPageFragment<VM> KWHzl;

        public TaskDescription(TransactionPageFragment<VM> transactionPageFragment) {
            this.KWHzl = transactionPageFragment;
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            this.KWHzl.zLjUOn().DbNXlk().setValue(Boolean.TRUE);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            this.KWHzl.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        }
    }

    public static final void fetchVPNInfo(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(TransactionPageFragment transactionPageFragment, ResponseData responseData) {
        String strKWHzl;
        TransactionBean transactionBeanValueOf;
        QuotePriceRes quotePriceRes;
        int code = responseData.getCode();
        if (code == -5014 || code == -5007) {
            transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
            transactionPageFragment.ejfBZ().EZpvd();
            transactionPageFragment.values.EZpvd();
        } else if (code == -5001) {
            pUU.KWHzl(TransactionPageFragment.class.getName(), "submitSwapOrder success");
            C22380heK c22380heK = C22380heK.OLrzqt;
            InterfaceC22824hme interfaceC22824hmeOLrzqt = c22380heK.copydefault(transactionPageFragment.AEQbTJ()).OLrzqt(transactionPageFragment.AwvSrB());
            C9748bbT c9748bbT = (C9748bbT) responseData.getData();
            if (c9748bbT == null || (strKWHzl = c9748bbT.KWHzl()) == null) {
                strKWHzl = "";
            }
            interfaceC22824hmeOLrzqt.KWHzl(strKWHzl);
            TransactionBean transactionBeanFJNWhG = transactionPageFragment.zLjUOn().fJNWhG();
            if (transactionBeanFJNWhG != null) {
                C9748bbT c9748bbT2 = (C9748bbT) responseData.getData();
                String strAEQbTJ = c9748bbT2 != null ? c9748bbT2.AEQbTJ() : null;
                transactionBeanFJNWhG.setSignedTx(strAEQbTJ != null ? strAEQbTJ : "");
            }
            transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
            transactionPageFragment.zLjUOn().AhwBna().setValue(Boolean.TRUE);
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AEQbTJ();
            transactionPageFragment.values.EZpvd();
            if (C22416heu.fIwbmz()) {
                TransactionBean transactionBeanValueOf2 = transactionPageFragment.DbNXlk().valueOf();
                if ((transactionBeanValueOf2 != null ? transactionBeanValueOf2.getTeeSaStatus() : null) != TeeSaStatus.TEE_ACTIVE && (transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf()) != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isOKXPlatform() && (interfaceC9738bbJAEQbTJ == null || !interfaceC9738bbJAEQbTJ.gHZMYf())) {
                    transactionPageFragment.QfsBiF();
                }
            }
        } else if (code == 60030) {
            if (!transactionPageFragment.values.OLrzqt()) {
                pUU.KWHzl(TransactionPageFragment.class.getName(), "Quota exceeded, retrying with manual sign");
                transactionPageFragment.values.KWHzl();
                transactionPageFragment.KWHzl(true);
            } else {
                transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
                transactionPageFragment.ejfBZ().EZpvd();
                C25189iry.AEQbTJ(responseData.getMsg());
                transactionPageFragment.values.EZpvd();
            }
        } else {
            transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
            transactionPageFragment.ejfBZ().EZpvd();
            C25189iry.AEQbTJ(responseData.getMsg());
            pUU.copydefault(TransactionPageFragment.class.getName(), "submitSwapOrder failed: code=" + responseData.getCode() + ", msg=" + responseData.getMsg());
            transactionPageFragment.values.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void ejfBZ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper.handleErrorWithRetry$default(com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper, java.lang.Throwable, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public static final Unit valueOf(final TransactionPageFragment transactionPageFragment, Throwable th) {
        pUU.KWHzl(TransactionPageFragment.class.getName(), "submitSwapOrder failure, entering retry handler");
        OrderRetryHelper orderRetryHelper = transactionPageFragment.values;
        Intrinsics.copydefault(th);
        OrderRetryHelper.handleErrorWithRetry$default(orderRetryHelper, th, new Function1() { // from class: o.irv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.DbNXlk(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.irw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.AhwBna(this.OLrzqt, (java.lang.Throwable) obj);
            }
        }, null, null, 24, null);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(TransactionPageFragment transactionPageFragment, boolean z) {
        pUU.KWHzl(TransactionPageFragment.class.getName(), "submitSwapOrder retryAction invoked, forceManualSign=" + z);
        transactionPageFragment.KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(TransactionPageFragment transactionPageFragment, Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        if ((th instanceof WalletJwtException) || (((th instanceof OKServerException) && (((OKServerException) th).getOrigin() instanceof WalletJwtException)) || C25389ivm.copydefault(th))) {
            String strAEQbTJ = C25389ivm.AEQbTJ(th);
            String str = strAEQbTJ != null ? strAEQbTJ : "";
            transactionPageFragment.ejfBZ().EZpvd();
            C25189iry.AEQbTJ(str);
            pUU.copydefault(TransactionPageFragment.class.getName(), "submitSwapOrder JWT error: " + str);
        } else {
            transactionPageFragment.zLjUOn().AhwBna().setValue(Boolean.TRUE);
            C25189iry.AEQbTJ("");
            pUU.copydefault(TransactionPageFragment.class.getName(), "submitSwapOrder error: " + th.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final void QfsBiF() {
        FragmentActivity activity;
        if (!kTV.Companion.EZpvd() || (activity = getActivity()) == null) {
            return;
        }
        activity.startActivity(kTF.Companion.KWHzl(activity, AutoConfirmEntryType.MARKET, "txn_popup"));
    }

    public final void gEmmrt() {
        zLjUOn().gEmmrt().observe(this, new ActionBar(new Function1() { // from class: o.iqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.EZpvd(this.EZpvd, (CallDataError) obj);
            }
        }));
        zLjUOn().fIwbmz().observe(this, new ActionBar(new Function1() { // from class: o.iqP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.KWHzl, (InterfaceC9752bbX) obj);
            }
        }));
        zLjUOn().uzCIH().observe(this, new ActionBar(new Function1() { // from class: o.iqQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        zLjUOn().valueOf().observe(this, new ActionBar(new Function1() { // from class: o.iqT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.OLrzqt, (AbstractC9832bcy) obj);
            }
        }));
        zLjUOn().getNewProxyInstance().observe(this, new ActionBar(new Function1() { // from class: o.iqS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.valueOf(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().DbNXlk().observe(this, new ActionBar(new Function1() { // from class: o.iqX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.gEmmrt(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().zLjUOn().observe(this, new ActionBar(new Function1() { // from class: o.iqY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.AhwBna(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        zLjUOn().hDKMBd().observe(this, new ActionBar(new Function1() { // from class: o.iqU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.KWHzl(this.KWHzl, (QuotePriceRes) obj);
            }
        }));
        zLjUOn().getFieldNames().observe(this, new ActionBar(new Function1() { // from class: o.iqV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.OLrzqt, (QuotePriceRes) obj);
            }
        }));
        zLjUOn().ejfBZ().observe(this, new ActionBar(new Function1() { // from class: o.ira
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.valueOf(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        zLjUOn().isConnected().observe(this, new ActionBar(new Function1() { // from class: o.iqM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.djBIcL(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        zLjUOn().iwGUEr().observe(this, new ActionBar(new Function1() { // from class: o.iqK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.gEmmrt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        zLjUOn().fARcdN().observe(this, new ActionBar(new Function1() { // from class: o.iqO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.AEQbTJ((java.lang.Throwable) obj);
            }
        }));
        DbNXlk().AYXKKw().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.iqR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.valueOf(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit EZpvd(final TransactionPageFragment transactionPageFragment, CallDataError callDataError) {
        C55173xeu c55173xeu;
        NestedScrollView nestedScrollView;
        LinearLayout linearLayout;
        C57436yiQ c57436yiQ;
        NestedScrollView nestedScrollView2;
        LinearLayout linearLayout2;
        C21615hFy c21615hFy = transactionPageFragment.gEmmrt;
        if (c21615hFy != null && (c55173xeu = c21615hFy.AEQbTJ) != null) {
            if (callDataError.getResStatus()) {
                C21615hFy c21615hFy2 = transactionPageFragment.gEmmrt;
                if (c21615hFy2 != null && (linearLayout2 = c21615hFy2.EZpvd) != null) {
                    linearLayout2.setVisibility(8);
                }
                C21615hFy c21615hFy3 = transactionPageFragment.gEmmrt;
                if (c21615hFy3 != null && (nestedScrollView2 = c21615hFy3.djBIcL) != null) {
                    nestedScrollView2.setVisibility(8);
                }
                c55173xeu.setVisibility(0);
            } else {
                C21615hFy c21615hFy4 = transactionPageFragment.gEmmrt;
                if (c21615hFy4 != null && (linearLayout = c21615hFy4.EZpvd) != null) {
                    linearLayout.setVisibility(0);
                }
                C21615hFy c21615hFy5 = transactionPageFragment.gEmmrt;
                if (c21615hFy5 != null && (nestedScrollView = c21615hFy5.djBIcL) != null) {
                    nestedScrollView.setVisibility(0);
                }
                c55173xeu.setVisibility(8);
            }
            String code = callDataError.getCode();
            if (Intrinsics.EZpvd((Object) code, (Object) "100002")) {
                c55173xeu.setSubTitle((CharSequence) callDataError.getMessage());
            } else if (Intrinsics.EZpvd((Object) code, (Object) "10055")) {
                C21615hFy c21615hFy6 = transactionPageFragment.gEmmrt;
                if (c21615hFy6 != null && (c57436yiQ = c21615hFy6.OLrzqt) != null) {
                    c57436yiQ.setVisibility(8);
                }
                transactionPageFragment.DbNXlk().KWHzl().setValue(null);
                c55173xeu.setVisibility(0);
                c55173xeu.setEmptyTypeImage(6);
                c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.getIControllerCallback));
                c55173xeu.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.registerCallback));
                c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.DTwDnp));
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.irb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        TransactionPageFragment.OLrzqt(this.EZpvd, view);
                    }
                });
            } else {
                C25352ivB.setNetworkError$default(c55173xeu, callDataError.getResStatus(), null, new Function0() { // from class: o.irc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.fJNWhG(this.OLrzqt);
                    }
                }, 2, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(TransactionPageFragment transactionPageFragment, View view) {
        transactionPageFragment.zLjUOn().AhwBna().setValue(Boolean.TRUE);
    }

    public static final Unit fJNWhG(TransactionPageFragment transactionPageFragment) {
        Triple<TransactionType, MergeCallData, CallDataError> value = transactionPageFragment.DbNXlk().copydefault().getValue();
        if (value != null && !value.getThird().getResStatus()) {
            transactionPageFragment.AEQbTJ(value.getSecond());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, InterfaceC9752bbX interfaceC9752bbX) {
        String strOLrzqt;
        String strDbNXlk;
        String strDjBIcL;
        String strEZpvd;
        int i;
        String str;
        boolean z;
        CharSequence charSequence;
        TransactionNetworkFeeBean transactionNetworkFeeBeanOLrzqt;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        InterfaceC9738bbJ interfaceC9738bbJDbNXlk;
        QuotePriceRes newProxyInstance;
        QuotePriceRes newProxyInstance2;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge;
        String estimateBridgeFeeAmount;
        String chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken;
        DexQuoteBridgeVO dexQuoteBridgeVOBridge2;
        List<?> items = transactionPageFragment.zsXlph().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next() instanceof C25147irI) {
                break;
            }
            i2++;
        }
        if (i2 == -1) {
            return Unit.INSTANCE;
        }
        boolean zGEmmrt = interfaceC9752bbX.gEmmrt();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = transactionPageFragment.hDKMBd();
        if (interfaceC9734bbFHDKMBd == null || (interfaceC9738bbJDbNXlk = interfaceC9734bbFHDKMBd.DbNXlk()) == null || !(!interfaceC9738bbJDbNXlk.getFieldNames()) || (newProxyInstance = transactionPageFragment.getNewProxyInstance()) == null || !(!newProxyInstance.isSingle()) || (newProxyInstance2 = transactionPageFragment.getNewProxyInstance()) == null || (dexQuoteBridgeVOBridge = newProxyInstance2.bridge()) == null || !dexQuoteBridgeVOBridge.isEstimateBridgeFeeAmountValid()) {
            strOLrzqt = "0";
        } else {
            InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN();
            QuotePriceRes newProxyInstance3 = transactionPageFragment.getNewProxyInstance();
            if (newProxyInstance3 == null || (dexQuoteBridgeVOBridge2 = newProxyInstance3.bridge()) == null || (estimateBridgeFeeAmount = dexQuoteBridgeVOBridge2.getEstimateBridgeFeeAmount()) == null) {
                estimateBridgeFeeAmount = "";
            }
            QuotePriceRes newProxyInstance4 = transactionPageFragment.getNewProxyInstance();
            if (newProxyInstance4 == null || (dexMultiTokenInfoBeanFromToken = newProxyInstance4.fromToken()) == null || (chainId = dexMultiTokenInfoBeanFromToken.getChainId()) == null) {
                chainId = "";
            }
            strOLrzqt = interfaceC23194htdFARcdN.OLrzqt(estimateBridgeFeeAmount, chainId);
        }
        String strAddCheckS$default = C23313hvq.addCheckS$default(C23313hvq.addCheckS$default(interfaceC9752bbX.AEQbTJ(), strOLrzqt, null, null, null, 14, null), transactionPageFragment.gHZMYf() ? transactionPageFragment.fARcdN() : "0", null, null, null, 14, null);
        String feeCoinAmount$default = InterfaceC9752bbX.Activity.formatFeeCoinAmount$default(interfaceC9752bbX, strAddCheckS$default, false, 2, null);
        InterfaceC9752bbX.Activity.formatFeeCurrency$default(interfaceC9752bbX, strAddCheckS$default, false, 2, null);
        String strAddCheckS$default2 = C23313hvq.addCheckS$default(interfaceC9752bbX.OLrzqt(), strOLrzqt, null, null, null, 14, null);
        String feeCoinAmount$default2 = InterfaceC9752bbX.Activity.formatFeeCoinAmount$default(interfaceC9752bbX, strAddCheckS$default2, false, 2, null);
        String strKWHzl = interfaceC9752bbX.KWHzl(strAddCheckS$default2, false);
        InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = transactionPageFragment.hDKMBd();
        InterfaceC9731bbC interfaceC9731bbCAYXKKw = interfaceC9734bbFHDKMBd2 != null ? interfaceC9734bbFHDKMBd2.AYXKKw() : null;
        if (interfaceC9731bbCAYXKKw == null || (strDbNXlk = interfaceC9731bbCAYXKKw.DbNXlk()) == null) {
            strDbNXlk = "";
        }
        if (interfaceC9731bbCAYXKKw == null || (strDjBIcL = interfaceC9731bbCAYXKKw.djBIcL()) == null) {
            strDjBIcL = "";
        }
        Object obj = transactionPageFragment.zsXlph().getItems().get(i2);
        C25147irI c25147irI = obj instanceof C25147irI ? (C25147irI) obj : null;
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AYXKKw();
        Context contextRequireContext = transactionPageFragment.requireContext();
        Intrinsics.copydefault(interfaceC9752bbX);
        C9746bbR c9746bbRAEQbTJ = interfaceC9740bbLAYXKKw.AEQbTJ(contextRequireContext, interfaceC9752bbX);
        InterfaceC9734bbF interfaceC9734bbFHDKMBd3 = transactionPageFragment.hDKMBd();
        if (interfaceC9734bbFHDKMBd3 == null || (strEZpvd = interfaceC9740bbLAYXKKw.EZpvd(interfaceC9734bbFHDKMBd3)) == null) {
            strEZpvd = "";
        }
        Pair pairOLrzqt = C33129mqd.OLrzqt(c9746bbRAEQbTJ.AEQbTJ()) ? C56390yDp.OLrzqt(c9746bbRAEQbTJ.KWHzl(), c9746bbRAEQbTJ.AEQbTJ()) : C56390yDp.OLrzqt(null, "");
        if (c9746bbRAEQbTJ.EZpvd() == 1) {
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.LocalActivityResultRegistryOwner);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(feeCoinAmount$default);
                i = i2;
                try {
                    sb.append(" ");
                    sb.append(strAYXKKw);
                    spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                    str2 = strAYXKKw;
                    str = strEZpvd;
                    z = false;
                } catch (Exception unused) {
                    str = strEZpvd;
                    str2 = strAYXKKw;
                    z = false;
                    pUU.copydefault("TransactionPageFragment", "freeGasAndGasDiscountInfo.resultCode setSpan error");
                    charSequence = str2;
                    if (c25147irI != null) {
                    }
                    String strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("maxFeeCoinAmount", feeCoinAmount$default2), C56390yDp.OLrzqt("maxFeeCurrency", strKWHzl)));
                    String strOLrzqt2 = transactionPageFragment.OLrzqt(interfaceC9752bbX, strAddCheckS$default);
                    if (c25147irI != null) {
                        if (!transactionPageFragment.zLjUOn().wlaJM()) {
                        }
                    }
                    transactionPageFragment.zsXlph().notifyItemChanged(i);
                    if (transactionPageFragment.zLjUOn().wlaJM()) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Exception unused2) {
                i = i2;
            }
            try {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), 0, feeCoinAmount$default.length(), 17);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.HJWChPRAkuRW)), feeCoinAmount$default.length(), spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            } catch (Exception unused3) {
                pUU.copydefault("TransactionPageFragment", "freeGasAndGasDiscountInfo.resultCode setSpan error");
                charSequence = str2;
            }
        } else {
            i = i2;
            str = strEZpvd;
            z = false;
            charSequence = feeCoinAmount$default;
        }
        if (c25147irI != null) {
            if (!transactionPageFragment.zLjUOn().wlaJM() && zGEmmrt) {
                z = true;
            }
            c25147irI.KWHzl(z);
        }
        String strKWHzl22 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("maxFeeCoinAmount", feeCoinAmount$default2), C56390yDp.OLrzqt("maxFeeCurrency", strKWHzl)));
        String strOLrzqt22 = transactionPageFragment.OLrzqt(interfaceC9752bbX, strAddCheckS$default);
        if (c25147irI != null && (transactionNetworkFeeBeanOLrzqt = c25147irI.OLrzqt()) != null) {
            if (!transactionPageFragment.zLjUOn().wlaJM()) {
                transactionNetworkFeeBeanOLrzqt.setHeaderImgRes(null);
                transactionNetworkFeeBeanOLrzqt.setHeaderImgDefaultRes(null);
                transactionNetworkFeeBeanOLrzqt.setHeaderTitle(C25189iry.copydefault(strDjBIcL));
                transactionNetworkFeeBeanOLrzqt.setLeftContentInfo("");
                transactionNetworkFeeBeanOLrzqt.setRightContentInfo(strOLrzqt22);
                if (!interfaceC9752bbX.h_()) {
                    strKWHzl22 = "";
                }
                transactionNetworkFeeBeanOLrzqt.setPrimaryTip(strKWHzl22);
                transactionNetworkFeeBeanOLrzqt.setSecondTipIcon((Drawable) pairOLrzqt.getFirst());
                CharSequence charSequence2 = (CharSequence) pairOLrzqt.getSecond();
                transactionNetworkFeeBeanOLrzqt.setSecondaryTip(charSequence2 != null ? charSequence2 : "");
                transactionNetworkFeeBeanOLrzqt.setHeaderTitleUnderLineClick(null);
                transactionNetworkFeeBeanOLrzqt.setRootClickCallback(null);
            } else {
                transactionNetworkFeeBeanOLrzqt.setHeaderImgRes(strDbNXlk);
                transactionNetworkFeeBeanOLrzqt.setHeaderImgDefaultRes(C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv));
                transactionNetworkFeeBeanOLrzqt.setHeaderTitle(C25189iry.copydefault(strDjBIcL));
                transactionNetworkFeeBeanOLrzqt.setLeftContentInfo(str);
                transactionNetworkFeeBeanOLrzqt.setRightContentInfo(charSequence);
                if (!interfaceC9752bbX.h_()) {
                    strKWHzl22 = "";
                }
                transactionNetworkFeeBeanOLrzqt.setPrimaryTip(strKWHzl22);
                transactionNetworkFeeBeanOLrzqt.setSecondTipIcon((Drawable) pairOLrzqt.getFirst());
                CharSequence charSequence3 = (CharSequence) pairOLrzqt.getSecond();
                transactionNetworkFeeBeanOLrzqt.setSecondaryTip(charSequence3 != null ? charSequence3 : "");
                transactionNetworkFeeBeanOLrzqt.setHeaderTitleUnderLineClick(transactionPageFragment.zLjUOn().wlaJM() ? null : transactionNetworkFeeBeanOLrzqt.getHeaderTitleUnderLineClick());
                transactionNetworkFeeBeanOLrzqt.setRootClickCallback(interfaceC9752bbX.AYXKKw().isVariable() ? transactionNetworkFeeBeanOLrzqt.getRootClickCallback() : null);
            }
        }
        transactionPageFragment.zsXlph().notifyItemChanged(i);
        if (transactionPageFragment.zLjUOn().wlaJM()) {
            transactionPageFragment.zLjUOn().fIwbmz().removeObservers(transactionPageFragment);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, String str) {
        List<?> items = transactionPageFragment.zsXlph().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next() instanceof C25148irJ) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return Unit.INSTANCE;
        }
        Object obj = transactionPageFragment.zsXlph().getItems().get(i);
        C25148irJ c25148irJ = obj instanceof C25148irJ ? (C25148irJ) obj : null;
        if (str == null || str.length() == 0) {
            List<?> items2 = transactionPageFragment.zsXlph().getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "");
            C56532yIw.EZpvd(items2).remove(c25148irJ);
            transactionPageFragment.zsXlph().notifyDataSetChanged();
        } else {
            if (c25148irJ != null) {
                c25148irJ.OLrzqt(str);
            }
            transactionPageFragment.zsXlph().notifyItemChanged(i);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, AbstractC9832bcy abstractC9832bcy) {
        Intrinsics.copydefault(abstractC9832bcy);
        transactionPageFragment.AEQbTJ(abstractC9832bcy);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(final TransactionPageFragment transactionPageFragment, Boolean bool) {
        C57436yiQ c57436yiQ;
        View view;
        C21615hFy c21615hFy = transactionPageFragment.gEmmrt;
        if (c21615hFy != null && (c57436yiQ = c21615hFy.OLrzqt) != null) {
            c57436yiQ.setVisibility(0);
            C21615hFy c21615hFy2 = transactionPageFragment.gEmmrt;
            if (c21615hFy2 != null && (view = c21615hFy2.copydefault) != null) {
                view.setVisibility(0);
            }
            c57436yiQ.setViewDataBean(new TransactionTopReminderInfoBean((String) null, C33070mpX.AYXKKw(C23274hvD.Fragment.observeReporter), C33070mpX.AYXKKw(C23274hvD.Fragment.accessobserveReporter), new Function0() { // from class: o.iqs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TransactionPageFragment.ejfBZ(this.copydefault);
                }
            }, (CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
        }
        updateButtonStatus$default(transactionPageFragment, false, 0, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.zLjUOn().zLjUOn().setValue(Boolean.TRUE);
        transactionPageFragment.copydefault("update");
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(TransactionPageFragment transactionPageFragment, Boolean bool) {
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        if (bool.booleanValue()) {
            transactionPageFragment.RJOkX();
            C21615hFy c21615hFy = transactionPageFragment.gEmmrt;
            if (c21615hFy != null && (c55113xdn2 = c21615hFy.gEmmrt) != null) {
                c55113xdn2.setVisibility(0);
            }
        } else {
            transactionPageFragment.QVAiDq();
            C21615hFy c21615hFy2 = transactionPageFragment.gEmmrt;
            if (c21615hFy2 != null && (c55113xdn = c21615hFy2.gEmmrt) != null) {
                c55113xdn.setVisibility(8);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(final TransactionPageFragment transactionPageFragment, Boolean bool) {
        AbstractC58185ywX<String> abstractC58185ywXEZpvd;
        QuotePriceRes quotePriceRes;
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.TRUE);
        QuotePriceRes newProxyInstance = transactionPageFragment.getNewProxyInstance();
        TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
        if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isPMM()) {
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AEQbTJ();
            C23016hqK c23016hqK = C23016hqK.copydefault;
            String strAEQbTJ = transactionPageFragment.AEQbTJ();
            Intrinsics.copydefault(newProxyInstance);
            AbstractC58185ywX<MergeCallData> abstractC58185ywXAEQbTJ = c23016hqK.AEQbTJ(strAEQbTJ, newProxyInstance, transactionPageFragment.AwvSrB(), transactionPageFragment.zLjUOn().EZpvd(newProxyInstance.fromToken().getChainId(), interfaceC9738bbJAEQbTJ), transactionPageFragment.zLjUOn().fJNWhG(), transactionPageFragment.DbNXlk().gEmmrt(), new Function1() { // from class: o.irs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransactionPageFragment.AhwBna(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            AbstractC22977hpY abstractC22977hpYZLjUOn = transactionPageFragment.zLjUOn();
            Intrinsics.copydefault(abstractC22977hpYZLjUOn, "");
            ((AbstractC22992hpn) abstractC22977hpYZLjUOn).KWHzl(abstractC58185ywXAEQbTJ);
            AbstractC22974hpV abstractC22974hpVEjfBZ = transactionPageFragment.ejfBZ();
            LifecycleOwner viewLifecycleOwner = transactionPageFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            abstractC58185ywXEZpvd = abstractC22974hpVEjfBZ.AEQbTJ(newProxyInstance, abstractC58185ywXAEQbTJ, viewLifecycleOwner, transactionPageFragment.AwvSrB());
        } else {
            AbstractC22974hpV abstractC22974hpVEjfBZ2 = transactionPageFragment.ejfBZ();
            QuotePriceRes newProxyInstance2 = transactionPageFragment.getNewProxyInstance();
            Intrinsics.copydefault(newProxyInstance2);
            MergeQuoteCallDataReq mergeQuoteCallDataReqAEQbTJ = abstractC22974hpVEjfBZ2.AEQbTJ(newProxyInstance2, transactionPageFragment.DbNXlk().gEmmrt());
            AbstractC22974hpV abstractC22974hpVEjfBZ3 = transactionPageFragment.ejfBZ();
            Intrinsics.copydefault(newProxyInstance);
            abstractC58185ywXEZpvd = abstractC22974hpVEjfBZ3.EZpvd(newProxyInstance, mergeQuoteCallDataReqAEQbTJ, transactionPageFragment, transactionPageFragment.AwvSrB());
        }
        final Function1 function1 = new Function1() { // from class: o.irr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.irp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.gEmmrt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.irq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.AYXKKw(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.djBIcL(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, transactionPageFragment.zLjUOn().call());
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(TransactionPageFragment transactionPageFragment, boolean z) {
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(TransactionPageFragment transactionPageFragment, String str) {
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(TransactionPageFragment transactionPageFragment, Throwable th) {
        String strAYXKKw;
        QuotePriceRes quotePriceRes;
        if ((th instanceof OKServerException) && ((OKServerException) th).getCode() == 10055) {
            transactionPageFragment.zLjUOn().gEmmrt().setValue(new CallDataError("10055", (String) null, true, 2, (DefaultConstructorMarker) null));
        } else {
            TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
            if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isPMM()) {
                showNotification$default(transactionPageFragment, C33070mpX.AYXKKw(C23274hvD.Fragment.dispose), 5, 5000L, false, null, 24, null);
            } else if (!(th instanceof BtcEncryptException)) {
                String message = th.getMessage();
                if (message == null || message.length() == 0) {
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu);
                } else {
                    strAYXKKw = th.getMessage();
                }
                if (strAYXKKw != null) {
                    C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (Object) null);
                }
            }
        }
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(TransactionPageFragment transactionPageFragment, QuotePriceRes quotePriceRes) {
        TransactionBean transactionBeanFJNWhG = transactionPageFragment.zLjUOn().fJNWhG();
        if (transactionBeanFJNWhG != null) {
            transactionBeanFJNWhG.setQuotePriceRes(quotePriceRes);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, QuotePriceRes quotePriceRes) {
        transactionPageFragment.AYXKKw = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(transactionPageFragment), null, null, new TransactionPageFragment$addErrorDataListener$9$1(transactionPageFragment, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(TransactionPageFragment transactionPageFragment, boolean z) {
        transactionPageFragment.ejfBZ().AkhnZx();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(TransactionPageFragment transactionPageFragment, boolean z) {
        C57468yiw c57468yiw;
        C52794wYp c52794wYpEZpvd;
        C21615hFy c21615hFy = transactionPageFragment.gEmmrt;
        if (Intrinsics.EZpvd((Object) ((c21615hFy == null || (c57468yiw = c21615hFy.AYXKKw) == null || (c52794wYpEZpvd = c57468yiw.EZpvd()) == null) ? null : c52794wYpEZpvd.getText()), (Object) transactionPageFragment.iwGUEr())) {
            transactionPageFragment.zLjUOn().values().setValue(Boolean.TRUE);
            transactionPageFragment.copydefault(Web3SecurityTrackEvent.VALUE_CONFIRM);
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(TransactionPageFragment transactionPageFragment, boolean z) {
        AbstractC9832bcy value = transactionPageFragment.zLjUOn().valueOf().getValue();
        if (value != null) {
            transactionPageFragment.AEQbTJ(value);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof BtcEncryptException) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.getStarRating, 0, 1, (Object) null);
        } else {
            String message = th.getMessage();
            if (message != null) {
                C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(TransactionPageFragment transactionPageFragment, String str) {
        Intrinsics.copydefault((Object) str);
        transactionPageFragment.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public final void QVAiDq() {
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null) {
            c21615hFy.AYXKKw.EZpvd().fIwbmz();
            c21615hFy.AYXKKw.EZpvd().setContentDescription("web3_dex_transaction_confirm_button");
        }
    }

    public final void RJOkX() {
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null) {
            C52794wYp.startLoading$default(c21615hFy.AYXKKw.EZpvd(), 0L, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(final AbstractC9832bcy abstractC9832bcy) {
        CharSequence charSequenceCopydefault;
        InterfaceC9752bbX interfaceC9752bbXGEmmrt;
        C57436yiQ c57436yiQ;
        View view;
        final InterfaceC9752bbX interfaceC9752bbXGEmmrt2;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        C57436yiQ c57436yiQ2;
        View view2;
        InterfaceC9752bbX interfaceC9752bbXGEmmrt3;
        C57436yiQ c57436yiQ3;
        View view3;
        final InterfaceC9731bbC interfaceC9731bbCEZpvd2;
        C57436yiQ c57436yiQ4;
        View view4;
        C57436yiQ c57436yiQ5;
        View view5;
        C57468yiw c57468yiw;
        View view6;
        C57436yiQ c57436yiQ6;
        Context context = getContext();
        if (context == null) {
            charSequenceCopydefault = "";
        } else {
            InterfaceC9734bbF interfaceC9734bbFDjBIcL = ejfBZ().djBIcL();
            charSequenceCopydefault = interfaceC9734bbFDjBIcL != null ? getFieldNames().copydefault(context, abstractC9832bcy, interfaceC9734bbFDjBIcL) : null;
            if (charSequenceCopydefault == null) {
            }
        }
        CharSequence charSequence = charSequenceCopydefault;
        AuCTelauCTel();
        if (Intrinsics.EZpvd(abstractC9832bcy, C9863bdc.EZpvd)) {
            C21615hFy c21615hFy = this.gEmmrt;
            if (c21615hFy != null && (c57436yiQ6 = c21615hFy.OLrzqt) != null) {
                c57436yiQ6.setVisibility(8);
            }
            C21615hFy c21615hFy2 = this.gEmmrt;
            if (c21615hFy2 != null && (view6 = c21615hFy2.copydefault) != null) {
                view6.setVisibility(8);
            }
            updateButtonStatus$default(this, true, 0, null, 4, null);
            C21615hFy c21615hFy3 = this.gEmmrt;
            if (c21615hFy3 != null && (c57468yiw = c21615hFy3.AYXKKw) != null) {
                c57468yiw.setSecondaryButtonText(iwGUEr());
            }
            zLjUOn().ejfBZ().setValue(Boolean.TRUE);
            return;
        }
        if (abstractC9832bcy instanceof C9868bdh) {
            C21615hFy c21615hFy4 = this.gEmmrt;
            if (c21615hFy4 != null && (c57436yiQ5 = c21615hFy4.OLrzqt) != null) {
                c57436yiQ5.setVisibility(0);
                C21615hFy c21615hFy5 = this.gEmmrt;
                if (c21615hFy5 != null && (view5 = c21615hFy5.copydefault) != null) {
                    view5.setVisibility(0);
                }
                c57436yiQ5.setViewDataBean(new TransactionTopReminderInfoBean((String) null, charSequence, (CharSequence) null, (Function0) null, (CharSequence) null, (Function0) null, 61, (DefaultConstructorMarker) null));
            }
            updateButtonStatus$default(this, false, 0, null, 4, null);
            if (AkhnZx()) {
                return;
            }
            QbewEr();
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9786bcE) {
            InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
            interfaceC9752bbXGEmmrt2 = interfaceC9734bbFHDKMBd != null ? interfaceC9734bbFHDKMBd.gEmmrt() : null;
            if (interfaceC9752bbXGEmmrt2 == null || (interfaceC9731bbCEZpvd2 = interfaceC9752bbXGEmmrt2.EZpvd()) == null) {
                return;
            }
            C21615hFy c21615hFy6 = this.gEmmrt;
            if (c21615hFy6 != null && (c57436yiQ4 = c21615hFy6.OLrzqt) != null) {
                c57436yiQ4.setVisibility(0);
                C21615hFy c21615hFy7 = this.gEmmrt;
                if (c21615hFy7 != null && (view4 = c21615hFy7.copydefault) != null) {
                    view4.setVisibility(0);
                }
                c57436yiQ4.setViewDataBean(new TransactionTopReminderInfoBean((String) null, charSequence, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9752bbXGEmmrt2.EZpvd().fJNWhG()))), new Function0() { // from class: o.irf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.zLjUOn(this.copydefault);
                    }
                }, C33069mpW.copydefault(C23274hvD.Fragment.remove, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9731bbCEZpvd2.fJNWhG()))), new Function0() { // from class: o.irj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.EZpvd(this.EZpvd, interfaceC9752bbXGEmmrt2, abstractC9832bcy, interfaceC9731bbCEZpvd2);
                    }
                }, 1, (DefaultConstructorMarker) null));
            }
            updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9784bcC) {
            InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = hDKMBd();
            if (interfaceC9734bbFHDKMBd2 == null || (interfaceC9752bbXGEmmrt3 = interfaceC9734bbFHDKMBd2.gEmmrt()) == null) {
                return;
            }
            C21615hFy c21615hFy8 = this.gEmmrt;
            if (c21615hFy8 != null && (c57436yiQ3 = c21615hFy8.OLrzqt) != null) {
                c57436yiQ3.setVisibility(0);
                C21615hFy c21615hFy9 = this.gEmmrt;
                if (c21615hFy9 != null && (view3 = c21615hFy9.copydefault) != null) {
                    view3.setVisibility(0);
                }
                c57436yiQ3.setViewDataBean(new TransactionTopReminderInfoBean((String) null, charSequence, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9752bbXGEmmrt3.EZpvd().fJNWhG()))), new Function0() { // from class: o.irm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.gHZMYf(this.EZpvd);
                    }
                }, (CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            }
            updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if ((abstractC9832bcy instanceof C9808bca) || (abstractC9832bcy instanceof C9754bbZ)) {
            InterfaceC9734bbF interfaceC9734bbFHDKMBd3 = hDKMBd();
            if (interfaceC9734bbFHDKMBd3 == null || (interfaceC9752bbXGEmmrt = interfaceC9734bbFHDKMBd3.gEmmrt()) == null) {
                return;
            }
            interfaceC9752bbXGEmmrt.EZpvd().OLrzqt();
            C33129mqd.gEmmrt(Long.valueOf(interfaceC9752bbXGEmmrt.EZpvd().fetchVPNInfo()));
            C21615hFy c21615hFy10 = this.gEmmrt;
            if (c21615hFy10 != null && (c57436yiQ = c21615hFy10.OLrzqt) != null) {
                c57436yiQ.setVisibility(0);
                C21615hFy c21615hFy11 = this.gEmmrt;
                if (c21615hFy11 != null && (view = c21615hFy11.copydefault) != null) {
                    view.setVisibility(0);
                }
                c57436yiQ.setViewDataBean(new TransactionTopReminderInfoBean((String) null, charSequence, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9752bbXGEmmrt.EZpvd().fJNWhG()))), new Function0() { // from class: o.irl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.zuBGHE(this.EZpvd);
                    }
                }, (CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            }
            updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        if (abstractC9832bcy instanceof C9885bdy) {
            InterfaceC9734bbF interfaceC9734bbFHDKMBd4 = hDKMBd();
            interfaceC9752bbXGEmmrt2 = interfaceC9734bbFHDKMBd4 != null ? interfaceC9734bbFHDKMBd4.gEmmrt() : null;
            if (interfaceC9752bbXGEmmrt2 == null || (interfaceC9731bbCEZpvd = interfaceC9752bbXGEmmrt2.EZpvd()) == null) {
                return;
            }
            C21615hFy c21615hFy12 = this.gEmmrt;
            if (c21615hFy12 != null && (c57436yiQ2 = c21615hFy12.OLrzqt) != null) {
                c57436yiQ2.setVisibility(0);
                C21615hFy c21615hFy13 = this.gEmmrt;
                if (c21615hFy13 != null && (view2 = c21615hFy13.copydefault) != null) {
                    view2.setVisibility(0);
                }
                c57436yiQ2.setViewDataBean(new TransactionTopReminderInfoBean((String) null, charSequence, C33069mpW.copydefault(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwner, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", interfaceC9731bbCEZpvd.fJNWhG()))), new Function0() { // from class: o.irn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TransactionPageFragment.AwvSrB(this.copydefault);
                    }
                }, (CharSequence) null, (Function0) null, 49, (DefaultConstructorMarker) null));
            }
            updateButtonStatus$default(this, false, 0, null, 4, null);
            ejfBZ().DbNXlk();
            return;
        }
        AEQbTJ(abstractC9832bcy, charSequence.toString());
    }

    public static final Unit zLjUOn(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(TransactionPageFragment transactionPageFragment, InterfaceC9752bbX interfaceC9752bbX, AbstractC9832bcy abstractC9832bcy, InterfaceC9731bbC interfaceC9731bbC) {
        transactionPageFragment.KWHzl(interfaceC9752bbX, (C9786bcE) abstractC9832bcy, interfaceC9731bbC);
        return Unit.INSTANCE;
    }

    public static final Unit gHZMYf(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.ORxRYg();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AkhnZx() {
        List<?> items = zsXlph().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next() instanceof C25147irI) {
                if (i == -1) {
                    break;
                }
                return false;
            }
            i++;
        }
    }

    public void QbewEr() {
        TransactionNetworkFeeBean transactionNetworkFeeBeanOLrzqt;
        List<?> items = zsXlph().getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        Iterator<?> it = items.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof C25147irI) {
                break;
            } else {
                i++;
            }
        }
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        InterfaceC9731bbC interfaceC9731bbCAYXKKw = interfaceC9734bbFHDKMBd != null ? interfaceC9734bbFHDKMBd.AYXKKw() : null;
        String strDjBIcL = interfaceC9731bbCAYXKKw != null ? interfaceC9731bbCAYXKKw.djBIcL() : null;
        if (strDjBIcL == null) {
            strDjBIcL = "";
        }
        Object obj = zsXlph().getItems().get(i);
        C25147irI c25147irI = obj instanceof C25147irI ? (C25147irI) obj : null;
        if (c25147irI != null) {
            c25147irI.KWHzl(false);
        }
        if (c25147irI != null && (transactionNetworkFeeBeanOLrzqt = c25147irI.OLrzqt()) != null) {
            transactionNetworkFeeBeanOLrzqt.setHeaderImgRes(interfaceC9731bbCAYXKKw != null ? interfaceC9731bbCAYXKKw.DbNXlk() : null);
            transactionNetworkFeeBeanOLrzqt.setHeaderTitle(C25189iry.copydefault(strDjBIcL));
            transactionNetworkFeeBeanOLrzqt.setLeftContentInfo("--");
            transactionNetworkFeeBeanOLrzqt.setRightContentInfo("");
            transactionNetworkFeeBeanOLrzqt.setPrimaryTip("");
            if (zLjUOn().wlaJM()) {
                transactionNetworkFeeBeanOLrzqt.setRootClickCallback(null);
            }
        }
        zsXlph().notifyItemChanged(i);
    }

    public final void KWHzl(final InterfaceC9752bbX interfaceC9752bbX, final C9786bcE c9786bcE, final InterfaceC9731bbC interfaceC9731bbC) {
        AbstractC58185ywX<String> abstractC58185ywXEZpvd;
        QuotePriceRes quotePriceRes;
        zLjUOn().DbNXlk().setValue(Boolean.TRUE);
        swapContractInteractionButtonClick$default(this, "reserve", null, 2, null);
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        TransactionBean transactionBeanValueOf = DbNXlk().valueOf();
        if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isPMM()) {
            InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AEQbTJ();
            C23016hqK c23016hqK = C23016hqK.copydefault;
            String strAEQbTJ = AEQbTJ();
            Intrinsics.copydefault(newProxyInstance);
            AbstractC58185ywX<MergeCallData> abstractC58185ywXAEQbTJ = c23016hqK.AEQbTJ(strAEQbTJ, newProxyInstance, AwvSrB(), zLjUOn().EZpvd(newProxyInstance.fromToken().getChainId(), interfaceC9738bbJAEQbTJ), zLjUOn().fJNWhG(), DbNXlk().gEmmrt(), new Function1() { // from class: o.iqH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TransactionPageFragment.fetchVPNInfo(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            AbstractC22977hpY abstractC22977hpYZLjUOn = zLjUOn();
            Intrinsics.copydefault(abstractC22977hpYZLjUOn, "");
            ((AbstractC22992hpn) abstractC22977hpYZLjUOn).KWHzl(abstractC58185ywXAEQbTJ);
            AbstractC22974hpV abstractC22974hpVEjfBZ = ejfBZ();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            abstractC58185ywXEZpvd = abstractC22974hpVEjfBZ.AEQbTJ(newProxyInstance, abstractC58185ywXAEQbTJ, viewLifecycleOwner, AwvSrB());
        } else {
            AbstractC22974hpV abstractC22974hpVEjfBZ2 = ejfBZ();
            Intrinsics.copydefault(newProxyInstance);
            AbstractC22974hpV abstractC22974hpVEjfBZ3 = ejfBZ();
            QuotePriceRes newProxyInstance2 = getNewProxyInstance();
            Intrinsics.copydefault(newProxyInstance2);
            MergeQuoteCallDataReq mergeQuoteCallDataReqAEQbTJ = abstractC22974hpVEjfBZ3.AEQbTJ(newProxyInstance2, DbNXlk().gEmmrt());
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            abstractC58185ywXEZpvd = abstractC22974hpVEjfBZ2.EZpvd(newProxyInstance, mergeQuoteCallDataReqAEQbTJ, viewLifecycleOwner2, AwvSrB());
        }
        final Function1 function1 = new Function1() { // from class: o.iqI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.copydefault(this.KWHzl, interfaceC9752bbX, c9786bcE, interfaceC9731bbC, (java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.iqJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.isConnected(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.iqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return TransactionPageFragment.gEmmrt(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.iqG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                TransactionPageFragment.AkhnZx(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, zLjUOn().call());
    }

    public static final Unit fetchVPNInfo(TransactionPageFragment transactionPageFragment, boolean z) {
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(TransactionPageFragment transactionPageFragment, InterfaceC9752bbX interfaceC9752bbX, C9786bcE c9786bcE, InterfaceC9731bbC interfaceC9731bbC, String str) {
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        FragmentActivity activity = transactionPageFragment.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setTitle(C33069mpW.copydefault(C23274hvD.Fragment.removeCancellable, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", interfaceC9752bbX.EZpvd(c9786bcE.AEQbTJ(), false)), C56390yDp.OLrzqt("symbol", interfaceC9731bbC.fJNWhG()))));
        c55097xdX.setState(2);
        c55097xdX.setType(1);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(TransactionPageFragment transactionPageFragment, Throwable th) {
        String strAYXKKw;
        QuotePriceRes quotePriceRes;
        transactionPageFragment.zLjUOn().DbNXlk().setValue(Boolean.FALSE);
        TransactionBean transactionBeanValueOf = transactionPageFragment.DbNXlk().valueOf();
        if (transactionBeanValueOf != null && (quotePriceRes = transactionBeanValueOf.getQuotePriceRes()) != null && quotePriceRes.isPMM()) {
            showNotification$default(transactionPageFragment, C33070mpX.AYXKKw(C23274hvD.Fragment.dispose), 5, 5000L, false, null, 24, null);
        } else if (!(th instanceof BtcEncryptException)) {
            String message = th.getMessage();
            if (message == null || message.length() == 0) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu);
            } else {
                strAYXKKw = th.getMessage();
            }
            if (strAYXKKw != null) {
                C55326xho.toastWithFailedIcon$default(strAYXKKw, 0, 1, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public final InterfaceC9734bbF hDKMBd() {
        return ejfBZ().djBIcL();
    }

    public final InterfaceC9740bbL getFieldNames() {
        return C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
    }

    public final AbstractC22974hpV ejfBZ() {
        return zLjUOn().AYXKKw();
    }

    public final void AYXKKw() {
        C57468yiw c57468yiw;
        TransactionButtonGroupInfoBean transactionButtonGroupInfoBean = new TransactionButtonGroupInfoBean("", iwGUEr(), new Function0() { // from class: o.iqZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionPageFragment.getNewProxyInstance(this.AEQbTJ);
            }
        }, this.DbNXlk);
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy == null || (c57468yiw = c21615hFy.AYXKKw) == null) {
            return;
        }
        c57468yiw.setViewDataBean(transactionButtonGroupInfoBean);
    }

    public static final Unit getNewProxyInstance(TransactionPageFragment transactionPageFragment) {
        FragmentActivity activity = transactionPageFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("cancel_action_from_tx_page", true);
            Unit unit = Unit.INSTANCE;
            activity.setResult(-1, intent);
        }
        transactionPageFragment.zLjUOn().AhwBna().setValue(Boolean.TRUE);
        transactionPageFragment.copydefault(OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
        return Unit.INSTANCE;
    }

    public static final Unit AubY(TransactionPageFragment transactionPageFragment) {
        transactionPageFragment.djSkpj();
        return Unit.INSTANCE;
    }

    private final void djSkpj() {
        if (dNCPSb()) {
            copydefault(zLjUOn().valueOf().getValue());
        } else {
            zLjUOn().isConnected().setValue(Boolean.TRUE);
        }
    }

    private final boolean dNCPSb() {
        AbstractC9832bcy value = zLjUOn().valueOf().getValue();
        if (value != null) {
            return value.EZpvd();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ejfBZ().DbNXlk();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        if (interfaceC9734bbFHDKMBd != null) {
            interfaceC9734bbFHDKMBd.copydefault();
        }
    }

    public final TransactionHeaderInfoBean DTwDnp() {
        String str;
        String payText;
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == null) {
            return new TransactionHeaderInfoBean(null, null, false, null, null, null, null, 127, null);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = newProxyInstance.fromToken();
        String strOLrzqt = C25189iry.OLrzqt(false, newProxyInstance);
        if (zLjUOn().AubY()) {
            str = "≈" + C25189iry.KWHzl(newProxyInstance.getCommonDexInfo().getFromTokenPrice());
        } else {
            str = "";
        }
        List<TransactionHeaderInfoBean.HeaderSimpleDataBean> listAEQbTJ = AEQbTJ(dexMultiTokenInfoBeanFromToken, "- " + strOLrzqt, str);
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        return new TransactionHeaderInfoBean((transactionBeanFJNWhG == null || (payText = transactionBeanFJNWhG.getPayText()) == null) ? "" : payText, listAEQbTJ, false, null, null, null, null, 120, null);
    }

    public final List<TransactionHeaderInfoBean.HeaderSimpleDataBean> AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, String str, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TransactionHeaderInfoBean.HeaderSimpleDataBean(0, 0.0f, 0, 0, dexMultiTokenInfoBean.getTokenLogoUrl(), dexMultiTokenInfoBean.getChainLogoUrl(), C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv), C33070mpX.KWHzl(C57406yhn.Activity.QKVWgx), str, C23319hvw.OLrzqt(dexMultiTokenInfoBean.getTokenSymbol()), false, charSequence, null, null, 0, null, null, null, null, null, 1045519, null));
        return arrayList;
    }

    public final TransactionHeaderInfoBean QOLQEE() {
        String str;
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        if (newProxyInstance == null) {
            return new TransactionHeaderInfoBean(null, null, false, null, null, null, null, 127, null);
        }
        DexMultiTokenInfoBean token = newProxyInstance.toToken();
        String strAEQbTJ = C25189iry.AEQbTJ(false, newProxyInstance);
        if (zLjUOn().zsXlph()) {
            str = "≈" + C25189iry.KWHzl(false, newProxyInstance);
        } else {
            str = "";
        }
        return new TransactionHeaderInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnCompositioncheckReporter1), AEQbTJ(token, "+ " + strAEQbTJ, str), false, null, null, null, null, 120, null);
    }

    public final TransactionGeneralInfoBean isConnected() {
        DeFiPlatformForSwap selectedDeFiPlatform;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV);
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        String name = null;
        String logo = (newProxyInstance == null || (selectedDeFiPlatform2 = newProxyInstance.getSelectedDeFiPlatform()) == null) ? null : selectedDeFiPlatform2.getLogo();
        Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
        QuotePriceRes newProxyInstance2 = getNewProxyInstance();
        if (newProxyInstance2 != null && (selectedDeFiPlatform = newProxyInstance2.getSelectedDeFiPlatform()) != null) {
            name = selectedDeFiPlatform.getName();
        }
        return new TransactionGeneralInfoBean(strAYXKKw, false, name == null ? "" : name, null, null, logo, drawableKWHzl, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524186, null);
    }

    public final C25147irI AxsJAY() {
        String strDjBIcL;
        String strEZpvd;
        String strDbNXlk;
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        InterfaceC9731bbC interfaceC9731bbCAYXKKw = interfaceC9734bbFHDKMBd != null ? interfaceC9734bbFHDKMBd.AYXKKw() : null;
        String str = (interfaceC9731bbCAYXKKw == null || (strDbNXlk = interfaceC9731bbCAYXKKw.DbNXlk()) == null) ? "" : strDbNXlk;
        if (interfaceC9731bbCAYXKKw == null || (strDjBIcL = interfaceC9731bbCAYXKKw.djBIcL()) == null) {
            strDjBIcL = "";
        }
        InterfaceC9752bbX value = zLjUOn().fIwbmz().getValue();
        if (value == null) {
            return new C25147irI(false, new TransactionNetworkFeeBean(str, C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv), C25189iry.copydefault(strDjBIcL), null, null, null, null, null, zLjUOn().wlaJM() ? null : this.fetchVPNInfo, zLjUOn().wlaJM() ? null : this.AkhnZx, false, null, null, 7416, null), 1, null);
        }
        String strAddCheckS$default = C23313hvq.addCheckS$default(value.AEQbTJ(), gHZMYf() ? fARcdN() : "0", null, null, null, 14, null);
        String feeCoinAmount$default = InterfaceC9752bbX.Activity.formatFeeCoinAmount$default(value, strAddCheckS$default, false, 2, null);
        String feeCoinAmount$default2 = InterfaceC9752bbX.Activity.formatFeeCoinAmount$default(value, value.OLrzqt(), false, 2, null);
        String strKWHzl = value.KWHzl(value.OLrzqt(), false);
        InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AYXKKw();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = hDKMBd();
        if (interfaceC9734bbFHDKMBd2 == null || (strEZpvd = interfaceC9740bbLAYXKKw.EZpvd(interfaceC9734bbFHDKMBd2)) == null) {
            strEZpvd = "";
        }
        String strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.LocalFullyDrawnReporterOwnerLocalFullyDrawnReporterOwner1, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("maxFeeCoinAmount", feeCoinAmount$default2), C56390yDp.OLrzqt("maxFeeCurrency", strKWHzl)));
        if (zLjUOn().wlaJM()) {
            return new C25147irI(false, new TransactionNetworkFeeBean(null, null, C25189iry.copydefault(strDjBIcL), null, OLrzqt(value, strAddCheckS$default), value.h_() ? strKWHzl2 : "", null, null, null, null, false, null, null, 8139, null));
        }
        return new C25147irI(value.gEmmrt(), new TransactionNetworkFeeBean(str, C33070mpX.KWHzl(C52761wXj.TaskDescription.dzCpvv), C25189iry.copydefault(strDjBIcL), strEZpvd, feeCoinAmount$default, value.h_() ? strKWHzl2 : "", null, null, this.fetchVPNInfo, value.AYXKKw().isVariable() ? this.AkhnZx : null, false, null, null, 7360, null));
    }

    public final String OLrzqt(InterfaceC9752bbX interfaceC9752bbX, String str) {
        String strKWHzl = interfaceC9752bbX.KWHzl(str, false);
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            return strKWHzl + " ≈ " + interfaceC9752bbX.EZpvd().fJNWhG() + " " + interfaceC9752bbX.EZpvd(str, false);
        }
        return InterfaceC9752bbX.Activity.formatFeeCoinAmount$default(interfaceC9752bbX, str, false, 2, null) + " ≈ " + strKWHzl;
    }

    public static final Unit zsXlph(TransactionPageFragment transactionPageFragment) {
        String strKWHzl;
        String strDjBIcL;
        String strKWHzl2;
        String strAYXKKw;
        if (transactionPageFragment.zLjUOn().AuCTel() == TransactionType.INQUIRY_TYPE) {
            QuotePriceRes newProxyInstance = transactionPageFragment.getNewProxyInstance();
            C22333hdQ estimateBridgeFeeAmount = newProxyInstance != null ? newProxyInstance.getEstimateBridgeFeeAmount() : null;
            Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int i = C23274hvD.Fragment.RsCxkX;
            Pair[] pairArr = new Pair[3];
            String str = "--";
            if (estimateBridgeFeeAmount == null || (strDjBIcL = estimateBridgeFeeAmount.djBIcL()) == null) {
                strDjBIcL = "--";
            }
            pairArr[0] = C56390yDp.OLrzqt("value", strDjBIcL);
            if (estimateBridgeFeeAmount == null || (strKWHzl2 = estimateBridgeFeeAmount.KWHzl()) == null) {
                strKWHzl2 = "--";
            }
            pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strKWHzl2);
            if (estimateBridgeFeeAmount != null && (strAYXKKw = estimateBridgeFeeAmount.AYXKKw()) != null) {
                str = strAYXKKw;
            }
            pairArr[2] = C56390yDp.OLrzqt("symbol", str);
            strKWHzl = C33069mpW.KWHzl(applicationOLrzqt, i, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr));
        } else {
            strKWHzl = "";
        }
        Context context = transactionPageFragment.getContext();
        if (context != null) {
            C25352ivB.OLrzqt(context, "", strKWHzl, C23274hvD.Fragment.ihnvzI);
        }
        return Unit.INSTANCE;
    }

    public static final Unit wlaJM(TransactionPageFragment transactionPageFragment) {
        InterfaceC9734bbF interfaceC9734bbFDjBIcL = transactionPageFragment.ejfBZ().djBIcL();
        if (interfaceC9734bbFDjBIcL != null) {
            InterfaceC9740bbL interfaceC9740bbLAYXKKw = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AYXKKw();
            FragmentManager childFragmentManager = transactionPageFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            InterfaceC9740bbL.Application.openTransactionFeePage$default(interfaceC9740bbLAYXKKw, childFragmentManager, interfaceC9734bbFDjBIcL, null, 4, null);
            swapContractInteractionButtonClick$default(transactionPageFragment, "network_fee", null, 2, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ TransactionAddressInfoBean walletUsedData$default(TransactionPageFragment transactionPageFragment, Integer num, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: walletUsedData");
        }
        if ((i & 1) != 0) {
            num = null;
        }
        return transactionPageFragment.AEQbTJ(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TransactionAddressInfoBean AEQbTJ(Integer num) {
        String str;
        String strCopydefault;
        if (!zLjUOn().AuCTelauCTel()) {
            return new TransactionAddressInfoBean((String) null, (String) null, (String) null, (String) null, false, (Function0) null, (String) null, false, (Function0) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = fIwbmz();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(AEQbTJ()).fARcdN().AEQbTJ();
        String strAYXKKw = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.AYXKKw() : null;
        String strEZpvd = "";
        String str2 = strAYXKKw == null ? "" : strAYXKKw;
        if (num != null) {
            int iIntValue = num.intValue();
            if (interfaceC9738bbJAEQbTJ != null) {
                strCopydefault = interfaceC9738bbJAEQbTJ.copydefault(C33129mqd.valueOf(dexMultiTokenInfoBeanFIwbmz != null ? dexMultiTokenInfoBeanFIwbmz.getChainId() : null), iIntValue);
            } else {
                strCopydefault = null;
            }
            if (strCopydefault == null) {
                if (interfaceC9738bbJAEQbTJ != null) {
                    strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBeanFIwbmz != null ? dexMultiTokenInfoBeanFIwbmz.getChainId() : null));
                }
                str = strEZpvd;
            } else {
                str = strCopydefault;
            }
        }
        return new TransactionAddressInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnCompositionsnapshotStateObserver1), str, str2, (String) null, true, (Function0) this.valueOf, (String) null, false, (Function0) null, 456, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit iwGUEr(TransactionPageFragment transactionPageFragment) {
        String strEZpvd;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = transactionPageFragment.fIwbmz();
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null) {
            strEZpvd = "";
        } else {
            strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(dexMultiTokenInfoBeanFIwbmz != null ? dexMultiTokenInfoBeanFIwbmz.getChainId() : null));
            if (strEZpvd == null) {
            }
        }
        if (transactionPageFragment.ejfBZ().djBIcL() != null) {
            C25352ivB.copydefault(strEZpvd);
            C25281itk.Companion.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId), strEZpvd).AEQbTJ(transactionPageFragment.requireContext());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dexlogic.bean.QuotePriceRes.getSelectRouterItem$default(com.okinc.business.dexlogic.bean.QuotePriceRes, java.lang.String, int, java.lang.Object):com.okinc.business.dexlogic.bean.PathSelectionRouterItem */
    public void OLrzqt(@NotNull List<Object> list) {
        final QuotePriceRes quotePriceRes;
        DexMultiTokenInfoBean crossToToken;
        final ServiceFeeInfo serviceFeeInfo;
        Intrinsics.checkNotNullParameter(list, "");
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        if (transactionBeanFJNWhG == null || (quotePriceRes = transactionBeanFJNWhG.getQuotePriceRes()) == null) {
            return;
        }
        if (quotePriceRes.isSingle()) {
            TransactionBean transactionBeanFJNWhG2 = zLjUOn().fJNWhG();
            if (transactionBeanFJNWhG2 == null || (serviceFeeInfo = transactionBeanFJNWhG2.getServiceFeeInfo()) == null || !serviceFeeInfo.isDisplay()) {
                return;
            }
            list.add(new C25150irL(C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged), C25404iwA.AEQbTJ(serviceFeeInfo), 0, new Function0() { // from class: o.ire
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TransactionPageFragment.copydefault(serviceFeeInfo, this);
                }
            }, 4, null));
            return;
        }
        if (quotePriceRes.getCommonDexInfo().isOpenServiceFee()) {
            String tokenSymbol = null;
            final PathSelectionRouterItem selectRouterItem$default = QuotePriceRes.getSelectRouterItem$default(quotePriceRes, null, 1, null);
            if (selectRouterItem$default == null) {
                return;
            }
            String toSwapServiceFee = selectRouterItem$default.getToSwapServiceFee();
            DexQuoteBridgeVO bridge = selectRouterItem$default.getBridge();
            if (bridge != null && (crossToToken = bridge.getCrossToToken()) != null) {
                tokenSymbol = crossToToken.getTokenSymbol();
            }
            String str = tokenSymbol == null ? "" : tokenSymbol;
            RoundingMode roundingMode = RoundingMode.UP;
            String localizedNumberWithSymbol$default = C23322hvz.toLocalizedNumberWithSymbol$default(toSwapServiceFee, str, false, roundingMode, false, false, 26, null);
            String localizedCurrencyNumberWithPrefix$default = C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(selectRouterItem$default.getToSwapServiceFeeUsd(), false, roundingMode, false, false, 13, null);
            if (!C23313hvq.copydefault(selectRouterItem$default.getToSwapServiceFeeUsd(), 0)) {
                localizedCurrencyNumberWithPrefix$default = localizedNumberWithSymbol$default + " (" + localizedCurrencyNumberWithPrefix$default + ")";
            }
            list.add(new C25150irL(C33070mpX.AYXKKw(C23274hvD.Fragment.sendVolumeInfoChanged), localizedCurrencyNumberWithPrefix$default, 0, new Function0() { // from class: o.irg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return TransactionPageFragment.AEQbTJ(selectRouterItem$default, quotePriceRes, this);
                }
            }, 4, null));
        }
    }

    public static final Unit copydefault(ServiceFeeInfo serviceFeeInfo, TransactionPageFragment transactionPageFragment) {
        Context contextRequireContext = transactionPageFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25404iwA.copydefault(serviceFeeInfo, contextRequireContext);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(PathSelectionRouterItem pathSelectionRouterItem, final QuotePriceRes quotePriceRes, final TransactionPageFragment transactionPageFragment) {
        String strCopydefault;
        DexMultiTokenInfoBean crossToToken;
        if (C23313hvq.copydefault(pathSelectionRouterItem.getToSwapServiceFeeUsd(), 0)) {
            strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.getRemoteControlClient, C56424yEw.gEmmrt(C56390yDp.OLrzqt("value", C23272hvB.KWHzl.OLrzqt().getSymbol()), C56390yDp.OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener))));
        } else {
            String toSwapServiceFee = pathSelectionRouterItem.getToSwapServiceFee();
            RoundingMode roundingMode = RoundingMode.UP;
            String localizedNumber$default = C23322hvz.toLocalizedNumber$default(toSwapServiceFee, false, roundingMode, false, false, 13, (Object) null);
            String localizedCurrencyNumberWithPrefix$default = C23322hvz.toLocalizedCurrencyNumberWithPrefix$default(pathSelectionRouterItem.getToSwapServiceFeeUsd(), false, roundingMode, false, false, 13, null);
            int i = C23274hvD.Fragment.getCallingPackage;
            Pair[] pairArr = new Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("value", localizedCurrencyNumberWithPrefix$default);
            pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, localizedNumber$default);
            DexQuoteBridgeVO bridge = pathSelectionRouterItem.getBridge();
            String tokenSymbol = (bridge == null || (crossToToken = bridge.getCrossToToken()) == null) ? null : crossToToken.getTokenSymbol();
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            pairArr[2] = C56390yDp.OLrzqt("symbol", tokenSymbol);
            DexMultiTokenInfoBean toToken = quotePriceRes.getCommonDexInfo().getToToken();
            String chainName = toToken != null ? toToken.getChainName() : null;
            if (chainName == null) {
                chainName = "";
            }
            pairArr[3] = C56390yDp.OLrzqt("toChain", chainName);
            pairArr[4] = C56390yDp.OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener));
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        Spannable spannableAEQbTJ = C24324ibg.Companion.KWHzl(strCopydefault).OLrzqt("article", C33070mpX.AYXKKw(C23274hvD.Fragment.removeOnActiveChangeListener), (60 & 4) != 0 ? C55051xce.OLrzqt.valueOf() : null, (60 & 8) != 0 ? C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl) : 0, (60 & 16) != 0 ? 0 : 0, (60 & 32) != 0, new Function0() { // from class: o.ird
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionPageFragment.AhwBna(this.AEQbTJ, quotePriceRes);
            }
        }).AEQbTJ();
        Context contextRequireContext = transactionPageFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.onViewAttachedToWindow));
        viewOnClickListenerC54939xaY.EZpvd(spannableAEQbTJ);
        String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(TransactionPageFragment transactionPageFragment, QuotePriceRes quotePriceRes) {
        Context contextRequireContext = transactionPageFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25352ivB.OLrzqt(contextRequireContext, quotePriceRes.getCommonDexInfo().getServiceFeeRfqUrl());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <VM extends AbstractC22977hpY> Object AEQbTJ(TransactionPageFragment<VM> transactionPageFragment, Continuation<? super C25144irF> continuation) throws Throwable {
        TransactionPageFragment$getBoostBean$1 transactionPageFragment$getBoostBean$1;
        BoostEstimateVolumeResponse boostEstimateVolumeResponse;
        QuotePriceRes quotePriceRes;
        String defiPlatformId;
        Object objAEQbTJ;
        String strEZpvd;
        final TransactionPageFragment<VM> transactionPageFragment2 = transactionPageFragment;
        if (continuation instanceof TransactionPageFragment$getBoostBean$1) {
            transactionPageFragment$getBoostBean$1 = (TransactionPageFragment$getBoostBean$1) continuation;
            int i = transactionPageFragment$getBoostBean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                transactionPageFragment$getBoostBean$1.label = i - Integer.MIN_VALUE;
            } else {
                transactionPageFragment$getBoostBean$1 = new TransactionPageFragment$getBoostBean$1(transactionPageFragment2, continuation);
            }
        }
        TransactionPageFragment$getBoostBean$1 transactionPageFragment$getBoostBean$12 = transactionPageFragment$getBoostBean$1;
        Object obj = transactionPageFragment$getBoostBean$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = transactionPageFragment$getBoostBean$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                TransactionBean transactionBeanFJNWhG = transactionPageFragment.zLjUOn().fJNWhG();
                if (transactionBeanFJNWhG == null || (quotePriceRes = transactionBeanFJNWhG.getQuotePriceRes()) == null) {
                    return null;
                }
                if (!quotePriceRes.isSingle()) {
                    return null;
                }
                DeFiPlatformForSwap selectedDeFiPlatform = quotePriceRes.getSelectedDeFiPlatform();
                if (selectedDeFiPlatform == null || (defiPlatformId = selectedDeFiPlatform.getDefiPlatformId()) == null) {
                    defiPlatformId = "";
                }
                if (!transactionPageFragment.AuCTel().KWHzl(defiPlatformId)) {
                    return null;
                }
                DexMultiTokenInfoBean dexMultiTokenInfoBeanFromToken = quotePriceRes.fromToken();
                DexMultiTokenInfoBean token = quotePriceRes.toToken();
                String chainId = dexMultiTokenInfoBeanFromToken.getChainId();
                int iAhwBna = C33129mqd.AhwBna(chainId);
                String originContractAddress = dexMultiTokenInfoBeanFromToken.getOriginContractAddress();
                String originContractAddress2 = token.getOriginContractAddress();
                String fromTokenAmount = quotePriceRes.getCommonDexInfo().getFromTokenAmount();
                String strMinimumReceived = quotePriceRes.minimumReceived();
                String strGEmmrt = C33129mqd.gEmmrt(C56443yFo.AEQbTJ(TradeMode.SwapMode.getType()));
                InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().AEQbTJ();
                String str = (interfaceC9738bbJAEQbTJ == null || (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd((long) iAhwBna)) == null) ? "" : strEZpvd;
                String strOLrzqt = transactionPageFragment.AubY().OLrzqt(chainId);
                C19757gOe c19757gOeAuCTel = transactionPageFragment.AuCTel();
                transactionPageFragment$getBoostBean$12.L$0 = transactionPageFragment2;
                transactionPageFragment$getBoostBean$12.label = 1;
                objAEQbTJ = c19757gOeAuCTel.AEQbTJ(iAhwBna, originContractAddress, originContractAddress2, fromTokenAmount, strMinimumReceived, strGEmmrt, str, strOLrzqt, transactionPageFragment$getBoostBean$12);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionPageFragment2 = (TransactionPageFragment) transactionPageFragment$getBoostBean$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7383isFailureimpl(objAEQbTJ)) {
                objAEQbTJ = null;
            }
            boostEstimateVolumeResponse = (BoostEstimateVolumeResponse) objAEQbTJ;
        } catch (Exception e) {
            pUU.AEQbTJ("TransactionPageFragment", "Failed to get boost data", e);
            boostEstimateVolumeResponse = null;
        }
        C19758gOf c19758gOf = C19758gOf.AEQbTJ;
        String strEZpvd2 = c19758gOf.EZpvd(boostEstimateVolumeResponse != null ? boostEstimateVolumeResponse.getBoostVolume() : null);
        String strCopydefault = c19758gOf.copydefault(boostEstimateVolumeResponse != null ? boostEstimateVolumeResponse.getBoostWeight() : null);
        return new C25144irF(strEZpvd2, strCopydefault != null ? strCopydefault : "", new Function0() { // from class: o.iri
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionPageFragment.getFieldNames(this.KWHzl);
            }
        }, new Function0() { // from class: o.irh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionPageFragment.djBIcL();
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.loI.showBoostInfoDialog$default(o.loI, android.content.Context, boolean, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public static final Unit getFieldNames(TransactionPageFragment transactionPageFragment) {
        C31131loI c31131loI = C31131loI.OLrzqt;
        Context contextRequireContext = transactionPageFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C31131loI.showBoostInfoDialog$default(c31131loI, contextRequireContext, true, null, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        C31131loI.OLrzqt.EZpvd(true);
        return Unit.INSTANCE;
    }

    public final C25143irE QUSxYX() {
        String receiveWalletAddress;
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        if (transactionBeanFJNWhG == null || (receiveWalletAddress = transactionBeanFJNWhG.getReceiveWalletAddress()) == null) {
            receiveWalletAddress = "";
        }
        return new C25143irE(new TransactionAddressInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawnComposition), receiveWalletAddress, "", (String) null, true, (Function0) this.AhwBna, (String) null, false, (Function0) null, 456, (DefaultConstructorMarker) null));
    }

    public static final Unit hDKMBd(TransactionPageFragment transactionPageFragment) {
        String receiveWalletAddress;
        TransactionBean transactionBeanFJNWhG = transactionPageFragment.zLjUOn().fJNWhG();
        if (transactionBeanFJNWhG == null || (receiveWalletAddress = transactionBeanFJNWhG.getReceiveWalletAddress()) == null) {
            receiveWalletAddress = "";
        }
        if (transactionPageFragment.ejfBZ().djBIcL() != null) {
            C25352ivB.copydefault(receiveWalletAddress);
            C25281itk.Companion.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.playFromMediaId), receiveWalletAddress).AEQbTJ(transactionPageFragment.requireContext());
        }
        return Unit.INSTANCE;
    }

    public final TransactionGeneralInfoBean OcIXYQ() {
        String str;
        if (!zLjUOn().AuCTelauCTel()) {
            return new TransactionGeneralInfoBean(null, false, null, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524287, null);
        }
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        Intrinsics.copydefault(newProxyInstance);
        C54845xXl c54845xXlKWHzl = C25189iry.KWHzl(newProxyInstance, AEQbTJ());
        if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
            str = C23319hvw.OLrzqt(c54845xXlKWHzl.AEQbTJ()) + " " + c54845xXlKWHzl.OLrzqt() + " ≈ " + C23319hvw.OLrzqt(c54845xXlKWHzl.EZpvd()) + " " + c54845xXlKWHzl.KWHzl();
        } else {
            str = c54845xXlKWHzl.KWHzl() + " " + C23319hvw.OLrzqt(c54845xXlKWHzl.EZpvd()) + " ≈ " + c54845xXlKWHzl.OLrzqt() + " " + C23319hvw.OLrzqt(c54845xXlKWHzl.AEQbTJ());
        }
        return new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.ManagedActivityResultLauncher), false, str, null, null, null, null, newProxyInstance.isBridge() ? null : C33070mpX.KWHzl(C52761wXj.TaskDescription.aSdHwS), 16.0f, null, 0.0f, false, null, null, null, this.KWHzl, null, null, null, 491130, null);
    }

    public static final Unit fIwbmz(TransactionPageFragment transactionPageFragment) {
        String str;
        transactionPageFragment.AYXKKw = !transactionPageFragment.AYXKKw;
        C54845xXl c54845xXlEZpvd = C22380heK.OLrzqt.copydefault(transactionPageFragment.AEQbTJ()).fARcdN().EZpvd(transactionPageFragment.AYXKKw);
        if (c54845xXlEZpvd != null) {
            if (C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf())) {
                str = C23319hvw.OLrzqt(c54845xXlEZpvd.AEQbTJ()) + " " + c54845xXlEZpvd.OLrzqt() + " ≈ " + C23319hvw.OLrzqt(c54845xXlEZpvd.EZpvd()) + " " + c54845xXlEZpvd.KWHzl();
            } else {
                str = c54845xXlEZpvd.KWHzl() + " " + C23319hvw.OLrzqt(c54845xXlEZpvd.EZpvd()) + " ≈ " + c54845xXlEZpvd.OLrzqt() + " " + C23319hvw.OLrzqt(c54845xXlEZpvd.AEQbTJ());
            }
            List<?> items = transactionPageFragment.zsXlph().getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            Iterator<?> it = items.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if ((next instanceof TransactionGeneralInfoBean) && ((TransactionGeneralInfoBean) next).getActionIconCallback() != null) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                Object obj = transactionPageFragment.zsXlph().getItems().get(i);
                TransactionGeneralInfoBean transactionGeneralInfoBean = obj instanceof TransactionGeneralInfoBean ? (TransactionGeneralInfoBean) obj : null;
                if (transactionGeneralInfoBean != null) {
                    transactionGeneralInfoBean.setGeneralContentInfo(str);
                }
                transactionPageFragment.zsXlph().notifyItemChanged(i);
            }
        }
        return Unit.INSTANCE;
    }

    public final TransactionGeneralInfoBean sSMYrx() {
        StringBuilder sb;
        if (!zLjUOn().AuCTelauCTel()) {
            return new TransactionGeneralInfoBean(null, false, null, null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524287, null);
        }
        QuotePriceRes quotePriceResAkhnZx = zLjUOn().AkhnZx();
        Intrinsics.copydefault(quotePriceResAkhnZx);
        DexMultiTokenInfoBean token = quotePriceResAkhnZx.toToken();
        String strKWHzl = C25189iry.KWHzl(quotePriceResAkhnZx);
        boolean zOLrzqt = C55296xhK.OLrzqt(C43246rlf.OLrzqt.valueOf());
        String tokenSymbol = token.getTokenSymbol();
        if (zOLrzqt) {
            sb = new StringBuilder();
            sb.append(tokenSymbol);
            sb.append(" ");
            sb.append(strKWHzl);
        } else {
            sb = new StringBuilder();
            sb.append(strKWHzl);
            sb.append(" ");
            sb.append(tokenSymbol);
        }
        return new TransactionGeneralInfoBean(C33070mpX.AYXKKw(C23274hvD.Fragment.LocalOnBackPressedDispatcherOwnerLocalOnBackPressedDispatcherOwner1), false, sb.toString(), null, null, null, null, null, 0.0f, null, 0.0f, false, null, null, null, null, null, null, null, 524282, null);
    }

    public final C25145irG values() {
        if (!zLjUOn().AuCTelauCTel()) {
            return new C25145irG(null, 1, null);
        }
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        String strEstimatedTime = newProxyInstance != null ? newProxyInstance.estimatedTime() : null;
        if (strEstimatedTime == null) {
            strEstimatedTime = "";
        }
        return new C25145irG(strEstimatedTime);
    }

    public final C25148irJ fetchVPNInfo() {
        TransactionFoldInfoDataBean transactionFoldInfoDataBean = new TransactionFoldInfoDataBean(C33070mpX.AYXKKw(C23274hvD.Fragment.ReportDrawn), false, this.copydefault);
        String value = zLjUOn().uzCIH().getValue();
        if (value == null) {
            value = "";
        }
        return new C25148irJ(value, transactionFoldInfoDataBean);
    }

    public static final Unit uzCIH(TransactionPageFragment transactionPageFragment) {
        swapContractInteractionButtonClick$default(transactionPageFragment, "detail", null, 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void swapContractInteractionButtonClick$default(TransactionPageFragment transactionPageFragment, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: swapContractInteractionButtonClick");
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        transactionPageFragment.AEQbTJ(str, str2);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2) {
        String chainId;
        String strEZpvd;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = fIwbmz();
        if (dexMultiTokenInfoBeanFIwbmz == null || (chainId = dexMultiTokenInfoBeanFIwbmz.getChainId()) == null) {
            chainId = "";
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(AEQbTJ()).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ != null && (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(chainId))) != null) {
            str3 = strEZpvd;
        }
        String strOLrzqt = c22380heK.copydefault(AEQbTJ()).OLrzqt(AwvSrB()).OLrzqt();
        if (strOLrzqt.length() == 0) {
            strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(AEQbTJ());
        }
        C23301hve.EZpvd(str3, "swap", strOLrzqt, str, str2);
    }

    public final void copydefault(String str) {
        String chainId;
        String strEZpvd;
        String strOLrzqt;
        String str2;
        Pair pairOLrzqt;
        String bridgeSelection;
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        String balanceBracket;
        String spSlipPage;
        String tokenPrice;
        String originContractAddress;
        String fromTokenAmount;
        String originContractAddress2;
        if (str.contentEquals("back")) {
            zuBGHE();
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = fIwbmz();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanUzCIH = uzCIH();
        if (dexMultiTokenInfoBeanFIwbmz == null || (chainId = dexMultiTokenInfoBeanFIwbmz.getChainId()) == null) {
            chainId = "";
        }
        String str3 = (dexMultiTokenInfoBeanFIwbmz == null || (originContractAddress2 = dexMultiTokenInfoBeanFIwbmz.getOriginContractAddress()) == null) ? "" : originContractAddress2;
        QuotePriceRes newProxyInstance = getNewProxyInstance();
        String str4 = (newProxyInstance == null || (fromTokenAmount = newProxyInstance.getFromTokenAmount(false)) == null) ? "" : fromTokenAmount;
        String str5 = (dexMultiTokenInfoBeanUzCIH == null || (originContractAddress = dexMultiTokenInfoBeanUzCIH.getOriginContractAddress()) == null) ? "" : originContractAddress;
        QuotePriceRes newProxyInstance2 = getNewProxyInstance();
        String str6 = (newProxyInstance2 == null || (tokenPrice = newProxyInstance2.toTokenPrice()) == null) ? "" : tokenPrice;
        C22380heK c22380heK = C22380heK.OLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(AEQbTJ()).fARcdN().AEQbTJ();
        if (interfaceC9738bbJAEQbTJ == null || (strEZpvd = interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(chainId))) == null) {
            strEZpvd = "";
        }
        String strOLrzqt2 = c22380heK.copydefault(AEQbTJ()).OLrzqt(AwvSrB()).OLrzqt();
        if (strOLrzqt2.length() == 0) {
            strOLrzqt2 = DexTrackEventParameter.AEQbTJ.OLrzqt(AEQbTJ());
        }
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        boolean zIsCustomSlippage = transactionBeanFJNWhG != null ? transactionBeanFJNWhG.isCustomSlippage() : false;
        TransactionBean transactionBeanFJNWhG2 = zLjUOn().fJNWhG();
        String str7 = (transactionBeanFJNWhG2 == null || (spSlipPage = transactionBeanFJNWhG2.getSpSlipPage()) == null) ? "" : spSlipPage;
        TransactionBean transactionBeanFJNWhG3 = zLjUOn().fJNWhG();
        String str8 = (transactionBeanFJNWhG3 == null || (balanceBracket = transactionBeanFJNWhG3.getBalanceBracket()) == null) ? "" : balanceBracket;
        InterfaceC9752bbX value = zLjUOn().fIwbmz().getValue();
        if (value == null || (interfaceC9731bbCEZpvd = value.EZpvd()) == null || (strOLrzqt = interfaceC9731bbCEZpvd.OLrzqt()) == null) {
            strOLrzqt = "";
        }
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ2 = c22380heK.copydefault(AEQbTJ()).fARcdN().AEQbTJ();
        InterfaceC9734bbF interfaceC9734bbFHDKMBd = hDKMBd();
        InterfaceC9736bbH interfaceC9736bbH = interfaceC9734bbFHDKMBd instanceof InterfaceC9736bbH ? (InterfaceC9736bbH) interfaceC9734bbFHDKMBd : null;
        if (interfaceC9738bbJAEQbTJ2 != null && interfaceC9738bbJAEQbTJ2.getFieldNames() && interfaceC9736bbH != null && interfaceC9736bbH.w_()) {
            String strCopydefault = interfaceC9736bbH.copydefault(0, true);
            str2 = str8;
            if (Intrinsics.EZpvd((Object) InterfaceC9736bbH.StateListAnimator.getApproveAmount$default(interfaceC9736bbH, 0, false, 2, null), (Object) "115792089237316195423570985008687907853269984665640564039457584007913129639935")) {
                pairOLrzqt = C56390yDp.OLrzqt("unlimited", "None");
            } else {
                pairOLrzqt = C56390yDp.OLrzqt("custom", strCopydefault);
            }
        } else {
            str2 = str8;
            pairOLrzqt = C56390yDp.OLrzqt("", "");
        }
        String strEZpvd2 = C24695iig.EZpvd(AEQbTJ(), AwvSrB());
        InterfaceC9749bbU interfaceC9749bbU = value instanceof InterfaceC9749bbU ? (InterfaceC9749bbU) value : null;
        String strAEQbTJ = C23301hve.AEQbTJ(interfaceC9749bbU != null ? interfaceC9749bbU.copydefault() : 32);
        TransactionBean transactionBeanFJNWhG4 = zLjUOn().fJNWhG();
        String str9 = (transactionBeanFJNWhG4 == null || (bridgeSelection = transactionBeanFJNWhG4.getBridgeSelection()) == null) ? "" : bridgeSelection;
        Boolean value2 = DbNXlk().EZpvd().getValue();
        String value3 = ((value2 == null || !value2.booleanValue()) ? DexTrackEventParameter.ButtonName.OFF : DexTrackEventParameter.ButtonName.ON).getValue();
        DexTrackEventParameter dexTrackEventParameter = DexTrackEventParameter.AEQbTJ;
        C23301hve.AEQbTJ(strEZpvd, "swap", strOLrzqt2, "", str, str3, str4, str5, str6, dexTrackEventParameter.OLrzqt(zLjUOn().wlaJM()), str2, dexTrackEventParameter.copydefault(zIsCustomSlippage, str7), strEZpvd2, str9, dexTrackEventParameter.copydefault(strAEQbTJ, strOLrzqt), dexTrackEventParameter.AEQbTJ((String) pairOLrzqt.getFirst(), (String) pairOLrzqt.getSecond()), value3);
    }

    public void AuCTelauCTel() {
        InterfaceC9734bbF interfaceC9734bbFHDKMBd;
        C57468yiw c57468yiw;
        C57468yiw c57468yiw2;
        InterfaceC9738bbJ interfaceC9738bbJDbNXlk;
        C57468yiw c57468yiw3;
        C57468yiw c57468yiw4;
        C52794wYp c52794wYpCopydefault;
        InterfaceC9738bbJ interfaceC9738bbJDbNXlk2;
        C57468yiw c57468yiw5;
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null && (c57468yiw5 = c21615hFy.AYXKKw) != null) {
            c57468yiw5.copydefault().setOKDSType(260);
        }
        InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = hDKMBd();
        if ((interfaceC9734bbFHDKMBd2 == null || (interfaceC9738bbJDbNXlk2 = interfaceC9734bbFHDKMBd2.DbNXlk()) == null || !interfaceC9738bbJDbNXlk2.gHZMYf()) && ((interfaceC9734bbFHDKMBd = hDKMBd()) == null || (interfaceC9738bbJDbNXlk = interfaceC9734bbFHDKMBd.DbNXlk()) == null || !interfaceC9738bbJDbNXlk.iwGUEr())) {
            C21615hFy c21615hFy2 = this.gEmmrt;
            if (c21615hFy2 != null && (c57468yiw2 = c21615hFy2.AYXKKw) != null) {
                c57468yiw2.setPrimaryButtonText(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags));
            }
            C21615hFy c21615hFy3 = this.gEmmrt;
            if (c21615hFy3 == null || (c57468yiw = c21615hFy3.AYXKKw) == null) {
                return;
            }
            c57468yiw.setSecondaryButtonText(iwGUEr());
            return;
        }
        C21615hFy c21615hFy4 = this.gEmmrt;
        if (c21615hFy4 != null && (c57468yiw4 = c21615hFy4.AYXKKw) != null && (c52794wYpCopydefault = c57468yiw4.copydefault()) != null) {
            c52794wYpCopydefault.setVisibility(8);
        }
        C21615hFy c21615hFy5 = this.gEmmrt;
        if (c21615hFy5 == null || (c57468yiw3 = c21615hFy5.AYXKKw) == null) {
            return;
        }
        c57468yiw3.setSecondaryButtonText(C33070mpX.AYXKKw(C23274hvD.Fragment.getCurrent));
    }

    public static /* synthetic */ void updateButtonStatus$default(TransactionPageFragment transactionPageFragment, boolean z, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateButtonStatus");
        }
        if ((i2 & 4) != 0) {
            str = transactionPageFragment.iwGUEr();
        }
        transactionPageFragment.OLrzqt(z, i, str);
    }

    public final void OLrzqt(boolean z, int i, @NotNull String str) {
        C57468yiw c57468yiw;
        C57468yiw c57468yiw2;
        Intrinsics.checkNotNullParameter(str, "");
        C21615hFy c21615hFy = this.gEmmrt;
        if (c21615hFy != null && (c57468yiw2 = c21615hFy.AYXKKw) != null) {
            c57468yiw2.setSecondaryButtonEnabled(z);
        }
        C21615hFy c21615hFy2 = this.gEmmrt;
        if (c21615hFy2 == null || (c57468yiw = c21615hFy2.AYXKKw) == null) {
            return;
        }
        c57468yiw.setSecondaryButtonText(str);
    }

    public final String iwGUEr() {
        InterfaceC9734bbF interfaceC9734bbFHDKMBd;
        String swapButtonText;
        InterfaceC9738bbJ interfaceC9738bbJDbNXlk;
        InterfaceC9738bbJ interfaceC9738bbJDbNXlk2;
        InterfaceC9734bbF interfaceC9734bbFHDKMBd2 = hDKMBd();
        if ((interfaceC9734bbFHDKMBd2 != null && (interfaceC9738bbJDbNXlk2 = interfaceC9734bbFHDKMBd2.DbNXlk()) != null && interfaceC9738bbJDbNXlk2.gHZMYf()) || ((interfaceC9734bbFHDKMBd = hDKMBd()) != null && (interfaceC9738bbJDbNXlk = interfaceC9734bbFHDKMBd.DbNXlk()) != null && interfaceC9738bbJDbNXlk.iwGUEr())) {
            return C33070mpX.AYXKKw(C23274hvD.Fragment.getCurrent);
        }
        TransactionBean transactionBeanFJNWhG = zLjUOn().fJNWhG();
        return (transactionBeanFJNWhG == null || (swapButtonText = transactionBeanFJNWhG.getSwapButtonText()) == null) ? "" : swapButtonText;
    }

    public static /* synthetic */ void showNotification$default(TransactionPageFragment transactionPageFragment, String str, int i, long j, boolean z, Drawable drawable, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNotification");
        }
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
        transactionPageFragment.OLrzqt(str, i3, j2, z2, drawable);
    }

    private final void OLrzqt(String str, int i, long j, boolean z, Drawable drawable) {
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

    public void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(str);
    }
}
