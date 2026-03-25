package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PaymentMethodResponseBean implements Parcelable {
    private AccountResponseBean account;
    private List<AccountResponseBean> accounts;
    private final boolean allowManualAddition;
    private String backgroundColor;
    private String baseAmount;
    private boolean bestOption;
    private String deepLink;
    private String depositPlatformCode;
    private final boolean depositToWithdraw;
    private String description;
    private String finalPriceForDisplay;
    private String iconUrl;
    private String iconUrlNight;
    private boolean isSelected;
    private String mainColor;
    private int numOfRecurringPlans;
    private String payment;
    private String paymentCurrency;
    private String paymentMethod;
    private String paymentMethodId;
    private String paymentMethodType;
    private String price;
    private String publicTradingOrderId;
    private String quoteCurrency;
    private SellerReceiptAccountResponseBean selectedSellerReceiptAccount;
    private List<SellerReceiptAccountResponseBean> sellerReceiptAccountList;
    private boolean showTransfer;
    private String storeUrl;
    private List<String> supportedTransactionType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<PaymentMethodResponseBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, new ArrayListSerializer(SellerReceiptAccountResponseBean$$serializer.INSTANCE), null, null, null, null, null, null, null, null, new ArrayListSerializer(AccountResponseBean$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodResponseBean createFromParcel(Parcel parcel) {
            boolean z;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            String string11 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            AccountResponseBean accountResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : AccountResponseBean.CREATOR.createFromParcel(parcel);
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = z2;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i);
                z = z2;
                int i2 = 0;
                while (i2 != i) {
                    arrayList4.add(SellerReceiptAccountResponseBean.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList4;
            }
            boolean z4 = parcel.readInt() != 0;
            String string15 = parcel.readString();
            boolean z5 = parcel.readInt() != 0;
            SellerReceiptAccountResponseBean sellerReceiptAccountResponseBeanCreateFromParcel = parcel.readInt() == 0 ? null : SellerReceiptAccountResponseBean.CREATOR.createFromParcel(parcel);
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                arrayList2 = arrayList;
                int i4 = 0;
                while (i4 != i3) {
                    arrayList5.add(AccountResponseBean.CREATOR.createFromParcel(parcel));
                    i4++;
                    i3 = i3;
                }
                arrayList3 = arrayList5;
            }
            return new PaymentMethodResponseBean(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, arrayListCreateStringArrayList, string11, z, z3, accountResponseBeanCreateFromParcel, string12, string13, string14, arrayList2, z4, string15, z5, sellerReceiptAccountResponseBeanCreateFromParcel, string16, string17, string18, z6, arrayList3, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodResponseBean[] newArray(int i) {
            return new PaymentMethodResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PaymentMethodResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, false, false, (AccountResponseBean) null, (String) null, (String) null, (String) null, (List) null, false, (String) null, false, (SellerReceiptAccountResponseBean) null, (String) null, (String) null, (String) null, false, (List) null, 0, 536870911, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component11() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean component15() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.publicTradingOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SellerReceiptAccountResponseBean> component19() {
        return this.sellerReceiptAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.finalPriceForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component22() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellerReceiptAccountResponseBean component23() {
        return this.selectedSellerReceiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.storeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component27() {
        return this.showTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountResponseBean> component28() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component29() {
        return this.numOfRecurringPlans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mainColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.paymentCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.paymentMethodId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentMethodResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, List<String> list, @NotNull String str11, boolean z, boolean z2, AccountResponseBean accountResponseBean, String str12, @NotNull String str13, @NotNull String str14, List<SellerReceiptAccountResponseBean> list2, boolean z3, @NotNull String str15, boolean z4, SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z5, List<AccountResponseBean> list3, int i) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        return new PaymentMethodResponseBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11, z, z2, accountResponseBean, str12, str13, str14, list2, z3, str15, z4, sellerReceiptAccountResponseBean, str16, str17, str18, z5, list3, i);
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
        if (!(obj instanceof PaymentMethodResponseBean)) {
            return false;
        }
        PaymentMethodResponseBean paymentMethodResponseBean = (PaymentMethodResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.payment, (Object) paymentMethodResponseBean.payment) && Intrinsics.EZpvd((Object) this.description, (Object) paymentMethodResponseBean.description) && Intrinsics.EZpvd((Object) this.backgroundColor, (Object) paymentMethodResponseBean.backgroundColor) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) paymentMethodResponseBean.iconUrl) && Intrinsics.EZpvd((Object) this.iconUrlNight, (Object) paymentMethodResponseBean.iconUrlNight) && Intrinsics.EZpvd((Object) this.mainColor, (Object) paymentMethodResponseBean.mainColor) && Intrinsics.EZpvd((Object) this.paymentCurrency, (Object) paymentMethodResponseBean.paymentCurrency) && Intrinsics.EZpvd((Object) this.paymentMethodType, (Object) paymentMethodResponseBean.paymentMethodType) && Intrinsics.EZpvd((Object) this.paymentMethodId, (Object) paymentMethodResponseBean.paymentMethodId) && Intrinsics.EZpvd((Object) this.paymentMethod, (Object) paymentMethodResponseBean.paymentMethod) && Intrinsics.EZpvd(this.supportedTransactionType, paymentMethodResponseBean.supportedTransactionType) && Intrinsics.EZpvd((Object) this.baseAmount, (Object) paymentMethodResponseBean.baseAmount) && this.depositToWithdraw == paymentMethodResponseBean.depositToWithdraw && this.allowManualAddition == paymentMethodResponseBean.allowManualAddition && Intrinsics.EZpvd(this.account, paymentMethodResponseBean.account) && Intrinsics.EZpvd((Object) this.quoteCurrency, (Object) paymentMethodResponseBean.quoteCurrency) && Intrinsics.EZpvd((Object) this.price, (Object) paymentMethodResponseBean.price) && Intrinsics.EZpvd((Object) this.publicTradingOrderId, (Object) paymentMethodResponseBean.publicTradingOrderId) && Intrinsics.EZpvd(this.sellerReceiptAccountList, paymentMethodResponseBean.sellerReceiptAccountList) && this.bestOption == paymentMethodResponseBean.bestOption && Intrinsics.EZpvd((Object) this.finalPriceForDisplay, (Object) paymentMethodResponseBean.finalPriceForDisplay) && this.isSelected == paymentMethodResponseBean.isSelected && Intrinsics.EZpvd(this.selectedSellerReceiptAccount, paymentMethodResponseBean.selectedSellerReceiptAccount) && Intrinsics.EZpvd((Object) this.depositPlatformCode, (Object) paymentMethodResponseBean.depositPlatformCode) && Intrinsics.EZpvd((Object) this.deepLink, (Object) paymentMethodResponseBean.deepLink) && Intrinsics.EZpvd((Object) this.storeUrl, (Object) paymentMethodResponseBean.storeUrl) && this.showTransfer == paymentMethodResponseBean.showTransfer && Intrinsics.EZpvd(this.accounts, paymentMethodResponseBean.accounts) && this.numOfRecurringPlans == paymentMethodResponseBean.numOfRecurringPlans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountResponseBean getAccount() {
        return this.account;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AccountResponseBean> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAllowManualAddition() {
        return this.allowManualAddition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseAmount() {
        return this.baseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestOption() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositPlatformCode() {
        return this.depositPlatformCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDepositToWithdraw() {
        return this.depositToWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFinalPriceForDisplay() {
        return this.finalPriceForDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrlNight() {
        return this.iconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainColor() {
        return this.mainColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNumOfRecurringPlans() {
        return this.numOfRecurringPlans;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayment() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicTradingOrderId() {
        return this.publicTradingOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SellerReceiptAccountResponseBean getSelectedSellerReceiptAccount() {
        return this.selectedSellerReceiptAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SellerReceiptAccountResponseBean> getSellerReceiptAccountList() {
        return this.sellerReceiptAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowTransfer() {
        return this.showTransfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStoreUrl() {
        return this.storeUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportedTransactionType() {
        return this.supportedTransactionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.payment.hashCode();
        int iHashCode2 = this.description.hashCode();
        int iHashCode3 = this.backgroundColor.hashCode();
        int iHashCode4 = this.iconUrl.hashCode();
        int iHashCode5 = this.iconUrlNight.hashCode();
        int iHashCode6 = this.mainColor.hashCode();
        int iHashCode7 = this.paymentCurrency.hashCode();
        int iHashCode8 = this.paymentMethodType.hashCode();
        int iHashCode9 = this.paymentMethodId.hashCode();
        int iHashCode10 = this.paymentMethod.hashCode();
        List<String> list = this.supportedTransactionType;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        int iHashCode12 = this.baseAmount.hashCode();
        int iHashCode13 = Boolean.hashCode(this.depositToWithdraw);
        int iHashCode14 = Boolean.hashCode(this.allowManualAddition);
        AccountResponseBean accountResponseBean = this.account;
        int iHashCode15 = accountResponseBean == null ? 0 : accountResponseBean.hashCode();
        String str = this.quoteCurrency;
        int iHashCode16 = str == null ? 0 : str.hashCode();
        int iHashCode17 = this.price.hashCode();
        int iHashCode18 = this.publicTradingOrderId.hashCode();
        List<SellerReceiptAccountResponseBean> list2 = this.sellerReceiptAccountList;
        int iHashCode19 = list2 == null ? 0 : list2.hashCode();
        int iHashCode20 = Boolean.hashCode(this.bestOption);
        int iHashCode21 = this.finalPriceForDisplay.hashCode();
        int iHashCode22 = Boolean.hashCode(this.isSelected);
        SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean = this.selectedSellerReceiptAccount;
        int iHashCode23 = sellerReceiptAccountResponseBean == null ? 0 : sellerReceiptAccountResponseBean.hashCode();
        int iHashCode24 = this.depositPlatformCode.hashCode();
        int iHashCode25 = this.deepLink.hashCode();
        int iHashCode26 = this.storeUrl.hashCode();
        int iHashCode27 = Boolean.hashCode(this.showTransfer);
        List<AccountResponseBean> list3 = this.accounts;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + (list3 == null ? 0 : list3.hashCode())) * 31) + Integer.hashCode(this.numOfRecurringPlans);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccount(AccountResponseBean accountResponseBean) {
        this.account = accountResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccounts(List<AccountResponseBean> list) {
        this.accounts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackgroundColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.backgroundColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBestOption(boolean z) {
        this.bestOption = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeepLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDepositPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.depositPlatformCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.description = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFinalPriceForDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.finalPriceForDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iconUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIconUrlNight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.iconUrlNight = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMainColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mainColor = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNumOfRecurringPlans(int i) {
        this.numOfRecurringPlans = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPayment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.payment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethod = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymentMethodType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymentMethodType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPublicTradingOrderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.publicTradingOrderId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCurrency(String str) {
        this.quoteCurrency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelectedSellerReceiptAccount(SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean) {
        this.selectedSellerReceiptAccount = sellerReceiptAccountResponseBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellerReceiptAccountList(List<SellerReceiptAccountResponseBean> list) {
        this.sellerReceiptAccountList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTransfer(boolean z) {
        this.showTransfer = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStoreUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.storeUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedTransactionType(List<String> list) {
        this.supportedTransactionType = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaymentMethodResponseBean(payment=" + this.payment + ", description=" + this.description + ", backgroundColor=" + this.backgroundColor + ", iconUrl=" + this.iconUrl + ", iconUrlNight=" + this.iconUrlNight + ", mainColor=" + this.mainColor + ", paymentCurrency=" + this.paymentCurrency + ", paymentMethodType=" + this.paymentMethodType + ", paymentMethodId=" + this.paymentMethodId + ", paymentMethod=" + this.paymentMethod + ", supportedTransactionType=" + this.supportedTransactionType + ", baseAmount=" + this.baseAmount + ", depositToWithdraw=" + this.depositToWithdraw + ", allowManualAddition=" + this.allowManualAddition + ", account=" + this.account + ", quoteCurrency=" + this.quoteCurrency + ", price=" + this.price + ", publicTradingOrderId=" + this.publicTradingOrderId + ", sellerReceiptAccountList=" + this.sellerReceiptAccountList + ", bestOption=" + this.bestOption + ", finalPriceForDisplay=" + this.finalPriceForDisplay + ", isSelected=" + this.isSelected + ", selectedSellerReceiptAccount=" + this.selectedSellerReceiptAccount + ", depositPlatformCode=" + this.depositPlatformCode + ", deepLink=" + this.deepLink + ", storeUrl=" + this.storeUrl + ", showTransfer=" + this.showTransfer + ", accounts=" + this.accounts + ", numOfRecurringPlans=" + this.numOfRecurringPlans + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.payment);
        parcel.writeString(this.description);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.iconUrlNight);
        parcel.writeString(this.mainColor);
        parcel.writeString(this.paymentCurrency);
        parcel.writeString(this.paymentMethodType);
        parcel.writeString(this.paymentMethodId);
        parcel.writeString(this.paymentMethod);
        parcel.writeStringList(this.supportedTransactionType);
        parcel.writeString(this.baseAmount);
        parcel.writeInt(this.depositToWithdraw ? 1 : 0);
        parcel.writeInt(this.allowManualAddition ? 1 : 0);
        AccountResponseBean accountResponseBean = this.account;
        if (accountResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            accountResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.quoteCurrency);
        parcel.writeString(this.price);
        parcel.writeString(this.publicTradingOrderId);
        List<SellerReceiptAccountResponseBean> list = this.sellerReceiptAccountList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SellerReceiptAccountResponseBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.bestOption ? 1 : 0);
        parcel.writeString(this.finalPriceForDisplay);
        parcel.writeInt(this.isSelected ? 1 : 0);
        SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean = this.selectedSellerReceiptAccount;
        if (sellerReceiptAccountResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerReceiptAccountResponseBean.writeToParcel(parcel, i);
        }
        parcel.writeString(this.depositPlatformCode);
        parcel.writeString(this.deepLink);
        parcel.writeString(this.storeUrl);
        parcel.writeInt(this.showTransfer ? 1 : 0);
        List<AccountResponseBean> list2 = this.accounts;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<AccountResponseBean> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.numOfRecurringPlans);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaymentMethodResponseBean> serializer() {
            return PaymentMethodResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaymentMethodResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, boolean z, boolean z2, AccountResponseBean accountResponseBean, String str12, String str13, String str14, List list2, boolean z3, String str15, boolean z4, SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, String str16, String str17, String str18, boolean z5, List list3, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.payment = "";
        } else {
            this.payment = str;
        }
        if ((i & 2) == 0) {
            this.description = "";
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.backgroundColor = "";
        } else {
            this.backgroundColor = str3;
        }
        if ((i & 8) == 0) {
            this.iconUrl = "";
        } else {
            this.iconUrl = str4;
        }
        if ((i & 16) == 0) {
            this.iconUrlNight = "";
        } else {
            this.iconUrlNight = str5;
        }
        if ((i & 32) == 0) {
            this.mainColor = "";
        } else {
            this.mainColor = str6;
        }
        if ((i & 64) == 0) {
            this.paymentCurrency = "";
        } else {
            this.paymentCurrency = str7;
        }
        if ((i & 128) == 0) {
            this.paymentMethodType = "";
        } else {
            this.paymentMethodType = str8;
        }
        if ((i & 256) == 0) {
            this.paymentMethodId = "";
        } else {
            this.paymentMethodId = str9;
        }
        if ((i & 512) == 0) {
            this.paymentMethod = "";
        } else {
            this.paymentMethod = str10;
        }
        if ((i & 1024) == 0) {
            this.supportedTransactionType = null;
        } else {
            this.supportedTransactionType = list;
        }
        if ((i & 2048) == 0) {
            this.baseAmount = "";
        } else {
            this.baseAmount = str11;
        }
        this.depositToWithdraw = (i & 4096) == 0 ? true : z;
        if ((i & 8192) == 0) {
            this.allowManualAddition = false;
        } else {
            this.allowManualAddition = z2;
        }
        if ((i & 16384) == 0) {
            this.account = null;
        } else {
            this.account = accountResponseBean;
        }
        if ((32768 & i) == 0) {
            this.quoteCurrency = null;
        } else {
            this.quoteCurrency = str12;
        }
        if ((65536 & i) == 0) {
            this.price = "";
        } else {
            this.price = str13;
        }
        if ((131072 & i) == 0) {
            this.publicTradingOrderId = "";
        } else {
            this.publicTradingOrderId = str14;
        }
        if ((262144 & i) == 0) {
            this.sellerReceiptAccountList = null;
        } else {
            this.sellerReceiptAccountList = list2;
        }
        if ((524288 & i) == 0) {
            this.bestOption = false;
        } else {
            this.bestOption = z3;
        }
        if ((1048576 & i) == 0) {
            this.finalPriceForDisplay = "";
        } else {
            this.finalPriceForDisplay = str15;
        }
        if ((2097152 & i) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z4;
        }
        if ((4194304 & i) == 0) {
            this.selectedSellerReceiptAccount = null;
        } else {
            this.selectedSellerReceiptAccount = sellerReceiptAccountResponseBean;
        }
        if ((8388608 & i) == 0) {
            this.depositPlatformCode = "";
        } else {
            this.depositPlatformCode = str16;
        }
        if ((16777216 & i) == 0) {
            this.deepLink = "";
        } else {
            this.deepLink = str17;
        }
        if ((33554432 & i) == 0) {
            this.storeUrl = "";
        } else {
            this.storeUrl = str18;
        }
        if ((67108864 & i) == 0) {
            this.showTransfer = false;
        } else {
            this.showTransfer = z5;
        }
        if ((134217728 & i) == 0) {
            this.accounts = null;
        } else {
            this.accounts = list3;
        }
        if ((i & 268435456) == 0) {
            this.numOfRecurringPlans = 0;
        } else {
            this.numOfRecurringPlans = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(PaymentMethodResponseBean paymentMethodResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.payment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, paymentMethodResponseBean.payment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, paymentMethodResponseBean.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.backgroundColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, paymentMethodResponseBean.backgroundColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.iconUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, paymentMethodResponseBean.iconUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.iconUrlNight, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, paymentMethodResponseBean.iconUrlNight);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.mainColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, paymentMethodResponseBean.mainColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.paymentCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, paymentMethodResponseBean.paymentCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.paymentMethodType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, paymentMethodResponseBean.paymentMethodType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.paymentMethodId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, paymentMethodResponseBean.paymentMethodId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.paymentMethod, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, paymentMethodResponseBean.paymentMethod);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || paymentMethodResponseBean.supportedTransactionType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], paymentMethodResponseBean.supportedTransactionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.baseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, paymentMethodResponseBean.baseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !paymentMethodResponseBean.depositToWithdraw) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, paymentMethodResponseBean.depositToWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || paymentMethodResponseBean.allowManualAddition) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, paymentMethodResponseBean.allowManualAddition);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || paymentMethodResponseBean.account != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, AccountResponseBean$$serializer.INSTANCE, paymentMethodResponseBean.account);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || paymentMethodResponseBean.quoteCurrency != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, paymentMethodResponseBean.quoteCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, paymentMethodResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.publicTradingOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, paymentMethodResponseBean.publicTradingOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || paymentMethodResponseBean.sellerReceiptAccountList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, kSerializerArr[18], paymentMethodResponseBean.sellerReceiptAccountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || paymentMethodResponseBean.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 19, paymentMethodResponseBean.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.finalPriceForDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, paymentMethodResponseBean.finalPriceForDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || paymentMethodResponseBean.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 21, paymentMethodResponseBean.isSelected);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || paymentMethodResponseBean.selectedSellerReceiptAccount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, SellerReceiptAccountResponseBean$$serializer.INSTANCE, paymentMethodResponseBean.selectedSellerReceiptAccount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.depositPlatformCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, paymentMethodResponseBean.depositPlatformCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.deepLink, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, paymentMethodResponseBean.deepLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) paymentMethodResponseBean.storeUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, paymentMethodResponseBean.storeUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || paymentMethodResponseBean.showTransfer) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 26, paymentMethodResponseBean.showTransfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || paymentMethodResponseBean.accounts != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], paymentMethodResponseBean.accounts);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) && paymentMethodResponseBean.numOfRecurringPlans == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 28, paymentMethodResponseBean.numOfRecurringPlans);
    }

    public PaymentMethodResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, List<String> list, @NotNull String str11, boolean z, boolean z2, AccountResponseBean accountResponseBean, String str12, @NotNull String str13, @NotNull String str14, List<SellerReceiptAccountResponseBean> list2, boolean z3, @NotNull String str15, boolean z4, SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, @NotNull String str16, @NotNull String str17, @NotNull String str18, boolean z5, List<AccountResponseBean> list3, int i) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        this.payment = str;
        this.description = str2;
        this.backgroundColor = str3;
        this.iconUrl = str4;
        this.iconUrlNight = str5;
        this.mainColor = str6;
        this.paymentCurrency = str7;
        this.paymentMethodType = str8;
        this.paymentMethodId = str9;
        this.paymentMethod = str10;
        this.supportedTransactionType = list;
        this.baseAmount = str11;
        this.depositToWithdraw = z;
        this.allowManualAddition = z2;
        this.account = accountResponseBean;
        this.quoteCurrency = str12;
        this.price = str13;
        this.publicTradingOrderId = str14;
        this.sellerReceiptAccountList = list2;
        this.bestOption = z3;
        this.finalPriceForDisplay = str15;
        this.isSelected = z4;
        this.selectedSellerReceiptAccount = sellerReceiptAccountResponseBean;
        this.depositPlatformCode = str16;
        this.deepLink = str17;
        this.storeUrl = str18;
        this.showTransfer = z5;
        this.accounts = list3;
        this.numOfRecurringPlans = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0156: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r61v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r61v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r61v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r61v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r61v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r61v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r61v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r61v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r61v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r61v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0054: ARITH (r61v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r42v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r61v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r61v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r44v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r61v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r45v0 boolean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean:?: TERNARY null = ((wrap:int:0x0079: ARITH (r61v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean) : (r46v0 com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r61v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r61v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (r61v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a5: ARITH (r61v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r50v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b0: ARITH (r61v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r51v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bb: ARITH (r61v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r61v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean:?: TERNARY null = ((wrap:int:0x00d1: ARITH (r61v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean) : (r54v0 com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r61v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e7: ARITH (r61v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f2: ARITH (r61v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00fd: ARITH (r61v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0108: ARITH (r61v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r59v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0113: ARITH (r61v0 int) & (268435456 int) A[WRAPPED]) == (0 int)) ? (r60v0 int) : (0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean>, boolean, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean>, int):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.PaymentMethodResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, boolean, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.AccountResponseBean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, boolean, com.okinc.crcore.coreapi.net.responsebean.bsc.SellerReceiptAccountResponseBean, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, int):void type: THIS */
    public /* synthetic */ PaymentMethodResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, boolean z, boolean z2, AccountResponseBean accountResponseBean, String str12, String str13, String str14, List list2, boolean z3, String str15, boolean z4, SellerReceiptAccountResponseBean sellerReceiptAccountResponseBean, String str16, String str17, String str18, boolean z5, List list3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) != 0 ? "" : str10, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? "" : str11, (i2 & 4096) != 0 ? true : z, (i2 & 8192) != 0 ? false : z2, (i2 & 16384) != 0 ? null : accountResponseBean, (i2 & 32768) != 0 ? null : str12, (i2 & 65536) != 0 ? "" : str13, (i2 & 131072) != 0 ? "" : str14, (i2 & 262144) != 0 ? null : list2, (i2 & 524288) != 0 ? false : z3, (i2 & 1048576) != 0 ? "" : str15, (i2 & 2097152) != 0 ? false : z4, (i2 & 4194304) != 0 ? null : sellerReceiptAccountResponseBean, (i2 & 8388608) != 0 ? "" : str16, (i2 & 16777216) != 0 ? "" : str17, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str18, (i2 & 67108864) != 0 ? false : z5, (i2 & 134217728) != 0 ? null : list3, (i2 & 268435456) == 0 ? i : 0);
    }
}
