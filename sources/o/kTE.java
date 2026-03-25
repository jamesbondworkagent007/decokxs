package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedTokenPairDelegate$fetchPricingTokens$1;
import com.okinc.business.trade.features.home.advanced.viewmodel.delegate.AdvancedTokenPairDelegate$validateTokens$1;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.UIPricingToken;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC30595leC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kTE {
    public final MutableStateFlow<DexMultiTokenInfoBean> AEQbTJ;
    public final kRD AYXKKw;
    public final StateFlow<java.util.List<UIPricingToken>> EZpvd;
    public final MutableStateFlow<DexMultiTokenInfoBean> KWHzl;
    public final MutableStateFlow<java.util.List<UIPricingToken>> OLrzqt;
    public final StateFlow<DexMultiTokenInfoBean> copydefault;
    public final MutableLiveData<java.lang.Boolean> djBIcL;
    public final StateFlow<DexMultiTokenInfoBean> gEmmrt;
    public final C22311hcv valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<DexMultiTokenInfoBean> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<DexMultiTokenInfoBean> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.util.List<UIPricingToken>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<UIPricingToken>> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DexMultiTokenInfoBean> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> valueOf() {
        return this.djBIcL;
    }

    @yCM
    public kTE(@NotNull kRD krd, @NotNull C22311hcv c22311hcv) {
        Intrinsics.checkNotNullParameter(krd, "");
        Intrinsics.checkNotNullParameter(c22311hcv, "");
        this.AYXKKw = krd;
        this.valueOf = c22311hcv;
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<DexMultiTokenInfoBean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow2;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.util.List<UIPricingToken>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.OLrzqt = MutableStateFlow3;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow3);
        this.djBIcL = new MutableLiveData<>(java.lang.Boolean.FALSE);
    }

    public final boolean KWHzl(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.AEQbTJ.getValue())) {
            return false;
        }
        this.AEQbTJ.setValue(dexMultiTokenInfoBean);
        return true;
    }

    public final boolean AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        if (C30565ldZ.OLrzqt(dexMultiTokenInfoBean, this.KWHzl.getValue())) {
            return false;
        }
        this.KWHzl.setValue(dexMultiTokenInfoBean);
        return true;
    }

    public final boolean EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull AdvancedTradeType advancedTradeType, boolean z) {
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        if (z) {
            return true;
        }
        AdvancedTradeType advancedTradeType2 = AdvancedTradeType.BUY;
        return dexMultiTokenInfoBean == null || !C30565ldZ.OLrzqt(dexMultiTokenInfoBean, (advancedTradeType == advancedTradeType2 ? this.gEmmrt : this.copydefault).getValue()) || dexMultiTokenInfoBean2 == null || !C30565ldZ.OLrzqt(dexMultiTokenInfoBean2, (advancedTradeType == advancedTradeType2 ? this.copydefault : this.gEmmrt).getValue());
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kTE.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final InterfaceC30595leC AEQbTJ;
            public final java.lang.String KWHzl;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC30595leC interfaceC30595leC, boolean z, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    interfaceC30595leC = stateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = stateListAnimator.OLrzqt;
                }
                if ((i & 4) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                return stateListAnimator.KWHzl(interfaceC30595leC, z, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC30595leC EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(InterfaceC30595leC interfaceC30595leC, boolean z, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(interfaceC30595leC, z, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                InterfaceC30595leC interfaceC30595leC = this.AEQbTJ;
                return ((((interfaceC30595leC == null ? 0 : interfaceC30595leC.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(error=" + this.AEQbTJ + ", fromTokenChanged=" + this.OLrzqt + ", quoteChainId=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(InterfaceC30595leC interfaceC30595leC, boolean z, @NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.AEQbTJ = interfaceC30595leC;
                this.OLrzqt = z;
                this.KWHzl = str;
            }
        }

        public static final class ActionBar extends Application {
            public final boolean EZpvd;
            public final DexMultiTokenInfoBean KWHzl;
            public final DexMultiTokenInfoBean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    dexMultiTokenInfoBean = actionBar.KWHzl;
                }
                if ((i & 2) != 0) {
                    dexMultiTokenInfoBean2 = actionBar.OLrzqt;
                }
                if ((i & 4) != 0) {
                    z = actionBar.EZpvd;
                }
                return actionBar.KWHzl(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DexMultiTokenInfoBean EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
                return new ActionBar(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DexMultiTokenInfoBean copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && this.EZpvd == actionBar.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                DexMultiTokenInfoBean dexMultiTokenInfoBean = this.KWHzl;
                int iHashCode = dexMultiTokenInfoBean == null ? 0 : dexMultiTokenInfoBean.hashCode();
                DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.OLrzqt;
                return (((iHashCode * 31) + (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failure(quoteToken=" + this.KWHzl + ", baseToken=" + this.OLrzqt + ", fromQuickMode=" + this.EZpvd + ")";
            }

            public ActionBar(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, boolean z) {
                super(null);
                this.KWHzl = dexMultiTokenInfoBean;
                this.OLrzqt = dexMultiTokenInfoBean2;
                this.EZpvd = z;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull AdvancedTradeType advancedTradeType, DexMultiTokenInfoBean dexMultiTokenInfoBean3, InterfaceC30595leC interfaceC30595leC, @NotNull Function2<? super ValidateTokensRequest, ? super Continuation<? super Result<kotlin.Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>, ? extends java.lang.Object> function2, boolean z, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        AdvancedTokenPairDelegate$validateTokens$1 advancedTokenPairDelegate$validateTokens$1;
        kTE kte;
        InterfaceC30595leC interfaceC30595leCEZpvd;
        DexMultiTokenInfoBean dexMultiTokenInfoBean4;
        boolean z2;
        if (continuation instanceof AdvancedTokenPairDelegate$validateTokens$1) {
            advancedTokenPairDelegate$validateTokens$1 = (AdvancedTokenPairDelegate$validateTokens$1) continuation;
            int i = advancedTokenPairDelegate$validateTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedTokenPairDelegate$validateTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedTokenPairDelegate$validateTokens$1 = new AdvancedTokenPairDelegate$validateTokens$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = advancedTokenPairDelegate$validateTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedTokenPairDelegate$validateTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objInvoke);
            ValidateTokensRequest validateTokensRequestAEQbTJ = AEQbTJ(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, dexMultiTokenInfoBean3, z);
            this.djBIcL.setValue(C56443yFo.KWHzl(true));
            advancedTokenPairDelegate$validateTokens$1.L$0 = this;
            advancedTokenPairDelegate$validateTokens$1.L$1 = dexMultiTokenInfoBean;
            advancedTokenPairDelegate$validateTokens$1.L$2 = dexMultiTokenInfoBean2;
            advancedTokenPairDelegate$validateTokens$1.L$3 = advancedTradeType;
            advancedTokenPairDelegate$validateTokens$1.L$4 = interfaceC30595leC;
            advancedTokenPairDelegate$validateTokens$1.Z$0 = z;
            advancedTokenPairDelegate$validateTokens$1.label = 1;
            objInvoke = function2.invoke(validateTokensRequestAEQbTJ, advancedTokenPairDelegate$validateTokens$1);
            if (objInvoke == objCopydefault) {
                return objCopydefault;
            }
            kte = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = advancedTokenPairDelegate$validateTokens$1.Z$0;
                interfaceC30595leCEZpvd = (InterfaceC30595leC) advancedTokenPairDelegate$validateTokens$1.L$1;
                dexMultiTokenInfoBean4 = (DexMultiTokenInfoBean) advancedTokenPairDelegate$validateTokens$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                return new Application.StateListAnimator(interfaceC30595leCEZpvd, z2, dexMultiTokenInfoBean4.getChainId());
            }
            z = advancedTokenPairDelegate$validateTokens$1.Z$0;
            interfaceC30595leC = (InterfaceC30595leC) advancedTokenPairDelegate$validateTokens$1.L$4;
            advancedTradeType = (AdvancedTradeType) advancedTokenPairDelegate$validateTokens$1.L$3;
            dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) advancedTokenPairDelegate$validateTokens$1.L$2;
            dexMultiTokenInfoBean = (DexMultiTokenInfoBean) advancedTokenPairDelegate$validateTokens$1.L$1;
            kte = (kTE) advancedTokenPairDelegate$validateTokens$1.L$0;
            C56391yDq.AEQbTJ(objInvoke);
        }
        java.lang.Object objM7386unboximpl = ((Result) objInvoke).m7386unboximpl();
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
            kotlin.Pair pair = (kotlin.Pair) objM7386unboximpl;
            DexMultiTokenInfoBean dexMultiTokenInfoBean5 = (DexMultiTokenInfoBean) pair.component1();
            DexMultiTokenInfoBean dexMultiTokenInfoBean6 = (DexMultiTokenInfoBean) pair.component2();
            kte.djBIcL.setValue(C56443yFo.KWHzl(false));
            interfaceC30595leCEZpvd = kte.EZpvd(dexMultiTokenInfoBean2, dexMultiTokenInfoBean6, interfaceC30595leC);
            boolean zOLrzqt = kte.OLrzqt(dexMultiTokenInfoBean5, dexMultiTokenInfoBean6, advancedTradeType);
            java.lang.String chainId = dexMultiTokenInfoBean6.getChainId();
            java.lang.String tokenContractAddress = dexMultiTokenInfoBean6.getTokenContractAddress();
            advancedTokenPairDelegate$validateTokens$1.L$0 = dexMultiTokenInfoBean5;
            advancedTokenPairDelegate$validateTokens$1.L$1 = interfaceC30595leCEZpvd;
            advancedTokenPairDelegate$validateTokens$1.L$2 = null;
            advancedTokenPairDelegate$validateTokens$1.L$3 = null;
            advancedTokenPairDelegate$validateTokens$1.L$4 = null;
            advancedTokenPairDelegate$validateTokens$1.Z$0 = zOLrzqt;
            advancedTokenPairDelegate$validateTokens$1.label = 2;
            if (kte.AEQbTJ(chainId, tokenContractAddress, advancedTradeType, advancedTokenPairDelegate$validateTokens$1) == objCopydefault) {
                return objCopydefault;
            }
            dexMultiTokenInfoBean4 = dexMultiTokenInfoBean5;
            z2 = zOLrzqt;
            return new Application.StateListAnimator(interfaceC30595leCEZpvd, z2, dexMultiTokenInfoBean4.getChainId());
        }
        kte.djBIcL.setValue(C56443yFo.KWHzl(false));
        return new Application.ActionBar(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, z);
    }

    public static final class StateListAnimator<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((UIPricingToken) t2).EZpvd().getCurrencyAmount())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((UIPricingToken) t).EZpvd().getCurrencyAmount())));
        }
    }

    public final ValidateTokensRequest AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, DexMultiTokenInfoBean dexMultiTokenInfoBean3, boolean z) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String tokenContractAddress;
        java.lang.String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        java.lang.String chainId2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null;
        str = "";
        if (chainId2 == null || chainId2.length() == 0) {
            chainId2 = "";
        }
        java.lang.String str4 = (chainId == null || chainId.length() == 0) ? chainId2 : chainId;
        java.lang.String strAEQbTJ = (dexMultiTokenInfoBean == null || (tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress()) == null) ? this.valueOf.AEQbTJ(str4) : tokenContractAddress;
        java.lang.String tokenContractAddress2 = dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getTokenContractAddress() : null;
        if (tokenContractAddress2 == null) {
            tokenContractAddress2 = "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) tokenContractAddress2)) {
            if (z) {
                java.lang.String tokenContractAddress3 = dexMultiTokenInfoBean3 != null ? dexMultiTokenInfoBean3.getTokenContractAddress() : null;
                str2 = strAEQbTJ;
                str3 = tokenContractAddress3 != null ? tokenContractAddress3 : "";
            }
            return new ValidateTokensRequest(str4, null, null, str2, str3, 6, null);
        }
        str = strAEQbTJ;
        str2 = str;
        str3 = tokenContractAddress2;
        return new ValidateTokensRequest(str4, null, null, str2, str3, 6, null);
    }

    public final InterfaceC30595leC EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, InterfaceC30595leC interfaceC30595leC) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        return (dexMultiTokenInfoBean == null || dexMultiTokenInfoBean.getTokenContractAddress().length() <= 0 || Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean2.getTokenContractAddress(), (java.lang.Object) dexMultiTokenInfoBean.getTokenContractAddress())) ? interfaceC30595leC : InterfaceC30595leC.BroadcastReceiver.OLrzqt;
    }

    public final boolean OLrzqt(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean2, @NotNull AdvancedTradeType advancedTradeType) {
        boolean zKWHzl;
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean2, "");
        Intrinsics.checkNotNullParameter(advancedTradeType, "");
        if (advancedTradeType == AdvancedTradeType.BUY) {
            zKWHzl = KWHzl(dexMultiTokenInfoBean);
            AEQbTJ(dexMultiTokenInfoBean2);
        } else {
            zKWHzl = KWHzl(dexMultiTokenInfoBean2);
            AEQbTJ(dexMultiTokenInfoBean);
        }
        this.valueOf.KWHzl(dexMultiTokenInfoBean.getChainId(), dexMultiTokenInfoBean.getTokenContractAddress());
        return zKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull AdvancedTradeType advancedTradeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AdvancedTokenPairDelegate$fetchPricingTokens$1 advancedTokenPairDelegate$fetchPricingTokens$1;
        java.lang.Object objEZpvd;
        kTE kte;
        if (continuation instanceof AdvancedTokenPairDelegate$fetchPricingTokens$1) {
            advancedTokenPairDelegate$fetchPricingTokens$1 = (AdvancedTokenPairDelegate$fetchPricingTokens$1) continuation;
            int i = advancedTokenPairDelegate$fetchPricingTokens$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedTokenPairDelegate$fetchPricingTokens$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedTokenPairDelegate$fetchPricingTokens$1 = new AdvancedTokenPairDelegate$fetchPricingTokens$1(this, continuation);
            }
        }
        java.lang.Object obj = advancedTokenPairDelegate$fetchPricingTokens$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedTokenPairDelegate$fetchPricingTokens$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            kRD krd = this.AYXKKw;
            advancedTokenPairDelegate$fetchPricingTokens$1.L$0 = this;
            advancedTokenPairDelegate$fetchPricingTokens$1.L$1 = advancedTradeType;
            advancedTokenPairDelegate$fetchPricingTokens$1.label = 1;
            objEZpvd = krd.EZpvd(str, str2, advancedTokenPairDelegate$fetchPricingTokens$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            kte = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            advancedTradeType = (AdvancedTradeType) advancedTokenPairDelegate$fetchPricingTokens$1.L$1;
            kte = (kTE) advancedTokenPairDelegate$fetchPricingTokens$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            java.util.List list = (java.util.List) objEZpvd;
            if (!list.isEmpty()) {
                kte.OLrzqt.setValue(CollectionsKt___CollectionsKt.EZpvd(list, new StateListAnimator()));
                kte.EZpvd(advancedTradeType == AdvancedTradeType.BUY ? kte.AEQbTJ.getValue() : kte.KWHzl.getValue());
            }
        }
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            kte.OLrzqt.setValue(yDY.AhwBna());
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (dexMultiTokenInfoBean == null) {
            return;
        }
        MutableStateFlow<java.util.List<UIPricingToken>> mutableStateFlow = this.OLrzqt;
        java.util.List<UIPricingToken> value = mutableStateFlow.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
        for (UIPricingToken uIPricingToken : value) {
            arrayList.add(UIPricingToken.copy$default(uIPricingToken, null, Intrinsics.EZpvd((java.lang.Object) uIPricingToken.EZpvd().getTokenContractAddress(), (java.lang.Object) dexMultiTokenInfoBean.getTokenContractAddress()), 1, null));
        }
        mutableStateFlow.setValue(arrayList);
    }
}
