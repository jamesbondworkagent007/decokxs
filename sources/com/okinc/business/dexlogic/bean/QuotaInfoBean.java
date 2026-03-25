package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class QuotaInfoBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String displayMsgThresholdValue;
    private final String limitAmount;
    private final String perTradeLimit;
    private final String remainingAmount;
    private final String remainingSeconds;
    private final String usedAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuotaInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuotaInfoBean copy$default(QuotaInfoBean quotaInfoBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = quotaInfoBean.accountId;
        }
        if ((i & 2) != 0) {
            str2 = quotaInfoBean.limitAmount;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = quotaInfoBean.perTradeLimit;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = quotaInfoBean.remainingAmount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = quotaInfoBean.remainingSeconds;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = quotaInfoBean.usedAmount;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = quotaInfoBean.displayMsgThresholdValue;
        }
        return quotaInfoBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.limitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.perTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.remainingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remainingSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayMsgThresholdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotaInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new QuotaInfoBean(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuotaInfoBean)) {
            return false;
        }
        QuotaInfoBean quotaInfoBean = (QuotaInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) quotaInfoBean.accountId) && Intrinsics.EZpvd((Object) this.limitAmount, (Object) quotaInfoBean.limitAmount) && Intrinsics.EZpvd((Object) this.perTradeLimit, (Object) quotaInfoBean.perTradeLimit) && Intrinsics.EZpvd((Object) this.remainingAmount, (Object) quotaInfoBean.remainingAmount) && Intrinsics.EZpvd((Object) this.remainingSeconds, (Object) quotaInfoBean.remainingSeconds) && Intrinsics.EZpvd((Object) this.usedAmount, (Object) quotaInfoBean.usedAmount) && Intrinsics.EZpvd((Object) this.displayMsgThresholdValue, (Object) quotaInfoBean.displayMsgThresholdValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayMsgThresholdValue() {
        return this.displayMsgThresholdValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitAmount() {
        return this.limitAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPerTradeLimit() {
        return this.perTradeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainingAmount() {
        return this.remainingAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemainingSeconds() {
        return this.remainingSeconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsedAmount() {
        return this.usedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.accountId.hashCode() * 31) + this.limitAmount.hashCode()) * 31) + this.perTradeLimit.hashCode()) * 31) + this.remainingAmount.hashCode()) * 31) + this.remainingSeconds.hashCode()) * 31) + this.usedAmount.hashCode()) * 31) + this.displayMsgThresholdValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuotaInfoBean(accountId=" + this.accountId + ", limitAmount=" + this.limitAmount + ", perTradeLimit=" + this.perTradeLimit + ", remainingAmount=" + this.remainingAmount + ", remainingSeconds=" + this.remainingSeconds + ", usedAmount=" + this.usedAmount + ", displayMsgThresholdValue=" + this.displayMsgThresholdValue + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuotaInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuotaInfoBean> serializer() {
            return QuotaInfoBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuotaInfoBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.limitAmount = "";
        } else {
            this.limitAmount = str2;
        }
        if ((i & 4) == 0) {
            this.perTradeLimit = "";
        } else {
            this.perTradeLimit = str3;
        }
        if ((i & 8) == 0) {
            this.remainingAmount = "";
        } else {
            this.remainingAmount = str4;
        }
        if ((i & 16) == 0) {
            this.remainingSeconds = "";
        } else {
            this.remainingSeconds = str5;
        }
        if ((i & 32) == 0) {
            this.usedAmount = "";
        } else {
            this.usedAmount = str6;
        }
        if ((i & 64) == 0) {
            this.displayMsgThresholdValue = "";
        } else {
            this.displayMsgThresholdValue = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuotaInfoBean quotaInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) quotaInfoBean.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, quotaInfoBean.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) quotaInfoBean.limitAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, quotaInfoBean.limitAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quotaInfoBean.perTradeLimit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quotaInfoBean.perTradeLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) quotaInfoBean.remainingAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, quotaInfoBean.remainingAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quotaInfoBean.remainingSeconds, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, quotaInfoBean.remainingSeconds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quotaInfoBean.usedAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quotaInfoBean.usedAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) quotaInfoBean.displayMsgThresholdValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, quotaInfoBean.displayMsgThresholdValue);
    }

    public QuotaInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accountId = str;
        this.limitAmount = str2;
        this.perTradeLimit = str3;
        this.remainingAmount = str4;
        this.remainingSeconds = str5;
        this.usedAmount = str6;
        this.displayMsgThresholdValue = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.dexlogic.bean.QuotaInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QuotaInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public final boolean showLowQuotaWarning() {
        return C33129mqd.gEmmrt(this.remainingAmount, this.displayMsgThresholdValue);
    }

    public final boolean hasNoQuotaRemaining() {
        return C33129mqd.OLrzqt(this.remainingAmount, "0");
    }
}
