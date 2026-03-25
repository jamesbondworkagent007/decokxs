package o;

import androidx.collection.ArrayMapKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.track.enums.DexSwapLiquiditySource;
import com.okinc.business.dexlogic.track.enums.SwapType;
import com.okinc.business.dexui.main.swap.trade.status.helper.ErrorStateHandle$updateErrorState$5;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.WalletAddressSwitchException;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C23274hvD;
import o.InterfaceC54855xXv;
import o.xWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ioP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24995ioP {
    public LifecycleOwner AEQbTJ;
    public AbstractC23101hrq AYXKKw;
    public final java.lang.Object EZpvd;
    public boolean KWHzl;
    public java.lang.String OLrzqt;
    public boolean copydefault;
    public SwapState gEmmrt;
    public java.lang.String valueOf;

    /* JADX INFO: renamed from: o.ioP$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.BLACK_ADDRESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.WALLET_LEGAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[SwapState.SWAP_THORSWAP_BTC_ADDRESS_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[SwapState.MPC_WALLET_LEGAL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[SwapState.STAND_BY_DISH_WARNING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[SwapState.STAND_BY_LEVERAGE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[SwapState.FACET_SWAP_WARNING.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[SwapState.NO_QUOTE_FETCHED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[SwapState.ORBITER_QUOTE_FETCH_FAILED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[SwapState.NO_LIQUIDITY_AT_THE_MOMENT.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[SwapState.CROSS_CHAIN_BRIDGE_UNSUPPORTED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[SwapState.SCOPE_TIPS_WARNING.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[SwapState.HIGH_PRICE_DIFFERENCE.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[SwapState.FETCHING_ERROR.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[SwapState.BRIDGE_UNSUPPORTED_CHAIN_PAIR_FOR_DAPP.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[SwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[SwapState.SWAP_CONFIG_FETCH_FAILED.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[SwapState.SLIPPAGE_REMINDER.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusEscape.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountDelete.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr2[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusAccountFrozen.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[SwapType.values().length];
            try {
                iArr3[SwapType.SWAP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr3[SwapType.CROSS_CHAIN_SWAP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr3[SwapType.DISCOVER_SWAP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr3[SwapType.DISCOVER_CROSS_CHAIN_SWAP.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            AEQbTJ = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx() {
        this.gEmmrt = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.OLrzqt = str;
    }

    public C24995ioP(@NotNull java.lang.String str, @NotNull AbstractC23101hrq abstractC23101hrq, @NotNull LifecycleOwner lifecycleOwner, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.valueOf = str;
        this.AYXKKw = abstractC23101hrq;
        this.AEQbTJ = lifecycleOwner;
        this.KWHzl = z;
        this.copydefault = z2;
        this.OLrzqt = "";
        this.EZpvd = new java.lang.Object();
    }

    public static final Unit AYXKKw() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.ioP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateErrorState$default(C24995ioP c24995ioP, SwapState swapState, androidx.fragment.app.FragmentManager fragmentManager, ErrorNoticeView errorNoticeView, FragmentActivity fragmentActivity, QuoteErrorBean quoteErrorBean, C24694iif c24694iif, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        c24995ioP.OLrzqt(swapState, fragmentManager, errorNoticeView, fragmentActivity, (i & 16) != 0 ? null : quoteErrorBean, (i & 32) != 0 ? null : c24694iif, (i & 64) != 0 ? new Function0() { // from class: o.ipf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24995ioP.AYXKKw();
            }
        } : function0, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull SwapState swapState, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull ErrorNoticeView errorNoticeView, @NotNull FragmentActivity fragmentActivity, QuoteErrorBean quoteErrorBean, C24694iif c24694iif, @NotNull Function0<Unit> function0, Function1<? super java.lang.Boolean, Unit> function1) {
        java.lang.String strKWHzl;
        java.lang.CharSequence charSequenceAYXKKw;
        java.lang.String strAYXKKw;
        androidx.collection.ArrayMap arrayMap;
        Function0<Unit> function0BuildCallback$default;
        Function0<Unit> errorStateHandle$updateErrorState$5;
        ErrorNoticeView.Level level;
        java.lang.String string;
        java.lang.String str;
        boolean z;
        java.lang.String chainId;
        java.lang.String errorMsg;
        Function0<Unit> function0Copydefault;
        ErrorNoticeView.Level level2;
        java.lang.String strKWHzl2;
        java.lang.String strAYXKKw2;
        ErrorNoticeView.Level level3;
        java.lang.String tokenSymbol;
        java.lang.String tokenSymbol2;
        java.lang.String tokenSymbol3;
        java.lang.String percent$default;
        DeFiPlatformForSwap selectedDeFiPlatform;
        java.lang.String reducePercent;
        DeFiPlatformForSwap selectedDeFiPlatform2;
        strKWHzl = "";
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.gEmmrt = swapState;
        Function0<Unit> function02 = new Function0() { // from class: o.ipa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24995ioP.AhwBna();
            }
        };
        ErrorNoticeView.Level level4 = ErrorNoticeView.Level.Warning;
        boolean z2 = true;
        boolean zKWHzl = false;
        if (this.copydefault) {
            charSequenceAYXKKw = C22334hdR.OLrzqt(true, this.KWHzl || (swapState != SwapState.SWAP_UNSUPPORTED_FOR_DAPP));
        } else {
            switch (TaskDescription.EZpvd[swapState.ordinal()]) {
                case 1:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.BackHandlerKtBackHandler3);
                    level4 = ErrorNoticeView.Level.Error;
                    strAYXKKw = "";
                    z2 = true;
                    str = strAYXKKw;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = z2;
                    string = "";
                    strKWHzl = charSequenceAYXKKw;
                    break;
                case 2:
                    java.lang.CharSequence charSequenceAYXKKw2 = C22372heC.AEQbTJ(this.valueOf) ? C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi181) : "";
                    java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.gtdfxv);
                    androidx.collection.ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("chain", this.AYXKKw.QUSxYX().OLrzqt()));
                    java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(this.AYXKKw.QUSxYX().AEQbTJ());
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = this.AYXKKw.QUSxYX().valueOf();
                    java.lang.Long fieldNames2 = (dexMultiTokenInfoBeanValueOf == null || (chainId = dexMultiTokenInfoBeanValueOf.getChainId()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(chainId);
                    InterfaceC9738bbJ interfaceC9738bbJValueOf = C22380heK.OLrzqt.copydefault(this.valueOf).fARcdN().valueOf();
                    int i = C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection1;
                    if (interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.gHZMYf()) {
                        function0BuildCallback$default = copydefault(fragmentManager, function1, fieldNames, fieldNames2, new Function1() { // from class: o.ioY
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C24995ioP.copydefault((InterfaceC9738bbJ) obj));
                            }
                        });
                    } else if (interfaceC9738bbJValueOf != null && interfaceC9738bbJValueOf.ORxRYg()) {
                        function0BuildCallback$default = copydefault(fragmentManager, function1, fieldNames, fieldNames2, new Function1() { // from class: o.ioZ
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return java.lang.Boolean.valueOf(C24995ioP.AYXKKw((InterfaceC9738bbJ) obj));
                            }
                        });
                    } else {
                        arrayMap = arrayMapArrayMapOf;
                        function0BuildCallback$default = buildCallback$default(this, fragmentManager, function1, fieldNames, fieldNames2, null, 16, null);
                        errorStateHandle$updateErrorState$5 = function0BuildCallback$default;
                        strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, arrayMap);
                        level = level4;
                        string = charSequenceAYXKKw2;
                        str = strAYXKKw3;
                        z = true;
                    }
                    arrayMap = arrayMapArrayMapOf;
                    errorStateHandle$updateErrorState$5 = function0BuildCallback$default;
                    strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), i, arrayMap);
                    level = level4;
                    string = charSequenceAYXKKw2;
                    str = strAYXKKw3;
                    z = true;
                    break;
                case 3:
                    InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(this.valueOf).fARcdN();
                    InterfaceC9738bbJ interfaceC9738bbJQSLkRj = this.AYXKKw.QSLkRj();
                    Intrinsics.copydefault(interfaceC9738bbJQSLkRj);
                    boolean zOLrzqt = interfaceC23194htdFARcdN.OLrzqt(interfaceC9738bbJQSLkRj, "0", this.AYXKKw.UlJrfe());
                    java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.iqMDAV);
                    if (quoteErrorBean == null || (errorMsg = quoteErrorBean.getErrorMsg()) == null) {
                        errorMsg = "";
                    }
                    if (!zOLrzqt || (this.AYXKKw.gEmmrt() != null && !C22372heC.AEQbTJ(this.valueOf))) {
                        function0Copydefault = new Function0() { // from class: o.ipd
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return C24995ioP.valueOf();
                            }
                        };
                    } else {
                        strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.invokespecialDaTmkG);
                        function0Copydefault = copydefault(fragmentManager, C33129mqd.valueOf("0"), this.AEQbTJ);
                    }
                    errorStateHandle$updateErrorState$5 = function0Copydefault;
                    string = strKWHzl;
                    level = level4;
                    strKWHzl = errorMsg;
                    str = strAYXKKw4;
                    z = true;
                    break;
                case 4:
                    zKWHzl = KWHzl(errorNoticeView, fragmentActivity, C22380heK.OLrzqt.copydefault(this.valueOf).fARcdN().valueOf(), this.AYXKKw.fvQaOB().getValue());
                    str = "";
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = z2;
                    string = str;
                    break;
                case 5:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    level2 = ErrorNoticeView.Level.Error;
                    level4 = level2;
                    break;
                case 6:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.setFillInIntent);
                    level2 = ErrorNoticeView.Level.Error;
                    level4 = level2;
                    break;
                case 7:
                    kotlin.Pair<java.lang.String, java.lang.String> pairGEmmrt = this.AYXKKw.QUSxYX().gEmmrt();
                    java.lang.String strComponent1 = pairGEmmrt.component1();
                    java.lang.String strComponent2 = pairGEmmrt.component2();
                    if (strComponent1.length() > 0 && strComponent2.length() > 0) {
                        strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.MediaBrowserCompatItemReceiver, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("sellToken", strComponent1), C56390yDp.OLrzqt("receiveToken", strComponent2)));
                        strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    } else if (strComponent1.length() > 0) {
                        strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onItemLoaded, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", strComponent1)));
                        strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    } else {
                        strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.onItemLoaded, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("token", strComponent2)));
                        strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.IntentSenderRequestBuilderFlag);
                    }
                    level3 = ErrorNoticeView.Level.Error;
                    level4 = level3;
                    str = strKWHzl2;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = "";
                    strKWHzl = strAYXKKw2;
                    break;
                case 8:
                    Intrinsics.copydefault(quoteErrorBean);
                    charSequenceAYXKKw = quoteErrorBean.getErrorMsg();
                    break;
                case 9:
                    charSequenceAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.sVXHln);
                    break;
                case 10:
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = this.AYXKKw.QUSxYX().copydefault();
                    if (dexMultiTokenInfoBeanCopydefault == null || (tokenSymbol = dexMultiTokenInfoBeanCopydefault.getTokenSymbol()) == null) {
                        tokenSymbol = "";
                    }
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt("fromToken", tokenSymbol);
                    Intrinsics.copydefault(quoteErrorBean);
                    charSequenceAYXKKw = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.RuDPQV, ArrayMapKt.arrayMapOf(pairOLrzqt, C56390yDp.OLrzqt("value", quoteErrorBean.getCrossAccuracyLimit())));
                    break;
                case 11:
                    Intrinsics.copydefault(c24694iif);
                    androidx.collection.ArrayMap arrayMapArrayMapOf2 = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("num", pTB.formatUpToMax$default(C33129mqd.EZpvd(java.lang.Integer.valueOf(c24694iif.AEQbTJ())), 0, null, 3, null)));
                    int i2 = C23274hvD.FragmentManager.EZpvd;
                    C32979mnm c32979mnm = C32979mnm.EZpvd;
                    charSequenceAYXKKw = pTD.EZpvd(c32979mnm.OLrzqt(), i2, c24694iif.AEQbTJ(), arrayMapArrayMapOf2);
                    string = c32979mnm.OLrzqt().getString(C23274hvD.Fragment.uzCIH);
                    str = "";
                    errorStateHandle$updateErrorState$5 = function0;
                    level = level4;
                    z = true;
                    strKWHzl = charSequenceAYXKKw;
                    break;
                case 12:
                    if (AEQbTJ(quoteErrorBean)) {
                        strAYXKKw = quoteErrorBean != null ? quoteErrorBean.getErrorMsg() : null;
                        if (strAYXKKw == null) {
                            strAYXKKw = "";
                        }
                    } else {
                        strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.iLAtSv);
                    }
                    str = "";
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = str;
                    strKWHzl = strAYXKKw;
                    break;
                case 13:
                    DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(this.valueOf).OLrzqt(this.AYXKKw.UlJrfe()).KWHzl().getValue();
                    Intrinsics.copydefault(value);
                    java.lang.String tokenSymbol4 = value.getTokenSymbol();
                    Intrinsics.copydefault(quoteErrorBean);
                    kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(quoteErrorBean.getCrossMiniAmount(), quoteErrorBean.getCrossMaxAmount());
                    java.lang.String str2 = (java.lang.String) pairOLrzqt2.component1();
                    java.lang.String str3 = (java.lang.String) pairOLrzqt2.component2();
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && C33129mqd.OLrzqt((java.lang.CharSequence) str3)) {
                        C23271hvA c23271hvA = C23271hvA.copydefault;
                        java.lang.String showData$default = C23271hvA.getShowData$default(c23271hvA, str2, false, RoundingMode.UP, false, false, 26, null);
                        java.lang.String showData$default2 = C23271hvA.getShowData$default(c23271hvA, str3, false, RoundingMode.DOWN, false, false, 26, null);
                        boolean zKWHzl2 = C23313hvq.KWHzl(quoteErrorBean.getAmount(), str2);
                        if (zKWHzl2 && this.AYXKKw.htlTjW()) {
                            charSequenceAYXKKw = "";
                            z2 = false;
                        } else if (AEQbTJ(quoteErrorBean)) {
                            charSequenceAYXKKw = quoteErrorBean.getErrorMsg();
                        } else if (zKWHzl2) {
                            charSequenceAYXKKw = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.invokespecialaKhcqp, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", showData$default), C56390yDp.OLrzqt("symbol", tokenSymbol4)));
                        } else {
                            charSequenceAYXKKw = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.invokespecialRuDPQV, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", showData$default2), C56390yDp.OLrzqt("symbol", tokenSymbol4)));
                        }
                        function0.invoke();
                    }
                    str = "";
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = z2;
                    string = str;
                    break;
                case 14:
                    strKWHzl2 = C33070mpX.AYXKKw(C23274hvD.Fragment.setContent);
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = this.AYXKKw.QUSxYX().copydefault();
                    if (dexMultiTokenInfoBeanCopydefault2 == null || (tokenSymbol2 = dexMultiTokenInfoBeanCopydefault2.getTokenSymbol()) == null) {
                        tokenSymbol2 = "";
                    }
                    pairArr[0] = C56390yDp.OLrzqt("ccy", tokenSymbol2);
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = this.AYXKKw.QUSxYX().copydefault();
                    if (dexMultiTokenInfoBeanCopydefault3 == null || (tokenSymbol3 = dexMultiTokenInfoBeanCopydefault3.getTokenSymbol()) == null) {
                        tokenSymbol3 = "";
                    }
                    pairArr[1] = C56390yDp.OLrzqt("ccy", tokenSymbol3);
                    strAYXKKw2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setOwners, ArrayMapKt.arrayMapOf(pairArr));
                    str = strKWHzl2;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = "";
                    strKWHzl = strAYXKKw2;
                    break;
                case 15:
                    QuotePriceRes quotePrice = this.AYXKKw.RlQdEF().getQuotePrice();
                    if (quotePrice != null && (selectedDeFiPlatform2 = quotePrice.getSelectedDeFiPlatform()) != null) {
                        strAYXKKw = selectedDeFiPlatform2.getReducePercent();
                    }
                    if (strAYXKKw == null || strAYXKKw.length() == 0) {
                        z2 = false;
                        str = "";
                        errorStateHandle$updateErrorState$5 = function02;
                        level = level4;
                        z = z2;
                        string = str;
                    } else {
                        strKWHzl2 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplApi18);
                        int i3 = C23274hvD.Fragment.MediaSessionCompatCallbackStubApi23;
                        QuotePriceRes quotePrice2 = this.AYXKKw.RlQdEF().getQuotePrice();
                        if (quotePrice2 == null || (selectedDeFiPlatform = quotePrice2.getSelectedDeFiPlatform()) == null || (reducePercent = selectedDeFiPlatform.getReducePercent()) == null || (percent$default = C23311hvo.formatPercent$default(reducePercent, false, 0, 0, null, null, 30, null)) == null) {
                            percent$default = "";
                        }
                        strAYXKKw2 = C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", percent$default)));
                        str = strKWHzl2;
                        errorStateHandle$updateErrorState$5 = function02;
                        level = level4;
                        z = true;
                        string = "";
                        strKWHzl = strAYXKKw2;
                    }
                    break;
                case 16:
                    strKWHzl2 = C33070mpX.AYXKKw(C23274hvD.Fragment.DGUQLI);
                    strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.heceqZ);
                    level3 = ErrorNoticeView.Level.Error;
                    level4 = level3;
                    str = strKWHzl2;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = "";
                    strKWHzl = strAYXKKw2;
                    break;
                case 17:
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault4 = this.AYXKKw.QUSxYX().copydefault();
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf2 = this.AYXKKw.QUSxYX().valueOf();
                    C22825hmf c22825hmf = C22825hmf.OLrzqt;
                    java.lang.String str4 = this.valueOf;
                    java.lang.String chainId2 = dexMultiTokenInfoBeanCopydefault4 != null ? dexMultiTokenInfoBeanCopydefault4.getChainId() : null;
                    if (chainId2 == null) {
                        chainId2 = "";
                    }
                    boolean zEZpvd = c22825hmf.EZpvd(str4, chainId2, this.AYXKKw.UlJrfe());
                    java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.hCLrkq);
                    java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C23274hvD.Fragment.toString);
                    if (!zEZpvd) {
                        strAYXKKw = dexMultiTokenInfoBeanValueOf2 != null ? dexMultiTokenInfoBeanValueOf2.getChainName() : null;
                        if (strAYXKKw == null) {
                        }
                        charSequenceAYXKKw = C33069mpW.OLrzqt(strAYXKKw6, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", strAYXKKw)));
                        strAYXKKw = strAYXKKw5;
                        str = strAYXKKw;
                        errorStateHandle$updateErrorState$5 = function02;
                        level = level4;
                        z = z2;
                        string = "";
                        strKWHzl = charSequenceAYXKKw;
                    } else {
                        strAYXKKw = dexMultiTokenInfoBeanCopydefault4 != null ? dexMultiTokenInfoBeanCopydefault4.getChainName() : null;
                        if (strAYXKKw == null) {
                            strAYXKKw = "";
                        }
                        charSequenceAYXKKw = C33069mpW.OLrzqt(strAYXKKw6, C56423yEv.EZpvd(C56390yDp.OLrzqt("chain", strAYXKKw)));
                        strAYXKKw = strAYXKKw5;
                        str = strAYXKKw;
                        errorStateHandle$updateErrorState$5 = function02;
                        level = level4;
                        z = z2;
                        string = "";
                        strKWHzl = charSequenceAYXKKw;
                    }
                    break;
                case 18:
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault5 = this.AYXKKw.QUSxYX().copydefault();
                    DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf3 = this.AYXKKw.QUSxYX().valueOf();
                    strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.newArray);
                    java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C23274hvD.Fragment.isPlayable);
                    kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
                    java.lang.String chainName = dexMultiTokenInfoBeanCopydefault5 != null ? dexMultiTokenInfoBeanCopydefault5.getChainName() : null;
                    if (chainName == null) {
                        chainName = "";
                    }
                    pairArr2[0] = C56390yDp.OLrzqt("fromChain", chainName);
                    strAYXKKw = dexMultiTokenInfoBeanValueOf3 != null ? dexMultiTokenInfoBeanValueOf3.getChainName() : null;
                    if (strAYXKKw == null) {
                        strAYXKKw = "";
                    }
                    pairArr2[1] = C56390yDp.OLrzqt("toChain", strAYXKKw);
                    charSequenceAYXKKw = C33069mpW.OLrzqt(strAYXKKw7, C56424yEw.gEmmrt(pairArr2));
                    str = strAYXKKw;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = z2;
                    string = "";
                    strKWHzl = charSequenceAYXKKw;
                    break;
                case 19:
                    strKWHzl2 = C33070mpX.AYXKKw(C23274hvD.Fragment.onSearchResult);
                    strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItem1);
                    str = strKWHzl2;
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = "";
                    strKWHzl = strAYXKKw2;
                    break;
                case 20:
                    ErrorNoticeView.Level level5 = ErrorNoticeView.Level.Error;
                    strAYXKKw2 = errorNoticeView.getContext().getString(C23274hvD.Fragment.gdwsGQ);
                    level = level5;
                    string = errorNoticeView.getContext().getString(C23274hvD.Fragment.DcMfJKDCKfqPDCfLja);
                    errorStateHandle$updateErrorState$5 = new ErrorStateHandle$updateErrorState$5(this);
                    str = "";
                    z = true;
                    strKWHzl = strAYXKKw2;
                    break;
                case 21:
                    strAYXKKw = quoteErrorBean != null ? quoteErrorBean.getMsg() : null;
                    if (strAYXKKw == null) {
                    }
                    str = "";
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = true;
                    string = str;
                    strKWHzl = strAYXKKw;
                    break;
                default:
                    z2 = false;
                    str = "";
                    errorStateHandle$updateErrorState$5 = function02;
                    level = level4;
                    z = z2;
                    string = str;
                    break;
            }
            if (zKWHzl) {
                AEQbTJ(errorNoticeView, z, str, strKWHzl, level, string, errorStateHandle$updateErrorState$5);
                return;
            }
            return;
        }
        strAYXKKw = "";
        str = strAYXKKw;
        errorStateHandle$updateErrorState$5 = function02;
        level = level4;
        z = z2;
        string = "";
        strKWHzl = charSequenceAYXKKw;
        if (zKWHzl) {
        }
    }

    public static final Unit AhwBna() {
        return Unit.INSTANCE;
    }

    public static final boolean copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return !interfaceC9738bbJ.gHZMYf();
    }

    public static final boolean AYXKKw(InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return !interfaceC9738bbJ.ORxRYg();
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public final void isConnected() {
        DexMultiTokenInfoBean data;
        ConsumeData<TradeInputGroup> value = this.AYXKKw.dmfpNf().getValue();
        if (value == null || (data = value.getData().getFromData().getData().getCoinData().getData()) == null) {
            return;
        }
        this.AYXKKw.AEQbTJ(data.getChainId());
    }

    public final boolean KWHzl(ErrorNoticeView errorNoticeView, final FragmentActivity fragmentActivity, InterfaceC9738bbJ interfaceC9738bbJ, final MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strKWHzl;
        java.lang.String str3;
        java.lang.String strKWHzl2;
        java.lang.String str4;
        java.lang.String strAkhnZx;
        java.lang.String strAYXKKw;
        boolean z = false;
        java.lang.String str5 = "";
        switch (mpcWalletAbleStatus == null ? -1 : TaskDescription.OLrzqt[mpcWalletAbleStatus.ordinal()]) {
            case 1:
            case 2:
                java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserServiceCallbackImpl);
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C23274hvD.Fragment.RZOtbZ);
                str = strAYXKKw2;
                str2 = strAYXKKw3;
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.SqfPTR, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("verify", strAYXKKw3)));
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 3:
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaItem);
                java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C23274hvD.Fragment.SdSTJp);
                kotlin.Pair[] pairArr = new kotlin.Pair[2];
                if (interfaceC9738bbJ != null && (strAkhnZx = interfaceC9738bbJ.AkhnZx()) != null) {
                    str5 = strAkhnZx;
                }
                pairArr[0] = C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str5);
                pairArr[1] = C56390yDp.OLrzqt(RequestParameters.X_OSS_RESTORE, strAYXKKw5);
                str3 = strAYXKKw4;
                z = true;
                strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.zMXLsR, ArrayMapKt.arrayMapOf(pairArr));
                str4 = strAYXKKw5;
                break;
            case 4:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBaseMediaServiceConnection);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 5:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase4);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            case 6:
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.isBrowsable);
                strKWHzl = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplBase2);
                str = strAYXKKw;
                str2 = "";
                str4 = str2;
                strKWHzl2 = strKWHzl;
                z = true;
                str3 = str;
                break;
            default:
                str3 = "";
                strKWHzl2 = str3;
                str4 = strKWHzl2;
                break;
        }
        AEQbTJ(errorNoticeView, z, str3, strKWHzl2, ErrorNoticeView.Level.Warning, str4, new Function0() { // from class: o.iph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24995ioP.OLrzqt(mpcWalletAbleStatus, this, fragmentActivity);
            }
        });
        return z;
    }

    public static final Unit OLrzqt(MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, C24995ioP c24995ioP, FragmentActivity fragmentActivity) {
        if (mpcWalletAbleStatus != null) {
            c24995ioP.copydefault(mpcWalletAbleStatus, fragmentActivity);
        }
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(ErrorNoticeView errorNoticeView, boolean z, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, ErrorNoticeView.Level level, java.lang.String str, Function0<Unit> function0) {
        errorNoticeView.setVisibility(z ? 0 : 8);
        if (z) {
            ErrorNoticeView.setText$default(errorNoticeView, charSequence, charSequence2, level, null, str, function0, 8, null);
        }
    }

    public final void copydefault(MpcWalletService.MpcWalletAbleStatus mpcWalletAbleStatus, final FragmentActivity fragmentActivity) {
        int i = TaskDescription.OLrzqt[mpcWalletAbleStatus.ordinal()];
        if (i == 1 || i == 2) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.valueOf).fARcdN().OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.ioU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24995ioP.copydefault(fragmentActivity, this, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ioV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24995ioP.gEmmrt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.ioW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24995ioP.AEQbTJ((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ipb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C24995ioP.AhwBna(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.EZpvd);
            return;
        }
        if (i != 3) {
            return;
        }
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt2 = C22380heK.OLrzqt.copydefault(this.valueOf).fARcdN().OLrzqt();
        final Function1 function13 = new Function1() { // from class: o.ipq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.EZpvd(fragmentActivity, this, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ipn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24995ioP.valueOf(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.ipt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ioT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24995ioP.djBIcL(function14, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ2, this.EZpvd);
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(FragmentActivity fragmentActivity, final C24995ioP c24995ioP, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.EZpvd(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.ipk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C24995ioP c24995ioP, boolean z) {
        if (z) {
            c24995ioP.AYXKKw.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, final C24995ioP c24995ioP, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.AEQbTJ(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.ipp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.EZpvd(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C24995ioP c24995ioP, boolean z) {
        if (z) {
            c24995ioP.AYXKKw.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final boolean OLrzqt(@NotNull SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        return swapState == SwapState.FETCHING_ERROR || this.AYXKKw.QUSxYX().AYXKKw();
    }

    public final boolean EZpvd(InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l, java.lang.Long l2) {
        if (l != null) {
            long jLongValue = l.longValue();
            if (interfaceC9738bbJ.getFieldNames()) {
                if (interfaceC9738bbJ.AkhnZx(jLongValue) && (l2 == null || interfaceC9738bbJ.AkhnZx(l2.longValue()))) {
                    return true;
                }
            } else {
                return interfaceC9738bbJ.AkhnZx(jLongValue);
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.ioP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Function0 buildCallback$default(C24995ioP c24995ioP, androidx.fragment.app.FragmentManager fragmentManager, Function1 function1, java.lang.Long l, java.lang.Long l2, Function1 function12, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function12 = new Function1() { // from class: o.ipr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C24995ioP.OLrzqt((InterfaceC9738bbJ) obj2));
                }
            };
        }
        return c24995ioP.copydefault(fragmentManager, (Function1<? super java.lang.Boolean, Unit>) function1, l, l2, (Function1<? super InterfaceC9738bbJ, java.lang.Boolean>) function12);
    }

    public final Function0<Unit> copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final Function1<? super java.lang.Boolean, Unit> function1, final java.lang.Long l, final java.lang.Long l2, final Function1<? super InterfaceC9738bbJ, java.lang.Boolean> function12) {
        return new Function0() { // from class: o.ipj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24995ioP.EZpvd(l, fragmentManager, function12, this, l2, function1);
            }
        };
    }

    public static final Unit EZpvd(final java.lang.Long l, androidx.fragment.app.FragmentManager fragmentManager, final Function1 function1, final C24995ioP c24995ioP, final java.lang.Long l2, Function1 function12) {
        CurrentWalletSwitchNetworkMode singleNetwork;
        if (l != null) {
            l.longValue();
            singleNetwork = new CurrentWalletSwitchNetworkMode.SingleNetwork(l.longValue());
        } else {
            singleNetwork = CurrentWalletSwitchNetworkMode.Ignored.OLrzqt;
        }
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default((xWX) C43251rlk.copydefault(xWX.class), fragmentManager, new CurrentWalletSwitchConfig(null, singleNetwork, C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.ipl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(C24995ioP.EZpvd(function1, c24995ioP, l, l2, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new Application(function12, c24995ioP), 8, null);
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(Function1 function1, C24995ioP c24995ioP, java.lang.Long l, java.lang.Long l2, InterfaceC9738bbJ interfaceC9738bbJ, java.lang.Long l3) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return ((java.lang.Boolean) function1.invoke(interfaceC9738bbJ)).booleanValue() && c24995ioP.EZpvd(interfaceC9738bbJ, l, l2);
    }

    /* JADX INFO: renamed from: o.ioP$Application */
    public static final class Application implements InterfaceC54855xXv {
        public final /* synthetic */ Function1<java.lang.Boolean, Unit> AEQbTJ;
        public final /* synthetic */ C24995ioP KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Function1<? super java.lang.Boolean, Unit> function1, C24995ioP c24995ioP) {
            this.AEQbTJ = function1;
            this.KWHzl = c24995ioP;
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.copydefault(this, interfaceC9738bbJ);
            Function1<java.lang.Boolean, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.KWHzl.valueOf)));
            }
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
            Function1<java.lang.Boolean, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.KWHzl.valueOf)));
            }
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
            Function1<java.lang.Boolean, Unit> function1 = this.AEQbTJ;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C22372heC.AEQbTJ(this.KWHzl.valueOf)));
            }
        }
    }

    public final Function0<Unit> copydefault(final androidx.fragment.app.FragmentManager fragmentManager, final long j, final LifecycleOwner lifecycleOwner) {
        return new Function0() { // from class: o.ipg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24995ioP.AEQbTJ(this.AEQbTJ, lifecycleOwner, fragmentManager, j);
            }
        };
    }

    public static final Unit AEQbTJ(final C24995ioP c24995ioP, LifecycleOwner lifecycleOwner, final androidx.fragment.app.FragmentManager fragmentManager, final long j) {
        final InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(c24995ioP.valueOf).fARcdN();
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(interfaceC23194htdFARcdN.OLrzqt(), lifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.ioQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.copydefault(interfaceC23194htdFARcdN, fragmentManager, j, c24995ioP, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ioX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24995ioP.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ipe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24995ioP.AhwBna((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ipi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C24995ioP.DbNXlk(function12, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: o.ioP$Activity */
    public static final class Activity implements xWC {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InterfaceC9738bbJ KWHzl;

        /* JADX INFO: renamed from: o.ioP$Activity$ActionBar */
        public final /* synthetic */ class ActionBar {
            public static final /* synthetic */ int[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[WalletAddressSwitchException.ErrorType.values().length];
                try {
                    iArr[WalletAddressSwitchException.ErrorType.INVALID_WALLET.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletAddressSwitchException.ErrorType.INVALID_COIN_ID.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[WalletAddressSwitchException.ErrorType.COIN_NOT_SUPPORT_AGGREGATION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                EZpvd = iArr;
            }
        }

        public Activity(long j, InterfaceC9738bbJ interfaceC9738bbJ) {
            this.EZpvd = j;
            this.KWHzl = interfaceC9738bbJ;
        }

        @Override // o.xWC
        public void KWHzl(java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            C24995ioP.this.AYXKKw.iwGUEr().getCoinAssets(CoinAssets.BOTH, C24995ioP.this.AYXKKw.dmfpNf(), C24995ioP.this.AYXKKw);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = C24995ioP.this.AYXKKw.QUSxYX().valueOf();
            if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null), (java.lang.Object) "0")) {
                C22947hov c22947hov = new C22947hov(str, java.lang.String.valueOf(this.EZpvd), null, null, this.KWHzl.AYXKKw(), false, 44, null);
                C24995ioP.this.AYXKKw.finit().AEQbTJ(c22947hov);
                DefiChainInfo defiChainInfoKWHzl = C22380heK.OLrzqt.copydefault(C24995ioP.this.valueOf).AkhnZx().KWHzl(dexMultiTokenInfoBeanValueOf.getChainId());
                if (defiChainInfoKWHzl != null) {
                    C24995ioP.this.AYXKKw.OHqIaq().setValue(new Triple<>(defiChainInfoKWHzl, c22947hov, dexMultiTokenInfoBeanValueOf));
                }
            }
            C24995ioP.this.AYXKKw.dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        }

        @Override // o.xWC
        public void OLrzqt(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            if (th instanceof WalletAddressSwitchException) {
                WalletAddressSwitchException walletAddressSwitchException = (WalletAddressSwitchException) th;
                int i = ActionBar.EZpvd[walletAddressSwitchException.getErrorType().ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    C55326xho.toast$default(C23274hvD.Fragment.heceqZ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    C6777aVl.Companion.EZpvd(new java.lang.Exception("function: showBtcWalletAddressTypeDialog:\n errorType: " + walletAddressSwitchException.getErrorType().name() + " "));
                    return;
                }
                return;
            }
            C55326xho.toast$default(C23274hvD.Fragment.heceqZ, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(InterfaceC23194htd interfaceC23194htd, androidx.fragment.app.FragmentManager fragmentManager, long j, C24995ioP c24995ioP, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.copydefault(interfaceC9738bbJ);
        interfaceC23194htd.AEQbTJ(fragmentManager, j, interfaceC9738bbJ, c24995ioP.new Activity(j, interfaceC9738bbJ));
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull QuoteErrorBean quoteErrorBean, final hBP hbp, @NotNull C24694iif c24694iif, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity, @NotNull SwapType swapType, @NotNull SwapState swapState, Function1<? super java.lang.Boolean, Unit> function1, boolean z, @NotNull Function0<Unit> function0) {
        SwapState swapState2;
        Intrinsics.checkNotNullParameter(quoteErrorBean, "");
        Intrinsics.checkNotNullParameter(c24694iif, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(swapType, "");
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (hbp != null) {
            hbp.valueOf.KWHzl(!z);
            QuotePriceRes value = this.AYXKKw.AubY().getValue();
            boolean zDAppRedirectDueToInsufficientLiquidity = value != null ? value.dAppRedirectDueToInsufficientLiquidity() : false;
            SwapState swapState3 = SwapState.BLACK_ADDRESS;
            if (swapState == swapState3) {
                ErrorNoticeView errorNoticeView = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                updateErrorState$default(this, swapState3, fragmentManager, errorNoticeView, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                return;
            }
            if (this.AYXKKw.QVsKAR().isWalletError(this.valueOf)) {
                SwapState syncWalletState = this.AYXKKw.QVsKAR().getSyncWalletState(this.valueOf);
                ErrorNoticeView errorNoticeView2 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView2, "");
                updateErrorState$default(this, syncWalletState, fragmentManager, errorNoticeView2, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                return;
            }
            SwapState swapState4 = SwapState.SWAP_UNSUPPORTED_FOR_DAPP;
            if (swapState == swapState4 || zDAppRedirectDueToInsufficientLiquidity) {
                ErrorNoticeView errorNoticeView3 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView3, "");
                updateErrorState$default(this, swapState4, fragmentManager, errorNoticeView3, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                return;
            }
            if (swapState == SwapState.SWAP_CHAIN_MARKET_UNSUPPORTED_FOR_DAPP) {
                ErrorNoticeView errorNoticeView4 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView4, "");
                updateErrorState$default(this, swapState, fragmentManager, errorNoticeView4, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                return;
            }
            if (swapState == SwapState.STAND_BY_DISH) {
                hbp.AYXKKw.AEQbTJ(this.AYXKKw, fragmentManager, fragmentActivity, false, function1);
                return;
            }
            if (this.AYXKKw.QUSxYX().DbNXlk()) {
                hbp.AYXKKw.EZpvd(fragmentManager, fragmentActivity, false, function1);
                return;
            }
            if (quoteErrorBean.isError()) {
                SwapState swapState5 = SwapState.FETCHING_ERROR;
                ErrorNoticeView errorNoticeView5 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView5, "");
                updateErrorState$default(this, swapState5, fragmentManager, errorNoticeView5, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                this.AYXKKw.RlQdEF().noQuoteFetched(this.AYXKKw);
                return;
            }
            if (quoteErrorBean.shouldShowFacetSwapWarning()) {
                SwapState swapState6 = SwapState.FACET_SWAP_WARNING;
                ErrorNoticeView errorNoticeView6 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView6, "");
                updateErrorState$default(this, swapState6, fragmentManager, errorNoticeView6, fragmentActivity, quoteErrorBean, null, null, function1, 96, null);
                return;
            }
            if (quoteErrorBean.isThorswapBtcAddressError()) {
                SwapState swapState7 = SwapState.SWAP_THORSWAP_BTC_ADDRESS_ERROR;
                ErrorNoticeView errorNoticeView7 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView7, "");
                updateErrorState$default(this, swapState7, fragmentManager, errorNoticeView7, fragmentActivity, quoteErrorBean, null, null, function1, 96, null);
                return;
            }
            if (quoteErrorBean.isQuoteErrorValueOutOfScope() || quoteErrorBean.isQuoteErrorMaxOrMinLimit()) {
                if (!this.AYXKKw.htlTjW()) {
                    this.AYXKKw.RlQdEF().noQuoteFetched(this.AYXKKw);
                }
                if (OLrzqt(quoteErrorBean)) {
                    int i = TaskDescription.AEQbTJ[swapType.ordinal()];
                    if (i == 1) {
                        swapState2 = SwapState.NO_QUOTE_FETCHED;
                    } else if (i == 2) {
                        swapState2 = SwapState.CROSS_CHAIN_BRIDGE_UNSUPPORTED;
                    } else if (i == 3) {
                        swapState2 = SwapState.NO_QUOTE_FETCHED;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        swapState2 = SwapState.CROSS_CHAIN_BRIDGE_UNSUPPORTED;
                    }
                    ErrorNoticeView errorNoticeView8 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView8, "");
                    updateErrorState$default(this, swapState2, fragmentManager, errorNoticeView8, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                } else {
                    SwapState swapState8 = SwapState.SCOPE_TIPS_WARNING;
                    ErrorNoticeView errorNoticeView9 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView9, "");
                    updateErrorState$default(this, swapState8, fragmentManager, errorNoticeView9, fragmentActivity, quoteErrorBean, null, new Function0() { // from class: o.ipc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return C24995ioP.KWHzl(hbp);
                        }
                    }, function1, 32, null);
                }
                this.AYXKKw.fetchVPNInfo(false);
                return;
            }
            if (quoteErrorBean.isOrbiterQuoteNoQuoteFetched()) {
                SwapState swapState9 = SwapState.ORBITER_QUOTE_FETCH_FAILED;
                ErrorNoticeView errorNoticeView10 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView10, "");
                updateErrorState$default(this, swapState9, fragmentManager, errorNoticeView10, fragmentActivity, quoteErrorBean, null, null, function1, 96, null);
                return;
            }
            if (quoteErrorBean.isQuoteNoQuoteFetched()) {
                this.AYXKKw.RlQdEF().noQuoteFetched(this.AYXKKw);
                int i2 = TaskDescription.AEQbTJ[swapType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                    SwapState swapState10 = SwapState.CROSS_CHAIN_BRIDGE_UNSUPPORTED;
                    ErrorNoticeView errorNoticeView11 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView11, "");
                    updateErrorState$default(this, swapState10, fragmentManager, errorNoticeView11, fragmentActivity, quoteErrorBean, null, null, function1, 96, null);
                    return;
                }
                if (c24694iif.OLrzqt() == DexSwapLiquiditySource.All) {
                    SwapState swapState11 = SwapState.NO_QUOTE_FETCHED;
                    ErrorNoticeView errorNoticeView12 = hbp.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(errorNoticeView12, "");
                    updateErrorState$default(this, swapState11, fragmentManager, errorNoticeView12, fragmentActivity, null, null, null, function1, WalletImportError.ERROR_CODE_AA_EXIST, null);
                    return;
                }
                SwapState swapState12 = SwapState.NO_LIQUIDITY_AT_THE_MOMENT;
                ErrorNoticeView errorNoticeView13 = hbp.EZpvd;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView13, "");
                OLrzqt(swapState12, fragmentManager, errorNoticeView13, fragmentActivity, quoteErrorBean, c24694iif, function0, function1);
            }
        }
    }

    public static final Unit KWHzl(hBP hbp) {
        C25052ipT c25052ipTFetchVPNInfo = hbp.valueOf.fetchVPNInfo();
        if (c25052ipTFetchVPNInfo != null) {
            c25052ipTFetchVPNInfo.setVisibility(8);
        }
        hbp.valueOf.KWHzl(false);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(hBP hbp, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if (hbp == null || this.AYXKKw.QVsKAR().isWalletError(this.valueOf)) {
            return;
        }
        SwapState swapState = SwapState.APPROVED_AND_NEED_CANCEL_APPROVE;
        ErrorNoticeView errorNoticeView = hbp.EZpvd;
        Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
        updateErrorState$default(this, swapState, fragmentManager, errorNoticeView, fragmentActivity, null, null, null, null, 96, null);
    }

    public final boolean OLrzqt(QuoteErrorBean quoteErrorBean) {
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(quoteErrorBean.getCrossMiniAmount(), quoteErrorBean.getCrossMaxAmount());
        return C23313hvq.EZpvd(quoteErrorBean.getAmount(), pairOLrzqt.getFirst()) && C23313hvq.valueOf(quoteErrorBean.getAmount(), pairOLrzqt.getSecond());
    }

    public final void KWHzl(@NotNull ErrorNoticeView errorNoticeView, boolean z) {
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        if (this.copydefault) {
            AEQbTJ(errorNoticeView, true, "", C22334hdR.OLrzqt(true, true), ErrorNoticeView.Level.Warning, "", new Function0() { // from class: o.ipm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C24995ioP.gEmmrt();
                }
            });
        } else {
            errorNoticeView.setVisibility(z ? 0 : 8);
        }
    }

    public static final Unit gEmmrt() {
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(QuoteErrorBean quoteErrorBean) {
        java.lang.String errorMsg;
        return (quoteErrorBean == null || (errorMsg = quoteErrorBean.getErrorMsg()) == null || errorMsg.length() <= 0) ? false : true;
    }
}
