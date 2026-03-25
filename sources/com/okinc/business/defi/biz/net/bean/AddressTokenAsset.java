package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class AddressTokenAsset implements Parcelable {
    private final String coinAmount;
    private final String coinAmountOrigin;
    private final List<AddressCoinBalanceDetail> coinBalanceDetails;
    private final String currencyAmount;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final Boolean f76default;
    private final String imageUrl;
    private final String name;
    private final Integer rank;
    private final Integer subBalanceType;
    private final String symbol;
    private final Boolean voucherToken;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressTokenAsset> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(AddressCoinBalanceDetail$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AddressTokenAsset> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTokenAsset createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(AddressCoinBalanceDetail.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AddressTokenAsset(string, string2, string3, string4, numValueOf, numValueOf2, string5, string6, boolValueOf, boolValueOf2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressTokenAsset[] newArray(int i) {
            return new AddressTokenAsset[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressTokenAsset() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.f76default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCoinBalanceDetail> component11() {
        return this.coinBalanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.subBalanceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressTokenAsset copy(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, List<AddressCoinBalanceDetail> list) {
        return new AddressTokenAsset(str, str2, str3, str4, num, num2, str5, str6, bool, bool2, list);
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
        if (!(obj instanceof AddressTokenAsset)) {
            return false;
        }
        AddressTokenAsset addressTokenAsset = (AddressTokenAsset) obj;
        return Intrinsics.EZpvd((Object) this.coinAmount, (Object) addressTokenAsset.coinAmount) && Intrinsics.EZpvd((Object) this.coinAmountOrigin, (Object) addressTokenAsset.coinAmountOrigin) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) addressTokenAsset.currencyAmount) && Intrinsics.EZpvd((Object) this.symbol, (Object) addressTokenAsset.symbol) && Intrinsics.EZpvd(this.subBalanceType, addressTokenAsset.subBalanceType) && Intrinsics.EZpvd(this.rank, addressTokenAsset.rank) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) addressTokenAsset.imageUrl) && Intrinsics.EZpvd((Object) this.name, (Object) addressTokenAsset.name) && Intrinsics.EZpvd(this.voucherToken, addressTokenAsset.voucherToken) && Intrinsics.EZpvd(this.f76default, addressTokenAsset.f76default) && Intrinsics.EZpvd(this.coinBalanceDetails, addressTokenAsset.coinBalanceDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmountOrigin() {
        return this.coinAmountOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressCoinBalanceDetail> getCoinBalanceDetails() {
        return this.coinBalanceDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDefault() {
        return this.f76default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubBalanceType() {
        return this.subBalanceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getVoucherToken() {
        return this.voucherToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coinAmountOrigin;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currencyAmount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.symbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.subBalanceType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        Integer num2 = this.rank;
        int iHashCode6 = num2 == null ? 0 : num2.hashCode();
        String str5 = this.imageUrl;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.name;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        Boolean bool = this.voucherToken;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.f76default;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        List<AddressCoinBalanceDetail> list = this.coinBalanceDetails;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressTokenAsset(coinAmount=" + this.coinAmount + ", coinAmountOrigin=" + this.coinAmountOrigin + ", currencyAmount=" + this.currencyAmount + ", symbol=" + this.symbol + ", subBalanceType=" + this.subBalanceType + ", rank=" + this.rank + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", voucherToken=" + this.voucherToken + ", default=" + this.f76default + ", coinBalanceDetails=" + this.coinBalanceDetails + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.coinAmountOrigin);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.symbol);
        Integer num = this.subBalanceType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.rank;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.name);
        Boolean bool = this.voucherToken;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.f76default;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<AddressCoinBalanceDetail> list = this.coinBalanceDetails;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<AddressCoinBalanceDetail> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.AddressTokenAsset.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AddressTokenAsset> serializer() {
            return AddressTokenAsset$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AddressTokenAsset(int i, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str;
        }
        if ((i & 2) == 0) {
            this.coinAmountOrigin = "";
        } else {
            this.coinAmountOrigin = str2;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str3;
        }
        if ((i & 8) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str4;
        }
        if ((i & 16) == 0) {
            this.subBalanceType = 0;
        } else {
            this.subBalanceType = num;
        }
        if ((i & 32) == 0) {
            this.rank = 0;
        } else {
            this.rank = num2;
        }
        if ((i & 64) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str5;
        }
        if ((i & 128) == 0) {
            this.name = "";
        } else {
            this.name = str6;
        }
        if ((i & 256) == 0) {
            this.voucherToken = Boolean.FALSE;
        } else {
            this.voucherToken = bool;
        }
        if ((i & 512) == 0) {
            this.f76default = Boolean.FALSE;
        } else {
            this.f76default = bool2;
        }
        if ((i & 1024) == 0) {
            this.coinBalanceDetails = yDY.AhwBna();
        } else {
            this.coinBalanceDetails = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressTokenAsset addressTokenAsset, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) addressTokenAsset.coinAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, addressTokenAsset.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) addressTokenAsset.coinAmountOrigin, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, addressTokenAsset.coinAmountOrigin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) addressTokenAsset.currencyAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, addressTokenAsset.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) addressTokenAsset.symbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, addressTokenAsset.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num2 = addressTokenAsset.subBalanceType) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, addressTokenAsset.subBalanceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || (num = addressTokenAsset.rank) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, addressTokenAsset.rank);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) addressTokenAsset.imageUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, addressTokenAsset.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) addressTokenAsset.name, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, addressTokenAsset.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(addressTokenAsset.voucherToken, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, addressTokenAsset.voucherToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(addressTokenAsset.f76default, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, addressTokenAsset.f76default);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(addressTokenAsset.coinBalanceDetails, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], addressTokenAsset.coinBalanceDetails);
    }

    public AddressTokenAsset(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, List<AddressCoinBalanceDetail> list) {
        this.coinAmount = str;
        this.coinAmountOrigin = str2;
        this.currencyAmount = str3;
        this.symbol = str4;
        this.subBalanceType = num;
        this.rank = num2;
        this.imageUrl = str5;
        this.name = str6;
        this.voucherToken = bool;
        this.f76default = bool2;
        this.coinBalanceDetails = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0077: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0020: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002c: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r17v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r23v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0058: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1720)) : (r22v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.business.defi.biz.net.bean.AddressCoinBalanceDetail>):void (m)] (LINE:1709) call: com.okinc.business.defi.biz.net.bean.AddressTokenAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ AddressTokenAsset(String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, String str6, Boolean bool, Boolean bool2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0 : num, (i & 32) != 0 ? 0 : num2, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "", (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? yDY.AhwBna() : list);
    }
}
