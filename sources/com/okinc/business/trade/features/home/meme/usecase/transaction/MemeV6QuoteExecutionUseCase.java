package com.okinc.business.trade.features.home.meme.usecase.transaction;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean;
import com.okinc.business.dexlogic.bean.TransactionType;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C19699gMa;
import o.C23212htv;
import o.C28163kRf;
import o.C28343kXx;
import o.C31172lox;
import o.C31212lpk;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.gYS;
import o.kWR;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6QuoteExecutionUseCase {
    public final C28163kRf AEQbTJ;
    public final kWR EZpvd;
    public final C23212htv KWHzl;
    public final C19699gMa OLrzqt;

    @yCM
    public MemeV6QuoteExecutionUseCase(@NotNull kWR kwr, @NotNull C28163kRf c28163kRf, @NotNull C23212htv c23212htv, @NotNull C19699gMa c19699gMa) {
        Intrinsics.checkNotNullParameter(kwr, "");
        Intrinsics.checkNotNullParameter(c28163kRf, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c19699gMa, "");
        this.EZpvd = kwr;
        this.AEQbTJ = c28163kRf;
        this.KWHzl = c23212htv;
        this.OLrzqt = c19699gMa;
    }

    public static final class QuoteParams {
        public static final int $stable = TokenBase.$stable;
        private final String chainId;
        private final Pair<String, String> fromToTokenAddress;
        private final boolean isBatchBroadCast;
        private final boolean isPreCheckSupported;
        private final String maxSlippage;
        private final int memeUIStyle;
        private final int priorityFeeType;
        private final String priorityFeeValue;
        private final String realAmount;
        private final String routerModeType;
        private final String selectedDeFiPlatformId;
        private final Function1<V6BaseQuoteResponse, String> setAndGetDeFiPlatformId;
        private final Integer slippageMode;
        private final String slippageValue;
        private final String sourceType;
        private final boolean supportCustomGas;
        private final TokenBase tokenInfo;
        private final TransactionType transactionType;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 com.okinc.business.dex.api.bean.TokenBase)
  (r4v0 com.okinc.business.dexlogic.bean.TransactionType)
  (r5v0 int)
  (r6v0 java.lang.String)
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.Integer)
  (r12v0 int)
  (r13v0 java.lang.String)
  (r14v0 kotlin.Pair)
  (r15v0 boolean)
  (r16v0 boolean)
  (r17v0 boolean)
  (r18v0 kotlin.jvm.functions.Function1)
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.TokenBase, com.okinc.business.dexlogic.bean.TransactionType, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>, boolean, boolean, boolean, kotlin.jvm.functions.Function1<? super com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, java.lang.String>):void (m)] call: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase.QuoteParams.<init>(java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.TokenBase, com.okinc.business.dexlogic.bean.TransactionType, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, int, java.lang.String, kotlin.Pair, boolean, boolean, boolean, kotlin.jvm.functions.Function1):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ QuoteParams(String str, String str2, TokenBase tokenBase, TransactionType transactionType, int i, String str3, String str4, String str5, String str6, String str7, Integer num, int i2, String str8, Pair pair, boolean z, boolean z2, boolean z3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, tokenBase, transactionType, i, str3, str4, str5, str6, str7, num, i2, str8, pair, z, z2, z3, function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component11() {
            return this.slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component12() {
            return this.priorityFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.priorityFeeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<String, String> component14() {
            return this.fromToTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component15() {
            return this.isPreCheckSupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component16() {
            return this.supportCustomGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component17() {
            return this.isBatchBroadCast;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<V6BaseQuoteResponse, String> component18() {
            return this.setAndGetDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenBase component3() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType component4() {
            return this.transactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: component5-zYUCHBs, reason: not valid java name */
        public final int m6632component5zYUCHBs() {
            return this.memeUIStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.realAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.selectedDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.routerModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.slippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: copy-gyHQ474, reason: not valid java name */
        public final QuoteParams m6633copygyHQ474(@NotNull String str, @NotNull String str2, @NotNull TokenBase tokenBase, @NotNull TransactionType transactionType, int i, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, Integer num, int i2, @NotNull String str8, @NotNull Pair<String, String> pair, boolean z, boolean z2, boolean z3, @NotNull Function1<? super V6BaseQuoteResponse, String> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return new QuoteParams(str, str2, tokenBase, transactionType, i, str3, str4, str5, str6, str7, num, i2, str8, pair, z, z2, z3, function1, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuoteParams)) {
                return false;
            }
            QuoteParams quoteParams = (QuoteParams) obj;
            return Intrinsics.EZpvd((Object) this.chainId, (Object) quoteParams.chainId) && Intrinsics.EZpvd((Object) this.sourceType, (Object) quoteParams.sourceType) && Intrinsics.EZpvd(this.tokenInfo, quoteParams.tokenInfo) && this.transactionType == quoteParams.transactionType && C31172lox.KWHzl(this.memeUIStyle, quoteParams.memeUIStyle) && Intrinsics.EZpvd((Object) this.realAmount, (Object) quoteParams.realAmount) && Intrinsics.EZpvd((Object) this.selectedDeFiPlatformId, (Object) quoteParams.selectedDeFiPlatformId) && Intrinsics.EZpvd((Object) this.routerModeType, (Object) quoteParams.routerModeType) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) quoteParams.slippageValue) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) quoteParams.maxSlippage) && Intrinsics.EZpvd(this.slippageMode, quoteParams.slippageMode) && this.priorityFeeType == quoteParams.priorityFeeType && Intrinsics.EZpvd((Object) this.priorityFeeValue, (Object) quoteParams.priorityFeeValue) && Intrinsics.EZpvd(this.fromToTokenAddress, quoteParams.fromToTokenAddress) && this.isPreCheckSupported == quoteParams.isPreCheckSupported && this.supportCustomGas == quoteParams.supportCustomGas && this.isBatchBroadCast == quoteParams.isBatchBroadCast && Intrinsics.EZpvd(this.setAndGetDeFiPlatformId, quoteParams.setAndGetDeFiPlatformId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pair<String, String> getFromToTokenAddress() {
            return this.fromToTokenAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxSlippage() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: getMemeUIStyle-zYUCHBs, reason: not valid java name */
        public final int m6634getMemeUIStylezYUCHBs() {
            return this.memeUIStyle;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getPriorityFeeType() {
            return this.priorityFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityFeeValue() {
            return this.priorityFeeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRealAmount() {
            return this.realAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRouterModeType() {
            return this.routerModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSelectedDeFiPlatformId() {
            return this.selectedDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<V6BaseQuoteResponse, String> getSetAndGetDeFiPlatformId() {
            return this.setAndGetDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getSlippageMode() {
            return this.slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSlippageValue() {
            return this.slippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSourceType() {
            return this.sourceType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getSupportCustomGas() {
            return this.supportCustomGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TokenBase getTokenInfo() {
            return this.tokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionType getTransactionType() {
            return this.transactionType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.chainId.hashCode();
            int iHashCode2 = this.sourceType.hashCode();
            int iHashCode3 = this.tokenInfo.hashCode();
            int iHashCode4 = this.transactionType.hashCode();
            int iAEQbTJ = C31172lox.AEQbTJ(this.memeUIStyle);
            int iHashCode5 = this.realAmount.hashCode();
            int iHashCode6 = this.selectedDeFiPlatformId.hashCode();
            int iHashCode7 = this.routerModeType.hashCode();
            int iHashCode8 = this.slippageValue.hashCode();
            String str = this.maxSlippage;
            int iHashCode9 = str == null ? 0 : str.hashCode();
            Integer num = this.slippageMode;
            return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iAEQbTJ) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.priorityFeeType)) * 31) + this.priorityFeeValue.hashCode()) * 31) + this.fromToTokenAddress.hashCode()) * 31) + Boolean.hashCode(this.isPreCheckSupported)) * 31) + Boolean.hashCode(this.supportCustomGas)) * 31) + Boolean.hashCode(this.isBatchBroadCast)) * 31) + this.setAndGetDeFiPlatformId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isBatchBroadCast() {
            return this.isBatchBroadCast;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPreCheckSupported() {
            return this.isPreCheckSupported;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "QuoteParams(chainId=" + this.chainId + ", sourceType=" + this.sourceType + ", tokenInfo=" + this.tokenInfo + ", transactionType=" + this.transactionType + ", memeUIStyle=" + C31172lox.OLrzqt(this.memeUIStyle) + ", realAmount=" + this.realAmount + ", selectedDeFiPlatformId=" + this.selectedDeFiPlatformId + ", routerModeType=" + this.routerModeType + ", slippageValue=" + this.slippageValue + ", maxSlippage=" + this.maxSlippage + ", slippageMode=" + this.slippageMode + ", priorityFeeType=" + this.priorityFeeType + ", priorityFeeValue=" + this.priorityFeeValue + ", fromToTokenAddress=" + this.fromToTokenAddress + ", isPreCheckSupported=" + this.isPreCheckSupported + ", supportCustomGas=" + this.supportCustomGas + ", isBatchBroadCast=" + this.isBatchBroadCast + ", setAndGetDeFiPlatformId=" + this.setAndGetDeFiPlatformId + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse, java.lang.String> */
        /* JADX WARN: Multi-variable type inference failed */
        private QuoteParams(String str, String str2, TokenBase tokenBase, TransactionType transactionType, int i, String str3, String str4, String str5, String str6, String str7, Integer num, int i2, String str8, Pair<String, String> pair, boolean z, boolean z2, boolean z3, Function1<? super V6BaseQuoteResponse, String> function1) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(tokenBase, "");
            Intrinsics.checkNotNullParameter(transactionType, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.chainId = str;
            this.sourceType = str2;
            this.tokenInfo = tokenBase;
            this.transactionType = transactionType;
            this.memeUIStyle = i;
            this.realAmount = str3;
            this.selectedDeFiPlatformId = str4;
            this.routerModeType = str5;
            this.slippageValue = str6;
            this.maxSlippage = str7;
            this.slippageMode = num;
            this.priorityFeeType = i2;
            this.priorityFeeValue = str8;
            this.fromToTokenAddress = pair;
            this.isPreCheckSupported = z;
            this.supportCustomGas = z2;
            this.isBatchBroadCast = z3;
            this.setAndGetDeFiPlatformId = function1;
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static final class ActionBar extends Application {
            public final V6QuoteResponseData EZpvd;
            public final gYS KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, V6QuoteResponseData v6QuoteResponseData, gYS gys, int i, Object obj) {
                if ((i & 1) != 0) {
                    v6QuoteResponseData = actionBar.EZpvd;
                }
                if ((i & 2) != 0) {
                    gys = actionBar.KWHzl;
                }
                return actionBar.copydefault(v6QuoteResponseData, gys);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final V6QuoteResponseData AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final gYS OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar copydefault(@NotNull V6QuoteResponseData v6QuoteResponseData, @NotNull gYS gys) {
                Intrinsics.checkNotNullParameter(v6QuoteResponseData, "");
                Intrinsics.checkNotNullParameter(gys, "");
                return new ActionBar(v6QuoteResponseData, gys);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd(this.EZpvd, actionBar.EZpvd) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(quoteResponse=" + this.EZpvd + ", quoteRequest=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull V6QuoteResponseData v6QuoteResponseData, @NotNull gYS gys) {
                super(null);
                Intrinsics.checkNotNullParameter(v6QuoteResponseData, "");
                Intrinsics.checkNotNullParameter(gys, "");
                this.EZpvd = v6QuoteResponseData;
                this.KWHzl = gys;
            }
        }

        public static final class TaskDescription extends Application {
            public final MemeModeQuoteErrorBean EZpvd;
            public final QuoteSwapState OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, MemeModeQuoteErrorBean memeModeQuoteErrorBean, QuoteSwapState quoteSwapState, int i, Object obj) {
                if ((i & 1) != 0) {
                    memeModeQuoteErrorBean = taskDescription.EZpvd;
                }
                if ((i & 2) != 0) {
                    quoteSwapState = taskDescription.OLrzqt;
                }
                return taskDescription.EZpvd(memeModeQuoteErrorBean, quoteSwapState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MemeModeQuoteErrorBean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull MemeModeQuoteErrorBean memeModeQuoteErrorBean, @NotNull QuoteSwapState quoteSwapState) {
                Intrinsics.checkNotNullParameter(memeModeQuoteErrorBean, "");
                Intrinsics.checkNotNullParameter(quoteSwapState, "");
                return new TaskDescription(memeModeQuoteErrorBean, quoteSwapState);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final QuoteSwapState copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && this.OLrzqt == taskDescription.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.EZpvd + ", swapState=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull MemeModeQuoteErrorBean memeModeQuoteErrorBean, @NotNull QuoteSwapState quoteSwapState) {
                super(null);
                Intrinsics.checkNotNullParameter(memeModeQuoteErrorBean, "");
                Intrinsics.checkNotNullParameter(quoteSwapState, "");
                this.EZpvd = memeModeQuoteErrorBean;
                this.OLrzqt = quoteSwapState;
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase$Application$Application, reason: collision with other inner class name */
        public static final class C0379Application extends Application {
            public static final C0379Application OLrzqt = new C0379Application();

            private C0379Application() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class QuoteSwapState {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ QuoteSwapState[] $VALUES;
        public static final QuoteSwapState FETCHING_SUCCESS = new QuoteSwapState("FETCHING_SUCCESS", 0);
        public static final QuoteSwapState FETCHING_ERROR = new QuoteSwapState("FETCHING_ERROR", 1);
        public static final QuoteSwapState BLACK_ADDRESS = new QuoteSwapState("BLACK_ADDRESS", 2);
        public static final QuoteSwapState NEW_ADDRESS = new QuoteSwapState("NEW_ADDRESS", 3);
        public static final QuoteSwapState STAND_BY_DISH = new QuoteSwapState("STAND_BY_DISH", 4);
        public static final QuoteSwapState STAND_BY_DISH_WARNING = new QuoteSwapState("STAND_BY_DISH_WARNING", 5);
        public static final QuoteSwapState SWAP_UNSUPPORTED_FOR_DAPP = new QuoteSwapState("SWAP_UNSUPPORTED_FOR_DAPP", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ QuoteSwapState[] $values() {
            return new QuoteSwapState[]{FETCHING_SUCCESS, FETCHING_ERROR, BLACK_ADDRESS, NEW_ADDRESS, STAND_BY_DISH, STAND_BY_DISH_WARNING, SWAP_UNSUPPORTED_FOR_DAPP};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<QuoteSwapState> getEntries() {
            return $ENTRIES;
        }

        private QuoteSwapState(String str, int i) {
        }

        static {
            QuoteSwapState[] quoteSwapStateArr$values = $values();
            $VALUES = quoteSwapStateArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(quoteSwapStateArr$values);
        }

        public static QuoteSwapState valueOf(String str) {
            return (QuoteSwapState) Enum.valueOf(QuoteSwapState.class, str);
        }

        public static QuoteSwapState[] values() {
            return (QuoteSwapState[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ Flow executeQuote$default(MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase, QuoteParams quoteParams, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "default_trade";
        }
        return memeV6QuoteExecutionUseCase.copydefault(quoteParams, str);
    }

    public final Flow<Application> copydefault(@NotNull QuoteParams quoteParams, @NotNull String str) {
        Intrinsics.checkNotNullParameter(quoteParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flow(new MemeV6QuoteExecutionUseCase$executeQuote$1(quoteParams, this, null));
    }

    public final Application OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse, QuoteParams quoteParams, gYS gys) {
        V6QuoteResponseData v6QuoteResponseDataKWHzl;
        boolean z = v6BaseQuoteResponse != null && v6BaseQuoteResponse.isHoneypotErrorCode();
        String strInvoke = quoteParams.getSetAndGetDeFiPlatformId().invoke(v6BaseQuoteResponse);
        boolean z2 = v6BaseQuoteResponse instanceof V6QuoteAndCalldataResponseData;
        if (z2 || (v6BaseQuoteResponse instanceof V6QuoteResponseData)) {
            v6BaseQuoteResponse.setLocalSelectedDeFiPlatformId(strInvoke);
        }
        if (z2) {
            v6QuoteResponseDataKWHzl = C28343kXx.KWHzl((V6QuoteAndCalldataResponseData) v6BaseQuoteResponse);
        } else {
            v6QuoteResponseDataKWHzl = v6BaseQuoteResponse instanceof V6QuoteResponseData ? (V6QuoteResponseData) v6BaseQuoteResponse : null;
        }
        if (v6QuoteResponseDataKWHzl == null) {
            return new Application.TaskDescription(new MemeModeQuoteErrorBean(MultiTransferSignData.DEFAULT_INTERVAL, "Invalid quote response", true), QuoteSwapState.FETCHING_ERROR);
        }
        if (z) {
            return new Application.TaskDescription(MemeModeQuoteErrorBean.Companion.copydefault(), QuoteSwapState.STAND_BY_DISH_WARNING);
        }
        return new Application.ActionBar(v6QuoteResponseDataKWHzl, gys);
    }

    public static /* synthetic */ Application.TaskDescription handleQuoteError$default(MemeV6QuoteExecutionUseCase memeV6QuoteExecutionUseCase, Integer num, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return memeV6QuoteExecutionUseCase.KWHzl(num, str);
    }

    public final Application.TaskDescription KWHzl(Integer num, String str) {
        QuoteSwapState quoteSwapState;
        if (num != null && C31212lpk.copydefault.EZpvd(num.intValue())) {
            quoteSwapState = QuoteSwapState.BLACK_ADDRESS;
        } else if (num != null && C31212lpk.copydefault.copydefault(num.intValue())) {
            quoteSwapState = QuoteSwapState.NEW_ADDRESS;
        } else if (num != null && C31212lpk.copydefault.OLrzqt(num.intValue())) {
            quoteSwapState = QuoteSwapState.STAND_BY_DISH;
        } else if (num != null && C31212lpk.copydefault.KWHzl(num.intValue())) {
            quoteSwapState = QuoteSwapState.SWAP_UNSUPPORTED_FOR_DAPP;
        } else {
            quoteSwapState = QuoteSwapState.FETCHING_ERROR;
        }
        return new Application.TaskDescription(new MemeModeQuoteErrorBean(C33129mqd.gEmmrt(num), str, true), quoteSwapState);
    }
}
