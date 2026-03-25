package com.okinc.business.dexlogic.bean;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class QuoteErrorBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String ORBITER_QUOTE_NO_QUOTE_FETCHED = "10040";
    public static final String QUOTE_ERROR_ERC20_AND_ANY_FACET_TOKEN = "10044";
    public static final String QUOTE_ERROR_ERC20_AND_FACET_ETH = "10045";
    public static final String QUOTE_ERROR_ETH_AND_NON_FACET_ETH = "10043";
    public static final String QUOTE_ERROR_MAX_AMOUNT_LIMIT = "11006";
    public static final String QUOTE_ERROR_MIN_AMOUNT_LIMIT = "11007";
    public static final String QUOTE_ERROR_THORSWAP_FROM_BTC_ADDRESS = "10046";
    public static final String QUOTE_ERROR_THORSWAP_TO_BTC_ADDRESS = "10047";
    public static final String QUOTE_ERROR_TWO_NON_FACET_ETH = "10041";
    public static final String QUOTE_ERROR_VALUE_OUT_OF_SCOPE = "10032";
    public static final String QUOTE_NO_QUOTE_FETCHED = "0";
    private final String amount;
    private final String code;
    private final String crossAccuracyLimit;
    private final String crossMaxAmount;
    private final String crossMiniAmount;
    private final String errorMsg;
    private final boolean isError;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteErrorBean() {
        this((String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.crossMiniAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.crossMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.crossAccuracyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteErrorBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new QuoteErrorBean(str, str2, str3, z, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteErrorBean)) {
            return false;
        }
        QuoteErrorBean quoteErrorBean = (QuoteErrorBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) quoteErrorBean.code) && Intrinsics.EZpvd((Object) this.msg, (Object) quoteErrorBean.msg) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) quoteErrorBean.errorMsg) && this.isError == quoteErrorBean.isError && Intrinsics.EZpvd((Object) this.amount, (Object) quoteErrorBean.amount) && Intrinsics.EZpvd((Object) this.crossMiniAmount, (Object) quoteErrorBean.crossMiniAmount) && Intrinsics.EZpvd((Object) this.crossMaxAmount, (Object) quoteErrorBean.crossMaxAmount) && Intrinsics.EZpvd((Object) this.crossAccuracyLimit, (Object) quoteErrorBean.crossAccuracyLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossAccuracyLimit() {
        return this.crossAccuracyLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossMaxAmount() {
        return this.crossMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCrossMiniAmount() {
        return this.crossMiniAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.code.hashCode() * 31) + this.msg.hashCode()) * 31) + this.errorMsg.hashCode()) * 31) + Boolean.hashCode(this.isError)) * 31) + this.amount.hashCode()) * 31) + this.crossMiniAmount.hashCode()) * 31) + this.crossMaxAmount.hashCode()) * 31) + this.crossAccuracyLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isError() {
        return this.isError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteErrorBean(code=" + this.code + ", msg=" + this.msg + ", errorMsg=" + this.errorMsg + ", isError=" + this.isError + ", amount=" + this.amount + ", crossMiniAmount=" + this.crossMiniAmount + ", crossMaxAmount=" + this.crossMaxAmount + ", crossAccuracyLimit=" + this.crossAccuracyLimit + ")";
    }

    public /* synthetic */ QuoteErrorBean(int i, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        this.code = (i & 1) == 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str;
        if ((i & 2) == 0) {
            this.msg = "";
        } else {
            this.msg = str2;
        }
        if ((i & 4) == 0) {
            this.errorMsg = "";
        } else {
            this.errorMsg = str3;
        }
        if ((i & 8) == 0) {
            this.isError = false;
        } else {
            this.isError = z;
        }
        if ((i & 16) == 0) {
            this.amount = "";
        } else {
            this.amount = str4;
        }
        if ((i & 32) == 0) {
            this.crossMiniAmount = "";
        } else {
            this.crossMiniAmount = str5;
        }
        if ((i & 64) == 0) {
            this.crossMaxAmount = "";
        } else {
            this.crossMaxAmount = str6;
        }
        if ((i & 128) == 0) {
            this.crossAccuracyLimit = "";
        } else {
            this.crossAccuracyLimit = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuoteErrorBean quoteErrorBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) quoteErrorBean.code, (Object) MultiTransferSignData.DEFAULT_INTERVAL)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, quoteErrorBean.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quoteErrorBean.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quoteErrorBean.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quoteErrorBean.errorMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quoteErrorBean.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || quoteErrorBean.isError) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, quoteErrorBean.isError);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quoteErrorBean.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, quoteErrorBean.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quoteErrorBean.crossMiniAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quoteErrorBean.crossMiniAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) quoteErrorBean.crossMaxAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, quoteErrorBean.crossMaxAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) quoteErrorBean.crossAccuracyLimit, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, quoteErrorBean.crossAccuracyLimit);
    }

    public QuoteErrorBean(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.code = str;
        this.msg = str2;
        this.errorMsg = str3;
        this.isError = z;
        this.amount = str4;
        this.crossMiniAmount = str5;
        this.crossMaxAmount = str6;
        this.crossAccuracyLimit = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.DEFAULT_INTERVAL java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1182) call: com.okinc.business.dexlogic.bean.QuoteErrorBean.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QuoteErrorBean(String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MultiTransferSignData.DEFAULT_INTERVAL : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuoteErrorBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuoteErrorBean> serializer() {
            return QuoteErrorBean$$serializer.INSTANCE;
        }
    }

    public final boolean isQuoteErrorMaxOrMinLimit() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_MAX_AMOUNT_LIMIT) || C23313hvq.copydefault(this.code, QUOTE_ERROR_MIN_AMOUNT_LIMIT);
    }

    public final boolean isQuoteErrorValueOutOfScope() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_VALUE_OUT_OF_SCOPE);
    }

    public final boolean isOrbiterQuoteNoQuoteFetched() {
        return C23313hvq.copydefault(this.code, ORBITER_QUOTE_NO_QUOTE_FETCHED);
    }

    public final boolean isQuoteNoQuoteFetched() {
        return C23313hvq.copydefault(this.code, "0");
    }

    public final boolean isThorswapBtcAddressError() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_THORSWAP_FROM_BTC_ADDRESS) || C23313hvq.copydefault(this.code, QUOTE_ERROR_THORSWAP_TO_BTC_ADDRESS);
    }

    public final boolean shouldShowFacetSwapWarning() {
        return isQuoteTwoNonFacetEth() || isQuoteEthAndNonFacetEth() || isQuoteErc20AndAnyFacetToken() || isQuoteErc20AndFacetEth();
    }

    private final boolean isQuoteTwoNonFacetEth() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_TWO_NON_FACET_ETH);
    }

    private final boolean isQuoteEthAndNonFacetEth() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_ETH_AND_NON_FACET_ETH);
    }

    private final boolean isQuoteErc20AndAnyFacetToken() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_ERC20_AND_ANY_FACET_TOKEN);
    }

    private final boolean isQuoteErc20AndFacetEth() {
        return C23313hvq.copydefault(this.code, QUOTE_ERROR_ERC20_AND_FACET_ETH);
    }
}
