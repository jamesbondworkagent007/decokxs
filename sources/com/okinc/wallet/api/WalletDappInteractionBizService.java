package com.okinc.wallet.api;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.wallet.api.bean.WalletBtcAddressBean;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.InterfaceC43217rlC;
import o.xWF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletDappInteractionBizService extends InterfaceC43217rlC {
    public static final ActionBar Companion = ActionBar.KWHzl;

    AbstractC58185ywX<ResponseData<xWF>> EZpvd(@NotNull Context context, int i, @NotNull DappInteractionArgs dappInteractionArgs, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<String>>> function1);

    AbstractC58185ywX<SubmitResult> EZpvd(@NotNull DappInteractionArgs dappInteractionArgs);

    void EZpvd(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Integer num, Long l, String str5);

    AbstractC58185ywX<List<WalletBtcAddressBean>> copydefault(@NotNull String str, long j, Integer num, Integer num2);

    boolean copydefault(@NotNull String str, @NotNull String str2);

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar KWHzl = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class FeeInfo {
        public static final int PAYMASTER_STATUS_INVALID = -1;
        public static final int PAYMASTER_STATUS_NEED_APPROVAL = 1;
        public static final int PAYMASTER_STATUS_NORMAL = 0;
        private Boolean checkFee;
        private String depositTip;
        private String estimatedFeeAmount;
        private Integer feeChangeType;
        private String feeCurrencyValue;
        private FeeICoinMeta feeICoinMeta;
        private String feeNumberValue;
        private String feeSubTypeText;
        private String feeSymbol;
        private String feeTip;
        private Integer feeType;
        private String feeValue;
        private String gas;
        private String gasPrice;
        private Boolean isFreeGas;
        private MaxFeeInfo maxFeeInfo;
        private String maxFeePerGas;
        private String maxPriorityFeePerGas;
        private Integer paymasterStatus;
        private String paymasterTip;
        private String solPreCheckMsg;
        private String transferReminder;
        public static final Activity Companion = new Activity(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getCheckFee() {
            return this.checkFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDepositTip() {
            return this.depositTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEstimatedFeeAmount() {
            return this.estimatedFeeAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFeeChangeType() {
            return this.feeChangeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeCurrencyValue() {
            return this.feeCurrencyValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FeeICoinMeta getFeeICoinMeta() {
            return this.feeICoinMeta;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeNumberValue() {
            return this.feeNumberValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeSubTypeText() {
            return this.feeSubTypeText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeSymbol() {
            return this.feeSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeTip() {
            return this.feeTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getFeeType() {
            return this.feeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeValue() {
            return this.feeValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGas() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGasPrice() {
            return this.gasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MaxFeeInfo getMaxFeeInfo() {
            return this.maxFeeInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxFeePerGas() {
            return this.maxFeePerGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMaxPriorityFeePerGas() {
            return this.maxPriorityFeePerGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getPaymasterStatus() {
            return this.paymasterStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPaymasterTip() {
            return this.paymasterTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSolPreCheckMsg() {
            return this.solPreCheckMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTransferReminder() {
            return this.transferReminder;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isFreeGas() {
            return this.isFreeGas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCheckFee(Boolean bool) {
            this.checkFee = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDepositTip(String str) {
            this.depositTip = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEstimatedFeeAmount(String str) {
            this.estimatedFeeAmount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeChangeType(Integer num) {
            this.feeChangeType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeCurrencyValue(String str) {
            this.feeCurrencyValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeICoinMeta(FeeICoinMeta feeICoinMeta) {
            this.feeICoinMeta = feeICoinMeta;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeNumberValue(String str) {
            this.feeNumberValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeSubTypeText(String str) {
            this.feeSubTypeText = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeSymbol(String str) {
            this.feeSymbol = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeTip(String str) {
            this.feeTip = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeType(Integer num) {
            this.feeType = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFeeValue(String str) {
            this.feeValue = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setFreeGas(Boolean bool) {
            this.isFreeGas = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGas(String str) {
            this.gas = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGasPrice(String str) {
            this.gasPrice = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaxFeeInfo(MaxFeeInfo maxFeeInfo) {
            this.maxFeeInfo = maxFeeInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaxFeePerGas(String str) {
            this.maxFeePerGas = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMaxPriorityFeePerGas(String str) {
            this.maxPriorityFeePerGas = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPaymasterStatus(Integer num) {
            this.paymasterStatus = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPaymasterTip(String str) {
            this.paymasterTip = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSolPreCheckMsg(String str) {
            this.solPreCheckMsg = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTransferReminder(String str) {
            this.transferReminder = str;
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class Activity {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletDappInteractionBizService.FeeInfo.Activity.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Activity() {
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class FeeICoinMeta {
            public static final int $stable = 8;
            private String address;
            private String imageUrl;
            private String symbol;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FeeICoinMeta() {
                this(null, null, null, 7, null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAddress() {
                return this.address;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSymbol() {
                return this.symbol;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setAddress(String str) {
                this.address = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setImageUrl(String str) {
                this.imageUrl = str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final void setSymbol(String str) {
                this.symbol = str;
            }

            public FeeICoinMeta(String str, String str2, String str3) {
                this.symbol = str;
                this.imageUrl = str2;
                this.address = str3;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:148) call: com.okinc.wallet.api.WalletDappInteractionBizService.FeeInfo.FeeICoinMeta.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ FeeICoinMeta(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        /* JADX INFO: loaded from: classes24.dex */
        public static final class MaxFeeInfo {
            public static final int $stable = 0;
            private final String feeCurrencyValue;
            private final String feeText;
            private final String feeValue;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFeeCurrencyValue() {
                return this.feeCurrencyValue;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFeeText() {
                return this.feeText;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFeeValue() {
                return this.feeValue;
            }

            public MaxFeeInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str3, "");
                this.feeValue = str;
                this.feeCurrencyValue = str2;
                this.feeText = str3;
            }
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SubmitResult {
        public static final int $stable = 8;
        private Integer code;
        private String errMsg;
        private boolean isBtcMint;
        private boolean isEvmBatch;
        private String signTx;
        private String tronData;
        private String txHash;
        private String txId;
        private String uopHash;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubmitResult() {
            this(null, null, null, null, null, null, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component1() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.errMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.txHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.uopHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.signTx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.tronData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component8() {
            return this.isBtcMint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component9() {
            return this.isEvmBatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubmitResult copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
            return new SubmitResult(num, str, str2, str3, str4, str5, str6, z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmitResult)) {
                return false;
            }
            SubmitResult submitResult = (SubmitResult) obj;
            return Intrinsics.EZpvd(this.code, submitResult.code) && Intrinsics.EZpvd((Object) this.errMsg, (Object) submitResult.errMsg) && Intrinsics.EZpvd((Object) this.txId, (Object) submitResult.txId) && Intrinsics.EZpvd((Object) this.txHash, (Object) submitResult.txHash) && Intrinsics.EZpvd((Object) this.uopHash, (Object) submitResult.uopHash) && Intrinsics.EZpvd((Object) this.signTx, (Object) submitResult.signTx) && Intrinsics.EZpvd((Object) this.tronData, (Object) submitResult.tronData) && this.isBtcMint == submitResult.isBtcMint && this.isEvmBatch == submitResult.isEvmBatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getCode() {
            return this.code;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getErrMsg() {
            return this.errMsg;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignTx() {
            return this.signTx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTronData() {
            return this.tronData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxHash() {
            return this.txHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTxId() {
            return this.txId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUopHash() {
            return this.uopHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Integer num = this.code;
            int iHashCode = num == null ? 0 : num.hashCode();
            String str = this.errMsg;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.txId;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.txHash;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.uopHash;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.signTx;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.tronData;
            return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBtcMint)) * 31) + Boolean.hashCode(this.isEvmBatch);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isBtcMint() {
            return this.isBtcMint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isEvmBatch() {
            return this.isEvmBatch;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBtcMint(boolean z) {
            this.isBtcMint = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCode(Integer num) {
            this.code = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setErrMsg(String str) {
            this.errMsg = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEvmBatch(boolean z) {
            this.isEvmBatch = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSignTx(String str) {
            this.signTx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTronData(String str) {
            this.tronData = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxHash(String str) {
            this.txHash = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTxId(String str) {
            this.txId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUopHash(String str) {
            this.uopHash = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubmitResult(code=" + this.code + ", errMsg=" + this.errMsg + ", txId=" + this.txId + ", txHash=" + this.txHash + ", uopHash=" + this.uopHash + ", signTx=" + this.signTx + ", tronData=" + this.tronData + ", isBtcMint=" + this.isBtcMint + ", isEvmBatch=" + this.isEvmBatch + ")";
        }

        public SubmitResult(Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
            this.code = num;
            this.errMsg = str;
            this.txId = str2;
            this.txHash = str3;
            this.uopHash = str4;
            this.signTx = str5;
            this.tronData = str6;
            this.isBtcMint = z;
            this.isEvmBatch = z2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 boolean) : false)
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:163) call: com.okinc.wallet.api.WalletDappInteractionBizService.SubmitResult.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
        public /* synthetic */ SubmitResult(Integer num, String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) != 0 ? false : z, (i & 256) == 0 ? z2 : false);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class AmountInfo {
        public static final int $stable = 8;
        private String amount;
        private String currencyAmount;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AmountInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrencyAmount() {
            return this.currencyAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAmount(String str) {
            this.amount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyAmount(String str) {
            this.currencyAmount = str;
        }

        public AmountInfo(String str, String str2) {
            this.amount = str;
            this.currencyAmount = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:176) call: com.okinc.wallet.api.WalletDappInteractionBizService.AmountInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ AmountInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
