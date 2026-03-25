package com.okinc.business.trade.features.home.meme.usecase.transaction;

import android.os.Bundle;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatusGroup;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC32996moC;
import o.C22416heu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kWB;
import o.kWG;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6ApproveExecutionUseCase {
    public final kWB EZpvd;
    public final kWG KWHzl;
    public final boolean OLrzqt;

    @yCM
    public MemeV6ApproveExecutionUseCase(@NotNull kWG kwg, @NotNull kWB kwb) {
        Intrinsics.checkNotNullParameter(kwg, "");
        Intrinsics.checkNotNullParameter(kwb, "");
        this.KWHzl = kwg;
        this.EZpvd = kwb;
        this.OLrzqt = C22416heu.AhwBna();
    }

    public static final class ApproveStateCheckParams {
        public static final int $stable = 8;
        private final String chainId;
        private final String decimals;
        private final String defiPlatformId;
        private final String inputAmount;
        private final boolean isAutoSellEnabled;
        private final String toTokenContractAddress;
        private final String tokenContractAddress;
        private final TradeStatePool tradeStatePool;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.toTokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.inputAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeStatePool component6() {
            return this.tradeStatePool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.defiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveStateCheckParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull TradeStatePool tradeStatePool, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(tradeStatePool, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new ApproveStateCheckParams(str, str2, str3, str4, str5, tradeStatePool, str6, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApproveStateCheckParams)) {
                return false;
            }
            ApproveStateCheckParams approveStateCheckParams = (ApproveStateCheckParams) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) approveStateCheckParams.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) approveStateCheckParams.tokenContractAddress) && Intrinsics.EZpvd((Object) this.toTokenContractAddress, (Object) approveStateCheckParams.toTokenContractAddress) && Intrinsics.EZpvd((Object) this.decimals, (Object) approveStateCheckParams.decimals) && Intrinsics.EZpvd((Object) this.inputAmount, (Object) approveStateCheckParams.inputAmount) && Intrinsics.EZpvd(this.tradeStatePool, approveStateCheckParams.tradeStatePool) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) approveStateCheckParams.defiPlatformId) && this.isAutoSellEnabled == approveStateCheckParams.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDecimals() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDefiPlatformId() {
            return this.defiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInputAmount() {
            return this.inputAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToTokenContractAddress() {
            return this.toTokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenContractAddress() {
            return this.tokenContractAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeStatePool getTradeStatePool() {
            return this.tradeStatePool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.toTokenContractAddress.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.inputAmount.hashCode()) * 31) + this.tradeStatePool.hashCode()) * 31) + this.defiPlatformId.hashCode()) * 31) + Boolean.hashCode(this.isAutoSellEnabled);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAutoSellEnabled() {
            return this.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveStateCheckParams(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", toTokenContractAddress=" + this.toTokenContractAddress + ", decimals=" + this.decimals + ", inputAmount=" + this.inputAmount + ", tradeStatePool=" + this.tradeStatePool + ", defiPlatformId=" + this.defiPlatformId + ", isAutoSellEnabled=" + this.isAutoSellEnabled + ")";
        }

        public ApproveStateCheckParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull TradeStatePool tradeStatePool, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(tradeStatePool, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.chainId = str;
            this.tokenContractAddress = str2;
            this.toTokenContractAddress = str3;
            this.decimals = str4;
            this.inputAmount = str5;
            this.tradeStatePool = tradeStatePool;
            this.defiPlatformId = str6;
            this.isAutoSellEnabled = z;
        }
    }

    public static final class ApproveExecutionParams {
        public static final int $stable = 8;
        private final String chainId;
        private final String decimals;
        private final String defiPlatformId;
        private final AbstractC32996moC fragment;
        private final String fromTokenAddress;
        private final String inputAmount;
        private final boolean isAutoSellEnabled;
        private final SwapState swapState;
        private final String toTokenAddress;
        private final TradeStatePool tradeStatePool;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component10() {
            return this.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.fromTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.toTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC32996moC component5() {
            return this.fragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwapState component6() {
            return this.swapState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.inputAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeStatePool component8() {
            return this.tradeStatePool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.defiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ApproveExecutionParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AbstractC32996moC abstractC32996moC, @NotNull SwapState swapState, @NotNull String str5, @NotNull TradeStatePool tradeStatePool, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(abstractC32996moC, "");
            Intrinsics.checkNotNullParameter(swapState, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(tradeStatePool, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new ApproveExecutionParams(str, str2, str3, str4, abstractC32996moC, swapState, str5, tradeStatePool, str6, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApproveExecutionParams)) {
                return false;
            }
            ApproveExecutionParams approveExecutionParams = (ApproveExecutionParams) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) approveExecutionParams.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) approveExecutionParams.fromTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) approveExecutionParams.toTokenAddress) && Intrinsics.EZpvd((Object) this.decimals, (Object) approveExecutionParams.decimals) && Intrinsics.EZpvd(this.fragment, approveExecutionParams.fragment) && this.swapState == approveExecutionParams.swapState && Intrinsics.EZpvd((Object) this.inputAmount, (Object) approveExecutionParams.inputAmount) && Intrinsics.EZpvd(this.tradeStatePool, approveExecutionParams.tradeStatePool) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) approveExecutionParams.defiPlatformId) && this.isAutoSellEnabled == approveExecutionParams.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDecimals() {
            return this.decimals;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDefiPlatformId() {
            return this.defiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC32996moC getFragment() {
            return this.fragment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFromTokenAddress() {
            return this.fromTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInputAmount() {
            return this.inputAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwapState getSwapState() {
            return this.swapState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getToTokenAddress() {
            return this.toTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TradeStatePool getTradeStatePool() {
            return this.tradeStatePool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((this.chainId.hashCode() * 31) + this.fromTokenAddress.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.decimals.hashCode()) * 31) + this.fragment.hashCode()) * 31) + this.swapState.hashCode()) * 31) + this.inputAmount.hashCode()) * 31) + this.tradeStatePool.hashCode()) * 31) + this.defiPlatformId.hashCode()) * 31) + Boolean.hashCode(this.isAutoSellEnabled);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAutoSellEnabled() {
            return this.isAutoSellEnabled;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveExecutionParams(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", toTokenAddress=" + this.toTokenAddress + ", decimals=" + this.decimals + ", fragment=" + this.fragment + ", swapState=" + this.swapState + ", inputAmount=" + this.inputAmount + ", tradeStatePool=" + this.tradeStatePool + ", defiPlatformId=" + this.defiPlatformId + ", isAutoSellEnabled=" + this.isAutoSellEnabled + ")";
        }

        public ApproveExecutionParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull AbstractC32996moC abstractC32996moC, @NotNull SwapState swapState, @NotNull String str5, @NotNull TradeStatePool tradeStatePool, @NotNull String str6, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(abstractC32996moC, "");
            Intrinsics.checkNotNullParameter(swapState, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(tradeStatePool, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.chainId = str;
            this.fromTokenAddress = str2;
            this.toTokenAddress = str3;
            this.decimals = str4;
            this.fragment = abstractC32996moC;
            this.swapState = swapState;
            this.inputAmount = str5;
            this.tradeStatePool = tradeStatePool;
            this.defiPlatformId = str6;
            this.isAutoSellEnabled = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 o.moC)
  (r18v0 com.okinc.business.trade.features.home.ui.meme.statepool.SwapState)
  (r19v0 java.lang.String)
  (r20v0 com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool)
  (r21v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.moC, com.okinc.business.trade.features.home.ui.meme.statepool.SwapState, java.lang.String, com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool, java.lang.String, boolean):void (m)] (LINE:69) call: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase.ApproveExecutionParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.moC, com.okinc.business.trade.features.home.ui.meme.statepool.SwapState, java.lang.String, com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ ApproveExecutionParams(String str, String str2, String str3, String str4, AbstractC32996moC abstractC32996moC, SwapState swapState, String str5, TradeStatePool tradeStatePool, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, abstractC32996moC, swapState, str5, tradeStatePool, str6, (i & 512) != 0 ? false : z);
        }
    }

    public final Object OLrzqt(@NotNull ApproveStateCheckParams approveStateCheckParams, @NotNull final Function1<? super ApproveStatusGroup, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objAEQbTJ = this.KWHzl.AEQbTJ(approveStateCheckParams.getChainId(), approveStateCheckParams.getTokenContractAddress(), approveStateCheckParams.getToTokenContractAddress(), approveStateCheckParams.getDecimals(), approveStateCheckParams.getInputAmount(), approveStateCheckParams.getTradeStatePool(), approveStateCheckParams.getDefiPlatformId(), Intrinsics.EZpvd((Object) approveStateCheckParams.getDefiPlatformId(), (Object) "11") && this.OLrzqt && !approveStateCheckParams.isAutoSellEnabled(), new Function1() { // from class: o.kWJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return MemeV6ApproveExecutionUseCase.copydefault(function1, (ApproveStatusGroup) obj);
            }
        }, continuation);
        return objAEQbTJ == C56442yFn.copydefault() ? objAEQbTJ : Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, ApproveStatusGroup approveStatusGroup) {
        Intrinsics.checkNotNullParameter(approveStatusGroup, "");
        function1.invoke(approveStatusGroup);
        return Unit.INSTANCE;
    }

    public final Object EZpvd(@NotNull CoroutineScope coroutineScope, @NotNull ApproveExecutionParams approveExecutionParams, @NotNull Function1<? super Bundle, Unit> function1, @NotNull Function1<? super Boolean, Unit> function12, @NotNull Continuation<? super Unit> continuation) {
        Object objCopydefault = copydefault(coroutineScope, approveExecutionParams, function1, function12, continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final Object copydefault(CoroutineScope coroutineScope, ApproveExecutionParams approveExecutionParams, Function1<? super Bundle, Unit> function1, Function1<? super Boolean, Unit> function12, Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new MemeV6ApproveExecutionUseCase$performApprovalWithFlow$2(this, approveExecutionParams, copydefault(approveExecutionParams.getSwapState()), function1, function12, null), 3, null);
        return Unit.INSTANCE;
    }

    public final Flow<Bundle> AEQbTJ(ApproveExecutionParams approveExecutionParams, String str, Function1<? super Bundle, Unit> function1) {
        return FlowKt.callbackFlow(new MemeV6ApproveExecutionUseCase$collectApprovalConfirmResult$1(this, approveExecutionParams, str, function1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Bundle bundle, ApproveExecutionParams approveExecutionParams, Continuation<? super Boolean> continuation) throws Throwable {
        MemeV6ApproveExecutionUseCase$processApprovalCallback$1 memeV6ApproveExecutionUseCase$processApprovalCallback$1;
        MemeV6ApproveExecutionUseCase memeV6ApproveExecutionUseCase;
        if (continuation instanceof MemeV6ApproveExecutionUseCase$processApprovalCallback$1) {
            memeV6ApproveExecutionUseCase$processApprovalCallback$1 = (MemeV6ApproveExecutionUseCase$processApprovalCallback$1) continuation;
            int i = memeV6ApproveExecutionUseCase$processApprovalCallback$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6ApproveExecutionUseCase$processApprovalCallback$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6ApproveExecutionUseCase$processApprovalCallback$1 = new MemeV6ApproveExecutionUseCase$processApprovalCallback$1(this, continuation);
            }
        }
        MemeV6ApproveExecutionUseCase$processApprovalCallback$1 memeV6ApproveExecutionUseCase$processApprovalCallback$12 = memeV6ApproveExecutionUseCase$processApprovalCallback$1;
        Object objFirst = memeV6ApproveExecutionUseCase$processApprovalCallback$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6ApproveExecutionUseCase$processApprovalCallback$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFirst);
            Flow<ApproveStatusGroup> flowEZpvd = EZpvd(bundle, approveExecutionParams.getChainId(), approveExecutionParams.getFromTokenAddress(), approveExecutionParams.getToTokenAddress(), approveExecutionParams.getDecimals(), approveExecutionParams.getInputAmount(), approveExecutionParams.getTradeStatePool(), approveExecutionParams.getDefiPlatformId(), approveExecutionParams.isAutoSellEnabled());
            memeV6ApproveExecutionUseCase$processApprovalCallback$12.L$0 = this;
            memeV6ApproveExecutionUseCase$processApprovalCallback$12.label = 1;
            objFirst = FlowKt.first(flowEZpvd, memeV6ApproveExecutionUseCase$processApprovalCallback$12);
            if (objFirst == objCopydefault) {
                return objCopydefault;
            }
            memeV6ApproveExecutionUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            memeV6ApproveExecutionUseCase = (MemeV6ApproveExecutionUseCase) memeV6ApproveExecutionUseCase$processApprovalCallback$12.L$0;
            C56391yDq.AEQbTJ(objFirst);
        }
        return C56443yFo.KWHzl(memeV6ApproveExecutionUseCase.copydefault((ApproveStatusGroup) objFirst));
    }

    public final Flow<ApproveStatusGroup> EZpvd(Bundle bundle, String str, String str2, String str3, String str4, String str5, TradeStatePool tradeStatePool, String str6, boolean z) {
        return FlowKt.callbackFlow(new MemeV6ApproveExecutionUseCase$collectApproveStatusResult$1(this, bundle, str, str2, str3, str4, str5, tradeStatePool, str6, z, null));
    }

    public final String copydefault(SwapState swapState) {
        return swapState == SwapState.APPROVED_AND_NEED_CANCEL_APPROVE ? "1" : "0";
    }

    public final Flow<TradeState> OLrzqt() {
        return this.EZpvd.EZpvd();
    }

    public final void AEQbTJ() {
        this.KWHzl.OLrzqt();
    }

    public final boolean copydefault(ApproveStatusGroup approveStatusGroup) {
        return approveStatusGroup.getApproveStatus() == ApproveStatus.APPROVED_NEED_CANCEL_APPROVE;
    }
}
