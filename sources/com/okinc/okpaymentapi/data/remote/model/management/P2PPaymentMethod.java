package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class P2PPaymentMethod implements Parcelable {
    private final String amount;
    private final String baseCurrency;
    private final boolean bestOption;
    private final String convertBaseAmount;
    private final String description;
    private final boolean isSelected;
    private final String mainColor;
    private final String orderTotal;
    private final String payment;
    private final String price;
    private final String publicTradingOrderId;
    private final String quoteAmount;
    private final String receipt;
    private final ArrayList<SellerReceiptAccount> sellerReceiptAccountList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<P2PPaymentMethod> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(SellerReceiptAccount$$serializer.INSTANCE), null, null};

    public static final class Creator implements Parcelable.Creator<P2PPaymentMethod> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final P2PPaymentMethod createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(SellerReceiptAccount.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new P2PPaymentMethod(string, string2, z, string3, string4, string5, string6, string7, string8, string9, string10, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final P2PPaymentMethod[] newArray(int i) {
            return new P2PPaymentMethod[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public P2PPaymentMethod() {
        this((String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.publicTradingOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.receipt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SellerReceiptAccount> component12() {
        return this.sellerReceiptAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mainColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.payment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final P2PPaymentMethod copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, ArrayList<SellerReceiptAccount> arrayList, @NotNull String str11, boolean z2) {
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
        return new P2PPaymentMethod(str, str2, z, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, str11, z2);
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
        if (!(obj instanceof P2PPaymentMethod)) {
            return false;
        }
        P2PPaymentMethod p2PPaymentMethod = (P2PPaymentMethod) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) p2PPaymentMethod.amount) && Intrinsics.EZpvd((Object) this.baseCurrency, (Object) p2PPaymentMethod.baseCurrency) && this.bestOption == p2PPaymentMethod.bestOption && Intrinsics.EZpvd((Object) this.convertBaseAmount, (Object) p2PPaymentMethod.convertBaseAmount) && Intrinsics.EZpvd((Object) this.description, (Object) p2PPaymentMethod.description) && Intrinsics.EZpvd((Object) this.mainColor, (Object) p2PPaymentMethod.mainColor) && Intrinsics.EZpvd((Object) this.orderTotal, (Object) p2PPaymentMethod.orderTotal) && Intrinsics.EZpvd((Object) this.payment, (Object) p2PPaymentMethod.payment) && Intrinsics.EZpvd((Object) this.price, (Object) p2PPaymentMethod.price) && Intrinsics.EZpvd((Object) this.publicTradingOrderId, (Object) p2PPaymentMethod.publicTradingOrderId) && Intrinsics.EZpvd((Object) this.receipt, (Object) p2PPaymentMethod.receipt) && Intrinsics.EZpvd(this.sellerReceiptAccountList, p2PPaymentMethod.sellerReceiptAccountList) && Intrinsics.EZpvd((Object) this.quoteAmount, (Object) p2PPaymentMethod.quoteAmount) && this.isSelected == p2PPaymentMethod.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBestOption() {
        return this.bestOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConvertBaseAmount() {
        return this.convertBaseAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMainColor() {
        return this.mainColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderTotal() {
        return this.orderTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayment() {
        return this.payment;
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
    public final String getQuoteAmount() {
        return this.quoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceipt() {
        return this.receipt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SellerReceiptAccount> getSellerReceiptAccountList() {
        return this.sellerReceiptAccountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        int iHashCode2 = this.baseCurrency.hashCode();
        int iHashCode3 = Boolean.hashCode(this.bestOption);
        int iHashCode4 = this.convertBaseAmount.hashCode();
        int iHashCode5 = this.description.hashCode();
        int iHashCode6 = this.mainColor.hashCode();
        int iHashCode7 = this.orderTotal.hashCode();
        int iHashCode8 = this.payment.hashCode();
        int iHashCode9 = this.price.hashCode();
        int iHashCode10 = this.publicTradingOrderId.hashCode();
        int iHashCode11 = this.receipt.hashCode();
        ArrayList<SellerReceiptAccount> arrayList = this.sellerReceiptAccountList;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.quoteAmount.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "P2PPaymentMethod(amount=" + this.amount + ", baseCurrency=" + this.baseCurrency + ", bestOption=" + this.bestOption + ", convertBaseAmount=" + this.convertBaseAmount + ", description=" + this.description + ", mainColor=" + this.mainColor + ", orderTotal=" + this.orderTotal + ", payment=" + this.payment + ", price=" + this.price + ", publicTradingOrderId=" + this.publicTradingOrderId + ", receipt=" + this.receipt + ", sellerReceiptAccountList=" + this.sellerReceiptAccountList + ", quoteAmount=" + this.quoteAmount + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.amount);
        parcel.writeString(this.baseCurrency);
        parcel.writeInt(this.bestOption ? 1 : 0);
        parcel.writeString(this.convertBaseAmount);
        parcel.writeString(this.description);
        parcel.writeString(this.mainColor);
        parcel.writeString(this.orderTotal);
        parcel.writeString(this.payment);
        parcel.writeString(this.price);
        parcel.writeString(this.publicTradingOrderId);
        parcel.writeString(this.receipt);
        ArrayList<SellerReceiptAccount> arrayList = this.sellerReceiptAccountList;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<SellerReceiptAccount> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.quoteAmount);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.P2PPaymentMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<P2PPaymentMethod> serializer() {
            return P2PPaymentMethod$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ P2PPaymentMethod(int i, String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.baseCurrency = "";
        } else {
            this.baseCurrency = str2;
        }
        if ((i & 4) == 0) {
            this.bestOption = false;
        } else {
            this.bestOption = z;
        }
        if ((i & 8) == 0) {
            this.convertBaseAmount = "";
        } else {
            this.convertBaseAmount = str3;
        }
        if ((i & 16) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 32) == 0) {
            this.mainColor = "";
        } else {
            this.mainColor = str5;
        }
        if ((i & 64) == 0) {
            this.orderTotal = "";
        } else {
            this.orderTotal = str6;
        }
        if ((i & 128) == 0) {
            this.payment = "";
        } else {
            this.payment = str7;
        }
        if ((i & 256) == 0) {
            this.price = "";
        } else {
            this.price = str8;
        }
        if ((i & 512) == 0) {
            this.publicTradingOrderId = "";
        } else {
            this.publicTradingOrderId = str9;
        }
        if ((i & 1024) == 0) {
            this.receipt = "";
        } else {
            this.receipt = str10;
        }
        this.sellerReceiptAccountList = (i & 2048) == 0 ? null : arrayList;
        if ((i & 4096) == 0) {
            this.quoteAmount = "";
        } else {
            this.quoteAmount = str11;
        }
        if ((i & 8192) == 0) {
            this.isSelected = false;
        } else {
            this.isSelected = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(P2PPaymentMethod p2PPaymentMethod, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, p2PPaymentMethod.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.baseCurrency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, p2PPaymentMethod.baseCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || p2PPaymentMethod.bestOption) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, p2PPaymentMethod.bestOption);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.convertBaseAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, p2PPaymentMethod.convertBaseAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.description, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, p2PPaymentMethod.description);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.mainColor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, p2PPaymentMethod.mainColor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.orderTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, p2PPaymentMethod.orderTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.payment, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, p2PPaymentMethod.payment);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, p2PPaymentMethod.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.publicTradingOrderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, p2PPaymentMethod.publicTradingOrderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.receipt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, p2PPaymentMethod.receipt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || p2PPaymentMethod.sellerReceiptAccountList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], p2PPaymentMethod.sellerReceiptAccountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) p2PPaymentMethod.quoteAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, p2PPaymentMethod.quoteAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || p2PPaymentMethod.isSelected) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, p2PPaymentMethod.isSelected);
        }
    }

    public P2PPaymentMethod(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, ArrayList<SellerReceiptAccount> arrayList, @NotNull String str11, boolean z2) {
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
        this.amount = str;
        this.baseCurrency = str2;
        this.bestOption = z;
        this.convertBaseAmount = str3;
        this.description = str4;
        this.mainColor = str5;
        this.orderTotal = str6;
        this.payment = str7;
        this.price = str8;
        this.publicTradingOrderId = str9;
        this.receipt = str10;
        this.sellerReceiptAccountList = arrayList;
        this.quoteAmount = str11;
        this.isSelected = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x005d: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r28v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.okpaymentapi.data.remote.model.management.SellerReceiptAccount>, java.lang.String, boolean):void (m)] (LINE:419) call: com.okinc.okpaymentapi.data.remote.model.management.P2PPaymentMethod.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ P2PPaymentMethod(String str, String str2, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList arrayList, String str11, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? null : arrayList, (i & 4096) == 0 ? str11 : "", (i & 8192) == 0 ? z2 : false);
    }
}
