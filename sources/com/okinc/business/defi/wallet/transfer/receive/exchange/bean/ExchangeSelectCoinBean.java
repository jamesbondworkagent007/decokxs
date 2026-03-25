package com.okinc.business.defi.wallet.transfer.receive.exchange.bean;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class ExchangeSelectCoinBean implements Parcelable {
    private final String balance;
    private final String baseCurrencySymbol;
    private final String currency;
    private final Integer currencyId;
    private final String fullName;
    private final String icon;
    private final Boolean isSupportWallet;
    private final ArrayList<AssetWalletNetwork> networks;
    private final String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ExchangeSelectCoinBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(AssetWalletNetwork$$serializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ExchangeSelectCoinBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeSelectCoinBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(AssetWalletNetwork.CREATOR.createFromParcel(parcel));
                }
            }
            return new ExchangeSelectCoinBean(string, string2, string3, string4, string5, numValueOf, boolValueOf, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeSelectCoinBean[] newArray(int i) {
            return new ExchangeSelectCoinBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.isSupportWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetWalletNetwork> component8() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeSelectCoinBean copy(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, ArrayList<AssetWalletNetwork> arrayList, String str6) {
        return new ExchangeSelectCoinBean(str, str2, str3, str4, str5, num, bool, arrayList, str6);
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
        if (!(obj instanceof ExchangeSelectCoinBean)) {
            return false;
        }
        ExchangeSelectCoinBean exchangeSelectCoinBean = (ExchangeSelectCoinBean) obj;
        return Intrinsics.EZpvd((Object) this.icon, (Object) exchangeSelectCoinBean.icon) && Intrinsics.EZpvd((Object) this.currency, (Object) exchangeSelectCoinBean.currency) && Intrinsics.EZpvd((Object) this.fullName, (Object) exchangeSelectCoinBean.fullName) && Intrinsics.EZpvd((Object) this.balance, (Object) exchangeSelectCoinBean.balance) && Intrinsics.EZpvd((Object) this.valuation, (Object) exchangeSelectCoinBean.valuation) && Intrinsics.EZpvd(this.currencyId, exchangeSelectCoinBean.currencyId) && Intrinsics.EZpvd(this.isSupportWallet, exchangeSelectCoinBean.isSupportWallet) && Intrinsics.EZpvd(this.networks, exchangeSelectCoinBean.networks) && Intrinsics.EZpvd((Object) this.baseCurrencySymbol, (Object) exchangeSelectCoinBean.baseCurrencySymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCurrencySymbol() {
        return this.baseCurrencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AssetWalletNetwork> getNetworks() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fullName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.balance;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.valuation;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.currencyId;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Boolean bool = this.isSupportWallet;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        ArrayList<AssetWalletNetwork> arrayList = this.networks;
        int iHashCode8 = arrayList == null ? 0 : arrayList.hashCode();
        String str6 = this.baseCurrencySymbol;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSupportWallet() {
        return this.isSupportWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeSelectCoinBean(icon=" + this.icon + ", currency=" + this.currency + ", fullName=" + this.fullName + ", balance=" + this.balance + ", valuation=" + this.valuation + ", currencyId=" + this.currencyId + ", isSupportWallet=" + this.isSupportWallet + ", networks=" + this.networks + ", baseCurrencySymbol=" + this.baseCurrencySymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.icon);
        parcel.writeString(this.currency);
        parcel.writeString(this.fullName);
        parcel.writeString(this.balance);
        parcel.writeString(this.valuation);
        Integer num = this.currencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.isSupportWallet;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ArrayList<AssetWalletNetwork> arrayList = this.networks;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<AssetWalletNetwork> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.baseCurrencySymbol);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ExchangeSelectCoinBean> serializer() {
            return ExchangeSelectCoinBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ExchangeSelectCoinBean(int i, String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, ArrayList arrayList, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ExchangeSelectCoinBean$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.currency = str2;
        this.fullName = str3;
        this.balance = str4;
        this.valuation = str5;
        this.currencyId = num;
        if ((i & 64) == 0) {
            this.isSupportWallet = Boolean.FALSE;
        } else {
            this.isSupportWallet = bool;
        }
        if ((i & 128) == 0) {
            this.networks = null;
        } else {
            this.networks = arrayList;
        }
        if ((i & 256) == 0) {
            this.baseCurrencySymbol = null;
        } else {
            this.baseCurrencySymbol = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ExchangeSelectCoinBean exchangeSelectCoinBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, exchangeSelectCoinBean.icon);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, exchangeSelectCoinBean.currency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, exchangeSelectCoinBean.fullName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, exchangeSelectCoinBean.balance);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, exchangeSelectCoinBean.valuation);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, exchangeSelectCoinBean.currencyId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(exchangeSelectCoinBean.isSupportWallet, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, exchangeSelectCoinBean.isSupportWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || exchangeSelectCoinBean.networks != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], exchangeSelectCoinBean.networks);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && exchangeSelectCoinBean.baseCurrencySymbol == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, exchangeSelectCoinBean.baseCurrencySymbol);
    }

    public ExchangeSelectCoinBean(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, ArrayList<AssetWalletNetwork> arrayList, String str6) {
        this.icon = str;
        this.currency = str2;
        this.fullName = str3;
        this.balance = str4;
        this.valuation = str5;
        this.currencyId = num;
        this.isSupportWallet = bool;
        this.networks = arrayList;
        this.baseCurrencySymbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.Integer)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x000c: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r20v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.ArrayList<com.okinc.business.defi.wallet.transfer.receive.exchange.bean.AssetWalletNetwork>, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeSelectCoinBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.util.ArrayList, java.lang.String):void type: THIS */
    public /* synthetic */ ExchangeSelectCoinBean(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, ArrayList arrayList, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, num, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? null : arrayList, (i & 256) != 0 ? null : str6);
    }
}
