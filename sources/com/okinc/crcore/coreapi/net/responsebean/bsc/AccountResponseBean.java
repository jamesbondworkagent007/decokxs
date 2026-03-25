package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class AccountResponseBean implements Parcelable {
    private String accountNumber;
    private String accountType;
    private boolean allowCreditCard;
    private String availableBalance;
    private String balanceAccountType;
    private String bankAccountType;
    private String bankAddress;
    private String bankCode;
    private String bankIdentifierCode;
    private String bankName;
    private boolean bestOption;
    private BillingAddressResponseBean billing;
    private String brand;
    private String bsbNumber;
    private String country;
    private String countryCode;
    private String description;
    private String expMonth;
    private String expYear;
    private String iban;
    private String intermediaryBankAddress;
    private String intermediaryBankIdentifierCode;
    private String intermediaryBankName;
    private boolean isAccountLabel;
    private boolean isSelected;
    private String last4;
    private String merchantId;
    private String paymentAccountId;
    private String pixKey;
    private String recipientName;
    private String redirectUrl;
    private int remainVerificationAttempts;
    private String routingNumber;
    private String sortCode;
    private String status;
    private String totalBalance;
    private String unavailableBalance;
    private String userId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AccountResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AccountResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AccountResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : BillingAddressResponseBean.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountResponseBean[] newArray(int i) {
            return new AccountResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AccountResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BillingAddressResponseBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, false, -1, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.bankCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.routingNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.iban;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.bsbNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.sortCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.brand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingAddressResponseBean component19() {
        return this.billing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.recipientName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.expMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.expYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.remainVerificationAttempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.accountNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.intermediaryBankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.intermediaryBankAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.intermediaryBankIdentifierCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component33() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component34() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.pixKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component38() {
        return this.allowCreditCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.bankAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isAccountLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.bankAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.bankIdentifierCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, BillingAddressResponseBean billingAddressResponseBean, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, String str25, @NotNull String str26, int i, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z2, boolean z3, @NotNull String str30, String str31, String str32, boolean z4) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        return new AccountResponseBean(str, str2, str3, str4, str5, str6, z, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, billingAddressResponseBean, str18, str19, str20, str21, str22, str23, str24, str25, str26, i, str27, str28, str29, z2, z3, str30, str31, str32, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountResponseBean)) {
            return false;
        }
        AccountResponseBean accountResponseBean = (AccountResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.paymentAccountId, (Object) accountResponseBean.paymentAccountId) && Intrinsics.EZpvd((Object) this.recipientName, (Object) accountResponseBean.recipientName) && Intrinsics.EZpvd((Object) this.accountNumber, (Object) accountResponseBean.accountNumber) && Intrinsics.EZpvd((Object) this.accountType, (Object) accountResponseBean.accountType) && Intrinsics.EZpvd((Object) this.bankAccountType, (Object) accountResponseBean.bankAccountType) && Intrinsics.EZpvd((Object) this.bankName, (Object) accountResponseBean.bankName) && this.isAccountLabel == accountResponseBean.isAccountLabel && Intrinsics.EZpvd((Object) this.bankAddress, (Object) accountResponseBean.bankAddress) && Intrinsics.EZpvd((Object) this.bankIdentifierCode, (Object) accountResponseBean.bankIdentifierCode) && Intrinsics.EZpvd((Object) this.bankCode, (Object) accountResponseBean.bankCode) && Intrinsics.EZpvd((Object) this.routingNumber, (Object) accountResponseBean.routingNumber) && Intrinsics.EZpvd((Object) this.iban, (Object) accountResponseBean.iban) && Intrinsics.EZpvd((Object) this.bsbNumber, (Object) accountResponseBean.bsbNumber) && Intrinsics.EZpvd((Object) this.status, (Object) accountResponseBean.status) && Intrinsics.EZpvd((Object) this.description, (Object) accountResponseBean.description) && Intrinsics.EZpvd((Object) this.sortCode, (Object) accountResponseBean.sortCode) && Intrinsics.EZpvd((Object) this.last4, (Object) accountResponseBean.last4) && Intrinsics.EZpvd((Object) this.brand, (Object) accountResponseBean.brand) && Intrinsics.EZpvd(this.billing, accountResponseBean.billing) && Intrinsics.EZpvd((Object) this.redirectUrl, (Object) accountResponseBean.redirectUrl) && Intrinsics.EZpvd((Object) this.country, (Object) accountResponseBean.country) && Intrinsics.EZpvd((Object) this.expMonth, (Object) accountResponseBean.expMonth) && Intrinsics.EZpvd((Object) this.expYear, (Object) accountResponseBean.expYear) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) accountResponseBean.availableBalance) && Intrinsics.EZpvd((Object) this.unavailableBalance, (Object) accountResponseBean.unavailableBalance) && Intrinsics.EZpvd((Object) this.totalBalance, (Object) accountResponseBean.totalBalance) && Intrinsics.EZpvd((Object) this.balanceAccountType, (Object) accountResponseBean.balanceAccountType) && Intrinsics.EZpvd((Object) this.userId, (Object) accountResponseBean.userId) && this.remainVerificationAttempts == accountResponseBean.remainVerificationAttempts && Intrinsics.EZpvd((Object) this.intermediaryBankName, (Object) accountResponseBean.intermediaryBankName) && Intrinsics.EZpvd((Object) this.intermediaryBankAddress, (Object) accountResponseBean.intermediaryBankAddress) && Intrinsics.EZpvd((Object) this.intermediaryBankIdentifierCode, (Object) accountResponseBean.intermediaryBankIdentifierCode) && this.bestOption == accountResponseBean.bestOption && this.isSelected == accountResponseBean.isSelected && Intrinsics.EZpvd((Object) this.pixKey, (Object) accountResponseBean.pixKey) && Intrinsics.EZpvd((Object) this.merchantId, (Object) accountResponseBean.merchantId) && Intrinsics.EZpvd((Object) this.countryCode, (Object) accountResponseBean.countryCode) && this.allowCreditCard == accountResponseBean.allowCreditCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountType() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowCreditCard() {
        return this.allowCreditCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAccountType() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankAccountType() {
        return this.bankAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankAddress() {
        return this.bankAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankCode() {
        return this.bankCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankIdentifierCode() {
        return this.bankIdentifierCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestOption() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingAddressResponseBean getBilling() {
        return this.billing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBsbNumber() {
        return this.bsbNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpMonth() {
        return this.expMonth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpYear() {
        return this.expYear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIban() {
        return this.iban;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntermediaryBankAddress() {
        return this.intermediaryBankAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntermediaryBankIdentifierCode() {
        return this.intermediaryBankIdentifierCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntermediaryBankName() {
        return this.intermediaryBankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentAccountId() {
        return this.paymentAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPixKey() {
        return this.pixKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecipientName() {
        return this.recipientName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRemainVerificationAttempts() {
        return this.remainVerificationAttempts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSortCode() {
        return this.sortCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnavailableBalance() {
        return this.unavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.paymentAccountId.hashCode();
        int iHashCode2 = this.recipientName.hashCode();
        int iHashCode3 = this.accountNumber.hashCode();
        int iHashCode4 = this.accountType.hashCode();
        int iHashCode5 = this.bankAccountType.hashCode();
        int iHashCode6 = this.bankName.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isAccountLabel);
        int iHashCode8 = this.bankAddress.hashCode();
        int iHashCode9 = this.bankIdentifierCode.hashCode();
        int iHashCode10 = this.bankCode.hashCode();
        int iHashCode11 = this.routingNumber.hashCode();
        int iHashCode12 = this.iban.hashCode();
        int iHashCode13 = this.bsbNumber.hashCode();
        int iHashCode14 = this.status.hashCode();
        int iHashCode15 = this.description.hashCode();
        int iHashCode16 = this.sortCode.hashCode();
        int iHashCode17 = this.last4.hashCode();
        int iHashCode18 = this.brand.hashCode();
        BillingAddressResponseBean billingAddressResponseBean = this.billing;
        int iHashCode19 = billingAddressResponseBean == null ? 0 : billingAddressResponseBean.hashCode();
        int iHashCode20 = this.redirectUrl.hashCode();
        int iHashCode21 = this.country.hashCode();
        int iHashCode22 = this.expMonth.hashCode();
        int iHashCode23 = this.expYear.hashCode();
        int iHashCode24 = this.availableBalance.hashCode();
        int iHashCode25 = this.unavailableBalance.hashCode();
        int iHashCode26 = this.totalBalance.hashCode();
        String str = this.balanceAccountType;
        int iHashCode27 = str == null ? 0 : str.hashCode();
        int iHashCode28 = this.userId.hashCode();
        int iHashCode29 = Integer.hashCode(this.remainVerificationAttempts);
        int iHashCode30 = this.intermediaryBankName.hashCode();
        int iHashCode31 = this.intermediaryBankAddress.hashCode();
        int iHashCode32 = this.intermediaryBankIdentifierCode.hashCode();
        int iHashCode33 = Boolean.hashCode(this.bestOption);
        int iHashCode34 = Boolean.hashCode(this.isSelected);
        int iHashCode35 = this.pixKey.hashCode();
        String str2 = this.merchantId;
        int iHashCode36 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.countryCode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowCreditCard);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAccountLabel() {
        return this.isAccountLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountLabel(boolean z) {
        this.isAccountLabel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAllowCreditCard(boolean z) {
        this.allowCreditCard = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAvailableBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.availableBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalanceAccountType(String str) {
        this.balanceAccountType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankAccountType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankAccountType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankIdentifierCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankIdentifierCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bankName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBestOption(boolean z) {
        this.bestOption = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBilling(BillingAddressResponseBean billingAddressResponseBean) {
        this.billing = billingAddressResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBrand(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.brand = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBsbNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bsbNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.country = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpMonth(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expMonth = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpYear(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.expYear = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIban(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iban = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntermediaryBankAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intermediaryBankAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntermediaryBankIdentifierCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intermediaryBankIdentifierCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntermediaryBankName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.intermediaryBankName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLast4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.last4 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMerchantId(String str) {
        this.merchantId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentAccountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPixKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pixKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecipientName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.recipientName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedirectUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.redirectUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemainVerificationAttempts(int i) {
        this.remainVerificationAttempts = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRoutingNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.routingNumber = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSortCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sortCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStatus(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.status = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnavailableBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unavailableBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AccountResponseBean(paymentAccountId=" + this.paymentAccountId + ", recipientName=" + this.recipientName + ", accountNumber=" + this.accountNumber + ", accountType=" + this.accountType + ", bankAccountType=" + this.bankAccountType + ", bankName=" + this.bankName + ", isAccountLabel=" + this.isAccountLabel + ", bankAddress=" + this.bankAddress + ", bankIdentifierCode=" + this.bankIdentifierCode + ", bankCode=" + this.bankCode + ", routingNumber=" + this.routingNumber + ", iban=" + this.iban + ", bsbNumber=" + this.bsbNumber + ", status=" + this.status + ", description=" + this.description + ", sortCode=" + this.sortCode + ", last4=" + this.last4 + ", brand=" + this.brand + ", billing=" + this.billing + ", redirectUrl=" + this.redirectUrl + ", country=" + this.country + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", availableBalance=" + this.availableBalance + ", unavailableBalance=" + this.unavailableBalance + ", totalBalance=" + this.totalBalance + ", balanceAccountType=" + this.balanceAccountType + ", userId=" + this.userId + ", remainVerificationAttempts=" + this.remainVerificationAttempts + ", intermediaryBankName=" + this.intermediaryBankName + ", intermediaryBankAddress=" + this.intermediaryBankAddress + ", intermediaryBankIdentifierCode=" + this.intermediaryBankIdentifierCode + ", bestOption=" + this.bestOption + ", isSelected=" + this.isSelected + ", pixKey=" + this.pixKey + ", merchantId=" + this.merchantId + ", countryCode=" + this.countryCode + ", allowCreditCard=" + this.allowCreditCard + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.paymentAccountId);
        parcel.writeString(this.recipientName);
        parcel.writeString(this.accountNumber);
        parcel.writeString(this.accountType);
        parcel.writeString(this.bankAccountType);
        parcel.writeString(this.bankName);
        parcel.writeInt(this.isAccountLabel ? 1 : 0);
        parcel.writeString(this.bankAddress);
        parcel.writeString(this.bankIdentifierCode);
        parcel.writeString(this.bankCode);
        parcel.writeString(this.routingNumber);
        parcel.writeString(this.iban);
        parcel.writeString(this.bsbNumber);
        parcel.writeString(this.status);
        parcel.writeString(this.description);
        parcel.writeString(this.sortCode);
        parcel.writeString(this.last4);
        parcel.writeString(this.brand);
        BillingAddressResponseBean billingAddressResponseBean = this.billing;
        if (billingAddressResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingAddressResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.redirectUrl);
        parcel.writeString(this.country);
        parcel.writeString(this.expMonth);
        parcel.writeString(this.expYear);
        parcel.writeString(this.availableBalance);
        parcel.writeString(this.unavailableBalance);
        parcel.writeString(this.totalBalance);
        parcel.writeString(this.balanceAccountType);
        parcel.writeString(this.userId);
        parcel.writeInt(this.remainVerificationAttempts);
        parcel.writeString(this.intermediaryBankName);
        parcel.writeString(this.intermediaryBankAddress);
        parcel.writeString(this.intermediaryBankIdentifierCode);
        parcel.writeInt(this.bestOption ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.pixKey);
        parcel.writeString(this.merchantId);
        parcel.writeString(this.countryCode);
        parcel.writeInt(this.allowCreditCard ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AccountResponseBean> serializer() {
            return AccountResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AccountResponseBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BillingAddressResponseBean billingAddressResponseBean, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i3, String str27, String str28, String str29, boolean z2, boolean z3, String str30, String str31, String str32, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.paymentAccountId = "";
        } else {
            this.paymentAccountId = str;
        }
        if ((i & 2) == 0) {
            this.recipientName = "";
        } else {
            this.recipientName = str2;
        }
        if ((i & 4) == 0) {
            this.accountNumber = "";
        } else {
            this.accountNumber = str3;
        }
        if ((i & 8) == 0) {
            this.accountType = "";
        } else {
            this.accountType = str4;
        }
        if ((i & 16) == 0) {
            this.bankAccountType = "";
        } else {
            this.bankAccountType = str5;
        }
        if ((i & 32) == 0) {
            this.bankName = "";
        } else {
            this.bankName = str6;
        }
        if ((i & 64) == 0) {
            this.isAccountLabel = false;
        } else {
            this.isAccountLabel = z;
        }
        if ((i & 128) == 0) {
            this.bankAddress = "";
        } else {
            this.bankAddress = str7;
        }
        if ((i & 256) == 0) {
            this.bankIdentifierCode = "";
        } else {
            this.bankIdentifierCode = str8;
        }
        if ((i & 512) == 0) {
            this.bankCode = "";
        } else {
            this.bankCode = str9;
        }
        if ((i & 1024) == 0) {
            this.routingNumber = "";
        } else {
            this.routingNumber = str10;
        }
        if ((i & 2048) == 0) {
            this.iban = "";
        } else {
            this.iban = str11;
        }
        if ((i & 4096) == 0) {
            this.bsbNumber = "";
        } else {
            this.bsbNumber = str12;
        }
        if ((i & 8192) == 0) {
            this.status = "";
        } else {
            this.status = str13;
        }
        if ((i & 16384) == 0) {
            this.description = "";
        } else {
            this.description = str14;
        }
        if ((32768 & i) == 0) {
            this.sortCode = "";
        } else {
            this.sortCode = str15;
        }
        if ((65536 & i) == 0) {
            this.last4 = "";
        } else {
            this.last4 = str16;
        }
        if ((131072 & i) == 0) {
            this.brand = "";
        } else {
            this.brand = str17;
        }
        if ((262144 & i) == 0) {
            this.billing = null;
        } else {
            this.billing = billingAddressResponseBean;
        }
        if ((524288 & i) == 0) {
            this.redirectUrl = "";
        } else {
            this.redirectUrl = str18;
        }
        if ((1048576 & i) == 0) {
            this.country = "";
        } else {
            this.country = str19;
        }
        if ((2097152 & i) == 0) {
            this.expMonth = "";
        } else {
            this.expMonth = str20;
        }
        if ((4194304 & i) == 0) {
            this.expYear = "";
        } else {
            this.expYear = str21;
        }
        if ((8388608 & i) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str22;
        }
        if ((16777216 & i) == 0) {
            this.unavailableBalance = "";
        } else {
            this.unavailableBalance = str23;
        }
        if ((33554432 & i) == 0) {
            this.totalBalance = "";
        } else {
            this.totalBalance = str24;
        }
        if ((67108864 & i) == 0) {
            this.balanceAccountType = null;
        } else {
            this.balanceAccountType = str25;
        }
        if ((134217728 & i) == 0) {
            this.userId = "";
        } else {
            this.userId = str26;
        }
        this.remainVerificationAttempts = (268435456 & i) == 0 ? -1 : i3;
        if ((536870912 & i) == 0) {
            this.intermediaryBankName = "";
        } else {
            this.intermediaryBankName = str27;
        }
        if ((1073741824 & i) == 0) {
            this.intermediaryBankAddress = "";
        } else {
            this.intermediaryBankAddress = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.intermediaryBankIdentifierCode = "";
        } else {
            this.intermediaryBankIdentifierCode = str29;
        }
        if ((i2 & 1) == 0) {
            this.bestOption = false;
        } else {
            this.bestOption = z2;
        }
        if ((i2 & 2) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z3;
        }
        if ((i2 & 4) == 0) {
            this.pixKey = "";
        } else {
            this.pixKey = str30;
        }
        if ((i2 & 8) == 0) {
            this.merchantId = "";
        } else {
            this.merchantId = str31;
        }
        if ((i2 & 16) == 0) {
            this.countryCode = "";
        } else {
            this.countryCode = str32;
        }
        this.allowCreditCard = (i2 & 32) == 0 ? true : z4;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(AccountResponseBean accountResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) accountResponseBean.paymentAccountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, accountResponseBean.paymentAccountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) accountResponseBean.recipientName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, accountResponseBean.recipientName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) accountResponseBean.accountNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, accountResponseBean.accountNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) accountResponseBean.accountType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, accountResponseBean.accountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) accountResponseBean.bankAccountType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, accountResponseBean.bankAccountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) accountResponseBean.bankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, accountResponseBean.bankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || accountResponseBean.isAccountLabel) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, accountResponseBean.isAccountLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) accountResponseBean.bankAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, accountResponseBean.bankAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) accountResponseBean.bankIdentifierCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, accountResponseBean.bankIdentifierCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) accountResponseBean.bankCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, accountResponseBean.bankCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) accountResponseBean.routingNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, accountResponseBean.routingNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) accountResponseBean.iban, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, accountResponseBean.iban);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) accountResponseBean.bsbNumber, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, accountResponseBean.bsbNumber);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) accountResponseBean.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, accountResponseBean.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) accountResponseBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, accountResponseBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) accountResponseBean.sortCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, accountResponseBean.sortCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) accountResponseBean.last4, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, accountResponseBean.last4);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) accountResponseBean.brand, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, accountResponseBean.brand);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || accountResponseBean.billing != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, BillingAddressResponseBean$$serializer.INSTANCE, accountResponseBean.billing);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) accountResponseBean.redirectUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, accountResponseBean.redirectUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) accountResponseBean.country, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, accountResponseBean.country);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) accountResponseBean.expMonth, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, accountResponseBean.expMonth);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) accountResponseBean.expYear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, accountResponseBean.expYear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) accountResponseBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, accountResponseBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) accountResponseBean.unavailableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, accountResponseBean.unavailableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) accountResponseBean.totalBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, accountResponseBean.totalBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || accountResponseBean.balanceAccountType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, accountResponseBean.balanceAccountType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) accountResponseBean.userId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, accountResponseBean.userId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || accountResponseBean.remainVerificationAttempts != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 28, accountResponseBean.remainVerificationAttempts);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) accountResponseBean.intermediaryBankName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, accountResponseBean.intermediaryBankName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) accountResponseBean.intermediaryBankAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, accountResponseBean.intermediaryBankAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) accountResponseBean.intermediaryBankIdentifierCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, accountResponseBean.intermediaryBankIdentifierCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || accountResponseBean.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 32, accountResponseBean.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || accountResponseBean.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 33, accountResponseBean.isSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) accountResponseBean.pixKey, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, accountResponseBean.pixKey);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) accountResponseBean.merchantId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 35, StringSerializer.INSTANCE, accountResponseBean.merchantId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) accountResponseBean.countryCode, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 36, StringSerializer.INSTANCE, accountResponseBean.countryCode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) && accountResponseBean.allowCreditCard) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 37, accountResponseBean.allowCreditCard);
    }

    public AccountResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, BillingAddressResponseBean billingAddressResponseBean, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, String str25, @NotNull String str26, int i, @NotNull String str27, @NotNull String str28, @NotNull String str29, boolean z2, boolean z3, @NotNull String str30, String str31, String str32, boolean z4) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        this.paymentAccountId = str;
        this.recipientName = str2;
        this.accountNumber = str3;
        this.accountType = str4;
        this.bankAccountType = str5;
        this.bankName = str6;
        this.isAccountLabel = z;
        this.bankAddress = str7;
        this.bankIdentifierCode = str8;
        this.bankCode = str9;
        this.routingNumber = str10;
        this.iban = str11;
        this.bsbNumber = str12;
        this.status = str13;
        this.description = str14;
        this.sortCode = str15;
        this.last4 = str16;
        this.brand = str17;
        this.billing = billingAddressResponseBean;
        this.redirectUrl = str18;
        this.country = str19;
        this.expMonth = str20;
        this.expYear = str21;
        this.availableBalance = str22;
        this.unavailableBalance = str23;
        this.totalBalance = str24;
        this.balanceAccountType = str25;
        this.userId = str26;
        this.remainVerificationAttempts = i;
        this.intermediaryBankName = str27;
        this.intermediaryBankAddress = str28;
        this.intermediaryBankIdentifierCode = str29;
        this.bestOption = z2;
        this.isSelected = z3;
        this.pixKey = str30;
        this.merchantId = str31;
        this.countryCode = str32;
        this.allowCreditCard = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01bf: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r77v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r77v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r77v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r77v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r77v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r77v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r77v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r77v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r77v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r77v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r77v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r77v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r77v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r77v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean) : (r57v0 com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r77v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r77v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r77v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r77v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r77v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r77v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r77v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r77v0 int) & (67108864 int) A[WRAPPED]) == (0 int)) ? (r65v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r77v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0111: ARITH (r77v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r67v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r77v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r77v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0132: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x013b: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r71v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0144: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r72v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x014d: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0156: ARITH (r78v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015f: ARITH (r78v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0168: ARITH (r78v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r76v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.BillingAddressResponseBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AccountResponseBean(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, BillingAddressResponseBean billingAddressResponseBean, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, int i, String str27, String str28, String str29, boolean z2, boolean z3, String str30, String str31, String str32, boolean z4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? "" : str8, (i2 & 512) != 0 ? "" : str9, (i2 & 1024) != 0 ? "" : str10, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? "" : str12, (i2 & 8192) != 0 ? "" : str13, (i2 & 16384) != 0 ? "" : str14, (i2 & 32768) != 0 ? "" : str15, (i2 & 65536) != 0 ? "" : str16, (i2 & 131072) != 0 ? "" : str17, (i2 & 262144) != 0 ? null : billingAddressResponseBean, (i2 & 524288) != 0 ? "" : str18, (i2 & 1048576) != 0 ? "" : str19, (i2 & 2097152) != 0 ? "" : str20, (i2 & 4194304) != 0 ? "" : str21, (i2 & 8388608) != 0 ? "" : str22, (i2 & 16777216) != 0 ? "" : str23, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i2 & 67108864) == 0 ? str25 : null, (i2 & 134217728) != 0 ? "" : str26, (i2 & 268435456) != 0 ? -1 : i, (i2 & 536870912) != 0 ? "" : str27, (i2 & 1073741824) != 0 ? "" : str28, (i2 & Integer.MIN_VALUE) != 0 ? "" : str29, (i3 & 1) != 0 ? false : z2, (i3 & 2) != 0 ? false : z3, (i3 & 4) != 0 ? "" : str30, (i3 & 8) != 0 ? "" : str31, (i3 & 16) != 0 ? "" : str32, (i3 & 32) != 0 ? true : z4);
    }
}
