package com.okinc.business.trade.features.home.meme.usecase.transaction;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.CalldataPermit2;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.Permit2Data;
import com.okinc.business.dex.trade.core.domain.model.PriorityFee;
import com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.PreSetConfig;
import com.okinc.business.dex.trade.core.domain.model.common.SlippageConfig;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.error.SignCancelException;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C33070mpX;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9740bbL;
import o.kWO;
import o.pUU;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6OrderSubmitUseCase {
    public final kWO EZpvd;

    @yCM
    public MemeV6OrderSubmitUseCase(@NotNull kWO kwo) {
        Intrinsics.checkNotNullParameter(kwo, "");
        this.EZpvd = kwo;
    }

    public static final class OrderSubmitParams {
        public static final int $stable = 8;
        private final String calculatedGasPrice;
        private final String calculatedPriorityFee;
        private final boolean isOpenMev;
        private final String maxSlippage;
        private final MemeChainType memeChainType;
        private final NetworkFeeInfo networkFeeInfo;
        private final int priorityFeeType;
        private final String priorityFeeValue;
        private final V6QuoteResponseData quoteResponse;
        private final String routerModeType;
        private final String selectedDeFiPlatformId;
        private final DefiPlatformInfo selectedPlatform;
        private final Integer slippageMode;
        private final String slippageValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final V6QuoteResponseData component1() {
            return this.quoteResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component10() {
            return this.priorityFeeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeChainType component11() {
            return this.memeChainType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkFeeInfo component12() {
            return this.networkFeeInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.calculatedPriorityFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component14() {
            return this.calculatedGasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DefiPlatformInfo component2() {
            return this.selectedPlatform;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.selectedDeFiPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component4() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.routerModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.slippageValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component8() {
            return this.slippageMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component9() {
            return this.priorityFeeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrderSubmitParams copy(@NotNull V6QuoteResponseData v6QuoteResponseData, DefiPlatformInfo defiPlatformInfo, @NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, String str4, Integer num, int i, @NotNull String str5, @NotNull MemeChainType memeChainType, NetworkFeeInfo networkFeeInfo, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(v6QuoteResponseData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(memeChainType, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new OrderSubmitParams(v6QuoteResponseData, defiPlatformInfo, str, z, str2, str3, str4, num, i, str5, memeChainType, networkFeeInfo, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderSubmitParams)) {
                return false;
            }
            OrderSubmitParams orderSubmitParams = (OrderSubmitParams) obj;
            return Intrinsics.EZpvd(this.quoteResponse, orderSubmitParams.quoteResponse) && Intrinsics.EZpvd(this.selectedPlatform, orderSubmitParams.selectedPlatform) && Intrinsics.EZpvd((Object) this.selectedDeFiPlatformId, (Object) orderSubmitParams.selectedDeFiPlatformId) && this.isOpenMev == orderSubmitParams.isOpenMev && Intrinsics.EZpvd((Object) this.routerModeType, (Object) orderSubmitParams.routerModeType) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) orderSubmitParams.slippageValue) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) orderSubmitParams.maxSlippage) && Intrinsics.EZpvd(this.slippageMode, orderSubmitParams.slippageMode) && this.priorityFeeType == orderSubmitParams.priorityFeeType && Intrinsics.EZpvd((Object) this.priorityFeeValue, (Object) orderSubmitParams.priorityFeeValue) && this.memeChainType == orderSubmitParams.memeChainType && Intrinsics.EZpvd(this.networkFeeInfo, orderSubmitParams.networkFeeInfo) && Intrinsics.EZpvd((Object) this.calculatedPriorityFee, (Object) orderSubmitParams.calculatedPriorityFee) && Intrinsics.EZpvd((Object) this.calculatedGasPrice, (Object) orderSubmitParams.calculatedGasPrice);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCalculatedGasPrice() {
            return this.calculatedGasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCalculatedPriorityFee() {
            return this.calculatedPriorityFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxSlippage() {
            return this.maxSlippage;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeChainType getMemeChainType() {
            return this.memeChainType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkFeeInfo getNetworkFeeInfo() {
            return this.networkFeeInfo;
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
        public final V6QuoteResponseData getQuoteResponse() {
            return this.quoteResponse;
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
        public final DefiPlatformInfo getSelectedPlatform() {
            return this.selectedPlatform;
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
        public int hashCode() {
            int iHashCode = this.quoteResponse.hashCode();
            DefiPlatformInfo defiPlatformInfo = this.selectedPlatform;
            int iHashCode2 = defiPlatformInfo == null ? 0 : defiPlatformInfo.hashCode();
            int iHashCode3 = this.selectedDeFiPlatformId.hashCode();
            int iHashCode4 = Boolean.hashCode(this.isOpenMev);
            int iHashCode5 = this.routerModeType.hashCode();
            int iHashCode6 = this.slippageValue.hashCode();
            String str = this.maxSlippage;
            int iHashCode7 = str == null ? 0 : str.hashCode();
            Integer num = this.slippageMode;
            int iHashCode8 = num == null ? 0 : num.hashCode();
            int iHashCode9 = Integer.hashCode(this.priorityFeeType);
            int iHashCode10 = this.priorityFeeValue.hashCode();
            int iHashCode11 = this.memeChainType.hashCode();
            NetworkFeeInfo networkFeeInfo = this.networkFeeInfo;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (networkFeeInfo != null ? networkFeeInfo.hashCode() : 0)) * 31) + this.calculatedPriorityFee.hashCode()) * 31) + this.calculatedGasPrice.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isOpenMev() {
            return this.isOpenMev;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OrderSubmitParams(quoteResponse=" + this.quoteResponse + ", selectedPlatform=" + this.selectedPlatform + ", selectedDeFiPlatformId=" + this.selectedDeFiPlatformId + ", isOpenMev=" + this.isOpenMev + ", routerModeType=" + this.routerModeType + ", slippageValue=" + this.slippageValue + ", maxSlippage=" + this.maxSlippage + ", slippageMode=" + this.slippageMode + ", priorityFeeType=" + this.priorityFeeType + ", priorityFeeValue=" + this.priorityFeeValue + ", memeChainType=" + this.memeChainType + ", networkFeeInfo=" + this.networkFeeInfo + ", calculatedPriorityFee=" + this.calculatedPriorityFee + ", calculatedGasPrice=" + this.calculatedGasPrice + ")";
        }

        public OrderSubmitParams(@NotNull V6QuoteResponseData v6QuoteResponseData, DefiPlatformInfo defiPlatformInfo, @NotNull String str, boolean z, @NotNull String str2, @NotNull String str3, String str4, Integer num, int i, @NotNull String str5, @NotNull MemeChainType memeChainType, NetworkFeeInfo networkFeeInfo, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(v6QuoteResponseData, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(memeChainType, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.quoteResponse = v6QuoteResponseData;
            this.selectedPlatform = defiPlatformInfo;
            this.selectedDeFiPlatformId = str;
            this.isOpenMev = z;
            this.routerModeType = str2;
            this.slippageValue = str3;
            this.maxSlippage = str4;
            this.slippageMode = num;
            this.priorityFeeType = i;
            this.priorityFeeValue = str5;
            this.memeChainType = memeChainType;
            this.networkFeeInfo = networkFeeInfo;
            this.calculatedPriorityFee = str6;
            this.calculatedGasPrice = str7;
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6OrderSubmitUseCase.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static final class TaskDescription extends ActionBar {
            public final String AEQbTJ;
            public final boolean KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str2 = taskDescription.AEQbTJ;
                }
                if ((i & 4) != 0) {
                    z = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull String str, @NotNull String str2, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new TaskDescription(str, str2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.KWHzl;
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
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ) && this.KWHzl == taskDescription.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + Boolean.hashCode(this.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(message=" + this.OLrzqt + ", transactionHash=" + this.AEQbTJ + ", isBatchBroadcast=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull String str, @NotNull String str2, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = str;
                this.AEQbTJ = str2;
                this.KWHzl = z;
            }
        }

        public static final class Activity extends ActionBar {
            public final String KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                if ((i & 2) != 0) {
                    str2 = activity.KWHzl;
                }
                return activity.EZpvd(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull String str, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new Activity(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(code=" + this.OLrzqt + ", message=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull String str, @NotNull String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.OLrzqt = str;
                this.KWHzl = str2;
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kWO.submitV6Order-LiYkppA$default(o.kWO, boolean, com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData, com.okinc.business.trade.features.home.meme.domain.model.V6CalldataParams, java.lang.String, boolean, int, androidx.fragment.app.FragmentActivity, boolean, o.bbL$TaskDescription, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0036, B:29:0x008c, B:31:0x0093, B:34:0x00a2, B:36:0x00ae, B:38:0x00b4, B:42:0x00be, B:43:0x00c9, B:54:0x00ed, B:46:0x00ce, B:48:0x00d2, B:50:0x00dd, B:52:0x00e1, B:56:0x00f8, B:58:0x00fc, B:61:0x0108, B:62:0x010e, B:63:0x010f), top: B:78:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x0036, B:29:0x008c, B:31:0x0093, B:34:0x00a2, B:36:0x00ae, B:38:0x00b4, B:42:0x00be, B:43:0x00c9, B:54:0x00ed, B:46:0x00ce, B:48:0x00d2, B:50:0x00dd, B:52:0x00e1, B:56:0x00f8, B:58:0x00fc, B:61:0x0108, B:62:0x010e, B:63:0x010f), top: B:78:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(@NotNull OrderSubmitParams orderSubmitParams, String str, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<? extends ActionBar>> continuation) throws Throwable {
        MemeV6OrderSubmitUseCase$submitOrder$1 memeV6OrderSubmitUseCase$submitOrder$1;
        MemeV6OrderSubmitUseCase memeV6OrderSubmitUseCase;
        Object objOLrzqt;
        Throwable thM7380exceptionOrNullimpl;
        V6CalldataResponseData transactionData;
        OrderSubmitParams orderSubmitParams2 = orderSubmitParams;
        if (continuation instanceof MemeV6OrderSubmitUseCase$submitOrder$1) {
            memeV6OrderSubmitUseCase$submitOrder$1 = (MemeV6OrderSubmitUseCase$submitOrder$1) continuation;
            int i = memeV6OrderSubmitUseCase$submitOrder$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeV6OrderSubmitUseCase$submitOrder$1.label = i - Integer.MIN_VALUE;
            } else {
                memeV6OrderSubmitUseCase$submitOrder$1 = new MemeV6OrderSubmitUseCase$submitOrder$1(this, continuation);
            }
        }
        MemeV6OrderSubmitUseCase$submitOrder$1 memeV6OrderSubmitUseCase$submitOrder$12 = memeV6OrderSubmitUseCase$submitOrder$1;
        Object obj = memeV6OrderSubmitUseCase$submitOrder$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeV6OrderSubmitUseCase$submitOrder$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            orderSubmitParams2 = (OrderSubmitParams) memeV6OrderSubmitUseCase$submitOrder$12.L$1;
            memeV6OrderSubmitUseCase = (MemeV6OrderSubmitUseCase) memeV6OrderSubmitUseCase$submitOrder$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
                ApproveUnsignedData approveTxInfo = null;
                if (thM7380exceptionOrNullimpl != null) {
                    Result.Application application = Result.Companion;
                    if (Result.m7383isFailureimpl(objOLrzqt)) {
                        objOLrzqt = "";
                    }
                    String str2 = (String) objOLrzqt;
                    DefiPlatformInfo selectedDeFiPlatform = orderSubmitParams2.getQuoteResponse().getSelectedDeFiPlatform();
                    if (selectedDeFiPlatform != null && (transactionData = selectedDeFiPlatform.getTransactionData()) != null) {
                        approveTxInfo = transactionData.getApproveTxInfo();
                    }
                    return Result.m7377constructorimpl(new ActionBar.TaskDescription("0", str2, approveTxInfo != null));
                }
                if (!(thM7380exceptionOrNullimpl instanceof WalletJwtException) && ((!(thM7380exceptionOrNullimpl instanceof OKServerException) || !(((OKServerException) thM7380exceptionOrNullimpl).getOrigin() instanceof WalletJwtException)) && (!(thM7380exceptionOrNullimpl instanceof OKServerException) || ((OKServerException) thM7380exceptionOrNullimpl).getCode() != 60030))) {
                    if ((thM7380exceptionOrNullimpl instanceof OKServerException) && ((OKServerException) thM7380exceptionOrNullimpl).getCode() == -5014) {
                        throw new SignCancelException(null, 1, null);
                    }
                    Pair<String, String> pairAEQbTJ = memeV6OrderSubmitUseCase.AEQbTJ(thM7380exceptionOrNullimpl);
                    Result.Application application2 = Result.Companion;
                    return Result.m7377constructorimpl(new ActionBar.Activity(pairAEQbTJ.getFirst(), pairAEQbTJ.getSecond()));
                }
                Result.Application application3 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
            } catch (Throwable th) {
                th = th;
                if ((th instanceof WalletJwtException) || ((th instanceof OKServerException) && (th.getOrigin() instanceof WalletJwtException))) {
                    Result.Application application4 = Result.Companion;
                    return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                Pair<String, String> pairAEQbTJ2 = memeV6OrderSubmitUseCase.AEQbTJ(th);
                Result.Application application5 = Result.Companion;
                return Result.m7377constructorimpl(new ActionBar.Activity(pairAEQbTJ2.getFirst(), pairAEQbTJ2.getSecond()));
            }
        }
        C56391yDq.AEQbTJ(obj);
        DefiPlatformInfo selectedPlatform = orderSubmitParams.getSelectedPlatform();
        try {
            kWO kwo = this.EZpvd;
            boolean z2 = selectedPlatform != null && selectedPlatform.isPMM();
            V6QuoteResponseData quoteResponse = orderSubmitParams.getQuoteResponse();
            V6CalldataParams v6CalldataParamsEZpvd = EZpvd(str, orderSubmitParams2);
            String selectedDeFiPlatformId = orderSubmitParams.getSelectedDeFiPlatformId();
            boolean zIsOpenMev = orderSubmitParams.isOpenMev();
            memeV6OrderSubmitUseCase$submitOrder$12.L$0 = this;
            memeV6OrderSubmitUseCase$submitOrder$12.L$1 = orderSubmitParams2;
            memeV6OrderSubmitUseCase$submitOrder$12.label = 1;
            objOLrzqt = kwo.OLrzqt(z2, quoteResponse, v6CalldataParamsEZpvd, selectedDeFiPlatformId, zIsOpenMev, (32 & 32) != 0 ? 0 : 0, fragmentActivity, z, taskDescription, memeV6OrderSubmitUseCase$submitOrder$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            memeV6OrderSubmitUseCase = this;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objOLrzqt);
            ApproveUnsignedData approveTxInfo2 = null;
            if (thM7380exceptionOrNullimpl != null) {
            }
        } catch (Throwable th2) {
            th = th2;
            memeV6OrderSubmitUseCase = this;
            if (th instanceof WalletJwtException) {
                Pair<String, String> pairAEQbTJ22 = memeV6OrderSubmitUseCase.AEQbTJ(th);
                Result.Application application52 = Result.Companion;
                return Result.m7377constructorimpl(new ActionBar.Activity(pairAEQbTJ22.getFirst(), pairAEQbTJ22.getSecond()));
            }
            Result.Application application42 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final V6CalldataParams EZpvd(String str, OrderSubmitParams orderSubmitParams) {
        Permit2Data permit2Data;
        DefiPlatformInfo selectedPlatform = orderSubmitParams.getSelectedPlatform();
        CalldataPermit2 calldataPermit2 = new CalldataPermit2((selectedPlatform == null || (permit2Data = selectedPlatform.getPermit2Data()) == null) ? null : permit2Data.getUnsignedTx(), str);
        String maxSlippage = orderSubmitParams.getMaxSlippage();
        String slippageValue = orderSubmitParams.getSlippageValue();
        Integer slippageMode = orderSubmitParams.getSlippageMode();
        SlippageConfig slippageConfig = new SlippageConfig(maxSlippage, slippageValue, String.valueOf(slippageMode != null ? slippageMode.intValue() : SlippageMode.Dynamic.getType()));
        DefiPlatformInfo selectedPlatform2 = orderSubmitParams.getSelectedPlatform();
        return new V6CalldataParams(calldataPermit2, slippageConfig, selectedPlatform2 != null ? selectedPlatform2.getQuoteId() : null, new PreSetConfig(orderSubmitParams.getRouterModeType()));
    }

    public final Pair<String, String> AEQbTJ(Throwable th) {
        boolean z = th instanceof OKServerException;
        if (z) {
            OKServerException oKServerException = (OKServerException) th;
            if (oKServerException.getCode() == C33129mqd.AhwBna("1000005555")) {
                return C56390yDp.OLrzqt(String.valueOf(oKServerException.getCode()), C33070mpX.AYXKKw(C23274hvD.Fragment.AudioAttributesImplApi21Parcelizer));
            }
        }
        if (z) {
            int code = ((OKServerException) th).getCode();
            String message = th.getMessage();
            return C56390yDp.OLrzqt(String.valueOf(code), message != null ? message : "");
        }
        if (th instanceof SignCancelException) {
            return C56390yDp.OLrzqt("", "");
        }
        pUU.AEQbTJ("MemeV6OrderSubmitUseCase", "Unknown error: " + th.getMessage(), th);
        return C56390yDp.OLrzqt("", C33070mpX.AYXKKw(C23274hvD.Fragment.hrnhsO));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlaceOrderParams AEQbTJ(@NotNull OrderSubmitParams orderSubmitParams) {
        String str;
        String str2;
        String slippageValue;
        String str3;
        String refCode;
        ServiceFeeInfo serviceFeeInfo;
        ServiceFeeInfo serviceFeeInfo2;
        AutoSlippageInfo autoSlippageInfo;
        PriorityFee defaultMev;
        Intrinsics.checkNotNullParameter(orderSubmitParams, "");
        DefiPlatformInfo selectedPlatform = orderSubmitParams.getSelectedPlatform();
        Integer slippageMode = orderSubmitParams.getSlippageMode();
        boolean z = slippageMode != null && slippageMode.intValue() == SlippageMode.Dynamic.getType();
        String referralCommissionAddress = null;
        if (z) {
            String maxSlippage = orderSubmitParams.getMaxSlippage();
            str = maxSlippage == null ? "" : maxSlippage;
        } else {
            str = null;
        }
        String strGEmmrt = C33129mqd.gEmmrt(Integer.valueOf(orderSubmitParams.getPriorityFeeType()));
        String calculatedPriorityFee = orderSubmitParams.getCalculatedPriorityFee();
        String routerModeType = orderSubmitParams.getRouterModeType();
        String calculatedGasPrice = orderSubmitParams.getCalculatedGasPrice();
        boolean zIsOpenMev = orderSubmitParams.isOpenMev();
        String estimateGasFee = selectedPlatform != null ? selectedPlatform.getEstimateGasFee() : null;
        String str4 = estimateGasFee == null ? "" : estimateGasFee;
        if (orderSubmitParams.isOpenMev()) {
            NetworkFeeInfo networkFeeInfo = orderSubmitParams.getNetworkFeeInfo();
            String name = (networkFeeInfo == null || (defaultMev = networkFeeInfo.getDefaultMev()) == null) ? null : defaultMev.getName();
            if (name != null) {
                str2 = name;
            }
        } else {
            str2 = "";
        }
        String strGEmmrt2 = C33129mqd.gEmmrt(orderSubmitParams.getSlippageMode());
        if (z) {
            slippageValue = (selectedPlatform == null || (autoSlippageInfo = selectedPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getAutoSlippage();
            if (slippageValue == null) {
                str3 = "";
            }
            refCode = (selectedPlatform != null || (serviceFeeInfo2 = selectedPlatform.getServiceFeeInfo()) == null) ? null : serviceFeeInfo2.getRefCode();
            if (refCode == null) {
                refCode = "";
            }
            if (selectedPlatform != null && (serviceFeeInfo = selectedPlatform.getServiceFeeInfo()) != null) {
                referralCommissionAddress = serviceFeeInfo.getReferralCommissionAddress();
            }
            return new PlaceOrderParams(str, strGEmmrt, calculatedPriorityFee, routerModeType, calculatedGasPrice, Boolean.valueOf(zIsOpenMev), str4, str2, strGEmmrt2, str3, (Preset) null, new ReferralParam(refCode, referralCommissionAddress != null ? referralCommissionAddress : ""), 1024, (DefaultConstructorMarker) null);
        }
        slippageValue = orderSubmitParams.getSlippageValue();
        str3 = slippageValue;
        if (selectedPlatform != null) {
        }
        if (refCode == null) {
        }
        if (selectedPlatform != null) {
            referralCommissionAddress = serviceFeeInfo.getReferralCommissionAddress();
        }
        return new PlaceOrderParams(str, strGEmmrt, calculatedPriorityFee, routerModeType, calculatedGasPrice, Boolean.valueOf(zIsOpenMev), str4, str2, strGEmmrt2, str3, (Preset) null, new ReferralParam(refCode, referralCommissionAddress != null ? referralCommissionAddress : ""), 1024, (DefaultConstructorMarker) null);
    }
}
