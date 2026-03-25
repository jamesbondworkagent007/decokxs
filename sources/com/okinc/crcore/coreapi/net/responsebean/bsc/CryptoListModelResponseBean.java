package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class CryptoListModelResponseBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String balanceAccountType;
    private final List<CurrencyTokenResponseBean> baseCurrencies;
    private final List<BuySellCurrencyResponseBean> quoteCurrencies;
    private final List<BuySellCurrencyResponseBean> sellSupportQuoteCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CryptoListModelResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CryptoListModelResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoListModelResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CurrencyTokenResponseBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(BuySellCurrencyResponseBean.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(BuySellCurrencyResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new CryptoListModelResponseBean(arrayList, arrayList2, arrayList3, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoListModelResponseBean[] newArray(int i) {
            return new CryptoListModelResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CryptoListModelResponseBean() {
        this((List) null, (List) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoListModelResponseBean copy$default(CryptoListModelResponseBean cryptoListModelResponseBean, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoListModelResponseBean.baseCurrencies;
        }
        if ((i & 2) != 0) {
            list2 = cryptoListModelResponseBean.quoteCurrencies;
        }
        if ((i & 4) != 0) {
            list3 = cryptoListModelResponseBean.sellSupportQuoteCurrencies;
        }
        if ((i & 8) != 0) {
            str = cryptoListModelResponseBean.balanceAccountType;
        }
        return cryptoListModelResponseBean.copy(list, list2, list3, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyTokenResponseBean> component1() {
        return this.baseCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyResponseBean> component2() {
        return this.quoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyResponseBean> component3() {
        return this.sellSupportQuoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CryptoListModelResponseBean copy(@NotNull List<CurrencyTokenResponseBean> list, @NotNull List<BuySellCurrencyResponseBean> list2, @NotNull List<BuySellCurrencyResponseBean> list3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CryptoListModelResponseBean(list, list2, list3, str);
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
        if (!(obj instanceof CryptoListModelResponseBean)) {
            return false;
        }
        CryptoListModelResponseBean cryptoListModelResponseBean = (CryptoListModelResponseBean) obj;
        return Intrinsics.EZpvd(this.baseCurrencies, cryptoListModelResponseBean.baseCurrencies) && Intrinsics.EZpvd(this.quoteCurrencies, cryptoListModelResponseBean.quoteCurrencies) && Intrinsics.EZpvd(this.sellSupportQuoteCurrencies, cryptoListModelResponseBean.sellSupportQuoteCurrencies) && Intrinsics.EZpvd((Object) this.balanceAccountType, (Object) cryptoListModelResponseBean.balanceAccountType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceAccountType() {
        return this.balanceAccountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CurrencyTokenResponseBean> getBaseCurrencies() {
        return this.baseCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyResponseBean> getQuoteCurrencies() {
        return this.quoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BuySellCurrencyResponseBean> getSellSupportQuoteCurrencies() {
        return this.sellSupportQuoteCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.baseCurrencies.hashCode() * 31) + this.quoteCurrencies.hashCode()) * 31) + this.sellSupportQuoteCurrencies.hashCode()) * 31) + this.balanceAccountType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CryptoListModelResponseBean(baseCurrencies=" + this.baseCurrencies + ", quoteCurrencies=" + this.quoteCurrencies + ", sellSupportQuoteCurrencies=" + this.sellSupportQuoteCurrencies + ", balanceAccountType=" + this.balanceAccountType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CurrencyTokenResponseBean> list = this.baseCurrencies;
        parcel.writeInt(list.size());
        Iterator<CurrencyTokenResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<BuySellCurrencyResponseBean> list2 = this.quoteCurrencies;
        parcel.writeInt(list2.size());
        Iterator<BuySellCurrencyResponseBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<BuySellCurrencyResponseBean> list3 = this.sellSupportQuoteCurrencies;
        parcel.writeInt(list3.size());
        Iterator<BuySellCurrencyResponseBean> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.balanceAccountType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CryptoListModelResponseBean> serializer() {
            return CryptoListModelResponseBean$$serializer.INSTANCE;
        }
    }

    static {
        BuySellCurrencyResponseBean$$serializer buySellCurrencyResponseBean$$serializer = BuySellCurrencyResponseBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(CurrencyTokenResponseBean$$serializer.INSTANCE), new ArrayListSerializer(buySellCurrencyResponseBean$$serializer), new ArrayListSerializer(buySellCurrencyResponseBean$$serializer), null};
    }

    public /* synthetic */ CryptoListModelResponseBean(int i, List list, List list2, List list3, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.baseCurrencies = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.quoteCurrencies = yDY.AhwBna();
        } else {
            this.quoteCurrencies = list2;
        }
        if ((i & 4) == 0) {
            this.sellSupportQuoteCurrencies = yDY.AhwBna();
        } else {
            this.sellSupportQuoteCurrencies = list3;
        }
        if ((i & 8) == 0) {
            this.balanceAccountType = "";
        } else {
            this.balanceAccountType = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [8=4] */
    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(CryptoListModelResponseBean cryptoListModelResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(cryptoListModelResponseBean.baseCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], cryptoListModelResponseBean.baseCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(cryptoListModelResponseBean.quoteCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], cryptoListModelResponseBean.quoteCurrencies);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(cryptoListModelResponseBean.sellSupportQuoteCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], cryptoListModelResponseBean.sellSupportQuoteCurrencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) cryptoListModelResponseBean.balanceAccountType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, cryptoListModelResponseBean.balanceAccountType);
    }

    public CryptoListModelResponseBean(@NotNull List<CurrencyTokenResponseBean> list, @NotNull List<BuySellCurrencyResponseBean> list2, @NotNull List<BuySellCurrencyResponseBean> list3, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCurrencies = list;
        this.quoteCurrencies = list2;
        this.sellSupportQuoteCurrencies = list3;
        this.balanceAccountType = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.CurrencyTokenResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.BuySellCurrencyResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.BuySellCurrencyResponseBean>, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.CryptoListModelResponseBean.<init>(java.util.List, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ CryptoListModelResponseBean(List list, List list2, List list3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? "" : str);
    }
}
