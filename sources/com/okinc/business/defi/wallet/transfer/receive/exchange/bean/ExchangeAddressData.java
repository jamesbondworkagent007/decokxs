package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class ExchangeAddressData implements Parcelable {
    private final Integer currencyId;
    private final String depositLimit;
    private final List<AddressBean> exChangeAddressList;
    private final Boolean isExchangeSupport;
    private final Integer subCurrencyId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeAddressData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(ExchangeAddressData$AddressBean$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<ExchangeAddressData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeAddressData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AddressBean.CREATOR.createFromParcel(parcel));
                }
            }
            return new ExchangeAddressData(numValueOf, numValueOf2, string, arrayList, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeAddressData[] newArray(int i) {
            return new ExchangeAddressData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExchangeAddressData copy$default(ExchangeAddressData exchangeAddressData, Integer num, Integer num2, String str, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            num = exchangeAddressData.currencyId;
        }
        if ((i & 2) != 0) {
            num2 = exchangeAddressData.subCurrencyId;
        }
        Integer num3 = num2;
        if ((i & 4) != 0) {
            str = exchangeAddressData.depositLimit;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = exchangeAddressData.exChangeAddressList;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            bool = exchangeAddressData.isExchangeSupport;
        }
        return exchangeAddressData.copy(num, num3, str2, list2, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressBean> component4() {
        return this.exChangeAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.isExchangeSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeAddressData copy(Integer num, Integer num2, String str, List<AddressBean> list, Boolean bool) {
        return new ExchangeAddressData(num, num2, str, list, bool);
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
        if (!(obj instanceof ExchangeAddressData)) {
            return false;
        }
        ExchangeAddressData exchangeAddressData = (ExchangeAddressData) obj;
        return Intrinsics.EZpvd(this.currencyId, exchangeAddressData.currencyId) && Intrinsics.EZpvd(this.subCurrencyId, exchangeAddressData.subCurrencyId) && Intrinsics.EZpvd((Object) this.depositLimit, (Object) exchangeAddressData.depositLimit) && Intrinsics.EZpvd(this.exChangeAddressList, exchangeAddressData.exChangeAddressList) && Intrinsics.EZpvd(this.isExchangeSupport, exchangeAddressData.isExchangeSupport);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepositLimit() {
        return this.depositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AddressBean> getExChangeAddressList() {
        return this.exChangeAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.currencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.subCurrencyId;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        String str = this.depositLimit;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<AddressBean> list = this.exChangeAddressList;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isExchangeSupport;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isExchangeSupport() {
        return this.isExchangeSupport;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeAddressData(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", depositLimit=" + this.depositLimit + ", exChangeAddressList=" + this.exChangeAddressList + ", isExchangeSupport=" + this.isExchangeSupport + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subCurrencyId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.depositLimit);
        List<AddressBean> list = this.exChangeAddressList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<AddressBean> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isExchangeSupport;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeAddressData> serializer() {
            return ExchangeAddressData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeAddressData(int i, Integer num, Integer num2, String str, List list, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (11 != (i & 11)) {
            PluginExceptionsKt.throwMissingFieldException(i, 11, ExchangeAddressData$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyId = num;
        this.subCurrencyId = num2;
        if ((i & 4) == 0) {
            this.depositLimit = "0";
        } else {
            this.depositLimit = str;
        }
        this.exChangeAddressList = list;
        if ((i & 16) == 0) {
            this.isExchangeSupport = Boolean.FALSE;
        } else {
            this.isExchangeSupport = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ExchangeAddressData exchangeAddressData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, intSerializer, exchangeAddressData.currencyId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, intSerializer, exchangeAddressData.subCurrencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) exchangeAddressData.depositLimit, (Object) "0")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, exchangeAddressData.depositLimit);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], exchangeAddressData.exChangeAddressList);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(exchangeAddressData.isExchangeSupport, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, exchangeAddressData.isExchangeSupport);
    }

    public ExchangeAddressData(Integer num, Integer num2, String str, List<AddressBean> list, Boolean bool) {
        this.currencyId = num;
        this.subCurrencyId = num2;
        this.depositLimit = str;
        this.exChangeAddressList = list;
        this.isExchangeSupport = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r7v0 java.lang.Integer)
  (r8v0 java.lang.Integer)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0") : (r9v0 java.lang.String))
  (r10v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000b: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r11v0 java.lang.Boolean))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData$AddressBean>, java.lang.Boolean):void (m)] (LINE:51) call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.util.List, java.lang.Boolean):void type: THIS */
    public /* synthetic */ ExchangeAddressData(Integer num, Integer num2, String str, List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, (i & 4) != 0 ? "0" : str, list, (i & 16) != 0 ? Boolean.FALSE : bool);
    }

    @Serializable
    public static final class AddressBean implements Parcelable {
        public static final int $stable = 0;
        private final String address;
        private final String memo;
        private final String tag;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<AddressBean> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<AddressBean> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressBean createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AddressBean(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressBean[] newArray(int i) {
                return new AddressBean[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AddressBean copy$default(AddressBean addressBean, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addressBean.address;
            }
            if ((i & 2) != 0) {
                str2 = addressBean.tag;
            }
            if ((i & 4) != 0) {
                str3 = addressBean.memo;
            }
            return addressBean.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.memo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddressBean copy(String str, String str2, String str3) {
            return new AddressBean(str, str2, str3);
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
            if (!(obj instanceof AddressBean)) {
                return false;
            }
            AddressBean addressBean = (AddressBean) obj;
            return Intrinsics.EZpvd((Object) this.address, (Object) addressBean.address) && Intrinsics.EZpvd((Object) this.tag, (Object) addressBean.tag) && Intrinsics.EZpvd((Object) this.memo, (Object) addressBean.memo);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMemo() {
            return this.memo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTag() {
            return this.tag;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.address;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.tag;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.memo;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddressBean(address=" + this.address + ", tag=" + this.tag + ", memo=" + this.memo + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.address);
            parcel.writeString(this.tag);
            parcel.writeString(this.memo);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData.AddressBean.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<AddressBean> serializer() {
                return ExchangeAddressData$AddressBean$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ AddressBean(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                PluginExceptionsKt.throwMissingFieldException(i, 7, ExchangeAddressData$AddressBean$$serializer.INSTANCE.getDescriptor());
            }
            this.address = str;
            this.tag = str2;
            this.memo = str3;
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AddressBean addressBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, addressBean.address);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, addressBean.tag);
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, addressBean.memo);
        }

        public AddressBean(String str, String str2, String str3) {
            this.address = str;
            this.tag = str2;
            this.memo = str3;
        }
    }
}
