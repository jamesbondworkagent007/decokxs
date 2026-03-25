package com.okinc.okex.lite.earn.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class EarnCurrencyDetailsBean {
    private String accountBalance;
    private String allocationInEarn;
    private String averageApy;
    private Currency currency;
    private String currentEarnings;
    private boolean hasAvailableSubscriptionProduct;
    private boolean isBalanceSufficientForSubscription;
    private String maxApy;
    private List<Order> orders;
    private String productMaxApy;
    private EarnAssetRewardProgram rewardProgram;
    private List<TotalAmount> totalAmounts;
    private String totalDeposits;
    private String totalEstimatedTotalvarueFiat;
    private String unit;
    private String unitSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(Order$$serializer.INSTANCE), new ArrayListSerializer(TotalAmount$$serializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarnCurrencyDetailsBean() {
        this((String) null, (String) null, (String) null, (Currency) null, (String) null, false, false, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, (String) null, (String) null, (EarnAssetRewardProgram) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Order> component10() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TotalAmount> component11() {
        return this.totalAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.totalDeposits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.totalEstimatedTotalvarueFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.unitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnAssetRewardProgram component16() {
        return this.rewardProgram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.allocationInEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.averageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency component4() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currentEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hasAvailableSubscriptionProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isBalanceSufficientForSubscription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.productMaxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnCurrencyDetailsBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, Currency currency, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, @NotNull String str6, List<Order> list, List<TotalAmount> list2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, EarnAssetRewardProgram earnAssetRewardProgram) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new EarnCurrencyDetailsBean(str, str2, str3, currency, str4, z, z2, str5, str6, list, list2, str7, str8, str9, str10, earnAssetRewardProgram);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarnCurrencyDetailsBean)) {
            return false;
        }
        EarnCurrencyDetailsBean earnCurrencyDetailsBean = (EarnCurrencyDetailsBean) obj;
        return Intrinsics.EZpvd((Object) this.accountBalance, (Object) earnCurrencyDetailsBean.accountBalance) && Intrinsics.EZpvd((Object) this.allocationInEarn, (Object) earnCurrencyDetailsBean.allocationInEarn) && Intrinsics.EZpvd((Object) this.averageApy, (Object) earnCurrencyDetailsBean.averageApy) && Intrinsics.EZpvd(this.currency, earnCurrencyDetailsBean.currency) && Intrinsics.EZpvd((Object) this.currentEarnings, (Object) earnCurrencyDetailsBean.currentEarnings) && this.hasAvailableSubscriptionProduct == earnCurrencyDetailsBean.hasAvailableSubscriptionProduct && this.isBalanceSufficientForSubscription == earnCurrencyDetailsBean.isBalanceSufficientForSubscription && Intrinsics.EZpvd((Object) this.maxApy, (Object) earnCurrencyDetailsBean.maxApy) && Intrinsics.EZpvd((Object) this.productMaxApy, (Object) earnCurrencyDetailsBean.productMaxApy) && Intrinsics.EZpvd(this.orders, earnCurrencyDetailsBean.orders) && Intrinsics.EZpvd(this.totalAmounts, earnCurrencyDetailsBean.totalAmounts) && Intrinsics.EZpvd((Object) this.totalDeposits, (Object) earnCurrencyDetailsBean.totalDeposits) && Intrinsics.EZpvd((Object) this.totalEstimatedTotalvarueFiat, (Object) earnCurrencyDetailsBean.totalEstimatedTotalvarueFiat) && Intrinsics.EZpvd((Object) this.unit, (Object) earnCurrencyDetailsBean.unit) && Intrinsics.EZpvd((Object) this.unitSymbol, (Object) earnCurrencyDetailsBean.unitSymbol) && Intrinsics.EZpvd(this.rewardProgram, earnCurrencyDetailsBean.rewardProgram);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountBalance() {
        return this.accountBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAllocationInEarn() {
        return this.allocationInEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageApy() {
        return this.averageApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Currency getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentEarnings() {
        return this.currentEarnings;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasAvailableSubscriptionProduct() {
        return this.hasAvailableSubscriptionProduct;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxApy() {
        return this.maxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Order> getOrders() {
        return this.orders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductMaxApy() {
        return this.productMaxApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnAssetRewardProgram getRewardProgram() {
        return this.rewardProgram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TotalAmount> getTotalAmounts() {
        return this.totalAmounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalDeposits() {
        return this.totalDeposits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEstimatedTotalvarueFiat() {
        return this.totalEstimatedTotalvarueFiat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnitSymbol() {
        return this.unitSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountBalance.hashCode();
        int iHashCode2 = this.allocationInEarn.hashCode();
        int iHashCode3 = this.averageApy.hashCode();
        Currency currency = this.currency;
        int iHashCode4 = currency == null ? 0 : currency.hashCode();
        int iHashCode5 = this.currentEarnings.hashCode();
        int iHashCode6 = Boolean.hashCode(this.hasAvailableSubscriptionProduct);
        int iHashCode7 = Boolean.hashCode(this.isBalanceSufficientForSubscription);
        int iHashCode8 = this.maxApy.hashCode();
        int iHashCode9 = this.productMaxApy.hashCode();
        List<Order> list = this.orders;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        List<TotalAmount> list2 = this.totalAmounts;
        int iHashCode11 = list2 == null ? 0 : list2.hashCode();
        int iHashCode12 = this.totalDeposits.hashCode();
        int iHashCode13 = this.totalEstimatedTotalvarueFiat.hashCode();
        int iHashCode14 = this.unit.hashCode();
        int iHashCode15 = this.unitSymbol.hashCode();
        EarnAssetRewardProgram earnAssetRewardProgram = this.rewardProgram;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (earnAssetRewardProgram == null ? 0 : earnAssetRewardProgram.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBalanceSufficientForSubscription() {
        return this.isBalanceSufficientForSubscription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllocationInEarn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.allocationInEarn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAverageApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.averageApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalanceSufficientForSubscription(boolean z) {
        this.isBalanceSufficientForSubscription = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentEarnings(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currentEarnings = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasAvailableSubscriptionProduct(boolean z) {
        this.hasAvailableSubscriptionProduct = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrders(List<Order> list) {
        this.orders = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProductMaxApy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.productMaxApy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRewardProgram(EarnAssetRewardProgram earnAssetRewardProgram) {
        this.rewardProgram = earnAssetRewardProgram;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAmounts(List<TotalAmount> list) {
        this.totalAmounts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalDeposits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalDeposits = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalEstimatedTotalvarueFiat(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalEstimatedTotalvarueFiat = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnitSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unitSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnCurrencyDetailsBean(accountBalance=" + this.accountBalance + ", allocationInEarn=" + this.allocationInEarn + ", averageApy=" + this.averageApy + ", currency=" + this.currency + ", currentEarnings=" + this.currentEarnings + ", hasAvailableSubscriptionProduct=" + this.hasAvailableSubscriptionProduct + ", isBalanceSufficientForSubscription=" + this.isBalanceSufficientForSubscription + ", maxApy=" + this.maxApy + ", productMaxApy=" + this.productMaxApy + ", orders=" + this.orders + ", totalAmounts=" + this.totalAmounts + ", totalDeposits=" + this.totalDeposits + ", totalEstimatedTotalvarueFiat=" + this.totalEstimatedTotalvarueFiat + ", unit=" + this.unit + ", unitSymbol=" + this.unitSymbol + ", rewardProgram=" + this.rewardProgram + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.earn.bean.EarnCurrencyDetailsBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnCurrencyDetailsBean> serializer() {
            return EarnCurrencyDetailsBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnCurrencyDetailsBean(int i, String str, String str2, String str3, Currency currency, String str4, boolean z, boolean z2, String str5, String str6, List list, List list2, String str7, String str8, String str9, String str10, EarnAssetRewardProgram earnAssetRewardProgram, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountBalance = "0";
        } else {
            this.accountBalance = str;
        }
        if ((i & 2) == 0) {
            this.allocationInEarn = "0";
        } else {
            this.allocationInEarn = str2;
        }
        if ((i & 4) == 0) {
            this.averageApy = "0";
        } else {
            this.averageApy = str3;
        }
        if ((i & 8) == 0) {
            this.currency = null;
        } else {
            this.currency = currency;
        }
        if ((i & 16) == 0) {
            this.currentEarnings = "0";
        } else {
            this.currentEarnings = str4;
        }
        if ((i & 32) == 0) {
            this.hasAvailableSubscriptionProduct = false;
        } else {
            this.hasAvailableSubscriptionProduct = z;
        }
        if ((i & 64) == 0) {
            this.isBalanceSufficientForSubscription = false;
        } else {
            this.isBalanceSufficientForSubscription = z2;
        }
        if ((i & 128) == 0) {
            this.maxApy = "0";
        } else {
            this.maxApy = str5;
        }
        if ((i & 256) == 0) {
            this.productMaxApy = "0";
        } else {
            this.productMaxApy = str6;
        }
        if ((i & 512) == 0) {
            this.orders = null;
        } else {
            this.orders = list;
        }
        if ((i & 1024) == 0) {
            this.totalAmounts = null;
        } else {
            this.totalAmounts = list2;
        }
        if ((i & 2048) == 0) {
            this.totalDeposits = "0";
        } else {
            this.totalDeposits = str7;
        }
        if ((i & 4096) == 0) {
            this.totalEstimatedTotalvarueFiat = "0";
        } else {
            this.totalEstimatedTotalvarueFiat = str8;
        }
        if ((i & 8192) == 0) {
            this.unit = "";
        } else {
            this.unit = str9;
        }
        if ((i & 16384) == 0) {
            this.unitSymbol = "";
        } else {
            this.unitSymbol = str10;
        }
        if ((i & 32768) == 0) {
            this.rewardProgram = null;
        } else {
            this.rewardProgram = earnAssetRewardProgram;
        }
    }

    public static final /* synthetic */ void write$Self$OKFinance_finance_api(EarnCurrencyDetailsBean earnCurrencyDetailsBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.accountBalance, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earnCurrencyDetailsBean.accountBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.allocationInEarn, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earnCurrencyDetailsBean.allocationInEarn);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.averageApy, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earnCurrencyDetailsBean.averageApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || earnCurrencyDetailsBean.currency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, Currency$$serializer.INSTANCE, earnCurrencyDetailsBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.currentEarnings, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, earnCurrencyDetailsBean.currentEarnings);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || earnCurrencyDetailsBean.hasAvailableSubscriptionProduct) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, earnCurrencyDetailsBean.hasAvailableSubscriptionProduct);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || earnCurrencyDetailsBean.isBalanceSufficientForSubscription) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, earnCurrencyDetailsBean.isBalanceSufficientForSubscription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.maxApy, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, earnCurrencyDetailsBean.maxApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.productMaxApy, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, earnCurrencyDetailsBean.productMaxApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || earnCurrencyDetailsBean.orders != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, kSerializerArr[9], earnCurrencyDetailsBean.orders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || earnCurrencyDetailsBean.totalAmounts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], earnCurrencyDetailsBean.totalAmounts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.totalDeposits, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, earnCurrencyDetailsBean.totalDeposits);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.totalEstimatedTotalvarueFiat, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, earnCurrencyDetailsBean.totalEstimatedTotalvarueFiat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.unit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, earnCurrencyDetailsBean.unit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) earnCurrencyDetailsBean.unitSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, earnCurrencyDetailsBean.unitSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && earnCurrencyDetailsBean.rewardProgram == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, EarnAssetRewardProgram$$serializer.INSTANCE, earnCurrencyDetailsBean.rewardProgram);
    }

    public EarnCurrencyDetailsBean(@NotNull String str, @NotNull String str2, @NotNull String str3, Currency currency, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, @NotNull String str6, List<Order> list, List<TotalAmount> list2, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, EarnAssetRewardProgram earnAssetRewardProgram) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.accountBalance = str;
        this.allocationInEarn = str2;
        this.averageApy = str3;
        this.currency = currency;
        this.currentEarnings = str4;
        this.hasAvailableSubscriptionProduct = z;
        this.isBalanceSufficientForSubscription = z2;
        this.maxApy = str5;
        this.productMaxApy = str6;
        this.orders = list;
        this.totalAmounts = list2;
        this.totalDeposits = str7;
        this.totalEstimatedTotalvarueFiat = str8;
        this.unit = str9;
        this.unitSymbol = str10;
        this.rewardProgram = earnAssetRewardProgram;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a9: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r20v0 java.lang.String))
  (wrap:com.okinc.okex.lite.earn.bean.Currency:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.Currency) : (r21v0 com.okinc.okex.lite.earn.bean.Currency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0035: ARITH (r34v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r24v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("0") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("0") : (r26v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r27v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r28v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("0") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : ("0"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r32v0 java.lang.String) : (""))
  (wrap:com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram:?: TERNARY null = ((wrap:int:0x0080: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram) : (r33v0 com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.Currency, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.okex.lite.earn.bean.Order>, java.util.List<com.okinc.okex.lite.earn.bean.TotalAmount>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram):void (m)] (LINE:8) call: com.okinc.okex.lite.earn.bean.EarnCurrencyDetailsBean.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.Currency, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okex.lite.earn.bean.EarnAssetRewardProgram):void type: THIS */
    public /* synthetic */ EarnCurrencyDetailsBean(String str, String str2, String str3, Currency currency, String str4, boolean z, boolean z2, String str5, String str6, List list, List list2, String str7, String str8, String str9, String str10, EarnAssetRewardProgram earnAssetRewardProgram, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? null : currency, (i & 16) != 0 ? "0" : str4, (i & 32) != 0 ? false : z, (i & 64) == 0 ? z2 : false, (i & 128) != 0 ? "0" : str5, (i & 256) != 0 ? "0" : str6, (i & 512) != 0 ? null : list, (i & 1024) != 0 ? null : list2, (i & 2048) != 0 ? "0" : str7, (i & 4096) == 0 ? str8 : "0", (i & 8192) != 0 ? "" : str9, (i & 16384) == 0 ? str10 : "", (i & 32768) != 0 ? null : earnAssetRewardProgram);
    }
}
